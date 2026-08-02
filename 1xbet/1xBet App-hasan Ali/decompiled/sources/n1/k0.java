package n1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import g1.C1968b;
import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f18441b;

    /* renamed from: a, reason: collision with root package name */
    public final h0 f18442a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            f18441b = f0.f18432x;
        } else if (i >= 30) {
            f18441b = d0.f18427w;
        } else {
            f18441b = h0.f18433b;
        }
    }

    public k0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.f18442a = new g0(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.f18442a = new f0(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.f18442a = new e0(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.f18442a = new d0(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f18442a = new c0(this, windowInsets);
        } else if (i >= 28) {
            this.f18442a = new b0(this, windowInsets);
        } else {
            this.f18442a = new a0(this, windowInsets);
        }
    }

    public static C1968b a(C1968b c1968b, int i, int i5, int i6, int i7) {
        int max = Math.max(0, c1968b.f17073a - i);
        int max2 = Math.max(0, c1968b.f17074b - i5);
        int max3 = Math.max(0, c1968b.f17075c - i6);
        int max4 = Math.max(0, c1968b.f17076d - i7);
        return (max == i && max2 == i5 && max3 == i6 && max4 == i7) ? c1968b : C1968b.b(max, max2, max3, max4);
    }

    public static k0 c(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        k0 k0Var = new k0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = C.f18360a;
            k0 a5 = AbstractC2182x.a(view);
            h0 h0Var = k0Var.f18442a;
            h0Var.y(a5);
            View rootView = view.getRootView();
            h0Var.d(rootView);
            h0Var.p(rootView);
            h0Var.q();
            h0Var.A(view.getWindowSystemUiVisibility());
        }
        return k0Var;
    }

    public final WindowInsets b() {
        h0 h0Var = this.f18442a;
        if (h0Var instanceof Z) {
            return ((Z) h0Var).f18402c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        return Objects.equals(this.f18442a, ((k0) obj).f18442a);
    }

    public final int hashCode() {
        h0 h0Var = this.f18442a;
        if (h0Var == null) {
            return 0;
        }
        return h0Var.hashCode();
    }

    public k0(k0 k0Var) {
        if (k0Var != null) {
            h0 h0Var = k0Var.f18442a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 35 && (h0Var instanceof g0)) {
                this.f18442a = new g0(this, (g0) h0Var);
            } else if (i >= 34 && (h0Var instanceof f0)) {
                this.f18442a = new f0(this, (f0) h0Var);
            } else if (i >= 31 && (h0Var instanceof e0)) {
                this.f18442a = new e0(this, (e0) h0Var);
            } else if (i >= 30 && (h0Var instanceof d0)) {
                this.f18442a = new d0(this, (d0) h0Var);
            } else if (i >= 29 && (h0Var instanceof c0)) {
                this.f18442a = new c0(this, (c0) h0Var);
            } else if (i >= 28 && (h0Var instanceof b0)) {
                this.f18442a = new b0(this, (b0) h0Var);
            } else if (h0Var instanceof a0) {
                this.f18442a = new a0(this, (a0) h0Var);
            } else if (h0Var instanceof Z) {
                this.f18442a = new Z(this, (Z) h0Var);
            } else {
                this.f18442a = new h0(this);
            }
            h0Var.e(this);
            return;
        }
        this.f18442a = new h0(this);
    }
}
