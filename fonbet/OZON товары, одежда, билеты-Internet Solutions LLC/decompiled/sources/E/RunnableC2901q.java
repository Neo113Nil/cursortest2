package E;

import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2View;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet.RelatedProductsBottomSheetView;
import ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchBarViewDelegate;
import ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetViewHolder;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.view.ServicePackageCarouselView;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.view.ServicePackageCarouselView$setupScrollListener$1;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.presentation.TravelPaymentV4WidgetViewHolder;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view.utils.ProductItemRecyclerAnimator;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;

/* renamed from: E.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class RunnableC2901q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6915b;

    public /* synthetic */ RunnableC2901q(Object obj, int i11) {
        this.f6914a = i11;
        this.f6915b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6914a) {
            case 0:
                ((androidx.camera.core.u) this.f6915b).j();
                break;
            case 1:
                GeotrackingMapV2View.focusMapOnPins$lambda$8((GeotrackingMapV2View) this.f6915b);
                break;
            case 2:
                TravelPaymentV4WidgetViewHolder.bind$lambda$2((TravelPaymentV4WidgetViewHolder) this.f6915b);
                break;
            case 3:
                SearchBarViewDelegate.setupSearch$lambda$14((SearchBarViewDelegate) this.f6915b);
                break;
            case 4:
                ProductItemRecyclerAnimator.expandItemToFullWidth$lambda$6((ProductItemRecyclerAnimator) this.f6915b);
                break;
            case 5:
                ServicePackageCarouselView$setupScrollListener$1.onScrollStateChanged$lambda$0((ServicePackageCarouselView) this.f6915b);
                break;
            case 6:
                RelatedProductsBottomSheetView.headerRunnable$lambda$2((RelatedProductsBottomSheetView) this.f6915b);
                break;
            default:
                OTPWidgetViewHolder.keyboardUp$lambda$7((OzonTextInput) this.f6915b);
                break;
        }
    }
}
