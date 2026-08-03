package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class H5 {
    public static byte[] A03;
    public final com.facebook.ads.redexgen.core.H4 A00;
    public final java.lang.reflect.Constructor<? extends com.facebook.ads.redexgen.core.H9> A01;
    public final java.util.concurrent.atomic.AtomicBoolean A02 = new java.util.concurrent.atomic.AtomicBoolean(false);

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 14);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{55, 0, 0, com.google.common.base.Ascii.GS, 0, 82, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FS, 1, 6, 19, com.google.common.base.Ascii.FS, 6, com.google.common.base.Ascii.ESC, 19, 6, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.NAK, 82, com.google.common.base.Ascii.ETB, 10, 6, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.FS, 1, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.FS, 37, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.NAK, 8, 0, com.google.common.base.Ascii.NAK, 19, 4, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC4, 80, com.google.common.base.Ascii.NAK, 2, 2, com.google.common.base.Ascii.US, 2, 80, 19, 2, com.google.common.base.Ascii.NAK, 17, 4, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.ETB, 80, com.google.common.base.Ascii.NAK, 8, 4, 2, 17, 19, 4, com.google.common.base.Ascii.US, 2};
    }

    public H5(com.facebook.ads.redexgen.core.H4 h4) {
        this.A00 = h4;
    }

    private java.lang.reflect.Constructor<? extends com.facebook.ads.redexgen.core.H9> A01() {
        synchronized (this.A02) {
            if (this.A02.get()) {
                return this.A01;
            }
            try {
                return this.A00.A7R();
            } catch (java.lang.ClassNotFoundException unused) {
                this.A02.set(true);
                return this.A01;
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(A00(0, 29, 124), e);
            }
        }
    }

    public final com.facebook.ads.redexgen.core.H9 A03(java.lang.Object... objArr) {
        java.lang.reflect.Constructor<? extends com.facebook.ads.redexgen.core.H9> A01 = A01();
        if (A01 == null) {
            return null;
        }
        try {
            return A01.newInstance(objArr);
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalStateException(A00(29, 35, 126), e);
        }
    }
}
