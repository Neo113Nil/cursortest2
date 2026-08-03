package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.dD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1421dD {
    public static java.lang.String[] A00 = {"M7M7680JiQXMJzeuHBUdBK3CqcsunIE3", "7YJQc0MEUr6fNb1HoLhvfznehf2fNPi1", "fqXve0BGHc", "EJDyhBK8ScH8NN0H4G45MCvGKFSIU6i3", "lE5hsHUrpnTpaSUAUiDOdKdDJm2EXpBt", "fXhWa5fzMs", "jGMjXmbPjJmsUXbAj46daPhZmilD9JtA", "gy7nSuWAyo"};
    public static final java.util.Map<java.lang.String, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1420dC>> A01 = new java.util.HashMap();

    public static int A00() {
        java.util.Map<java.lang.String, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1420dC>> map = A01;
        if (A00[4].charAt(3) != 'h') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A00;
        strArr[3] = "KcOG1rzwVGm5OqslsWQoAqhkYEC7FRij";
        strArr[1] = "Dhj4Lprngz6YVn4AutwbBiUWJOZdaDii";
        return map.size();
    }

    public static com.facebook.ads.redexgen.core.C1420dC A01(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, int i, com.facebook.ads.redexgen.core.InterfaceC1418dA interfaceC1418dA) {
        com.facebook.ads.redexgen.core.C1420dC c1420dC = new com.facebook.ads.redexgen.core.C1420dC(c1636gi, abstractC1801jd, c1636gi.A02().A0A(), i);
        c1420dC.A0b(interfaceC1418dA);
        c1420dC.A0X();
        A01.put(abstractC1801jd.A1D(), new java.lang.ref.WeakReference<>(c1420dC));
        return c1420dC;
    }

    public static com.facebook.ads.redexgen.core.C1420dC A02(java.lang.String str) {
        java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.C1420dC> weakReference = A01.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.C1420dC c1420dC) {
        A01.put(abstractC1801jd.A1D(), new java.lang.ref.WeakReference<>(c1420dC));
    }

    public static void A04(java.lang.String str) {
        A01.remove(str);
    }
}
