package AR;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.fresh.checkout.widgets.cellList.v1.di.CellListDIComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.faq.di.FaqWidgetComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.faq.presentation.FaqViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEntities.di.UserLegalEntitiesComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEntities.presentation.UserLegalEntitiesViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.di.PdpNutritionInfoComponent;
import ru.ozon.app.android.marketing.widgets.ladderActions.di.LadderActionsComponent;
import ru.ozon.app.android.search.catalog.components.categorylogos.di.CategoryLogosComponent;
import ru.ozon.app.android.storefront.widgets.cms.richtext.RichTextWidgetComponent;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.di.TravelModalPriceDetailInformationV4Component;
import ru.ozon.app.android.travel.feature.general.services.widgets.textInfoCells.di.TextInfoCellsComponent;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageHeader.di.HotelsPageHeaderComponent;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.di.ReportDocumentComponent;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.di.TravelScrollPriceCalendarV2Component;
import ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.di.SegmentedTrainRouteComponent;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2BannerButtonComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f657a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f658b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f657a = i11;
        this.f658b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        TextInfoCellsComponent create$lambda$0;
        RichTextWidgetComponent create$lambda$02;
        PdpNutritionInfoComponent create$lambda$03;
        LadderActionsComponent create$lambda$04;
        CategoryLogosComponent create$lambda$05;
        ReportDocumentComponent create$lambda$06;
        TravelScrollPriceCalendarV2Component create$lambda$07;
        FaqWidgetComponent widgetComponent$lambda$0;
        CellListDIComponent create$lambda$08;
        SegmentedTrainRouteComponent create$lambda$09;
        TileGrid2BannerButtonComponent create$lambda$010;
        TravelModalPriceDetailInformationV4Component create$lambda$011;
        UserLegalEntitiesComponent widgetComponent$lambda$02;
        HotelsPageHeaderComponent create$lambda$012;
        switch (this.f657a) {
            case 0:
                create$lambda$0 = TextInfoCellsComponent.Companion.create$lambda$0(this.f658b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = RichTextWidgetComponent.Companion.create$lambda$0(this.f658b);
                return create$lambda$02;
            case 2:
                create$lambda$03 = PdpNutritionInfoComponent.Companion.create$lambda$0(this.f658b);
                return create$lambda$03;
            case 3:
                create$lambda$04 = LadderActionsComponent.Companion.create$lambda$0(this.f658b);
                return create$lambda$04;
            case 4:
                create$lambda$05 = CategoryLogosComponent.Companion.create$lambda$0(this.f658b);
                return create$lambda$05;
            case 5:
                create$lambda$06 = ReportDocumentComponent.Companion.create$lambda$0(this.f658b);
                return create$lambda$06;
            case 6:
                create$lambda$07 = TravelScrollPriceCalendarV2Component.Companion.create$lambda$0(this.f658b);
                return create$lambda$07;
            case 7:
                widgetComponent$lambda$0 = FaqViewMapper.widgetComponent$lambda$0(this.f658b);
                return widgetComponent$lambda$0;
            case 8:
                create$lambda$08 = CellListDIComponent.Companion.create$lambda$0(this.f658b);
                return create$lambda$08;
            case 9:
                create$lambda$09 = SegmentedTrainRouteComponent.Companion.create$lambda$0(this.f658b);
                return create$lambda$09;
            case 10:
                create$lambda$010 = TileGrid2BannerButtonComponent.Companion.create$lambda$0(this.f658b);
                return create$lambda$010;
            case 11:
                create$lambda$011 = TravelModalPriceDetailInformationV4Component.Companion.create$lambda$0(this.f658b);
                return create$lambda$011;
            case 12:
                widgetComponent$lambda$02 = UserLegalEntitiesViewMapper.widgetComponent$lambda$0(this.f658b);
                return widgetComponent$lambda$02;
            default:
                create$lambda$012 = HotelsPageHeaderComponent.Companion.create$lambda$0(this.f658b);
                return create$lambda$012;
        }
    }
}
