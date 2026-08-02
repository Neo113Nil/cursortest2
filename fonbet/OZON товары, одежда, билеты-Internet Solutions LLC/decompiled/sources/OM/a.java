package OM;

import android.animation.ValueAnimator;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.pdp.widgets.navBar.presentation.NavBarBackgroundHandler;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.adapter.FlightSeatsSchemePassengersBlockAdapterDelegateKt;

/* loaded from: classes10.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20137a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20138b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f20137a = i11;
        this.f20138b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f20137a) {
            case 0:
                FlightSeatsSchemePassengersBlockAdapterDelegateKt.intAnimator$lambda$8$lambda$7((Function1) this.f20138b, valueAnimator);
                break;
            default:
                NavBarBackgroundHandler._get_cornerAnimator_$lambda$1$lambda$0((NavBarBackgroundHandler) this.f20138b, valueAnimator);
                break;
        }
    }
}
