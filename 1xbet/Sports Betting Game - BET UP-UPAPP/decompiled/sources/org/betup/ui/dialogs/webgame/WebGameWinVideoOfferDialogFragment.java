package org.betup.ui.dialogs.webgame;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.BetUpApp;
import org.betup.games.webgame.WebGameWinVideoConfig;
import org.betup.model.remote.entity.videoRewards.VideoRewardPlacementInfo;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;
import org.betup.utils.DialogManager;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: WebGameWinVideoOfferDialogFragment.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010 \u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J$\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010)\u001a\u00020\u001dH\u0016J\u0010\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020/H\u0016J\u001a\u00100\u001a\u00020\u001d2\b\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u00020\u0014H\u0016J\b\u00104\u001a\u00020\u001dH\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066²\u0006\n\u00107\u001a\u00020\u0017X\u008a\u0084\u0002²\u0006\n\u00108\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\n\u00109\u001a\u00020\u0014X\u008a\u0084\u0002"}, d2 = {"Lorg/betup/ui/dialogs/webgame/WebGameWinVideoOfferDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lorg/betup/services/offer/VideoRewardService$VideoRewardServiceClient;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "videoRewardService", "Lorg/betup/services/offer/VideoRewardService;", "getVideoRewardService", "()Lorg/betup/services/offer/VideoRewardService;", "setVideoRewardService", "(Lorg/betup/services/offer/VideoRewardService;)V", "promoService", "Lorg/betup/services/offer/PromoService;", "getPromoService", "()Lorg/betup/services/offer/PromoService;", "setPromoService", "(Lorg/betup/services/offer/PromoService;)V", "placement", "Lorg/betup/services/offer/PromoService$PromoPlacement;", "referencedValue", "", "_isVideoAvailable", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_videoRewardAmount", "_winAmount", "videoRewardCheckJob", "Lkotlinx/coroutines/Job;", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onVideoRewardInfoUpdated", "info", "Lorg/betup/model/remote/entity/videoRewards/VideoRewardPlacementInfo;", "onVideoRewardRequestProcessed", "result", "Lorg/betup/services/offer/VideoRewardService$RewardedVideoResult;", "amount", "schedulePeriodicVideoRewardCheck", VastTagName.COMPANION, "app_release", "isVideoAvailable", "videoRewardAmount", "winAmount"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebGameWinVideoOfferDialogFragment extends DialogFragment implements VideoRewardService.VideoRewardServiceClient {
    private static final String ARG_WIN_AMOUNT = "arg_win_amount";
    public static final String TAG = "WebGameWinVideoOfferDialog";
    private static final long VIDEO_REWARD_CHECK_INTERVAL_MS = 5000;

    @Inject
    public PromoService promoService;
    private Job videoRewardCheckJob;

    @Inject
    public VideoRewardService videoRewardService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final PromoService.PromoPlacement placement = PromoService.PromoPlacement.VIDEO_FLASH_ROULETTE;
    private final long referencedValue = WebGameWinVideoConfig.INSTANCE.apiReferencedValue();
    private final MutableStateFlow<Boolean> _isVideoAvailable = StateFlowKt.MutableStateFlow(false);
    private final MutableStateFlow<Long> _videoRewardAmount = StateFlowKt.MutableStateFlow(0L);
    private final MutableStateFlow<Long> _winAmount = StateFlowKt.MutableStateFlow(0L);

    /* compiled from: WebGameWinVideoOfferDialogFragment.kt */
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

    public final PromoService getPromoService() {
        PromoService promoService = this.promoService;
        if (promoService != null) {
            return promoService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("promoService");
        return null;
    }

    public final void setPromoService(PromoService promoService) {
        Intrinsics.checkNotNullParameter(promoService, "<set-?>");
        this.promoService = promoService;
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
        MutableStateFlow<Long> mutableStateFlow = this._winAmount;
        Bundle arguments = getArguments();
        mutableStateFlow.setValue(Long.valueOf(arguments != null ? arguments.getLong(ARG_WIN_AMOUNT, 0L) : 0L));
        if (!getPromoService().isUserPromoEnabled()) {
            dismissAllowingStateLoss();
        } else {
            getVideoRewardService().connectClient(this.placement, null, this);
            getVideoRewardService().getVideoRewardInfo(this.placement, Long.valueOf(this.referencedValue), null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(505433249, true, new WebGameWinVideoOfferDialogFragment$onCreateView$1$1(this)));
        return composeView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -2);
        window.setBackgroundDrawable(null);
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.setDimAmount(0.65f);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Job job = this.videoRewardCheckJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.videoRewardCheckJob = null;
        getVideoRewardService().disconnectClient(this.placement, null);
        DialogManager.onDialogDismissed(TAG);
        super.onDismiss(dialog);
    }

    @Override // org.betup.services.offer.VideoRewardService.VideoRewardInfoListener
    public void onVideoRewardInfoUpdated(VideoRewardPlacementInfo info) {
        boolean z;
        Intrinsics.checkNotNullParameter(info, "info");
        if (isAdded()) {
            boolean z2 = false;
            boolean z3 = info.isAvailable() && !info.isQuotaExhausted();
            try {
                z = getVideoRewardService().isRewardedReady(this.placement);
            } catch (Exception unused) {
                z = false;
            }
            if (z3 && z) {
                z2 = true;
            }
            this._isVideoAvailable.setValue(Boolean.valueOf(z2));
            this._videoRewardAmount.setValue(Long.valueOf(info.getPrizeAmount()));
            if (z3 && !z) {
                getVideoRewardService().preloadRewarded();
            }
            if (!z2) {
                schedulePeriodicVideoRewardCheck();
                return;
            }
            Job job = this.videoRewardCheckJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.videoRewardCheckJob = null;
        }
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
                dismissAllowingStateLoss();
                return;
            }
            this._isVideoAvailable.setValue(false);
            getVideoRewardService().triggerCaching();
            schedulePeriodicVideoRewardCheck();
        }
    }

    private final void schedulePeriodicVideoRewardCheck() {
        Job job = this.videoRewardCheckJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.videoRewardCheckJob = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new WebGameWinVideoOfferDialogFragment$schedulePeriodicVideoRewardCheck$1(this, null), 3, null);
    }

    /* compiled from: WebGameWinVideoOfferDialogFragment.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lorg/betup/ui/dialogs/webgame/WebGameWinVideoOfferDialogFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "ARG_WIN_AMOUNT", "VIDEO_REWARD_CHECK_INTERVAL_MS", "", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/dialogs/webgame/WebGameWinVideoOfferDialogFragment;", "wonProfitAmount", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final WebGameWinVideoOfferDialogFragment newInstance(long wonProfitAmount) {
            WebGameWinVideoOfferDialogFragment webGameWinVideoOfferDialogFragment = new WebGameWinVideoOfferDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putLong(WebGameWinVideoOfferDialogFragment.ARG_WIN_AMOUNT, RangesKt.coerceAtLeast(wonProfitAmount, 0L));
            webGameWinVideoOfferDialogFragment.setArguments(bundle);
            return webGameWinVideoOfferDialogFragment;
        }
    }
}
