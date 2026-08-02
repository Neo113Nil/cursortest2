package org.betup.ui.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ironsource.C3664q2;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.BetUpApp;
import org.betup.bus.OddsDialogVisibilityMessage;
import org.betup.bus.UserProfileUpdatedMessage;
import org.betup.model.remote.entity.videoRewards.VideoRewardPlacementInfo;
import org.betup.services.analytics.AnalyticsHelper;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.user.UserService;
import org.betup.ui.dialogs.webgame.WebGameDialogFragment;
import org.betup.utils.DialogManager;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: NotEnoughBetcoinsVideoOfferDialogFragment.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J$\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010'\u001a\u00020\u001bH\u0016J\b\u0010(\u001a\u00020\u001bH\u0016J\u0010\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.H\u0016J\u001a\u0010/\u001a\u00020\u001b2\b\u00100\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u00020\u0018H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064²\u0006\n\u00102\u001a\u00020\u0018X\u008a\u0084\u0002²\u0006\n\u00105\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\n\u00106\u001a\u00020\u0018X\u008a\u0084\u0002"}, d2 = {"Lorg/betup/ui/dialogs/NotEnoughBetcoinsVideoOfferDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lorg/betup/services/offer/VideoRewardService$VideoRewardServiceClient;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "videoRewardService", "Lorg/betup/services/offer/VideoRewardService;", "getVideoRewardService", "()Lorg/betup/services/offer/VideoRewardService;", "setVideoRewardService", "(Lorg/betup/services/offer/VideoRewardService;)V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "placement", "Lorg/betup/services/offer/PromoService$PromoPlacement;", "navigatingToShop", "", "_isVideoAvailable", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_amount", "", "_oneClickQuickBetStake", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", "onStop", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onVideoRewardInfoUpdated", "info", "Lorg/betup/model/remote/entity/videoRewards/VideoRewardPlacementInfo;", "onVideoRewardRequestProcessed", "result", "Lorg/betup/services/offer/VideoRewardService$RewardedVideoResult;", "amount", VastTagName.COMPANION, "app_release", "isVideoAvailable", "oneClickStake"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NotEnoughBetcoinsVideoOfferDialogFragment extends DialogFragment implements VideoRewardService.VideoRewardServiceClient {
    private static final String ARG_AMOUNT = "amount";
    private static final String ARG_ONE_CLICK_QUICK_BET_STAKE = "one_click_quick_bet_stake";
    public static final String TAG = "NotEnoughBetcoinsVideoOfferDialog";
    private boolean navigatingToShop;

    @Inject
    public UserService userService;

    @Inject
    public VideoRewardService videoRewardService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final PromoService.PromoPlacement placement = PromoService.PromoPlacement.NOT_ENOUGH_BETCOINS;
    private final MutableStateFlow<Boolean> _isVideoAvailable = StateFlowKt.MutableStateFlow(false);
    private final MutableStateFlow<Long> _amount = StateFlowKt.MutableStateFlow(0L);
    private final MutableStateFlow<Long> _oneClickQuickBetStake = StateFlowKt.MutableStateFlow(0L);

    /* compiled from: NotEnoughBetcoinsVideoOfferDialogFragment.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoRewardService.RewardedVideoResult.values().length];
            try {
                iArr[VideoRewardService.RewardedVideoResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    public static final NotEnoughBetcoinsVideoOfferDialogFragment newInstance(long j) {
        return INSTANCE.newInstance(j);
    }

    @JvmStatic
    public static final NotEnoughBetcoinsVideoOfferDialogFragment newInstance(long j, long j2) {
        return INSTANCE.newInstance(j, j2);
    }

    @JvmStatic
    public static final void show(FragmentManager fragmentManager, long j) {
        INSTANCE.show(fragmentManager, j);
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

    public final UserService getUserService() {
        UserService userService = this.userService;
        if (userService != null) {
            return userService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userService");
        return null;
    }

    public final void setUserService(UserService userService) {
        Intrinsics.checkNotNullParameter(userService, "<set-?>");
        this.userService = userService;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this._amount.setValue(Long.valueOf(arguments.getLong("amount", 0L)));
            this._oneClickQuickBetStake.setValue(Long.valueOf(arguments.getLong(ARG_ONE_CLICK_QUICK_BET_STAKE, 0L)));
        }
        getVideoRewardService().connectClient(this.placement, null, this);
        getVideoRewardService().getVideoRewardInfo(this.placement, null, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1213466877, true, new NotEnoughBetcoinsVideoOfferDialogFragment$onCreateView$1$1(this)));
        return composeView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        try {
            int moneyBalance = (int) getUserService().getShortProfile().getUserProgressModel().getMoneyBalance();
            long j = requireContext().getSharedPreferences("analytics", 0).getLong("registration_timestamp", 0L);
            AnalyticsHelper.INSTANCE.logPurchasePromptShown("out_of_coins", moneyBalance, j > 0 ? (int) ((System.currentTimeMillis() - j) / 86400000) : 0);
        } catch (Exception e) {
            Log.e("NotEnoughBetcoins", "Error logging purchase_prompt_shown", e);
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(null);
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.setDimAmount(0.6f);
        }
        EventBus.getDefault().post(new OddsDialogVisibilityMessage(OddsDialogVisibilityMessage.State.VISIBLE));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (this.navigatingToShop) {
            return;
        }
        EventBus.getDefault().post(new OddsDialogVisibilityMessage(OddsDialogVisibilityMessage.State.HIDDEN));
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        getVideoRewardService().disconnectClient(this.placement, null);
        DialogManager.onDialogDismissed(TAG);
    }

    @Override // org.betup.services.offer.VideoRewardService.VideoRewardInfoListener
    public void onVideoRewardInfoUpdated(VideoRewardPlacementInfo info) {
        boolean z;
        Intrinsics.checkNotNullParameter(info, "info");
        boolean z2 = info.isAvailable() && !info.isQuotaExhausted();
        try {
            z = getVideoRewardService().isRewardedReady(this.placement);
        } catch (Exception unused) {
            z = false;
        }
        this._isVideoAvailable.setValue(Boolean.valueOf(z2 && z));
        this._amount.setValue(Long.valueOf(info.getPrizeAmount()));
        if (!z2 || z) {
            return;
        }
        getVideoRewardService().preloadRewarded();
    }

    @Override // org.betup.services.offer.VideoRewardService.VideoRewardServiceClient
    public void onVideoRewardRequestProcessed(VideoRewardService.RewardedVideoResult result, long amount) {
        if (isAdded()) {
            if ((result == null ? -1 : WhenMappings.$EnumSwitchMapping$0[result.ordinal()]) == 1) {
                Fragment parentFragment = getParentFragment();
                WebGameDialogFragment webGameDialogFragment = parentFragment instanceof WebGameDialogFragment ? (WebGameDialogFragment) parentFragment : null;
                if (webGameDialogFragment != null) {
                    webGameDialogFragment.scheduleBalanceSyncFromHost();
                }
                if (requireActivity().isFinishing()) {
                    return;
                }
                dismissAllowingStateLoss();
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: org.betup.ui.dialogs.NotEnoughBetcoinsVideoOfferDialogFragment$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        NotEnoughBetcoinsVideoOfferDialogFragment.onVideoRewardRequestProcessed$lambda$3();
                    }
                }, 800L);
                return;
            }
            dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onVideoRewardRequestProcessed$lambda$3() {
        EventBus.getDefault().post(new UserProfileUpdatedMessage());
    }

    /* compiled from: NotEnoughBetcoinsVideoOfferDialogFragment.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lorg/betup/ui/dialogs/NotEnoughBetcoinsVideoOfferDialogFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "ARG_AMOUNT", "", "ARG_ONE_CLICK_QUICK_BET_STAKE", "TAG", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/dialogs/NotEnoughBetcoinsVideoOfferDialogFragment;", "videoRewardAmount", "", "oneClickQuickBetStakeBetcoins", C3664q2.v, "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "amount", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final NotEnoughBetcoinsVideoOfferDialogFragment newInstance(long j) {
            return newInstance$default(this, j, 0L, 2, null);
        }

        private Companion() {
        }

        public static /* synthetic */ NotEnoughBetcoinsVideoOfferDialogFragment newInstance$default(Companion companion, long j, long j2, int i, Object obj) {
            if ((i & 2) != 0) {
                j2 = 0;
            }
            return companion.newInstance(j, j2);
        }

        @JvmStatic
        public final NotEnoughBetcoinsVideoOfferDialogFragment newInstance(long videoRewardAmount, long oneClickQuickBetStakeBetcoins) {
            NotEnoughBetcoinsVideoOfferDialogFragment notEnoughBetcoinsVideoOfferDialogFragment = new NotEnoughBetcoinsVideoOfferDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("amount", videoRewardAmount);
            bundle.putLong(NotEnoughBetcoinsVideoOfferDialogFragment.ARG_ONE_CLICK_QUICK_BET_STAKE, oneClickQuickBetStakeBetcoins);
            notEnoughBetcoinsVideoOfferDialogFragment.setArguments(bundle);
            return notEnoughBetcoinsVideoOfferDialogFragment;
        }

        @JvmStatic
        public final void show(FragmentManager fragmentManager, long amount) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            newInstance(amount, 0L).show(fragmentManager, NotEnoughBetcoinsVideoOfferDialogFragment.TAG);
        }
    }
}
