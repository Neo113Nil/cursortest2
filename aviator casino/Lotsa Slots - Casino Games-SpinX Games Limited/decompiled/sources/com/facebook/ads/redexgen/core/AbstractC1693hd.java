package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1693hd {
    public static volatile com.facebook.ads.redexgen.core.InterfaceC1686hW A02 = com.facebook.ads.redexgen.core.C2T.A00();
    public static volatile boolean A03 = false;
    public static boolean A00 = false;
    public static final java.util.List<com.facebook.debug.log.BLogLevelCallback> A01 = new java.util.ArrayList();

    static {
        A02.AJY(5);
        com.facebook.ads.redexgen.core.AbstractC1685hV.A00(A02);
    }

    public static void A00(@javax.annotation.Nullable java.lang.String str, java.lang.String str2) {
        if (A02.AAY(4)) {
            A02.A9t(str, str2);
        }
    }

    public static void A01(@javax.annotation.Nullable java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        if (A02.AAY(4)) {
            A00(str, com.facebook.ads.redexgen.core.AbstractC1688hY.A0J(str2, obj));
        }
    }

    public static void A02(@javax.annotation.Nullable java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (A02.AAY(4)) {
            A02.A9u(str, str2, th);
        }
    }
}
