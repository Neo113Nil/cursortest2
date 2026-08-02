package BL;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.di.RegistrationComponent;
import ru.ozon.app.android.marketing.widgets.bigPromoCheckout.di.BigPromoCheckoutWidgetComponent;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.di.LotteryOnboardingInfoComponent;
import ru.ozon.app.android.storefront.widgets.navigationSliderV3.core.NavigationSliderV3BaseViewMapper;
import ru.ozon.app.android.storefront.widgets.navigationSliderV3.di.NavigationSliderV3WidgetComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.di.MilesForBuyersModalInfoComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v1.di.TotalPriceWithButtonComponent;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelSearchBar.di.TravelSearchBarComponent;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v1.di.HotelsGalleryFeedComponent;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid1.di.SkuGrid1Component;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid1.presentation.SkuGrid1ViewMapper;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f3261b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f3260a = i11;
        this.f3261b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        NavigationSliderV3WidgetComponent widgetComponent$lambda$0;
        TravelSearchBarComponent create$lambda$0;
        MilesForBuyersModalInfoComponent create$lambda$02;
        SkuGrid1Component widgetComponent$lambda$02;
        HotelsGalleryFeedComponent create$lambda$03;
        RegistrationComponent create$lambda$04;
        BigPromoCheckoutWidgetComponent create$lambda$05;
        LotteryOnboardingInfoComponent instance$lambda$0;
        TotalPriceWithButtonComponent create$lambda$06;
        switch (this.f3260a) {
            case 0:
                widgetComponent$lambda$0 = NavigationSliderV3BaseViewMapper.widgetComponent$lambda$0(this.f3261b);
                return widgetComponent$lambda$0;
            case 1:
                create$lambda$0 = TravelSearchBarComponent.Companion.create$lambda$0(this.f3261b);
                return create$lambda$0;
            case 2:
                create$lambda$02 = MilesForBuyersModalInfoComponent.Companion.create$lambda$0(this.f3261b);
                return create$lambda$02;
            case 3:
                widgetComponent$lambda$02 = SkuGrid1ViewMapper.widgetComponent$lambda$0(this.f3261b);
                return widgetComponent$lambda$02;
            case 4:
                create$lambda$03 = HotelsGalleryFeedComponent.Companion.create$lambda$0(this.f3261b);
                return create$lambda$03;
            case 5:
                create$lambda$04 = RegistrationComponent.Companion.create$lambda$0(this.f3261b);
                return create$lambda$04;
            case 6:
                create$lambda$05 = BigPromoCheckoutWidgetComponent.Companion.create$lambda$0(this.f3261b);
                return create$lambda$05;
            case 7:
                instance$lambda$0 = LotteryOnboardingInfoComponent.Companion.getInstance$lambda$0(this.f3261b);
                return instance$lambda$0;
            default:
                create$lambda$06 = TotalPriceWithButtonComponent.Companion.create$lambda$0(this.f3261b);
                return create$lambda$06;
        }
    }
}
