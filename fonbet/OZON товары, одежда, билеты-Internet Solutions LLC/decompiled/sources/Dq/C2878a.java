package Dq;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.button.core.ActionButtonViewMapper;
import ru.ozon.app.android.button.di.ActionButtonComponent;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.CartSplitV2ItemViewMapper;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.di.CartSplitV2ItemWidgetComponent;
import ru.ozon.app.android.common.cellList.v2.core.CellListV2ViewMapper;
import ru.ozon.app.android.common.cellList.v2.core.CellListWidgetComponent;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.di.TipCourierReviewV2Component;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.button.TipCourierReviewOverlayViewMapper;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.di.FreshCheckoutProgressBarWidgetComponent;
import ru.ozon.app.android.pdp.widgets.aspectsV4.di.AspectsV4WidgetComponent;
import ru.ozon.app.android.storefront.widgets.navbarApparel.core.NavBarApparelViewMapper;
import ru.ozon.app.android.storefront.widgets.navbarApparel.di.NavBarApparelComponent;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.di.AdditionalServicesComponent;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.di.CustomerContactsV3Component;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.di.NotificationSubscriptionBannerComponent;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v3.di.PriceCalendarFooterV3Component;
import ru.ozon.app.android.ugc.core.widgets.rowList.di.RowListComponent;

/* renamed from: Dq.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C2878a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6769a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f6770b;

    public /* synthetic */ C2878a(C7475g c7475g, int i11) {
        this.f6769a = i11;
        this.f6770b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        CellListWidgetComponent widgetComponent$lambda$1;
        ActionButtonComponent widgetComponent$lambda$0;
        AspectsV4WidgetComponent instance$lambda$0;
        NotificationSubscriptionBannerComponent create$lambda$0;
        FreshCheckoutProgressBarWidgetComponent create$lambda$02;
        CartSplitV2ItemWidgetComponent widgetComponent$lambda$02;
        NavBarApparelComponent widgetComponent$lambda$12;
        RowListComponent create$lambda$03;
        TipCourierReviewV2Component widgetComponent$lambda$3;
        PriceCalendarFooterV3Component create$lambda$04;
        AdditionalServicesComponent create$lambda$05;
        CustomerContactsV3Component create$lambda$06;
        switch (this.f6769a) {
            case 0:
                widgetComponent$lambda$1 = CellListV2ViewMapper.widgetComponent$lambda$1(this.f6770b);
                return widgetComponent$lambda$1;
            case 1:
                widgetComponent$lambda$0 = ActionButtonViewMapper.widgetComponent$lambda$0(this.f6770b);
                return widgetComponent$lambda$0;
            case 2:
                instance$lambda$0 = AspectsV4WidgetComponent.Companion.getInstance$lambda$0(this.f6770b);
                return instance$lambda$0;
            case 3:
                create$lambda$0 = NotificationSubscriptionBannerComponent.Companion.create$lambda$0(this.f6770b);
                return create$lambda$0;
            case 4:
                create$lambda$02 = FreshCheckoutProgressBarWidgetComponent.Companion.create$lambda$0(this.f6770b);
                return create$lambda$02;
            case 5:
                widgetComponent$lambda$02 = CartSplitV2ItemViewMapper.widgetComponent$lambda$0(this.f6770b);
                return widgetComponent$lambda$02;
            case 6:
                widgetComponent$lambda$12 = NavBarApparelViewMapper.widgetComponent$lambda$1(this.f6770b);
                return widgetComponent$lambda$12;
            case 7:
                create$lambda$03 = RowListComponent.Companion.create$lambda$0(this.f6770b);
                return create$lambda$03;
            case 8:
                widgetComponent$lambda$3 = TipCourierReviewOverlayViewMapper.widgetComponent$lambda$3(this.f6770b);
                return widgetComponent$lambda$3;
            case 9:
                create$lambda$04 = PriceCalendarFooterV3Component.Companion.create$lambda$0(this.f6770b);
                return create$lambda$04;
            case 10:
                create$lambda$05 = AdditionalServicesComponent.Companion.create$lambda$0(this.f6770b);
                return create$lambda$05;
            default:
                create$lambda$06 = CustomerContactsV3Component.Companion.create$lambda$0(this.f6770b);
                return create$lambda$06;
        }
    }
}
