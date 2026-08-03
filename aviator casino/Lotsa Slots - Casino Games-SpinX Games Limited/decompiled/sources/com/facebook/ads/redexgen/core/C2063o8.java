package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.o8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2063o8 implements com.facebook.ads.redexgen.core.BY {
    public static byte[] A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 11);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{com.google.common.base.Ascii.CR, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.ESC, 83, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.US, 7, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.US, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.NAK, 10, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.EM, 19, 83, com.google.common.base.Ascii.GS, 10, com.google.common.base.Ascii.US};
    }

    public C2063o8() {
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final int A7P() {
        return android.media.MediaCodecList.getCodecCount();
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final android.media.MediaCodecInfo A7Q(int i) {
        return android.media.MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final boolean AAR(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final boolean AAS(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return A00(0, 15, 117).equals(str) && A00(15, 9, 119).equals(str2);
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final boolean AJ4() {
        return false;
    }
}
