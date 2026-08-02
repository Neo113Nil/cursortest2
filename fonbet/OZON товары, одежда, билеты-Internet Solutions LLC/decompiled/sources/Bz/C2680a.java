package Bz;

import Bi.k;
import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsWidgetComponent;
import ru.ozon.app.android.cml.delivery.widgets.order.v2.di.OrderWidgetV2Component;
import ru.ozon.app.android.domain.gallery.di.GalleryLauncherComponent;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.di.CatalogShelfComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.di.ProfileAvatarDIComponent;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.di.HammersV3Component;
import ru.ozon.app.android.orderdetails.orderTotal.core.OrderTotalStickyViewMapper;
import ru.ozon.app.android.orderdetails.orderTotal.di.OrderTotalComponent;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.posting.PositingOrderShipmentComponent;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.posting.PositingOrderShipmentViewMapper;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.di.MainDrawMajorScreenComponent;
import ru.ozon.app.android.storefront.widgets.inAppPush.di.InAppPushComponent;
import ru.ozon.app.android.travel.feature.general.booking.widgets.searchResultsNavTitle.v2.di.SearchResultsNavTitleV2Component;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.di.TravelAddNewPassengerFormV3Component;

/* renamed from: Bz.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C2680a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4073a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4074b;

    public /* synthetic */ C2680a(Object obj, int i11) {
        this.f4073a = i11;
        this.f4074b = obj;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        HammersV3Component create$lambda$0;
        ProfileAvatarDIComponent create$lambda$02;
        CatalogShelfComponent create$lambda$03;
        InAppPushComponent create$lambda$04;
        SearchResultsNavTitleV2Component create$lambda$05;
        OrderWidgetV2Component create$lambda$06;
        TravelAddNewPassengerFormV3Component create$lambda$07;
        MainDrawMajorScreenComponent create$lambda$08;
        OrderTotalComponent widgetComponent$lambda$3;
        CartSplitV2ControlsWidgetComponent create$lambda$09;
        PositingOrderShipmentComponent widgetComponent$lambda$0;
        GalleryLauncherComponent create$lambda$010;
        switch (this.f4073a) {
            case 0:
                create$lambda$0 = HammersV3Component.Companion.create$lambda$0((C7475g) this.f4074b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = ProfileAvatarDIComponent.Companion.create$lambda$0((C7475g) this.f4074b);
                return create$lambda$02;
            case 2:
                create$lambda$03 = CatalogShelfComponent.Companion.create$lambda$0((C7475g) this.f4074b);
                return create$lambda$03;
            case 3:
                create$lambda$04 = InAppPushComponent.Companion.create$lambda$0((C7475g) this.f4074b);
                return create$lambda$04;
            case 4:
                create$lambda$05 = SearchResultsNavTitleV2Component.Companion.create$lambda$0((C7475g) this.f4074b);
                return create$lambda$05;
            case 5:
                create$lambda$06 = OrderWidgetV2Component.Companion.create$lambda$0((C7475g) this.f4074b);
                return create$lambda$06;
            case 6:
                create$lambda$07 = TravelAddNewPassengerFormV3Component.Companion.create$lambda$0((C7475g) this.f4074b);
                return create$lambda$07;
            case 7:
                create$lambda$08 = MainDrawMajorScreenComponent.Companion.create$lambda$0((C7475g) this.f4074b);
                return create$lambda$08;
            case 8:
                widgetComponent$lambda$3 = OrderTotalStickyViewMapper.widgetComponent$lambda$3((C7475g) this.f4074b);
                return widgetComponent$lambda$3;
            case 9:
                create$lambda$09 = CartSplitV2ControlsWidgetComponent.Companion.create$lambda$0((C7475g) this.f4074b);
                return create$lambda$09;
            case 10:
                widgetComponent$lambda$0 = PositingOrderShipmentViewMapper.widgetComponent$lambda$0((C7475g) this.f4074b);
                return widgetComponent$lambda$0;
            default:
                create$lambda$010 = GalleryLauncherComponent.Companion.create$lambda$0((k) this.f4074b);
                return create$lambda$010;
        }
    }
}
