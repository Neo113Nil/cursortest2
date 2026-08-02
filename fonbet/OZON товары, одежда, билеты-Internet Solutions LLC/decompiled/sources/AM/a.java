package AM;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.account.orders.orderProduct.di.OrderProductComponent;
import ru.ozon.app.android.account.orders.orderProduct.presentation.item.OrderProductItemViewMapper;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.di.ShipmentWidgetV2ComponentV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.CartSplitV2AccessoriesWidgetComponent;
import ru.ozon.app.android.cart.premiumPointsTrainV2.di.PremiumPointsTrainV2Component;
import ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.multipleCarriageTrain.PremiumPointsTrainV2MultipleViewMapper;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.core.OrderDoneButtonBarStickyWidgetViewMapper;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.di.OrderDoneButtonBarWidgetComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.di.ChangeEmailDIComponent;
import ru.ozon.app.android.marketing.widgets.blackfridaycounter.di.BlackFridayCounterComponent;
import ru.ozon.app.android.pdp.widgets.sellerPoints.di.PdpSellerPointsWidgetComponent;
import ru.ozon.app.android.product.common.header.HeaderWidgetViewMapper;
import ru.ozon.app.android.product.common.header.di.HeaderComponent;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.di.CancelPostingsV2Component;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.monoposting.CancelPostingsV2MonopostingViewMapper;
import ru.ozon.app.android.returns.returnableItemsList.di.ReturnableItemsListComponent;
import ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.item.viewMapper.ReturnableItemsListViewMapper;
import ru.ozon.app.android.session.sessionList.di.SessionListComponent;
import ru.ozon.app.android.session.sessionList.mapper.SessionListViewMapper;
import ru.ozon.app.android.storefront.widgets.playvideo.di.PlayVideoWidgetComponent;
import ru.ozon.app.android.storefront.widgets.playvideo.presentation.PlayVideoNoUiViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.di.AviaSearchResultComponent;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersLuggageButton.di.PassengersLuggageButtonComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWidget.v2.di.ButtonWidgetV2Component;
import ru.ozon.app.android.ugc.widgets.reviewSort.di.ReviewSortButtonComponent;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.di.UniversalObjectWidgetComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f646a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f647b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f646a = i11;
        this.f647b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        AviaSearchResultComponent create$lambda$0;
        CancelPostingsV2Component widgetComponent$lambda$0;
        PlayVideoWidgetComponent widgetComponent$lambda$1;
        HeaderComponent widgetComponent$lambda$02;
        SessionListComponent widgetComponent$lambda$03;
        ChangeEmailDIComponent create$lambda$02;
        UniversalObjectWidgetComponent create$lambda$03;
        PdpSellerPointsWidgetComponent create$lambda$04;
        PassengersLuggageButtonComponent create$lambda$05;
        PremiumPointsTrainV2Component widgetComponent$lambda$04;
        OrderProductComponent widgetComponent$lambda$05;
        ShipmentWidgetV2ComponentV2 create$lambda$06;
        CartSplitV2AccessoriesWidgetComponent create$lambda$07;
        BlackFridayCounterComponent create$lambda$08;
        ButtonWidgetV2Component create$lambda$09;
        ReturnableItemsListComponent widgetComponent$lambda$06;
        OrderDoneButtonBarWidgetComponent widgetComponent$lambda$3;
        ReviewSortButtonComponent instance$lambda$0;
        switch (this.f646a) {
            case 0:
                create$lambda$0 = AviaSearchResultComponent.Companion.create$lambda$0(this.f647b);
                return create$lambda$0;
            case 1:
                widgetComponent$lambda$0 = CancelPostingsV2MonopostingViewMapper.widgetComponent$lambda$0(this.f647b);
                return widgetComponent$lambda$0;
            case 2:
                widgetComponent$lambda$1 = PlayVideoNoUiViewMapper.widgetComponent$lambda$1(this.f647b);
                return widgetComponent$lambda$1;
            case 3:
                widgetComponent$lambda$02 = HeaderWidgetViewMapper.widgetComponent$lambda$0(this.f647b);
                return widgetComponent$lambda$02;
            case 4:
                widgetComponent$lambda$03 = SessionListViewMapper.widgetComponent$lambda$0(this.f647b);
                return widgetComponent$lambda$03;
            case 5:
                create$lambda$02 = ChangeEmailDIComponent.Companion.create$lambda$0(this.f647b);
                return create$lambda$02;
            case 6:
                create$lambda$03 = UniversalObjectWidgetComponent.Companion.create$lambda$0(this.f647b);
                return create$lambda$03;
            case 7:
                create$lambda$04 = PdpSellerPointsWidgetComponent.Companion.create$lambda$0(this.f647b);
                return create$lambda$04;
            case 8:
                create$lambda$05 = PassengersLuggageButtonComponent.Companion.create$lambda$0(this.f647b);
                return create$lambda$05;
            case 9:
                widgetComponent$lambda$04 = PremiumPointsTrainV2MultipleViewMapper.widgetComponent$lambda$0(this.f647b);
                return widgetComponent$lambda$04;
            case 10:
                widgetComponent$lambda$05 = OrderProductItemViewMapper.widgetComponent$lambda$0(this.f647b);
                return widgetComponent$lambda$05;
            case 11:
                create$lambda$06 = ShipmentWidgetV2ComponentV2.Companion.create$lambda$0(this.f647b);
                return create$lambda$06;
            case 12:
                create$lambda$07 = CartSplitV2AccessoriesWidgetComponent.Companion.create$lambda$0(this.f647b);
                return create$lambda$07;
            case 13:
                create$lambda$08 = BlackFridayCounterComponent.Companion.create$lambda$0(this.f647b);
                return create$lambda$08;
            case 14:
                create$lambda$09 = ButtonWidgetV2Component.Companion.create$lambda$0(this.f647b);
                return create$lambda$09;
            case 15:
                widgetComponent$lambda$06 = ReturnableItemsListViewMapper.widgetComponent$lambda$0(this.f647b);
                return widgetComponent$lambda$06;
            case 16:
                widgetComponent$lambda$3 = OrderDoneButtonBarStickyWidgetViewMapper.widgetComponent$lambda$3(this.f647b);
                return widgetComponent$lambda$3;
            default:
                instance$lambda$0 = ReviewSortButtonComponent.Companion.getInstance$lambda$0(this.f647b);
                return instance$lambda$0;
        }
    }
}
