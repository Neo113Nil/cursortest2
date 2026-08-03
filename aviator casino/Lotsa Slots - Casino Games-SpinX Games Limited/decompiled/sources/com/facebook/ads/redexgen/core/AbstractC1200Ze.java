package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ze, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1200Ze {
    public static java.lang.String[] A00 = {"B", "b", "N7Y4O4Xp0bXRpwQYmrnUbbD5XPNn0nfl", "PsTgqcCc8jcMoxm2RXWy1mA6rhf59", "zMLnehec4ICfDGOtTSDp3symXOGZpaRx", "AnvCnC9uV", "JoTWE5M61fQkMjrwCjPz5KG5vu8cqeKb", "O6aKPphMSjoWO4xDWlhiQ7T2kp0fs"};
    public static final int A01 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 200.0f);
    public static final int A03 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 200.0f);
    public static final int A02 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 50.0f);

    public static com.facebook.ads.redexgen.core.NF A00(com.facebook.ads.NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return com.facebook.ads.redexgen.core.NF.A04;
        }
        if (A03(nativeAdLayout)) {
            return com.facebook.ads.redexgen.core.NF.A05;
        }
        return com.facebook.ads.redexgen.core.NF.A03;
    }

    public static com.facebook.ads.redexgen.core.AbstractC1199Zd A01(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, java.lang.String str, android.view.View view) {
        if (view == null) {
            return null;
        }
        int w = view.getWidth();
        int height = view.getHeight();
        if (w >= A01 && height >= A01) {
            return new com.facebook.ads.redexgen.core.MC(c1636gi, va, str);
        }
        if (w >= A03) {
            int i = A02;
            java.lang.String[] strArr = A00;
            if (strArr[6].charAt(28) == strArr[4].charAt(28)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A00;
            strArr2[7] = "MXaU9iKOIfaGo19ccmM4SYJQh1BEv";
            strArr2[3] = "urarsFS1owFx4szCeqq2cq67A77KP";
            if (height >= i) {
                return new com.facebook.ads.redexgen.core.MD(c1636gi, va, str);
            }
        }
        return null;
    }

    public static com.facebook.ads.redexgen.core.ME A02(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, java.lang.String str, com.facebook.ads.redexgen.core.C0906Nm c0906Nm, com.facebook.ads.redexgen.core.InterfaceC1178Yi interfaceC1178Yi, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh) {
        return new com.facebook.ads.redexgen.core.ME(c1636gi, va, str, c0906Nm, interfaceC1178Yi, interfaceC1177Yh);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r4 < r0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A03(com.facebook.ads.NativeAdLayout nativeAdLayout) {
        int width = nativeAdLayout.getWidth();
        int height = nativeAdLayout.getHeight();
        int w = A01;
        if (width >= w) {
            int w2 = A01;
        }
        int i = A03;
        java.lang.String[] strArr = A00;
        java.lang.String str = strArr[1];
        java.lang.String str2 = strArr[0];
        int h = str.length();
        int w3 = str2.length();
        if (h != w3) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A00;
        strArr2[1] = "e";
        strArr2[0] = "I";
        if (width >= i) {
            int w4 = A02;
            if (height >= w4) {
                return false;
            }
        }
        return true;
    }
}
