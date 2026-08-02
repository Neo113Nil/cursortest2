package org.betup.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.vk.sdk.api.model.VKAttachments;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.Timer;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.betup.BetUpApp;
import org.betup.BuildConfig;
import org.betup.R;
import org.betup.bus.BetPlacedSuccessMessage;
import org.betup.bus.BetcoinsTourMessage;
import org.betup.bus.BettingSheetStateMessage;
import org.betup.bus.DailyBonusButtonUpdate;
import org.betup.bus.DisplayEditFavouritesDialogMessage;
import org.betup.bus.DisplayFollowersDialogMessage;
import org.betup.bus.DisplayRankingRewardDialogMessage;
import org.betup.bus.EventsCountMessage;
import org.betup.bus.InetStateMessage;
import org.betup.bus.MissionsUpdatedMessage;
import org.betup.bus.NavigateMessage;
import org.betup.bus.NavigateToLeaguesByDateMessage;
import org.betup.bus.NavigateToMatchesByDateMessage;
import org.betup.bus.NoAuthMessage;
import org.betup.bus.OddsDialogVisibilityMessage;
import org.betup.bus.OfferMessage;
import org.betup.bus.OneClickFirstBetAddedMessage;
import org.betup.bus.QuestionDialogMessage;
import org.betup.bus.ServerDownMessage;
import org.betup.bus.ShareMessage;
import org.betup.bus.ShopClosedWithoutPurchaseAfterOpeningFromNotEnoughBetcoinsContextMessage;
import org.betup.bus.ShowBetNumTourMessage;
import org.betup.bus.ShowBetPlacedDialogMessage;
import org.betup.bus.ShowDailyBonusDialogMessage;
import org.betup.bus.ShowNotEnoughBetcoinsVideoOfferMessage;
import org.betup.bus.SignOutMessage;
import org.betup.bus.TourActionMessage;
import org.betup.bus.TourFinishedMessage;
import org.betup.bus.TourMessage;
import org.betup.bus.UpdateBetslipMessage;
import org.betup.bus.UpgradeAccountMessage;
import org.betup.bus.UserProfileUpdatedMessage;
import org.betup.interstitial.InterstitialAdCoordinator;
import org.betup.model.local.entity.FullUserProfileModel;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.bonus.V7DailyBonusInteractor;
import org.betup.model.remote.api.rest.competitions.NewActiveCompetitionsInteractor;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.model.remote.api.rest.matches.MatchInfoInteractor;
import org.betup.model.remote.api.rest.shop.NewShopItemsInteractor;
import org.betup.model.remote.api.rest.shop.NewSingleShopInteractor;
import org.betup.model.remote.api.rest.shop.ShopLayoutInteractor;
import org.betup.model.remote.api.rest.user.V7ReferralInteractor;
import org.betup.model.remote.api.rest.user.V7TourMarketingRewardsInteractor;
import org.betup.model.remote.api.rest.user.V7UpdateAppVersionInteractor;
import org.betup.model.remote.api.rest.user.V7UpdateTimezoneInteractor;
import org.betup.model.remote.api.rest.user.V7UpdateTutorialCompleteInteractor;
import org.betup.model.remote.api.rest.user.V7UserAchievementsInteractor;
import org.betup.model.remote.api.rest.user.V7UserBetStatisticsInteractor;
import org.betup.model.remote.api.rest.user.changephoto.model.ChangePotoUrlModel;
import org.betup.model.remote.entity.promo.PromoType;
import org.betup.model.remote.entity.user.referrals.ReferralResponse;
import org.betup.model.remote.entity.videoRewards.VideoRewardPlacementInfo;
import org.betup.presentation.PresentationCoordinator;
import org.betup.presentation.ScreenTracker;
import org.betup.rewardedprompt.RewardedVideoOfferCoordinator;
import org.betup.services.LocaleService;
import org.betup.services.NetworkReceiver;
import org.betup.services.ads.AdUnitRegistry;
import org.betup.services.ads.interstitial.InterstitialAdController;
import org.betup.services.analytics.AnalyticsHelper;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.analytics.FirebaseAnalyticsHelper;
import org.betup.services.betlist.BetListAppender;
import org.betup.services.billing.BillingService;
import org.betup.services.casino.CasinoService;
import org.betup.services.chats.ChatService;
import org.betup.services.down.ServerErrorsProcessor;
import org.betup.services.drawer.DrawerController;
import org.betup.services.experiments.ABTestService;
import org.betup.services.inappmessaging.InAppMessagingLinkHandler;
import org.betup.services.menu.BottomMenuProvider;
import org.betup.services.menu.MenuView;
import org.betup.services.menu.providers.DefaultBottomMenuProvider;
import org.betup.services.navigate.NavigationService;
import org.betup.services.offer.AdsInitializer;
import org.betup.services.offer.DefaultOfferService;
import org.betup.services.offer.OfferService;
import org.betup.services.offer.PromoInterstitialRulesSync;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.push.PushEventsService;
import org.betup.services.push.PushStorageProvider;
import org.betup.services.push.PushTokenService;
import org.betup.services.share.ShareProviderFactory;
import org.betup.services.share.ShareService;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.services.user.SocialConnectionService;
import org.betup.services.user.UserService;
import org.betup.ui.BackPressedController;
import org.betup.ui.FilterController;
import org.betup.ui.MainActivity;
import org.betup.ui.base.BaseActivity;
import org.betup.ui.common.balance.BalanceDisplay;
import org.betup.ui.dialogs.BattleNavigationManager;
import org.betup.ui.dialogs.BetPlacedDialog;
import org.betup.ui.dialogs.CompetitionInfoDialogFragment;
import org.betup.ui.dialogs.CompetitionsPreviewFragment;
import org.betup.ui.dialogs.CreateBattleDialogFragment;
import org.betup.ui.dialogs.FollowersDialog;
import org.betup.ui.dialogs.FollowersDialogStateManager;
import org.betup.ui.dialogs.InfoDialog;
import org.betup.ui.dialogs.NotEnoughBetcoinsVideoOfferDialogFragment;
import org.betup.ui.dialogs.OnDialogButtonClickListener;
import org.betup.ui.dialogs.ProgressDialog;
import org.betup.ui.dialogs.QuestionDialog;
import org.betup.ui.dialogs.RankingRewardDialogFragment;
import org.betup.ui.dialogs.ShopDialogFragment;
import org.betup.ui.dialogs.SignUpDialogFragment;
import org.betup.ui.dialogs.TourCompletedDialogFragment;
import org.betup.ui.dialogs.events.OpenCompetitionInfoDialogEvent;
import org.betup.ui.dialogs.events.OpenCompetitionsPreviewEvent;
import org.betup.ui.dialogs.fav.EditFavouritesDialog;
import org.betup.ui.drawer.compose.DrawerContentKt;
import org.betup.ui.fragment.bets.BetsController;
import org.betup.ui.fragment.bets.BetsPage;
import org.betup.ui.fragment.bets.sheet.BettingSheetDialog;
import org.betup.ui.fragment.dailybonus.DailyBonusDialogFragment;
import org.betup.ui.fragment.dailybonus.controller.DailyBonusController;
import org.betup.ui.fragment.home.HomeFragment;
import org.betup.ui.fragment.home.controller.HomeDailyQuestController;
import org.betup.ui.fragment.home.controller.HomeVideoBonusController;
import org.betup.ui.fragment.login.AuthFragment;
import org.betup.ui.fragment.matches.LeaguesByDateFragment;
import org.betup.ui.fragment.matches.MatchesByDateFragment;
import org.betup.ui.fragment.shop.ShopBetcoinsFragmentK;
import org.betup.ui.tour.DefaultTourHelper;
import org.betup.ui.tour.Tour;
import org.betup.ui.tour.TourHelper;
import org.betup.ui.tour.TourHelperPosition;
import org.betup.ui.tour.TourHelperSign;
import org.betup.ui.tour.compose.TourComposeHelper;
import org.betup.ui.tour.compose.TourComposeHelperKt;
import org.betup.ui.tour.compose.TourConfig;
import org.betup.ui.tour.compose.TourState;
import org.betup.ui.tour.compose.TourStep;
import org.betup.ui.tour.controller.TourFavoriteSportsController;
import org.betup.utils.ActivitySavedStateGuard;
import org.betup.utils.DialogManager;
import org.betup.utils.FragmentTransactionHelper;
import org.betup.utils.InviteHelper;
import org.betup.utils.NotificationsPermissionUtil;
import org.betup.utils.OfferNavigationGate;
import org.betup.utils.PushPermissionAfterBetHelper;
import org.betup.utils.SharedPrefs;
import org.betup.utils.SnackbarHelper;
import org.betup.utils.balance.BalanceHolder;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import tourguide.tourguide.Overlay;

/* loaded from: classes2.dex */
public class MainActivity extends BaseActivity implements FilterController, TransactionController, MenuBarsController, BackPressedController, ProgressDisplay, TourHelper, UserService.UserInfoListener, OfferService, AdsInitializer.OnAdInitializeCompletedListener, DrawerController {
    private static final long AUTH_NULL_REDIRECT_DELAY_MS = 500;
    public static final int CHALLENGE_TOUR = 234;
    public static final String EXTRA_JUST_LOGGED_IN = "just_logged_in";
    public static final int MAX_STACK = 3;
    public static final int REQUEST_LOGIN = 777;

    @Inject
    ABTestService abTestService;

    @Inject
    AdUnitRegistry adUnitRegistry;

    @Inject
    AdsInitializer adsInitializer;

    @Inject
    AnalyticsService analyticsService;
    private BackPressedController.BackPressedListener backPressedListener;

    @Inject
    BalanceHolder balanceHolder;
    private BattleNavigationManager battleNavigationManager;

    @Inject
    BetListAppender betListAppender;

    @Inject
    BetsController betsController;
    public BalanceDisplay betupBalanceDisplay;

    @Inject
    BillingService billingService;
    private BottomMenuProvider bottomMenuProvider;
    private Timer cacheTimer;

    @Inject
    CasinoService casinoService;

    @Inject
    ChatService chatService;

    @Inject
    DailyBonusController dailyBonusController;

    @BindView(R.id.drawer_layout)
    DrawerLayout drawer;

    @BindView(R.id.drawer)
    ComposeView drawerContainer;

    @BindView(R.id.drawer_scrim_touch_blocker)
    View drawerScrimTouchBlocker;

    @Inject
    HomeDailyQuestController homeDailyQuestController;

    @Inject
    HomeVideoBonusController homeVideoBonusController;

    @BindView(R.id.inet_error)
    View inetError;

    @Inject
    InterstitialAdController interstitialAdController;

    @Inject
    InterstitialAdCoordinator interstitialAdCoordinator;

    @Inject
    LocalPreferencesService localPreferencesService;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    @BindView(R.id.layout)
    RelativeLayout mainView;

    @Inject
    MatchInfoInteractor matchInfoInteractor;

    @BindView(R.id.bottomPanel)
    MenuView menuView;

    @Inject
    NavigationService<NavigateMessage.Target> navigationService;
    private BroadcastReceiver networkReceiver;

    @Inject
    NewActiveCompetitionsInteractor newActiveCompetitionsInteractor;

    @Inject
    NewShopItemsInteractor newShopItemsInteractor;
    private OfferService offerService;
    private Runnable pendingAuthNullRedirect;

    @Inject
    PresentationCoordinator presentationCoordinator;
    private ProgressDialog progressDialog;

    @Inject
    PromoInterstitialRulesSync promoInterstitialRulesSync;

    @Inject
    PromoService promoService;
    private PushEventsService pushEventsService;

    @Inject
    PushStorageProvider pushStorageProvider;

    @Inject
    PushTokenService pushTokenService;

    @Inject
    FirebaseRemoteConfig remoteConfig;

    @Inject
    RewardedVideoOfferCoordinator rewardedVideoOfferCoordinator;

    @Inject
    ScreenTracker screenTracker;
    private int senderHashcode;

    @Inject
    ServerErrorsProcessor serverErrorsProcessor;
    private ShareService shareService;

    @Inject
    ShopLayoutInteractor shopLayoutInteractor;

    @Inject
    NewSingleShopInteractor singleShopInteractor;

    @Inject
    SocialConnectionService socialConnectionService;
    private int stackSize;

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    public TourComposeHelper tourComposeHelper;

    @Inject
    TourFavoriteSportsController tourFavoriteSportsController;
    public TourHelper tourHelper;

    @BindView(R.id.tour_overlay)
    ComposeView tourOverlayView;

    @Inject
    UserService userService;

    @Inject
    V7DailyBonusInteractor v7DailyBonusInteractor;

    @Inject
    V7ReferralInteractor v7ReferralInteractor;

    @Inject
    V7TourMarketingRewardsInteractor v7TourMarketingRewardsInteractor;

    @Inject
    V7UpdateAppVersionInteractor v7UpdateAppVersionInteractor;

    @Inject
    V7UpdateTimezoneInteractor v7UpdateTimezoneInteractor;

    @Inject
    V7UpdateTutorialCompleteInteractor v7UpdateTutorialCompleteInteractor;

    @Inject
    V7UserAchievementsInteractor v7UserAchievementsInteractor;

    @Inject
    V7UserBetStatisticsInteractor v7UserBetStatisticsInteractor;

    @Inject
    VideoRewardService videoRewardService;
    private Bundle waitingBundle = null;
    private final Map<FilterController.FilterType, FilterController.MatchesFilter> filters = new HashMap();
    private int eventsCountUpdateKey = 0;
    private final FragmentManager.FragmentLifecycleCallbacks screenTrackingCallbacks = new FragmentManager.FragmentLifecycleCallbacks() { // from class: org.betup.ui.MainActivity.1
        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentResumed(FragmentManager fm, Fragment f) {
            MainActivity.this.screenTracker.trackFragment(f);
            if (MainActivity.this.presentationCoordinator != null) {
                MainActivity.this.presentationCoordinator.refreshAndShowIfEligible();
            }
        }
    };
    private final DrawerLayout.DrawerListener drawerListener = new DrawerLayout.DrawerListener() { // from class: org.betup.ui.MainActivity.26
        private TabMenuItem currentDrawerItem;

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerStateChanged(int newState) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerSlide(View drawerView, float slideOffset) {
            MainActivity.this.drawer.bringChildToFront(drawerView);
            MainActivity.this.drawer.requestLayout();
            if (MainActivity.this.menuView.getCurrent() != TabMenuItem.DRAWER) {
                this.currentDrawerItem = MainActivity.this.menuView.getCurrent();
                MainActivity.this.updateTabMenu(TabMenuItem.DRAWER);
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerOpened(View drawerView) {
            if (MainActivity.this.drawerScrimTouchBlocker != null) {
                MainActivity.this.drawerScrimTouchBlocker.setVisibility(0);
            }
            if (MainActivity.this.userService.isRegistered()) {
                ((PushStorageProvider) MainActivity.this.getApplicationContext()).refreshEventCount(MainActivity.this.userService.getShortProfile().getUserModel().getId());
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerClosed(View view) {
            if (MainActivity.this.drawerScrimTouchBlocker != null) {
                MainActivity.this.drawerScrimTouchBlocker.setVisibility(8);
            }
            MainActivity.this.updateTabMenu(this.currentDrawerItem);
        }
    };
    private boolean justLoggedIn = false;
    private final Handler authCheckHandler = new Handler(Looper.getMainLooper());
    private final BaseCachedSharedInteractor.OnFetchedListener<ReferralResponse, String> inviteCodeListener = new AnonymousClass28();
    private boolean usingDefaultMenu = true;
    private boolean restoreBettingSheetAfterShop = false;

    public Activity getActivity() {
        return this;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMissionsUpdated(MissionsUpdatedMessage missionsUpdatedMessage) {
    }

    public void refreshDrawerData() {
    }

    @Override // org.betup.ui.MenuBarsController
    public void updateTitle(String title) {
    }

    @Override // org.betup.ui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        ((BetUpApp) getApplicationContext()).getComponent().inject(this);
        this.mAuth = FirebaseAuth.getInstance();
        this.billingService.initConnection();
        this.tourHelper = new DefaultTourHelper(this, this.userService, this.v7UpdateTutorialCompleteInteractor);
        this.tourComposeHelper = new TourComposeHelper(this, this.userService, this.v7UpdateTutorialCompleteInteractor, this.v7TourMarketingRewardsInteractor, this.tourHelper, this.tourFavoriteSportsController);
        AnalyticsHelper.INSTANCE.init(this.analyticsService);
        this.pushEventsService = new PushEventsService(this);
        super.onCreate(savedInstanceState);
        MainActivityDailyQuestObserverKt.bindDailyQuestEvents(this, this.homeDailyQuestController, this.userService);
        NotificationsPermissionUtil.registerPermissionListener(this);
        this.waitingBundle = getIntent().getExtras();
        int backStackEntryCount = getSupportFragmentManager().getBackStackEntryCount();
        this.stackSize = backStackEntryCount;
        if (backStackEntryCount > 3) {
            this.stackSize = 3;
        }
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this);
        }
        if (!EventBus.getDefault().isRegistered(FollowersDialogStateManager.INSTANCE)) {
            EventBus.getDefault().register(FollowersDialogStateManager.INSTANCE);
        }
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getSupportFragmentManager().registerFragmentLifecycleCallbacks(this.screenTrackingCallbacks, true);
        this.presentationCoordinator.bind(this);
        this.interstitialAdCoordinator.bind(this);
        this.rewardedVideoOfferCoordinator.bind(this);
        setSupportActionBar(this.toolbar);
        DefaultBottomMenuProvider defaultBottomMenuProvider = new DefaultBottomMenuProvider(this, this.betListAppender, this, this);
        this.bottomMenuProvider = defaultBottomMenuProvider;
        this.menuView.setMenuItems(defaultBottomMenuProvider.buildMenu(this));
        if (this.pushStorageProvider != null && this.userService.isRegistered()) {
            this.pushStorageProvider.refreshEventCount(Integer.valueOf(this.userService.getShortProfile().getUserModel().getId().intValue()));
            this.menuView.updateNotificationsCounter(Integer.valueOf(this.pushStorageProvider.getEventsCount()));
        }
        this.battleNavigationManager = new BattleNavigationManager(this);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
        this.drawer.addDrawerListener(this.drawerListener);
        View view = this.drawerScrimTouchBlocker;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: org.betup.ui.MainActivity$$ExternalSyntheticLambda13
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MainActivity.this.m12866lambda$onCreate$0$orgbetupuiMainActivity(view2);
                }
            });
        }
        this.shareService = new ShareService(ShareProviderFactory.createFactory(this, this.userService, this));
        BalanceDisplay balanceDisplay = new BalanceDisplay(this.userService, this.abTestService, this.tourHelper, this.balanceHolder);
        this.betupBalanceDisplay = balanceDisplay;
        balanceDisplay.setStreakInteractor(this.v7UserBetStatisticsInteractor);
        this.betupBalanceDisplay.setView(this.toolbar, this);
        this.adsInitializer.bindActivity(this);
        this.adsInitializer.init(this);
        initAuth();
        this.casinoService.init();
        this.videoRewardService.attach(this, this);
        initTourOverlay();
    }

    /* renamed from: lambda$onCreate$0$org-betup-ui-MainActivity, reason: not valid java name */
    /* synthetic */ void m12866lambda$onCreate$0$orgbetupuiMainActivity(View view) {
        this.drawer.closeDrawer(GravityCompat.END);
    }

    private static Function1<Rect, Unit> createHomeTourBoundsSetter(final TourComposeHelper tourComposeHelper, final View tourOverlayView, final String target) {
        return new Function1<Rect, Unit>() { // from class: org.betup.ui.MainActivity.2
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Rect screenBounds) {
                char c;
                View view;
                char c2;
                TourState tourState = TourComposeHelper.this.getTourState();
                if (tourState == null) {
                    return Unit.INSTANCE;
                }
                if (screenBounds != null && (view = tourOverlayView) != null && view.getWidth() > 0 && tourOverlayView.getHeight() > 0) {
                    int[] iArr = new int[2];
                    tourOverlayView.getLocationOnScreen(iArr);
                    Rect rect = new Rect(screenBounds.left - iArr[0], screenBounds.top - iArr[1], screenBounds.right - iArr[0], screenBounds.bottom - iArr[1]);
                    String str = target;
                    str.hashCode();
                    switch (str.hashCode()) {
                        case -1279757021:
                            if (str.equals("specialOffer")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -943542038:
                            if (str.equals("liveArenaSection")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -858834321:
                            if (str.equals("globalRank")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -303753398:
                            if (str.equals("dailyQuests")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 842689767:
                            if (str.equals("moreMatchesSection")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 970020482:
                            if (str.equals("bestStreak")) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1000589194:
                            if (str.equals("videoReward")) {
                                c2 = 6;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1348943580:
                            if (str.equals("winRate")) {
                                c2 = 7;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1625542273:
                            if (str.equals("flashBet")) {
                                c2 = '\b';
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            tourState.setSpecialOfferBounds(rect);
                            break;
                        case 1:
                            tourState.setLiveArenaSectionBounds(rect);
                            break;
                        case 2:
                            tourState.setHomeGlobalRankBounds(rect);
                            break;
                        case 3:
                            tourState.setDailyQuestsBounds(rect);
                            break;
                        case 4:
                            tourState.setMoreMatchesSectionBounds(rect);
                            break;
                        case 5:
                            tourState.setHomeBestStreakBounds(rect);
                            break;
                        case 6:
                            tourState.setVideoRewardBounds(rect);
                            break;
                        case 7:
                            tourState.setHomeWinRateBounds(rect);
                            break;
                        case '\b':
                            tourState.setFlashBetButtonBounds(rect);
                            break;
                    }
                } else {
                    String str2 = target;
                    str2.hashCode();
                    switch (str2.hashCode()) {
                        case -1279757021:
                            if (str2.equals("specialOffer")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -943542038:
                            if (str2.equals("liveArenaSection")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -858834321:
                            if (str2.equals("globalRank")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -303753398:
                            if (str2.equals("dailyQuests")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 842689767:
                            if (str2.equals("moreMatchesSection")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 970020482:
                            if (str2.equals("bestStreak")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1000589194:
                            if (str2.equals("videoReward")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1348943580:
                            if (str2.equals("winRate")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1625542273:
                            if (str2.equals("flashBet")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            tourState.setSpecialOfferBounds(null);
                            break;
                        case 1:
                            tourState.setLiveArenaSectionBounds(null);
                            break;
                        case 2:
                            tourState.setHomeGlobalRankBounds(null);
                            break;
                        case 3:
                            tourState.setDailyQuestsBounds(null);
                            break;
                        case 4:
                            tourState.setMoreMatchesSectionBounds(null);
                            break;
                        case 5:
                            tourState.setHomeBestStreakBounds(null);
                            break;
                        case 6:
                            tourState.setVideoRewardBounds(null);
                            break;
                        case 7:
                            tourState.setHomeWinRateBounds(null);
                            break;
                        case '\b':
                            tourState.setFlashBetButtonBounds(null);
                            break;
                    }
                }
                return Unit.INSTANCE;
            }
        };
    }

    private void initTourOverlay() {
        final TourComposeHelper tourComposeHelper;
        if (this.tourOverlayView == null || (tourComposeHelper = this.tourComposeHelper) == null) {
            return;
        }
        tourComposeHelper.isOnHomePage = new Function0() { // from class: org.betup.ui.MainActivity$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainActivity.this.m12862lambda$initTourOverlay$1$orgbetupuiMainActivity();
            }
        };
        tourComposeHelper.dimMenuTabs = new Function0<Unit>() { // from class: org.betup.ui.MainActivity.3
            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                if (MainActivity.this.menuView != null) {
                    MainActivity.this.menuView.dimTabsExcept(TabMenuItem.MATCHES);
                }
                return Unit.INSTANCE;
            }
        };
        tourComposeHelper.restoreMenuTabs = new Function0<Unit>() { // from class: org.betup.ui.MainActivity.4
            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                if (MainActivity.this.menuView != null) {
                    MainActivity.this.menuView.restoreTabsNormalState();
                }
                return Unit.INSTANCE;
            }
        };
        tourComposeHelper.getSportsButtonBounds = new Function0<Rect>() { // from class: org.betup.ui.MainActivity.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public Rect invoke() {
                View view;
                if (MainActivity.this.menuView == null || (view = MainActivity.this.menuView.getView(TabMenuItem.MATCHES)) == null || view.getVisibility() != 0) {
                    return null;
                }
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                int width = view.getWidth() + i;
                int height = view.getHeight() + i2;
                if (MainActivity.this.tourOverlayView != null) {
                    int[] iArr2 = new int[2];
                    MainActivity.this.tourOverlayView.getLocationOnScreen(iArr2);
                    int i3 = iArr2[0];
                    i -= i3;
                    int i4 = iArr2[1];
                    i2 -= i4;
                    width -= i3;
                    height -= i4;
                }
                Log.d("TourFlow", "MainActivity - Sports button bounds: left=" + i + ", top=" + i2 + ", right=" + width + ", bottom=" + height);
                return new Rect(i, i2, width, height);
            }
        };
        tourComposeHelper.getTabBounds = new Function1<TabMenuItem, Rect>() { // from class: org.betup.ui.MainActivity.6
            @Override // kotlin.jvm.functions.Function1
            public Rect invoke(TabMenuItem tab) {
                View view;
                if (MainActivity.this.menuView == null || (view = MainActivity.this.menuView.getView(tab)) == null || view.getVisibility() != 0) {
                    return null;
                }
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                int width = view.getWidth() + i;
                int height = view.getHeight() + i2;
                if (MainActivity.this.tourOverlayView != null) {
                    int[] iArr2 = new int[2];
                    MainActivity.this.tourOverlayView.getLocationOnScreen(iArr2);
                    int i3 = iArr2[0];
                    i -= i3;
                    int i4 = iArr2[1];
                    i2 -= i4;
                    width -= i3;
                    height -= i4;
                }
                return new Rect(i, i2, width, height);
            }
        };
        tourComposeHelper.getSportItemBounds = new Function0<Rect>() { // from class: org.betup.ui.MainActivity.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public Rect invoke() {
                TourState tourState = tourComposeHelper.getTourState();
                if (tourState != null) {
                    return tourState.getSportItemBounds();
                }
                return null;
            }
        };
        tourComposeHelper.clickSportsButton = new Function0<Unit>() { // from class: org.betup.ui.MainActivity.8
            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                View view;
                if (MainActivity.this.menuView != null && (view = MainActivity.this.menuView.getView(TabMenuItem.MATCHES)) != null && view.getVisibility() == 0) {
                    view.performClick();
                    Log.d("TourFlow", "MainActivity - Simulated click on Sports button");
                }
                return Unit.INSTANCE;
            }
        };
        tourComposeHelper.clickSportItem = new Function1<Long, Unit>() { // from class: org.betup.ui.MainActivity.9
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Long sportId) {
                Log.d("TourFlow", "MainActivity - Simulating click on Sport item with ID: " + sportId);
                TourComposeHelper tourComposeHelper2 = tourComposeHelper;
                if (tourComposeHelper2 != null && tourComposeHelper2.isTourActive()) {
                    EventBus.getDefault().post(new TourActionMessage(TourActionMessage.Action.SPORT_SELECTED, sportId));
                    Log.d("TourFlow", "MainActivity - Posted TourActionMessage(SPORT_SELECTED) for sport ID: " + sportId);
                }
                Bundle bundle = new Bundle();
                bundle.putInt(GetRandomTeamImagesInteractor.KEY_SPORT_ID, sportId.intValue());
                bundle.putBoolean("isLive", false);
                bundle.putString("filter", "All");
                EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.LEAGUES, bundle));
                Log.d("TourFlow", "MainActivity - Posted NavigateMessage(LEAGUES) for sport ID: " + sportId);
                return Unit.INSTANCE;
            }
        };
        tourComposeHelper.setSportItemBounds = new Function1<Rect, Unit>() { // from class: org.betup.ui.MainActivity.10
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Rect screenBounds) {
                if (screenBounds != null && MainActivity.this.tourOverlayView != null) {
                    int[] iArr = new int[2];
                    MainActivity.this.tourOverlayView.getLocationOnScreen(iArr);
                    Rect rect = new Rect(screenBounds.left - iArr[0], screenBounds.top - iArr[1], screenBounds.right - iArr[0], screenBounds.bottom - iArr[1]);
                    Log.d("TourFlow", "MainActivity - Converted sport item bounds from screen to overlay: screen=" + screenBounds + ", overlay=" + rect);
                    TourState tourState = tourComposeHelper.getTourState();
                    if (tourState != null) {
                        tourState.setSportItemBounds(rect);
                    }
                } else {
                    TourState tourState2 = tourComposeHelper.getTourState();
                    if (tourState2 != null) {
                        tourState2.setSportItemBounds(null);
                    }
                }
                return Unit.INSTANCE;
            }
        };
        tourComposeHelper.getLeagueItemBounds = new Function0<Rect>() { // from class: org.betup.ui.MainActivity.11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public Rect invoke() {
                TourState tourState = tourComposeHelper.getTourState();
                if (tourState != null) {
                    return tourState.getLeagueItemBounds();
                }
                return null;
            }
        };
        tourComposeHelper.setLeagueItemBounds = new Function1<Rect, Unit>() { // from class: org.betup.ui.MainActivity.12
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Rect screenBounds) {
                if (screenBounds != null && MainActivity.this.tourOverlayView != null) {
                    int[] iArr = new int[2];
                    MainActivity.this.tourOverlayView.getLocationOnScreen(iArr);
                    Rect rect = new Rect(screenBounds.left - iArr[0], screenBounds.top - iArr[1], screenBounds.right - iArr[0], screenBounds.bottom - iArr[1]);
                    Log.d("TourFlow", "MainActivity - Converted league item bounds from screen to overlay: screen=" + screenBounds + ", overlay=" + rect);
                    TourState tourState = tourComposeHelper.getTourState();
                    if (tourState != null) {
                        tourState.setLeagueItemBounds(rect);
                    }
                } else {
                    TourState tourState2 = tourComposeHelper.getTourState();
                    if (tourState2 != null) {
                        tourState2.setLeagueItemBounds(null);
                    }
                }
                return Unit.INSTANCE;
            }
        };
        tourComposeHelper.getMatchItemBounds = new Function0<Rect>() { // from class: org.betup.ui.MainActivity.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public Rect invoke() {
                TourState tourState = tourComposeHelper.getTourState();
                if (tourState != null) {
                    return tourState.getMatchItemBounds();
                }
                return null;
            }
        };
        tourComposeHelper.setMatchItemBounds = new Function1<Rect, Unit>() { // from class: org.betup.ui.MainActivity.14
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Rect screenBounds) {
                if (screenBounds == null || MainActivity.this.tourOverlayView == null) {
                    Log.w("TourFlow", "MainActivity - Cannot set match item bounds: screenBounds=" + screenBounds + ", tourOverlayView=" + MainActivity.this.tourOverlayView);
                    TourState tourState = tourComposeHelper.getTourState();
                    if (tourState != null) {
                        tourState.setMatchItemBounds(null);
                    }
                } else {
                    int[] iArr = new int[2];
                    MainActivity.this.tourOverlayView.getLocationOnScreen(iArr);
                    Rect rect = new Rect(screenBounds.left - iArr[0], screenBounds.top - iArr[1], screenBounds.right - iArr[0], screenBounds.bottom - iArr[1]);
                    Log.d("TourFlow", "MainActivity - Converted match item bounds from screen to overlay: screen=" + screenBounds + ", overlayLocation=[" + iArr[0] + "," + iArr[1] + "], overlay=" + rect);
                    TourState tourState2 = tourComposeHelper.getTourState();
                    if (tourState2 != null) {
                        tourState2.setMatchItemBounds(rect);
                    }
                }
                return Unit.INSTANCE;
            }
        };
        tourComposeHelper.getBetSectionBounds = new Function0<Rect>() { // from class: org.betup.ui.MainActivity.15
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public Rect invoke() {
                TourState tourState = tourComposeHelper.getTourState();
                if (tourState != null) {
                    return tourState.getBetSectionBounds();
                }
                return null;
            }
        };
        tourComposeHelper.clickLeagueItem = new Function1<Long, Unit>() { // from class: org.betup.ui.MainActivity.16
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Long leagueId) {
                Log.d("TourFlow", "MainActivity - Simulating click on League item with ID: " + leagueId);
                TourComposeHelper tourComposeHelper2 = tourComposeHelper;
                if (tourComposeHelper2 != null && tourComposeHelper2.isTourActive()) {
                    EventBus.getDefault().post(new TourActionMessage(TourActionMessage.Action.LEAGUE_SELECTED, leagueId));
                    Log.d("TourFlow", "MainActivity - Posted TourActionMessage(LEAGUE_SELECTED) for league ID: " + leagueId);
                }
                Bundle bundle = new Bundle();
                bundle.putInt("id", leagueId.intValue());
                bundle.putBoolean("isLive", false);
                bundle.putString("filter", "All");
                bundle.putBoolean("isFavorite", false);
                EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.LEAGUE_MATCHES, bundle));
                Log.d("TourFlow", "MainActivity - Posted NavigateMessage(LEAGUE_MATCHES) for league ID: " + leagueId);
                return Unit.INSTANCE;
            }
        };
        tourComposeHelper.clickMatchItem = new Function1<Long, Unit>() { // from class: org.betup.ui.MainActivity.17
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Long matchId) {
                Log.d("TourFlow", "MainActivity - Simulating click on Match item with ID: " + matchId);
                TourComposeHelper tourComposeHelper2 = tourComposeHelper;
                if (tourComposeHelper2 != null && tourComposeHelper2.isTourActive()) {
                    EventBus.getDefault().post(new TourActionMessage(TourActionMessage.Action.MATCH_SELECTED, matchId));
                    Log.d("TourFlow", "MainActivity - Posted TourActionMessage(MATCH_SELECTED) for match ID: " + matchId);
                }
                Bundle bundle = new Bundle();
                bundle.putInt("matchId", matchId.intValue());
                bundle.putBoolean("isLive", false);
                EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.MATCH_DETAILS, bundle));
                Log.d("TourFlow", "MainActivity - Posted NavigateMessage(MATCH_DETAILS) for match ID: " + matchId);
                return Unit.INSTANCE;
            }
        };
        tourComposeHelper.setBattlesButtonBounds = new Function1<Rect, Unit>() { // from class: org.betup.ui.MainActivity.18
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Rect screenBounds) {
                if (screenBounds != null && MainActivity.this.tourOverlayView != null) {
                    int[] iArr = new int[2];
                    MainActivity.this.tourOverlayView.getLocationOnScreen(iArr);
                    Rect rect = new Rect(screenBounds.left - iArr[0], screenBounds.top - iArr[1], screenBounds.right - iArr[0], screenBounds.bottom - iArr[1]);
                    TourState tourState = tourComposeHelper.getTourState();
                    if (tourState != null) {
                        tourState.setBattlesButtonBounds(rect);
                    }
                } else {
                    TourState tourState2 = tourComposeHelper.getTourState();
                    if (tourState2 != null) {
                        tourState2.setBattlesButtonBounds(null);
                    }
                }
                return Unit.INSTANCE;
            }
        };
        tourComposeHelper.setHomeWinRateBounds = createHomeTourBoundsSetter(tourComposeHelper, this.tourOverlayView, "winRate");
        tourComposeHelper.setHomeGlobalRankBounds = createHomeTourBoundsSetter(tourComposeHelper, this.tourOverlayView, "globalRank");
        tourComposeHelper.setHomeBestStreakBounds = createHomeTourBoundsSetter(tourComposeHelper, this.tourOverlayView, "bestStreak");
        tourComposeHelper.setSpecialOfferBounds = createHomeTourBoundsSetter(tourComposeHelper, this.tourOverlayView, "specialOffer");
        tourComposeHelper.setVideoRewardBounds = createHomeTourBoundsSetter(tourComposeHelper, this.tourOverlayView, "videoReward");
        tourComposeHelper.setDailyQuestsBounds = createHomeTourBoundsSetter(tourComposeHelper, this.tourOverlayView, "dailyQuests");
        tourComposeHelper.setFlashBetButtonBounds = createHomeTourBoundsSetter(tourComposeHelper, this.tourOverlayView, "flashBet");
        tourComposeHelper.setLiveArenaSectionBounds = createHomeTourBoundsSetter(tourComposeHelper, this.tourOverlayView, "liveArenaSection");
        tourComposeHelper.setMoreMatchesSectionBounds = createHomeTourBoundsSetter(tourComposeHelper, this.tourOverlayView, "moreMatchesSection");
        tourComposeHelper.setCompetitionsButtonBounds = new Function1<Rect, Unit>() { // from class: org.betup.ui.MainActivity.19
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Rect screenBounds) {
                if (screenBounds != null && MainActivity.this.tourOverlayView != null) {
                    int[] iArr = new int[2];
                    MainActivity.this.tourOverlayView.getLocationOnScreen(iArr);
                    Rect rect = new Rect(screenBounds.left - iArr[0], screenBounds.top - iArr[1], screenBounds.right - iArr[0], screenBounds.bottom - iArr[1]);
                    TourState tourState = tourComposeHelper.getTourState();
                    if (tourState != null) {
                        tourState.setCompetitionsButtonBounds(rect);
                    }
                } else {
                    TourState tourState2 = tourComposeHelper.getTourState();
                    if (tourState2 != null) {
                        tourState2.setCompetitionsButtonBounds(null);
                    }
                }
                return Unit.INSTANCE;
            }
        };
        tourComposeHelper.setTopMatchesButtonBounds = new Function1<Rect, Unit>() { // from class: org.betup.ui.MainActivity.20
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Rect screenBounds) {
                if (screenBounds != null && MainActivity.this.tourOverlayView != null) {
                    int[] iArr = new int[2];
                    MainActivity.this.tourOverlayView.getLocationOnScreen(iArr);
                    TourState tourState = tourComposeHelper.getTourState();
                    if (tourState != null) {
                        tourState.setTopMatchesButtonBounds(new Rect(screenBounds.left - iArr[0], screenBounds.top - iArr[1], screenBounds.right - iArr[0], screenBounds.bottom - iArr[1]));
                    }
                } else {
                    TourState tourState2 = tourComposeHelper.getTourState();
                    if (tourState2 != null) {
                        tourState2.setTopMatchesButtonBounds(null);
                    }
                }
                return Unit.INSTANCE;
            }
        };
        tourComposeHelper.setMinigamesButtonBounds = new Function1<Rect, Unit>() { // from class: org.betup.ui.MainActivity.21
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Rect screenBounds) {
                if (screenBounds != null && MainActivity.this.tourOverlayView != null) {
                    int[] iArr = new int[2];
                    MainActivity.this.tourOverlayView.getLocationOnScreen(iArr);
                    TourState tourState = tourComposeHelper.getTourState();
                    if (tourState != null) {
                        tourState.setMinigamesButtonBounds(new Rect(screenBounds.left - iArr[0], screenBounds.top - iArr[1], screenBounds.right - iArr[0], screenBounds.bottom - iArr[1]));
                    }
                } else {
                    TourState tourState2 = tourComposeHelper.getTourState();
                    if (tourState2 != null) {
                        tourState2.setMinigamesButtonBounds(null);
                    }
                }
                return Unit.INSTANCE;
            }
        };
        tourComposeHelper.setRankingButtonBounds = new Function1<Rect, Unit>() { // from class: org.betup.ui.MainActivity.22
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Rect screenBounds) {
                if (screenBounds != null && MainActivity.this.tourOverlayView != null && MainActivity.this.tourOverlayView.getWidth() > 0 && MainActivity.this.tourOverlayView.getHeight() > 0) {
                    int[] iArr = new int[2];
                    MainActivity.this.tourOverlayView.getLocationOnScreen(iArr);
                    TourState tourState = tourComposeHelper.getTourState();
                    if (tourState != null) {
                        tourState.setRankingButtonBounds(new Rect(screenBounds.left - iArr[0], screenBounds.top - iArr[1], screenBounds.right - iArr[0], screenBounds.bottom - iArr[1]));
                    }
                } else {
                    TourState tourState2 = tourComposeHelper.getTourState();
                    if (tourState2 != null) {
                        tourState2.setRankingButtonBounds(null);
                    }
                }
                return Unit.INSTANCE;
            }
        };
        tourComposeHelper.setTvBetButtonBounds = new Function1<Rect, Unit>() { // from class: org.betup.ui.MainActivity.23
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Rect screenBounds) {
                if (screenBounds != null && MainActivity.this.tourOverlayView != null && MainActivity.this.tourOverlayView.getWidth() > 0 && MainActivity.this.tourOverlayView.getHeight() > 0) {
                    int[] iArr = new int[2];
                    MainActivity.this.tourOverlayView.getLocationOnScreen(iArr);
                    TourState tourState = tourComposeHelper.getTourState();
                    if (tourState != null) {
                        tourState.setTvBetButtonBounds(new Rect(screenBounds.left - iArr[0], screenBounds.top - iArr[1], screenBounds.right - iArr[0], screenBounds.bottom - iArr[1]));
                    }
                } else {
                    TourState tourState2 = tourComposeHelper.getTourState();
                    if (tourState2 != null) {
                        tourState2.setTvBetButtonBounds(null);
                    }
                }
                return Unit.INSTANCE;
            }
        };
        tourComposeHelper.onOverlayVisibilityChanged = new AnonymousClass24(tourComposeHelper);
        this.tourOverlayView.setContent(new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.MainActivity.25
            @Override // kotlin.jvm.functions.Function2
            public Unit invoke(Composer composer, Integer integer) {
                TourComposeHelperKt.TourComposeViewForJava(tourComposeHelper, new Function0<Unit>() { // from class: org.betup.ui.MainActivity.25.1
                    @Override // kotlin.jvm.functions.Function0
                    public Unit invoke() {
                        if (MainActivity.this.menuView != null) {
                            MainActivity.this.menuView.restoreTabsNormalState();
                        }
                        if (tourComposeHelper != null) {
                            tourComposeHelper.skipTour();
                        }
                        return Unit.INSTANCE;
                    }
                }, composer, integer.intValue());
                return Unit.INSTANCE;
            }
        });
        this.tourOverlayView.setVisibility(8);
    }

    /* renamed from: lambda$initTourOverlay$1$org-betup-ui-MainActivity, reason: not valid java name */
    /* synthetic */ Boolean m12862lambda$initTourOverlay$1$orgbetupuiMainActivity() {
        MenuView menuView = this.menuView;
        return Boolean.valueOf(menuView != null && menuView.getCurrent() == TabMenuItem.HOME);
    }

    /* renamed from: org.betup.ui.MainActivity$24, reason: invalid class name */
    class AnonymousClass24 implements Function1<Boolean, Unit> {
        final /* synthetic */ TourComposeHelper val$finalTourComposeHelper;

        AnonymousClass24(final TourComposeHelper val$finalTourComposeHelper) {
            this.val$finalTourComposeHelper = val$finalTourComposeHelper;
        }

        @Override // kotlin.jvm.functions.Function1
        public Unit invoke(Boolean isVisible) {
            if (MainActivity.this.tourOverlayView != null) {
                boolean z = false;
                if (isVisible.booleanValue()) {
                    MainActivity.this.tourOverlayView.setVisibility(0);
                } else {
                    TourState tourState = this.val$finalTourComposeHelper.getTourState();
                    if (tourState != null && tourState.getIsTourActiveValue()) {
                        z = true;
                    }
                    MainActivity.this.tourOverlayView.setVisibility(z ? 4 : 8);
                }
                Log.d("TourFlow", "MainActivity - Tour overlay visibility changed: " + isVisible);
            }
            if (isVisible.booleanValue()) {
                MainActivity mainActivity = MainActivity.this;
                final TourComposeHelper tourComposeHelper = this.val$finalTourComposeHelper;
                mainActivity.setOnBackPressedListener(new BackPressedController.BackPressedListener() { // from class: org.betup.ui.MainActivity$24$$ExternalSyntheticLambda0
                    @Override // org.betup.ui.BackPressedController.BackPressedListener
                    public final boolean onBackPressed() {
                        boolean onBackPressed;
                        onBackPressed = TourComposeHelper.this.onBackPressed();
                        return onBackPressed;
                    }
                });
            } else {
                MainActivity.this.removeListener();
            }
            return Unit.INSTANCE;
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void handleShopClosed(ShopClosedWithoutPurchaseAfterOpeningFromNotEnoughBetcoinsContextMessage message) {
        checkVideoAndShowNotEnoughBetcoinsOffer(false);
    }

    private void checkVideoAndShowNotEnoughBetcoinsOffer(boolean showToastIfUnavailable) {
        checkVideoAndShowNotEnoughBetcoinsOffer(showToastIfUnavailable, 0L);
    }

    private void checkVideoAndShowNotEnoughBetcoinsOffer(final boolean showToastIfUnavailable, final long oneClickQuickBetStakeBetcoins) {
        this.videoRewardService.checkVideoRewardAndContinue(PromoService.PromoPlacement.NOT_ENOUGH_BETCOINS, null, null, new VideoRewardService.VideoRewardInfoListener() { // from class: org.betup.ui.MainActivity$$ExternalSyntheticLambda4
            @Override // org.betup.services.offer.VideoRewardService.VideoRewardInfoListener
            public final void onVideoRewardInfoUpdated(VideoRewardPlacementInfo videoRewardPlacementInfo) {
                MainActivity.this.m12858xda05418d(oneClickQuickBetStakeBetcoins, showToastIfUnavailable, videoRewardPlacementInfo);
            }
        });
    }

    /* renamed from: lambda$checkVideoAndShowNotEnoughBetcoinsOffer$2$org-betup-ui-MainActivity, reason: not valid java name */
    /* synthetic */ void m12858xda05418d(long j, boolean z, VideoRewardPlacementInfo videoRewardPlacementInfo) {
        if (isDestroyed()) {
            return;
        }
        if (videoRewardPlacementInfo.isAvailable() && !videoRewardPlacementInfo.isQuotaExhausted()) {
            DialogManager.showDialogSafely(NotEnoughBetcoinsVideoOfferDialogFragment.newInstance(videoRewardPlacementInfo.getPrizeAmount(), j), getSupportFragmentManager(), NotEnoughBetcoinsVideoOfferDialogFragment.TAG);
        } else if (z) {
            SnackbarHelper.showShort(this, R.string.not_enough_money);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void handleShowNotEnoughBetcoinsVideoOffer(ShowNotEnoughBetcoinsVideoOfferMessage message) {
        AnalyticsHelper.INSTANCE.logNotEnoughMoney("not_enough_betcoins_video_offer");
        checkVideoAndShowNotEnoughBetcoinsOffer(true, message != null ? message.getOneClickQuickBetStakeBetcoins() : 0L);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void processInetState(InetStateMessage message) {
        if (message.isConnected()) {
            this.inetError.setVisibility(8);
        } else {
            displayNoInet();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void processOfferAction(OfferMessage offerMessage) {
        ensureOffersInitialized();
        Log.d("OFFERS", "GOT MESSAGE type=" + offerMessage.getPromoType() + " placement=" + offerMessage.getPromoPlacement() + " offerService=" + this.offerService);
        OfferService offerService = this.offerService;
        if (offerService != null) {
            offerService.showOffer(offerMessage);
        }
    }

    private void ensureOffersInitialized() {
        if (this.offerService == null) {
            this.offerService = new DefaultOfferService(this, this, this.userService, this.promoService, this.abTestService, this.interstitialAdController, this.adUnitRegistry);
        }
    }

    private void displayNoInet() {
        this.inetError.setVisibility(0);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void processNoAuth(NoAuthMessage noAuthMessage) {
        if (this.mAuth.getCurrentUser() == null) {
            startActivityForResult(new Intent(this, (Class<?>) LoginActivity.class), REQUEST_LOGIN);
        } else {
            FirebaseAnalyticsHelper.logNoConnection(this, "no auth and no inet");
            displayNoInet();
        }
    }

    private void processGotLogin(int resultCode) {
        Log.d("LOGINTEST", "processGotLogin called with resultCode: " + resultCode);
        if (resultCode == -1) {
            Log.d("LOGINTEST", "Login successful, invalidating caches and initializing ads");
            invalidateAllUserCaches();
            this.justLoggedIn = true;
            if (!this.adsInitializer.isInitialized()) {
                this.adsInitializer.bindActivity(this);
                this.adsInitializer.init(this);
            }
            processAuthState(this.mAuth);
            return;
        }
        if (resultCode == 2) {
            Log.d("LOGINTEST", "User exited login, finishing MainActivity");
            finish();
        } else {
            if (this.userService.isRegistered()) {
                return;
            }
            Log.d("LOGINTEST", "User not registered, starting LoginActivity again");
            startActivityForResult(new Intent(this, (Class<?>) LoginActivity.class), REQUEST_LOGIN);
        }
    }

    private void refreshInterstitialRulesAsync() {
        PromoInterstitialRulesSync promoInterstitialRulesSync;
        FirebaseAuth firebaseAuth = this.mAuth;
        if (firebaseAuth == null || firebaseAuth.getCurrentUser() == null || (promoInterstitialRulesSync = this.promoInterstitialRulesSync) == null) {
            return;
        }
        promoInterstitialRulesSync.refreshWhenIdle("main-activity", 30000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processAuthState(FirebaseAuth mAuth) {
        Log.d("LOGINTEST", "processAuthState called, currentUser: " + (mAuth.getCurrentUser() != null ? mAuth.getCurrentUser().getUid() : AbstractJsonLexerKt.NULL));
        if (mAuth.getCurrentUser() != null) {
            cancelPendingAuthNullRedirect();
            Log.d("LOGINTEST", "User is authenticated, getting token and profile");
            mAuth.getCurrentUser().getIdToken(false).addOnCompleteListener(this, new OnCompleteListener() { // from class: org.betup.ui.MainActivity$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    MainActivity.this.m12868lambda$processAuthState$3$orgbetupuiMainActivity(task);
                }
            });
        } else if (!this.socialConnectionService.isConnecting()) {
            scheduleAuthNullRedirect();
        } else {
            Log.d("LOGINTEST", "No current user but connecting, waiting...");
        }
    }

    /* renamed from: lambda$processAuthState$3$org-betup-ui-MainActivity, reason: not valid java name */
    /* synthetic */ void m12868lambda$processAuthState$3$orgbetupuiMainActivity(Task task) {
        if (task.isSuccessful()) {
            Log.d("LOGINTEST", "MAIN GOT TOKEN = " + ((GetTokenResult) task.getResult()).getToken());
            this.tourHelper.resetTour();
            refreshInterstitialRulesAsync();
            this.userService.getProfile(this, UserService.InfoKind.GENERAL, UserService.InfoKind.PROGRESS, UserService.InfoKind.RANKS, UserService.InfoKind.STATS, UserService.InfoKind.FAVOURITES);
            return;
        }
        Log.e("LOGINTEST", "Failed to get token: " + (task.getException() != null ? task.getException().getMessage() : "unknown"));
        FirebaseAnalyticsHelper.logNoConnection(this, "processAuthState && task is not successful");
        displayNoInet();
    }

    private void cancelPendingAuthNullRedirect() {
        Runnable runnable = this.pendingAuthNullRedirect;
        if (runnable != null) {
            this.authCheckHandler.removeCallbacks(runnable);
            this.pendingAuthNullRedirect = null;
        }
    }

    private void scheduleAuthNullRedirect() {
        cancelPendingAuthNullRedirect();
        Runnable runnable = new Runnable() { // from class: org.betup.ui.MainActivity$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.this.m12869lambda$scheduleAuthNullRedirect$4$orgbetupuiMainActivity();
            }
        };
        this.pendingAuthNullRedirect = runnable;
        this.authCheckHandler.postDelayed(runnable, 500L);
    }

    /* renamed from: lambda$scheduleAuthNullRedirect$4$org-betup-ui-MainActivity, reason: not valid java name */
    /* synthetic */ void m12869lambda$scheduleAuthNullRedirect$4$orgbetupuiMainActivity() {
        this.pendingAuthNullRedirect = null;
        if (isFinishing() || isDestroyed()) {
            return;
        }
        if (this.mAuth.getCurrentUser() != null) {
            Log.d("LOGINTEST", "Auth re-check: user present, skipping Login redirect");
            processAuthState(this.mAuth);
        } else {
            Log.d("LOGINTEST", "No current user after delay, starting LoginActivity");
            startActivityForResult(new Intent(this, (Class<?>) LoginActivity.class), REQUEST_LOGIN);
        }
    }

    private void initAuth() {
        this.mAuthListener = new FirebaseAuth.AuthStateListener() { // from class: org.betup.ui.MainActivity$$ExternalSyntheticLambda9
            @Override // com.google.firebase.auth.FirebaseAuth.AuthStateListener
            public final void onAuthStateChanged(FirebaseAuth firebaseAuth) {
                MainActivity.this.processAuthState(firebaseAuth);
            }
        };
    }

    @Override // org.betup.ui.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        this.mAuth.addAuthStateListener(this.mAuthListener);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void processNavigation(NavigateMessage navigateMessage) {
        if (navigateMessage != null && navigateMessage.getTarget() == NavigateMessage.Target.OFFERS) {
            OfferNavigationGate.enqueueOrDispatch(this, navigateMessage);
        } else {
            dispatchNavigateMessage(navigateMessage);
        }
    }

    public void dispatchNavigateMessage(NavigateMessage navigateMessage) {
        Log.d("MainActivity", "========================================");
        Log.d("MainActivity", "🎯 processNavigation called!");
        Log.d("MainActivity", "Target: " + (navigateMessage != null ? navigateMessage.getTarget() : AbstractJsonLexerKt.NULL));
        Bundle bundle = navigateMessage != null ? navigateMessage.getBundle() : null;
        if (bundle != null) {
            Log.d("MainActivity", "Bundle contents:");
            for (String str : bundle.keySet()) {
                Log.d("MainActivity", "  - " + str + " = " + bundle.get(str));
            }
        } else {
            Log.d("MainActivity", "Bundle is null");
        }
        this.drawer.closeDrawer(this.drawerContainer);
        this.navigationService.processNavigation(this, navigateMessage);
        Log.d("MainActivity", "✅ processNavigation completed");
        Log.d("MainActivity", "========================================");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void navigateToLeaguesByDate(NavigateToLeaguesByDateMessage message) {
        Log.d("MainActivity", "navigateToLeaguesByDate: sportId=" + message.getSportId() + ", date=" + message.getSelectedDate());
        this.drawer.closeDrawer(this.drawerContainer);
        LeaguesByDateFragment newInstance = LeaguesByDateFragment.INSTANCE.newInstance(message.getSportId(), false);
        if (message.getSelectedDate() != null) {
            Bundle arguments = newInstance.getArguments() != null ? newInstance.getArguments() : new Bundle();
            arguments.putString("selectedDate", message.getSelectedDate());
            newInstance.setArguments(arguments);
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.container, newInstance).addToBackStack(null).commit();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void navigateToMatchesByDate(NavigateToMatchesByDateMessage message) {
        Log.d("MainActivity", "navigateToMatchesByDate: leagueId=" + message.getLeagueId() + ", date=" + message.getSelectedDate());
        this.drawer.closeDrawer(this.drawerContainer);
        MatchesByDateFragment newInstance = MatchesByDateFragment.INSTANCE.newInstance(message.getLeagueId(), message.getExpandedBets(), message.getLeagueName(), message.getLeaguePhoto());
        if (message.getSelectedDate() != null) {
            Bundle arguments = newInstance.getArguments() != null ? newInstance.getArguments() : new Bundle();
            arguments.putString("selectedDate", message.getSelectedDate());
            newInstance.setArguments(arguments);
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.container, newInstance).addToBackStack(null).commit();
    }

    @Override // org.betup.ui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        refreshInterstitialRulesAsync();
        try {
            SharedPreferences sharedPreferences = getSharedPreferences("analytics", 0);
            boolean z = sharedPreferences.getBoolean("tutorial_completed", false);
            int i = sharedPreferences.getInt("lifetime_bets", 0);
            long j = sharedPreferences.getLong("tutorial_completion_time", 0L);
            boolean z2 = sharedPreferences.getBoolean("post_tutorial_inactivity_logged", false);
            if (z && i == 0 && j > 0 && !z2) {
                long currentTimeMillis = (System.currentTimeMillis() - j) / 1000;
                if (currentTimeMillis >= 300) {
                    AnalyticsHelper.INSTANCE.logPostTutorialInactivity(currentTimeMillis);
                    sharedPreferences.edit().putBoolean("post_tutorial_inactivity_logged", true).apply();
                }
            }
        } catch (Exception e) {
            Log.e("MainActivity", "Error checking post-tutorial inactivity", e);
        }
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this);
        }
        if (!EventBus.getDefault().isRegistered(FollowersDialogStateManager.INSTANCE)) {
            EventBus.getDefault().register(FollowersDialogStateManager.INSTANCE);
        }
        Timer timer = this.cacheTimer;
        if (timer != null) {
            timer.cancel();
            this.cacheTimer.purge();
            this.cacheTimer = null;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        NetworkReceiver networkReceiver = new NetworkReceiver();
        this.networkReceiver = networkReceiver;
        registerReceiver(networkReceiver, intentFilter);
        OfferService offerService = this.offerService;
        if (offerService != null) {
            offerService.onResume();
        }
        TourHelper tourHelper = this.tourHelper;
        if (tourHelper != null) {
            tourHelper.onResume();
        }
        BalanceDisplay balanceDisplay = this.betupBalanceDisplay;
        if (balanceDisplay != null) {
            balanceDisplay.onResume();
        }
        PushEventsService pushEventsService = this.pushEventsService;
        if (pushEventsService != null) {
            pushEventsService.onResume();
        }
        this.adsInitializer.bindActivity(this);
        this.videoRewardService.attach(this, this);
        Log.d("MainActivity", "Re-registering In-App Messaging click listener in onResume()");
        InAppMessagingLinkHandler.INSTANCE.setup();
        this.analyticsService.sendSessionStarted(getBaseContext());
        this.presentationCoordinator.refreshAndShowIfEligible();
    }

    @Override // org.betup.ui.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        cancelPendingAuthNullRedirect();
        FirebaseAuth.AuthStateListener authStateListener = this.mAuthListener;
        if (authStateListener != null) {
            this.mAuth.removeAuthStateListener(authStateListener);
        }
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
        if (EventBus.getDefault().isRegistered(FollowersDialogStateManager.INSTANCE)) {
            EventBus.getDefault().unregister(FollowersDialogStateManager.INSTANCE);
        }
        new IntentFilter().addAction("android.net.conn.CONNECTIVITY_CHANGE");
        try {
            unregisterReceiver(this.networkReceiver);
        } catch (IllegalArgumentException unused) {
            Log.d("NETWORK", "NETWORK STATE RECEIVER was not registered");
        }
        OfferService offerService = this.offerService;
        if (offerService != null) {
            offerService.onStop();
        }
        TourHelper tourHelper = this.tourHelper;
        if (tourHelper != null) {
            tourHelper.onStop();
        }
        BalanceDisplay balanceDisplay = this.betupBalanceDisplay;
        if (balanceDisplay != null) {
            balanceDisplay.onStop();
        }
        PushEventsService pushEventsService = this.pushEventsService;
        if (pushEventsService != null) {
            pushEventsService.onStop();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Timer timer = this.cacheTimer;
        if (timer != null) {
            timer.cancel();
            this.cacheTimer.purge();
            this.cacheTimer = null;
        }
        OfferService offerService = this.offerService;
        if (offerService != null) {
            offerService.onPause();
        }
        BalanceDisplay balanceDisplay = this.betupBalanceDisplay;
        if (balanceDisplay != null) {
            balanceDisplay.onPause();
        }
        PushEventsService pushEventsService = this.pushEventsService;
        if (pushEventsService != null) {
            pushEventsService.onPause();
        }
        this.videoRewardService.detach(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        OfferNavigationGate.cancelPending();
        getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(this.screenTrackingCallbacks);
        this.presentationCoordinator.unbind();
        this.interstitialAdCoordinator.unbind();
        this.rewardedVideoOfferCoordinator.unbind();
        super.onDestroy();
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
        if (EventBus.getDefault().isRegistered(FollowersDialogStateManager.INSTANCE)) {
            EventBus.getDefault().unregister(FollowersDialogStateManager.INSTANCE);
        }
        this.videoRewardService.detach(this);
        BattleNavigationManager battleNavigationManager = this.battleNavigationManager;
        if (battleNavigationManager != null) {
            battleNavigationManager.destroy();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void processServerDownMessage(ServerDownMessage serverDownMessage) {
        if (this.serverErrorsProcessor.processMessage(this, serverDownMessage) == FetchStat.NO_CONNECTION) {
            FirebaseAnalyticsHelper.logNoConnection(this, "server unavailable: no connection reason");
        }
    }

    @Override // org.betup.ui.MenuBarsController
    public void updateTabMenu(TabMenuItem tabMenuItem) {
        this.menuView.select(tabMenuItem);
    }

    @Override // org.betup.ui.MenuBarsController
    public TabMenuItem getCurrent() {
        return this.menuView.getCurrent();
    }

    @Override // org.betup.ui.MenuBarsController
    public void restorePrevious() {
        this.menuView.restorePrevious();
    }

    private void drawerOptions() {
        final ComposeView composeView = this.drawerContainer;
        if (composeView == null) {
            return;
        }
        final UserService userService = this.userService;
        final DrawerLayout drawerLayout = this.drawer;
        final PushStorageProvider pushStorageProvider = this.pushStorageProvider;
        final int i = this.eventsCountUpdateKey;
        composeView.setContent(new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.MainActivity.27
            @Override // kotlin.jvm.functions.Function2
            public Unit invoke(Composer composer, Integer integer) {
                DrawerContentKt.DrawerContentForJava(userService, pushStorageProvider, i, new Function0<Unit>() { // from class: org.betup.ui.MainActivity.27.1
                    @Override // kotlin.jvm.functions.Function0
                    public Unit invoke() {
                        drawerLayout.closeDrawer(composeView);
                        return Unit.INSTANCE;
                    }
                }, new Function0<Unit>() { // from class: org.betup.ui.MainActivity.27.2
                    @Override // kotlin.jvm.functions.Function0
                    public Unit invoke() {
                        this.onAvatarIconClick();
                        return Unit.INSTANCE;
                    }
                }, new Function0<Unit>() { // from class: org.betup.ui.MainActivity.27.3
                    @Override // kotlin.jvm.functions.Function0
                    public Unit invoke() {
                        SignUpDialogFragment.showDialog(this, null);
                        return Unit.INSTANCE;
                    }
                }, composer, integer.intValue());
                return Unit.INSTANCE;
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // org.betup.services.user.UserService.UserInfoListener
    public void onProfileFetched(FullUserProfileModel fullUserProfileModel, Set<UserService.InfoKind> updated, FetchStat stat) {
        if (stat != FetchStat.SUCCESS) {
            if (stat == FetchStat.NO_CONNECTION) {
                FirebaseAnalyticsHelper.logNoConnection(this, "profile fetched: no inet");
                displayNoInet();
                return;
            } else if (stat == FetchStat.NO_AUTH) {
                processNoAuth(null);
                return;
            }
        }
        if (stat != FetchStat.SUCCESS) {
            return;
        }
        try {
            String num = fullUserProfileModel.getUserModel().getId() != null ? fullUserProfileModel.getUserModel().getId().toString() : "";
            Integer valueOf = fullUserProfileModel.getUserProgressModel() != null ? Integer.valueOf(fullUserProfileModel.getUserProgressModel().getLevel()) : null;
            AnalyticsHelper analyticsHelper = AnalyticsHelper.INSTANCE;
            if (valueOf == null) {
                valueOf = null;
            }
            analyticsHelper.setUserProperties(num, "", valueOf);
            SharedPreferences sharedPreferences = getSharedPreferences("analytics", 0);
            if (!sharedPreferences.contains("registration_timestamp")) {
                sharedPreferences.edit().putLong("registration_timestamp", System.currentTimeMillis()).apply();
            }
        } catch (Exception e) {
            Log.e("MainActivity", "Error setting analytics user properties", e);
        }
        if (!this.tourHelper.isTour()) {
            this.tourHelper.setIsTour((TourConfig.TOUR_VARIANT.equals(TourConfig.TOUR_VARIANT) || fullUserProfileModel.getUserModel().isTutorialComplete()) ? false : true);
        }
        StringBuilder append = new StringBuilder("Tour state - isTour: ").append(this.tourHelper.isTour()).append(", tutorialComplete: ").append(fullUserProfileModel.getUserModel().isTutorialComplete()).append(", shouldShowNewTour: ");
        TourComposeHelper tourComposeHelper = this.tourComposeHelper;
        Log.d("TourMainActivity", append.append(tourComposeHelper != null ? tourComposeHelper.shouldShowTour() : false).toString());
        InviteHelper.genFirebaseLink(this, fullUserProfileModel.getUserModel().getReferralCode());
        this.pushTokenService.sync();
        drawerOptions();
        String invited = InviteHelper.getInvited(getApplicationContext());
        String referralCode = this.userService.getShortProfile().getUserModel().getReferralCode();
        updateBetslipMessage(new UpdateBetslipMessage(this.betListAppender.getBetsCount()));
        if (invited != null && !invited.equals(referralCode)) {
            this.v7ReferralInteractor.load(this.inviteCodeListener, invited);
            InviteHelper.clear(getApplicationContext());
        }
        if (this.userService.getShortProfile().getUserModel().getTimezone() == null) {
            this.v7UpdateTimezoneInteractor.load(null, TimeZone.getDefault().getID());
        }
        String appVersion = this.userService.getShortProfile().getUserModel().getAppVersion();
        String valueOf2 = String.valueOf(BuildConfig.VERSION_CODE);
        if (appVersion == null || !appVersion.equals(valueOf2)) {
            this.v7UpdateAppVersionInteractor.load(null, valueOf2);
        }
        if (this.justLoggedIn) {
            Log.d("LOGINTEST", "Just logged in, navigating to Home and clearing back stack");
            this.justLoggedIn = false;
            getSupportFragmentManager().popBackStack((String) null, 1);
            processNavigation(new NavigateMessage(NavigateMessage.Target.HOME, null));
        } else {
            openHomeFragment();
        }
        processDeepLinking(getIntent().getExtras());
        FirebaseMessaging.getInstance().subscribeToTopic("news");
        TourComposeHelper tourComposeHelper2 = this.tourComposeHelper;
        if (tourComposeHelper2 != null) {
            tourComposeHelper2.resetTour();
            Log.d("TourMainActivity", "Tour state reset for testing");
        }
        TourComposeHelper tourComposeHelper3 = this.tourComposeHelper;
        if (tourComposeHelper3 != null && tourComposeHelper3.shouldShowTour() && isVisible()) {
            Log.d("TourMainActivity", "Starting new Compose tour");
            TourHelper tourHelper = this.tourHelper;
            if (tourHelper != null) {
                tourHelper.hideTours();
            }
            this.tourComposeHelper.startTour();
            ComposeView composeView = this.tourOverlayView;
            if (composeView != null) {
                composeView.setVisibility(4);
            }
            MenuView menuView = this.menuView;
            if (menuView != null && menuView.getCurrent() == TabMenuItem.HOME && this.menuView != null) {
                Log.d("TourMainActivity", "Dimming menu tabs except MATCHES");
                this.menuView.dimTabsExcept(TabMenuItem.MATCHES);
            }
        } else if (isVisible() && isTour() && !TourConfig.TOUR_VARIANT.equals(TourConfig.TOUR_VARIANT)) {
            Log.d("TourMainActivity", "Falling back to old tour system");
            ComposeView composeView2 = this.tourOverlayView;
            if (composeView2 != null) {
                composeView2.setVisibility(8);
            }
            TourHelper tourHelper2 = this.tourHelper;
            if (tourHelper2 != null) {
                tourHelper2.start(this.menuView.getView(TabMenuItem.MATCHES));
            }
        } else {
            ComposeView composeView3 = this.tourOverlayView;
            if (composeView3 != null) {
                composeView3.setVisibility(8);
            }
        }
        ensureOffersInitialized();
        this.pushEventsService.processPossiblePush(this.waitingBundle, true);
        this.waitingBundle = null;
        this.chatService.refreshUnreadMessagesCount();
    }

    /* renamed from: org.betup.ui.MainActivity$28, reason: invalid class name */
    class AnonymousClass28 implements BaseCachedSharedInteractor.OnFetchedListener<ReferralResponse, String> {
        AnonymousClass28() {
        }

        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public void onFetched(FetchedResponseMessage<ReferralResponse, String> responseMessage) {
            if (responseMessage.getStat() != FetchStat.SUCCESS) {
                return;
            }
            new InfoDialog.Builder(MainActivity.this).allowDismiss(true).title(MainActivity.this.getString(R.string.code_accepted)).desc(MainActivity.this.getString(R.string.code_accepted_desc)).money(responseMessage.getModel().getMoneyGet()).dismissOnFirstButtonClick(true).dismissOnSecondButtonClick(true).dismissListener(new DialogInterface.OnDismissListener() { // from class: org.betup.ui.MainActivity$28$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    MainActivity.AnonymousClass28.this.m12870lambda$onFetched$0$orgbetupuiMainActivity$28(dialogInterface);
                }
            }).build().show();
        }

        /* renamed from: lambda$onFetched$0$org-betup-ui-MainActivity$28, reason: not valid java name */
        /* synthetic */ void m12870lambda$onFetched$0$orgbetupuiMainActivity$28(DialogInterface dialogInterface) {
            MainActivity.this.userService.invalidate(UserService.InfoKind.PROGRESS);
            MainActivity.this.userService.syncProfile(UserService.InfoKind.PROGRESS);
        }
    }

    public void openHomeFragment() {
        if (isStopped() || getSupportFragmentManager().getBackStackEntryCount() != 0) {
            return;
        }
        processNavigation(new NavigateMessage(NavigateMessage.Target.HOME, null));
        this.stackSize = 0;
    }

    public void onChatsClick() {
        this.drawer.closeDrawer(this.drawerContainer);
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.MESSAGES, null));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void processBettingSheet(BettingSheetStateMessage message) {
        if (message == null || isFinishing()) {
            return;
        }
        if (message.getState() == BettingSheetStateMessage.State.HIDE) {
            dismissBettingSheetDialog();
            return;
        }
        if (message.getState() != BettingSheetStateMessage.State.SHOW) {
            return;
        }
        Log.d("FirstBetFlow", "MainActivity [4] processBettingSheet - SHOW received, showing BettingSheetDialog");
        TourComposeHelper tourComposeHelper = this.tourComposeHelper;
        if (tourComposeHelper != null && tourComposeHelper.isTourActive()) {
            Log.d("TourFlow", "MainActivity - BettingSheetStateMessage.SHOW received during tour, notifying tour");
            this.tourComposeHelper.onBettingSheetShown();
        }
        showBettingSheetDialog();
    }

    private void dismissBettingSheetDialog() {
        DialogManager dialogManager = DialogManager.INSTANCE;
        DialogManager.dismissDialogsWithTags(getSupportFragmentManager(), "BettingSheetDialog");
    }

    private void showBettingSheetDialog() {
        BetsController betsController = this.betsController;
        if (betsController != null && betsController.isOneClickPlacementInProgress()) {
            Log.d("FirstBetFlow", "MainActivity - skipping BettingSheetDialog during one-click placement");
            return;
        }
        DialogManager dialogManager = DialogManager.INSTANCE;
        DialogManager.reconcileTrackedDialogsWith(getSupportFragmentManager());
        BetsController betsController2 = this.betsController;
        if (betsController2 != null) {
            betsController2.syncBetslipFromStorage();
            applyOneClickStakeToQuickBetIfEnabled();
        }
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("BettingSheetDialog");
        if ((findFragmentByTag instanceof BettingSheetDialog) && findFragmentByTag.isAdded()) {
            Log.d("FirstBetFlow", "MainActivity - BettingSheetDialog already added, restoring visibility");
            BettingSheetDialog bettingSheetDialog = (BettingSheetDialog) findFragmentByTag;
            if (bettingSheetDialog.getDialog() == null || bettingSheetDialog.getDialog().getWindow() == null) {
                return;
            }
            bettingSheetDialog.getDialog().getWindow().getDecorView().setVisibility(0);
            return;
        }
        BettingSheetDialog bettingSheetDialog2 = new BettingSheetDialog();
        DialogManager dialogManager2 = DialogManager.INSTANCE;
        if (DialogManager.showDialogReplacingPrevious(bettingSheetDialog2, this, "BettingSheetDialog")) {
            Log.d("FirstBetFlow", "MainActivity - BettingSheetDialog shown");
        } else {
            Log.w("FirstBetFlow", "MainActivity - BettingSheetDialog deferred or failed to show");
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onOneClickFirstBetAdded(OneClickFirstBetAddedMessage message) {
        if (message == null || isFinishing()) {
            return;
        }
        TourComposeHelper tourComposeHelper = this.tourComposeHelper;
        if (tourComposeHelper != null && tourComposeHelper.isTourActive()) {
            processBettingSheet(new BettingSheetStateMessage(BettingSheetStateMessage.State.SHOW));
        } else {
            this.betsController.startOneClickPlacementAfterBetAdded(this, message.getStake());
        }
    }

    private void applyOneClickStakeToQuickBetIfEnabled() {
        long betupUserIdOrZero = this.userService.getBetupUserIdOrZero();
        if (betupUserIdOrZero <= 0 || this.betsController == null || !this.localPreferencesService.isOneClickBetEnabled(betupUserIdOrZero)) {
            return;
        }
        this.betsController.onAmountChange(Long.valueOf(this.localPreferencesService.getOneClickBetStake(betupUserIdOrZero)));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onBetPlacedSuccess(BetPlacedSuccessMessage message) {
        FirebaseAuth firebaseAuth;
        if (message == null || isFinishing() || (firebaseAuth = this.mAuth) == null || firebaseAuth.getCurrentUser() == null) {
            return;
        }
        TourComposeHelper tourComposeHelper = this.tourComposeHelper;
        if ((tourComposeHelper == null || !tourComposeHelper.isTourActive()) && PushPermissionAfterBetHelper.shouldOfferPromptAfterBetPlaced(this)) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: org.betup.ui.MainActivity$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.this.m12865lambda$onBetPlacedSuccess$7$orgbetupuiMainActivity();
                }
            });
        }
    }

    /* renamed from: lambda$onBetPlacedSuccess$7$org-betup-ui-MainActivity, reason: not valid java name */
    /* synthetic */ void m12865lambda$onBetPlacedSuccess$7$orgbetupuiMainActivity() {
        if (isFinishing()) {
            return;
        }
        DialogManager dialogManager = DialogManager.INSTANCE;
        if (DialogManager.hasTrackedDialogShowing()) {
            final Runnable[] runnableArr = new Runnable[1];
            runnableArr[0] = new Runnable() { // from class: org.betup.ui.MainActivity$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.this.m12864lambda$onBetPlacedSuccess$6$orgbetupuiMainActivity(runnableArr);
                }
            };
            DialogManager dialogManager2 = DialogManager.INSTANCE;
            DialogManager.registerOnLastTrackedDialogDismissed(runnableArr[0]);
            return;
        }
        NotificationsPermissionUtil.showEducationDialogIfNeeded(this);
    }

    /* renamed from: lambda$onBetPlacedSuccess$6$org-betup-ui-MainActivity, reason: not valid java name */
    /* synthetic */ void m12864lambda$onBetPlacedSuccess$6$orgbetupuiMainActivity(Runnable[] runnableArr) {
        DialogManager dialogManager = DialogManager.INSTANCE;
        DialogManager.unregisterOnLastTrackedDialogDismissed(runnableArr[0]);
        if (isFinishing()) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: org.betup.ui.MainActivity$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.this.m12863lambda$onBetPlacedSuccess$5$orgbetupuiMainActivity();
            }
        });
    }

    /* renamed from: lambda$onBetPlacedSuccess$5$org-betup-ui-MainActivity, reason: not valid java name */
    /* synthetic */ void m12863lambda$onBetPlacedSuccess$5$orgbetupuiMainActivity() {
        if (isFinishing()) {
            return;
        }
        NotificationsPermissionUtil.showEducationDialogIfNeeded(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void showBetPlacedDialog(ShowBetPlacedDialogMessage message) {
        if (message != null) {
            Log.d("TourFlow", "MainActivity - ShowBetPlacedDialogMessage received, showing BetPlacedDialog for bet ID: " + message.getBetId());
            BetPlacedDialog newInstance = BetPlacedDialog.INSTANCE.newInstance(message.getBetId());
            DialogManager dialogManager = DialogManager.INSTANCE;
            DialogManager.showDialogSafely(newInstance, this, "BetPlacedDialog");
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void processOddsDialogVisibility(OddsDialogVisibilityMessage message) {
        Fragment findFragmentByTag;
        if (message == null || (findFragmentByTag = getSupportFragmentManager().findFragmentByTag("BettingSheetDialog")) == null || !(findFragmentByTag instanceof BettingSheetDialog)) {
            return;
        }
        BettingSheetDialog bettingSheetDialog = (BettingSheetDialog) findFragmentByTag;
        if (message.getState() == OddsDialogVisibilityMessage.State.VISIBLE) {
            if (bettingSheetDialog.getDialog() == null || bettingSheetDialog.getDialog().getWindow() == null) {
                return;
            }
            bettingSheetDialog.getDialog().getWindow().getDecorView().setVisibility(8);
            return;
        }
        if (message.getState() != OddsDialogVisibilityMessage.State.HIDDEN || bettingSheetDialog.getDialog() == null || bettingSheetDialog.getDialog().getWindow() == null) {
            return;
        }
        bettingSheetDialog.getDialog().getWindow().getDecorView().setVisibility(0);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void displayEditFavouritesDialog(DisplayEditFavouritesDialogMessage message) {
        Log.d("MainActivity", "Received favourite type: " + message.getFavouriteType());
        EditFavouritesDialog.INSTANCE.newInstance(message.getFavouriteType()).show(getSupportFragmentManager(), "EditFavouritesDialog");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void displayFollowersDialog(DisplayFollowersDialogMessage message) {
        Log.d("MainActivity", "Received followers dialog request for userId: " + message.getUserId() + ", lastSelectedTab: " + message.getLastSelectedTabIndex());
        FollowersDialog.INSTANCE.newInstance(message.getUserId(), message.getLastSelectedTabIndex(), false).show(getSupportFragmentManager(), "FollowersDialog");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void displayRankingRewardDialog(DisplayRankingRewardDialogMessage message) {
        RankingRewardDialogFragment.showDialog(this, message.getPlace(), message.getAmount(), message.getTitle(), message.getBody(), message.getPeriod());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void showDailyBonusDialog(ShowDailyBonusDialogMessage message) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.executePendingTransactions();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(DailyBonusDialogFragment.FRAGMENT_TAG);
        if (findFragmentByTag != null) {
            if (findFragmentByTag.isVisible()) {
                Log.d("MainActivity", "Daily Bonus Dialog already visible, skipping");
                return;
            } else {
                Log.d("MainActivity", "Removing stale Daily Bonus Dialog fragment");
                supportFragmentManager.beginTransaction().remove(findFragmentByTag).commitNowAllowingStateLoss();
                supportFragmentManager.popBackStack("daily_bonus", 1);
            }
        }
        Log.d("MainActivity", "Showing Daily Bonus Dialog via EventBus");
        this.dailyBonusController.markAutoDailyPromptConsumedForProcess();
        new DailyBonusDialogFragment().show(supportFragmentManager, DailyBonusDialogFragment.FRAGMENT_TAG);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void displayQuestionDialog(final QuestionDialogMessage message) {
        Log.d("MainActivity", "Received question dialog request: " + message.getQuestion());
        QuestionDialog.INSTANCE.newInstance("", message.getQuestion(), new Function0() { // from class: org.betup.ui.MainActivity$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainActivity.lambda$displayQuestionDialog$8(QuestionDialogMessage.this);
            }
        }, new Function0() { // from class: org.betup.ui.MainActivity$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainActivity.lambda$displayQuestionDialog$9(QuestionDialogMessage.this);
            }
        }).show(getSupportFragmentManager(), "QuestionDialog");
    }

    static /* synthetic */ Unit lambda$displayQuestionDialog$8(QuestionDialogMessage questionDialogMessage) {
        if (questionDialogMessage.getOnYesClick() != null) {
            questionDialogMessage.getOnYesClick().run();
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ Unit lambda$displayQuestionDialog$9(QuestionDialogMessage questionDialogMessage) {
        if (questionDialogMessage.getOnNoClick() != null) {
            questionDialogMessage.getOnNoClick().run();
        }
        return Unit.INSTANCE;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void displayCompetitionInfoDialog(OpenCompetitionInfoDialogEvent event) {
        Log.d("MainActivity", "Received competition info dialog request for jackpot: " + event.getJackpot());
        CompetitionInfoDialogFragment.INSTANCE.newInstance(event.getJackpot()).show(getSupportFragmentManager(), "CompetitionInfoDialog");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void displayCompetitionsPreviewDialog(OpenCompetitionsPreviewEvent event) {
        Log.d("MainActivity", "Received competitions preview dialog request for competition ID: " + event.getCompetitionId());
        CompetitionsPreviewFragment.newInstance(event.getCompetitionId(), event.getCompetitionIdP(), event.getGetIsWon()).show(getSupportFragmentManager(), "CompetitionsPreviewDialog");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void processDailyChange(DailyBonusButtonUpdate dailyBonusButtonUpdate) {
        Log.d("DAILYTEST", "UPDATE DAILY DRAWER " + dailyBonusButtonUpdate.isState());
    }

    public void onAchievementsClick() {
        this.drawer.closeDrawer(this.drawerContainer);
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.ACHIEVEMENTS, null));
    }

    public void onAvatarIconClick() {
        setTitle(getString(R.string.user_profile_header));
        Bundle bundle = new Bundle();
        bundle.putInt("id", this.userService.getShortProfile().getUserModel().getId().intValue());
        bundle.putBoolean("return", false);
        processNavigation(new NavigateMessage(NavigateMessage.Target.USER_DETAILS, bundle));
        this.drawer.closeDrawers();
    }

    @Override // org.betup.ui.TransactionController
    public void newInStack() {
        int i = this.stackSize;
        if (i < 3) {
            this.stackSize = i + 1;
        }
    }

    public void syncStackSizeFromBackStack() {
        this.stackSize = Math.min(getSupportFragmentManager().getBackStackEntryCount(), 3);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.drawer.isDrawerOpen(GravityCompat.END)) {
            this.drawer.closeDrawer(GravityCompat.END);
            return;
        }
        if (this.interstitialAdCoordinator.handleHardwareBack(this)) {
            return;
        }
        BackPressedController.BackPressedListener backPressedListener = this.backPressedListener;
        if (backPressedListener == null || backPressedListener.onBackPressed()) {
            pressBack();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void updateBetslipMessage(UpdateBetslipMessage updateBetslipMessage) {
        this.menuView.updateCounter(Integer.valueOf(updateBetslipMessage.getCount()));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void signOut(SignOutMessage signOutMessage) {
        invalidateAllUserCaches();
        this.userService.clearUserInfo();
        this.promoInterstitialRulesSync.clear();
        this.matchInfoInteractor.invalidate();
        this.betListAppender.clearBets();
        this.tourHelper.resetTour();
        FirebaseAuth.getInstance().signOut();
        Intent intent = new Intent(this, (Class<?>) LoginActivity.class);
        intent.addFlags(335544320);
        startActivity(intent);
        finish();
    }

    private void invalidateAllUserCaches() {
        Log.d("MainActivity", "Invalidating all user-related caches");
        this.dailyBonusController.reset();
        this.homeVideoBonusController.reset();
        this.v7DailyBonusInteractor.invalidate(Unit.INSTANCE);
        this.v7UserAchievementsInteractor.invalidate(0);
        this.newActiveCompetitionsInteractor.invalidate(0L);
        this.newShopItemsInteractor.invalidate((Void) null);
        this.shopLayoutInteractor.invalidate((Void) null);
        this.singleShopInteractor.invalidate((String) null);
        Log.d("MainActivity", "All user-related caches invalidated - daily bonus, achievements, competitions, shop");
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        ActivitySavedStateGuard.stripHeavyState(outState);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        this.shareService.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 777) {
            processGotLogin(resultCode);
        } else if (requestCode == 234) {
            CreateBattleDialogFragment.INSTANCE.newInstance(null).show(getSupportFragmentManager(), CreateBattleDialogFragment.class.toString());
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUserShareAction(ShareMessage shareMessage) {
        Log.d("SHARE_OFFER", "MESSAGE RECEIVED!!! " + shareMessage.getTarget());
        this.shareService.makeShare(shareMessage);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onImageChanged(ChangePotoUrlModel changePotoUrlModel) {
        this.userService.getShortProfile().getUserModel().setPhotoUrl(changePotoUrlModel.getPhotoUrl());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (this.userService.isRegistered()) {
            this.pushEventsService.processPossiblePush(intent.getExtras(), true);
        } else {
            this.waitingBundle = intent.getExtras();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void displayUpgradeAccount(UpgradeAccountMessage message) {
        new InfoDialog.Builder(this).title(getString(R.string.upgrade_account)).subtitle(getString(R.string.should_register)).firstButtonTitle(getString(R.string.upgrade)).icon(this.userService.getShortProfile().getUserModel().getPhotoUrl()).allowDismiss(true).dismissOnSecondButtonClick(true).dismissOnFirstButtonClick(true).onFirstButtonClick(new OnDialogButtonClickListener() { // from class: org.betup.ui.MainActivity$$ExternalSyntheticLambda5
            @Override // org.betup.ui.dialogs.OnDialogButtonClickListener
            public final void onClick(Dialog dialog) {
                MainActivity.this.m12860lambda$displayUpgradeAccount$10$orgbetupuiMainActivity(dialog);
            }
        }).build().show();
    }

    /* renamed from: lambda$displayUpgradeAccount$10$org-betup-ui-MainActivity, reason: not valid java name */
    /* synthetic */ void m12860lambda$displayUpgradeAccount$10$orgbetupuiMainActivity(Dialog dialog) {
        Intent intent = new Intent(this, (Class<?>) LoginActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("action", AuthFragment.Action.UPGRADE);
        intent.putExtras(bundle);
        startActivityForResult(intent, REQUEST_LOGIN);
    }

    @Override // org.betup.services.offer.AdsInitializer.OnAdInitializeCompletedListener
    public void onAdInitialized() {
        ensureOffersInitialized();
        OfferService offerService = this.offerService;
        if (offerService != null) {
            offerService.onResume();
        }
        if (!this.userService.isRegistered() || TourConfig.TOUR_VARIANT.equals(TourConfig.TOUR_VARIANT)) {
            return;
        }
        this.tourHelper.start(this.menuView.getView(TabMenuItem.MATCHES));
    }

    private void processDeepLinking(Bundle args) {
        if (!this.userService.isRegistered()) {
            Log.d("SHARE_OFFER", "EMPTY USER MODEL!");
            return;
        }
        int betLinkId = SharedPrefs.getBetLinkId(this);
        if (betLinkId != 0) {
            int betLinkOwnerUserId = SharedPrefs.getBetLinkOwnerUserId(this);
            SharedPrefs.saveBetLinkId(this, 0);
            SharedPrefs.saveBetLinkOwnerUserId(this, 0);
            Bundle bundle = new Bundle();
            bundle.putSerializable("state", null);
            bundle.putSerializable(VKAttachments.TYPE_WIKI_PAGE, BetsPage.BETLIST);
            bundle.putInt("openBetId", betLinkId);
            if (betLinkOwnerUserId > 0) {
                bundle.putInt("openBetOwnerUserId", betLinkOwnerUserId);
            }
            Log.d("SHARE_OFFER", "NAVIGATING TO BET " + betLinkId + " ownerUserId=" + betLinkOwnerUserId);
            processNavigation(new NavigateMessage(NavigateMessage.Target.BETS, bundle));
            return;
        }
        int matchId = SharedPrefs.getMatchId(this);
        if (matchId != 0) {
            SharedPrefs.saveMatchLink(this, 0);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("matchId", matchId);
            Log.d("SHARE_OFFER", "NAVIGATING TO " + matchId);
            processNavigation(new NavigateMessage(NavigateMessage.Target.MATCH_DETAILS, bundle2));
            return;
        }
        Log.d("SHARE_OFFER", "NO MATCH " + matchId);
    }

    @Override // org.betup.ui.FilterController
    public void applyFilter(FilterController.FilterType filterType, FilterController.MatchesFilter matchesFilter) {
        this.filters.put(filterType, matchesFilter);
    }

    @Override // org.betup.ui.FilterController
    public FilterController.MatchesFilter getFilter(FilterController.FilterType filterType) {
        if (this.filters.get(filterType) != null) {
            return this.filters.get(filterType);
        }
        int i = AnonymousClass29.$SwitchMap$org$betup$ui$FilterController$FilterType[filterType.ordinal()];
        return FilterController.MatchesFilter.ALL;
    }

    @Override // org.betup.ui.BackPressedController
    public void setOnBackPressedListener(BackPressedController.BackPressedListener listener) {
        this.backPressedListener = listener;
    }

    @Override // org.betup.ui.BackPressedController
    public void removeListener() {
        this.backPressedListener = null;
    }

    @Override // org.betup.ui.FilterController
    public void resetFilters() {
        this.filters.clear();
    }

    @Override // org.betup.ui.ProgressDisplay
    public void displayProgress() {
        runOnUiThread(new Runnable() { // from class: org.betup.ui.MainActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.this.m12859lambda$displayProgress$11$orgbetupuiMainActivity();
            }
        });
    }

    /* renamed from: lambda$displayProgress$11$org-betup-ui-MainActivity, reason: not valid java name */
    /* synthetic */ void m12859lambda$displayProgress$11$orgbetupuiMainActivity() {
        ProgressDialog progressDialog = this.progressDialog;
        if (progressDialog != null) {
            try {
                progressDialog.dismiss();
                this.progressDialog = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.progressDialog = ProgressDialog.showDialog(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void processEventCountChanged(EventsCountMessage eventsCountMessage) {
        PushStorageProvider pushStorageProvider;
        this.eventsCountUpdateKey++;
        if (this.drawerContainer != null) {
            drawerOptions();
        }
        if (this.menuView == null || (pushStorageProvider = this.pushStorageProvider) == null) {
            return;
        }
        this.menuView.updateNotificationsCounter(Integer.valueOf(pushStorageProvider.getEventsCount()));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onTourAction(TourActionMessage message) {
        TourComposeHelper tourComposeHelper = this.tourComposeHelper;
        if (tourComposeHelper == null || !tourComposeHelper.isTourActive()) {
            return;
        }
        switch (AnonymousClass29.$SwitchMap$org$betup$bus$TourActionMessage$Action[message.getAction().ordinal()]) {
            case 1:
                this.tourComposeHelper.onSportButtonClicked();
                break;
            case 2:
                if (message.getId() != null) {
                    this.tourComposeHelper.onSportSelected(message.getId().longValue());
                    break;
                }
                break;
            case 3:
                if (message.getId() != null) {
                    this.tourComposeHelper.onLeagueSelected(message.getId().longValue());
                    break;
                }
                break;
            case 4:
                if (message.getId() != null) {
                    this.tourComposeHelper.onMatchSelected(message.getId().longValue());
                    break;
                }
                break;
            case 5:
                if (message.getId() != null) {
                    this.tourComposeHelper.onBetSelected(message.getId().longValue());
                    break;
                }
                break;
            case 6:
                this.tourComposeHelper.onBetPlaced(Integer.valueOf(message.getId().intValue()));
                break;
        }
    }

    /* renamed from: org.betup.ui.MainActivity$29, reason: invalid class name */
    static /* synthetic */ class AnonymousClass29 {
        static final /* synthetic */ int[] $SwitchMap$org$betup$bus$TourActionMessage$Action;
        static final /* synthetic */ int[] $SwitchMap$org$betup$ui$FilterController$FilterType;

        static {
            int[] iArr = new int[TourActionMessage.Action.values().length];
            $SwitchMap$org$betup$bus$TourActionMessage$Action = iArr;
            try {
                iArr[TourActionMessage.Action.SPORT_BUTTON_CLICKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$betup$bus$TourActionMessage$Action[TourActionMessage.Action.SPORT_SELECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$betup$bus$TourActionMessage$Action[TourActionMessage.Action.LEAGUE_SELECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$betup$bus$TourActionMessage$Action[TourActionMessage.Action.MATCH_SELECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$betup$bus$TourActionMessage$Action[TourActionMessage.Action.BET_SELECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$betup$bus$TourActionMessage$Action[TourActionMessage.Action.BET_PLACED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $SwitchMap$org$betup$ui$FilterController$FilterType = new int[FilterController.FilterType.values().length];
        }
    }

    @Override // org.betup.ui.ProgressDisplay
    public void hideProgress() {
        runOnUiThread(new Runnable() { // from class: org.betup.ui.MainActivity$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.this.m12861lambda$hideProgress$12$orgbetupuiMainActivity();
            }
        });
    }

    /* renamed from: lambda$hideProgress$12$org-betup-ui-MainActivity, reason: not valid java name */
    /* synthetic */ void m12861lambda$hideProgress$12$orgbetupuiMainActivity() {
        ProgressDialog progressDialog = this.progressDialog;
        if (progressDialog != null) {
            try {
                progressDialog.dismiss();
                this.progressDialog = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void betNumberTour(ShowBetNumTourMessage message) {
        EventBus.getDefault().post(new TourMessage.Builder(Tour.NUMBER_TOP).setSign(TourHelperSign.Side).setPosition(TourHelperPosition.Left).setTitle(getString(R.string.tour_betslip_title)).setSubtitle(getString(R.string.tour_betslip_desc)).setStyle(Overlay.Style.CIRCLE).setView(this.menuView.getView(TabMenuItem.BETS)).build());
    }

    @Override // org.betup.ui.tour.TourHelper
    public boolean isTour() {
        TourHelper tourHelper = this.tourHelper;
        return tourHelper != null && tourHelper.isTour();
    }

    @Override // org.betup.ui.tour.TourHelper
    public boolean wasShown(Tour type) {
        TourHelper tourHelper = this.tourHelper;
        return tourHelper == null || tourHelper.wasShown(type);
    }

    @Override // org.betup.ui.tour.TourHelper
    public void displayTour(TourMessage tourMessage) {
        TourHelper tourHelper = this.tourHelper;
        if (tourHelper != null) {
            tourHelper.displayTour(tourMessage);
        }
    }

    @Override // org.betup.ui.tour.TourHelper
    public void hideTours() {
        TourHelper tourHelper = this.tourHelper;
        if (tourHelper != null) {
            tourHelper.hideTours();
        }
    }

    @Override // org.betup.ui.tour.TourHelper
    public void setCompleted(Tour type) {
        TourHelper tourHelper = this.tourHelper;
        if (tourHelper != null) {
            tourHelper.setCompleted(type);
        }
    }

    @Override // org.betup.ui.tour.TourHelper
    public void setIsTour(boolean isTour) {
        TourHelper tourHelper = this.tourHelper;
        if (tourHelper != null) {
            tourHelper.setIsTour(isTour);
        }
    }

    @Override // org.betup.ui.tour.TourHelper
    public void start(View view) {
        TourHelper tourHelper = this.tourHelper;
        if (tourHelper != null) {
            tourHelper.start(view);
        }
    }

    @Override // org.betup.ui.tour.TourHelper
    public void complete() {
        TourHelper tourHelper = this.tourHelper;
        if (tourHelper != null) {
            tourHelper.complete();
        }
    }

    @Override // org.betup.ui.tour.TourHelper
    public void resetTour() {
        this.tourHelper.resetTour();
    }

    @Override // org.betup.ui.tour.TourHelper
    public boolean isCompleted() {
        TourHelper tourHelper = this.tourHelper;
        return tourHelper != null && tourHelper.isCompleted();
    }

    @Override // org.betup.ui.MenuBarsController
    public boolean isReady() {
        return this.drawerContainer != null;
    }

    public void setRestoreBettingSheetAfterShop(boolean restore) {
        this.restoreBettingSheetAfterShop = restore;
    }

    @Override // org.betup.ui.BackPressedController
    public void pressBack() {
        TourHelper tourHelper = this.tourHelper;
        if (tourHelper == null || !tourHelper.isTour() || this.tourHelper.isCompleted()) {
            if (this.restoreBettingSheetAfterShop) {
                this.restoreBettingSheetAfterShop = false;
                if (getSupportFragmentManager().findFragmentById(R.id.container) instanceof ShopBetcoinsFragmentK) {
                    getSupportFragmentManager().popBackStack();
                    EventBus.getDefault().post(new BettingSheetStateMessage(BettingSheetStateMessage.State.SHOW));
                    return;
                }
            }
            if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
                getSupportFragmentManager().popBackStack();
                syncStackSizeFromBackStack();
                return;
            }
            if (this.userService.isRegistered()) {
                if (getSupportFragmentManager().findFragmentById(R.id.container) instanceof HomeFragment) {
                    return;
                }
                FragmentTransactionHelper.with(getSupportFragmentManager()).clearStack();
                FragmentTransactionHelper.with(getSupportFragmentManager()).commit(new HomeFragment(), this);
            }
            syncStackSizeFromBackStack();
        }
    }

    @Override // org.betup.ui.MenuBarsController
    public void setBottomMenu(Object sender, BottomMenuProvider bottomMenuProvider) {
        if (bottomMenuProvider == null) {
            if (this.usingDefaultMenu || sender.hashCode() != this.senderHashcode) {
                return;
            } else {
                this.usingDefaultMenu = true;
            }
        } else {
            this.senderHashcode = sender.hashCode();
            this.usingDefaultMenu = false;
        }
        this.menuView.setMenuItems(this.bottomMenuProvider.buildMenu(this));
        if (this.pushStorageProvider != null && this.userService.isRegistered()) {
            this.pushStorageProvider.refreshEventCount(Integer.valueOf(this.userService.getShortProfile().getUserModel().getId().intValue()));
            this.menuView.updateNotificationsCounter(Integer.valueOf(this.pushStorageProvider.getEventsCount()));
        }
        this.menuView.hasItem(TabMenuItem.BETS);
    }

    @Override // org.betup.ui.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleService.onAttach(base));
    }

    @Override // org.betup.services.offer.OfferService
    public void showOffer(OfferMessage offerMessage) {
        ensureOffersInitialized();
        OfferService offerService = this.offerService;
        if (offerService != null) {
            offerService.showOffer(offerMessage);
        }
    }

    @Override // org.betup.services.offer.OfferService
    public boolean isAvailable(PromoType offer) {
        ensureOffersInitialized();
        OfferService offerService = this.offerService;
        return offerService != null && offerService.isAvailable(offer);
    }

    @Override // org.betup.services.drawer.DrawerController
    public void onDrawerClick() {
        if (this.drawer.isDrawerOpen(GravityCompat.END)) {
            this.drawer.closeDrawers();
        } else {
            this.drawer.openDrawer(GravityCompat.END);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onCurrencyTourMessage(BetcoinsTourMessage betcoinsTourMessage) {
        if (this.tourHelper.isTour()) {
            this.tourHelper.hideTours();
            EventBus.getDefault().post(new TourMessage.Builder(Tour.BETCOINS).setPosition(TourHelperPosition.Left).setSign(TourHelperSign.Finger).setTitle(getString(R.string.betcoins_tour_title)).setSubtitle(getString(R.string.betcoins_tour_desc)).setStyle(Overlay.Style.RECTANGLE).setView(this.betupBalanceDisplay.getBetcoinsView()).setListener(new View.OnClickListener() { // from class: org.betup.ui.MainActivity$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.this.m12867lambda$onCurrencyTourMessage$13$orgbetupuiMainActivity(view);
                }
            }).build());
        }
    }

    /* renamed from: lambda$onCurrencyTourMessage$13$org-betup-ui-MainActivity, reason: not valid java name */
    /* synthetic */ void m12867lambda$onCurrencyTourMessage$13$orgbetupuiMainActivity(View view) {
        onTourFinished(new TourFinishedMessage());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onTourFinished(TourFinishedMessage tourFinishedMessage) {
        TourState tourState;
        TourComposeHelper tourComposeHelper = this.tourComposeHelper;
        if (tourComposeHelper != null && (tourState = tourComposeHelper.getTourState()) != null) {
            boolean isTourActiveValue = tourState.getIsTourActiveValue();
            TourStep currentStepValue = tourState.getCurrentStepValue();
            if (!isTourActiveValue && currentStepValue == null) {
                Log.d("MainActivity", "Tour was skipped, not showing reward dialog");
                this.tourHelper.hideTours();
                this.tourHelper.setCompleted(Tour.TOUR_COMPLETED);
                return;
            }
        }
        android.app.Fragment findFragmentByTag = getFragmentManager().findFragmentByTag("TourCompletedDialog");
        if (findFragmentByTag != null && findFragmentByTag.isAdded()) {
            Log.d("MainActivity", "TourCompletedDialog already shown, skipping duplicate");
            return;
        }
        Fragment findFragmentByTag2 = getSupportFragmentManager().findFragmentByTag("TourCompletedDialog");
        if (findFragmentByTag2 != null && findFragmentByTag2.isAdded()) {
            Log.d("MainActivity", "TourCompletedDialog already shown (support), skipping duplicate");
            return;
        }
        this.tourHelper.hideTours();
        this.tourHelper.setCompleted(Tour.TOUR_COMPLETED);
        this.userService.invalidate(UserService.InfoKind.GENERAL, UserService.InfoKind.PROGRESS);
        this.userService.syncProfile(UserService.InfoKind.GENERAL, UserService.InfoKind.PROGRESS);
        TourCompletedDialogFragment.showDialog(getActivity(), getString(R.string.congratilations), getString(R.string.tour_end_dialog_subtitle), null, tourFinishedMessage.getTotalRewardAmount());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUserProfileUpdated(UserProfileUpdatedMessage userProfileUpdatedMessage) {
        Log.d("MainActivity", "UserProfileUpdatedMessage received - refreshing user balance");
        this.userService.invalidate(UserService.InfoKind.PROGRESS);
        this.userService.getProfile(this.betsController, UserService.InfoKind.PROGRESS);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onDrawerOpenMessageEvent() {
        this.betupBalanceDisplay.createBundleForShopNavigation(ShopDialogFragment.Tab.PACKS);
    }
}
