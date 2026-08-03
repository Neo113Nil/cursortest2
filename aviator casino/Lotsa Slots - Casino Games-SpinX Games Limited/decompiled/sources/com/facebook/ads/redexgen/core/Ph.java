package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class Ph {
    public static final com.facebook.ads.redexgen.core.C0952Pg A00;

    static {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            A00 = new com.facebook.ads.redexgen.core.C0h() { // from class: com.facebook.ads.redexgen.X.0e
            };
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            A00 = new com.facebook.ads.redexgen.core.C0h();
        } else if (android.os.Build.VERSION.SDK_INT >= 23) {
            A00 = new com.facebook.ads.redexgen.core.C0k();
        } else {
            A00 = new com.facebook.ads.redexgen.core.C0n();
        }
    }

    public static int A00(android.view.View view) {
        return A00.A02(view);
    }

    public static int A01(android.view.View view) {
        return A00.A03(view);
    }

    public static int A02(android.view.View view) {
        return A00.A04(view);
    }

    public static int A03(android.view.View view) {
        return A00.A05(view);
    }

    public static android.view.Display A04(android.view.View view) {
        return A00.A06(view);
    }

    public static com.facebook.ads.redexgen.core.C0967Py A05(android.view.View view, com.facebook.ads.redexgen.core.C0967Py c0967Py) {
        return A00.A07(view, c0967Py);
    }

    public static com.facebook.ads.redexgen.core.C0967Py A06(android.view.View view, com.facebook.ads.redexgen.core.C0967Py c0967Py) {
        return A00.A08(view, c0967Py);
    }

    public static void A07(android.view.View view) {
        A00.A09(view);
    }

    public static void A08(android.view.View view) {
        A00.A0A(view);
    }

    public static void A09(android.view.View view, int i) {
        A00.A0B(view, i);
    }

    public static void A0A(android.view.View view, android.graphics.drawable.Drawable drawable) {
        A00.A0C(view, drawable);
    }

    public static void A0B(android.view.View view, com.facebook.ads.redexgen.core.PL pl) {
        A00.A0D(view, pl);
    }

    public static void A0C(android.view.View view, com.facebook.ads.redexgen.core.PR pr) {
        A00.A0E(view, pr);
    }

    public static void A0D(android.view.View view, java.lang.Runnable runnable) {
        A00.A0F(view, runnable);
    }

    public static void A0E(android.view.View view, java.lang.Runnable runnable, long j) {
        A00.A0G(view, runnable, j);
    }

    public static boolean A0F(android.view.View view) {
        return A00.A0H(view);
    }

    public static boolean A0G(android.view.View view) {
        return A00.A0I(view);
    }

    public static boolean A0H(android.view.View view) {
        return A00.A0J(view);
    }
}
