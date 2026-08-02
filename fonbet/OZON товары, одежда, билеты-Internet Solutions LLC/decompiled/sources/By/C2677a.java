package By;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.account.orders.barcode.di.BarcodeWidgetComponent;
import ru.ozon.app.android.account.orders.barcode.presentation.BarcodeViewMapper;
import ru.ozon.app.android.fresh.cart.widgets.cartTabs.di.CartTabsDIComponent;
import ru.ozon.app.android.fresh.checkout.widgets.searchBankList.di.SearchBankListComponent;
import ru.ozon.app.android.geo.map.di.AddressEditMapComponent;
import ru.ozon.app.android.search.widgets.searchOnboarding.di.SearchOnboardingComponent;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelCompanyDocuments.di.TravelCompanyDocumentsComponent;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v1.di.HotelsPageMapPreviewComponent;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.di.ReviewGalleryPreviewV2Component;
import ru.ozon.app.android.ugc.widgets.productsforreview.di.ProductsForReviewComponent;

/* renamed from: By.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C2677a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4070a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f4071b;

    public /* synthetic */ C2677a(C7475g c7475g, int i11) {
        this.f4070a = i11;
        this.f4071b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        AddressEditMapComponent create$lambda$0;
        SearchOnboardingComponent create$lambda$02;
        CartTabsDIComponent create$lambda$03;
        HotelsPageMapPreviewComponent create$lambda$04;
        ReviewGalleryPreviewV2Component create$lambda$05;
        ProductsForReviewComponent create$lambda$06;
        BarcodeWidgetComponent widgetComponent$lambda$0;
        TravelCompanyDocumentsComponent create$lambda$07;
        SearchBankListComponent create$lambda$08;
        switch (this.f4070a) {
            case 0:
                create$lambda$0 = AddressEditMapComponent.Companion.create$lambda$0(this.f4071b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = SearchOnboardingComponent.Companion.create$lambda$0(this.f4071b);
                return create$lambda$02;
            case 2:
                create$lambda$03 = CartTabsDIComponent.Companion.create$lambda$0(this.f4071b);
                return create$lambda$03;
            case 3:
                create$lambda$04 = HotelsPageMapPreviewComponent.Companion.create$lambda$0(this.f4071b);
                return create$lambda$04;
            case 4:
                create$lambda$05 = ReviewGalleryPreviewV2Component.Companion.create$lambda$0(this.f4071b);
                return create$lambda$05;
            case 5:
                create$lambda$06 = ProductsForReviewComponent.Companion.create$lambda$0(this.f4071b);
                return create$lambda$06;
            case 6:
                widgetComponent$lambda$0 = BarcodeViewMapper.widgetComponent$lambda$0(this.f4071b);
                return widgetComponent$lambda$0;
            case 7:
                create$lambda$07 = TravelCompanyDocumentsComponent.Companion.create$lambda$0(this.f4071b);
                return create$lambda$07;
            default:
                create$lambda$08 = SearchBankListComponent.Companion.create$lambda$0(this.f4071b);
                return create$lambda$08;
        }
    }
}
