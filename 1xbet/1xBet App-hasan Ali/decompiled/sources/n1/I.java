package n1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.gms.internal.ads.AbstractC1674uy;
import g1.C1968b;
import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes.dex */
public final class I implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1674uy f18373a;

    /* renamed from: b, reason: collision with root package name */
    public k0 f18374b;

    public I(View view, AbstractC1674uy abstractC1674uy) {
        k0 k0Var;
        this.f18373a = abstractC1674uy;
        Field field = C.f18360a;
        k0 a5 = AbstractC2182x.a(view);
        if (a5 != null) {
            int i = Build.VERSION.SDK_INT;
            k0Var = (i >= 36 ? new X(a5) : i >= 35 ? new W(a5) : i >= 34 ? new V(a5) : i >= 31 ? new U(a5) : i >= 30 ? new T(a5) : i >= 29 ? new S(a5) : new P(a5)).b();
        } else {
            k0Var = null;
        }
        this.f18374b = k0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        h0 h0Var;
        boolean z3 = true;
        if (!view.isLaidOut()) {
            this.f18374b = k0.c(view, windowInsets);
            return J.j(view, windowInsets);
        }
        k0 c5 = k0.c(view, windowInsets);
        if (this.f18374b == null) {
            Field field = C.f18360a;
            this.f18374b = AbstractC2182x.a(view);
        }
        if (this.f18374b == null) {
            this.f18374b = c5;
            return J.j(view, windowInsets);
        }
        AbstractC1674uy k5 = J.k(view);
        if (k5 != null && Objects.equals((k0) k5.f15939l, c5)) {
            return J.j(view, windowInsets);
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        k0 k0Var = this.f18374b;
        int i = 1;
        while (true) {
            h0Var = c5.f18442a;
            if (i > 512) {
                break;
            }
            C1968b i5 = h0Var.i(i);
            C1968b i6 = k0Var.f18442a.i(i);
            int i7 = i5.f17073a;
            int i8 = i6.f17073a;
            int i9 = i5.f17076d;
            int i10 = i5.f17075c;
            int i11 = i5.f17074b;
            int i12 = i6.f17076d;
            boolean z5 = z3;
            int i13 = i6.f17075c;
            int i14 = i6.f17074b;
            boolean z6 = (i7 > i8 || i11 > i14 || i10 > i13 || i9 > i12) ? z5 : false;
            if (z6 != ((i7 < i8 || i11 < i14 || i10 < i13 || i9 < i12) ? z5 : false)) {
                if (z6) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr2[0] = iArr2[0] | i;
                }
            }
            i <<= 1;
            z3 = z5;
        }
        int i15 = iArr[0];
        int i16 = iArr2[0];
        int i17 = i15 | i16;
        if (i17 == 0) {
            this.f18374b = c5;
            return J.j(view, windowInsets);
        }
        k0 k0Var2 = this.f18374b;
        O o5 = new O(i17, (i15 & 8) != 0 ? J.f18375e : (i16 & 8) != 0 ? J.f : (i15 & 519) != 0 ? J.f18376g : (i16 & 519) != 0 ? J.f18377h : null, (i17 & 8) != 0 ? 160L : 250L);
        o5.f18387a.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(o5.f18387a.b());
        C1968b i18 = h0Var.i(i17);
        C1968b i19 = k0Var2.f18442a.i(i17);
        int min = Math.min(i18.f17073a, i19.f17073a);
        int i20 = i18.f17074b;
        int i21 = i19.f17074b;
        int min2 = Math.min(i20, i21);
        int i22 = i18.f17075c;
        int i23 = i19.f17075c;
        int min3 = Math.min(i22, i23);
        int i24 = i18.f17076d;
        int i25 = i19.f17076d;
        G.v vVar = new G.v(18, C1968b.b(min, min2, min3, Math.min(i24, i25)), C1968b.b(Math.max(i18.f17073a, i19.f17073a), Math.max(i20, i21), Math.max(i22, i23), Math.max(i24, i25)));
        J.g(view, o5, c5, false);
        duration.addUpdateListener(new G(o5, c5, k0Var2, i17, view));
        duration.addListener(new H(view, o5));
        K2.e eVar = new K2.e(view, o5, vVar, duration, 12);
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC2169j viewTreeObserverOnPreDrawListenerC2169j = new ViewTreeObserverOnPreDrawListenerC2169j(view, eVar);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2169j);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC2169j);
        this.f18374b = c5;
        return J.j(view, windowInsets);
    }
}
