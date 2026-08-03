package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.qX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2209qX {
    public static byte[] A00;
    public static final com.facebook.ads.redexgen.core.C2208qW A01;
    public static final com.facebook.ads.redexgen.core.C0C[] A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 12);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{79, 75, 80, 72, 77, 74, 10, 86, 65, 66, 72, 65, 71, 80, 10, 78, 82, 73, 10, 77, 74, 80, 65, 86, 74, 69, 72, 10, 118, 65, 66, 72, 65, 71, 80, 77, 75, 74, 98, 69, 71, 80, 75, 86, 93, 109, 73, 84, 72};
    }

    static {
        com.facebook.ads.redexgen.core.C2208qW impl;
        try {
            A02();
            java.lang.Class<?> implClass = java.lang.Class.forName(A00(0, 49, 40));
            impl = (com.facebook.ads.redexgen.core.C2208qW) implClass.newInstance();
        } catch (java.lang.ClassCastException unused) {
            impl = null;
        } catch (java.lang.ClassNotFoundException unused2) {
            impl = null;
        } catch (java.lang.IllegalAccessException unused3) {
            impl = null;
        } catch (java.lang.InstantiationException unused4) {
            impl = null;
        }
        if (impl == null) {
            impl = new com.facebook.ads.redexgen.core.C2208qW();
        }
        A01 = impl;
        A02 = new com.facebook.ads.redexgen.core.C0C[0];
    }

    public static java.lang.String A01(com.facebook.ads.redexgen.core.AbstractC03621o abstractC03621o) {
        return A01.A03(abstractC03621o);
    }
}
