package Do;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.checkoutcomposer.pointsAndBonuses.di.PointsAndBonusesWidgetComponent;
import ru.ozon.app.android.checkoutcomposer.totalV3.di.TotalV3WidgetComponent;
import ru.ozon.app.android.cml.delivery.widgets.regionSearch.di.RegionSearchComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.di.LegalDetailsEditorComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.LegalDetailsEditorViewMapper;
import ru.ozon.app.android.orderdetails.modalConstructor.di.ModalConstructorComponent;
import ru.ozon.app.android.orderdetails.modalConstructor.presentation.imageList.HorizontalScrollImagesViewMapper;
import ru.ozon.app.android.pdp.widgets.galleryV5.di.GalleryV5WidgetComponent;
import ru.ozon.app.android.storefront.widgets.cms.horizontalAutoScroll.core.HorizontalAutoScrollViewMapper;
import ru.ozon.app.android.storefront.widgets.cms.horizontalAutoScroll.di.HorizontalAutoScrollComponent;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.di.TravelPersonalAccountReplenishmentComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.di.TravelCellListV3Component;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.di.PriceCalendarFooterComponent;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f6765b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f6764a = i11;
        this.f6765b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        PointsAndBonusesWidgetComponent create$lambda$0;
        TravelCellListV3Component create$lambda$02;
        LegalDetailsEditorComponent widgetComponent$lambda$0;
        GalleryV5WidgetComponent create$lambda$03;
        TotalV3WidgetComponent create$lambda$04;
        ModalConstructorComponent widgetComponent$lambda$1;
        RegionSearchComponent create$lambda$05;
        PriceCalendarFooterComponent create$lambda$06;
        TravelPersonalAccountReplenishmentComponent create$lambda$07;
        HorizontalAutoScrollComponent widgetComponent$lambda$02;
        switch (this.f6764a) {
            case 0:
                create$lambda$0 = PointsAndBonusesWidgetComponent.Companion.create$lambda$0(this.f6765b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = TravelCellListV3Component.Companion.create$lambda$0(this.f6765b);
                return create$lambda$02;
            case 2:
                widgetComponent$lambda$0 = LegalDetailsEditorViewMapper.widgetComponent$lambda$0(this.f6765b);
                return widgetComponent$lambda$0;
            case 3:
                create$lambda$03 = GalleryV5WidgetComponent.Companion.create$lambda$0(this.f6765b);
                return create$lambda$03;
            case 4:
                create$lambda$04 = TotalV3WidgetComponent.Companion.create$lambda$0(this.f6765b);
                return create$lambda$04;
            case 5:
                widgetComponent$lambda$1 = HorizontalScrollImagesViewMapper.widgetComponent$lambda$1(this.f6765b);
                return widgetComponent$lambda$1;
            case 6:
                create$lambda$05 = RegionSearchComponent.Companion.create$lambda$0(this.f6765b);
                return create$lambda$05;
            case 7:
                create$lambda$06 = PriceCalendarFooterComponent.Companion.create$lambda$0(this.f6765b);
                return create$lambda$06;
            case 8:
                create$lambda$07 = TravelPersonalAccountReplenishmentComponent.Companion.create$lambda$0(this.f6765b);
                return create$lambda$07;
            default:
                widgetComponent$lambda$02 = HorizontalAutoScrollViewMapper.widgetComponent$lambda$0(this.f6765b);
                return widgetComponent$lambda$02;
        }
    }
}
