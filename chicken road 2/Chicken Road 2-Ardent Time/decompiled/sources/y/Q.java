package y;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public final y.O f8448a;

    static {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            int i2 = y.N.f8445q;
        } else {
            int i3 = y.O.f8446b;
        }
    }

    public Q(android.view.WindowInsets windowInsets) {
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f8448a = new y.N(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f8448a = new y.M(this, windowInsets);
        } else if (i2 >= 28) {
            this.f8448a = new y.L(this, windowInsets);
        } else {
            this.f8448a = new y.K(this, windowInsets);
        }
    }

    public static y.Q a(android.view.WindowInsets windowInsets, android.view.View view) {
        windowInsets.getClass();
        y.Q q2 = new y.Q(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            java.lang.reflect.Field field = y.x.f8478a;
            y.Q a2 = y.AbstractC1029q.a(view);
            y.O o2 = q2.f8448a;
            o2.o(a2);
            o2.d(view.getRootView());
        }
        return q2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y.Q)) {
            return false;
        }
        return java.util.Objects.equals(this.f8448a, ((y.Q) obj).f8448a);
    }

    public final int hashCode() {
        y.O o2 = this.f8448a;
        if (o2 == null) {
            return 0;
        }
        return o2.hashCode();
    }

    public Q() {
        this.f8448a = new y.O(this);
    }
}
