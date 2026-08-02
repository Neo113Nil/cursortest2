package CW;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.marketing.widgets.bigPromoNavbar.di.BigPromoNavbarComponent;
import ru.ozon.app.android.search.catalog.components.categoryMenu.di.CategoryMenuComponent;
import ru.ozon.app.android.storefront.widgets.cms.webview.WebFrameWidgetComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.di.OverlayButtonsV2Component;
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.presentation.OverlayButtonsV2ViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursLoader.di.ToursLoaderComponent;
import ru.ozon.app.android.ugc.core.widgets.illustrationButtons.di.IllustrationButtonsWidgetComponent;
import ru.ozon.app.android.ugc.widgets.reviewsFilter.di.ReviewsFilterComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f4564b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f4563a = i11;
        this.f4564b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        ReviewsFilterComponent create$lambda$0;
        WebFrameWidgetComponent create$lambda$02;
        CategoryMenuComponent create$lambda$03;
        ToursLoaderComponent create$lambda$04;
        IllustrationButtonsWidgetComponent create$lambda$05;
        OverlayButtonsV2Component widgetComponent$lambda$3;
        BigPromoNavbarComponent create$lambda$06;
        switch (this.f4563a) {
            case 0:
                create$lambda$0 = ReviewsFilterComponent.Companion.create$lambda$0(this.f4564b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = WebFrameWidgetComponent.Companion.create$lambda$0(this.f4564b);
                return create$lambda$02;
            case 2:
                create$lambda$03 = CategoryMenuComponent.Companion.create$lambda$0(this.f4564b);
                return create$lambda$03;
            case 3:
                create$lambda$04 = ToursLoaderComponent.Companion.create$lambda$0(this.f4564b);
                return create$lambda$04;
            case 4:
                create$lambda$05 = IllustrationButtonsWidgetComponent.Companion.create$lambda$0(this.f4564b);
                return create$lambda$05;
            case 5:
                widgetComponent$lambda$3 = OverlayButtonsV2ViewMapper.widgetComponent$lambda$3(this.f4564b);
                return widgetComponent$lambda$3;
            default:
                create$lambda$06 = BigPromoNavbarComponent.Companion.create$lambda$0(this.f4564b);
                return create$lambda$06;
        }
    }
}
