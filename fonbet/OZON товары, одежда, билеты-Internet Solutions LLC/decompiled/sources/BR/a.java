package BR;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.di.MercuryCertificatesAddressComponent;
import ru.ozon.app.android.favorites.createshoppinglist.di.CreateShoppingListWidgetComponent;
import ru.ozon.app.android.fresh.checkout.widgets.inputForm.di.InputFormDIComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.promoOffer.di.PromoOfferComponent;
import ru.ozon.app.android.pdp.widgets.cashbackPoints.di.CashbackPointsWidgetComponent;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.di.EntryBannerWidgetComponent;
import ru.ozon.app.android.returns.creation.widgets.methods.core.images.ImagesElementViewMapper;
import ru.ozon.app.android.returns.creation.widgets.methods.di.ReturnCreationMethodsComponent;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.di.FullTextSearchHeaderV3Component;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.di.AviaComplexSearchFormComponent;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderHeader.di.OrderHeaderComponent;
import ru.ozon.app.android.travel.feature.general.widgets.travelPassengersCountSelector.v1.di.TravelPassengersCountSelectorComponent;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageReviews.di.HotelsPageReviewsComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3278a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f3279b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f3278a = i11;
        this.f3279b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        TravelPassengersCountSelectorComponent create$lambda$0;
        PromoOfferComponent create$lambda$02;
        FullTextSearchHeaderV3Component create$lambda$03;
        ReturnCreationMethodsComponent widgetComponent$lambda$1;
        EntryBannerWidgetComponent create$lambda$04;
        OrderHeaderComponent create$lambda$05;
        CreateShoppingListWidgetComponent create$lambda$06;
        InputFormDIComponent create$lambda$07;
        HotelsPageReviewsComponent create$lambda$08;
        AviaComplexSearchFormComponent create$lambda$09;
        CashbackPointsWidgetComponent create$lambda$010;
        MercuryCertificatesAddressComponent create$lambda$011;
        switch (this.f3278a) {
            case 0:
                create$lambda$0 = TravelPassengersCountSelectorComponent.Companion.create$lambda$0(this.f3279b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = PromoOfferComponent.Companion.create$lambda$0(this.f3279b);
                return create$lambda$02;
            case 2:
                create$lambda$03 = FullTextSearchHeaderV3Component.Companion.create$lambda$0(this.f3279b);
                return create$lambda$03;
            case 3:
                widgetComponent$lambda$1 = ImagesElementViewMapper.widgetComponent$lambda$1(this.f3279b);
                return widgetComponent$lambda$1;
            case 4:
                create$lambda$04 = EntryBannerWidgetComponent.Companion.create$lambda$0(this.f3279b);
                return create$lambda$04;
            case 5:
                create$lambda$05 = OrderHeaderComponent.Companion.create$lambda$0(this.f3279b);
                return create$lambda$05;
            case 6:
                create$lambda$06 = CreateShoppingListWidgetComponent.Companion.create$lambda$0(this.f3279b);
                return create$lambda$06;
            case 7:
                create$lambda$07 = InputFormDIComponent.Companion.create$lambda$0(this.f3279b);
                return create$lambda$07;
            case 8:
                create$lambda$08 = HotelsPageReviewsComponent.Companion.create$lambda$0(this.f3279b);
                return create$lambda$08;
            case 9:
                create$lambda$09 = AviaComplexSearchFormComponent.Companion.create$lambda$0(this.f3279b);
                return create$lambda$09;
            case 10:
                create$lambda$010 = CashbackPointsWidgetComponent.Companion.create$lambda$0(this.f3279b);
                return create$lambda$010;
            default:
                create$lambda$011 = MercuryCertificatesAddressComponent.Companion.create$lambda$0(this.f3279b);
                return create$lambda$011;
        }
    }
}
