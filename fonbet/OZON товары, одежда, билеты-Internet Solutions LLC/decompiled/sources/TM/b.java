package TM;

import android.animation.ValueAnimator;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.adapter.FlightSeatsSchemeV2PassengerAdapterDelegateKt;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.sticky.HotelsGalleryFiltersAnimator;

/* loaded from: classes10.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26939a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26940b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f26939a = i11;
        this.f26940b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26939a) {
            case 0:
                FlightSeatsSchemeV2PassengerAdapterDelegateKt.alphaAnimator$lambda$10$lambda$9((Function1) this.f26940b, valueAnimator);
                break;
            default:
                HotelsGalleryFiltersAnimator.animateAppearance$lambda$5$lambda$2((HotelsGalleryFiltersAnimator) this.f26940b, valueAnimator);
                break;
        }
    }
}
