package org.betup.services.menu.providers;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.appinvite.PreviewActivity;
import com.vk.sdk.api.model.VKAttachments;
import java.util.ArrayList;
import java.util.List;
import org.betup.R;
import org.betup.bus.NavigateMessage;
import org.betup.bus.TourActionMessage;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.services.betlist.BetListAppender;
import org.betup.services.drawer.DrawerController;
import org.betup.services.menu.BottomMenuAction;
import org.betup.services.menu.BottomMenuItem;
import org.betup.services.menu.BottomMenuProvider;
import org.betup.ui.MainActivity;
import org.betup.ui.MenuBarsController;
import org.betup.ui.TabMenuItem;
import org.betup.ui.fragment.bets.BetsPage;
import org.betup.ui.tour.TourHelper;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes2.dex */
public class DefaultBottomMenuProvider implements BottomMenuProvider {
    private final BetListAppender betListAppender;
    private DrawerController drawerController;
    private final MenuBarsController menuBarsController;
    private final TourHelper tourHelper;
    private final BottomMenuAction onMiniGamesClick = new BottomMenuAction() { // from class: org.betup.services.menu.providers.DefaultBottomMenuProvider.1
        @Override // org.betup.services.menu.BottomMenuAction
        public void action(Activity activity, BottomMenuItem bottomMenuItem) {
            if (DefaultBottomMenuProvider.this.menuBarsController.isReady()) {
                EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.MINI_GAMES_HOME_ACTIVITY, null));
            }
        }
    };
    private final BottomMenuAction onMissionsClick = new BottomMenuAction() { // from class: org.betup.services.menu.providers.DefaultBottomMenuProvider.2
        @Override // org.betup.services.menu.BottomMenuAction
        public void action(Activity activity, BottomMenuItem bottomMenuItem) {
            if (DefaultBottomMenuProvider.this.menuBarsController.isReady()) {
                EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.TASKS, null));
            }
        }
    };
    private final BottomMenuAction onHomeClick = new BottomMenuAction() { // from class: org.betup.services.menu.providers.DefaultBottomMenuProvider.3
        @Override // org.betup.services.menu.BottomMenuAction
        public void action(Activity activity, BottomMenuItem bottomMenuItem) {
            if (DefaultBottomMenuProvider.this.menuBarsController.isReady()) {
                if (DefaultBottomMenuProvider.this.tourHelper != null) {
                    DefaultBottomMenuProvider.this.tourHelper.hideTours();
                }
                EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.HOME, null));
            }
        }
    };
    private final BottomMenuAction onBattlesClick = new BottomMenuAction() { // from class: org.betup.services.menu.providers.DefaultBottomMenuProvider.4
        @Override // org.betup.services.menu.BottomMenuAction
        public void action(Activity activity, BottomMenuItem bottomMenuItem) {
            if (DefaultBottomMenuProvider.this.menuBarsController.isReady()) {
                if (DefaultBottomMenuProvider.this.tourHelper != null) {
                    DefaultBottomMenuProvider.this.tourHelper.hideTours();
                }
                EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.BATTLES, new Bundle()));
            }
        }
    };
    private final BottomMenuAction onSportsClick = new BottomMenuAction() { // from class: org.betup.services.menu.providers.DefaultBottomMenuProvider.5
        @Override // org.betup.services.menu.BottomMenuAction
        public void action(Activity activity, BottomMenuItem bottomMenuItem) {
            if (DefaultBottomMenuProvider.this.menuBarsController.isReady()) {
                if (DefaultBottomMenuProvider.this.tourHelper != null) {
                    DefaultBottomMenuProvider.this.tourHelper.hideTours();
                }
                if (activity instanceof MainActivity) {
                    MainActivity mainActivity = (MainActivity) activity;
                    if (mainActivity.tourComposeHelper != null && mainActivity.tourComposeHelper.isTourActive()) {
                        EventBus.getDefault().post(new TourActionMessage(TourActionMessage.Action.SPORT_BUTTON_CLICKED, null));
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("isLive", DefaultBottomMenuProvider.this.tourHelper != null && DefaultBottomMenuProvider.this.tourHelper.isTour());
                EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.MATCHES, bundle));
            }
        }
    };
    private final BottomMenuAction onBetsClick = new BottomMenuAction() { // from class: org.betup.services.menu.providers.DefaultBottomMenuProvider.6
        @Override // org.betup.services.menu.BottomMenuAction
        public void action(Activity activity, BottomMenuItem bottomMenuItem) {
            if (DefaultBottomMenuProvider.this.menuBarsController.isReady()) {
                if (DefaultBottomMenuProvider.this.tourHelper != null) {
                    DefaultBottomMenuProvider.this.tourHelper.hideTours();
                }
                Bundle bundle = new Bundle();
                bundle.putSerializable("state", BetState.ALL);
                bundle.putSerializable(VKAttachments.TYPE_WIKI_PAGE, DefaultBottomMenuProvider.this.betListAppender.getBetsCount() == 0 ? BetsPage.BETSLIP : BetsPage.BETLIST);
                EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.BETS, bundle));
            }
        }
    };
    private final BottomMenuAction onShopClick = new BottomMenuAction() { // from class: org.betup.services.menu.providers.DefaultBottomMenuProvider.7
        @Override // org.betup.services.menu.BottomMenuAction
        public void action(Activity activity, BottomMenuItem bottomMenuItem) {
            if (DefaultBottomMenuProvider.this.menuBarsController.isReady()) {
                if (DefaultBottomMenuProvider.this.tourHelper != null) {
                    DefaultBottomMenuProvider.this.tourHelper.hideTours();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean(PreviewActivity.ON_CLICK_LISTENER_CLOSE, false);
                EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.SHOP, bundle));
            }
        }
    };
    private final BottomMenuAction onDrawerClick = new BottomMenuAction() { // from class: org.betup.services.menu.providers.DefaultBottomMenuProvider$$ExternalSyntheticLambda0
        @Override // org.betup.services.menu.BottomMenuAction
        public final void action(Activity activity, BottomMenuItem bottomMenuItem) {
            DefaultBottomMenuProvider.this.m12780x383ad353(activity, bottomMenuItem);
        }
    };

    /* renamed from: lambda$new$0$org-betup-services-menu-providers-DefaultBottomMenuProvider, reason: not valid java name */
    /* synthetic */ void m12780x383ad353(Activity activity, BottomMenuItem bottomMenuItem) {
        DrawerController drawerController = this.drawerController;
        if (drawerController != null) {
            drawerController.onDrawerClick();
        }
    }

    public DefaultBottomMenuProvider(MenuBarsController controller, BetListAppender betListAppender, TourHelper tourHelper, DrawerController drawerController) {
        this.menuBarsController = controller;
        this.betListAppender = betListAppender;
        this.tourHelper = tourHelper;
        this.drawerController = drawerController;
    }

    @Override // org.betup.services.menu.BottomMenuProvider
    public List<BottomMenuItem> buildMenu(Activity activity) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BottomMenuItem.Builder(TabMenuItem.HOME).icon(R.drawable.ic_home).title(activity.getString(R.string.drawer_home)).onClick(this.onHomeClick).build());
        arrayList.add(new BottomMenuItem.Builder(TabMenuItem.MATCHES).icon(R.drawable.ic_sport).title(activity.getString(R.string.drawer_sports)).onClick(this.onSportsClick).build());
        arrayList.add(new BottomMenuItem.Builder(TabMenuItem.BETS).icon(R.drawable.ic_coins).title(activity.getString(R.string.bottom_menu_my_bets)).onClick(this.onBetsClick).build());
        arrayList.add(new BottomMenuItem.Builder(TabMenuItem.SHOP).icon(R.drawable.ic_shop).title(activity.getString(R.string.drawer_shop)).onClick(this.onShopClick).build());
        arrayList.add(new BottomMenuItem.Builder(TabMenuItem.DRAWER).icon(R.drawable.ic_menu).title(activity.getString(R.string.drawer_menu)).onClick(this.onDrawerClick).build());
        return arrayList;
    }
}
