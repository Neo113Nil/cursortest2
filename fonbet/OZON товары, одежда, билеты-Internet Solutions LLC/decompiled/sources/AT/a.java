package AT;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.di.OrderDoneDisclaimerWidgetComponentV2;
import ru.ozon.app.android.fresh.main.widgets.scrollActionList.di.ScrollActionListComponent;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.di.AddressEditPickupDetailWidgetComponent;
import ru.ozon.app.android.marketing.widgets.notificationssettings.di.NotificationSettingsComponent;
import ru.ozon.app.android.monetization.widgets.inputSubmit.di.InputSubmitComponent;
import ru.ozon.app.android.regulardraw.widgets.morkovskMenu.di.MorkovskMenuComponent;
import ru.ozon.app.android.session.userAdultModalMobileV2.di.IUserAdultContentComponent;
import ru.ozon.app.android.session.userAdultModalMobileV2.di.UserAdultComponent;
import ru.ozon.app.android.storefront.widgets.financeHeaderWidget.di.FinanceHeaderWidgetComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.banner.di.BannerComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.navBarOnboarding.di.NavBarOnboardingComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v1.di.TimeoutAndActionComponent;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.di.HotelsPageButtonV5Component;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.di.TouristCountSelectorComponent;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.di.TileScrollComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f661a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f662b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f661a = i11;
        this.f662b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        TouristCountSelectorComponent create$lambda$0;
        InputSubmitComponent create$lambda$02;
        ScrollActionListComponent create$lambda$03;
        NotificationSettingsComponent create$lambda$04;
        IUserAdultContentComponent create$lambda$05;
        FinanceHeaderWidgetComponent create$lambda$06;
        NavBarOnboardingComponent create$lambda$07;
        MorkovskMenuComponent create$lambda$08;
        BannerComponent create$lambda$09;
        TileScrollComponent create$lambda$010;
        HotelsPageButtonV5Component create$lambda$011;
        OrderDoneDisclaimerWidgetComponentV2 create$lambda$012;
        TimeoutAndActionComponent create$lambda$013;
        AddressEditPickupDetailWidgetComponent create$lambda$014;
        switch (this.f661a) {
            case 0:
                create$lambda$0 = TouristCountSelectorComponent.Companion.create$lambda$0(this.f662b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = InputSubmitComponent.Companion.create$lambda$0(this.f662b);
                return create$lambda$02;
            case 2:
                create$lambda$03 = ScrollActionListComponent.Companion.create$lambda$0(this.f662b);
                return create$lambda$03;
            case 3:
                create$lambda$04 = NotificationSettingsComponent.Companion.create$lambda$0(this.f662b);
                return create$lambda$04;
            case 4:
                create$lambda$05 = UserAdultComponent.Companion.create$lambda$0(this.f662b);
                return create$lambda$05;
            case 5:
                create$lambda$06 = FinanceHeaderWidgetComponent.Companion.create$lambda$0(this.f662b);
                return create$lambda$06;
            case 6:
                create$lambda$07 = NavBarOnboardingComponent.Companion.create$lambda$0(this.f662b);
                return create$lambda$07;
            case 7:
                create$lambda$08 = MorkovskMenuComponent.Companion.create$lambda$0(this.f662b);
                return create$lambda$08;
            case 8:
                create$lambda$09 = BannerComponent.Companion.create$lambda$0(this.f662b);
                return create$lambda$09;
            case 9:
                create$lambda$010 = TileScrollComponent.Companion.create$lambda$0(this.f662b);
                return create$lambda$010;
            case 10:
                create$lambda$011 = HotelsPageButtonV5Component.Companion.create$lambda$0(this.f662b);
                return create$lambda$011;
            case 11:
                create$lambda$012 = OrderDoneDisclaimerWidgetComponentV2.Companion.create$lambda$0(this.f662b);
                return create$lambda$012;
            case 12:
                create$lambda$013 = TimeoutAndActionComponent.Companion.create$lambda$0(this.f662b);
                return create$lambda$013;
            default:
                create$lambda$014 = AddressEditPickupDetailWidgetComponent.Companion.create$lambda$0(this.f662b);
                return create$lambda$014;
        }
    }
}
