package P;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: b, reason: collision with root package name */
    public static final q0 f5100b;

    /* renamed from: a, reason: collision with root package name */
    public final p0 f5101a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f5100b = o0.f5097m;
        } else {
            f5100b = p0.f5098b;
        }
    }

    public q0(WindowInsets windowInsets) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            this.f5101a = new o0(this, windowInsets);
            return;
        }
        if (i7 >= 29) {
            this.f5101a = new m0(this, windowInsets);
        } else if (i7 >= 28) {
            this.f5101a = new l0(this, windowInsets);
        } else {
            this.f5101a = new k0(this, windowInsets);
        }
    }

    public static I.c e(I.c cVar, int i7, int i8, int i9, int i10) {
        int max = Math.max(0, cVar.f3462a - i7);
        int max2 = Math.max(0, cVar.f3463b - i8);
        int max3 = Math.max(0, cVar.f3464c - i9);
        int max4 = Math.max(0, cVar.f3465d - i10);
        return (max == i7 && max2 == i8 && max3 == i9 && max4 == i10) ? cVar : I.c.a(max, max2, max3, max4);
    }

    public static q0 g(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        q0 q0Var = new q0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = U.f5037a;
            q0 a2 = J.a(view);
            p0 p0Var = q0Var.f5101a;
            p0Var.m(a2);
            p0Var.d(view.getRootView());
        }
        return q0Var;
    }

    public final int a() {
        return this.f5101a.h().f3465d;
    }

    public final int b() {
        return this.f5101a.h().f3462a;
    }

    public final int c() {
        return this.f5101a.h().f3464c;
    }

    public final int d() {
        return this.f5101a.h().f3463b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        return Objects.equals(this.f5101a, ((q0) obj).f5101a);
    }

    public final WindowInsets f() {
        p0 p0Var = this.f5101a;
        if (p0Var instanceof j0) {
            return ((j0) p0Var).f5082c;
        }
        return null;
    }

    public final int hashCode() {
        p0 p0Var = this.f5101a;
        if (p0Var == null) {
            return 0;
        }
        return p0Var.hashCode();
    }

    public q0() {
        this.f5101a = new p0(this);
    }
}
