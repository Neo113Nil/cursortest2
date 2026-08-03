package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class RH {
    public static byte[] A0H;
    public int A01;
    public int A02;
    public int A06;
    public int A07;
    public long A08;
    public android.util.SparseArray<java.lang.Object> A0G;
    public int A0F = -1;
    public int A05 = 0;
    public int A00 = 0;
    public int A04 = 1;
    public int A03 = 0;
    public boolean A0D = false;
    public boolean A09 = false;
    public boolean A0E = false;
    public boolean A0A = false;
    public boolean A0C = false;
    public boolean A0B = false;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 24);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A0H = new byte[]{75, 9, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.US, 75, 2, com.google.common.base.Ascii.US, 75, 2, com.google.common.base.Ascii.CAN, 75, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.SUB, 87, 126, 91, 78, 91, 7, 78, 66, com.google.common.base.Ascii.SI, 38, 7, com.google.common.base.Ascii.SO, 7, com.google.common.base.Ascii.SYN, 7, 6, 43, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.VT, 17, com.google.common.base.Ascii.VT, 0, com.google.common.base.Ascii.SO, 7, 43, com.google.common.base.Ascii.SYN, 7, com.google.common.base.Ascii.SI, 33, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SYN, 49, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 1, 7, 50, com.google.common.base.Ascii.DLE, 7, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.ETB, 17, 46, 3, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SYN, 95, 33, 45, 96, 68, 99, 93, Byte.MAX_VALUE, 104, 65, 108, 116, 98, 120, 121, 48, 60, 48, 125, 89, 100, 117, 125, 83, Byte.MAX_VALUE, 101, 126, 100, 45, 3, com.google.common.base.Ascii.SI, 66, Byte.MAX_VALUE, 93, 74, 89, 70, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 90, 92, 99, 78, 86, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 90, 91, 102, 91, 74, 66, 108, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 90, 65, 91, com.google.common.base.Ascii.DC2, 86, 90, com.google.common.base.Ascii.ETB, 40, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC4, 42, 8, com.google.common.base.Ascii.US, com.google.common.base.Ascii.RS, 19, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SO, 19, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.US, 59, com.google.common.base.Ascii.DC4, 19, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SO, 19, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC4, 9, 71, 41, 37, 104, 87, 112, 107, 86, 108, 104, 117, 105, 96, 68, 107, 108, 104, 100, 113, 108, 106, 107, 118, 56, 17, com.google.common.base.Ascii.GS, 80, 110, 73, 79, 72, 94, 73, 72, 79, 88, 126, 85, 92, 83, 90, 88, 89, 0, 120, 85, 77, 91, 65, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.base.Ascii.DC4, 71, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 85, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 81, com.google.common.base.Ascii.DC4, 71, 92, 91, 65, 88, 80, com.google.common.base.Ascii.DC4, 86, 81, com.google.common.base.Ascii.DC4, 91, 90, 81, com.google.common.base.Ascii.DC4, 91, 82, com.google.common.base.Ascii.DC4, 107, 76, 89, 76, 93, 67, 85, 108, 89, 74, 95, 93, 76, 104, 87, 75, 81, 76, 81, 87, 86, 5};
    }

    public final int A03() {
        if (this.A09) {
            return this.A05 - this.A00;
        }
        return this.A03;
    }

    public final void A04(int i) {
        if ((this.A04 & i) != 0) {
        } else {
            throw new java.lang.IllegalStateException(A01(192, 30, 44) + java.lang.Integer.toBinaryString(i) + A01(0, 11, 115) + java.lang.Integer.toBinaryString(this.A04));
        }
    }

    public final void A05(com.facebook.ads.redexgen.core.AbstractC0984Qq abstractC0984Qq) {
        this.A04 = 1;
        this.A03 = abstractC0984Qq.A0B();
        this.A09 = false;
        this.A0E = false;
        this.A0A = false;
    }

    public final boolean A06() {
        return this.A0F != -1;
    }

    public final boolean A07() {
        return this.A09;
    }

    public final boolean A08() {
        return this.A0B;
    }

    public final java.lang.String toString() {
        return A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, 22, 32) + this.A0F + A01(11, 8, 34) + this.A0G + A01(82, 13, 8) + this.A03 + A01(95, 27, 55) + this.A05 + A01(19, 48, 122) + this.A00 + A01(172, 20, 37) + this.A0D + A01(67, 15, 21) + this.A09 + A01(149, 23, 29) + this.A0C + A01(122, 27, 98) + this.A0B + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ;
    }
}
