package AB;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.core.buttons.ButtonsViewMapper;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.di.ClickToDeliveryWidgetComponent;
import ru.ozon.app.android.account.orders.orderProduct.di.OrderProductComponent;
import ru.ozon.app.android.account.orders.orderProduct.presentation.separator.OrderProductSeparatorViewMapper;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.data.AdvVideoBannerV2NewViewMapper;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.di.AdvVideoBannerV2DiComponent;
import ru.ozon.app.android.bank.widgets.starPoints.core.StarPointsViewMapper;
import ru.ozon.app.android.bank.widgets.starPoints.di.StarPointsComponent;
import ru.ozon.app.android.checkoutcomposer.paymentInfoV2.di.PaymentInfoV2WidgetComponent;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v3.di.TotalStickyV3Component;
import ru.ozon.app.android.cml.delivery.widgets.order.v1.di.OrderWidgetV1Component;
import ru.ozon.app.android.composer.ComposerFragmentController;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.chat.widgets.textInput.di.TextInputDIComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.di.PdpAspectsDIComponent;
import ru.ozon.app.android.geo.addressBookBar.di.AddressBookBarComponent;
import ru.ozon.app.android.orderdetails.productsToPay.di.ProductsToPayWidgetComponent;
import ru.ozon.app.android.orderdetails.trackshipment.di.OrderTrackShipmentComponent;
import ru.ozon.app.android.orderdetails.trackshipment.presentation.OrderTrackShipmentViewMapper;
import ru.ozon.app.android.returns.details.di.ReturnDetailsComponent;
import ru.ozon.app.android.returns.details.viewMapper.ReturnDetailsViewMapper;
import ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.di.PromoPushEnableComponent;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.di.RichPromoScrollComponent;
import ru.ozon.app.android.storefront.widgets.naviBlocksV5.di.NaviBlocksV5WidgetComponent;
import ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.di.ModalCheckoutTimeLimitComponent;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendarPriceLegend.di.CalendarPriceLegendComponent;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServiceCell.di.AdditionalServiceCellComponent;

/* loaded from: classes6.dex */
public final /* synthetic */ class b implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f597a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f598b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f597a = i11;
        this.f598b = obj;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        OrderTrackShipmentComponent widgetComponent$lambda$0;
        PdpAspectsDIComponent create$lambda$0;
        StarPointsComponent widgetComponent$lambda$1;
        AdvVideoBannerV2DiComponent widgetComponent$lambda$02;
        ModalCheckoutTimeLimitComponent create$lambda$02;
        OrderProductComponent widgetComponent$lambda$12;
        OrderWidgetV1Component create$lambda$03;
        TextInputDIComponent create$lambda$04;
        PromoPushEnableComponent create$lambda$05;
        TotalStickyV3Component create$lambda$06;
        CalendarPriceLegendComponent create$lambda$07;
        AddressBookBarComponent create$lambda$08;
        ReturnDetailsComponent widgetComponent$lambda$03;
        AdditionalServiceCellComponent create$lambda$09;
        NaviBlocksV5WidgetComponent create$lambda$010;
        ProductsToPayWidgetComponent create$lambda$011;
        ClickToDeliveryWidgetComponent widgetComponent$lambda$2;
        RichPromoScrollComponent create$lambda$012;
        PaymentInfoV2WidgetComponent create$lambda$013;
        InterfaceC6958a _init_$lambda$1;
        switch (this.f597a) {
            case 0:
                widgetComponent$lambda$0 = OrderTrackShipmentViewMapper.widgetComponent$lambda$0((C7475g) this.f598b);
                return widgetComponent$lambda$0;
            case 1:
                create$lambda$0 = PdpAspectsDIComponent.Companion.create$lambda$0((C7475g) this.f598b);
                return create$lambda$0;
            case 2:
                widgetComponent$lambda$1 = StarPointsViewMapper.widgetComponent$lambda$1((C7475g) this.f598b);
                return widgetComponent$lambda$1;
            case 3:
                widgetComponent$lambda$02 = AdvVideoBannerV2NewViewMapper.widgetComponent$lambda$0((C7475g) this.f598b);
                return widgetComponent$lambda$02;
            case 4:
                create$lambda$02 = ModalCheckoutTimeLimitComponent.Companion.create$lambda$0((C7475g) this.f598b);
                return create$lambda$02;
            case 5:
                widgetComponent$lambda$12 = OrderProductSeparatorViewMapper.widgetComponent$lambda$1((C7475g) this.f598b);
                return widgetComponent$lambda$12;
            case 6:
                create$lambda$03 = OrderWidgetV1Component.Companion.create$lambda$0((C7475g) this.f598b);
                return create$lambda$03;
            case 7:
                create$lambda$04 = TextInputDIComponent.Companion.create$lambda$0((C7475g) this.f598b);
                return create$lambda$04;
            case 8:
                create$lambda$05 = PromoPushEnableComponent.Companion.create$lambda$0((C7475g) this.f598b);
                return create$lambda$05;
            case 9:
                create$lambda$06 = TotalStickyV3Component.Companion.create$lambda$0((C7475g) this.f598b);
                return create$lambda$06;
            case 10:
                create$lambda$07 = CalendarPriceLegendComponent.Companion.create$lambda$0((C7475g) this.f598b);
                return create$lambda$07;
            case 11:
                create$lambda$08 = AddressBookBarComponent.Companion.create$lambda$0((C7475g) this.f598b);
                return create$lambda$08;
            case 12:
                widgetComponent$lambda$03 = ReturnDetailsViewMapper.widgetComponent$lambda$0((C7475g) this.f598b);
                return widgetComponent$lambda$03;
            case 13:
                create$lambda$09 = AdditionalServiceCellComponent.Companion.create$lambda$0((C7475g) this.f598b);
                return create$lambda$09;
            case 14:
                create$lambda$010 = NaviBlocksV5WidgetComponent.Companion.create$lambda$0((C7475g) this.f598b);
                return create$lambda$010;
            case 15:
                create$lambda$011 = ProductsToPayWidgetComponent.Companion.create$lambda$0((C7475g) this.f598b);
                return create$lambda$011;
            case 16:
                widgetComponent$lambda$2 = ButtonsViewMapper.widgetComponent$lambda$2((C7475g) this.f598b);
                return widgetComponent$lambda$2;
            case 17:
                create$lambda$012 = RichPromoScrollComponent.Companion.create$lambda$0((C7475g) this.f598b);
                return create$lambda$012;
            case 18:
                create$lambda$013 = PaymentInfoV2WidgetComponent.Companion.create$lambda$0((C7475g) this.f598b);
                return create$lambda$013;
            default:
                _init_$lambda$1 = ComposerFragmentController._init_$lambda$1((RetainComposerComponentApi) this.f598b);
                return _init_$lambda$1;
        }
    }
}
