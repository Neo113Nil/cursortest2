package org.betup.games;

import android.animation.ObjectAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import butterknife.ButterKnife;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.X3;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.InetStateMessage;
import org.betup.bus.NavigateMessage;
import org.betup.bus.OfferMessage;
import org.betup.bus.ServerDownMessage;
import org.betup.bus.ShowNotEnoughBetcoinsVideoOfferMessage;
import org.betup.databinding.ActivityMainMiniGameBinding;
import org.betup.interstitial.InterstitialAdCoordinator;
import org.betup.model.remote.entity.videoRewards.VideoRewardPlacementInfo;
import org.betup.services.NetworkReceiver;
import org.betup.services.ads.AdUnitRegistry;
import org.betup.services.ads.interstitial.InterstitialAdController;
import org.betup.services.analytics.AnalyticsHelper;
import org.betup.services.down.ServerErrorsProcessor;
import org.betup.services.experiments.ABTestService;
import org.betup.services.menu.BottomMenuProvider;
import org.betup.services.menu.StubBarsController;
import org.betup.services.navigate.NavigationService;
import org.betup.services.offer.DefaultOfferService;
import org.betup.services.offer.OfferService;
import org.betup.services.offer.PromoInterstitialRulesSync;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.user.UserService;
import org.betup.ui.BackPressedController;
import org.betup.ui.MainActivity;
import org.betup.ui.MenuBarsController;
import org.betup.ui.ProgressDisplay;
import org.betup.ui.TabMenuItem;
import org.betup.ui.TransactionController;
import org.betup.ui.base.BaseActivity;
import org.betup.ui.common.balance.BalanceDisplay;
import org.betup.ui.dialogs.NotEnoughBetcoinsVideoOfferDialogFragment;
import org.betup.utils.DialogManager;
import org.betup.utils.SnackbarHelper;
import org.betup.utils.balance.BalanceHolder;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MiniGameActivity.kt */
@Metadata(d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010Y\u001a\u00020Z2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0014J\b\u0010]\u001a\u00020ZH\u0002J\b\u0010^\u001a\u00020ZH\u0016J\b\u0010_\u001a\u00020ZH\u0016J\b\u0010`\u001a\u00020ZH\u0016J\b\u0010a\u001a\u00020ZH\u0002J\u0012\u0010b\u001a\u00020Z2\b\u0010c\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010d\u001a\u00020ZH\u0016J\b\u0010e\u001a\u00020ZH\u0016J\b\u0010f\u001a\u00020ZH\u0016J\b\u0010g\u001a\u00020ZH\u0016J\b\u0010h\u001a\u00020ZH\u0014J\b\u0010i\u001a\u00020ZH\u0016J\u0010\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020mH\u0016J\u0010\u0010n\u001a\u00020Z2\u0006\u0010o\u001a\u00020pH\u0007J\u0010\u0010q\u001a\u00020Z2\u0006\u0010r\u001a\u00020sH\u0007J\u0014\u0010t\u001a\u00020Z2\n\u0010u\u001a\u0006\u0012\u0002\b\u00030vH\u0007J\b\u0010w\u001a\u00020ZH\u0014J\u0010\u0010x\u001a\u00020Z2\u0006\u0010o\u001a\u00020yH\u0007J\u001a\u0010z\u001a\u00020Z2\u0006\u0010{\u001a\u00020k2\b\b\u0002\u0010|\u001a\u00020}H\u0002J\u0013\u0010~\u001a\u00020Z2\t\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001H\u0007J\u0015\u0010\u0081\u0001\u001a\r \u0083\u0001*\u0005\u0018\u00010\u0082\u00010\u0082\u0001H\u0096\u0001J\n\u0010\u0084\u0001\u001a\u00020kH\u0096\u0001J\n\u0010\u0085\u0001\u001a\u00020ZH\u0096\u0001J2\u0010\u0086\u0001\u001a\u00020Z2\u0012\u0010\u0087\u0001\u001a\r \u0083\u0001*\u0005\u0018\u00010\u0088\u00010\u0088\u00012\u0012\u0010\u0089\u0001\u001a\r \u0083\u0001*\u0005\u0018\u00010\u008a\u00010\u008a\u0001H\u0096\u0001J\u001e\u0010\u008b\u0001\u001a\u00020Z2\u0012\u0010\u008c\u0001\u001a\r \u0083\u0001*\u0005\u0018\u00010\u0082\u00010\u0082\u0001H\u0096\u0001J\u001e\u0010\u008d\u0001\u001a\u00020Z2\u0012\u0010\u008e\u0001\u001a\r \u0083\u0001*\u0005\u0018\u00010\u008f\u00010\u008f\u0001H\u0096\u0001R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010/\u001a\u0002008\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u00105\u001a\u0002068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001e\u0010;\u001a\u00020<8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001e\u0010A\u001a\u00020B8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001e\u0010G\u001a\u00020H8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001e\u0010M\u001a\u00020N8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001e\u0010S\u001a\u00020T8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010X¨\u0006\u0090\u0001"}, d2 = {"Lorg/betup/games/MiniGameActivity;", "Lorg/betup/ui/base/BaseActivity;", "Lorg/betup/ui/BackPressedController;", "Lorg/betup/ui/TransactionController;", "Lorg/betup/ui/ProgressDisplay;", "Lorg/betup/ui/MenuBarsController;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "balanceDisplay", "Lorg/betup/ui/common/balance/BalanceDisplay;", "networkReceiver", "Landroid/content/BroadcastReceiver;", "backPressedListener", "Lorg/betup/ui/BackPressedController$BackPressedListener;", "offerService", "Lorg/betup/services/offer/OfferService;", "binding", "Lorg/betup/databinding/ActivityMainMiniGameBinding;", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "gamesNavigationService", "Lorg/betup/services/navigate/NavigationService;", "Lorg/betup/bus/NavigateMessage$TargetGame;", "getGamesNavigationService", "()Lorg/betup/services/navigate/NavigationService;", "setGamesNavigationService", "(Lorg/betup/services/navigate/NavigationService;)V", "navigationService", "Lorg/betup/bus/NavigateMessage$Target;", "getNavigationService", "setNavigationService", "promoService", "Lorg/betup/services/offer/PromoService;", "getPromoService", "()Lorg/betup/services/offer/PromoService;", "setPromoService", "(Lorg/betup/services/offer/PromoService;)V", "serverErrorsProcessor", "Lorg/betup/services/down/ServerErrorsProcessor;", "getServerErrorsProcessor", "()Lorg/betup/services/down/ServerErrorsProcessor;", "setServerErrorsProcessor", "(Lorg/betup/services/down/ServerErrorsProcessor;)V", "abTestService", "Lorg/betup/services/experiments/ABTestService;", "getAbTestService", "()Lorg/betup/services/experiments/ABTestService;", "setAbTestService", "(Lorg/betup/services/experiments/ABTestService;)V", "interstitialAdController", "Lorg/betup/services/ads/interstitial/InterstitialAdController;", "getInterstitialAdController", "()Lorg/betup/services/ads/interstitial/InterstitialAdController;", "setInterstitialAdController", "(Lorg/betup/services/ads/interstitial/InterstitialAdController;)V", "adUnitRegistry", "Lorg/betup/services/ads/AdUnitRegistry;", "getAdUnitRegistry", "()Lorg/betup/services/ads/AdUnitRegistry;", "setAdUnitRegistry", "(Lorg/betup/services/ads/AdUnitRegistry;)V", "balanceHolder", "Lorg/betup/utils/balance/BalanceHolder;", "getBalanceHolder", "()Lorg/betup/utils/balance/BalanceHolder;", "setBalanceHolder", "(Lorg/betup/utils/balance/BalanceHolder;)V", "videoRewardService", "Lorg/betup/services/offer/VideoRewardService;", "getVideoRewardService", "()Lorg/betup/services/offer/VideoRewardService;", "setVideoRewardService", "(Lorg/betup/services/offer/VideoRewardService;)V", "interstitialAdCoordinator", "Lorg/betup/interstitial/InterstitialAdCoordinator;", "getInterstitialAdCoordinator", "()Lorg/betup/interstitial/InterstitialAdCoordinator;", "setInterstitialAdCoordinator", "(Lorg/betup/interstitial/InterstitialAdCoordinator;)V", "promoInterstitialRulesSync", "Lorg/betup/services/offer/PromoInterstitialRulesSync;", "getPromoInterstitialRulesSync", "()Lorg/betup/services/offer/PromoInterstitialRulesSync;", "setPromoInterstitialRulesSync", "(Lorg/betup/services/offer/PromoInterstitialRulesSync;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initActivity", "displayProgress", "hideProgress", "newInStack", "openMenu", "setOnBackPressedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeListener", "pressBack", "onBackPressed", X3.i.u0, X3.i.t0, "onStop", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "checkInetState", "message", "Lorg/betup/bus/InetStateMessage;", "processServerDownMessage", "serverDownMessage", "Lorg/betup/bus/ServerDownMessage;", "processNavigationGames", "gameNavigateMessage", "Lorg/betup/bus/NavigateMessage;", "onDestroy", "handleShowNotEnoughBetcoinsVideoOffer", "Lorg/betup/bus/ShowNotEnoughBetcoinsVideoOfferMessage;", "checkVideoAndShowNotEnoughBetcoinsOffer", "showToastIfUnavailable", "oneClickQuickBetStakeBetcoins", "", "processOfferAction", "offerMessage", "Lorg/betup/bus/OfferMessage;", "getCurrent", "Lorg/betup/ui/TabMenuItem;", "kotlin.jvm.PlatformType", "isReady", "restorePrevious", "setBottomMenu", "sender", "", "bottomMenuProvider", "Lorg/betup/services/menu/BottomMenuProvider;", "updateTabMenu", "tabMenuItem", "updateTitle", "title", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MiniGameActivity extends BaseActivity implements BackPressedController, TransactionController, ProgressDisplay, MenuBarsController {
    public static final int $stable = 8;
    private final /* synthetic */ StubBarsController $$delegate_0 = new StubBarsController();

    @Inject
    public ABTestService abTestService;

    @Inject
    public AdUnitRegistry adUnitRegistry;
    private BackPressedController.BackPressedListener backPressedListener;
    private BalanceDisplay balanceDisplay;

    @Inject
    public BalanceHolder balanceHolder;
    private ActivityMainMiniGameBinding binding;

    @Inject
    public NavigationService<NavigateMessage.TargetGame> gamesNavigationService;

    @Inject
    public InterstitialAdController interstitialAdController;

    @Inject
    public InterstitialAdCoordinator interstitialAdCoordinator;

    @Inject
    public NavigationService<NavigateMessage.Target> navigationService;
    private BroadcastReceiver networkReceiver;
    private OfferService offerService;

    @Inject
    public PromoInterstitialRulesSync promoInterstitialRulesSync;

    @Inject
    public PromoService promoService;

    @Inject
    public ServerErrorsProcessor serverErrorsProcessor;

    @Inject
    public UserService userService;

    @Inject
    public VideoRewardService videoRewardService;

    @Override // org.betup.ui.MenuBarsController
    public TabMenuItem getCurrent() {
        return this.$$delegate_0.getCurrent();
    }

    @Override // org.betup.ui.MenuBarsController
    public boolean isReady() {
        return this.$$delegate_0.isReady();
    }

    @Override // org.betup.ui.TransactionController
    public void newInStack() {
    }

    @Override // org.betup.ui.MenuBarsController
    public void restorePrevious() {
        this.$$delegate_0.restorePrevious();
    }

    @Override // org.betup.ui.MenuBarsController
    public void setBottomMenu(Object sender, BottomMenuProvider bottomMenuProvider) {
        this.$$delegate_0.setBottomMenu(sender, bottomMenuProvider);
    }

    @Override // org.betup.ui.MenuBarsController
    public void updateTabMenu(TabMenuItem tabMenuItem) {
        this.$$delegate_0.updateTabMenu(tabMenuItem);
    }

    @Override // org.betup.ui.MenuBarsController
    public void updateTitle(String title) {
        this.$$delegate_0.updateTitle(title);
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

    public final NavigationService<NavigateMessage.TargetGame> getGamesNavigationService() {
        NavigationService<NavigateMessage.TargetGame> navigationService = this.gamesNavigationService;
        if (navigationService != null) {
            return navigationService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gamesNavigationService");
        return null;
    }

    public final void setGamesNavigationService(NavigationService<NavigateMessage.TargetGame> navigationService) {
        Intrinsics.checkNotNullParameter(navigationService, "<set-?>");
        this.gamesNavigationService = navigationService;
    }

    public final NavigationService<NavigateMessage.Target> getNavigationService() {
        NavigationService<NavigateMessage.Target> navigationService = this.navigationService;
        if (navigationService != null) {
            return navigationService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigationService");
        return null;
    }

    public final void setNavigationService(NavigationService<NavigateMessage.Target> navigationService) {
        Intrinsics.checkNotNullParameter(navigationService, "<set-?>");
        this.navigationService = navigationService;
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

    public final ServerErrorsProcessor getServerErrorsProcessor() {
        ServerErrorsProcessor serverErrorsProcessor = this.serverErrorsProcessor;
        if (serverErrorsProcessor != null) {
            return serverErrorsProcessor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("serverErrorsProcessor");
        return null;
    }

    public final void setServerErrorsProcessor(ServerErrorsProcessor serverErrorsProcessor) {
        Intrinsics.checkNotNullParameter(serverErrorsProcessor, "<set-?>");
        this.serverErrorsProcessor = serverErrorsProcessor;
    }

    public final ABTestService getAbTestService() {
        ABTestService aBTestService = this.abTestService;
        if (aBTestService != null) {
            return aBTestService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("abTestService");
        return null;
    }

    public final void setAbTestService(ABTestService aBTestService) {
        Intrinsics.checkNotNullParameter(aBTestService, "<set-?>");
        this.abTestService = aBTestService;
    }

    public final InterstitialAdController getInterstitialAdController() {
        InterstitialAdController interstitialAdController = this.interstitialAdController;
        if (interstitialAdController != null) {
            return interstitialAdController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("interstitialAdController");
        return null;
    }

    public final void setInterstitialAdController(InterstitialAdController interstitialAdController) {
        Intrinsics.checkNotNullParameter(interstitialAdController, "<set-?>");
        this.interstitialAdController = interstitialAdController;
    }

    public final AdUnitRegistry getAdUnitRegistry() {
        AdUnitRegistry adUnitRegistry = this.adUnitRegistry;
        if (adUnitRegistry != null) {
            return adUnitRegistry;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adUnitRegistry");
        return null;
    }

    public final void setAdUnitRegistry(AdUnitRegistry adUnitRegistry) {
        Intrinsics.checkNotNullParameter(adUnitRegistry, "<set-?>");
        this.adUnitRegistry = adUnitRegistry;
    }

    public final BalanceHolder getBalanceHolder() {
        BalanceHolder balanceHolder = this.balanceHolder;
        if (balanceHolder != null) {
            return balanceHolder;
        }
        Intrinsics.throwUninitializedPropertyAccessException("balanceHolder");
        return null;
    }

    public final void setBalanceHolder(BalanceHolder balanceHolder) {
        Intrinsics.checkNotNullParameter(balanceHolder, "<set-?>");
        this.balanceHolder = balanceHolder;
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

    public final InterstitialAdCoordinator getInterstitialAdCoordinator() {
        InterstitialAdCoordinator interstitialAdCoordinator = this.interstitialAdCoordinator;
        if (interstitialAdCoordinator != null) {
            return interstitialAdCoordinator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("interstitialAdCoordinator");
        return null;
    }

    public final void setInterstitialAdCoordinator(InterstitialAdCoordinator interstitialAdCoordinator) {
        Intrinsics.checkNotNullParameter(interstitialAdCoordinator, "<set-?>");
        this.interstitialAdCoordinator = interstitialAdCoordinator;
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

    @Override // org.betup.ui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainMiniGameBinding inflate = ActivityMainMiniGameBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        ConstraintLayout root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        setContentView(root);
        ButterKnife.bind(this);
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        EventBus.getDefault().register(this);
        initActivity();
        if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
            openMenu();
        }
    }

    private final void initActivity() {
        ActivityMainMiniGameBinding activityMainMiniGameBinding = null;
        BalanceDisplay balanceDisplay = new BalanceDisplay(getUserService(), getAbTestService(), null, getBalanceHolder());
        this.balanceDisplay = balanceDisplay;
        ActivityMainMiniGameBinding activityMainMiniGameBinding2 = this.binding;
        if (activityMainMiniGameBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityMainMiniGameBinding = activityMainMiniGameBinding2;
        }
        balanceDisplay.setView(activityMainMiniGameBinding.toolbarContainer.getRoot(), this);
        this.offerService = new DefaultOfferService(this, this, getUserService(), getPromoService(), getAbTestService(), getInterstitialAdController(), getAdUnitRegistry());
        getInterstitialAdCoordinator().bind(this);
    }

    @Override // org.betup.ui.ProgressDisplay
    public void displayProgress() {
        ActivityMainMiniGameBinding activityMainMiniGameBinding = this.binding;
        if (activityMainMiniGameBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainMiniGameBinding = null;
        }
        activityMainMiniGameBinding.progress.setVisibility(0);
    }

    @Override // org.betup.ui.ProgressDisplay
    public void hideProgress() {
        ActivityMainMiniGameBinding activityMainMiniGameBinding = this.binding;
        if (activityMainMiniGameBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainMiniGameBinding = null;
        }
        activityMainMiniGameBinding.progress.setVisibility(8);
    }

    private final void openMenu() {
        getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.container, GamesListFragment.INSTANCE.getInstance()).commitAllowingStateLoss();
    }

    @Override // org.betup.ui.BackPressedController
    public void setOnBackPressedListener(BackPressedController.BackPressedListener listener) {
        this.backPressedListener = listener;
    }

    @Override // org.betup.ui.BackPressedController
    public void removeListener() {
        this.backPressedListener = null;
    }

    @Override // org.betup.ui.BackPressedController
    public void pressBack() {
        if (!(getSupportFragmentManager().findFragmentById(R.id.container) instanceof GamesListFragment) && getSupportFragmentManager().getBackStackEntryCount() > 0) {
            getSupportFragmentManager().popBackStack((String) null, 1);
            getSupportFragmentManager().executePendingTransactions();
            openMenu();
        } else if (getUserService().isRegistered()) {
            startActivity(new Intent(getBaseContext(), (Class<?>) MainActivity.class));
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        BackPressedController.BackPressedListener backPressedListener = this.backPressedListener;
        if (backPressedListener == null) {
            pressBack();
        } else if (backPressedListener.onBackPressed()) {
            pressBack();
        }
    }

    @Override // org.betup.ui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getPromoInterstitialRulesSync().refreshWhenIdle("minigames", 10000L);
        getVideoRewardService().attach(this, this);
        OfferService offerService = this.offerService;
        if (offerService != null) {
            offerService.onResume();
        }
        BalanceDisplay balanceDisplay = this.balanceDisplay;
        if (balanceDisplay != null) {
            balanceDisplay.onResume();
        }
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        NetworkReceiver networkReceiver = new NetworkReceiver();
        this.networkReceiver = networkReceiver;
        registerReceiver(networkReceiver, intentFilter);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        getVideoRewardService().detach(this);
        OfferService offerService = this.offerService;
        if (offerService != null) {
            offerService.onPause();
        }
        BalanceDisplay balanceDisplay = this.balanceDisplay;
        if (balanceDisplay != null) {
            balanceDisplay.onPause();
        }
        try {
            unregisterReceiver(this.networkReceiver);
        } catch (IllegalArgumentException unused) {
            Log.d("NETWORK", "NETWORK STATE RECEIVER was not registered");
        }
    }

    @Override // org.betup.ui.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        OfferService offerService = this.offerService;
        if (offerService != null) {
            offerService.onStop();
        }
        BalanceDisplay balanceDisplay = this.balanceDisplay;
        if (balanceDisplay != null) {
            balanceDisplay.onStop();
        }
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
        new IntentFilter().addAction("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (getCurrentFocus() != null) {
            Object systemService = getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            View currentFocus = getCurrentFocus();
            inputMethodManager.hideSoftInputFromWindow(currentFocus != null ? currentFocus.getWindowToken() : null, 0);
        }
        return super.dispatchTouchEvent(ev);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void checkInetState(InetStateMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ActivityMainMiniGameBinding activityMainMiniGameBinding = null;
        if (!message.isConnected()) {
            ActivityMainMiniGameBinding activityMainMiniGameBinding2 = this.binding;
            if (activityMainMiniGameBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityMainMiniGameBinding2 = null;
            }
            if (activityMainMiniGameBinding2.inetError.getVisibility() == 0) {
                return;
            }
            ActivityMainMiniGameBinding activityMainMiniGameBinding3 = this.binding;
            if (activityMainMiniGameBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityMainMiniGameBinding3 = null;
            }
            activityMainMiniGameBinding3.inetError.setVisibility(0);
            ActivityMainMiniGameBinding activityMainMiniGameBinding4 = this.binding;
            if (activityMainMiniGameBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                activityMainMiniGameBinding = activityMainMiniGameBinding4;
            }
            ObjectAnimator.ofFloat(activityMainMiniGameBinding.inetError, "alpha", 0.0f, 1.0f).setDuration(500L).start();
            return;
        }
        ActivityMainMiniGameBinding activityMainMiniGameBinding5 = this.binding;
        if (activityMainMiniGameBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityMainMiniGameBinding = activityMainMiniGameBinding5;
        }
        activityMainMiniGameBinding.inetError.setVisibility(8);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void processServerDownMessage(ServerDownMessage serverDownMessage) {
        Intrinsics.checkNotNullParameter(serverDownMessage, "serverDownMessage");
        getServerErrorsProcessor().processMessage(this, serverDownMessage);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void processNavigationGames(NavigateMessage<?> gameNavigateMessage) {
        Intrinsics.checkNotNullParameter(gameNavigateMessage, "gameNavigateMessage");
        Object target = gameNavigateMessage.getTarget();
        if (target instanceof NavigateMessage.TargetGame) {
            getGamesNavigationService().processNavigation(this, new NavigateMessage<>(target, gameNavigateMessage.getBundle()));
        } else if (target instanceof NavigateMessage.Target) {
            getNavigationService().processNavigation(this, new NavigateMessage<>(target, gameNavigateMessage.getBundle()));
        } else {
            Log.w("MiniGameActivity", "Unsupported navigation target from mini games: " + target);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        getVideoRewardService().detach(this);
        getInterstitialAdCoordinator().unbind();
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void handleShowNotEnoughBetcoinsVideoOffer(ShowNotEnoughBetcoinsVideoOfferMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        AnalyticsHelper.INSTANCE.logNotEnoughMoney("not_enough_betcoins_video_offer");
        checkVideoAndShowNotEnoughBetcoinsOffer(true, message.getOneClickQuickBetStakeBetcoins());
    }

    static /* synthetic */ void checkVideoAndShowNotEnoughBetcoinsOffer$default(MiniGameActivity miniGameActivity, boolean z, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        miniGameActivity.checkVideoAndShowNotEnoughBetcoinsOffer(z, j);
    }

    private final void checkVideoAndShowNotEnoughBetcoinsOffer(final boolean showToastIfUnavailable, final long oneClickQuickBetStakeBetcoins) {
        getVideoRewardService().checkVideoRewardAndContinue(PromoService.PromoPlacement.NOT_ENOUGH_BETCOINS, null, null, new VideoRewardService.VideoRewardInfoListener() { // from class: org.betup.games.MiniGameActivity$$ExternalSyntheticLambda0
            @Override // org.betup.services.offer.VideoRewardService.VideoRewardInfoListener
            public final void onVideoRewardInfoUpdated(VideoRewardPlacementInfo videoRewardPlacementInfo) {
                MiniGameActivity.checkVideoAndShowNotEnoughBetcoinsOffer$lambda$0(MiniGameActivity.this, oneClickQuickBetStakeBetcoins, showToastIfUnavailable, videoRewardPlacementInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkVideoAndShowNotEnoughBetcoinsOffer$lambda$0(MiniGameActivity miniGameActivity, long j, boolean z, VideoRewardPlacementInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        if (miniGameActivity.isDestroyed()) {
            return;
        }
        if (!info.isAvailable() || info.isQuotaExhausted()) {
            if (z) {
                SnackbarHelper.showShort(miniGameActivity, R.string.not_enough_money);
            }
        } else {
            NotEnoughBetcoinsVideoOfferDialogFragment newInstance = NotEnoughBetcoinsVideoOfferDialogFragment.INSTANCE.newInstance(info.getPrizeAmount(), j);
            FragmentManager supportFragmentManager = miniGameActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            DialogManager.showDialogSafely(newInstance, supportFragmentManager, NotEnoughBetcoinsVideoOfferDialogFragment.TAG);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void processOfferAction(OfferMessage offerMessage) {
        OfferService offerService = this.offerService;
        if (offerService != null) {
            offerService.showOffer(offerMessage);
        }
    }
}
