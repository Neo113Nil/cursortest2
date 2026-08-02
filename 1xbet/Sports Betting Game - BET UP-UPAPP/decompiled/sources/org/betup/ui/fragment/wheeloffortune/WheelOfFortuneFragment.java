package org.betup.ui.fragment.wheeloffortune;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.BetUpApp;
import org.betup.bus.VideoRewardReceivedMessage;
import org.betup.model.remote.entity.videoRewards.VideoRewardPlacementInfo;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;
import org.betup.ui.fragment.home.controller.HomeVideoBonusController;
import org.betup.ui.fragment.wheeloffortune.controller.WheelOfFortuneRewardController;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: WheelOfFortuneFragment.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0001>B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020%H\u0016J\b\u0010)\u001a\u00020%H\u0016J\b\u0010*\u001a\u00020%H\u0016J\b\u0010,\u001a\u00020%H\u0002J$\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0010\u00103\u001a\u00020%2\u0006\u00104\u001a\u000205H\u0007J\u0018\u00106\u001a\u00020%2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u00020%2\u0006\u0010<\u001a\u00020=H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001d¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006?²\u0006\n\u0010@\u001a\u00020\u001fX\u008a\u008e\u0002²\u0006\n\u0010A\u001a\u00020\u0018X\u008a\u0084\u0002²\u0006\n\u0010 \u001a\u00020\u001fX\u008a\u0084\u0002²\u0006\n\u0010B\u001a\u00020\u001fX\u008a\u0084\u0002"}, d2 = {"Lorg/betup/ui/fragment/wheeloffortune/WheelOfFortuneFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/betup/services/offer/VideoRewardService$VideoRewardServiceClient;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "videoRewardService", "Lorg/betup/services/offer/VideoRewardService;", "getVideoRewardService", "()Lorg/betup/services/offer/VideoRewardService;", "setVideoRewardService", "(Lorg/betup/services/offer/VideoRewardService;)V", "rewardController", "Lorg/betup/ui/fragment/wheeloffortune/controller/WheelOfFortuneRewardController;", "getRewardController", "()Lorg/betup/ui/fragment/wheeloffortune/controller/WheelOfFortuneRewardController;", "setRewardController", "(Lorg/betup/ui/fragment/wheeloffortune/controller/WheelOfFortuneRewardController;)V", "homeVideoBonusController", "Lorg/betup/ui/fragment/home/controller/HomeVideoBonusController;", "getHomeVideoBonusController", "()Lorg/betup/ui/fragment/home/controller/HomeVideoBonusController;", "setHomeVideoBonusController", "(Lorg/betup/ui/fragment/home/controller/HomeVideoBonusController;)V", "currentMultiplier", "", "dailyBonusId", "_baseWinAmount", "Lkotlinx/coroutines/flow/MutableStateFlow;", "baseWinAmount", "Lkotlinx/coroutines/flow/StateFlow;", "_isVideoWatched", "", "isVideoWatched", "()Lkotlinx/coroutines/flow/StateFlow;", "mainHandler", "Landroid/os/Handler;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "onDestroy", "dailyBonusBoostMultiplier", "closeWheelOverlay", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onVideoRewardReceived", "message", "Lorg/betup/bus/VideoRewardReceivedMessage;", "onVideoRewardRequestProcessed", "result", "Lorg/betup/services/offer/VideoRewardService$RewardedVideoResult;", "amount", "", "onVideoRewardInfoUpdated", "info", "Lorg/betup/model/remote/entity/videoRewards/VideoRewardPlacementInfo;", VastTagName.COMPANION, "app_release", "showWinDialog", "winAmount", "isCollectingReward"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WheelOfFortuneFragment extends Fragment implements VideoRewardService.VideoRewardServiceClient {
    private MutableStateFlow<Integer> _baseWinAmount;
    private final MutableStateFlow<Boolean> _isVideoWatched;
    private final StateFlow<Integer> baseWinAmount;
    private int currentMultiplier = 3;
    private int dailyBonusBoostMultiplier;
    private int dailyBonusId;

    @Inject
    public HomeVideoBonusController homeVideoBonusController;
    private final StateFlow<Boolean> isVideoWatched;
    private final Handler mainHandler;

    @Inject
    public WheelOfFortuneRewardController rewardController;

    @Inject
    public VideoRewardService videoRewardService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public WheelOfFortuneFragment() {
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this._baseWinAmount = MutableStateFlow;
        this.baseWinAmount = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(false);
        this._isVideoWatched = MutableStateFlow2;
        this.isVideoWatched = FlowKt.asStateFlow(MutableStateFlow2);
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.dailyBonusBoostMultiplier = 1;
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

    public final WheelOfFortuneRewardController getRewardController() {
        WheelOfFortuneRewardController wheelOfFortuneRewardController = this.rewardController;
        if (wheelOfFortuneRewardController != null) {
            return wheelOfFortuneRewardController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rewardController");
        return null;
    }

    public final void setRewardController(WheelOfFortuneRewardController wheelOfFortuneRewardController) {
        Intrinsics.checkNotNullParameter(wheelOfFortuneRewardController, "<set-?>");
        this.rewardController = wheelOfFortuneRewardController;
    }

    public final HomeVideoBonusController getHomeVideoBonusController() {
        HomeVideoBonusController homeVideoBonusController = this.homeVideoBonusController;
        if (homeVideoBonusController != null) {
            return homeVideoBonusController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("homeVideoBonusController");
        return null;
    }

    public final void setHomeVideoBonusController(HomeVideoBonusController homeVideoBonusController) {
        Intrinsics.checkNotNullParameter(homeVideoBonusController, "<set-?>");
        this.homeVideoBonusController = homeVideoBonusController;
    }

    public final StateFlow<Boolean> isVideoWatched() {
        return this.isVideoWatched;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentActivity activity = getActivity();
        Context applicationContext = activity != null ? activity.getApplicationContext() : null;
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        getVideoRewardService().triggerCaching();
        Log.d("VideoRewardReceivedr", "onCreate - Triggered early video ad caching");
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Log.d("VideoRewardReceivedr", "onStart - Registering EventBus and connecting video service");
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this);
        }
        getHomeVideoBonusController().standDownForExternalVideoReward();
        getVideoRewardService().connectClient(PromoService.PromoPlacement.DAILY_BONUS, null, this);
        Log.d("VideoRewardReceivedr", "Connected to DAILY_BONUS placement");
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Log.d("VideoRewardReceivedr", "onStop - Fragment stopped (video may be playing)");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Log.d("VideoRewardReceivedr", "onDestroy - Cleaning up EventBus and video service");
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
        getVideoRewardService().disconnectClient(PromoService.PromoPlacement.DAILY_BONUS, null);
        WheelOfFortuneSpinSoundEffect.INSTANCE.stop();
        getRewardController().reset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeWheelOverlay() {
        if (isAdded()) {
            getParentFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Bundle arguments = getArguments();
        Integer valueOf = arguments != null ? Integer.valueOf(arguments.getInt("winning_value")) : null;
        Bundle arguments2 = getArguments();
        this.dailyBonusId = arguments2 != null ? arguments2.getInt("daily_bonus_id") : 0;
        Bundle arguments3 = getArguments();
        this.dailyBonusBoostMultiplier = arguments3 != null ? arguments3.getInt("daily_bonus_boost_multiplier", 1) : 1;
        this._baseWinAmount.setValue(Integer.valueOf(valueOf != null ? valueOf.intValue() : 0));
        this._isVideoWatched.setValue(false);
        getRewardController().resetClaimedState(this.dailyBonusId);
        Log.d("VideoRewardReceivedr", "WheelOfFortune initialized - DailyBonusId: " + this.dailyBonusId + ", WinningValue: " + valueOf);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1062495223, true, new WheelOfFortuneFragment$onCreateView$1$1(this, composeView, valueOf)));
        return composeView;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onVideoRewardReceived(VideoRewardReceivedMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d("VideoRewardReceivedr", "Video reward received: " + message.getAmount());
    }

    @Override // org.betup.services.offer.VideoRewardService.VideoRewardServiceClient
    public void onVideoRewardRequestProcessed(VideoRewardService.RewardedVideoResult result, long amount) {
        Intrinsics.checkNotNullParameter(result, "result");
        Log.d("VideoRewardReceivedr", "onVideoRewardRequestProcessed called - Result: " + result + ", Amount: " + amount + ", Thread: " + Thread.currentThread().getName());
        if (result == VideoRewardService.RewardedVideoResult.SUCCESS) {
            this.mainHandler.post(new Runnable() { // from class: org.betup.ui.fragment.wheeloffortune.WheelOfFortuneFragment$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    WheelOfFortuneFragment.onVideoRewardRequestProcessed$lambda$1(WheelOfFortuneFragment.this);
                }
            });
        } else {
            Log.w("VideoRewardReceivedr", "Video reward failed: " + result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onVideoRewardRequestProcessed$lambda$1(WheelOfFortuneFragment wheelOfFortuneFragment) {
        Log.d("VideoRewardReceivedr", "Setting _isVideoWatched to true on main thread, current value: " + wheelOfFortuneFragment._isVideoWatched.getValue());
        if (wheelOfFortuneFragment._isVideoWatched.getValue().booleanValue()) {
            return;
        }
        wheelOfFortuneFragment._isVideoWatched.setValue(true);
        Log.d("VideoRewardReceivedr", "Video watched successfully! _isVideoWatched is now: " + wheelOfFortuneFragment._isVideoWatched.getValue());
    }

    @Override // org.betup.services.offer.VideoRewardService.VideoRewardInfoListener
    public void onVideoRewardInfoUpdated(VideoRewardPlacementInfo info) {
        boolean z;
        Intrinsics.checkNotNullParameter(info, "info");
        boolean z2 = false;
        try {
            z = getVideoRewardService().isRewardedReady(PromoService.PromoPlacement.DAILY_BONUS);
        } catch (Exception e) {
            Log.e("WheelOfFortune", "Error checking rewarded ad availability", e);
            z = false;
        }
        boolean z3 = info.isAvailable() && !info.isQuotaExhausted();
        if (z3 && z) {
            z2 = true;
        }
        Log.d("WheelOfFortune", "Video reward updated: backendAvailable=" + z3 + ", adSdkAvailable=" + z + ", finalAvailable=" + z2 + ", isVideoWatched=" + this._isVideoWatched.getValue() + ", amount=" + info.getPrizeAmount());
        if (z3 && !getVideoRewardService().isRewardedReady(PromoService.PromoPlacement.DAILY_BONUS)) {
            getVideoRewardService().preloadRewarded();
        }
        if (z2 || !this._isVideoWatched.getValue().booleanValue()) {
            return;
        }
        getVideoRewardService().preloadRewarded();
    }

    /* compiled from: WheelOfFortuneFragment.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lorg/betup/ui/fragment/wheeloffortune/WheelOfFortuneFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/fragment/wheeloffortune/WheelOfFortuneFragment;", "dailyBonusId", "", "winningSegmentValue", "dailyBonusBoostMultiplier", "(ILjava/lang/Integer;I)Lorg/betup/ui/fragment/wheeloffortune/WheelOfFortuneFragment;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ WheelOfFortuneFragment newInstance$default(Companion companion, int i, Integer num, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                num = null;
            }
            if ((i3 & 4) != 0) {
                i2 = 1;
            }
            return companion.newInstance(i, num, i2);
        }

        public final WheelOfFortuneFragment newInstance(int dailyBonusId, Integer winningSegmentValue, int dailyBonusBoostMultiplier) {
            WheelOfFortuneFragment wheelOfFortuneFragment = new WheelOfFortuneFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("daily_bonus_id", dailyBonusId);
            if (winningSegmentValue != null) {
                bundle.putInt("winning_value", winningSegmentValue.intValue());
            }
            bundle.putInt("daily_bonus_boost_multiplier", dailyBonusBoostMultiplier);
            wheelOfFortuneFragment.setArguments(bundle);
            return wheelOfFortuneFragment;
        }
    }
}
