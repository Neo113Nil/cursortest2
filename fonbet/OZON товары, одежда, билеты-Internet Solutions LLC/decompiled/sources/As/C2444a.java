package As;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.account.orders.ordergallery.core.OrderGalleryViewMapper;
import ru.ozon.app.android.account.orders.ordergallery.di.OrderGalleryComponent;
import ru.ozon.app.android.account.orders.selectPayment.di.SelectPaymentComponent;
import ru.ozon.app.android.account.orders.selectPayment.presentation.SelectPaymentOverlayViewMapper;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.di.DeliveryReviewFormWidgetComponent;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.header.DeliveryReviewFormHeaderViewMapper;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.di.StickyTotalComponent;
import ru.ozon.app.android.fresh.checkout.widgets.stickyPromoBadge.di.StickyPromoBadgeDIComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsTable.di.DocsTableComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsTable.presentation.DocsTableViewMapper;
import ru.ozon.app.android.fresh.main.widgets.couponGoals.v2.di.CouponGoalsV2Component;
import ru.ozon.app.android.fresh.main.widgets.header.di.HeaderComponent;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.di.ExpressNavigationSliderItemsComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.installmentPaymentSchedule.di.FreshPaymentScheduleWidgetComponent;
import ru.ozon.app.android.geo.addressEditForm.di.AddressEditFormWidgetComponent;
import ru.ozon.app.android.geo.addresseditformprompt.di.AddressEditFormPromptWidgetComponent;
import ru.ozon.app.android.orderdetails.dateselector.di.DateSelectorComponent;
import ru.ozon.app.android.orderdetails.dateselector.presentation.DateSelectorViewMapper;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.di.WidgetImagePlaceholderComponent;
import ru.ozon.app.android.product.common.footer.FooterViewMapper;
import ru.ozon.app.android.product.common.footer.di.FooterComponent;

/* renamed from: As.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C2444a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f1268b;

    public /* synthetic */ C2444a(C7475g c7475g, int i11) {
        this.f1267a = i11;
        this.f1268b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        DeliveryReviewFormWidgetComponent widgetComponent$lambda$0;
        FooterComponent widgetComponent$lambda$02;
        DocsTableComponent widgetComponent$lambda$03;
        StickyTotalComponent create$lambda$0;
        OrderGalleryComponent widgetComponent$lambda$04;
        DateSelectorComponent widgetComponent$lambda$05;
        CouponGoalsV2Component create$lambda$02;
        SelectPaymentComponent widgetComponent$lambda$2;
        HeaderComponent create$lambda$03;
        ExpressNavigationSliderItemsComponent create$lambda$04;
        AddressEditFormWidgetComponent create$lambda$05;
        StickyPromoBadgeDIComponent create$lambda$06;
        AddressEditFormPromptWidgetComponent create$lambda$07;
        FreshPaymentScheduleWidgetComponent create$lambda$08;
        WidgetImagePlaceholderComponent instance$lambda$0;
        switch (this.f1267a) {
            case 0:
                widgetComponent$lambda$0 = DeliveryReviewFormHeaderViewMapper.widgetComponent$lambda$0(this.f1268b);
                return widgetComponent$lambda$0;
            case 1:
                widgetComponent$lambda$02 = FooterViewMapper.widgetComponent$lambda$0(this.f1268b);
                return widgetComponent$lambda$02;
            case 2:
                widgetComponent$lambda$03 = DocsTableViewMapper.widgetComponent$lambda$0(this.f1268b);
                return widgetComponent$lambda$03;
            case 3:
                create$lambda$0 = StickyTotalComponent.Companion.create$lambda$0(this.f1268b);
                return create$lambda$0;
            case 4:
                widgetComponent$lambda$04 = OrderGalleryViewMapper.widgetComponent$lambda$0(this.f1268b);
                return widgetComponent$lambda$04;
            case 5:
                widgetComponent$lambda$05 = DateSelectorViewMapper.widgetComponent$lambda$0(this.f1268b);
                return widgetComponent$lambda$05;
            case 6:
                create$lambda$02 = CouponGoalsV2Component.Companion.create$lambda$0(this.f1268b);
                return create$lambda$02;
            case 7:
                widgetComponent$lambda$2 = SelectPaymentOverlayViewMapper.widgetComponent$lambda$2(this.f1268b);
                return widgetComponent$lambda$2;
            case 8:
                create$lambda$03 = HeaderComponent.Companion.create$lambda$0(this.f1268b);
                return create$lambda$03;
            case 9:
                create$lambda$04 = ExpressNavigationSliderItemsComponent.Companion.create$lambda$0(this.f1268b);
                return create$lambda$04;
            case 10:
                create$lambda$05 = AddressEditFormWidgetComponent.Companion.create$lambda$0(this.f1268b);
                return create$lambda$05;
            case 11:
                create$lambda$06 = StickyPromoBadgeDIComponent.Companion.create$lambda$0(this.f1268b);
                return create$lambda$06;
            case 12:
                create$lambda$07 = AddressEditFormPromptWidgetComponent.Companion.create$lambda$0(this.f1268b);
                return create$lambda$07;
            case 13:
                create$lambda$08 = FreshPaymentScheduleWidgetComponent.Companion.create$lambda$0(this.f1268b);
                return create$lambda$08;
            default:
                instance$lambda$0 = WidgetImagePlaceholderComponent.Companion.getInstance$lambda$0(this.f1268b);
                return instance$lambda$0;
        }
    }
}
