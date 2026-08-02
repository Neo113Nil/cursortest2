package H30;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.core.view.InterfaceC5332n0;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.K;

/* loaded from: classes3.dex */
public final /* synthetic */ class B implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10551a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10552b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f10553c;

    public /* synthetic */ B(View view, int i11, Object obj) {
        this.f10551a = i11;
        this.f10552b = obj;
        this.f10553c = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10551a) {
            case 0:
                int intValue = ((Integer) Bi.a.b(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Int")).intValue();
                K k11 = (K) this.f10552b;
                ((ViewPager2) this.f10553c).d(-(intValue - k11.f71785a));
                k11.f71785a = intValue;
                break;
            default:
                ((InterfaceC5332n0) this.f10552b).a();
                break;
        }
    }
}
