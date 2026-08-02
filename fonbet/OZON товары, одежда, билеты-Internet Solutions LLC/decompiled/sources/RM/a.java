package RM;

import android.animation.ValueAnimator;
import android.view.View;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.view.ComplexRouteItemView;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.airplaneSeat.AirplaneSeatTypeViewV2;
import ru.ozon.fintech.ui.animatedcircleprogress.AnimatedCircleProgressView;

/* loaded from: classes10.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f24872b;

    public /* synthetic */ a(View view, int i11) {
        this.f24871a = i11;
        this.f24872b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24871a) {
            case 0:
                AirplaneSeatTypeViewV2.highlight$lambda$7$lambda$6((AirplaneSeatTypeViewV2) this.f24872b, valueAnimator);
                break;
            case 1:
                AnimatedCircleProgressView.startAnim$lambda$5$lambda$4((AnimatedCircleProgressView) this.f24872b, valueAnimator);
                break;
            default:
                ComplexRouteItemView.animateSwipeOffset$lambda$23$lambda$22((ComplexRouteItemView) this.f24872b, valueAnimator);
                break;
        }
    }
}
