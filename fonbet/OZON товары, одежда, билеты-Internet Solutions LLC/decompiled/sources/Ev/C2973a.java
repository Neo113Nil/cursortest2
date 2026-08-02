package Ev;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.cart.premiumPointsTrainV2.di.PremiumPointsTrainV2Component;
import ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.singleCarriageTrain.PremiumPointsTrainV2SingleViewMapper;
import ru.ozon.app.android.cml.delivery.widgets.orderCalculator.di.OrderCalculatorComponent;
import ru.ozon.app.android.fresh.chat.widgets.responseActions.di.ResponseActionsDIComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.core.AddEdoButtonsViewMapperV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.di.AddEdoComponentV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEnitiesV2.di.UserLegalEntitiesComponentV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEnitiesV2.presentation.UserLegalEntitiesViewMapperV2;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.di.GeotrackingMapV2Component;
import ru.ozon.app.android.fresh.unsorted.widgets.addressSelectorLite.di.AddressSelectorLiteComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.di.RecShelfComponent;
import ru.ozon.app.android.search.widgets.searchCategoryHeader.data.SearchCategoryHeaderViewMapper;
import ru.ozon.app.android.search.widgets.searchCategoryHeader.di.SearchCategoryHeaderDiComponent;
import ru.ozon.app.android.search.widgets.searchResult.header.di.SearchResultHeaderComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.di.PricesHistogramComponent;
import ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.di.UnpaidOrderListComponent;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v3.di.FlightOrderDetailsV3Component;
import ru.ozon.app.android.ugc.widgets.productVariant.di.ProductVariantComponent;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid2.di.SkuGrid2Component;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid2.presentation.SkuGrid2ViewMapper;

/* renamed from: Ev.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C2973a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8151a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f8152b;

    public /* synthetic */ C2973a(C7475g c7475g, int i11) {
        this.f8151a = i11;
        this.f8152b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        GeotrackingMapV2Component create$lambda$0;
        SearchCategoryHeaderDiComponent widgetComponent$lambda$0;
        AddEdoComponentV2 widgetComponent$lambda$1;
        SearchResultHeaderComponent create$lambda$02;
        UnpaidOrderListComponent create$lambda$03;
        RecShelfComponent create$lambda$04;
        PremiumPointsTrainV2Component widgetComponent$lambda$02;
        AddressSelectorLiteComponent create$lambda$05;
        FlightOrderDetailsV3Component create$lambda$06;
        ResponseActionsDIComponent create$lambda$07;
        SkuGrid2Component widgetComponent$lambda$03;
        OrderCalculatorComponent create$lambda$08;
        ProductVariantComponent instance$lambda$0;
        PricesHistogramComponent create$lambda$09;
        UserLegalEntitiesComponentV2 widgetComponent$lambda$04;
        switch (this.f8151a) {
            case 0:
                create$lambda$0 = GeotrackingMapV2Component.Companion.create$lambda$0(this.f8152b);
                return create$lambda$0;
            case 1:
                widgetComponent$lambda$0 = SearchCategoryHeaderViewMapper.widgetComponent$lambda$0(this.f8152b);
                return widgetComponent$lambda$0;
            case 2:
                widgetComponent$lambda$1 = AddEdoButtonsViewMapperV2.widgetComponent$lambda$1(this.f8152b);
                return widgetComponent$lambda$1;
            case 3:
                create$lambda$02 = SearchResultHeaderComponent.Companion.create$lambda$0(this.f8152b);
                return create$lambda$02;
            case 4:
                create$lambda$03 = UnpaidOrderListComponent.Companion.create$lambda$0(this.f8152b);
                return create$lambda$03;
            case 5:
                create$lambda$04 = RecShelfComponent.Companion.create$lambda$0(this.f8152b);
                return create$lambda$04;
            case 6:
                widgetComponent$lambda$02 = PremiumPointsTrainV2SingleViewMapper.widgetComponent$lambda$0(this.f8152b);
                return widgetComponent$lambda$02;
            case 7:
                create$lambda$05 = AddressSelectorLiteComponent.Companion.create$lambda$0(this.f8152b);
                return create$lambda$05;
            case 8:
                create$lambda$06 = FlightOrderDetailsV3Component.Companion.create$lambda$0(this.f8152b);
                return create$lambda$06;
            case 9:
                create$lambda$07 = ResponseActionsDIComponent.Companion.create$lambda$0(this.f8152b);
                return create$lambda$07;
            case 10:
                widgetComponent$lambda$03 = SkuGrid2ViewMapper.widgetComponent$lambda$0(this.f8152b);
                return widgetComponent$lambda$03;
            case 11:
                create$lambda$08 = OrderCalculatorComponent.Companion.create$lambda$0(this.f8152b);
                return create$lambda$08;
            case 12:
                instance$lambda$0 = ProductVariantComponent.Companion.getInstance$lambda$0(this.f8152b);
                return instance$lambda$0;
            case 13:
                create$lambda$09 = PricesHistogramComponent.Companion.create$lambda$0(this.f8152b);
                return create$lambda$09;
            default:
                widgetComponent$lambda$04 = UserLegalEntitiesViewMapperV2.widgetComponent$lambda$0(this.f8152b);
                return widgetComponent$lambda$04;
        }
    }
}
