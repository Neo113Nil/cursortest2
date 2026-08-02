package org.betup.ui.dialogs;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.compose.material3.internal.CalendarModelKt;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import java.util.Set;
import javax.inject.Inject;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.PurchaseSuccessMessage;
import org.betup.bus.ShopClosedWithoutPurchaseAfterOpeningFromNotEnoughBetcoinsContextMessage;
import org.betup.bus.ShopTicketTabNavigationMessage;
import org.betup.model.local.entity.FullUserProfileModel;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.entity.analytics.PurchasePlacement;
import org.betup.model.remote.entity.analytics.TrackEventType;
import org.betup.model.remote.entity.user.UserProgressModel;
import org.betup.services.analytics.AnalyticsHelper;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.user.UserService;
import org.betup.ui.MenuBarsController;
import org.betup.ui.TabMenuItem;
import org.betup.ui.dialogs.adapter.ShopDialogPagerAdapter;
import org.betup.ui.fragment.shop.ShopTabProvider;
import org.betup.utils.FormatHelper;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class ShopDialogFragment extends BaseBlurredDialogFragment implements ShopTabProvider, UserService.UserInfoListener {
    private static final String CLOSE_ARG = "close";
    private static final String SOURCE_PLACEMENT_KEY = "source_placement";
    private static final String TAB_ARG = "tab";

    @Inject
    AnalyticsService analyticsService;

    @BindView(R.id.betcoins)
    TextView betcoins;
    private boolean closeOnPurchase;
    private boolean didPurchase;
    private MenuBarsController menuBarsController;

    @BindView(R.id.pager)
    ViewPager pager;
    private PurchasePlacement sourcePlacement;

    @Inject
    UserService userService;

    public enum Tab {
        BOOSTERS,
        PACKS,
        UNLOCK
    }

    @Override // org.betup.ui.dialogs.BaseBlurredDialogFragment
    protected int getLayoutId() {
        return R.layout.dialog_shop;
    }

    public static ShopDialogFragment newInstance(Tab tab, boolean closeOnPurchase, PurchasePlacement sourcePlacement) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(TAB_ARG, tab);
        bundle.putBoolean("close", closeOnPurchase);
        bundle.putSerializable(SOURCE_PLACEMENT_KEY, sourcePlacement);
        ShopDialogFragment shopDialogFragment = new ShopDialogFragment();
        shopDialogFragment.setArguments(bundle);
        return shopDialogFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.menuBarsController = (MenuBarsController) context;
        } catch (ClassCastException unused) {
            throw new ClassCastException(context.getClass().getName() + " should implement MenuBarsController!");
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.closeOnPurchase = getArguments().getBoolean("close", false);
        this.sourcePlacement = (PurchasePlacement) getArguments().getSerializable(SOURCE_PLACEMENT_KEY);
        ((BetUpApp) getContext().getApplicationContext()).getComponent().inject(this);
    }

    @Override // org.betup.ui.dialogs.BaseBlurredDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        try {
            int moneyBalance = (int) this.userService.getShortProfile().getUserProgressModel().getMoneyBalance();
            long j = getContext().getSharedPreferences("analytics", 0).getLong("registration_timestamp", 0L);
            int currentTimeMillis = j > 0 ? (int) ((System.currentTimeMillis() - j) / CalendarModelKt.MillisecondsIn24Hours) : 0;
            PurchasePlacement purchasePlacement = this.sourcePlacement;
            AnalyticsHelper.INSTANCE.logPurchasePromptShown(purchasePlacement != null ? purchasePlacement.name().toLowerCase() : "shop", moneyBalance, currentTimeMillis);
        } catch (Exception e) {
            Log.e("ShopDialogFragment", "Error logging purchase_prompt_shown", e);
        }
        this.pager.setAdapter(new ShopDialogPagerAdapter(getActivity(), getChildFragmentManager(), this.sourcePlacement));
        this.pager.setOffscreenPageLimit(2);
        this.pager.setCurrentItem(((Tab) getArguments().getSerializable(TAB_ARG)).ordinal());
        updateBalance(this.userService.getShortProfile().getUserProgressModel());
        this.userService.subscribe(this, UserService.InfoKind.PROGRESS);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // org.betup.ui.dialogs.BaseBlurredDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this);
        }
        this.menuBarsController.updateTabMenu(TabMenuItem.SHOP);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
        this.menuBarsController.restorePrevious();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        this.analyticsService.sendTrackEvent(TrackEventType.SHOP_CLOSED);
        if (!this.closeOnPurchase || this.didPurchase) {
            return;
        }
        EventBus.getDefault().post(new ShopClosedWithoutPurchaseAfterOpeningFromNotEnoughBetcoinsContextMessage());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPurchase(PurchaseSuccessMessage purchaseSuccessMessage) {
        if (this.closeOnPurchase) {
            dismiss();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onNotEnoughTickets(ShopTicketTabNavigationMessage shopTicketTabNavigationMessage) {
        this.pager.setCurrentItem(1);
    }

    @OnClick({R.id.close})
    public void onBackClick() {
        dismiss();
    }

    @Override // org.betup.services.user.UserService.UserInfoListener
    public void onProfileFetched(FullUserProfileModel fullUserProfileModel, Set<UserService.InfoKind> updated, FetchStat stat) {
        if (isActive() && stat == FetchStat.SUCCESS) {
            updateBalance(fullUserProfileModel.getUserProgressModel());
        }
    }

    @Override // org.betup.ui.fragment.shop.ShopTabProvider
    public void switchToTab(Tab tab) {
        if (isActive()) {
            this.pager.setCurrentItem(tab.ordinal());
        }
    }

    private void updateBalance(UserProgressModel progressModel) {
        this.betcoins.setText(FormatHelper.getDialogBetcoinsFormated(progressModel.getMoneyBalance()));
    }
}
