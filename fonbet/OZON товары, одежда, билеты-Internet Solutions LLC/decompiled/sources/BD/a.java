package BD;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.ads.widgets.advPageStay.di.AdvPageStayComponent;
import ru.ozon.app.android.ads.widgets.advPageStay.presentation.AdvPageStayViewMapper;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v2.di.TotalStickyV2Component;
import ru.ozon.app.android.csma.tips.widgets.tipcourierproductphotos.di.TipProductPhotosComponent;
import ru.ozon.app.android.csma.tips.widgets.tipcourierproductphotos.presentation.TipProductPhotosViewMapper;
import ru.ozon.app.android.fresh.cart.widgets.cartIconButton.di.CartIconButtonComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.accountListMobile.di.AccountListMobileComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.accountListMobile.presentation.AccountListMobileViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalMobile.core.AddLegalMobileViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalMobile.di.AddLegalMobileComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.di.ProductsInBotV2Component;
import ru.ozon.app.android.geo.addressEditDetail.di.AddressEditDetailWidgetComponent;
import ru.ozon.app.android.orders.cml.deliveryOrderOnDetails.di.DeliveryOrderOnDetailsComponent;
import ru.ozon.app.android.pdp.widgets.crosssale.di.CrossSaleWidgetComponent;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.di.InstallmentPurchaseWidgetsComponent;
import ru.ozon.app.android.search.catalog.components.clusters.di.ClustersWidgetComponent;
import ru.ozon.app.android.search.widgets.suggestion.di.SearchSuggestionComponent;
import ru.ozon.app.android.search.widgets.title.core.SuggestionTitleViewMapper;
import ru.ozon.app.android.sellerproducts.di.SellerProductsComponent;
import ru.ozon.app.android.sellerproducts.sellerProducts.presentation.SellerProductsViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.di.FlightSeatsSchemeComponent;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelSearchSortAndFilter.di.TravelSearchSortAndFilterComponent;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.di.TravelOrderListMobileComponent;
import ru.ozon.app.android.ugc.widgets.reviewTiles.di.ReviewTilesComponent;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid2.di.SkuGrid2Component;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid2.presentation.SkuGrid2ThinViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.di.TileGrid3WidgetComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3239a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f3240b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f3239a = i11;
        this.f3240b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        CrossSaleWidgetComponent create$lambda$0;
        AdvPageStayComponent widgetComponent$lambda$0;
        AccountListMobileComponent widgetComponent$lambda$02;
        DeliveryOrderOnDetailsComponent create$lambda$02;
        CartIconButtonComponent create$lambda$03;
        ProductsInBotV2Component create$lambda$04;
        FlightSeatsSchemeComponent create$lambda$05;
        ClustersWidgetComponent create$lambda$06;
        SkuGrid2Component widgetComponent$lambda$03;
        TotalStickyV2Component create$lambda$07;
        SearchSuggestionComponent widgetComponent$lambda$04;
        AddLegalMobileComponent widgetComponent$lambda$05;
        TravelSearchSortAndFilterComponent create$lambda$08;
        TravelOrderListMobileComponent create$lambda$09;
        InstallmentPurchaseWidgetsComponent instance$lambda$0;
        TipProductPhotosComponent widgetComponent$lambda$1;
        SellerProductsComponent widgetComponent$lambda$06;
        TileGrid3WidgetComponent create$lambda$010;
        AddressEditDetailWidgetComponent create$lambda$011;
        ReviewTilesComponent instance$lambda$02;
        switch (this.f3239a) {
            case 0:
                create$lambda$0 = CrossSaleWidgetComponent.Companion.create$lambda$0(this.f3240b);
                return create$lambda$0;
            case 1:
                widgetComponent$lambda$0 = AdvPageStayViewMapper.widgetComponent$lambda$0(this.f3240b);
                return widgetComponent$lambda$0;
            case 2:
                widgetComponent$lambda$02 = AccountListMobileViewMapper.widgetComponent$lambda$0(this.f3240b);
                return widgetComponent$lambda$02;
            case 3:
                create$lambda$02 = DeliveryOrderOnDetailsComponent.Companion.create$lambda$0(this.f3240b);
                return create$lambda$02;
            case 4:
                create$lambda$03 = CartIconButtonComponent.Companion.create$lambda$0(this.f3240b);
                return create$lambda$03;
            case 5:
                create$lambda$04 = ProductsInBotV2Component.Companion.create$lambda$0(this.f3240b);
                return create$lambda$04;
            case 6:
                create$lambda$05 = FlightSeatsSchemeComponent.Companion.create$lambda$0(this.f3240b);
                return create$lambda$05;
            case 7:
                create$lambda$06 = ClustersWidgetComponent.Companion.create$lambda$0(this.f3240b);
                return create$lambda$06;
            case 8:
                widgetComponent$lambda$03 = SkuGrid2ThinViewMapper.widgetComponent$lambda$0(this.f3240b);
                return widgetComponent$lambda$03;
            case 9:
                create$lambda$07 = TotalStickyV2Component.Companion.create$lambda$0(this.f3240b);
                return create$lambda$07;
            case 10:
                widgetComponent$lambda$04 = SuggestionTitleViewMapper.widgetComponent$lambda$0(this.f3240b);
                return widgetComponent$lambda$04;
            case 11:
                widgetComponent$lambda$05 = AddLegalMobileViewMapper.widgetComponent$lambda$0(this.f3240b);
                return widgetComponent$lambda$05;
            case 12:
                create$lambda$08 = TravelSearchSortAndFilterComponent.Companion.create$lambda$0(this.f3240b);
                return create$lambda$08;
            case 13:
                create$lambda$09 = TravelOrderListMobileComponent.Companion.create$lambda$0(this.f3240b);
                return create$lambda$09;
            case 14:
                instance$lambda$0 = InstallmentPurchaseWidgetsComponent.Companion.getInstance$lambda$0(this.f3240b);
                return instance$lambda$0;
            case 15:
                widgetComponent$lambda$1 = TipProductPhotosViewMapper.widgetComponent$lambda$1(this.f3240b);
                return widgetComponent$lambda$1;
            case 16:
                widgetComponent$lambda$06 = SellerProductsViewMapper.widgetComponent$lambda$0(this.f3240b);
                return widgetComponent$lambda$06;
            case 17:
                create$lambda$010 = TileGrid3WidgetComponent.Companion.create$lambda$0(this.f3240b);
                return create$lambda$010;
            case 18:
                create$lambda$011 = AddressEditDetailWidgetComponent.Companion.create$lambda$0(this.f3240b);
                return create$lambda$011;
            default:
                instance$lambda$02 = ReviewTilesComponent.Companion.getInstance$lambda$0(this.f3240b);
                return instance$lambda$02;
        }
    }
}
