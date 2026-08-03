package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class SY {
    public static byte[] A01;
    public android.content.SharedPreferences A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 127);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{41, 44, 62, 45, 58, 60, 33, 59, 33, 38, 47, 1, 44, 80, 69, 69, 67, 88, 83, 68, 69, 88, 94, 95, 120, 85, 93, 95, 93, 86, 91, 106, 109, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.SYN, 85, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.DLE, 85, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.US, 8, 85, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.US, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SUB, 115, 118, 114, 118, 107, 94, 123, 75, 109, 126, 124, 116, 118, 113, 120};
    }

    public SY(com.facebook.ads.redexgen.core.T8 t8) {
        this.A00 = t8.getSharedPreferences(com.facebook.ads.internal.util.process.ProcessUtils.getProcessSpecificName(A00(33, 21, 4), t8), 0);
    }

    public final com.facebook.ads.redexgen.core.SX A02() {
        android.content.SharedPreferences sharedPreferences = this.A00;
        java.lang.String A00 = A00(0, 13, 55);
        if (sharedPreferences.contains(A00)) {
            return new com.facebook.ads.redexgen.core.SX(this.A00.getString(A00, A00(0, 0, 75)), this.A00.getBoolean(A00(54, 15, 96), false), com.facebook.ads.redexgen.core.SW.A08, this.A00.getLong(A00(26, 7, 65), -1L));
        }
        return com.facebook.ads.redexgen.core.SX.A00();
    }

    public final java.lang.String A03() {
        return this.A00.getString(A00(13, 13, 78), A00(0, 0, 75));
    }

    public final void A04(com.facebook.ads.redexgen.core.SX sx) {
        android.content.SharedPreferences.Editor edit = this.A00.edit();
        edit.putString(A00(0, 13, 55), sx.A03());
        edit.putBoolean(A00(54, 15, 96), sx.A04());
        edit.putLong(A00(26, 7, 65), sx.A01());
        edit.apply();
    }

    public final void A05(java.lang.String str) {
        android.content.SharedPreferences.Editor edit = this.A00.edit();
        edit.putString(A00(13, 13, 78), str);
        edit.apply();
    }
}
