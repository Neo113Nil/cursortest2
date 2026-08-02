package Gm;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.bank.widgets.cbottom.di.CbottomWidgetComponent;
import ru.ozon.app.android.barcode.barcodeProductsList.di.BarcodeProductsListComponent;
import ru.ozon.app.android.button.core.ActionButtonOverlayViewMapper;
import ru.ozon.app.android.button.di.ActionButtonComponent;
import ru.ozon.app.android.common.filterWidgets.filtervalues.di.FilterValuesComponent;
import ru.ozon.app.android.monetization.widgets.skuListCopy.di.SkuListCopyComponent;
import ru.ozon.app.android.pdp.widgets.aspectsV4.di.AspectV4WidgetComponent;
import ru.ozon.app.android.storefront.stories.di.PlayStoriesV3Component;
import ru.ozon.app.android.storefront.stories.playstoriesv3.core.PlayStoriesV3ViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.di.AviaDetailedInfoV3Component;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerFormClearButton.di.TravelAddNewPassengerFormClearButtonComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.di.ServicePackageCarouselComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.ServicePackageCarouselViewMapper;
import ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.di.ReviewStatusInfoComponent;
import ru.ozon.app.android.ugc.core.widgets.singlereview.buttons.di.SingleReviewButtonsComponent;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f10286b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f10285a = i11;
        this.f10286b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        BarcodeProductsListComponent create$lambda$0;
        ActionButtonComponent widgetComponent$lambda$1;
        SkuListCopyComponent create$lambda$02;
        FilterValuesComponent create$lambda$03;
        AspectV4WidgetComponent instance$lambda$0;
        TravelAddNewPassengerFormClearButtonComponent create$lambda$04;
        PlayStoriesV3Component widgetComponent$lambda$12;
        ReviewStatusInfoComponent create$lambda$05;
        SingleReviewButtonsComponent create$lambda$06;
        ServicePackageCarouselComponent widgetComponent$lambda$13;
        CbottomWidgetComponent create$lambda$07;
        AviaDetailedInfoV3Component create$lambda$08;
        switch (this.f10285a) {
            case 0:
                create$lambda$0 = BarcodeProductsListComponent.Companion.create$lambda$0(this.f10286b);
                return create$lambda$0;
            case 1:
                widgetComponent$lambda$1 = ActionButtonOverlayViewMapper.widgetComponent$lambda$1(this.f10286b);
                return widgetComponent$lambda$1;
            case 2:
                create$lambda$02 = SkuListCopyComponent.Companion.create$lambda$0(this.f10286b);
                return create$lambda$02;
            case 3:
                create$lambda$03 = FilterValuesComponent.Companion.create$lambda$0(this.f10286b);
                return create$lambda$03;
            case 4:
                instance$lambda$0 = AspectV4WidgetComponent.Companion.getInstance$lambda$0(this.f10286b);
                return instance$lambda$0;
            case 5:
                create$lambda$04 = TravelAddNewPassengerFormClearButtonComponent.Companion.create$lambda$0(this.f10286b);
                return create$lambda$04;
            case 6:
                widgetComponent$lambda$12 = PlayStoriesV3ViewMapper.widgetComponent$lambda$1(this.f10286b);
                return widgetComponent$lambda$12;
            case 7:
                create$lambda$05 = ReviewStatusInfoComponent.Companion.create$lambda$0(this.f10286b);
                return create$lambda$05;
            case 8:
                create$lambda$06 = SingleReviewButtonsComponent.Companion.create$lambda$0(this.f10286b);
                return create$lambda$06;
            case 9:
                widgetComponent$lambda$13 = ServicePackageCarouselViewMapper.widgetComponent$lambda$1(this.f10286b);
                return widgetComponent$lambda$13;
            case 10:
                create$lambda$07 = CbottomWidgetComponent.Companion.create$lambda$0(this.f10286b);
                return create$lambda$07;
            default:
                create$lambda$08 = AviaDetailedInfoV3Component.Companion.create$lambda$0(this.f10286b);
                return create$lambda$08;
        }
    }
}
