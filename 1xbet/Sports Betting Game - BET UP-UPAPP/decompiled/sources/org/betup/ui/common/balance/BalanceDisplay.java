package org.betup.ui.common.balance;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.appinvite.PreviewActivity;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.betup.R;
import org.betup.bus.NavigateMessage;
import org.betup.bus.UserBetStatisticsInvalidatedMessage;
import org.betup.model.local.entity.FullUserProfileModel;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.user.V7UserBetStatisticsInteractor;
import org.betup.model.remote.entity.user.NewUserBetStatisticsModel;
import org.betup.model.remote.entity.user.ShortUserProfileModel;
import org.betup.model.remote.entity.user.UserProgressModel;
import org.betup.services.experiments.ABTestService;
import org.betup.services.user.UserService;
import org.betup.ui.LifecycleListener;
import org.betup.ui.dialogs.ShopDialogFragment;
import org.betup.ui.tour.TourHelper;
import org.betup.utils.SnackbarHelper;
import org.betup.utils.balance.BalanceHolder;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class BalanceDisplay implements LifecycleListener, UserService.UserInfoListener, BalanceHolder.BalanceUpdateListener {
    private static final long STREAK_RELOAD_DELAY_MS = 2500;
    protected final ABTestService abTestService;
    private final BalanceHolder balanceHolder;
    private ToolbarHeaderComposeHost headerComposeHost;
    private ComposeView headerComposeView;
    private Context headerContext;
    private Runnable pendingDelayedStreakReload;
    private V7UserBetStatisticsInteractor streakInteractor;
    private Integer toolbarStreakCount;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewUserBetStatisticsModel, Integer> toolbarStreakListener;
    private final TourHelper tourHelper;
    protected final UserService userService;
    private long previousShopNavigationActionTime = 0;
    private long previousBalance = -1;
    private final Handler streakReloadHandler = new Handler(Looper.getMainLooper());

    @Override // org.betup.ui.LifecycleListener
    public void onStop() {
    }

    public BalanceDisplay(final UserService userService, ABTestService abTestService, TourHelper tourHelper, BalanceHolder balanceHolder) {
        this.userService = userService;
        this.abTestService = abTestService;
        this.tourHelper = tourHelper;
        this.balanceHolder = balanceHolder;
        this.toolbarStreakListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.common.balance.BalanceDisplay$$ExternalSyntheticLambda4
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                BalanceDisplay.this.m12881lambda$new$0$orgbetupuicommonbalanceBalanceDisplay(userService, fetchedResponseMessage);
            }
        };
    }

    /* renamed from: lambda$new$0$org-betup-ui-common-balance-BalanceDisplay, reason: not valid java name */
    /* synthetic */ void m12881lambda$new$0$orgbetupuicommonbalanceBalanceDisplay(UserService userService, FetchedResponseMessage fetchedResponseMessage) {
        if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS || fetchedResponseMessage.getModel() == null) {
            return;
        }
        this.toolbarStreakCount = Integer.valueOf(Math.max(0, ((NewUserBetStatisticsModel) fetchedResponseMessage.getModel()).getCurrentWinStreak()));
        updateUserViews(userService.getShortProfile());
    }

    public void setStreakInteractor(V7UserBetStatisticsInteractor streakInteractor) {
        this.streakInteractor = streakInteractor;
    }

    public View getBetcoinsView() {
        return this.headerComposeView;
    }

    public void setView(View view, Context context) {
        this.headerContext = context;
        this.headerComposeView = (ComposeView) view.findViewById(R.id.app_top_header_cv);
        this.headerComposeHost = new ToolbarHeaderComposeHost(this.headerComposeView, context.getApplicationContext(), new Function0() { // from class: org.betup.ui.common.balance.BalanceDisplay$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BalanceDisplay.this.m12882lambda$setView$1$orgbetupuicommonbalanceBalanceDisplay();
            }
        }, new Function0() { // from class: org.betup.ui.common.balance.BalanceDisplay$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BalanceDisplay.this.m12883lambda$setView$2$orgbetupuicommonbalanceBalanceDisplay();
            }
        }, new Function0() { // from class: org.betup.ui.common.balance.BalanceDisplay$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BalanceDisplay.this.m12884lambda$setView$3$orgbetupuicommonbalanceBalanceDisplay();
            }
        }, new Function0() { // from class: org.betup.ui.common.balance.BalanceDisplay$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BalanceDisplay.this.m12885lambda$setView$4$orgbetupuicommonbalanceBalanceDisplay();
            }
        });
        if (this.userService.isRegistered()) {
            processUpdate(this.userService.getShortProfile().getUserProgressModel());
            updateUserViews(this.userService.getShortProfile());
        } else {
            long lastBalance = this.balanceHolder.getLastBalance();
            if (lastBalance >= 0) {
                updateBalanceDisplay(lastBalance);
            }
        }
        this.userService.getProfile(this, UserService.InfoKind.PROGRESS);
    }

    /* renamed from: lambda$setView$1$org-betup-ui-common-balance-BalanceDisplay, reason: not valid java name */
    /* synthetic */ Unit m12882lambda$setView$1$orgbetupuicommonbalanceBalanceDisplay() {
        avatarIconClick();
        return Unit.INSTANCE;
    }

    /* renamed from: lambda$setView$2$org-betup-ui-common-balance-BalanceDisplay, reason: not valid java name */
    /* synthetic */ Unit m12883lambda$setView$2$orgbetupuicommonbalanceBalanceDisplay() {
        betcoinsClick();
        return Unit.INSTANCE;
    }

    /* renamed from: lambda$setView$3$org-betup-ui-common-balance-BalanceDisplay, reason: not valid java name */
    /* synthetic */ Unit m12884lambda$setView$3$orgbetupuicommonbalanceBalanceDisplay() {
        createBundleForShopNavigation(ShopDialogFragment.Tab.UNLOCK);
        return Unit.INSTANCE;
    }

    /* renamed from: lambda$setView$4$org-betup-ui-common-balance-BalanceDisplay, reason: not valid java name */
    /* synthetic */ Unit m12885lambda$setView$4$orgbetupuicommonbalanceBalanceDisplay() {
        Context context = this.headerContext;
        if (context != null) {
            SnackbarHelper.showShort(context, R.string.home_snackbar_current_winning_streak);
        }
        return Unit.INSTANCE;
    }

    private void avatarIconClick() {
        ShortUserProfileModel shortProfile = this.userService.getShortProfile();
        if (shortProfile == null || shortProfile.getUserModel() == null || shortProfile.getUserModel().getId() == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("id", shortProfile.getUserModel().getId().intValue());
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.USER_DETAILS, bundle));
    }

    private void betcoinsClick() {
        createBundleForShopNavigation(ShopDialogFragment.Tab.UNLOCK);
    }

    private void updateUserViews(ShortUserProfileModel userProfileModel) {
        if (this.headerComposeHost == null || userProfileModel == null || userProfileModel.getUserModel() == null) {
            return;
        }
        UserProgressModel userProgressModel = userProfileModel.getUserProgressModel();
        int level = userProgressModel != null ? userProgressModel.getLevel() : 1;
        int i = this.toolbarStreakCount;
        if (i == null && this.userService.isRegistered()) {
            i = 0;
        }
        this.headerComposeHost.updateUser(userProfileModel.getUserModel().getName(), userProfileModel.getUserModel().getPhotoUrl(), level, i);
    }

    private Bundle toolbarStreakRequestParams() {
        Bundle bundle = new Bundle();
        bundle.putString(V7UserBetStatisticsInteractor.PARAM_STATS_TYPE, V7UserBetStatisticsInteractor.STATS_TYPE_THIRTY_DAYS);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshToolbarStreak() {
        ShortUserProfileModel shortProfile;
        if (this.streakInteractor == null || !this.userService.isRegistered() || (shortProfile = this.userService.getShortProfile()) == null || shortProfile.getUserModel() == null) {
            return;
        }
        int intValue = shortProfile.getUserModel().getId().intValue();
        Bundle bundle = toolbarStreakRequestParams();
        this.streakInteractor.invalidate(Integer.valueOf(intValue), bundle);
        this.streakInteractor.load(this.toolbarStreakListener, Integer.valueOf(intValue), bundle);
    }

    private void scheduleToolbarStreakRefresh() {
        refreshToolbarStreak();
        Runnable runnable = this.pendingDelayedStreakReload;
        if (runnable != null) {
            this.streakReloadHandler.removeCallbacks(runnable);
        }
        Runnable runnable2 = new Runnable() { // from class: org.betup.ui.common.balance.BalanceDisplay$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                BalanceDisplay.this.refreshToolbarStreak();
            }
        };
        this.pendingDelayedStreakReload = runnable2;
        this.streakReloadHandler.postDelayed(runnable2, STREAK_RELOAD_DELAY_MS);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUserBetStatisticsInvalidated(UserBetStatisticsInvalidatedMessage message) {
        scheduleToolbarStreakRefresh();
    }

    @Override // org.betup.services.user.UserService.UserInfoListener
    public void onProfileFetched(FullUserProfileModel fullUserProfileModel, Set<UserService.InfoKind> updated, FetchStat stat) {
        if (stat != FetchStat.SUCCESS || fullUserProfileModel == null || fullUserProfileModel.getUserProgressModel() == null) {
            return;
        }
        processUpdate(fullUserProfileModel.getUserProgressModel());
        updateUserViews(this.userService.getShortProfile());
    }

    @Override // org.betup.utils.balance.BalanceHolder.BalanceUpdateListener
    public void onBalanceUpdated(long balance) {
        updateBalanceDisplay(balance);
    }

    private void processUpdate(UserProgressModel progressModel) {
        if (progressModel == null) {
            return;
        }
        updateBalanceDisplay(progressModel.getMoneyBalance());
        updateUserViews(this.userService.getShortProfile());
    }

    private void updateBalanceDisplay(long newBalance) {
        ToolbarHeaderComposeHost toolbarHeaderComposeHost = this.headerComposeHost;
        if (toolbarHeaderComposeHost == null) {
            return;
        }
        long j = this.previousBalance;
        boolean z = j < 0;
        boolean z2 = j >= 0 && j != newBalance;
        if (z || z2) {
            toolbarHeaderComposeHost.updateBalance(newBalance, z2 ? j : newBalance, 2);
        }
        this.previousBalance = newBalance;
    }

    @Override // org.betup.ui.LifecycleListener
    public void onResume() {
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this);
        }
        this.balanceHolder.addListener(this);
        if (this.userService.isRegistered()) {
            long lastBalance = this.balanceHolder.getLastBalance();
            if (lastBalance >= 0) {
                updateBalanceDisplay(lastBalance);
            } else {
                processUpdate(this.userService.getShortProfile().getUserProgressModel());
            }
            updateUserViews(this.userService.getShortProfile());
            refreshToolbarStreak();
        }
        this.userService.subscribe(this, UserService.InfoKind.PROGRESS);
    }

    @Override // org.betup.ui.LifecycleListener
    public void onPause() {
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
        Runnable runnable = this.pendingDelayedStreakReload;
        if (runnable != null) {
            this.streakReloadHandler.removeCallbacks(runnable);
            this.pendingDelayedStreakReload = null;
        }
        this.balanceHolder.removeListener(this);
        this.userService.unsubscribe(this);
    }

    public void createBundleForShopNavigation(ShopDialogFragment.Tab type) {
        TourHelper tourHelper = this.tourHelper;
        if (tourHelper != null && tourHelper.isTour()) {
            this.tourHelper.hideTours();
            return;
        }
        if (Math.abs(System.currentTimeMillis() - this.previousShopNavigationActionTime) > 3000) {
            this.previousShopNavigationActionTime = System.currentTimeMillis();
            Bundle bundle = new Bundle();
            bundle.putSerializable("tab", type);
            bundle.putBoolean(PreviewActivity.ON_CLICK_LISTENER_CLOSE, false);
            EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.SHOP, bundle));
        }
    }
}
