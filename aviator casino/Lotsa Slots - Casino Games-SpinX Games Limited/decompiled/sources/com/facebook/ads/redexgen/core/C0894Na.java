package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Na, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0894Na implements java.io.Serializable {
    public static byte[] A0A = null;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final long serialVersionUID = 8946536326456653736L;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 68);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A0A = new byte[]{110, 125, 126, 125, -126, 125, -111, 121, -118, -72, -118, -68, -117, -116, -77, -55, -64, -55, -60, -55, -13, -113, -46, -94, -46, -93, -46, -91, Byte.MIN_VALUE, -61, -61, -111, -115, -107, -115, -61, -61, -64, -62, -62, -60, -51, -45, -66, -62, -50, -53, -50, -47, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.EM, 37, 34, 37, 40, com.google.common.base.Ascii.SYN, 35, com.google.common.base.Ascii.CAN, 45, 19, com.google.common.base.Ascii.ETB, 35, 32, 35, 38, com.google.common.base.Ascii.ESC, 44, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.ESC, 39, 36, 39, 42, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.US, com.google.common.base.Ascii.FF, 10, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.GS, 10, com.google.common.base.Ascii.SUB, 33, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.GS, 10, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.FF, 17, 34, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DC2, 39, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.ETB, 17, com.google.common.base.Ascii.CR, 17, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.GS, 32, -16, 1, -18, -20, 1, -14, 5, 1, -20, -16, -4, -7, -4, -1, 32, 49, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.FS, 49, 34, 53, 49, com.google.common.base.Ascii.FS, 32, 44, 41, 44, 47, com.google.common.base.Ascii.FS, 44, 51, 34, 47, com.google.common.base.Ascii.FS, 42, 34, 33, 38, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SO, 8, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.ESC, 41, com.google.common.base.Ascii.RS, 41, 33, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.CAN, 36, 33, 36, 39};
    }

    static {
        A03();
        A0B = android.graphics.Color.parseColor(A02(14, 7, 76));
        A0C = android.graphics.Color.parseColor(A02(7, 7, 18));
        A0D = android.graphics.Color.parseColor(A02(21, 7, 40));
        java.lang.String A02 = A02(28, 9, 25);
        A0E = android.graphics.Color.parseColor(A02);
        A0F = android.graphics.Color.parseColor(A02(0, 7, 7));
        A0G = android.graphics.Color.parseColor(A02);
    }

    public C0894Na(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = i5;
        this.A05 = i6;
        this.A07 = i7;
        this.A08 = i8;
        this.A09 = i9;
        this.A06 = i10;
    }

    public static int A00(org.json.JSONObject jSONObject, java.lang.String str, int i) {
        if (jSONObject != null && jSONObject.has(str)) {
            return android.graphics.Color.parseColor(jSONObject.optString(str));
        }
        return i;
    }

    public static com.facebook.ads.redexgen.core.C0894Na A01(org.json.JSONObject jSONObject) {
        return new com.facebook.ads.redexgen.core.C0894Na(A00(jSONObject, A02(37, 12, 27), A0B), A00(jSONObject, A02(57, 10, 112), A0C), A00(jSONObject, A02(com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION, 14, 101), androidx.core.view.ViewCompat.MEASURED_STATE_MASK), A00(jSONObject, A02(49, 8, 114), A0D), A00(jSONObject, A02(67, 9, 116), A0E), A00(jSONObject, A02(76, 20, 103), -1), A00(jSONObject, A02(113, 14, 73), -1), A00(jSONObject, A02(127, 25, 121), A0G), A00(jSONObject, A02(166, 11, 113), androidx.core.view.ViewCompat.MEASURED_STATE_MASK), A00(jSONObject, A02(96, 17, 106), A0E));
    }

    public final int A04() {
        return this.A06;
    }

    public final int A05(boolean z) {
        if (z) {
            return -1;
        }
        return this.A00;
    }

    public final int A06(boolean z) {
        if (z) {
            return -1;
        }
        return this.A01;
    }

    public final int A07(boolean z) {
        if (z) {
            return -1;
        }
        return this.A02;
    }

    public final int A08(boolean z) {
        return z ? A0F : this.A03;
    }

    public final int A09(boolean z) {
        return z ? this.A05 : this.A04;
    }

    public final int A0A(boolean z) {
        return z ? this.A08 : this.A07;
    }

    public final int A0B(boolean z) {
        if (z) {
            return -1;
        }
        return this.A09;
    }
}
