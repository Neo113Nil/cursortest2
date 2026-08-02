package BV;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.cart.installment.di.InstallmentComponent;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.di.CatalogueTabsComponent;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.di.InstallmentPurchaseV5Component;
import ru.ozon.app.android.storefront.widgets.naviGrid.di.NaviGridComponent;
import ru.ozon.app.android.storefront.widgets.navigationSlider.di.NavigationSliderWidgetComponent;
import ru.ozon.app.android.travel.feature.avia.widgets.helpInsurance.di.HelpInsuranceComponent;
import ru.ozon.app.android.travel.feature.avia.widgets.servicePackageSelection.di.ServicePackageSelectionComponent;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.di.QuickFiltersComponent;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.overlay.QuickFiltersOverlayViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.di.TopTravelModalComponent;
import ru.ozon.app.android.ugc.core.widgets.singlereview.header.socialHeader.SingleReviewSocialHeaderComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3299a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f3300b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f3299a = i11;
        this.f3300b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        SingleReviewSocialHeaderComponent create$lambda$0;
        TopTravelModalComponent create$lambda$02;
        InstallmentComponent create$lambda$03;
        QuickFiltersComponent widgetComponent$lambda$2;
        CatalogueTabsComponent create$lambda$04;
        HelpInsuranceComponent create$lambda$05;
        ServicePackageSelectionComponent create$lambda$06;
        InstallmentPurchaseV5Component create$lambda$07;
        NaviGridComponent create$lambda$08;
        NavigationSliderWidgetComponent create$lambda$09;
        switch (this.f3299a) {
            case 0:
                create$lambda$0 = SingleReviewSocialHeaderComponent.Companion.create$lambda$0(this.f3300b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = TopTravelModalComponent.Companion.create$lambda$0(this.f3300b);
                return create$lambda$02;
            case 2:
                create$lambda$03 = InstallmentComponent.Companion.create$lambda$0(this.f3300b);
                return create$lambda$03;
            case 3:
                widgetComponent$lambda$2 = QuickFiltersOverlayViewMapper.widgetComponent$lambda$2(this.f3300b);
                return widgetComponent$lambda$2;
            case 4:
                create$lambda$04 = CatalogueTabsComponent.Companion.create$lambda$0(this.f3300b);
                return create$lambda$04;
            case 5:
                create$lambda$05 = HelpInsuranceComponent.Companion.create$lambda$0(this.f3300b);
                return create$lambda$05;
            case 6:
                create$lambda$06 = ServicePackageSelectionComponent.Companion.create$lambda$0(this.f3300b);
                return create$lambda$06;
            case 7:
                create$lambda$07 = InstallmentPurchaseV5Component.Companion.create$lambda$0(this.f3300b);
                return create$lambda$07;
            case 8:
                create$lambda$08 = NaviGridComponent.Companion.create$lambda$0(this.f3300b);
                return create$lambda$08;
            default:
                create$lambda$09 = NavigationSliderWidgetComponent.Companion.create$lambda$0(this.f3300b);
                return create$lambda$09;
        }
    }
}
