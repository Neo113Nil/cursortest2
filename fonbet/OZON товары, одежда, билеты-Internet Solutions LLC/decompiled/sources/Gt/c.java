package Gt;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.cart.widgets.cartControls.presentation.CartControlsViewController;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.adapter.FlightSeatsSchemePassengersBlockAdapterDelegateKt;
import ru.ozon.fintech.ui.animatedcircleprogress.AnimatedCircleProgressView;

/* loaded from: classes12.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10309a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10310b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f10309a = i11;
        this.f10310b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        switch (this.f10309a) {
            case 0:
                CartControlsViewController.animateCornersChangeSticky$lambda$2$lambda$1((CartControlsViewController) this.f10310b, animation);
                return;
            case 1:
                FlightSeatsSchemePassengersBlockAdapterDelegateKt.alphaAnimator$lambda$10$lambda$9((Function1) this.f10310b, animation);
                return;
            case 2:
                View container = (View) this.f10310b;
                Intrinsics.checkNotNullParameter(container, "$container");
                Intrinsics.checkNotNullParameter(animation, "animation");
                ViewGroup.LayoutParams layoutParams = container.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                Object animatedValue = animation.getAnimatedValue();
                Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.height = ((Integer) animatedValue).intValue();
                container.setLayoutParams(layoutParams);
                return;
            default:
                AnimatedCircleProgressView.startAnim$lambda$3$lambda$1((AnimatedCircleProgressView) this.f10310b, animation);
                return;
        }
    }
}
