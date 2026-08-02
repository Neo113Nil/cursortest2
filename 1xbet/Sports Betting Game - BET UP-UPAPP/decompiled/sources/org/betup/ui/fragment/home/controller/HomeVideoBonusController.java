package org.betup.ui.fragment.home.controller;

import android.util.Log;
import com.ironsource.X3;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.media3.extractor.text.ttml.TtmlNode;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.R;
import org.betup.bus.VideoRewardReceivedMessage;
import org.betup.model.remote.entity.videoRewards.VideoRewardPlacementInfo;
import org.betup.services.offer.PromoParams;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;
import org.betup.ui.common.video.VideoOfferAvailabilityPhase;
import org.betup.ui.fragment.home.controller.HomeVideoBonusEvent;
import org.betup.ui.tour.compose.HomeTourScroll;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeVideoBonusController.kt */
@Singleton
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ^2\u00020\u0001:\u0002]^B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010,\u001a\u00020-J\u0006\u0010.\u001a\u00020-J\u0006\u0010/\u001a\u00020-J\u0010\u00100\u001a\u00020-2\u0006\u00101\u001a\u000202H\u0007J\b\u00103\u001a\u00020-H\u0002J\u0006\u00104\u001a\u00020-J\u0006\u00105\u001a\u00020-J\u0006\u00106\u001a\u00020-J\r\u00107\u001a\u0004\u0018\u00010&¢\u0006\u0002\u00108J\r\u00109\u001a\u0004\u0018\u00010&¢\u0006\u0002\u00108J\u0006\u0010:\u001a\u00020-J\u0006\u0010;\u001a\u00020-J\u0006\u0010<\u001a\u00020-J\u0006\u0010=\u001a\u00020-J\u0006\u0010>\u001a\u00020-J\b\u0010?\u001a\u00020-H\u0002J\b\u0010@\u001a\u00020-H\u0002J\b\u0010A\u001a\u00020-H\u0002J\b\u0010B\u001a\u00020-H\u0002J\b\u0010C\u001a\u00020-H\u0002J\b\u0010D\u001a\u00020-H\u0002J\u0018\u0010E\u001a\u00020-2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\rH\u0002J\b\u0010I\u001a\u00020-H\u0002J\b\u0010J\u001a\u00020-H\u0002J\b\u0010K\u001a\u00020-H\u0002J\b\u0010L\u001a\u00020MH\u0002J\u0010\u0010N\u001a\u00020-2\u0006\u0010O\u001a\u00020PH\u0016J\u0010\u0010Q\u001a\u00020-2\u0006\u0010R\u001a\u00020SH\u0002J\u0018\u0010T\u001a\u00020-2\u0006\u0010O\u001a\u00020P2\u0006\u0010U\u001a\u00020\rH\u0002J\u001a\u0010V\u001a\u00020-2\b\u0010W\u001a\u0004\u0018\u00010X2\u0006\u0010Y\u001a\u00020SH\u0016J\u0010\u0010Z\u001a\u00020-2\u0006\u0010[\u001a\u00020&H\u0002J\b\u0010\\\u001a\u00020-H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0004\n\u0002\u0010'R\u000e\u0010(\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006_"}, d2 = {"Lorg/betup/ui/fragment/home/controller/HomeVideoBonusController;", "Lorg/betup/services/offer/VideoRewardService$VideoRewardServiceClient;", "videoRewardService", "Lorg/betup/services/offer/VideoRewardService;", "refreshGate", "Lorg/betup/ui/fragment/home/controller/HomeVideoBonusRefreshGate;", "trackedOverlayDismissRegistry", "Lorg/betup/ui/fragment/home/controller/TrackedOverlayDismissRegistry;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/services/offer/VideoRewardService;Lorg/betup/ui/fragment/home/controller/HomeVideoBonusRefreshGate;Lorg/betup/ui/fragment/home/controller/TrackedOverlayDismissRegistry;)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "clientRegistered", "", "pollingActive", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/betup/ui/fragment/home/controller/HomeVideoBonusUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_events", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lorg/betup/ui/fragment/home/controller/HomeVideoBonusEvent;", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "periodicPollJob", "Lkotlinx/coroutines/Job;", "adPreloadRetryJob", "availabilitySearchTimeoutJob", "countdownJob", "actionLoadingTimeoutJob", "postVideoRefreshJob", "homeVideoRewardSessionPending", "pendingCollectDialogAmount", "", "Ljava/lang/Integer;", "lastTrackedDialogDismissListenerRegistered", "eventBusRegistered", "onLastTrackedOverlayDismissed", "Ljava/lang/Runnable;", TtmlNode.START, "", "pausePolling", "stop", "onVideoRewardReceived", "message", "Lorg/betup/bus/VideoRewardReceivedMessage;", "cancelPollingJobs", "reset", "refreshAfterVideoWatched", "onRewardCollectDialogConfirmed", "consumePendingCollectDialogAmount", "()Ljava/lang/Integer;", "peekPendingCollectDialogAmount", "markCollectDialogShown", "standDownForExternalVideoReward", "refreshImmediate", "onAdsButtonClicked", "onAdsButtonLongClicked", "beginActionLoading", "scheduleActionLoadingTimeout", "endActionLoading", "beginAvailabilitySearch", "retryAvailabilitySearch", "scheduleAvailabilitySearchTimeout", "performVideoBonusNetworkRefresh", "policy", "Lorg/betup/ui/fragment/home/controller/HomeVideoBonusController$VideoBonusNetworkRefreshPolicy;", "invalidateFirst", "startPeriodicPoll", "scheduleAdPreloadRetry", "cancelAdPreloadRetry", X3.k, "", "onVideoRewardInfoUpdated", "info", "Lorg/betup/model/remote/entity/videoRewards/VideoRewardPlacementInfo;", "startCountdown", "resetsAtEpochMs", "", "maybeFinishActionLoadingAfterStateRefresh", "limitReached", "onVideoRewardRequestProcessed", "result", "Lorg/betup/services/offer/VideoRewardService$RewardedVideoResult;", "amount", "emitMessage", "messageResId", "markUnavailableAfterNoFill", "VideoBonusNetworkRefreshPolicy", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeVideoBonusController implements VideoRewardService.VideoRewardServiceClient {
    private static final long ACTION_LOADING_TIMEOUT_MS = 90000;
    private static final long AVAILABILITY_SEARCH_RESTART_MS = 12000;
    private static final long POLL_INTERVAL_MS = 45000;
    private static final String TAG = "HomeVideoBonusController";
    private final MutableSharedFlow<HomeVideoBonusEvent> _events;
    private final MutableStateFlow<HomeVideoBonusUiState> _uiState;
    private Job actionLoadingTimeoutJob;
    private Job adPreloadRetryJob;
    private Job availabilitySearchTimeoutJob;
    private boolean clientRegistered;
    private Job countdownJob;
    private boolean eventBusRegistered;
    private final SharedFlow<HomeVideoBonusEvent> events;
    private boolean homeVideoRewardSessionPending;
    private boolean lastTrackedDialogDismissListenerRegistered;
    private final Runnable onLastTrackedOverlayDismissed;
    private Integer pendingCollectDialogAmount;
    private Job periodicPollJob;
    private boolean pollingActive;
    private Job postVideoRefreshJob;
    private final HomeVideoBonusRefreshGate refreshGate;
    private final CoroutineScope scope;
    private final TrackedOverlayDismissRegistry trackedOverlayDismissRegistry;
    private final StateFlow<HomeVideoBonusUiState> uiState;
    private final VideoRewardService videoRewardService;
    public static final int $stable = 8;
    private static final long AD_PRELOAD_RETRY_MS = 2500;
    private static final long[] POST_VIDEO_REFRESH_DELAYS_MS = {0, 400, HomeTourScroll.LIST_LAYOUT_TIMEOUT_MS, AD_PRELOAD_RETRY_MS};

    /* compiled from: HomeVideoBonusController.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VideoOfferAvailabilityPhase.values().length];
            try {
                iArr[VideoOfferAvailabilityPhase.CHECKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoOfferAvailabilityPhase.UNAVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoOfferAvailabilityPhase.COOLDOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoOfferAvailabilityPhase.LIMIT_REACHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoOfferAvailabilityPhase.ACTION_IN_PROGRESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VideoOfferAvailabilityPhase.READY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VideoRewardService.RewardedVideoResult.values().length];
            try {
                iArr2[VideoRewardService.RewardedVideoResult.BLOCKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[VideoRewardService.RewardedVideoResult.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[VideoRewardService.RewardedVideoResult.NO_FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Inject
    public HomeVideoBonusController(VideoRewardService videoRewardService, HomeVideoBonusRefreshGate refreshGate, TrackedOverlayDismissRegistry trackedOverlayDismissRegistry) {
        Intrinsics.checkNotNullParameter(videoRewardService, "videoRewardService");
        Intrinsics.checkNotNullParameter(refreshGate, "refreshGate");
        Intrinsics.checkNotNullParameter(trackedOverlayDismissRegistry, "trackedOverlayDismissRegistry");
        this.videoRewardService = videoRewardService;
        this.refreshGate = refreshGate;
        this.trackedOverlayDismissRegistry = trackedOverlayDismissRegistry;
        this.scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()));
        MutableStateFlow<HomeVideoBonusUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(new HomeVideoBonusUiState(false, null, 0L, 0L, 0, 0, null, false, 255, null));
        this._uiState = MutableStateFlow;
        this.uiState = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<HomeVideoBonusEvent> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 32, null, 5, null);
        this._events = MutableSharedFlow$default;
        this.events = FlowKt.asSharedFlow(MutableSharedFlow$default);
        this.onLastTrackedOverlayDismissed = new Runnable() { // from class: org.betup.ui.fragment.home.controller.HomeVideoBonusController$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                HomeVideoBonusController.onLastTrackedOverlayDismissed$lambda$0(HomeVideoBonusController.this);
            }
        };
    }

    public final StateFlow<HomeVideoBonusUiState> getUiState() {
        return this.uiState;
    }

    public final SharedFlow<HomeVideoBonusEvent> getEvents() {
        return this.events;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLastTrackedOverlayDismissed$lambda$0(HomeVideoBonusController homeVideoBonusController) {
        homeVideoBonusController.performVideoBonusNetworkRefresh(VideoBonusNetworkRefreshPolicy.RESPECT_TRACKED_OVERLAY, true);
    }

    public final void start() {
        if (!this.lastTrackedDialogDismissListenerRegistered) {
            this.trackedOverlayDismissRegistry.registerOnLastTrackedOverlayDismissed(this.onLastTrackedOverlayDismissed);
            this.lastTrackedDialogDismissListenerRegistered = true;
        }
        this.clientRegistered = true;
        if (!this.eventBusRegistered) {
            EventBus.getDefault().register(this);
            this.eventBusRegistered = true;
        }
        this.videoRewardService.connectClient(PromoService.PromoPlacement.HOME_VIDEO_BONUS, null, this);
        this.pollingActive = true;
        beginAvailabilitySearch();
        performVideoBonusNetworkRefresh(VideoBonusNetworkRefreshPolicy.BYPASS_TRACKED_OVERLAY, true);
        startPeriodicPoll();
    }

    public final void pausePolling() {
        this.pollingActive = false;
        Job job = this.periodicPollJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.periodicPollJob = null;
        Job job2 = this.adPreloadRetryJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.adPreloadRetryJob = null;
        Job job3 = this.availabilitySearchTimeoutJob;
        if (job3 != null) {
            Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
        }
        this.availabilitySearchTimeoutJob = null;
        Job job4 = this.countdownJob;
        if (job4 != null) {
            Job.DefaultImpls.cancel$default(job4, (CancellationException) null, 1, (Object) null);
        }
        this.countdownJob = null;
    }

    public final void stop() {
        if (this.lastTrackedDialogDismissListenerRegistered) {
            this.trackedOverlayDismissRegistry.unregisterOnLastTrackedOverlayDismissed(this.onLastTrackedOverlayDismissed);
            this.lastTrackedDialogDismissListenerRegistered = false;
        }
        this.pollingActive = false;
        cancelPollingJobs();
        Job job = this.postVideoRefreshJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.postVideoRefreshJob = null;
        endActionLoading();
        if (this.clientRegistered) {
            this.clientRegistered = false;
            if (this.eventBusRegistered) {
                EventBus.getDefault().unregister(this);
                this.eventBusRegistered = false;
            }
            this.videoRewardService.disconnectClient(PromoService.PromoPlacement.HOME_VIDEO_BONUS, null);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onVideoRewardReceived(VideoRewardReceivedMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.clientRegistered) {
            if (Intrinsics.areEqual(message.getPlacementId(), PromoParams.getVideoPlacement(PromoService.PromoPlacement.HOME_VIDEO_BONUS))) {
                Log.d(TAG, "VideoRewardReceived for home placement — refreshing UI");
                refreshAfterVideoWatched();
            }
        }
    }

    private final void cancelPollingJobs() {
        Job job = this.periodicPollJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.periodicPollJob = null;
        Job job2 = this.adPreloadRetryJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.adPreloadRetryJob = null;
        Job job3 = this.availabilitySearchTimeoutJob;
        if (job3 != null) {
            Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
        }
        this.availabilitySearchTimeoutJob = null;
        Job job4 = this.countdownJob;
        if (job4 != null) {
            Job.DefaultImpls.cancel$default(job4, (CancellationException) null, 1, (Object) null);
        }
        this.countdownJob = null;
    }

    public final void reset() {
        stop();
        this.homeVideoRewardSessionPending = false;
        this.pendingCollectDialogAmount = null;
        this._uiState.setValue(new HomeVideoBonusUiState(false, null, 0L, 0L, 0, 0, null, false, 255, null));
    }

    public final void refreshAfterVideoWatched() {
        if (this.clientRegistered) {
            Job job = this.postVideoRefreshJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.videoRewardService.triggerCaching();
            this.postVideoRefreshJob = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new HomeVideoBonusController$refreshAfterVideoWatched$1(this, null), 3, null);
        }
    }

    public final void onRewardCollectDialogConfirmed() {
        HomeVideoBonusUiState value;
        HomeVideoBonusUiState copy;
        this.pendingCollectDialogAmount = null;
        MutableStateFlow<HomeVideoBonusUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r22 & 1) != 0 ? r2.adsActive : false, (r22 & 2) != 0 ? r2.availabilityPhase : null, (r22 & 4) != 0 ? r2.adsAmount : 0L, (r22 & 8) != 0 ? r2.displayPrizeAmount : 0L, (r22 & 16) != 0 ? r2.usedInInterval : 0, (r22 & 32) != 0 ? r2.maxPerInterval : 0, (r22 & 64) != 0 ? r2.cooldownEndsAtEpochMs : null, (r22 & 128) != 0 ? value.isActionLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        refreshAfterVideoWatched();
    }

    public final Integer consumePendingCollectDialogAmount() {
        Integer num = this.pendingCollectDialogAmount;
        this.pendingCollectDialogAmount = null;
        return num;
    }

    /* renamed from: peekPendingCollectDialogAmount, reason: from getter */
    public final Integer getPendingCollectDialogAmount() {
        return this.pendingCollectDialogAmount;
    }

    public final void markCollectDialogShown() {
        this.pendingCollectDialogAmount = null;
    }

    public final void standDownForExternalVideoReward() {
        this.videoRewardService.clearPendingFreshStateGate();
        this.homeVideoRewardSessionPending = false;
        this.pendingCollectDialogAmount = null;
        endActionLoading();
    }

    public final void refreshImmediate() {
        performVideoBonusNetworkRefresh(VideoBonusNetworkRefreshPolicy.BYPASS_TRACKED_OVERLAY, true);
    }

    public final void onAdsButtonClicked() {
        if (this.clientRegistered) {
            HomeVideoBonusUiState value = this._uiState.getValue();
            if (value.isActionLoading()) {
                return;
            }
            switch (WhenMappings.$EnumSwitchMapping$0[value.getAvailabilityPhase().ordinal()]) {
                case 1:
                    emitMessage(R.string.video_ads_still_checking);
                    return;
                case 2:
                    emitMessage(R.string.video_ads_still_checking);
                    retryAvailabilitySearch();
                    return;
                case 3:
                case 4:
                    emitMessage(R.string.home_video_reward_limit_reached);
                    return;
                case 5:
                    return;
                case 6:
                    beginActionLoading();
                    this.videoRewardService.attemptRewardedVideoWithFreshStateCheck(PromoService.PromoPlacement.HOME_VIDEO_BONUS, null, null);
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void onAdsButtonLongClicked() {
        Log.w(TAG, "Long-press ignored — not a DEBUG build");
    }

    private final void beginActionLoading() {
        HomeVideoBonusUiState value;
        HomeVideoBonusUiState copy;
        this.homeVideoRewardSessionPending = true;
        MutableStateFlow<HomeVideoBonusUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r22 & 1) != 0 ? r2.adsActive : false, (r22 & 2) != 0 ? r2.availabilityPhase : VideoOfferAvailabilityPhase.ACTION_IN_PROGRESS, (r22 & 4) != 0 ? r2.adsAmount : 0L, (r22 & 8) != 0 ? r2.displayPrizeAmount : 0L, (r22 & 16) != 0 ? r2.usedInInterval : 0, (r22 & 32) != 0 ? r2.maxPerInterval : 0, (r22 & 64) != 0 ? r2.cooldownEndsAtEpochMs : null, (r22 & 128) != 0 ? value.isActionLoading : true);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        scheduleActionLoadingTimeout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleActionLoadingTimeout() {
        Job job = this.actionLoadingTimeoutJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.actionLoadingTimeoutJob = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new HomeVideoBonusController$scheduleActionLoadingTimeout$1(this, null), 3, null);
    }

    private final void endActionLoading() {
        HomeVideoBonusUiState value;
        VideoOfferAvailabilityPhase availabilityPhase;
        HomeVideoBonusUiState copy;
        Job job = this.actionLoadingTimeoutJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.actionLoadingTimeoutJob = null;
        MutableStateFlow<HomeVideoBonusUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            HomeVideoBonusUiState homeVideoBonusUiState = value;
            if (homeVideoBonusUiState.getAvailabilityPhase() == VideoOfferAvailabilityPhase.ACTION_IN_PROGRESS) {
                availabilityPhase = homeVideoBonusUiState.getAdsActive() ? VideoOfferAvailabilityPhase.READY : VideoOfferAvailabilityPhase.UNAVAILABLE;
            } else {
                availabilityPhase = homeVideoBonusUiState.getAvailabilityPhase();
            }
            copy = homeVideoBonusUiState.copy((r22 & 1) != 0 ? homeVideoBonusUiState.adsActive : false, (r22 & 2) != 0 ? homeVideoBonusUiState.availabilityPhase : availabilityPhase, (r22 & 4) != 0 ? homeVideoBonusUiState.adsAmount : 0L, (r22 & 8) != 0 ? homeVideoBonusUiState.displayPrizeAmount : 0L, (r22 & 16) != 0 ? homeVideoBonusUiState.usedInInterval : 0, (r22 & 32) != 0 ? homeVideoBonusUiState.maxPerInterval : 0, (r22 & 64) != 0 ? homeVideoBonusUiState.cooldownEndsAtEpochMs : null, (r22 & 128) != 0 ? homeVideoBonusUiState.isActionLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void beginAvailabilitySearch() {
        HomeVideoBonusUiState value;
        HomeVideoBonusUiState homeVideoBonusUiState;
        MutableStateFlow<HomeVideoBonusUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            homeVideoBonusUiState = value;
            if (!homeVideoBonusUiState.getLimitReached() && !homeVideoBonusUiState.isOnCooldown(System.currentTimeMillis())) {
                homeVideoBonusUiState = homeVideoBonusUiState.copy((r22 & 1) != 0 ? homeVideoBonusUiState.adsActive : false, (r22 & 2) != 0 ? homeVideoBonusUiState.availabilityPhase : VideoOfferAvailabilityPhase.CHECKING, (r22 & 4) != 0 ? homeVideoBonusUiState.adsAmount : 0L, (r22 & 8) != 0 ? homeVideoBonusUiState.displayPrizeAmount : 0L, (r22 & 16) != 0 ? homeVideoBonusUiState.usedInInterval : 0, (r22 & 32) != 0 ? homeVideoBonusUiState.maxPerInterval : 0, (r22 & 64) != 0 ? homeVideoBonusUiState.cooldownEndsAtEpochMs : null, (r22 & 128) != 0 ? homeVideoBonusUiState.isActionLoading : false);
            }
        } while (!mutableStateFlow.compareAndSet(value, homeVideoBonusUiState));
        scheduleAvailabilitySearchTimeout();
    }

    private final void retryAvailabilitySearch() {
        beginAvailabilitySearch();
        this.videoRewardService.preloadRewarded(PromoService.PromoPlacement.HOME_VIDEO_BONUS);
        performVideoBonusNetworkRefresh(VideoBonusNetworkRefreshPolicy.BYPASS_TRACKED_OVERLAY, true);
    }

    private final void scheduleAvailabilitySearchTimeout() {
        Job job = this.availabilitySearchTimeoutJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.availabilitySearchTimeoutJob = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new HomeVideoBonusController$scheduleAvailabilitySearchTimeout$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performVideoBonusNetworkRefresh(VideoBonusNetworkRefreshPolicy policy, boolean invalidateFirst) {
        if (this.clientRegistered) {
            if (policy == VideoBonusNetworkRefreshPolicy.RESPECT_TRACKED_OVERLAY && !this.refreshGate.mayRunAutomaticNetworkRefresh()) {
                Log.d(TAG, "Skipped video bonus network refresh (tracked dialog overlay)");
                return;
            }
            if (invalidateFirst) {
                this.videoRewardService.invalidateVideoRewardState(PromoService.PromoPlacement.HOME_VIDEO_BONUS, null, null);
            }
            this.videoRewardService.getVideoRewardInfo(PromoService.PromoPlacement.HOME_VIDEO_BONUS, null, null);
        }
    }

    private final void startPeriodicPoll() {
        if (this.pollingActive) {
            Job job = this.periodicPollJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.periodicPollJob = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new HomeVideoBonusController$startPeriodicPoll$1(this, null), 3, null);
        }
    }

    private final void scheduleAdPreloadRetry() {
        if (this.pollingActive) {
            Job job = this.adPreloadRetryJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.adPreloadRetryJob = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new HomeVideoBonusController$scheduleAdPreloadRetry$1(this, null), 3, null);
        }
    }

    private final void cancelAdPreloadRetry() {
        Job job = this.adPreloadRetryJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.adPreloadRetryJob = null;
    }

    private final String placementId() {
        String videoPlacement = PromoParams.getVideoPlacement(PromoService.PromoPlacement.HOME_VIDEO_BONUS);
        Intrinsics.checkNotNullExpressionValue(videoPlacement, "getVideoPlacement(...)");
        return videoPlacement;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.concurrent.CancellationException, kotlinx.coroutines.Job] */
    @Override // org.betup.services.offer.VideoRewardService.VideoRewardInfoListener
    public void onVideoRewardInfoUpdated(VideoRewardPlacementInfo info) {
        boolean z;
        VideoOfferAvailabilityPhase videoOfferAvailabilityPhase;
        String str;
        boolean z2;
        ?? r4;
        HomeVideoBonusUiState copy;
        HomeVideoBonusUiState value;
        HomeVideoBonusUiState copy2;
        Long resetsAtEpochMs;
        String str2 = TAG;
        Intrinsics.checkNotNullParameter(info, "info");
        if (this.clientRegistered) {
            boolean z3 = false;
            try {
                z = this.videoRewardService.isRewardedReady(PromoService.PromoPlacement.HOME_VIDEO_BONUS);
            } catch (Exception e) {
                Log.e(TAG, "Error checking rewarded ad availability", e);
                z = false;
            }
            boolean z4 = info.isAvailable() && !info.isQuotaExhausted();
            boolean z5 = info.isQuotaExhausted() || (info.getMaxPerInterval() > 0 && info.getUsedInInterval() >= info.getMaxPerInterval());
            if (z4 && z && !z5) {
                z3 = true;
            }
            if (z5 && (resetsAtEpochMs = info.getResetsAtEpochMs()) != null && resetsAtEpochMs.longValue() > System.currentTimeMillis()) {
                videoOfferAvailabilityPhase = VideoOfferAvailabilityPhase.COOLDOWN;
            } else if (z5) {
                videoOfferAvailabilityPhase = VideoOfferAvailabilityPhase.LIMIT_REACHED;
            } else if (z3) {
                videoOfferAvailabilityPhase = VideoOfferAvailabilityPhase.READY;
            } else if (z4) {
                videoOfferAvailabilityPhase = VideoOfferAvailabilityPhase.CHECKING;
            } else {
                videoOfferAvailabilityPhase = VideoOfferAvailabilityPhase.UNAVAILABLE;
            }
            VideoOfferAvailabilityPhase videoOfferAvailabilityPhase2 = videoOfferAvailabilityPhase;
            Long valueOf = Long.valueOf(info.getPrizeAmount());
            Object obj = null;
            if (valueOf.longValue() <= 0) {
                valueOf = null;
            }
            long longValue = valueOf != null ? valueOf.longValue() : this._uiState.getValue().getDisplayPrizeAmount();
            MutableStateFlow<HomeVideoBonusUiState> mutableStateFlow = this._uiState;
            while (true) {
                HomeVideoBonusUiState value2 = mutableStateFlow.getValue();
                HomeVideoBonusUiState homeVideoBonusUiState = value2;
                boolean z6 = z3;
                str = str2;
                MutableStateFlow<HomeVideoBonusUiState> mutableStateFlow2 = mutableStateFlow;
                z2 = z3;
                r4 = obj;
                copy = homeVideoBonusUiState.copy((r22 & 1) != 0 ? homeVideoBonusUiState.adsActive : z6, (r22 & 2) != 0 ? homeVideoBonusUiState.availabilityPhase : homeVideoBonusUiState.isActionLoading() ? VideoOfferAvailabilityPhase.ACTION_IN_PROGRESS : videoOfferAvailabilityPhase2, (r22 & 4) != 0 ? homeVideoBonusUiState.adsAmount : longValue, (r22 & 8) != 0 ? homeVideoBonusUiState.displayPrizeAmount : longValue, (r22 & 16) != 0 ? homeVideoBonusUiState.usedInInterval : info.getUsedInInterval(), (r22 & 32) != 0 ? homeVideoBonusUiState.maxPerInterval : info.getMaxPerInterval(), (r22 & 64) != 0 ? homeVideoBonusUiState.cooldownEndsAtEpochMs : null, (r22 & 128) != 0 ? homeVideoBonusUiState.isActionLoading : false);
                if (mutableStateFlow2.compareAndSet(value2, copy)) {
                    break;
                }
                obj = r4;
                mutableStateFlow = mutableStateFlow2;
                str2 = str;
                z3 = z2;
            }
            maybeFinishActionLoadingAfterStateRefresh(info, z5);
            if (z5 && info.getResetsAtEpochMs() != null) {
                Job job = this.availabilitySearchTimeoutJob;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) r4, 1, (Object) r4);
                }
                this.availabilitySearchTimeoutJob = r4;
                Long resetsAtEpochMs2 = info.getResetsAtEpochMs();
                Intrinsics.checkNotNullExpressionValue(resetsAtEpochMs2, "getResetsAtEpochMs(...)");
                startCountdown(resetsAtEpochMs2.longValue());
            } else {
                Job job2 = this.countdownJob;
                if (job2 != null) {
                    Job.DefaultImpls.cancel$default(job2, (CancellationException) r4, 1, (Object) r4);
                }
                this.countdownJob = r4;
                MutableStateFlow<HomeVideoBonusUiState> mutableStateFlow3 = this._uiState;
                do {
                    value = mutableStateFlow3.getValue();
                    copy2 = r8.copy((r22 & 1) != 0 ? r8.adsActive : false, (r22 & 2) != 0 ? r8.availabilityPhase : null, (r22 & 4) != 0 ? r8.adsAmount : 0L, (r22 & 8) != 0 ? r8.displayPrizeAmount : 0L, (r22 & 16) != 0 ? r8.usedInInterval : 0, (r22 & 32) != 0 ? r8.maxPerInterval : 0, (r22 & 64) != 0 ? r8.cooldownEndsAtEpochMs : null, (r22 & 128) != 0 ? value.isActionLoading : false);
                } while (!mutableStateFlow3.compareAndSet(value, copy2));
            }
            Log.d(str, "Video reward updated: backendAvailable=" + z4 + ", limitReached=" + z5 + ", used=" + info.getUsedInInterval() + "/" + info.getMaxPerInterval() + ", adSdk=" + z + ", finalAvailable=" + z2 + ", amount=" + info.getPrizeAmount());
            if (this.pollingActive && z4 && !z5 && !this.videoRewardService.isRewardedReady(PromoService.PromoPlacement.HOME_VIDEO_BONUS)) {
                this.videoRewardService.preloadRewarded(PromoService.PromoPlacement.HOME_VIDEO_BONUS);
                scheduleAdPreloadRetry();
                Job job3 = this.availabilitySearchTimeoutJob;
                if (job3 == null || !job3.isActive()) {
                    scheduleAvailabilitySearchTimeout();
                    return;
                }
                return;
            }
            cancelAdPreloadRetry();
            if (z2 || z5 || !z4) {
                Job job4 = this.availabilitySearchTimeoutJob;
                if (job4 != null) {
                    Job.DefaultImpls.cancel$default(job4, (CancellationException) r4, 1, (Object) r4);
                }
                this.availabilitySearchTimeoutJob = r4;
            }
        }
    }

    private final void startCountdown(long resetsAtEpochMs) {
        HomeVideoBonusUiState value;
        HomeVideoBonusUiState copy;
        HomeVideoBonusUiState value2;
        HomeVideoBonusUiState copy2;
        Job job = this.countdownJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        MutableStateFlow<HomeVideoBonusUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            copy = r5.copy((r22 & 1) != 0 ? r5.adsActive : false, (r22 & 2) != 0 ? r5.availabilityPhase : VideoOfferAvailabilityPhase.COOLDOWN, (r22 & 4) != 0 ? r5.adsAmount : 0L, (r22 & 8) != 0 ? r5.displayPrizeAmount : 0L, (r22 & 16) != 0 ? r5.usedInInterval : 0, (r22 & 32) != 0 ? r5.maxPerInterval : 0, (r22 & 64) != 0 ? r5.cooldownEndsAtEpochMs : Long.valueOf(resetsAtEpochMs), (r22 & 128) != 0 ? value.isActionLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        long currentTimeMillis = resetsAtEpochMs - System.currentTimeMillis();
        if (currentTimeMillis > 0) {
            this.countdownJob = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new HomeVideoBonusController$startCountdown$3(currentTimeMillis, this, null), 3, null);
            return;
        }
        beginAvailabilitySearch();
        MutableStateFlow<HomeVideoBonusUiState> mutableStateFlow2 = this._uiState;
        do {
            value2 = mutableStateFlow2.getValue();
            copy2 = r4.copy((r22 & 1) != 0 ? r4.adsActive : false, (r22 & 2) != 0 ? r4.availabilityPhase : null, (r22 & 4) != 0 ? r4.adsAmount : 0L, (r22 & 8) != 0 ? r4.displayPrizeAmount : 0L, (r22 & 16) != 0 ? r4.usedInInterval : 0, (r22 & 32) != 0 ? r4.maxPerInterval : 0, (r22 & 64) != 0 ? r4.cooldownEndsAtEpochMs : null, (r22 & 128) != 0 ? value2.isActionLoading : false);
        } while (!mutableStateFlow2.compareAndSet(value2, copy2));
        performVideoBonusNetworkRefresh(VideoBonusNetworkRefreshPolicy.BYPASS_TRACKED_OVERLAY, true);
    }

    private final void maybeFinishActionLoadingAfterStateRefresh(VideoRewardPlacementInfo info, boolean limitReached) {
        if (!this._uiState.getValue().isActionLoading() || this.videoRewardService.isRewardedVideoSessionActive() || this.videoRewardService.isServerRedeemInFlight()) {
            return;
        }
        if (limitReached || info.isQuotaExhausted() || !info.isAvailable()) {
            endActionLoading();
        }
    }

    @Override // org.betup.services.offer.VideoRewardService.VideoRewardServiceClient
    public void onVideoRewardRequestProcessed(VideoRewardService.RewardedVideoResult result, long amount) {
        if (this.clientRegistered) {
            boolean z = this.homeVideoRewardSessionPending && result == VideoRewardService.RewardedVideoResult.SUCCESS;
            if (result != VideoRewardService.RewardedVideoResult.SUCCESS || !this.homeVideoRewardSessionPending) {
                this.homeVideoRewardSessionPending = false;
            }
            endActionLoading();
            if (result == VideoRewardService.RewardedVideoResult.SUCCESS) {
                if (!z) {
                    Log.d(TAG, "Ignoring home video SUCCESS — no pending home session");
                    refreshAfterVideoWatched();
                    return;
                } else {
                    this.homeVideoRewardSessionPending = false;
                    this.pendingCollectDialogAmount = null;
                    markCollectDialogShown();
                    refreshAfterVideoWatched();
                    return;
                }
            }
            Log.w(TAG, "Video reward request failed: " + result);
            int i = result == null ? -1 : WhenMappings.$EnumSwitchMapping$1[result.ordinal()];
            if (i == 1) {
                emitMessage(R.string.home_video_reward_limit_reached);
            } else if (i == 2) {
                emitMessage(R.string.home_video_reward_redeem_failed);
            } else if (i == 3) {
                markUnavailableAfterNoFill();
            }
            refreshAfterVideoWatched();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitMessage(int messageResId) {
        HomeVideoBonusEvent.ShowMessage showMessage = new HomeVideoBonusEvent.ShowMessage(messageResId);
        if (this._events.tryEmit(showMessage)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new HomeVideoBonusController$emitMessage$1(this, showMessage, null), 3, null);
    }

    private final void markUnavailableAfterNoFill() {
        HomeVideoBonusUiState value;
        HomeVideoBonusUiState copy;
        MutableStateFlow<HomeVideoBonusUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            copy = r2.copy((r22 & 1) != 0 ? r2.adsActive : false, (r22 & 2) != 0 ? r2.availabilityPhase : VideoOfferAvailabilityPhase.CHECKING, (r22 & 4) != 0 ? r2.adsAmount : 0L, (r22 & 8) != 0 ? r2.displayPrizeAmount : 0L, (r22 & 16) != 0 ? r2.usedInInterval : 0, (r22 & 32) != 0 ? r2.maxPerInterval : 0, (r22 & 64) != 0 ? r2.cooldownEndsAtEpochMs : null, (r22 & 128) != 0 ? value.isActionLoading : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        emitMessage(R.string.video_ads_still_checking);
        this.videoRewardService.preloadRewarded(PromoService.PromoPlacement.HOME_VIDEO_BONUS);
        Job job = this.availabilitySearchTimeoutJob;
        if (job == null || !job.isActive()) {
            scheduleAvailabilitySearchTimeout();
        }
        scheduleAdPreloadRetry();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HomeVideoBonusController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lorg/betup/ui/fragment/home/controller/HomeVideoBonusController$VideoBonusNetworkRefreshPolicy;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "RESPECT_TRACKED_OVERLAY", "BYPASS_TRACKED_OVERLAY", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class VideoBonusNetworkRefreshPolicy {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ VideoBonusNetworkRefreshPolicy[] $VALUES;
        public static final VideoBonusNetworkRefreshPolicy RESPECT_TRACKED_OVERLAY = new VideoBonusNetworkRefreshPolicy("RESPECT_TRACKED_OVERLAY", 0);
        public static final VideoBonusNetworkRefreshPolicy BYPASS_TRACKED_OVERLAY = new VideoBonusNetworkRefreshPolicy("BYPASS_TRACKED_OVERLAY", 1);

        private static final /* synthetic */ VideoBonusNetworkRefreshPolicy[] $values() {
            return new VideoBonusNetworkRefreshPolicy[]{RESPECT_TRACKED_OVERLAY, BYPASS_TRACKED_OVERLAY};
        }

        public static EnumEntries<VideoBonusNetworkRefreshPolicy> getEntries() {
            return $ENTRIES;
        }

        private VideoBonusNetworkRefreshPolicy(String str, int i) {
        }

        static {
            VideoBonusNetworkRefreshPolicy[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static VideoBonusNetworkRefreshPolicy valueOf(String str) {
            return (VideoBonusNetworkRefreshPolicy) Enum.valueOf(VideoBonusNetworkRefreshPolicy.class, str);
        }

        public static VideoBonusNetworkRefreshPolicy[] values() {
            return (VideoBonusNetworkRefreshPolicy[]) $VALUES.clone();
        }
    }
}
