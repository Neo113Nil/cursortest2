package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1340bu {
    public static float A00(com.facebook.ads.redexgen.core.NR nr) {
        int height = nr.A0H().A01();
        int width = nr.A0H().A00();
        if (width > 0) {
            return height / width;
        }
        return -1.0f;
    }

    public static int A01(double d) {
        int availableWidth = (int) ((com.facebook.ads.redexgen.core.XW.A00().widthPixels - (com.facebook.ads.redexgen.core.AbstractC1349c3.A08 * 2)) / d);
        return availableWidth;
    }

    public static int A02(int bottomMargin) {
        int ctaMargin = com.facebook.ads.redexgen.core.YB.A01(16);
        int ctaTextHeight = com.facebook.ads.redexgen.core.AbstractC1321bb.A0D;
        int ctaSpacing = ctaTextHeight * 2;
        int ctaTextHeight2 = com.facebook.ads.redexgen.core.AbstractC1349c3.A08;
        int ctaMargin2 = ctaMargin + ctaSpacing + (ctaTextHeight2 * 2);
        int ctaTextHeight3 = com.facebook.ads.redexgen.core.XW.A00().heightPixels;
        return (ctaTextHeight3 - bottomMargin) - ctaMargin2;
    }

    public static com.facebook.ads.redexgen.core.ViewOnClickListenerC1339bt A03(com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr, java.lang.String str) {
        return new com.facebook.ads.redexgen.core.ViewOnClickListenerC1339bt(viewOnClickListenerC0834Kr, str);
    }

    public static boolean A04(double d) {
        return d < 0.9d;
    }

    public static boolean A05(double d, int i) {
        return A02(i) < A01(d);
    }

    public static boolean A06(int i, int i2, double d) {
        return i == 2 || A05(d, i2);
    }
}
