package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Rp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1009Rp {
    public static java.lang.String[] A00 = {"9O", "28H1kjICyCSP", "QKFmg3qmSW84YfLR5DXewrEtWZ47Hzy", "P", "Em", "YyES7HR0UsWs", "rGxFrAuyTsOha0QpVFZkpdTTHXBTZM0k", "CeAnScf1I32vhT13KQ6XZJy"};

    public static com.facebook.ads.redexgen.core.InterfaceC0862Lt A00(android.content.Context context, com.facebook.ads.redexgen.core.TA ta) {
        return A01(context, ta, null);
    }

    public static com.facebook.ads.redexgen.core.InterfaceC0862Lt A01(android.content.Context context, com.facebook.ads.redexgen.core.TA ta, java.lang.String str) {
        com.facebook.ads.redexgen.core.C1632ge sdkContext = A09(context);
        com.facebook.ads.redexgen.core.InterfaceC0866Lx A8C = ta.A8C(sdkContext);
        if (A8C != null) {
            return str != null ? A8C.ACN(str) : A8C.ACM();
        }
        return new com.facebook.ads.redexgen.core.C1856kX();
    }

    public static com.facebook.ads.redexgen.core.C1636gi A02(android.app.Activity activity) {
        return new com.facebook.ads.redexgen.core.C1636gi(activity, (com.facebook.ads.redexgen.core.TA) A0A(), A00(activity, A0A()));
    }

    public static com.facebook.ads.redexgen.core.C1636gi A03(android.content.Context context) {
        return new com.facebook.ads.redexgen.core.C1636gi(context, A0A(), new com.facebook.ads.redexgen.core.C1856kX());
    }

    public static com.facebook.ads.redexgen.core.C1636gi A04(android.content.Context context) {
        if (com.facebook.ads.redexgen.core.C1086Up.A0w(context)) {
            return new com.facebook.ads.redexgen.core.C1636gi(context, A0A(), A00(context, A0A()));
        }
        com.facebook.ads.redexgen.core.C1636gi A03 = A03(context);
        if (A00[2].length() == 11) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A00;
        strArr[3] = "B";
        strArr[7] = "J1bgC2YpAkuTguvKBul5HQJ";
        return A03;
    }

    public static com.facebook.ads.redexgen.core.C1636gi A05(android.content.Context context, java.lang.String str) {
        com.facebook.ads.redexgen.core.InterfaceC0862Lt A01 = A01(context, A0A(), str);
        A01.AJT(1000);
        return new com.facebook.ads.redexgen.core.C1636gi(context, A0A(), A01);
    }

    public static com.facebook.ads.redexgen.core.C1636gi A06(android.content.Context context, java.lang.String str) {
        return new com.facebook.ads.redexgen.core.C1636gi(context, A0A(), A01(context, A0A(), str));
    }

    public static com.facebook.ads.redexgen.core.C1636gi A07(android.content.Context context, java.lang.String str) {
        return new com.facebook.ads.redexgen.core.C1636gi(context, A0A(), A01(context, A0A(), str));
    }

    public static com.facebook.ads.redexgen.core.AnonymousClass76 A08(android.content.Context context) {
        return new com.facebook.ads.redexgen.core.AnonymousClass76(context, A0A(), A0A().A8C(A09(context)));
    }

    public static com.facebook.ads.redexgen.core.C1632ge A09(android.content.Context context) {
        return new com.facebook.ads.redexgen.core.C1632ge(context, A0A());
    }

    public static synchronized com.facebook.ads.redexgen.core.ZR A0A() {
        com.facebook.ads.redexgen.core.ZR A02;
        synchronized (com.facebook.ads.redexgen.core.C1009Rp.class) {
            A02 = com.facebook.ads.redexgen.core.ZR.A02();
        }
        return A02;
    }
}
