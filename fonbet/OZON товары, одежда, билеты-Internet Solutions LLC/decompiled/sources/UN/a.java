package UN;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view.d;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.view.QuickFiltersProgressBarView;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27467a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27468b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27469c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f27467a = i11;
        this.f27468b = obj;
        this.f27469c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27467a) {
            case 0:
                QuickFiltersProgressBarView.startAnimation$lambda$6$lambda$5((ValueAnimator) this.f27468b, (QuickFiltersProgressBarView) this.f27469c, valueAnimator);
                break;
            default:
                d.a((ViewGroup.LayoutParams) this.f27468b, (d) this.f27469c, valueAnimator);
                break;
        }
    }
}
