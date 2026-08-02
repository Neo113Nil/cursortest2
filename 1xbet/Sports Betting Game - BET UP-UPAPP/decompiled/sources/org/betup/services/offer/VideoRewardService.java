package org.betup.services.offer;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.applovin.sdk.AppLovinMediationProvider;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.BetsUnlockedMessage;
import org.betup.bus.UserProfileUpdatedMessage;
import org.betup.bus.VideoRewardReceivedMessage;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.videoRewards.GetVideoRewardForPlacementStateInteractor;
import org.betup.model.remote.api.rest.videoRewards.RedeemVideoRewardForPlacementInteractor;
import org.betup.model.remote.entity.videoRewards.VideoRedeemResult;
import org.betup.model.remote.entity.videoRewards.VideoRewardForPlacementState;
import org.betup.model.remote.entity.videoRewards.VideoRewardPlacementInfo;
import org.betup.services.ads.AdUnitRegistry;
import org.betup.services.ads.rewarded.RewardedAdController;
import org.betup.services.ads.rewarded.RewardedAdListenerAdapter;
import org.betup.services.analytics.AnalyticsHelper;
import org.betup.services.offer.PromoService;
import org.betup.services.user.UserService;
import org.betup.ui.ProgressDisplay;
import org.betup.ui.dialogs.PurchaseUnlockDialogFragment;
import org.betup.utils.DeferredOverlayQueue;
import org.betup.utils.DialogManager;
import org.betup.utils.VideoRewardCollectDialogHelper;
import org.greenrobot.eventbus.EventBus;

@Singleton
/* loaded from: classes2.dex */
public class VideoRewardService {
    private static final long COLLECT_DIALOG_FLUSH_RETRY_MS = 450;
    private static final String COLLECT_DIALOG_TAG = "VideoRewardCollectDialog";
    private static final long COMPLETED_REDEEM_FALLBACK_MS = 4000;
    private static final long EARN_GRACE_MS = 3000;
    private static final String TAG = "VideoRewardService";
    private Activity activity;
    private final AdUnitRegistry adUnitRegistry;
    private boolean awaitingRewardedAdShow;
    private Runnable completedRedeemFallbackRunnable;
    private Runnable earnGraceTimeoutRunnable;
    private final GetVideoRewardForPlacementStateInteractor getVideoRewardForPlacementStateInteractor;
    private String lastMediationAdapter;
    private volatile FreshStateRedeemGate pendingFreshStateGate;
    private PendingVideoRewardRequest pendingRequest;
    private VideoRedeemResult pendingReward;
    private PromoService.PromoPlacement placementForPendingRedeem;
    private ProgressDisplay progressDisplay;
    private PromoService.PromoPlacement redeemInFlightPlacement;
    private String redeemInFlightReferencedId;
    private Long redeemInFlightReferencedValue;
    private final RedeemVideoRewardForPlacementInteractor redeemVideoRewardForPlacementInteractor;
    private final RewardedAdController rewardedAdController;
    private boolean rewardedFullscreenClosed;
    private volatile boolean serverRedeemInFlight;
    private SilentClient silentClient;
    private final UserService userService;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final Map<String, WeakReference<VideoRewardServiceClient>> listeners = new HashMap();
    private final BaseCachedSharedInteractor.OnFetchedListener<VideoRewardForPlacementState, String> onRewardStateFetched = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.services.offer.VideoRewardService$$ExternalSyntheticLambda3
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            VideoRewardService.this.m12787lambda$new$0$orgbetupservicesofferVideoRewardService(fetchedResponseMessage);
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<VideoRedeemResult, String> onRewardRequestProcessed = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.services.offer.VideoRewardService$$ExternalSyntheticLambda4
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            VideoRewardService.this.m12788lambda$new$3$orgbetupservicesofferVideoRewardService(fetchedResponseMessage);
        }
    };
    private final RewardedAdListenerAdapter gmaListenerAdapter = new RewardedAdListenerAdapter(this);

    public enum RewardedVideoResult {
        SUCCESS,
        NO_FILL,
        ERROR,
        BLOCKED
    }

    public interface VideoRewardInfoListener {
        void onVideoRewardInfoUpdated(VideoRewardPlacementInfo info);
    }

    public interface VideoRewardServiceClient extends VideoRewardInfoListener {
        void onVideoRewardRequestProcessed(RewardedVideoResult result, long amount);
    }

    public void onRewardedVideoClicked() {
    }

    @Inject
    public VideoRewardService(UserService userService, GetVideoRewardForPlacementStateInteractor getVideoRewardForPlacementStateInteractor, RedeemVideoRewardForPlacementInteractor redeemVideoRewardForPlacementInteractor, RewardedAdController rewardedAdController, AdUnitRegistry adUnitRegistry) {
        this.userService = userService;
        this.getVideoRewardForPlacementStateInteractor = getVideoRewardForPlacementStateInteractor;
        this.redeemVideoRewardForPlacementInteractor = redeemVideoRewardForPlacementInteractor;
        this.rewardedAdController = rewardedAdController;
        this.adUnitRegistry = adUnitRegistry;
    }

    public void attach(Activity activity, ProgressDisplay progressDisplay) {
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        this.activity = activity;
        this.progressDisplay = progressDisplay;
        this.rewardedAdController.setListener(this.gmaListenerAdapter);
        PendingVideoRewardRequest pendingVideoRewardRequest = this.pendingRequest;
        if (pendingVideoRewardRequest != null && pendingVideoRewardRequest.completed && !this.serverRedeemInFlight && !this.rewardedAdController.getRewardPresentationActive()) {
            if (progressDisplay != null) {
                progressDisplay.displayProgress();
            }
            completeRewardedSessionAfterFullscreenClosed();
        } else if (this.pendingReward != null) {
            if (activity instanceof FragmentActivity) {
                if (((FragmentActivity) activity).getSupportFragmentManager().findFragmentByTag("VideoRewardCollectDialog") != null) {
                    this.pendingReward = null;
                    return;
                }
                showVideoRewardCollectDialogOnMainThread(this.pendingReward.getAmount());
            }
            this.pendingReward = null;
        }
    }

    public void detach() {
        detach(null);
    }

    public void detach(Activity expectedActivity) {
        Activity activity;
        if (expectedActivity == null || (activity = this.activity) == null || activity == expectedActivity) {
            if (isVideoRewardFlowInProgress()) {
                Log.d(TAG, "detach skipped: rewarded video flow in progress");
                return;
            }
            this.activity = null;
            this.progressDisplay = null;
            this.rewardedAdController.setListener(null);
        }
    }

    public boolean isVideoRewardFlowInProgress() {
        PendingVideoRewardRequest pendingVideoRewardRequest;
        return this.awaitingRewardedAdShow || isRewardedVideoSessionActive() || this.serverRedeemInFlight || this.redeemInFlightPlacement != null || this.placementForPendingRedeem != null || ((pendingVideoRewardRequest = this.pendingRequest) != null && pendingVideoRewardRequest.completed) || this.pendingReward != null;
    }

    public boolean isRewardedReady(PromoService.PromoPlacement placement) {
        return isRewardedAdReadyForPlacement(placement);
    }

    public void preloadRewarded() {
        triggerCaching();
    }

    public void preloadRewarded(PromoService.PromoPlacement placement) {
        triggerCachingForPlacement(placement);
    }

    public void triggerCaching() {
        Iterator<PromoService.PromoPlacement> it = this.adUnitRegistry.rewardedPreloadPlacements().iterator();
        while (it.hasNext()) {
            triggerCachingForPlacement(it.next());
        }
    }

    private void triggerCachingForPlacement(PromoService.PromoPlacement placement) {
        Activity activity = this.activity;
        if (activity == null || activity.isDestroyed()) {
            return;
        }
        String rewardedAdUnitId = rewardedAdUnitId(placement);
        if (this.rewardedAdController.isReady(rewardedAdUnitId) || this.rewardedAdController.isLoading(rewardedAdUnitId)) {
            return;
        }
        this.rewardedAdController.preload(this.activity, rewardedAdUnitId);
    }

    public void connectClient(PromoService.PromoPlacement placement, String referenceId, VideoRewardServiceClient listener) {
        triggerCachingForPlacement(placement);
        this.listeners.put(getClientId(placement, referenceId), new WeakReference<>(listener));
    }

    public void disconnectClient(PromoService.PromoPlacement placement, String referenceId) {
        this.listeners.remove(getClientId(placement, referenceId));
    }

    public void getVideoRewardInfo(PromoService.PromoPlacement placement, Long referencedValue, String referencedId) {
        this.getVideoRewardForPlacementStateInteractor.load(this.onRewardStateFetched, PromoParams.getVideoPlacement(placement), getReferencedParams(referencedValue, referencedId));
    }

    public void invalidateVideoRewardState(PromoService.PromoPlacement placement) {
        invalidateVideoRewardState(placement, null, null);
    }

    public void invalidateVideoRewardState(PromoService.PromoPlacement placement, Long referencedValue, String referencedId) {
        this.getVideoRewardForPlacementStateInteractor.invalidate(PromoParams.getVideoPlacement(placement), getReferencedParams(referencedValue, referencedId));
    }

    public void checkVideoRewardAndContinue(PromoService.PromoPlacement placement, Long referencedValue, String referencedId, VideoRewardInfoListener listener) {
        SilentClient silentClient = this.silentClient;
        if (silentClient != null) {
            silentClient.cancel();
        }
        SilentClient silentClient2 = new SilentClient(placement, referencedId, listener);
        this.silentClient = silentClient2;
        connectClient(placement, referencedId, silentClient2);
        getVideoRewardInfo(placement, referencedValue, referencedId);
    }

    public void attemptRewardedVideoWithFreshStateCheck(PromoService.PromoPlacement placement, Long referencedValue, String referencedId) {
        invalidateVideoRewardState(placement, referencedValue, referencedId);
        this.pendingFreshStateGate = new FreshStateRedeemGate(placement, referencedValue, referencedId);
        getVideoRewardInfo(placement, referencedValue, referencedId);
    }

    public void clearPendingFreshStateGate() {
        this.pendingFreshStateGate = null;
    }

    public void redeemReward(PromoService.PromoPlacement placement, Long referencedValue, String referencedId) {
        if (this.serverRedeemInFlight) {
            Log.w(TAG, "redeemReward ignored: server redeem already in progress");
            logVideoRewardDiagnostic("redeem_blocked", placement, "server_in_flight");
            return;
        }
        PendingVideoRewardRequest pendingVideoRewardRequest = this.pendingRequest;
        if (pendingVideoRewardRequest != null) {
            if (!pendingVideoRewardRequest.completed) {
                Log.w(TAG, "redeemReward ignored: rewarded video session already active");
                logVideoRewardDiagnostic("redeem_blocked", placement, "session_active");
                return;
            } else {
                Log.w(TAG, "redeemReward ignored: waiting for server redeem to finish");
                logVideoRewardDiagnostic("redeem_blocked", placement, "waiting_server");
                return;
            }
        }
        if (this.pendingFreshStateGate != null && !this.pendingFreshStateGate.isFor(placement)) {
            Log.d(TAG, "Clearing stale fresh-state gate before " + placement + " redeem");
            this.pendingFreshStateGate = null;
        }
        this.awaitingRewardedAdShow = false;
        String videoPlacement = PromoParams.getVideoPlacement(placement);
        Activity activity = this.activity;
        if (activity != null && !activity.isDestroyed() && !isRewardedAdReadyForPlacement(placement)) {
            Log.d(TAG, "Video not ready for placement " + videoPlacement + ", triggering cache");
            triggerCaching();
            VideoRewardServiceClient resolveListenerClient = resolveListenerClient(placement, referencedId);
            if (resolveListenerClient != null) {
                resolveListenerClient.onVideoRewardRequestProcessed(RewardedVideoResult.NO_FILL, 0L);
                return;
            }
            return;
        }
        showRewardedAd(this.activity, new PendingVideoRewardRequest(placement, referencedValue, referencedId));
    }

    private static String getClientId(PromoService.PromoPlacement placement, String referenceId) {
        String videoPlacement = PromoParams.getVideoPlacement(placement);
        return referenceId == null ? videoPlacement : videoPlacement + "_" + referenceId;
    }

    private static Bundle getReferencedParams(Long referencedValue, String referencedId) {
        Bundle bundle = new Bundle();
        if (referencedId != null) {
            bundle.putString("referencedId", referencedId);
        }
        if (referencedValue != null) {
            bundle.putLong("referencedValue", referencedValue.longValue());
        }
        return bundle;
    }

    /* renamed from: lambda$new$0$org-betup-services-offer-VideoRewardService, reason: not valid java name */
    /* synthetic */ void m12787lambda$new$0$orgbetupservicesofferVideoRewardService(FetchedResponseMessage fetchedResponseMessage) {
        VideoRewardPlacementInfo unavailable;
        VideoRewardServiceClient videoRewardServiceClient;
        Bundle args = fetchedResponseMessage.getArgs();
        String str = (String) fetchedResponseMessage.getId();
        String str2 = (args == null || !args.containsKey("referencedId")) ? str : str + "_" + args.getString("referencedId");
        if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS && fetchedResponseMessage.getModel() != null) {
            unavailable = VideoRewardPlacementInfo.fromState((VideoRewardForPlacementState) fetchedResponseMessage.getModel());
        } else {
            unavailable = VideoRewardPlacementInfo.unavailable();
        }
        FreshStateRedeemGate freshStateRedeemGate = this.pendingFreshStateGate;
        if (freshStateRedeemGate != null && freshStateRedeemGate.matchesPlacement(str, args)) {
            this.pendingFreshStateGate = null;
            freshStateRedeemGate.onVideoRewardInfoUpdated(unavailable);
            return;
        }
        WeakReference<VideoRewardServiceClient> weakReference = this.listeners.get(str2);
        if (weakReference == null || (videoRewardServiceClient = weakReference.get()) == null) {
            return;
        }
        PromoService.PromoPlacement placementFromVideoPlacementId = PromoParams.placementFromVideoPlacementId(str);
        if (placementFromVideoPlacementId != null) {
            Log.d(TAG, "rewardState placement=" + str + " backendAvailable=" + unavailable.isAvailable() + " quotaExhausted=" + unavailable.isQuotaExhausted() + " adReady=" + isRewardedAdReadyForPlacement(placementFromVideoPlacementId) + " unit=" + rewardedAdUnitId(placementFromVideoPlacementId));
        }
        videoRewardServiceClient.onVideoRewardInfoUpdated(unavailable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r7 != null) goto L16;
     */
    /* renamed from: lambda$new$3$org-betup-services-offer-VideoRewardService, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    /* synthetic */ void m12788lambda$new$3$orgbetupservicesofferVideoRewardService(FetchedResponseMessage fetchedResponseMessage) {
        PromoService.PromoPlacement promoPlacement;
        Long l;
        String str;
        String str2;
        try {
            ProgressDisplay progressDisplay = this.progressDisplay;
            if (progressDisplay != null) {
                progressDisplay.hideProgress();
            }
            PendingVideoRewardRequest pendingVideoRewardRequest = this.pendingRequest;
            if (pendingVideoRewardRequest != null) {
                promoPlacement = pendingVideoRewardRequest.placement;
                l = this.pendingRequest.referencedValue;
                str = this.pendingRequest.referencedId;
            } else {
                promoPlacement = null;
                l = null;
                str = null;
            }
            if (promoPlacement == null) {
                PromoService.PromoPlacement promoPlacement2 = this.redeemInFlightPlacement;
                if (promoPlacement2 != null) {
                    l = this.redeemInFlightReferencedValue;
                    str = this.redeemInFlightReferencedId;
                } else {
                    promoPlacement2 = this.placementForPendingRedeem;
                }
                promoPlacement = promoPlacement2;
            }
            VideoRewardServiceClient resolveListenerClient = resolveListenerClient(promoPlacement, str);
            this.placementForPendingRedeem = null;
            this.redeemInFlightPlacement = null;
            this.redeemInFlightReferencedValue = null;
            this.redeemInFlightReferencedId = null;
            this.awaitingRewardedAdShow = false;
            this.pendingRequest = null;
            if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS && fetchedResponseMessage.getModel() != null) {
                getUserService().invalidate(UserService.InfoKind.PROGRESS);
                getUserService().syncProfile(UserService.InfoKind.PROGRESS);
                if (promoPlacement != null) {
                    invalidateVideoRewardState(promoPlacement, l, str);
                    getVideoRewardInfo(promoPlacement, l, str);
                    triggerCaching();
                }
                boolean z = promoPlacement == PromoService.PromoPlacement.UNLOCK_ALL_BET_GROUPS;
                if (z && resolveListenerClient == null) {
                    getUserService().invalidate(UserService.InfoKind.GENERAL, UserService.InfoKind.PROGRESS);
                    getUserService().syncProfile(UserService.InfoKind.GENERAL, UserService.InfoKind.STATS, UserService.InfoKind.PROGRESS);
                }
                if (z) {
                    EventBus.getDefault().post(new BetsUnlockedMessage());
                    Activity activity = this.activity;
                    if (activity != null && !activity.isDestroyed()) {
                        final Activity activity2 = this.activity;
                        if (activity2 instanceof FragmentActivity) {
                            activity2.runOnUiThread(new Runnable() { // from class: org.betup.services.offer.VideoRewardService$$ExternalSyntheticLambda1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    VideoRewardService.lambda$new$2(activity2);
                                }
                            });
                        }
                    }
                }
                long amount = ((VideoRedeemResult) fetchedResponseMessage.getModel()).getAmount();
                if (!z && shouldShowCollectDialogForPlacement(promoPlacement)) {
                    showVideoRewardCollectDialogOnMainThread(amount);
                }
                if (resolveListenerClient != null) {
                    notifyClientSuccessImmediate(resolveListenerClient, amount);
                }
                if (promoPlacement != null) {
                    AnalyticsHelper.INSTANCE.logAdRewardEarned("coins", (int) ((VideoRedeemResult) fetchedResponseMessage.getModel()).getAmount(), PromoParams.getVideoPlacement(promoPlacement));
                    SharedPreferences sharedPreferences = BetUpApp.getContext().getSharedPreferences("analytics", 0);
                    String format = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date());
                    int i = format.equals(sharedPreferences.getString("last_video_date", "")) ? sharedPreferences.getInt("videos_today", 0) + 1 : 1;
                    sharedPreferences.edit().putInt("videos_today", i).putInt("videos_lifetime", sharedPreferences.getInt("videos_lifetime", 0) + 1).putString("last_video_date", format).apply();
                    if (i >= 10) {
                        str2 = "heavy";
                    } else {
                        str2 = i >= 3 ? "medium" : "light";
                    }
                    AnalyticsHelper.INSTANCE.setVideoEngagementLevel(str2);
                }
                EventBus.getDefault().post(new VideoRewardReceivedMessage(((VideoRedeemResult) fetchedResponseMessage.getModel()).getAmount(), (String) fetchedResponseMessage.getId()));
                EventBus.getDefault().post(new UserProfileUpdatedMessage());
            } else {
                logVideoRewardDiagnostic("server_redeem_failed", promoPlacement, null);
                if (resolveListenerClient != null) {
                    resolveListenerClient.onVideoRewardRequestProcessed(RewardedVideoResult.ERROR, 0L);
                }
            }
        } finally {
            this.serverRedeemInFlight = false;
        }
    }

    static /* synthetic */ void lambda$new$2(final Activity activity) {
        DialogManager.dismissDialogsWithTags(((FragmentActivity) activity).getSupportFragmentManager(), "UnlockBetGroupsDialog");
        activity.getWindow().getDecorView().postDelayed(new Runnable() { // from class: org.betup.services.offer.VideoRewardService$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                VideoRewardService.lambda$new$1(activity);
            }
        }, 150L);
    }

    static /* synthetic */ void lambda$new$1(Activity activity) {
        if (activity.isDestroyed()) {
            return;
        }
        PurchaseUnlockDialogFragment.showDialog(activity, R.string.unlock_video_success_title, activity.getString(R.string.unlock_video_success_message), 0L);
    }

    private void showRewardedAd(Activity context, PendingVideoRewardRequest request) {
        if (this.serverRedeemInFlight) {
            Log.w(TAG, "showRewardedAd ignored: server redeem in progress");
            logVideoRewardDiagnostic("show_blocked", request.placement, "server_in_flight");
            return;
        }
        if (this.pendingRequest != null) {
            Log.w(TAG, "showRewardedAd ignored: another rewarded session is active or completing");
            logVideoRewardDiagnostic("show_blocked", request.placement, "session_active");
            return;
        }
        this.pendingRequest = request;
        this.rewardedFullscreenClosed = false;
        cancelEarnGraceTimeout();
        if (context == null || context.isDestroyed()) {
            Log.e(TAG, "RewardAd cannot be shown. Activity is null or destroyed.");
            logVideoRewardDiagnostic("show_activity_invalid", request.placement, null);
            VideoRewardServiceClient resolveListenerClient = resolveListenerClient(request.placement, request.referencedId);
            this.awaitingRewardedAdShow = false;
            this.pendingRequest = null;
            if (resolveListenerClient != null) {
                resolveListenerClient.onVideoRewardRequestProcessed(RewardedVideoResult.ERROR, 0L);
                return;
            }
            return;
        }
        String rewardedAdUnitId = rewardedAdUnitId(request.placement);
        String videoPlacement = PromoParams.getVideoPlacement(request.placement);
        if (this.rewardedAdController.isReady(rewardedAdUnitId)) {
            this.awaitingRewardedAdShow = false;
            this.rewardedAdController.show(context, rewardedAdUnitId, videoPlacement);
            return;
        }
        this.awaitingRewardedAdShow = true;
        ProgressDisplay progressDisplay = this.progressDisplay;
        if (progressDisplay != null) {
            progressDisplay.displayProgress();
        }
        this.rewardedAdController.preload(context, rewardedAdUnitId);
    }

    private String rewardedAdUnitId(PromoService.PromoPlacement placement) {
        return this.adUnitRegistry.rewardedUnit(placement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isRewardedAdReadyForPlacement(PromoService.PromoPlacement placement) {
        return this.rewardedAdController.isReady(rewardedAdUnitId(placement));
    }

    private UserService getUserService() {
        return this.userService;
    }

    public void onRewardedVideoClosed(boolean finished) {
        if (this.rewardedAdController.getRewardPresentationActive()) {
            Log.d(TAG, "onRewardedVideoClosed ignored: rewarded presentation still active (multi-ad pod)");
            PendingVideoRewardRequest pendingVideoRewardRequest = this.pendingRequest;
            logVideoRewardDiagnostic("closed_ignored_pod_active", pendingVideoRewardRequest != null ? pendingVideoRewardRequest.placement : null, null);
            return;
        }
        this.rewardedFullscreenClosed = true;
        cancelEarnGraceTimeout();
        if (!finished) {
            PendingVideoRewardRequest pendingVideoRewardRequest2 = this.pendingRequest;
            if (pendingVideoRewardRequest2 != null && pendingVideoRewardRequest2.completed) {
                Log.w(TAG, "onRewardedVideoClosed(false) after earn; completing session");
                logVideoRewardDiagnostic("closed_false_after_earn", this.pendingRequest.placement, null);
                cancelCompletedRedeemFallback();
                maybeCompleteRewardedSessionAfterFullscreenClosed();
                triggerCaching();
                return;
            }
            if (this.serverRedeemInFlight || this.redeemInFlightPlacement != null || this.placementForPendingRedeem != null) {
                Log.w(TAG, "Ignoring onRewardedVideoClosed(false): server redeem already in flight");
                PendingVideoRewardRequest pendingVideoRewardRequest3 = this.pendingRequest;
                logVideoRewardDiagnostic("closed_false_ignored", pendingVideoRewardRequest3 != null ? pendingVideoRewardRequest3.placement : this.redeemInFlightPlacement, "server_in_flight");
                triggerCaching();
                return;
            }
            PendingVideoRewardRequest pendingVideoRewardRequest4 = this.pendingRequest;
            if (pendingVideoRewardRequest4 != null && !pendingVideoRewardRequest4.completed) {
                Log.w(TAG, "onRewardedVideoClosed(false) with active session; waiting for earn callback");
                logVideoRewardDiagnostic("closed_false_awaiting_earn", this.pendingRequest.placement, null);
                scheduleEarnGraceTimeout();
                triggerCaching();
                return;
            }
            logVideoRewardDiagnostic("user_closed_early", null, null);
            this.awaitingRewardedAdShow = false;
            cancelCompletedRedeemFallback();
            notifyClientAboutResult(RewardedVideoResult.ERROR, 0L);
            this.pendingRequest = null;
            this.placementForPendingRedeem = null;
            this.redeemInFlightPlacement = null;
            this.redeemInFlightReferencedValue = null;
            this.redeemInFlightReferencedId = null;
            this.serverRedeemInFlight = false;
            triggerCaching();
            return;
        }
        PendingVideoRewardRequest pendingVideoRewardRequest5 = this.pendingRequest;
        if (pendingVideoRewardRequest5 != null && !pendingVideoRewardRequest5.completed) {
            Log.w(TAG, "Reward earned at dismiss (callback order); marking session completed");
            this.pendingRequest.completed = true;
        }
        cancelCompletedRedeemFallback();
        maybeCompleteRewardedSessionAfterFullscreenClosed();
        triggerCaching();
    }

    private void maybeCompleteRewardedSessionAfterFullscreenClosed() {
        PendingVideoRewardRequest pendingVideoRewardRequest = this.pendingRequest;
        if (pendingVideoRewardRequest == null || !pendingVideoRewardRequest.completed || this.serverRedeemInFlight) {
            return;
        }
        completeRewardedSessionAfterFullscreenClosed();
    }

    private void scheduleEarnGraceTimeout() {
        cancelEarnGraceTimeout();
        Runnable runnable = new Runnable() { // from class: org.betup.services.offer.VideoRewardService$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                VideoRewardService.this.m12792xfdab7a2();
            }
        };
        this.earnGraceTimeoutRunnable = runnable;
        this.mainHandler.postDelayed(runnable, 3000L);
    }

    /* renamed from: lambda$scheduleEarnGraceTimeout$4$org-betup-services-offer-VideoRewardService, reason: not valid java name */
    /* synthetic */ void m12792xfdab7a2() {
        this.earnGraceTimeoutRunnable = null;
        PendingVideoRewardRequest pendingVideoRewardRequest = this.pendingRequest;
        if (pendingVideoRewardRequest == null || pendingVideoRewardRequest.completed || this.serverRedeemInFlight) {
            return;
        }
        if (this.rewardedAdController.getRewardPresentationActive()) {
            Log.d(TAG, "Earn grace elapsed but presentation active again; rescheduling");
            scheduleEarnGraceTimeout();
            return;
        }
        Log.w(TAG, "Earn grace timeout elapsed; treating rewarded session as user-cancelled");
        logVideoRewardDiagnostic("earn_grace_timeout", this.pendingRequest.placement, null);
        this.awaitingRewardedAdShow = false;
        cancelCompletedRedeemFallback();
        notifyClientAboutResult(RewardedVideoResult.ERROR, 0L);
        this.pendingRequest = null;
        this.placementForPendingRedeem = null;
        this.redeemInFlightPlacement = null;
        this.redeemInFlightReferencedValue = null;
        this.redeemInFlightReferencedId = null;
        this.serverRedeemInFlight = false;
        this.rewardedFullscreenClosed = false;
    }

    private void cancelEarnGraceTimeout() {
        Runnable runnable = this.earnGraceTimeoutRunnable;
        if (runnable != null) {
            this.mainHandler.removeCallbacks(runnable);
            this.earnGraceTimeoutRunnable = null;
        }
    }

    private void scheduleCompletedRedeemFallback() {
        cancelCompletedRedeemFallback();
        Runnable runnable = new Runnable() { // from class: org.betup.services.offer.VideoRewardService$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                VideoRewardService.this.m12790x6dfefb03();
            }
        };
        this.completedRedeemFallbackRunnable = runnable;
        this.mainHandler.postDelayed(runnable, 4000L);
    }

    /* renamed from: lambda$scheduleCompletedRedeemFallback$5$org-betup-services-offer-VideoRewardService, reason: not valid java name */
    /* synthetic */ void m12790x6dfefb03() {
        this.completedRedeemFallbackRunnable = null;
        PendingVideoRewardRequest pendingVideoRewardRequest = this.pendingRequest;
        if (pendingVideoRewardRequest == null || !pendingVideoRewardRequest.completed || this.serverRedeemInFlight) {
            return;
        }
        if (this.rewardedAdController.getRewardPresentationActive()) {
            Log.d(TAG, "Completed-redeem fallback deferred: presentation still active");
            scheduleCompletedRedeemFallback();
        } else {
            Log.w(TAG, "Completed-redeem fallback: earn without settled dismiss; redeeming now");
            logVideoRewardDiagnostic("redeem_fallback_after_earn", this.pendingRequest.placement, null);
            this.rewardedFullscreenClosed = true;
            maybeCompleteRewardedSessionAfterFullscreenClosed();
        }
    }

    private void cancelCompletedRedeemFallback() {
        Runnable runnable = this.completedRedeemFallbackRunnable;
        if (runnable != null) {
            this.mainHandler.removeCallbacks(runnable);
            this.completedRedeemFallbackRunnable = null;
        }
    }

    private void completeRewardedSessionAfterFullscreenClosed() {
        PendingVideoRewardRequest pendingVideoRewardRequest = this.pendingRequest;
        if (pendingVideoRewardRequest == null || !pendingVideoRewardRequest.completed || this.serverRedeemInFlight) {
            return;
        }
        cancelCompletedRedeemFallback();
        if (this.pendingRequest.placement == PromoService.PromoPlacement.DAILY_BONUS) {
            Log.d(TAG, "DAILY_BONUS placement - notifying client after fullscreen closed");
            logVideoRewardDiagnostic("daily_bonus_video_finished", PromoService.PromoPlacement.DAILY_BONUS, null);
            VideoRewardServiceClient pendingClient = getPendingClient();
            if (pendingClient != null) {
                notifyClientSuccessDeferred(pendingClient, 0L);
            }
            this.awaitingRewardedAdShow = false;
            this.pendingRequest = null;
            return;
        }
        Activity activity = this.activity;
        if (activity == null || activity.isDestroyed()) {
            Log.e(TAG, "Activity unavailable after fullscreen closed; cannot redeem on server");
            logVideoRewardDiagnostic("activity_destroyed_after_video", this.pendingRequest.placement, null);
            VideoRewardServiceClient resolveListenerClient = resolveListenerClient(this.pendingRequest.placement, this.pendingRequest.referencedId);
            this.awaitingRewardedAdShow = false;
            this.pendingRequest = null;
            this.placementForPendingRedeem = null;
            this.redeemInFlightPlacement = null;
            this.redeemInFlightReferencedValue = null;
            this.redeemInFlightReferencedId = null;
            if (resolveListenerClient != null) {
                resolveListenerClient.onVideoRewardRequestProcessed(RewardedVideoResult.ERROR, 0L);
                return;
            }
            return;
        }
        ProgressDisplay progressDisplay = this.progressDisplay;
        if (progressDisplay != null) {
            progressDisplay.displayProgress();
        }
        beginServerRedeemForPendingRequest();
    }

    private void notifyClientSuccessDeferred(VideoRewardServiceClient client, long amount) {
        notifyClientSuccessImmediate(client, amount);
    }

    private void notifyClientSuccessImmediate(final VideoRewardServiceClient client, final long amount) {
        Activity activity = this.activity;
        if (activity == null || activity.isDestroyed()) {
            client.onVideoRewardRequestProcessed(RewardedVideoResult.SUCCESS, amount);
        } else {
            this.activity.runOnUiThread(new Runnable() { // from class: org.betup.services.offer.VideoRewardService$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    VideoRewardService.this.m12789xb44424ee(amount, client);
                }
            });
        }
    }

    /* renamed from: lambda$notifyClientSuccessImmediate$6$org-betup-services-offer-VideoRewardService, reason: not valid java name */
    /* synthetic */ void m12789xb44424ee(long j, VideoRewardServiceClient videoRewardServiceClient) {
        Activity activity = this.activity;
        if (activity == null || activity.isDestroyed()) {
            VideoRedeemResult videoRedeemResult = new VideoRedeemResult();
            videoRedeemResult.setSuccess(true);
            videoRedeemResult.setAmount(j);
            this.pendingReward = videoRedeemResult;
            return;
        }
        videoRewardServiceClient.onVideoRewardRequestProcessed(RewardedVideoResult.SUCCESS, j);
        Activity activity2 = this.activity;
        if (activity2 instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity2;
            DeferredOverlayQueue.flushPending(fragmentActivity);
            scheduleDeferredOverlayFlushRetry(fragmentActivity);
        }
    }

    private static boolean shouldShowCollectDialogForPlacement(PromoService.PromoPlacement placement) {
        if (placement == null) {
            return true;
        }
        return (placement == PromoService.PromoPlacement.UNLOCK_ALL_BET_GROUPS || placement == PromoService.PromoPlacement.MINI_GAME || placement == PromoService.PromoPlacement.DAILY_BONUS) ? false : true;
    }

    private void scheduleDeferredOverlayFlushRetry(final FragmentActivity fragmentActivity) {
        this.mainHandler.postDelayed(new Runnable() { // from class: org.betup.services.offer.VideoRewardService$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                VideoRewardService.this.m12791xe480b491(fragmentActivity);
            }
        }, COLLECT_DIALOG_FLUSH_RETRY_MS);
    }

    /* renamed from: lambda$scheduleDeferredOverlayFlushRetry$7$org-betup-services-offer-VideoRewardService, reason: not valid java name */
    /* synthetic */ void m12791xe480b491(FragmentActivity fragmentActivity) {
        Activity activity = this.activity;
        if (activity == null || activity.isDestroyed()) {
            return;
        }
        DeferredOverlayQueue.flushPending(fragmentActivity);
    }

    private void showVideoRewardCollectDialogOnMainThread(long amount) {
        Activity activity = this.activity;
        if (activity == null || activity.isDestroyed()) {
            VideoRedeemResult videoRedeemResult = new VideoRedeemResult();
            videoRedeemResult.setSuccess(true);
            videoRedeemResult.setAmount(amount);
            this.pendingReward = videoRedeemResult;
            return;
        }
        Activity activity2 = this.activity;
        if (!(activity2 instanceof FragmentActivity)) {
            VideoRedeemResult videoRedeemResult2 = new VideoRedeemResult();
            videoRedeemResult2.setSuccess(true);
            videoRedeemResult2.setAmount(amount);
            this.pendingReward = videoRedeemResult2;
            return;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) activity2;
        VideoRewardCollectDialogHelper.showSafely(fragmentActivity, fragmentActivity.getSupportFragmentManager(), (int) amount, this.activity.getString(R.string.home_daily_bonus_title), this.activity.getString(R.string.home_daily_bonus_got), null, null, R.drawable.watched_video_prize_img, "VideoRewardCollectDialog");
    }

    public void onRewardedVideoExpired() {
        Log.d(TAG, "Video expired, triggering cache for new video");
        cancelEarnGraceTimeout();
        cancelCompletedRedeemFallback();
        this.rewardedFullscreenClosed = false;
        triggerCaching();
        PendingVideoRewardRequest pendingVideoRewardRequest = this.pendingRequest;
        if (pendingVideoRewardRequest == null || pendingVideoRewardRequest.completed || this.serverRedeemInFlight) {
            return;
        }
        Log.w(TAG, "Rewarded creative expired before completion; clearing session");
        PromoService.PromoPlacement promoPlacement = this.pendingRequest.placement;
        VideoRewardServiceClient resolveListenerClient = resolveListenerClient(this.pendingRequest.placement, this.pendingRequest.referencedId);
        this.awaitingRewardedAdShow = false;
        this.pendingRequest = null;
        logVideoRewardDiagnostic("session_cleared", promoPlacement, "expired");
        if (resolveListenerClient != null) {
            resolveListenerClient.onVideoRewardRequestProcessed(RewardedVideoResult.NO_FILL, 0L);
        }
    }

    public void onRewardedVideoFailedToLoad() {
        cancelEarnGraceTimeout();
        cancelCompletedRedeemFallback();
        this.rewardedFullscreenClosed = false;
        ProgressDisplay progressDisplay = this.progressDisplay;
        if (progressDisplay != null) {
            progressDisplay.hideProgress();
        }
        PendingVideoRewardRequest pendingVideoRewardRequest = this.pendingRequest;
        VideoRewardServiceClient videoRewardServiceClient = null;
        if (pendingVideoRewardRequest != null && !pendingVideoRewardRequest.completed && !this.serverRedeemInFlight) {
            PromoService.PromoPlacement promoPlacement = this.pendingRequest.placement;
            VideoRewardServiceClient resolveListenerClient = resolveListenerClient(this.pendingRequest.placement, this.pendingRequest.referencedId);
            this.awaitingRewardedAdShow = false;
            this.pendingRequest = null;
            logVideoRewardDiagnostic("session_cleared", promoPlacement, "failed_to_load");
            videoRewardServiceClient = resolveListenerClient;
        }
        if (videoRewardServiceClient != null) {
            videoRewardServiceClient.onVideoRewardRequestProcessed(RewardedVideoResult.NO_FILL, 0L);
        } else {
            notifyClientAboutResult(RewardedVideoResult.NO_FILL, 0L);
        }
    }

    public void onRewardedVideoFinished(double v, String s) {
        PendingVideoRewardRequest pendingVideoRewardRequest = this.pendingRequest;
        if (pendingVideoRewardRequest == null) {
            Log.w(TAG, "onRewardedVideoFinished ignored: no pending request");
            return;
        }
        if (pendingVideoRewardRequest.completed) {
            Log.d(TAG, "onRewardedVideoFinished ignored: duplicate earn (multi-ad pod)");
            return;
        }
        cancelEarnGraceTimeout();
        this.awaitingRewardedAdShow = false;
        this.pendingRequest.completed = true;
        logVideoRewardDiagnostic(this.rewardedFullscreenClosed ? "reward_earned_after_dismiss" : "reward_earned_awaiting_dismiss", this.pendingRequest.placement, null);
        if (this.rewardedFullscreenClosed) {
            cancelCompletedRedeemFallback();
            maybeCompleteRewardedSessionAfterFullscreenClosed();
        } else {
            scheduleCompletedRedeemFallback();
        }
    }

    public void onRewardedVideoLoaded(boolean b) {
        PendingVideoRewardRequest pendingVideoRewardRequest;
        Activity activity;
        ProgressDisplay progressDisplay = this.progressDisplay;
        if (progressDisplay != null) {
            progressDisplay.hideProgress();
        }
        if (!this.awaitingRewardedAdShow || (pendingVideoRewardRequest = this.pendingRequest) == null || pendingVideoRewardRequest.completed || (activity = this.activity) == null || activity.isDestroyed()) {
            return;
        }
        String rewardedAdUnitId = rewardedAdUnitId(this.pendingRequest.placement);
        String videoPlacement = PromoParams.getVideoPlacement(this.pendingRequest.placement);
        if (this.rewardedAdController.isReady(rewardedAdUnitId)) {
            this.awaitingRewardedAdShow = false;
            this.rewardedAdController.show(this.activity, rewardedAdUnitId, videoPlacement);
        }
    }

    public void onRewardedVideoShowFailed() {
        cancelEarnGraceTimeout();
        cancelCompletedRedeemFallback();
        this.rewardedFullscreenClosed = false;
        ProgressDisplay progressDisplay = this.progressDisplay;
        if (progressDisplay != null) {
            progressDisplay.hideProgress();
        }
        PendingVideoRewardRequest pendingVideoRewardRequest = this.pendingRequest;
        VideoRewardServiceClient videoRewardServiceClient = null;
        if (pendingVideoRewardRequest != null && !pendingVideoRewardRequest.completed && !this.serverRedeemInFlight) {
            Log.w(TAG, "Rewarded show failed; clearing stuck session");
            PromoService.PromoPlacement promoPlacement = this.pendingRequest.placement;
            VideoRewardServiceClient resolveListenerClient = resolveListenerClient(this.pendingRequest.placement, this.pendingRequest.referencedId);
            this.awaitingRewardedAdShow = false;
            this.pendingRequest = null;
            logVideoRewardDiagnostic("session_cleared", promoPlacement, "show_failed");
            videoRewardServiceClient = resolveListenerClient;
        }
        if (videoRewardServiceClient != null) {
            videoRewardServiceClient.onVideoRewardRequestProcessed(RewardedVideoResult.NO_FILL, 0L);
        } else {
            notifyClientAboutResult(RewardedVideoResult.NO_FILL, 0L);
        }
    }

    public void onGmaRewardedShown(String mediationAdapterClassName) {
        if (mediationAdapterClassName != null) {
            this.lastMediationAdapter = mediationAdapterClassName;
        }
        onRewardedVideoShown();
    }

    public void onRewardedVideoShown() {
        cancelEarnGraceTimeout();
        PendingVideoRewardRequest pendingVideoRewardRequest = this.pendingRequest;
        if (pendingVideoRewardRequest != null && !pendingVideoRewardRequest.completed) {
            this.rewardedFullscreenClosed = false;
        }
        AnalyticsHelper.INSTANCE.logAdImpression("rewarded", AppLovinMediationProvider.ADMOB, this.lastMediationAdapter);
        this.lastMediationAdapter = null;
    }

    public boolean isRewardedVideoSessionActive() {
        PendingVideoRewardRequest pendingVideoRewardRequest = this.pendingRequest;
        return (pendingVideoRewardRequest == null || pendingVideoRewardRequest.completed) ? false : true;
    }

    public boolean isServerRedeemInFlight() {
        return this.serverRedeemInFlight;
    }

    private void notifyClientAboutResult(RewardedVideoResult result, long amount) {
        VideoRewardServiceClient pendingClient = getPendingClient();
        if (pendingClient != null) {
            pendingClient.onVideoRewardRequestProcessed(result, amount);
        }
    }

    private VideoRewardServiceClient getPendingClient() {
        PendingVideoRewardRequest pendingVideoRewardRequest = this.pendingRequest;
        if (pendingVideoRewardRequest != null) {
            return resolveListenerClient(pendingVideoRewardRequest.placement, this.pendingRequest.referencedId);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public VideoRewardServiceClient resolveListenerClient(PromoService.PromoPlacement placement, String referencedId) {
        WeakReference<VideoRewardServiceClient> weakReference;
        if (placement == null || (weakReference = this.listeners.get(getClientId(placement, referencedId))) == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logVideoRewardDiagnostic(String action, PromoService.PromoPlacement placement, String detail) {
        AnalyticsHelper.INSTANCE.logVideoRewardDiagnostic(action, placement != null ? PromoParams.getVideoPlacement(placement) : null, detail);
    }

    private void beginServerRedeemForPendingRequest() {
        if (this.pendingRequest == null) {
            return;
        }
        if (this.serverRedeemInFlight) {
            Log.w(TAG, "beginServerRedeemForPendingRequest skipped: redeem already in flight (e.g. configuration change retry)");
            logVideoRewardDiagnostic("redeem_skipped_duplicate", this.pendingRequest.placement, null);
            return;
        }
        cancelCompletedRedeemFallback();
        this.serverRedeemInFlight = true;
        logVideoRewardDiagnostic("server_redeem_started", this.pendingRequest.placement, null);
        this.redeemInFlightPlacement = this.pendingRequest.placement;
        this.redeemInFlightReferencedValue = this.pendingRequest.referencedValue;
        this.redeemInFlightReferencedId = this.pendingRequest.referencedId;
        this.placementForPendingRedeem = this.pendingRequest.placement;
        try {
            this.redeemVideoRewardForPlacementInteractor.load(this.onRewardRequestProcessed, PromoParams.getVideoPlacement(this.pendingRequest.placement), getReferencedParams(this.pendingRequest.referencedValue, this.pendingRequest.referencedId));
        } catch (RuntimeException e) {
            Log.e(TAG, "beginServerRedeemForPendingRequest: load failed", e);
            logVideoRewardDiagnostic("redeem_load_exception", this.pendingRequest.placement, e.getClass().getSimpleName());
            this.serverRedeemInFlight = false;
            VideoRewardServiceClient resolveListenerClient = resolveListenerClient(this.pendingRequest.placement, this.pendingRequest.referencedId);
            this.awaitingRewardedAdShow = false;
            this.pendingRequest = null;
            this.placementForPendingRedeem = null;
            this.redeemInFlightPlacement = null;
            this.redeemInFlightReferencedValue = null;
            this.redeemInFlightReferencedId = null;
            if (resolveListenerClient != null) {
                resolveListenerClient.onVideoRewardRequestProcessed(RewardedVideoResult.ERROR, 0L);
            }
        }
    }

    private class PendingVideoRewardRequest {
        private boolean completed;
        private PromoService.PromoPlacement placement;
        private String referencedId;
        private Long referencedValue;

        public PendingVideoRewardRequest(PromoService.PromoPlacement placement, Long referencedValue, String referencedId) {
            this.placement = placement;
            this.referencedValue = referencedValue;
            this.referencedId = referencedId;
        }
    }

    private class FreshStateRedeemGate implements VideoRewardServiceClient {
        private boolean handled;
        private final PromoService.PromoPlacement placement;
        private final String referencedId;
        private final Long referencedValue;

        @Override // org.betup.services.offer.VideoRewardService.VideoRewardServiceClient
        public void onVideoRewardRequestProcessed(RewardedVideoResult result, long amount) {
        }

        FreshStateRedeemGate(PromoService.PromoPlacement placement, Long referencedValue, String referencedId) {
            this.placement = placement;
            this.referencedValue = referencedValue;
            this.referencedId = referencedId;
        }

        boolean isFor(PromoService.PromoPlacement target) {
            return this.placement == target;
        }

        boolean matchesPlacement(String responsePlacementId, Bundle bundle) {
            if (!PromoParams.getVideoPlacement(this.placement).equals(responsePlacementId)) {
                return false;
            }
            String str = this.referencedId;
            return str != null ? bundle != null && str.equals(bundle.getString("referencedId")) : bundle == null || !bundle.containsKey("referencedId");
        }

        @Override // org.betup.services.offer.VideoRewardService.VideoRewardInfoListener
        public void onVideoRewardInfoUpdated(VideoRewardPlacementInfo info) {
            RewardedVideoResult rewardedVideoResult;
            if (this.handled) {
                return;
            }
            this.handled = true;
            if (!info.isAvailable() || info.isQuotaExhausted()) {
                Log.w(VideoRewardService.TAG, "Fresh state check blocked rewarded video: available=" + info.isAvailable() + " used=" + info.getUsedInInterval() + "/" + info.getMaxPerInterval());
                VideoRewardService.logVideoRewardDiagnostic("fresh_state_blocked", this.placement, "quota_or_unavailable");
                VideoRewardServiceClient resolveListenerClient = VideoRewardService.this.resolveListenerClient(this.placement, this.referencedId);
                if (resolveListenerClient != null) {
                    resolveListenerClient.onVideoRewardInfoUpdated(info);
                    if (info.isQuotaExhausted()) {
                        rewardedVideoResult = RewardedVideoResult.BLOCKED;
                    } else {
                        rewardedVideoResult = RewardedVideoResult.ERROR;
                    }
                    resolveListenerClient.onVideoRewardRequestProcessed(rewardedVideoResult, 0L);
                    return;
                }
                return;
            }
            String videoPlacement = PromoParams.getVideoPlacement(this.placement);
            if (VideoRewardService.this.activity == null || VideoRewardService.this.activity.isDestroyed() || !VideoRewardService.this.isRewardedAdReadyForPlacement(this.placement)) {
                Log.d(VideoRewardService.TAG, "Fresh state OK but rewarded ad not ready for " + videoPlacement);
                VideoRewardService.this.triggerCaching();
                VideoRewardService.logVideoRewardDiagnostic("fresh_state_no_fill", this.placement, null);
                VideoRewardServiceClient resolveListenerClient2 = VideoRewardService.this.resolveListenerClient(this.placement, this.referencedId);
                if (resolveListenerClient2 != null) {
                    resolveListenerClient2.onVideoRewardInfoUpdated(info);
                    resolveListenerClient2.onVideoRewardRequestProcessed(RewardedVideoResult.NO_FILL, 0L);
                    return;
                }
                return;
            }
            VideoRewardService.this.redeemReward(this.placement, this.referencedValue, this.referencedId);
        }
    }

    private class SilentClient implements VideoRewardServiceClient {
        private boolean isCanceled;
        private final VideoRewardInfoListener listener;
        private final PromoService.PromoPlacement placement;
        private final String referenceId;

        @Override // org.betup.services.offer.VideoRewardService.VideoRewardServiceClient
        public void onVideoRewardRequestProcessed(RewardedVideoResult result, long amount) {
        }

        public SilentClient(PromoService.PromoPlacement placement, String referenceId, VideoRewardInfoListener listener) {
            this.placement = placement;
            this.listener = listener;
            this.referenceId = referenceId;
        }

        @Override // org.betup.services.offer.VideoRewardService.VideoRewardInfoListener
        public void onVideoRewardInfoUpdated(VideoRewardPlacementInfo info) {
            VideoRewardService.this.disconnectClient(this.placement, this.referenceId);
            if (this.isCanceled) {
                this.listener.onVideoRewardInfoUpdated(VideoRewardPlacementInfo.unavailable());
            } else {
                this.listener.onVideoRewardInfoUpdated(info);
            }
        }

        public void cancel() {
            this.isCanceled = true;
        }
    }
}
