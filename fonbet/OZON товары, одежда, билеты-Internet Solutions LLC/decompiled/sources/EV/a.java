package EV;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.core.delivery.DeliveryViewMapper;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.di.ClickToDeliveryWidgetComponent;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.core.title.DeliveryDateChangedComplaintFormTitleViewMapper;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.di.DeliveryDateChangedComplaintFormComponent;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.di.CartSplitV2CellItemWidgetComponent;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.CartSplitV2ProductWidgetComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.di.CheckLegalInfoComponent;
import ru.ozon.app.android.orderdetails.cancelReasons.di.SelectCancelReasonComponent;
import ru.ozon.app.android.orderdetails.cancelReasons.presentation.sticky.SelectCancelReasonStickyViewMapper;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.action.ActionOrderShipmentComponent;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.action.ActionOrderShipmentViewMapper;
import ru.ozon.app.android.pdp.widgets.markdown.id.MarkdownComponent;
import ru.ozon.app.android.pdp.widgets.sellerV7.di.SellerV7WidgetComponent;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.core.main.EmptyScreenViewMapper;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.di.EmptyScreenWidgetComponent;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.core.RateViewMapper;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.di.RateComponent;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaBookedTicketInfo.di.AviaBookedTicketInfoComponent;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.di.CustomerContactsV2Component;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.di.PassengersMatcherV2Component;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.di.HotelsSearchResultsV5Component;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.di.HotelsGalleryComponent;
import ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.di.ToursFlightOptionsComponent;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.di.MediaCentricComponent;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid3.di.SkuGrid3Component;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid3.presentation.SkuGrid3ViewMapper;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7709a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f7710b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f7709a = i11;
        this.f7710b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        MediaCentricComponent create$lambda$0;
        ToursFlightOptionsComponent create$lambda$02;
        DeliveryDateChangedComplaintFormComponent widgetComponent$lambda$2;
        RateComponent widgetComponent$lambda$1;
        PassengersMatcherV2Component create$lambda$03;
        SellerV7WidgetComponent create$lambda$04;
        HotelsSearchResultsV5Component create$lambda$05;
        SelectCancelReasonComponent widgetComponent$lambda$22;
        EmptyScreenWidgetComponent widgetComponent$lambda$12;
        HotelsGalleryComponent create$lambda$06;
        SkuGrid3Component widgetComponent$lambda$0;
        CheckLegalInfoComponent create$lambda$07;
        CartSplitV2CellItemWidgetComponent create$lambda$08;
        AviaBookedTicketInfoComponent create$lambda$09;
        MarkdownComponent createComponent$lambda$0;
        CartSplitV2ProductWidgetComponent create$lambda$010;
        ActionOrderShipmentComponent widgetComponent$lambda$02;
        ClickToDeliveryWidgetComponent widgetComponent$lambda$13;
        CustomerContactsV2Component create$lambda$011;
        switch (this.f7709a) {
            case 0:
                create$lambda$0 = MediaCentricComponent.Companion.create$lambda$0(this.f7710b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = ToursFlightOptionsComponent.Companion.create$lambda$0(this.f7710b);
                return create$lambda$02;
            case 2:
                widgetComponent$lambda$2 = DeliveryDateChangedComplaintFormTitleViewMapper.widgetComponent$lambda$2(this.f7710b);
                return widgetComponent$lambda$2;
            case 3:
                widgetComponent$lambda$1 = RateViewMapper.widgetComponent$lambda$1(this.f7710b);
                return widgetComponent$lambda$1;
            case 4:
                create$lambda$03 = PassengersMatcherV2Component.Companion.create$lambda$0(this.f7710b);
                return create$lambda$03;
            case 5:
                create$lambda$04 = SellerV7WidgetComponent.Companion.create$lambda$0(this.f7710b);
                return create$lambda$04;
            case 6:
                create$lambda$05 = HotelsSearchResultsV5Component.Companion.create$lambda$0(this.f7710b);
                return create$lambda$05;
            case 7:
                widgetComponent$lambda$22 = SelectCancelReasonStickyViewMapper.widgetComponent$lambda$2(this.f7710b);
                return widgetComponent$lambda$22;
            case 8:
                widgetComponent$lambda$12 = EmptyScreenViewMapper.widgetComponent$lambda$1(this.f7710b);
                return widgetComponent$lambda$12;
            case 9:
                create$lambda$06 = HotelsGalleryComponent.Companion.create$lambda$0(this.f7710b);
                return create$lambda$06;
            case 10:
                widgetComponent$lambda$0 = SkuGrid3ViewMapper.widgetComponent$lambda$0(this.f7710b);
                return widgetComponent$lambda$0;
            case 11:
                create$lambda$07 = CheckLegalInfoComponent.Companion.create$lambda$0(this.f7710b);
                return create$lambda$07;
            case 12:
                create$lambda$08 = CartSplitV2CellItemWidgetComponent.Companion.create$lambda$0(this.f7710b);
                return create$lambda$08;
            case 13:
                create$lambda$09 = AviaBookedTicketInfoComponent.Companion.create$lambda$0(this.f7710b);
                return create$lambda$09;
            case 14:
                createComponent$lambda$0 = MarkdownComponent.Companion.createComponent$lambda$0(this.f7710b);
                return createComponent$lambda$0;
            case 15:
                create$lambda$010 = CartSplitV2ProductWidgetComponent.Companion.create$lambda$0(this.f7710b);
                return create$lambda$010;
            case 16:
                widgetComponent$lambda$02 = ActionOrderShipmentViewMapper.widgetComponent$lambda$0(this.f7710b);
                return widgetComponent$lambda$02;
            case 17:
                widgetComponent$lambda$13 = DeliveryViewMapper.widgetComponent$lambda$1(this.f7710b);
                return widgetComponent$lambda$13;
            default:
                create$lambda$011 = CustomerContactsV2Component.Companion.create$lambda$0(this.f7710b);
                return create$lambda$011;
        }
    }
}
