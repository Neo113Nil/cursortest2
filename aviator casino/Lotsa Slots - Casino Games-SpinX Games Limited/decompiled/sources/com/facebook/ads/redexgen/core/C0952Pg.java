package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Pg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0952Pg {
    public static java.lang.reflect.Field A00;
    public static boolean A01;
    public static byte[] A02;
    public static java.lang.String[] A03 = {"02HXzqXk73QVshK", "Vd3PIQVGbymKr1peOQp46bHqBe5g9xLl", "HcoaSp9EGPDRlMz", "LE49K9mUXs4bvL0Dhr0uWsVmH5LUwBm4", "LDPLoHz6UrHGmx6GMbvpIivkJ6REIOLV", "AJsKzOma0c3h", "nSSDOEXzoGvtoIqz4QDa0TtkmnPlbH1G", "jHxdDI4CDuwq"};

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 29);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-28, -72, -38, -38, -36, -22, -22, -32, -39, -32, -29, -32, -21, -16, -69, -36, -29, -36, -34, -40, -21, -36};
    }

    public abstract int A02(android.view.View view);

    public abstract int A03(android.view.View view);

    public abstract int A04(android.view.View view);

    public abstract int A05(android.view.View view);

    public abstract android.view.Display A06(android.view.View view);

    public abstract com.facebook.ads.redexgen.core.C0967Py A07(android.view.View view, com.facebook.ads.redexgen.core.C0967Py c0967Py);

    public abstract com.facebook.ads.redexgen.core.C0967Py A08(android.view.View view, com.facebook.ads.redexgen.core.C0967Py c0967Py);

    public abstract void A09(android.view.View view);

    public abstract void A0A(android.view.View view);

    public abstract void A0B(android.view.View view, int i);

    public abstract void A0C(android.view.View view, android.graphics.drawable.Drawable drawable);

    public abstract void A0E(android.view.View view, com.facebook.ads.redexgen.core.PR pr);

    public abstract void A0F(android.view.View view, java.lang.Runnable runnable);

    public abstract void A0G(android.view.View view, java.lang.Runnable runnable, long j);

    public abstract boolean A0I(android.view.View view);

    public abstract boolean A0J(android.view.View view);

    static {
        A01();
        A01 = false;
    }

    public final void A0D(android.view.View view, com.facebook.ads.redexgen.core.PL pl) {
        view.setAccessibilityDelegate(pl == null ? null : pl.A00());
    }

    public final boolean A0H(android.view.View view) {
        if (A01) {
            return false;
        }
        java.lang.reflect.Field field = A00;
        if (A03[6].charAt(21) == 'T') {
            A03[1] = "Q1ruOHxOk6WILPvKf2GjHGHRzmp539Hk";
            if (field == null) {
                try {
                    A00 = android.view.View.class.getDeclaredField(A00(0, 22, 90));
                    A00.setAccessible(true);
                } catch (java.lang.Throwable unused) {
                    A01 = true;
                    if (A03[6].charAt(21) == 'T') {
                        java.lang.String[] strArr = A03;
                        strArr[0] = "nDS37f2fXP1nkU7";
                        strArr[2] = "CEc31ZmnNMQB0dp";
                        return false;
                    }
                }
            }
            try {
                return A00.get(view) != null;
            } catch (java.lang.Throwable unused2) {
                A01 = true;
                return false;
            }
        }
        throw new java.lang.RuntimeException();
    }
}
