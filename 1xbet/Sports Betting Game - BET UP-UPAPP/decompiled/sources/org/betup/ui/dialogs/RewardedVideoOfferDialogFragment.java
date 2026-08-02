package org.betup.ui.dialogs;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.DialogFragment;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.BetUpApp;
import org.betup.model.remote.entity.videoRewards.VideoRewardPlacementInfo;
import org.betup.rewardedprompt.RewardedPromptFlowLog;
import org.betup.rewardedprompt.RewardedVideoOfferCoordinator;
import org.betup.services.offer.PromoParams;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;
import org.betup.utils.AdMobFullscreenSessionGuard;
import org.betup.utils.DialogManager;
import org.betup.utils.ImmersiveOverlayGate;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: RewardedVideoOfferDialogFragment.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001BB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\u0012\u0010)\u001a\u00020&2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J$\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u00102\u001a\u00020&H\u0016J\b\u00103\u001a\u00020&H\u0016J\u0010\u00104\u001a\u00020&2\u0006\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u00020&H\u0002J\b\u00108\u001a\u00020&H\u0002J\b\u00109\u001a\u00020&H\u0002J\b\u0010:\u001a\u00020&H\u0002J\u0010\u0010;\u001a\u00020&2\u0006\u0010<\u001a\u00020=H\u0016J\u0018\u0010>\u001a\u00020&2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\"H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00180!X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C²\u0006\n\u0010D\u001a\u00020\"X\u008a\u0084\u0002²\u0006\n\u0010E\u001a\u00020\u0018X\u008a\u0084\u0002²\u0006\n\u0010F\u001a\u00020\u0018X\u008a\u0084\u0002"}, d2 = {"Lorg/betup/ui/dialogs/RewardedVideoOfferDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lorg/betup/services/offer/VideoRewardService$VideoRewardServiceClient;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "videoRewardService", "Lorg/betup/services/offer/VideoRewardService;", "getVideoRewardService", "()Lorg/betup/services/offer/VideoRewardService;", "setVideoRewardService", "(Lorg/betup/services/offer/VideoRewardService;)V", "rewardedVideoOfferCoordinator", "Lorg/betup/rewardedprompt/RewardedVideoOfferCoordinator;", "getRewardedVideoOfferCoordinator", "()Lorg/betup/rewardedprompt/RewardedVideoOfferCoordinator;", "setRewardedVideoOfferCoordinator", "(Lorg/betup/rewardedprompt/RewardedVideoOfferCoordinator;)V", "placement", "Lorg/betup/services/offer/PromoService$PromoPlacement;", RewardedVideoOfferDialogFragment.ARG_CAMPAIGN_ID, "", RewardedVideoOfferDialogFragment.ARG_EVENT_KEY, RewardedVideoOfferDialogFragment.ARG_SCREEN_KEY, "watchedStarted", "", "rewardCompleted", "redeemInFlight", "mainHandler", "Landroid/os/Handler;", "adPollRunnable", "Ljava/lang/Runnable;", "dismissAfterAdRunnable", "_prizeAmount", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_backendAvailable", "_adReady", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", "onStop", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onWatchClicked", "scheduleDismissWhenAdShows", "startAdReadyPolling", "stopAdReadyPolling", "onVideoRewardInfoUpdated", "info", "Lorg/betup/model/remote/entity/videoRewards/VideoRewardPlacementInfo;", "onVideoRewardRequestProcessed", "result", "Lorg/betup/services/offer/VideoRewardService$RewardedVideoResult;", "amount", VastTagName.COMPANION, "app_release", "prize", "backendAvailable", "adReady"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RewardedVideoOfferDialogFragment extends DialogFragment implements VideoRewardService.VideoRewardServiceClient {
    private static final long AD_POLL_MS = 1000;
    private static final String ARG_CAMPAIGN_ID = "campaignId";
    private static final String ARG_EVENT_KEY = "eventKey";
    private static final String ARG_PLACEMENT_NAME = "placementName";
    private static final String ARG_PRIZE_AMOUNT = "prizeAmount";
    private static final String ARG_SCREEN_KEY = "screenKey";
    public static final String TAG = "RewardedVideoOfferDialog";
    private Runnable adPollRunnable;
    private Runnable dismissAfterAdRunnable;
    private String eventKey;
    private boolean redeemInFlight;
    private boolean rewardCompleted;

    @Inject
    public RewardedVideoOfferCoordinator rewardedVideoOfferCoordinator;
    private String screenKey;

    @Inject
    public VideoRewardService videoRewardService;
    private boolean watchedStarted;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private PromoService.PromoPlacement placement = PromoService.PromoPlacement.AUTO_PROMPT;
    private String campaignId = "";
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final MutableStateFlow<Long> _prizeAmount = StateFlowKt.MutableStateFlow(0L);
    private final MutableStateFlow<Boolean> _backendAvailable = StateFlowKt.MutableStateFlow(true);
    private final MutableStateFlow<Boolean> _adReady = StateFlowKt.MutableStateFlow(false);

    /* compiled from: RewardedVideoOfferDialogFragment.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoRewardService.RewardedVideoResult.values().length];
            try {
                iArr[VideoRewardService.RewardedVideoResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoRewardService.RewardedVideoResult.NO_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoRewardService.RewardedVideoResult.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoRewardService.RewardedVideoResult.BLOCKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final VideoRewardService getVideoRewardService() {
        VideoRewardService videoRewardService = this.videoRewardService;
        if (videoRewardService != null) {
            return videoRewardService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("videoRewardService");
        return null;
    }

    public final void setVideoRewardService(VideoRewardService videoRewardService) {
        Intrinsics.checkNotNullParameter(videoRewardService, "<set-?>");
        this.videoRewardService = videoRewardService;
    }

    public final RewardedVideoOfferCoordinator getRewardedVideoOfferCoordinator() {
        RewardedVideoOfferCoordinator rewardedVideoOfferCoordinator = this.rewardedVideoOfferCoordinator;
        if (rewardedVideoOfferCoordinator != null) {
            return rewardedVideoOfferCoordinator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rewardedVideoOfferCoordinator");
        return null;
    }

    public final void setRewardedVideoOfferCoordinator(RewardedVideoOfferCoordinator rewardedVideoOfferCoordinator) {
        Intrinsics.checkNotNullParameter(rewardedVideoOfferCoordinator, "<set-?>");
        this.rewardedVideoOfferCoordinator = rewardedVideoOfferCoordinator;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Object m10853constructorimpl;
        super.onCreate(savedInstanceState);
        setStyle(2, R.style.Theme.Translucent.NoTitleBar);
        setCancelable(true);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString(ARG_CAMPAIGN_ID);
            if (string == null) {
                string = "";
            }
            this.campaignId = string;
            this.eventKey = arguments.getString(ARG_EVENT_KEY);
            this.screenKey = arguments.getString(ARG_SCREEN_KEY);
            this._prizeAmount.setValue(Long.valueOf(arguments.getLong(ARG_PRIZE_AMOUNT, 0L)));
            String string2 = arguments.getString("placementName");
            String str = string2;
            if (str != null && !StringsKt.isBlank(str)) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    RewardedVideoOfferDialogFragment rewardedVideoOfferDialogFragment = this;
                    this.placement = PromoService.PromoPlacement.valueOf(string2);
                    Result.m10853constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m10853constructorimpl(ResultKt.createFailure(th));
                }
            }
        }
        this._backendAvailable.setValue(true);
        MutableStateFlow<Boolean> mutableStateFlow = this._adReady;
        try {
            Result.Companion companion3 = Result.INSTANCE;
            RewardedVideoOfferDialogFragment rewardedVideoOfferDialogFragment2 = this;
            m10853constructorimpl = Result.m10853constructorimpl(Boolean.valueOf(getVideoRewardService().isRewardedReady(this.placement)));
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m10859isFailureimpl(m10853constructorimpl)) {
            m10853constructorimpl = false;
        }
        mutableStateFlow.setValue(m10853constructorimpl);
        String str2 = this.campaignId;
        Long value = this._prizeAmount.getValue();
        PromoService.PromoPlacement promoPlacement = this.placement;
        RewardedPromptFlowLog.ui("DIALOG_CREATE", "onCreate campaignId=" + str2 + " prize=" + value + " placement=" + promoPlacement + " placementId=" + PromoParams.getVideoPlacement(promoPlacement) + " adReady=" + this._adReady.getValue());
        getVideoRewardService().connectClient(this.placement, null, this);
        getVideoRewardService().getVideoRewardInfo(this.placement, null, null);
        getVideoRewardService().preloadRewarded(this.placement);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setBackgroundColor(0);
        composeView.setClickable(true);
        composeView.setFocusable(true);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1805214855, true, new RewardedVideoOfferDialogFragment$onCreateView$1$1(this)));
        return composeView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(true);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setGravity(17);
            window.setLayout(-1, -2);
            window.setBackgroundDrawableResource(R.color.transparent);
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.addFlags(2);
            window.clearFlags(8);
            window.clearFlags(16);
            window.setDimAmount(0.72f);
        }
        startAdReadyPolling();
        RewardedPromptFlowLog.ui("DIALOG_START", "onStart — window shown campaignId=" + this.campaignId);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        stopAdReadyPolling();
        super.onStop();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        stopAdReadyPolling();
        Runnable runnable = this.dismissAfterAdRunnable;
        if (runnable != null) {
            this.mainHandler.removeCallbacks(runnable);
        }
        this.dismissAfterAdRunnable = null;
        super.onDismiss(dialog);
        RewardedPromptFlowLog.ui("DIALOG_DISMISS", "onDismiss campaignId=" + this.campaignId + " watched=" + this.watchedStarted + " completed=" + this.rewardCompleted + " immersiveActive=" + ImmersiveOverlayGate.isActive());
        if (!this.redeemInFlight || this.rewardCompleted) {
            getVideoRewardService().disconnectClient(this.placement, null);
        }
        DialogManager.onDialogDismissed(TAG);
        boolean z = (!ImmersiveOverlayGate.isActive() || this.watchedStarted || this.rewardCompleted) ? false : true;
        RewardedVideoOfferCoordinator rewardedVideoOfferCoordinator = getRewardedVideoOfferCoordinator();
        String str = this.campaignId;
        rewardedVideoOfferCoordinator.onDialogDismissed(StringsKt.isBlank(str) ? null : str, (this.watchedStarted || this.rewardCompleted) ? false : true, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onWatchClicked() {
        boolean z = this.redeemInFlight;
        if (z || this.rewardCompleted) {
            RewardedPromptFlowLog.stop("WATCH_UI", "tap ignored redeemInFlight=" + z + " rewardCompleted=" + this.rewardCompleted);
            return;
        }
        if (!this._backendAvailable.getValue().booleanValue()) {
            RewardedPromptFlowLog.stop("WATCH_UI", "tap ignored — backend placement unavailable");
            return;
        }
        if (!this._adReady.getValue().booleanValue()) {
            RewardedPromptFlowLog.wait("WATCH_UI", "tap ignored — AdMob not ready for " + this.placement + ", requesting preload");
            getVideoRewardService().preloadRewarded(this.placement);
            return;
        }
        String str = this.campaignId;
        PromoService.PromoPlacement promoPlacement = this.placement;
        RewardedPromptFlowLog.ok("WATCH_UI", "Watch tapped campaignId=" + str + " → redeemReward(" + promoPlacement + " / " + PromoParams.getVideoPlacement(promoPlacement) + ")");
        this.watchedStarted = true;
        this.redeemInFlight = true;
        getRewardedVideoOfferCoordinator().onWatchStarted(this.campaignId);
        getVideoRewardService().redeemReward(this.placement, null, null);
        scheduleDismissWhenAdShows();
    }

    private final void scheduleDismissWhenAdShows() {
        Runnable runnable = this.dismissAfterAdRunnable;
        if (runnable != null) {
            this.mainHandler.removeCallbacks(runnable);
        }
        Runnable runnable2 = new Runnable() { // from class: org.betup.ui.dialogs.RewardedVideoOfferDialogFragment$scheduleDismissWhenAdShows$poll$1
            private int tries;

            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                Handler handler;
                String str;
                if (RewardedVideoOfferDialogFragment.this.isAdded()) {
                    z = RewardedVideoOfferDialogFragment.this.rewardCompleted;
                    if (z) {
                        return;
                    }
                    this.tries++;
                    if (AdMobFullscreenSessionGuard.isActive()) {
                        RewardedPromptFlowLog.ui("WATCH_UI", "AdMob fullscreen active — dismiss offer under ad");
                        RewardedVideoOfferCoordinator rewardedVideoOfferCoordinator = RewardedVideoOfferDialogFragment.this.getRewardedVideoOfferCoordinator();
                        str = RewardedVideoOfferDialogFragment.this.campaignId;
                        rewardedVideoOfferCoordinator.markCampaignConsumed(str);
                        RewardedVideoOfferDialogFragment.this.dismissAllowingStateLoss();
                        return;
                    }
                    if (this.tries < 40) {
                        handler = RewardedVideoOfferDialogFragment.this.mainHandler;
                        handler.postDelayed(this, 150L);
                    }
                }
            }
        };
        this.dismissAfterAdRunnable = runnable2;
        this.mainHandler.postDelayed(runnable2, 150L);
    }

    private final void startAdReadyPolling() {
        stopAdReadyPolling();
        Runnable runnable = new Runnable() { // from class: org.betup.ui.dialogs.RewardedVideoOfferDialogFragment$startAdReadyPolling$poll$1
            @Override // java.lang.Runnable
            public void run() {
                Object m10853constructorimpl;
                MutableStateFlow mutableStateFlow;
                Handler handler;
                MutableStateFlow mutableStateFlow2;
                PromoService.PromoPlacement promoPlacement;
                MutableStateFlow mutableStateFlow3;
                PromoService.PromoPlacement promoPlacement2;
                PromoService.PromoPlacement promoPlacement3;
                if (RewardedVideoOfferDialogFragment.this.isAdded()) {
                    RewardedVideoOfferDialogFragment rewardedVideoOfferDialogFragment = RewardedVideoOfferDialogFragment.this;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        RewardedVideoOfferDialogFragment$startAdReadyPolling$poll$1 rewardedVideoOfferDialogFragment$startAdReadyPolling$poll$1 = this;
                        VideoRewardService videoRewardService = rewardedVideoOfferDialogFragment.getVideoRewardService();
                        promoPlacement3 = rewardedVideoOfferDialogFragment.placement;
                        m10853constructorimpl = Result.m10853constructorimpl(Boolean.valueOf(videoRewardService.isRewardedReady(promoPlacement3)));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
                    }
                    if (Result.m10859isFailureimpl(m10853constructorimpl)) {
                        m10853constructorimpl = false;
                    }
                    boolean booleanValue = ((Boolean) m10853constructorimpl).booleanValue();
                    mutableStateFlow = RewardedVideoOfferDialogFragment.this._adReady;
                    if (booleanValue != ((Boolean) mutableStateFlow.getValue()).booleanValue()) {
                        mutableStateFlow3 = RewardedVideoOfferDialogFragment.this._adReady;
                        mutableStateFlow3.setValue(Boolean.valueOf(booleanValue));
                        promoPlacement2 = RewardedVideoOfferDialogFragment.this.placement;
                        RewardedPromptFlowLog.step("AD_POLL", "adReady → " + booleanValue + " placement=" + promoPlacement2);
                    }
                    if (!booleanValue) {
                        mutableStateFlow2 = RewardedVideoOfferDialogFragment.this._backendAvailable;
                        if (((Boolean) mutableStateFlow2.getValue()).booleanValue()) {
                            VideoRewardService videoRewardService2 = RewardedVideoOfferDialogFragment.this.getVideoRewardService();
                            promoPlacement = RewardedVideoOfferDialogFragment.this.placement;
                            videoRewardService2.preloadRewarded(promoPlacement);
                        }
                    }
                    handler = RewardedVideoOfferDialogFragment.this.mainHandler;
                    handler.postDelayed(this, 1000L);
                }
            }
        };
        this.adPollRunnable = runnable;
        this.mainHandler.post(runnable);
    }

    private final void stopAdReadyPolling() {
        Runnable runnable = this.adPollRunnable;
        if (runnable != null) {
            this.mainHandler.removeCallbacks(runnable);
        }
        this.adPollRunnable = null;
    }

    @Override // org.betup.services.offer.VideoRewardService.VideoRewardInfoListener
    public void onVideoRewardInfoUpdated(VideoRewardPlacementInfo info) {
        Object m10853constructorimpl;
        Intrinsics.checkNotNullParameter(info, "info");
        boolean z = info.isAvailable() && !info.isQuotaExhausted();
        this._backendAvailable.setValue(Boolean.valueOf(z));
        try {
            Result.Companion companion = Result.INSTANCE;
            RewardedVideoOfferDialogFragment rewardedVideoOfferDialogFragment = this;
            m10853constructorimpl = Result.m10853constructorimpl(Boolean.valueOf(getVideoRewardService().isRewardedReady(this.placement)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m10859isFailureimpl(m10853constructorimpl)) {
            m10853constructorimpl = false;
        }
        boolean booleanValue = ((Boolean) m10853constructorimpl).booleanValue();
        this._adReady.setValue(Boolean.valueOf(booleanValue));
        if (info.getPrizeAmount() > 0) {
            this._prizeAmount.setValue(Long.valueOf(info.getPrizeAmount()));
        }
        RewardedPromptFlowLog.step("STATE", "placement info available=" + z + " adReady=" + booleanValue + " prize=" + info.getPrizeAmount());
        if (!z && !this.watchedStarted && !this.redeemInFlight) {
            RewardedPromptFlowLog.stop("STATE", "placement unavailable — auto-dismiss dialog");
            dismissAllowingStateLoss();
        } else {
            if (booleanValue) {
                return;
            }
            getVideoRewardService().preloadRewarded(this.placement);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.betup.services.offer.VideoRewardService.VideoRewardServiceClient
    public void onVideoRewardRequestProcessed(VideoRewardService.RewardedVideoResult result, long amount) {
        Object m10853constructorimpl;
        Intrinsics.checkNotNullParameter(result, "result");
        RewardedPromptFlowLog.ok("REDEEM", "result=" + result + " amount=" + amount + " campaignId=" + this.campaignId);
        int i = WhenMappings.$EnumSwitchMapping$0[result.ordinal()];
        if (i == 1) {
            this.rewardCompleted = true;
            this.redeemInFlight = false;
            getRewardedVideoOfferCoordinator().onWatchCompleted(this.campaignId);
            if (isAdded()) {
                dismissAllowingStateLoss();
                return;
            } else {
                getVideoRewardService().disconnectClient(this.placement, null);
                return;
            }
        }
        if (i != 2 && i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        this.redeemInFlight = false;
        this.watchedStarted = this.rewardCompleted;
        MutableStateFlow<Boolean> mutableStateFlow = this._adReady;
        try {
            Result.Companion companion = Result.INSTANCE;
            RewardedVideoOfferDialogFragment rewardedVideoOfferDialogFragment = this;
            m10853constructorimpl = Result.m10853constructorimpl(Boolean.valueOf(getVideoRewardService().isRewardedReady(this.placement)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m10859isFailureimpl(m10853constructorimpl)) {
            m10853constructorimpl = false;
        }
        mutableStateFlow.setValue(m10853constructorimpl);
        getVideoRewardService().preloadRewarded(this.placement);
        RewardedPromptFlowLog.wait("REDEEM", "failed " + result + " — dialog stays open for retry adReady=" + this._adReady.getValue());
    }

    /* compiled from: RewardedVideoOfferDialogFragment.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lorg/betup/ui/dialogs/RewardedVideoOfferDialogFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "AD_POLL_MS", "", "ARG_CAMPAIGN_ID", "ARG_PLACEMENT_NAME", "ARG_PRIZE_AMOUNT", "ARG_EVENT_KEY", "ARG_SCREEN_KEY", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/dialogs/RewardedVideoOfferDialogFragment;", RewardedVideoOfferDialogFragment.ARG_CAMPAIGN_ID, "placementName", RewardedVideoOfferDialogFragment.ARG_PRIZE_AMOUNT, RewardedVideoOfferDialogFragment.ARG_EVENT_KEY, RewardedVideoOfferDialogFragment.ARG_SCREEN_KEY, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RewardedVideoOfferDialogFragment newInstance(String campaignId, String placementName, long prizeAmount, String eventKey, String screenKey) {
            Intrinsics.checkNotNullParameter(campaignId, "campaignId");
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            RewardedVideoOfferDialogFragment rewardedVideoOfferDialogFragment = new RewardedVideoOfferDialogFragment();
            rewardedVideoOfferDialogFragment.setArguments(BundleKt.bundleOf(TuplesKt.to(RewardedVideoOfferDialogFragment.ARG_CAMPAIGN_ID, campaignId), TuplesKt.to("placementName", placementName), TuplesKt.to(RewardedVideoOfferDialogFragment.ARG_PRIZE_AMOUNT, Long.valueOf(prizeAmount)), TuplesKt.to(RewardedVideoOfferDialogFragment.ARG_EVENT_KEY, eventKey), TuplesKt.to(RewardedVideoOfferDialogFragment.ARG_SCREEN_KEY, screenKey)));
            return rewardedVideoOfferDialogFragment;
        }
    }
}
