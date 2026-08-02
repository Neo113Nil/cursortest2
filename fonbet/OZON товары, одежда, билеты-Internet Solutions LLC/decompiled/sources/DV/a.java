package DV;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.account.orders.recipientWidget.di.RecipientComponent;
import ru.ozon.app.android.account.orders.recipientWidget.presentation.RecipientViewMapper;
import ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.di.FakeSearchComponent;
import ru.ozon.app.android.geo.addressChangeProcessor.di.AddressChangeProcessorWidgetComponent;
import ru.ozon.app.android.orderdetails.orderdetailsitem.core.OrderDetailsItemViewMapper;
import ru.ozon.app.android.orderdetails.orderdetailsitem.di.OrderDetailsItemComponent;
import ru.ozon.app.android.pdp.widgets.selectSeller.di.SelectSellerComponent;
import ru.ozon.app.android.returns.ui.molecules.bottomEars.di.StickyBottomEarsComponent;
import ru.ozon.app.android.returns.ui.molecules.bottomEars.presentation.viewMapper.StickyBottomEarsWidgetMapper;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.core.single.NavLikezoneCaruselSingleViewMapper;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.di.NavLikezoneCaruselComponent;
import ru.ozon.app.android.travel.feature.avia.widgets.stepper.di.StepperComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.di.ButtonWithInformationComponent;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderNavContent.di.TravelOrderNavContentComponent;
import ru.ozon.app.android.travel.feature.tours.widgets.toursBookInformer.di.ToursBookInformerComponent;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSorting.di.ToursSortingComponent;
import ru.ozon.app.android.ugc.core.widgets.singlereview.di.SingleReviewComponent;
import ru.ozon.app.android.ugc.core.widgets.singlereview.header.variant.SingleReviewVariantComponent;
import ru.ozon.app.android.ugc.widgets.additionalReview.di.AdditionalReviewComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6276a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f6277b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f6276a = i11;
        this.f6277b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        SingleReviewVariantComponent create$lambda$0;
        ToursBookInformerComponent create$lambda$02;
        SelectSellerComponent create$lambda$03;
        AdditionalReviewComponent instance$lambda$0;
        ToursSortingComponent create$lambda$04;
        NavLikezoneCaruselComponent widgetComponent$lambda$0;
        RecipientComponent widgetComponent$lambda$02;
        StepperComponent create$lambda$05;
        FakeSearchComponent create$lambda$06;
        TravelOrderNavContentComponent create$lambda$07;
        AddressChangeProcessorWidgetComponent create$lambda$08;
        OrderDetailsItemComponent widgetComponent$lambda$03;
        SingleReviewComponent instance$lambda$02;
        ButtonWithInformationComponent create$lambda$09;
        StickyBottomEarsComponent widgetComponent$lambda$1;
        switch (this.f6276a) {
            case 0:
                create$lambda$0 = SingleReviewVariantComponent.Companion.create$lambda$0(this.f6277b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = ToursBookInformerComponent.Companion.create$lambda$0(this.f6277b);
                return create$lambda$02;
            case 2:
                create$lambda$03 = SelectSellerComponent.Companion.create$lambda$0(this.f6277b);
                return create$lambda$03;
            case 3:
                instance$lambda$0 = AdditionalReviewComponent.Companion.getInstance$lambda$0(this.f6277b);
                return instance$lambda$0;
            case 4:
                create$lambda$04 = ToursSortingComponent.Companion.create$lambda$0(this.f6277b);
                return create$lambda$04;
            case 5:
                widgetComponent$lambda$0 = NavLikezoneCaruselSingleViewMapper.widgetComponent$lambda$0(this.f6277b);
                return widgetComponent$lambda$0;
            case 6:
                widgetComponent$lambda$02 = RecipientViewMapper.widgetComponent$lambda$0(this.f6277b);
                return widgetComponent$lambda$02;
            case 7:
                create$lambda$05 = StepperComponent.Companion.create$lambda$0(this.f6277b);
                return create$lambda$05;
            case 8:
                create$lambda$06 = FakeSearchComponent.Companion.create$lambda$0(this.f6277b);
                return create$lambda$06;
            case 9:
                create$lambda$07 = TravelOrderNavContentComponent.Companion.create$lambda$0(this.f6277b);
                return create$lambda$07;
            case 10:
                create$lambda$08 = AddressChangeProcessorWidgetComponent.Companion.create$lambda$0(this.f6277b);
                return create$lambda$08;
            case 11:
                widgetComponent$lambda$03 = OrderDetailsItemViewMapper.widgetComponent$lambda$0(this.f6277b);
                return widgetComponent$lambda$03;
            case 12:
                instance$lambda$02 = SingleReviewComponent.Companion.getInstance$lambda$0(this.f6277b);
                return instance$lambda$02;
            case 13:
                create$lambda$09 = ButtonWithInformationComponent.Companion.create$lambda$0(this.f6277b);
                return create$lambda$09;
            default:
                widgetComponent$lambda$1 = StickyBottomEarsWidgetMapper.widgetComponent$lambda$1(this.f6277b);
                return widgetComponent$lambda$1;
        }
    }
}
