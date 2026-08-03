package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class XZ implements java.lang.reflect.InvocationHandler {
    public static byte[] A03;
    public final /* synthetic */ int A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.T8 A01;
    public final /* synthetic */ java.util.concurrent.LinkedBlockingQueue A02;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 52);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{40, 42, 33, 42, kotlin.io.encoding.Base64.padSymbol, 38, 44, 43, 41, 56, com.google.common.base.Ascii.US, 60, 32, 37, 56, 2, 45, 33, 41, 43, 41, 56, com.google.common.base.Ascii.CAN, 53, 60, 41, 73, 75, 90, 120, 79, 66, 91, 75, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.FS, 49, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ETB, 17, com.google.common.base.Ascii.EM, 1, 7, com.google.common.base.Ascii.US, 1, 32, com.google.common.base.Ascii.ETB, 19, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.VT};
    }

    public XZ(int i, java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue, com.facebook.ads.redexgen.core.T8 t8) {
        this.A00 = i;
        this.A02 = linkedBlockingQueue;
        this.A01 = t8;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.Throwable {
        try {
            if (method.getName().equals(A00(34, 16, 70)) && objArr.length == 1 && (objArr[0] instanceof java.util.List)) {
                for (java.lang.Object c : (java.util.List) objArr[0]) {
                    java.lang.String str = (java.lang.String) c.getClass().getMethod(A00(7, 12, 120), new java.lang.Class[0]).invoke(c, new java.lang.Object[0]);
                    int intValue = ((java.lang.Integer) c.getClass().getMethod(A00(19, 7, 120), new java.lang.Class[0]).invoke(c, new java.lang.Object[0])).intValue();
                    if (str == null && intValue == this.A00) {
                        byte[] value = (byte[]) c.getClass().getMethod(A00(26, 8, 26), new java.lang.Class[0]).invoke(c, new java.lang.Object[0]);
                        this.A02.put(value);
                        return null;
                    }
                }
                this.A02.put(null);
            }
        } catch (java.lang.Throwable t) {
            this.A01.A08().ABC(A00(0, 7, 123), com.facebook.ads.redexgen.core.AbstractC1048Td.A1G, new com.facebook.ads.redexgen.core.C1049Te(t));
        }
        return null;
    }
}
