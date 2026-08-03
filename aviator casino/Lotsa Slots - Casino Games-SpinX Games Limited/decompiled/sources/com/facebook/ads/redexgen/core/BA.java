package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class BA extends java.lang.Exception {
    public static byte[] A05;
    public final com.facebook.ads.redexgen.core.B3 A00;
    public final com.facebook.ads.redexgen.core.BA A01;
    public final java.lang.String A02;
    public final java.lang.String A03;
    public final boolean A04;

    static {
        A05();
    }

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 113);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{0, com.google.common.base.Ascii.FF, 49, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.SUB, 17, com.google.common.base.Ascii.DLE, 7, 85, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FS, 1, 85, 19, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DLE, 17, 79, 85, 101, 68, 66, 78, 69, 68, 83, 1, 72, 79, 72, 85, 1, 71, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 72, 77, 68, 69, com.google.common.base.Ascii.ESC, 1, 122, 63, 78, 66, com.google.common.base.Ascii.GS, 17, 19, 80, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.US, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FS, 17, 17, com.google.common.base.Ascii.NAK, 80, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.CR, 80, com.google.common.base.Ascii.US, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.FF, 17, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SUB, 6, 80, 19, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.US, 77, 80, com.google.common.base.Ascii.ESC, 6, 17, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.US, 7, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FF, 80, 19, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.US, com.google.common.base.Ascii.GS, 17, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.GS, 80, 51, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.US, kotlin.io.encoding.Base64.padSymbol, 17, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.GS, 44, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FF, 33, 36, 47, 45, com.google.common.base.Ascii.NAK};
    }

    public BA(com.facebook.ads.redexgen.core.C2196qI c2196qI, java.lang.Throwable th, boolean z, int i) {
        this(A03(23, 22, 80) + i + A03(45, 3, 19) + c2196qI, th, c2196qI.A0W, z, null, A02(i), null);
    }

    public BA(com.facebook.ads.redexgen.core.C2196qI c2196qI, java.lang.Throwable th, boolean z, com.facebook.ads.redexgen.core.B3 b3) {
        this(A03(2, 21, 4) + b3.A03 + A03(0, 2, 93) + c2196qI, th, c2196qI.A0W, z, b3, com.facebook.ads.redexgen.core.C5C.A02 >= 21 ? A04(th) : null, null);
    }

    public BA(java.lang.String str, java.lang.Throwable th, java.lang.String str2, boolean z, com.facebook.ads.redexgen.core.B3 b3, java.lang.String str3, com.facebook.ads.redexgen.core.BA ba) {
        super(str, th);
        this.A03 = str2;
        this.A04 = z;
        this.A00 = b3;
        this.A02 = str3;
        this.A01 = ba;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.facebook.ads.redexgen.core.BA A00(com.facebook.ads.redexgen.core.BA ba) {
        return new com.facebook.ads.redexgen.core.BA(getMessage(), getCause(), this.A03, this.A04, this.A00, this.A02, ba);
    }

    public static java.lang.String A02(int i) {
        java.lang.String A03 = i < 0 ? A03(121, 4, 59) : A03(0, 0, 98);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String sign = A03(48, 73, 15);
        return sb.append(sign).append(A03).append(java.lang.Math.abs(i)).toString();
    }

    public static java.lang.String A04(java.lang.Throwable th) {
        if (th instanceof android.media.MediaCodec.CodecException) {
            return ((android.media.MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
