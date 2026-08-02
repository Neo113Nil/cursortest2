package n1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import g1.C1968b;
import java.util.Collections;

/* loaded from: classes.dex */
public final class G implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f18366a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f18367b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0 f18368c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f18370e;

    public G(O o5, k0 k0Var, k0 k0Var2, int i, View view) {
        this.f18366a = o5;
        this.f18367b = k0Var;
        this.f18368c = k0Var2;
        this.f18369d = i;
        this.f18370e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        int i;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        O o5 = this.f18366a;
        o5.f18387a.e(animatedFraction);
        float c5 = o5.f18387a.c();
        PathInterpolator pathInterpolator = J.f18375e;
        int i5 = Build.VERSION.SDK_INT;
        k0 k0Var = this.f18367b;
        Y x5 = i5 >= 36 ? new X(k0Var) : i5 >= 35 ? new W(k0Var) : i5 >= 34 ? new V(k0Var) : i5 >= 31 ? new U(k0Var) : i5 >= 30 ? new T(k0Var) : i5 >= 29 ? new S(k0Var) : new P(k0Var);
        int i6 = 1;
        while (i6 <= 512) {
            int i7 = this.f18369d & i6;
            h0 h0Var = k0Var.f18442a;
            if (i7 == 0) {
                x5.d(i6, h0Var.i(i6));
                f = c5;
                i = 1;
            } else {
                C1968b i8 = h0Var.i(i6);
                C1968b i9 = this.f18368c.f18442a.i(i6);
                float f5 = 1.0f - c5;
                f = c5;
                i = 1;
                x5.d(i6, k0.a(i8, (int) (((i8.f17073a - i9.f17073a) * f5) + 0.5d), (int) (((i8.f17074b - i9.f17074b) * f5) + 0.5d), (int) (((i8.f17075c - i9.f17075c) * f5) + 0.5d), (int) (((i8.f17076d - i9.f17076d) * f5) + 0.5d)));
            }
            i6 <<= i;
            c5 = f;
        }
        J.h(this.f18370e, x5.b(), Collections.singletonList(o5));
    }
}
