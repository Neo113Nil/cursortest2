package AL;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.checkoutcomposer.enableNotificationWithReplacementButton.di.EnableNotificationWithReplacementButtonDiComponent;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.di.LargeOrdersLiftingV2Component;
import ru.ozon.app.android.fresh.cart.widgets.cartMaster.di.CartMasterWidgetComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusBanner.di.StatusBannerComponent;
import ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.di.OrderItemsComponent;
import ru.ozon.app.android.geo.addressbook.di.AddressBookWidgetComponent;
import ru.ozon.app.android.pdp.widgets.productStarsTile.di.ProductStarsTileWidgetComponent;
import ru.ozon.app.android.returns.actionModal.di.ReturnActionModalComposeComponent;
import ru.ozon.app.android.search.widgets.searchbar.core.ActiveSearchBarViewMapper;
import ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent;
import ru.ozon.app.android.session.sessionList.di.SessionListLogoutButtonComponent;
import ru.ozon.app.android.session.sessionList.mapper.SessionListLogoutButtonViewMapper;
import ru.ozon.app.android.storefront.widgets.cms.di.NavBarComponent;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.di.NavigationSliderV2WidgetComponent;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.di.AdditionalLuggageV2Component;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.di.AviaCheckTariffsComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithSubtitle.di.TravelTextWithSubtitleComponent;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsOrderRoomsDetails.di.HotelsOrderRoomsDetailsComponent;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.di.ReviewGalleryComponent;
import ru.ozon.app.android.ugc.core.widgets.textIconWidget.di.TextIconWidgetComponent;
import ru.ozon.app.android.ugc.core.widgets.timerButton.di.TimerButtonComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f644b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f643a = i11;
        this.f644b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        NavigationSliderV2WidgetComponent create$lambda$0;
        ProductStarsTileWidgetComponent create$lambda$02;
        SessionListLogoutButtonComponent widgetComponent$lambda$0;
        CartMasterWidgetComponent create$lambda$03;
        TextIconWidgetComponent instance$lambda$0;
        OrderItemsComponent create$lambda$04;
        TimerButtonComponent instance$lambda$02;
        SearchBarComponent widgetComponent$lambda$02;
        TravelTextWithSubtitleComponent create$lambda$05;
        ReviewGalleryComponent create$lambda$06;
        AdditionalLuggageV2Component create$lambda$07;
        HotelsOrderRoomsDetailsComponent create$lambda$08;
        AviaCheckTariffsComponent create$lambda$09;
        AddressBookWidgetComponent create$lambda$010;
        StatusBannerComponent create$lambda$011;
        EnableNotificationWithReplacementButtonDiComponent create$lambda$012;
        NavBarComponent create$lambda$013;
        LargeOrdersLiftingV2Component create$lambda$014;
        ReturnActionModalComposeComponent create$lambda$015;
        switch (this.f643a) {
            case 0:
                create$lambda$0 = NavigationSliderV2WidgetComponent.Companion.create$lambda$0(this.f644b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = ProductStarsTileWidgetComponent.Companion.create$lambda$0(this.f644b);
                return create$lambda$02;
            case 2:
                widgetComponent$lambda$0 = SessionListLogoutButtonViewMapper.widgetComponent$lambda$0(this.f644b);
                return widgetComponent$lambda$0;
            case 3:
                create$lambda$03 = CartMasterWidgetComponent.Companion.create$lambda$0(this.f644b);
                return create$lambda$03;
            case 4:
                instance$lambda$0 = TextIconWidgetComponent.Companion.getInstance$lambda$0(this.f644b);
                return instance$lambda$0;
            case 5:
                create$lambda$04 = OrderItemsComponent.Companion.create$lambda$0(this.f644b);
                return create$lambda$04;
            case 6:
                instance$lambda$02 = TimerButtonComponent.Companion.getInstance$lambda$0(this.f644b);
                return instance$lambda$02;
            case 7:
                widgetComponent$lambda$02 = ActiveSearchBarViewMapper.widgetComponent$lambda$0(this.f644b);
                return widgetComponent$lambda$02;
            case 8:
                create$lambda$05 = TravelTextWithSubtitleComponent.Companion.create$lambda$0(this.f644b);
                return create$lambda$05;
            case 9:
                create$lambda$06 = ReviewGalleryComponent.Companion.create$lambda$0(this.f644b);
                return create$lambda$06;
            case 10:
                create$lambda$07 = AdditionalLuggageV2Component.Companion.create$lambda$0(this.f644b);
                return create$lambda$07;
            case 11:
                create$lambda$08 = HotelsOrderRoomsDetailsComponent.Companion.create$lambda$0(this.f644b);
                return create$lambda$08;
            case 12:
                create$lambda$09 = AviaCheckTariffsComponent.Companion.create$lambda$0(this.f644b);
                return create$lambda$09;
            case 13:
                create$lambda$010 = AddressBookWidgetComponent.Companion.create$lambda$0(this.f644b);
                return create$lambda$010;
            case 14:
                create$lambda$011 = StatusBannerComponent.Companion.create$lambda$0(this.f644b);
                return create$lambda$011;
            case 15:
                create$lambda$012 = EnableNotificationWithReplacementButtonDiComponent.Companion.create$lambda$0(this.f644b);
                return create$lambda$012;
            case 16:
                create$lambda$013 = NavBarComponent.Companion.create$lambda$0(this.f644b);
                return create$lambda$013;
            case 17:
                create$lambda$014 = LargeOrdersLiftingV2Component.Companion.create$lambda$0(this.f644b);
                return create$lambda$014;
            default:
                create$lambda$015 = ReturnActionModalComposeComponent.Companion.create$lambda$0(this.f644b);
                return create$lambda$015;
        }
    }
}
