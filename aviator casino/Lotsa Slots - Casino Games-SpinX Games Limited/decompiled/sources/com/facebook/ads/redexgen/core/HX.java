package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class HX {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"", "4aEfCmC", "2kTu4wHTiMw5FCYmIpZKoA3S7RkYvI9O", "", "w", "MqF3b2p", "5cCqnzmPstBPsSiWHPZbbxeHAyWMz3nO", "kSg1dz9TqTWY2puBAJqsQN0JUmM78NMM"};
    public final com.facebook.ads.redexgen.core.HZ A00;
    public final com.facebook.ads.redexgen.core.HZ A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 82);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.ETB, 123, 7};
    }

    static {
        A01();
    }

    public HX(com.facebook.ads.redexgen.core.HZ hz) {
        this(hz, hz);
    }

    public HX(com.facebook.ads.redexgen.core.HZ hz, com.facebook.ads.redexgen.core.HZ hz2) {
        this.A00 = (com.facebook.ads.redexgen.core.HZ) com.facebook.ads.redexgen.core.AbstractC04203y.A01(hz);
        this.A01 = (com.facebook.ads.redexgen.core.HZ) com.facebook.ads.redexgen.core.AbstractC04203y.A01(hz2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.redexgen.core.HX hx = (com.facebook.ads.redexgen.core.HX) obj;
        if (A03[7].charAt(24) != 'U') {
            throw new java.lang.RuntimeException();
        }
        A03[4] = "g";
        return this.A00.equals(hx.A00) && this.A01.equals(hx.A01);
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder append = new java.lang.StringBuilder().append(A00(2, 1, 114)).append(this.A00);
        if (!this.A00.equals(this.A01)) {
            str = A00(0, 2, 101) + this.A01;
        } else {
            if (A03[0].length() != 0) {
                throw new java.lang.RuntimeException();
            }
            A03[0] = "";
            str = A00(0, 0, 76);
        }
        return append.append(str).append(A00(3, 1, 8)).toString();
    }
}
