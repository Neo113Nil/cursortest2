package com.instagram.common.viewpoint.core;

import android.view.WindowInsets;

/* renamed from: com.facebook.ads.redexgen.X.Py, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2261Py {
    public final Object A00;

    public C2261Py(Object obj) {
        this.A00 = obj;
    }

    public static C2261Py A00(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C2261Py(obj);
    }

    public static Object A01(C2261Py c2261Py) {
        if (c2261Py == null) {
            return null;
        }
        return c2261Py.A00;
    }

    public final int A02() {
        return ((WindowInsets) this.A00).getSystemWindowInsetBottom();
    }

    public final int A03() {
        return ((WindowInsets) this.A00).getSystemWindowInsetLeft();
    }

    public final int A04() {
        return ((WindowInsets) this.A00).getSystemWindowInsetRight();
    }

    public final int A05() {
        return ((WindowInsets) this.A00).getSystemWindowInsetTop();
    }

    public final C2261Py A06(int i, int i2, int i3, int i4) {
        return new C2261Py(((WindowInsets) this.A00).replaceSystemWindowInsets(i, i2, i3, i4));
    }

    public final boolean A07() {
        return ((WindowInsets) this.A00).isConsumed();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2261Py c2261Py = (C2261Py) obj;
        return this.A00 == null ? c2261Py.A00 == null : this.A00.equals(c2261Py.A00);
    }

    public final int hashCode() {
        if (this.A00 == null) {
            return 0;
        }
        return this.A00.hashCode();
    }
}
