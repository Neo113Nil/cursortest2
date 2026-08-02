package org.betup.ui.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleOwnerKt;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.BetUpApp;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.shop.GetBetShareInstallLinkInteractor;
import org.betup.model.remote.api.rest.user.bets.SingleBetInteractor;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.model.remote.entity.videoRewards.VideoRewardPlacementInfo;
import org.betup.services.offer.BetWonCloseInterstitialHelper;
import org.betup.services.offer.PromoInterstitialRulesSync;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.user.UserService;
import org.betup.utils.DialogManager;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: BetListResultDialogFragment.kt */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 o2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u00020\u0005:\u0001oB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020PH\u0016J\u0012\u0010Q\u001a\u00020N2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\u0010\u0010T\u001a\u00020N2\u0006\u0010U\u001a\u00020\u0004H\u0002J\u001e\u0010V\u001a\u00020N2\u0014\u0010W\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010XH\u0016J\u0010\u0010Y\u001a\u00020N2\u0006\u0010Z\u001a\u00020.H\u0002J$\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^2\b\u0010_\u001a\u0004\u0018\u00010`2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\b\u0010a\u001a\u00020NH\u0016J\u0010\u0010b\u001a\u00020N2\u0006\u0010c\u001a\u00020dH\u0016J\b\u0010e\u001a\u00020NH\u0002J\b\u0010f\u001a\u00020NH\u0016J\b\u0010g\u001a\u00020NH\u0002J\u0010\u0010h\u001a\u00020N2\u0006\u0010i\u001a\u00020jH\u0016J\u001a\u0010k\u001a\u00020N2\b\u0010l\u001a\u0004\u0018\u00010m2\u0006\u0010n\u001a\u000200H\u0016R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020302X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020302¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u001a\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030802X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030802¢\u0006\b\n\u0000\u001a\u0004\b:\u00106R\u0014\u0010;\u001a\b\u0012\u0004\u0012\u00020<02X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020<02¢\u0006\b\n\u0000\u001a\u0004\b=\u00106R\u0014\u0010>\u001a\b\u0012\u0004\u0012\u00020<02X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020<0@¢\u0006\b\n\u0000\u001a\u0004\b?\u0010AR\u0014\u0010B\u001a\b\u0012\u0004\u0012\u00020002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010C\u001a\b\u0012\u0004\u0012\u0002000@¢\u0006\b\n\u0000\u001a\u0004\bD\u0010AR\u0010\u0010E\u001a\u0004\u0018\u00010FX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u000200X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010H\u001a\u0004\u0018\u00010IX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u000200X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020<X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020<X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006p²\u0006\u0010\u00109\u001a\b\u0012\u0004\u0012\u00020\u000308X\u008a\u0084\u0002²\u0006\n\u0010=\u001a\u00020<X\u008a\u0084\u0002"}, d2 = {"Lorg/betup/ui/dialogs/BetListResultDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/api/rest/user/bets/models/BetsListModel;", "", "Lorg/betup/services/offer/VideoRewardService$VideoRewardServiceClient;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "singleBetInteractor", "Lorg/betup/model/remote/api/rest/user/bets/SingleBetInteractor;", "getSingleBetInteractor", "()Lorg/betup/model/remote/api/rest/user/bets/SingleBetInteractor;", "setSingleBetInteractor", "(Lorg/betup/model/remote/api/rest/user/bets/SingleBetInteractor;)V", "videoRewardService", "Lorg/betup/services/offer/VideoRewardService;", "getVideoRewardService", "()Lorg/betup/services/offer/VideoRewardService;", "setVideoRewardService", "(Lorg/betup/services/offer/VideoRewardService;)V", "getBetShareInstallLinkInteractor", "Lorg/betup/model/remote/api/rest/shop/GetBetShareInstallLinkInteractor;", "getGetBetShareInstallLinkInteractor", "()Lorg/betup/model/remote/api/rest/shop/GetBetShareInstallLinkInteractor;", "setGetBetShareInstallLinkInteractor", "(Lorg/betup/model/remote/api/rest/shop/GetBetShareInstallLinkInteractor;)V", "promoService", "Lorg/betup/services/offer/PromoService;", "getPromoService", "()Lorg/betup/services/offer/PromoService;", "setPromoService", "(Lorg/betup/services/offer/PromoService;)V", "promoInterstitialRulesSync", "Lorg/betup/services/offer/PromoInterstitialRulesSync;", "getPromoInterstitialRulesSync", "()Lorg/betup/services/offer/PromoInterstitialRulesSync;", "setPromoInterstitialRulesSync", "(Lorg/betup/services/offer/PromoInterstitialRulesSync;)V", "betlistId", "state", "Lorg/betup/model/remote/entity/bets/BetState;", "money", "", "_oddType", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/betup/model/local/entity/OddType;", "oddType", "getOddType", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "_bet", "", "bet", "getBet", "_isLoading", "", "isLoading", "_isVideoRewardAvailable", "isVideoRewardAvailable", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "_videoRewardAmount", "videoRewardAmount", "getVideoRewardAmount", "currentPlacement", "Lorg/betup/services/offer/PromoService$PromoPlacement;", "currentReferencedValue", "videoRewardCheckJob", "Lkotlinx/coroutines/Job;", "VIDEO_REWARD_CHECK_INTERVAL", "betWonCloseInterstitialPosted", "skipBetWonCloseInterstitial", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "fetchBetInfo", "betId", "onFetched", "responseMessage", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "checkVideoRewardAvailability", "betState", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "maybeShowBetWonCloseInterstitial", "onDestroy", "schedulePeriodicVideoRewardCheck", "onVideoRewardInfoUpdated", "info", "Lorg/betup/model/remote/entity/videoRewards/VideoRewardPlacementInfo;", "onVideoRewardRequestProcessed", "result", "Lorg/betup/services/offer/VideoRewardService$RewardedVideoResult;", "amount", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BetListResultDialogFragment extends DialogFragment implements BaseCachedSharedInteractor.OnFetchedListener<BetsListModel, Integer>, VideoRewardService.VideoRewardServiceClient {
    private static final String ARG_BETLIST_ID = "arg_betlist_id";
    private static final String ARG_BET_STATE = "arg_bet_state";
    private static final String ARG_MONEY = "arg_money";
    private static final String TAG = "BetListResultDialog";
    private final long VIDEO_REWARD_CHECK_INTERVAL;
    private final MutableStateFlow<List<BetsListModel>> _bet;
    private final MutableStateFlow<Boolean> _isLoading;
    private final MutableStateFlow<Boolean> _isVideoRewardAvailable;
    private final MutableStateFlow<OddType> _oddType;
    private final MutableStateFlow<Long> _videoRewardAmount;
    private final MutableStateFlow<List<BetsListModel>> bet;
    private boolean betWonCloseInterstitialPosted;
    private int betlistId;
    private PromoService.PromoPlacement currentPlacement;
    private long currentReferencedValue;

    @Inject
    public GetBetShareInstallLinkInteractor getBetShareInstallLinkInteractor;
    private final MutableStateFlow<Boolean> isLoading;
    private final StateFlow<Boolean> isVideoRewardAvailable;
    private long money;
    private final MutableStateFlow<OddType> oddType;

    @Inject
    public PromoInterstitialRulesSync promoInterstitialRulesSync;

    @Inject
    public PromoService promoService;

    @Inject
    public SingleBetInteractor singleBetInteractor;
    private boolean skipBetWonCloseInterstitial;
    private BetState state;

    @Inject
    public UserService userService;
    private final StateFlow<Long> videoRewardAmount;
    private Job videoRewardCheckJob;

    @Inject
    public VideoRewardService videoRewardService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: BetListResultDialogFragment.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[BetState.values().length];
            try {
                iArr[BetState.WON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BetState.LOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BetState.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PromoService.PromoPlacement.values().length];
            try {
                iArr2[PromoService.PromoPlacement.BET_WON.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[VideoRewardService.RewardedVideoResult.values().length];
            try {
                iArr3[VideoRewardService.RewardedVideoResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[VideoRewardService.RewardedVideoResult.NO_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[VideoRewardService.RewardedVideoResult.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[VideoRewardService.RewardedVideoResult.BLOCKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @JvmStatic
    public static final BetListResultDialogFragment newInstance(int i, BetState betState, long j) {
        return INSTANCE.newInstance(i, betState, j);
    }

    public BetListResultDialogFragment() {
        MutableStateFlow<OddType> MutableStateFlow = StateFlowKt.MutableStateFlow(OddType.DECIMAL);
        this._oddType = MutableStateFlow;
        this.oddType = MutableStateFlow;
        MutableStateFlow<List<BetsListModel>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._bet = MutableStateFlow2;
        this.bet = MutableStateFlow2;
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(true);
        this._isLoading = MutableStateFlow3;
        this.isLoading = MutableStateFlow3;
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(false);
        this._isVideoRewardAvailable = MutableStateFlow4;
        this.isVideoRewardAvailable = MutableStateFlow4;
        MutableStateFlow<Long> MutableStateFlow5 = StateFlowKt.MutableStateFlow(0L);
        this._videoRewardAmount = MutableStateFlow5;
        this.videoRewardAmount = MutableStateFlow5;
        this.VIDEO_REWARD_CHECK_INTERVAL = 5000L;
    }

    /* compiled from: BetListResultDialogFragment.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lorg/betup/ui/dialogs/BetListResultDialogFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "ARG_BETLIST_ID", "ARG_BET_STATE", "ARG_MONEY", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/dialogs/BetListResultDialogFragment;", "betlistId", "", "state", "Lorg/betup/model/remote/entity/bets/BetState;", "money", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BetListResultDialogFragment newInstance(int betlistId, BetState state, long money) {
            Intrinsics.checkNotNullParameter(state, "state");
            BetListResultDialogFragment betListResultDialogFragment = new BetListResultDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(BetListResultDialogFragment.ARG_BETLIST_ID, betlistId);
            bundle.putSerializable(BetListResultDialogFragment.ARG_BET_STATE, state);
            bundle.putLong(BetListResultDialogFragment.ARG_MONEY, money);
            betListResultDialogFragment.setArguments(bundle);
            return betListResultDialogFragment;
        }
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

    public final SingleBetInteractor getSingleBetInteractor() {
        SingleBetInteractor singleBetInteractor = this.singleBetInteractor;
        if (singleBetInteractor != null) {
            return singleBetInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("singleBetInteractor");
        return null;
    }

    public final void setSingleBetInteractor(SingleBetInteractor singleBetInteractor) {
        Intrinsics.checkNotNullParameter(singleBetInteractor, "<set-?>");
        this.singleBetInteractor = singleBetInteractor;
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

    public final GetBetShareInstallLinkInteractor getGetBetShareInstallLinkInteractor() {
        GetBetShareInstallLinkInteractor getBetShareInstallLinkInteractor = this.getBetShareInstallLinkInteractor;
        if (getBetShareInstallLinkInteractor != null) {
            return getBetShareInstallLinkInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getBetShareInstallLinkInteractor");
        return null;
    }

    public final void setGetBetShareInstallLinkInteractor(GetBetShareInstallLinkInteractor getBetShareInstallLinkInteractor) {
        Intrinsics.checkNotNullParameter(getBetShareInstallLinkInteractor, "<set-?>");
        this.getBetShareInstallLinkInteractor = getBetShareInstallLinkInteractor;
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

    public final PromoInterstitialRulesSync getPromoInterstitialRulesSync() {
        PromoInterstitialRulesSync promoInterstitialRulesSync = this.promoInterstitialRulesSync;
        if (promoInterstitialRulesSync != null) {
            return promoInterstitialRulesSync;
        }
        Intrinsics.throwUninitializedPropertyAccessException("promoInterstitialRulesSync");
        return null;
    }

    public final void setPromoInterstitialRulesSync(PromoInterstitialRulesSync promoInterstitialRulesSync) {
        Intrinsics.checkNotNullParameter(promoInterstitialRulesSync, "<set-?>");
        this.promoInterstitialRulesSync = promoInterstitialRulesSync;
    }

    public final MutableStateFlow<OddType> getOddType() {
        return this.oddType;
    }

    public final MutableStateFlow<List<BetsListModel>> getBet() {
        return this.bet;
    }

    public final MutableStateFlow<Boolean> isLoading() {
        return this.isLoading;
    }

    public final StateFlow<Boolean> isVideoRewardAvailable() {
        return this.isVideoRewardAvailable;
    }

    public final StateFlow<Long> getVideoRewardAmount() {
        return this.videoRewardAmount;
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
        getPromoInterstitialRulesSync().refreshWhenIdle("bet-details-result", 10000L);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.betlistId = arguments.getInt(ARG_BETLIST_ID);
            Serializable serializable = arguments.getSerializable(ARG_BET_STATE);
            this.state = serializable instanceof BetState ? (BetState) serializable : null;
            this.money = arguments.getLong(ARG_MONEY);
            MutableStateFlow<OddType> mutableStateFlow = this._oddType;
            OddType oddType = getUserService().getOddType();
            Intrinsics.checkNotNullExpressionValue(oddType, "getOddType(...)");
            mutableStateFlow.setValue(oddType);
            fetchBetInfo(this.betlistId);
        }
    }

    private final void fetchBetInfo(int betId) {
        this._isLoading.setValue(true);
        this._bet.setValue(CollectionsKt.emptyList());
        getSingleBetInteractor().load(this, Integer.valueOf(betId));
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
    public void onFetched(FetchedResponseMessage<BetsListModel, Integer> responseMessage) {
        BetsListModel model;
        if (responseMessage != null && (model = responseMessage.getModel()) != null) {
            Integer id = model.getId();
            int i = this.betlistId;
            if (id != null && id.intValue() == i) {
                this._bet.setValue(CollectionsKt.listOf(model));
                BetState state = model.getState();
                Intrinsics.checkNotNullExpressionValue(state, "getState(...)");
                checkVideoRewardAvailability(state);
            }
        }
        this._isLoading.setValue(false);
    }

    private final void checkVideoRewardAvailability(BetState betState) {
        PromoService.PromoPlacement promoPlacement;
        int i = WhenMappings.$EnumSwitchMapping$0[betState.ordinal()];
        if (i == 1) {
            promoPlacement = PromoService.PromoPlacement.BET_WON;
        } else if (i == 2) {
            promoPlacement = PromoService.PromoPlacement.BET_LOST;
        } else if (i == 3) {
            promoPlacement = PromoService.PromoPlacement.BET_PLACED;
        } else {
            this._isVideoRewardAvailable.setValue(false);
            this._videoRewardAmount.setValue(0L);
            return;
        }
        this.currentPlacement = promoPlacement;
        this.currentReferencedValue = WhenMappings.$EnumSwitchMapping$1[promoPlacement.ordinal()] == 1 ? this.money : 0L;
        getVideoRewardService().connectClient(promoPlacement, null, this);
        getVideoRewardService().getVideoRewardInfo(promoPlacement, promoPlacement == PromoService.PromoPlacement.BET_WON ? Long.valueOf(this.money) : null, null);
        schedulePeriodicVideoRewardCheck();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1113929969, true, new BetListResultDialogFragment$onCreateView$1$1(this)));
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
        window.setDimAmount(0.6f);
        window.setFlags(512, 512);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        Job job = this.videoRewardCheckJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.videoRewardCheckJob = null;
        PromoService.PromoPlacement promoPlacement = this.currentPlacement;
        if (promoPlacement != null) {
            getVideoRewardService().disconnectClient(promoPlacement, null);
        }
        String tag = getTag();
        if (tag == null) {
            tag = TAG;
        }
        DialogManager.onDialogDismissed(tag);
        maybeShowBetWonCloseInterstitial();
    }

    private final void maybeShowBetWonCloseInterstitial() {
        if (this.betWonCloseInterstitialPosted || this.promoService == null) {
            return;
        }
        this.betWonCloseInterstitialPosted = true;
        BetWonCloseInterstitialHelper.INSTANCE.maybeShow(getContext(), this.state, getPromoService(), this.skipBetWonCloseInterstitial);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Job job = this.videoRewardCheckJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.videoRewardCheckJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void schedulePeriodicVideoRewardCheck() {
        Job job = this.videoRewardCheckJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        PromoService.PromoPlacement promoPlacement = this.currentPlacement;
        if (promoPlacement != null) {
            this.videoRewardCheckJob = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new BetListResultDialogFragment$schedulePeriodicVideoRewardCheck$1$1(this, promoPlacement, promoPlacement == PromoService.PromoPlacement.BET_WON ? Long.valueOf(this.currentReferencedValue) : null, null), 3, null);
        }
    }

    @Override // org.betup.services.offer.VideoRewardService.VideoRewardInfoListener
    public void onVideoRewardInfoUpdated(VideoRewardPlacementInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        if (!isAdded() || isDetached()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), null, new BetListResultDialogFragment$onVideoRewardInfoUpdated$1(this, info, null), 2, null);
    }

    @Override // org.betup.services.offer.VideoRewardService.VideoRewardServiceClient
    public void onVideoRewardRequestProcessed(VideoRewardService.RewardedVideoResult result, long amount) {
        if (!isAdded() || isDetached()) {
            return;
        }
        int i = result == null ? -1 : WhenMappings.$EnumSwitchMapping$2[result.ordinal()];
        if (i == -1) {
            this._isVideoRewardAvailable.setValue(false);
            return;
        }
        if (i == 1) {
            this.skipBetWonCloseInterstitial = true;
            this._isVideoRewardAvailable.setValue(false);
            if (this.currentPlacement != null) {
                getVideoRewardService().triggerCaching();
                schedulePeriodicVideoRewardCheck();
                return;
            }
            return;
        }
        if (i != 2 && i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        this._isVideoRewardAvailable.setValue(false);
        Log.e(TAG, "Video reward failed: " + result);
        if (this.currentPlacement != null) {
            getVideoRewardService().triggerCaching();
            schedulePeriodicVideoRewardCheck();
        }
    }
}
