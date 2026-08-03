package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Py, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0967Py {
    public final java.lang.Object A00;

    public C0967Py(java.lang.Object obj) {
        this.A00 = obj;
    }

    public static com.facebook.ads.redexgen.core.C0967Py A00(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.C0967Py(obj);
    }

    public static java.lang.Object A01(com.facebook.ads.redexgen.core.C0967Py c0967Py) {
        if (c0967Py == null) {
            return null;
        }
        return c0967Py.A00;
    }

    public final int A02() {
        return ((android.view.WindowInsets) this.A00).getSystemWindowInsetBottom();
    }

    public final int A03() {
        return ((android.view.WindowInsets) this.A00).getSystemWindowInsetLeft();
    }

    public final int A04() {
        return ((android.view.WindowInsets) this.A00).getSystemWindowInsetRight();
    }

    public final int A05() {
        return ((android.view.WindowInsets) this.A00).getSystemWindowInsetTop();
    }

    public final com.facebook.ads.redexgen.core.C0967Py A06(int i, int i2, int i3, int i4) {
        return new com.facebook.ads.redexgen.core.C0967Py(((android.view.WindowInsets) this.A00).replaceSystemWindowInsets(i, i2, i3, i4));
    }

    public final boolean A07() {
        return ((android.view.WindowInsets) this.A00).isConsumed();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.redexgen.core.C0967Py c0967Py = (com.facebook.ads.redexgen.core.C0967Py) obj;
        return this.A00 == null ? c0967Py.A00 == null : this.A00.equals(c0967Py.A00);
    }

    public final int hashCode() {
        if (this.A00 == null) {
            return 0;
        }
        return this.A00.hashCode();
    }
}
