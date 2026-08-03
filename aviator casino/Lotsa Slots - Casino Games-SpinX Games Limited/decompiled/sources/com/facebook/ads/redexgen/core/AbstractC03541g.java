package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.1g, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC03541g extends com.facebook.ads.redexgen.core.AE {
    public static byte[] A11;
    public static java.lang.String[] A12 = {"nx3Y", "ySV9u0UlUifM8l7YXQ9XliwCignJM927", "I56UD3cYRclrpAgGGb6MtOKCjcs9cL2j", "Sm2NURaNWtDVUJWNcAo7ERDS0hDt7", "bHPfo4AgOQoRvyPk4FB0ks", "XoiyS7TBeS4mt", "Z3oSrtXzlmftA", "iDWmG7Cddc7JoXPcHC9pChUfA3XnAJjW"};
    public static final byte[] A13;
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public android.media.MediaFormat A0C;
    public com.facebook.ads.redexgen.core.InterfaceC05629s A0D;
    public com.facebook.ads.redexgen.core.InterfaceC05629s A0E;
    public com.facebook.ads.redexgen.core.B0 A0F;
    public com.facebook.ads.redexgen.core.B3 A0G;
    public com.facebook.ads.redexgen.core.BA A0H;
    public com.facebook.ads.redexgen.core.BC A0I;
    public java.lang.String A0J;
    public java.nio.ByteBuffer A0K;
    public java.util.ArrayDeque<com.facebook.ads.redexgen.core.B3> A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Potentially can be removed. Added in D36797879")
    public long A0f;
    public com.facebook.ads.redexgen.core.C2196qI A0g;
    public com.facebook.ads.redexgen.core.C6I A0h;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D57514060: Do not added Dav1dMediaCodecInfo to the list of MediaCodecInfos if it's already added, can be cleaned up after launch")
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public final int A0l;
    public final int A0m;
    public final android.media.MediaCodec.BufferInfo A0n;
    public final com.facebook.ads.redexgen.core.C2117p0 A0o;
    public final com.facebook.ads.redexgen.core.C2117p0 A0p;
    public final com.facebook.ads.redexgen.core.C04996z A0q;
    public final com.facebook.ads.redexgen.core.A6 A0r;
    public final com.facebook.ads.redexgen.core.BT A0s;
    public final java.util.ArrayDeque<com.facebook.ads.redexgen.core.BC> A0t;
    public final java.util.List<java.lang.Long> A0u;
    public final boolean A0v;
    public final boolean A0w;
    public final boolean A0x;
    public final com.facebook.ads.redexgen.core.MediaCodecRendererMetaParameters A0y;
    public final com.facebook.ads.redexgen.core.C1792jQ A0z;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "D60404164: Merge init calls in the renderer")
    public final boolean A10;

    public static java.lang.String A0x(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A11, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 65);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A15() {
        A11 = new byte[]{-74, -86, -20, -1, -2, -86, -8, -7, -86, -3, -17, -19, -1, -4, -17, -86, -18, -17, -19, -7, -18, -17, -4, -86, -21, 0, -21, -13, -10, -21, -20, -10, -17, -72, -86, -34, -4, 3, -13, -8, -15, -86, -2, -7, -86, -6, -4, -7, -19, -17, -17, -18, -86, 1, -13, -2, -14, -86, -110, -120, -87, -89, -77, -88, -87, -74, 100, -83, -78, -83, -72, -83, -91, -80, -83, -66, -91, -72, -83, -77, -78, 100, -86, -91, -83, -80, -87, -88, 112, 100, -74, -87, -72, -74, -67, -25, 8, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.CAN, 8, com.google.common.base.Ascii.CAN, 8, -61, 9, 4, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SI, 8, 7, -49, -61, com.google.common.base.Ascii.NAK, 8, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.FS, -22, com.google.common.base.Ascii.CAN, 19, -58, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC4, -58, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.EM, -58, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.VT, 9, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.VT, -58, 10, com.google.common.base.Ascii.VT, 9, com.google.common.base.Ascii.NAK, 10, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CAN, -58, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.CAN, -58, -103, -76, -68, -65, -72, -73, 115, -57, -62, 115, -68, -63, -68, -57, -68, -76, -65, -68, -51, -72, 115, -73, -72, -74, -62, -73, -72, -59, -115, 115, -113, -89, -90, -85, -93, 98, -76, -89, -77, -73, -85, -76, -89, -75, 98, -93, 98, -122, -76, -81, -107, -89, -75, -75, -85, -79, -80, -113, -93, -80, -93, -87, -89, -76, -47, -23, -24, -19, -27, -57, -13, -24, -23, -25, -42, -23, -14, -24, -23, -10, -23, -10, -78, -80, -69, -111, -88, -37, -36, -47, -46, -42, -111, -60, -39, -58, -111, -57, -56, -58, -23, -25, -14, -56, -33, com.google.common.base.Ascii.DC2, 19, 8, 9, com.google.common.base.Ascii.CR, -56, -5, com.google.common.base.Ascii.DLE, -3, -56, -2, -1, -3, -56, com.google.common.base.Ascii.CR, -1, -3, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FF, -1, -79, -81, -70, -112, -81, -74, -83, -112, -93, -73, -90, -85, -79, -112, -90, -89, -91, -79, -90, -89, -76, -112, -81, -78, -107, -90, -92, -81, -123, -92, -85, -94, -123, -83, -96, -101, -100, -90, -123, -101, -100, -102, -90, -101, -100, -87, -123, -104, -83, -102, -83, -85, -74, -116, -84, -44, -57, -62, -57, -65, -116, -58, -112, -108, -110, -116, -62, -61, -63, -51, -62, -61, -103, -105, -94, 120, -104, -64, -77, -82, -77, -85, 120, -78, 124, Byte.MIN_VALUE, 126, 120, -82, -81, -83, -71, -82, -81, 120, -67, -81, -83, -65, -68, -81, -44, -46, -35, -77, -40, -54, -56, -77, -26, -5, -24, -77, -23, -22, -24, -35, -37, -26, -68, -31, -45, -47, -68, -17, 4, -15, -68, -14, -13, -15, -68, 1, -13, -15, 3, 0, -13, -56, -58, -47, -89, -38, -27, -27, -16, -30, -25, -25, -34, -21, -89, -17, -30, -35, -34, -24, -89, -35, -34, -36, -24, -35, -34, -21, -89, -38, -17, -36, -53, -55, -44, -86, -35, -23, -24, -21, -29, -27, -33, -86, -35, -14, -33, -86, -32, -31, -33, -21, -32, -31, -18, -86, -35, -13, -31, -17, -21, -23, -31, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SYN, -20, com.google.common.base.Ascii.US, 43, 42, 45, 37, 39, 33, -20, com.google.common.base.Ascii.US, 52, 33, -20, 34, 35, 33, 45, 34, 35, 48, -20, com.google.common.base.Ascii.US, 53, 35, 49, 45, 43, 35, -20, 49, 35, 33, 51, 48, 35, -71, -73, -62, -104, -47, -39, -39, -47, -42, -49, -104, -53, -53, -51, -104, -50, -49, -51, -39, -50, -49, -36, 4, 2, com.google.common.base.Ascii.CR, -29, com.google.common.base.Ascii.FS, 36, 36, com.google.common.base.Ascii.FS, 33, com.google.common.base.Ascii.SUB, -29, 43, 36, 39, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.RS, 40, -29, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.CAN, 36, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SUB, 39, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.CAN, -18, 50, 43, -18, 54, 41, 36, 37, 47, com.google.common.base.Ascii.US, 36, 37, 35, 47, 36, 37, 50, -18, 33, 54, 35, -73, -39, -52, -51, -52, -39, -39, -52, -53, -121, -53, -52, -54, -42, -53, -52, -39, -121, -48, -43, -38, -37, -56, -43, -37, -48, -56, -37, -48, -42, -43, -121, -51, -56, -48, -45, -52, -53, -107, -121, -70, -45, -52, -52, -41, -48, -43, -50, -121, -37, -49, -52, -43, -121, -39, -52, -37, -39, -32, -48, -43, -50, -107, 7, 1, -31, -11, -23, -27, -28, com.google.common.base.Ascii.SI, 9, -23, -3, -15, -18, -20, com.google.common.base.Ascii.DLE, 10, -22, 4, -11, -19, -19, -104, -110, 114, -113, 124, 117, 117, 0, -6, -38, 1, -30, -27, -30, -79, -74, -81, -68, -68, -77, -70, 123, -79, -67, -61, -68, -62, -76, -64, -65, -73, -70, -72, -58, -61, -74, -108, -64, -75, -74, -76, -44, -29, -42, -46, -27, -42, -76, -32, -43, -42, -44, -85, -75, -61, -78, -70, -65, -110, -65, -75, -105, -74, -74, -75, -82, -76, -73, -67, -74, -84, -83, -70, -13, -7, -4, 2, -5, -15, -14, -1, -20, -7, 1, -14, -49, -51, -36, -65, -38, -55, -40, -40, -51, -52, -75, -51, -52, -47, -55, -85, -38, -31, -40, -36, -41, -49, -38, -41, -35, -40, -51, -38, com.google.common.base.Ascii.SI, 9, -39, -41, -41, -41, -16, -19, -15, -17, -16, -4, -63, -71, -56, -75, -126, -72, -75, -54, -123, -72, -126, -75, -54, -123, -126, -72, -71, -73, -61, -72, -71, -58, 38, 39, com.google.common.base.Ascii.DC4, 37, 39, -10, 34, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SYN, -42, -53, -50, -61, -46, -53, -61, com.google.common.base.Ascii.DLE, 3, -2, -1, 9, -55, -5, com.google.common.base.Ascii.DLE, -54, -53, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SYN, -42, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SYN, 19, 9, 32, -44, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.NAK, 9, -5, -10, 6, -6};
    }

    public abstract int A1g(com.facebook.ads.redexgen.core.B0 b0, com.facebook.ads.redexgen.core.B3 b3, com.facebook.ads.redexgen.core.C2196qI c2196qI, com.facebook.ads.redexgen.core.C2196qI c2196qI2);

    public abstract int A1h(com.facebook.ads.redexgen.core.BT bt, com.facebook.ads.redexgen.core.A6 a6, com.facebook.ads.redexgen.core.C2196qI c2196qI) throws com.facebook.ads.redexgen.core.BX;

    public abstract java.util.List<com.facebook.ads.redexgen.core.B3> A1l(com.facebook.ads.redexgen.core.BT bt, com.facebook.ads.redexgen.core.C2196qI c2196qI, boolean z) throws com.facebook.ads.redexgen.core.BX;

    public abstract void A1u(com.facebook.ads.redexgen.core.C2117p0 c2117p0);

    public abstract void A1v(@com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization com.facebook.ads.redexgen.core.B0 b0, android.media.MediaFormat mediaFormat) throws com.facebook.ads.redexgen.core.AD;

    public abstract void A1w(com.facebook.ads.redexgen.core.B3 b3, com.facebook.ads.redexgen.core.B0 b0, com.facebook.ads.redexgen.core.C2196qI c2196qI, android.media.MediaCrypto mediaCrypto) throws com.facebook.ads.redexgen.core.BX;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("D45988204: [FBLite][Video] Add Codec Hooks for Logging")
    public abstract void A1x(java.lang.String str);

    public abstract void A1y(java.lang.String str, long j, long j2);

    public abstract boolean A22();

    public abstract boolean A23(long j, long j2, com.facebook.ads.redexgen.core.B0 b0, java.nio.ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, boolean z2) throws com.facebook.ads.redexgen.core.AD;

    static {
        A15();
        A13 = new byte[]{0, 0, 1, 103, 66, -64, com.google.common.base.Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, com.google.common.base.Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, com.google.common.base.Ascii.CR, -50, 113, com.google.common.base.Ascii.CAN, -96, 0, 47, -65, com.google.common.base.Ascii.FS, 49, -61, 39, 93, 120};
    }

    public AbstractC03541g(int i, com.facebook.ads.redexgen.core.C1792jQ c1792jQ, com.facebook.ads.redexgen.core.MediaCodecRendererMetaParameters mediaCodecRendererMetaParameters, com.facebook.ads.redexgen.core.BT bt, com.facebook.ads.redexgen.core.A6 a6, boolean z, boolean z2, int i2, int i3) {
        super(i);
        this.A09 = -9223372036854775807L;
        this.A08 = -9223372036854775807L;
        this.A0k = false;
        this.A0i = false;
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(com.facebook.ads.redexgen.core.C5C.A02 >= 16);
        this.A0z = (com.facebook.ads.redexgen.core.C1792jQ) com.facebook.ads.redexgen.core.AbstractC04203y.A01(c1792jQ);
        this.A0y = (com.facebook.ads.redexgen.core.MediaCodecRendererMetaParameters) com.facebook.ads.redexgen.core.AbstractC04203y.A01(mediaCodecRendererMetaParameters);
        this.A0s = (com.facebook.ads.redexgen.core.BT) com.facebook.ads.redexgen.core.AbstractC04203y.A01(bt);
        this.A0r = a6;
        this.A0x = z;
        this.A0v = z2;
        this.A0m = i2;
        this.A0l = i3;
        this.A0o = new com.facebook.ads.redexgen.core.C2117p0(0);
        this.A0p = com.facebook.ads.redexgen.core.C2117p0.A02();
        this.A0q = new com.facebook.ads.redexgen.core.C04996z();
        this.A0u = new java.util.ArrayList();
        this.A0n = new android.media.MediaCodec.BufferInfo();
        this.A00 = 1.0f;
        this.A01 = 1.0f;
        this.A0t = new java.util.ArrayDeque<>();
        A18(com.facebook.ads.redexgen.core.BC.A04);
        this.A03 = 0;
        this.A04 = 0;
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A0w = com.facebook.ads.redexgen.core.MetaExoPlayerUpgradeConfig.A03(com.facebook.ads.redexgen.core.EnumC1796jX.A1v);
        this.A10 = com.facebook.ads.redexgen.core.MetaExoPlayerUpgradeConfig.A03(com.facebook.ads.redexgen.core.EnumC1796jX.A1g);
    }

    private int A0w(java.lang.String str) {
        if (com.facebook.ads.redexgen.core.C5C.A02 <= 25) {
            java.lang.String A0x = A0x(256, 25, 89);
            if (A12[0].length() == 4) {
                java.lang.String[] strArr = A12;
                strArr[6] = "h0JLQRwistZ4R";
                strArr[5] = "YRyjkg8cOEuM6";
                if (A0x.equals(str) && (com.facebook.ads.redexgen.core.C5C.A06.startsWith(A0x(681, 7, 108)) || com.facebook.ads.redexgen.core.C5C.A06.startsWith(A0x(653, 7, 115)) || com.facebook.ads.redexgen.core.C5C.A06.startsWith(A0x(660, 7, 123)) || com.facebook.ads.redexgen.core.C5C.A06.startsWith(A0x(674, 7, 4)))) {
                    return 2;
                }
            }
            throw new java.lang.RuntimeException();
        }
        if (com.facebook.ads.redexgen.core.C5C.A02 < 24) {
            if (!A0x(331, 22, 29).equals(str) && !A0x(353, 29, 9).equals(str)) {
                return 0;
            }
            java.lang.String str2 = com.facebook.ads.redexgen.core.C5C.A03;
            java.lang.String[] strArr2 = A12;
            if (strArr2[4].length() != strArr2[3].length()) {
                java.lang.String[] strArr3 = A12;
                strArr3[4] = "Grbv6CKWzSbyHFrZua5Jwu";
                strArr3[3] = "PMUv1GSkzI9tSaBJkI706oVY9TsOb";
                if (!A0x(739, 8, 7).equals(str2)) {
                    if (!A0x(747, 12, 76).equals(com.facebook.ads.redexgen.core.C5C.A03)) {
                        if (!A0x(780, 7, 39).equals(com.facebook.ads.redexgen.core.C5C.A03)) {
                            if (!A0x(831, 7, 33).equals(com.facebook.ads.redexgen.core.C5C.A03)) {
                                return 0;
                            }
                        }
                    }
                }
                java.lang.String[] strArr4 = A12;
                if (strArr4[6].length() == strArr4[5].length()) {
                    java.lang.String[] strArr5 = A12;
                    strArr5[6] = "FCPESGyqb3ntu";
                    strArr5[5] = "UMDsUUTIxH2ng";
                    return 1;
                }
            }
            throw new java.lang.RuntimeException();
        }
        return 0;
    }

    private java.nio.ByteBuffer A0y(int i) {
        return this.A0F.A8J(i);
    }

    private java.nio.ByteBuffer A0z(int i) {
        return this.A0F.A8e(i);
    }

    private java.util.List<com.facebook.ads.redexgen.core.B3> A10(boolean z) throws com.facebook.ads.redexgen.core.BX {
        java.lang.String alternativeMimeType;
        java.util.List<com.facebook.ads.redexgen.core.B3> A1l = A1l(this.A0s, this.A0g, z);
        if (A1l.isEmpty() && z) {
            A1l = A1l(this.A0s, this.A0g, false);
            if (!A1l.isEmpty()) {
                com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0x(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 18, 67), A0x(116, 40, 101) + this.A0g.A0W + A0x(0, 58, 73) + A1l + A0x(58, 1, 35));
            }
        }
        if (A1l.isEmpty() && this.A0j && (alternativeMimeType = com.facebook.ads.redexgen.core.C0588Ba.A0P(this.A0g)) != null) {
            java.util.List<com.facebook.ads.redexgen.core.B3> A7o = this.A0s.A7o(alternativeMimeType, false, false);
            if (com.facebook.ads.redexgen.core.C5C.A02 >= 26) {
                if (A0x(848, 18, 102).equals(this.A0g.A0W) && !A7o.isEmpty()) {
                    return A7o;
                }
                return A1l;
            }
            return A1l;
        }
        return A1l;
    }

    private void A11() throws com.facebook.ads.redexgen.core.AD {
        if (this.A04 == 2) {
            A1n();
            A1p();
        } else {
            if (A12[0].length() != 4) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A12;
            strArr[4] = "s3YfZmdbCJrJCYfdnx93Y1";
            strArr[3] = "Or76pnfNSBivOkp3C019O1267DCns";
            this.A0a = true;
            A1o();
        }
    }

    private void A12() throws com.facebook.ads.redexgen.core.AD {
        android.media.MediaFormat A8f = this.A0F.A8f();
        if (this.A02 != 0 && A8f.getInteger(A0x(866, 5, 81)) == 32 && A8f.getInteger(A0x(793, 6, 71)) == 32) {
            this.A0b = true;
            return;
        }
        if (this.A0S) {
            A8f.setInteger(A0x(688, 13, 13), 1);
        }
        this.A0C = A8f;
        this.A0T = true;
        A1v(this.A0F, A8f);
    }

    private void A13() {
        this.A05 = -1;
        this.A0o.A02 = null;
    }

    private void A14() {
        this.A06 = -1;
        this.A0K = null;
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomizations({@com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Call to 'forceDisableAsynchronous'"), @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("D45988204: [FBLite][Video] Add Codec Hooks for Logging"), @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "D60404164: Merge init calls in the renderer")})
    private void A16(com.facebook.ads.redexgen.core.B3 b3, android.media.MediaCrypto mediaCrypto) throws java.lang.Exception {
        com.facebook.ads.redexgen.core.B0 b0 = null;
        java.lang.String str = b3.A03;
        try {
            if (this.A10) {
                A1z(str, this.A0g);
            } else {
                A1t(this.A0g);
            }
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            if (!this.A10) {
                A1x(str);
            }
            com.facebook.ads.redexgen.core.AnonymousClass54.A02(A0x(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NT_LOAD_NO_CONFIG, 12, 48) + str);
            new com.facebook.ads.redexgen.core.C2067oC().A00();
            b0 = com.facebook.ads.redexgen.core.B7.A02().A0K(A22(), this.A0z, this.A0y.getA00(), com.facebook.ads.redexgen.core.EnumC1789jL.A05, str);
            try {
                this.A0J = str;
                com.facebook.ads.redexgen.core.AnonymousClass54.A00();
                com.facebook.ads.redexgen.core.AnonymousClass54.A02(A0x(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NT_LOAD_AFTER_LONG_INITIATION, 14, 16));
                try {
                    A1w(b3, b0, this.A0g, mediaCrypto);
                    com.facebook.ads.redexgen.core.AnonymousClass54.A00();
                    com.facebook.ads.redexgen.core.AnonymousClass54.A02(A0x(821, 10, 114));
                    b0.start();
                    com.facebook.ads.redexgen.core.AnonymousClass54.A00();
                    long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                    this.A0F = b0;
                    this.A0G = b3;
                    A1y(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                } catch (java.lang.Exception e) {
                    e = e;
                    if (b0 != null) {
                        b0.AHb();
                    }
                    throw e;
                }
            } catch (java.lang.Exception e2) {
                e = e2;
            }
        } catch (java.lang.Exception e3) {
            e = e3;
        }
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D53064452: Add decoder init time failure thread sleep")
    private void A17(com.facebook.ads.redexgen.core.B3 b3, com.facebook.ads.redexgen.core.B3 b32, android.media.MediaCrypto mediaCrypto) throws java.lang.Exception {
        int A00 = com.facebook.ads.redexgen.core.MetaExoPlayerUpgradeConfig.A00(com.facebook.ads.redexgen.core.EnumC1797jY.A06);
        if (A00 >= 0) {
            try {
                A16(b32, mediaCrypto);
                return;
            } catch (java.lang.Exception e) {
                if (b32 == b3) {
                    com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0x(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 18, 67), A0x(590, 63, 38));
                    java.lang.Thread.sleep(A00);
                    A16(b32, mediaCrypto);
                    return;
                }
                throw e;
            }
        }
        A16(b32, mediaCrypto);
    }

    private void A18(com.facebook.ads.redexgen.core.BC bc) {
        this.A0I = bc;
        if (bc.A02 != -9223372036854775807L) {
            this.A0Z = true;
        }
    }

    private boolean A19() {
        if (this.A0l <= 0) {
            return false;
        }
        boolean z = this.A08 == -9223372036854775807L || java.lang.System.currentTimeMillis() - this.A08 <= ((long) this.A0l);
        if (this.A08 == -9223372036854775807L) {
            com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0x(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 18, 67), A0x(95, 21, 98));
            try {
                this.A0L = null;
                A1n();
            } catch (java.lang.IllegalStateException unused) {
            }
            this.A08 = java.lang.System.currentTimeMillis();
        }
        return z;
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D70661541: Skip the sample if sample is too large")
    private boolean A1A() throws com.facebook.ads.redexgen.core.AD {
        int result;
        if (this.A0F == null || this.A04 == 2 || this.A0X) {
            return false;
        }
        if (this.A05 < 0) {
            this.A05 = this.A0F.A5s();
            if (this.A05 < 0) {
                return false;
            }
            this.A0o.A02 = A0y(this.A05);
            this.A0o.A0A();
        }
        if (this.A04 == 1) {
            if (!this.A0Q) {
                this.A0V = true;
                this.A0F.AHI(this.A05, 0, 0, 0L, 4);
                A13();
            }
            this.A04 = 2;
            return false;
        }
        if (this.A0M) {
            this.A0M = false;
            this.A0o.A02.put(A13);
            this.A0F.AHI(this.A05, 0, A13.length, 0L, 0);
            A13();
            this.A0U = true;
            java.lang.String[] strArr = A12;
            if (strArr[4].length() == strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A12;
            strArr2[7] = "TQo31YhCROQVY4YgWOUT3bWhQ8E3XWwr";
            strArr2[1] = "W5PRMN9OPETbxvbbJic4GeLECMZHBr0G";
            return true;
        }
        int i = 0;
        if (this.A0e) {
            result = -4;
        } else {
            if (this.A03 == 1) {
                for (int i2 = 0; i2 < this.A0g.A0X.size(); i2++) {
                    this.A0o.A02.put(this.A0g.A0X.get(i2));
                }
                this.A03 = 2;
            }
            i = this.A0o.A02.position();
            boolean A03 = com.facebook.ads.redexgen.core.MetaExoPlayerUpgradeConfig.A03(com.facebook.ads.redexgen.core.EnumC1796jX.A0z);
            if (A12[2].charAt(29) == 'f') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr3 = A12;
            strArr3[6] = "tFzAjqlOyn071";
            strArr3[5] = "66mU3uAl0xlMl";
            if (A03) {
                try {
                    result = A1R(this.A0q, this.A0o, 0);
                } catch (com.facebook.ads.redexgen.core.AnonymousClass63 unused) {
                    A1C(0);
                    A1m();
                    return true;
                }
            } else {
                result = A1R(this.A0q, this.A0o, 0);
            }
        }
        if (A9p() || this.A0o.A08()) {
            this.A0B = this.A0A;
        }
        if (result == -3) {
            return false;
        }
        if (result == -5) {
            if (this.A03 == 2) {
                this.A0o.A0A();
                this.A03 = 1;
            }
            A1s(this.A0q.A00);
            return true;
        }
        if (this.A0o.A05()) {
            if (this.A03 == 2) {
                this.A0o.A0A();
                this.A03 = 1;
            }
            this.A0X = true;
            if (!this.A0U) {
                A11();
                return false;
            }
            try {
                if (!this.A0Q) {
                    this.A0V = true;
                    this.A0F.AHI(this.A05, 0, 0, 0L, 4);
                    A13();
                }
                return false;
            } catch (android.media.MediaCodec.CryptoException e) {
                com.facebook.ads.redexgen.core.C2196qI c2196qI = this.A0g;
                int adaptiveReconfigurationBytes = e.getErrorCode();
                throw A1S(e, c2196qI, com.facebook.ads.redexgen.core.C5C.A02(adaptiveReconfigurationBytes));
            }
        }
        if (this.A0d && !this.A0o.A07()) {
            this.A0o.A0A();
            if (this.A03 == 2) {
                this.A03 = 1;
            }
            return true;
        }
        this.A0d = false;
        boolean skipIfSampleTooLarge = this.A0o.A0E();
        boolean bufferEncrypted = this.A0y.getA01();
        if (bufferEncrypted && skipIfSampleTooLarge) {
            this.A0o.A05.A01(i);
        }
        boolean bufferEncrypted2 = A1N(skipIfSampleTooLarge);
        this.A0e = bufferEncrypted2;
        boolean bufferEncrypted3 = this.A0e;
        if (bufferEncrypted3) {
            return false;
        }
        boolean bufferEncrypted4 = this.A0N;
        if (bufferEncrypted4 && !skipIfSampleTooLarge) {
            com.facebook.ads.redexgen.core.HS.A0G(this.A0o.A02);
            if (this.A0o.A02.position() == 0) {
                return true;
            }
            this.A0N = false;
        }
        try {
            long j = this.A0o.A01;
            boolean bufferEncrypted5 = this.A0o.A04();
            if (bufferEncrypted5) {
                this.A0u.add(java.lang.Long.valueOf(j));
            }
            this.A0A = java.lang.Math.max(this.A0A, j);
            this.A0o.A0B();
            A1u(this.A0o);
            if (skipIfSampleTooLarge) {
                this.A0F.AHK(this.A05, 0, this.A0o.A05, j, 0);
            } else {
                this.A0F.AHI(this.A05, 0, this.A0o.A02.limit(), j, 0);
            }
            A13();
            this.A0U = true;
            this.A03 = 0;
            this.A0h.A08++;
            return true;
        } catch (android.media.MediaCodec.CryptoException e2) {
            com.facebook.ads.redexgen.core.C2196qI c2196qI2 = this.A0g;
            int adaptiveReconfigurationBytes2 = e2.getErrorCode();
            throw A1S(e2, c2196qI2, com.facebook.ads.redexgen.core.C5C.A02(adaptiveReconfigurationBytes2));
        }
    }

    private boolean A1B() {
        return this.A06 >= 0;
    }

    private boolean A1C(int i) throws com.facebook.ads.redexgen.core.AD {
        com.facebook.ads.redexgen.core.C04996z A1U = A1U();
        this.A0p.A0A();
        int A1R = A1R(A1U, this.A0p, i | 4);
        if (A1R == -5) {
            A1s(A1U.A00);
            return true;
        }
        if (A1R == -4 && this.A0p.A05()) {
            this.A0X = true;
            A11();
        }
        int result = A12[2].charAt(29);
        if (result == 102) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A12;
        strArr[4] = "I6wAGrX36WnyTLz4kIu2A0";
        strArr[3] = "sKJkcvNhIyFX1pRFROyyBnawIxNqa";
        return false;
    }

    private boolean A1D(long j) {
        int size = this.A0u.size();
        for (int i = 0; i < size; i++) {
            if (this.A0u.get(i).longValue() == j) {
                this.A0u.remove(i);
                return true;
            }
        }
        java.lang.String[] strArr = A12;
        java.lang.String str = strArr[4];
        java.lang.String str2 = strArr[3];
        int length = str.length();
        int size2 = str2.length();
        if (length == size2) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A12;
        strArr2[4] = "k0VQHwP22phbTrXBZc8FuM";
        strArr2[3] = "DsxaarEsX3gZUO5CYPDgS2koeov7n";
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x010c, code lost:
    
        if (r20.A0K != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010e, code lost:
    
        r20.A0K.position(r20.A0n.offset);
        r20.A0K.limit(r20.A0n.offset + r20.A0n.size);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0125, code lost:
    
        r20.A0c = A1D(r20.A0n.presentationTimeUs);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0137, code lost:
    
        if (r20.A0B != r20.A0n.presentationTimeUs) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0139, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013a, code lost:
    
        r20.A0Y = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0149, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0156, code lost:
    
        if (r20.A0K != null) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A1E(long j, long j2) throws com.facebook.ads.redexgen.core.AD {
        boolean z;
        boolean processedOutputBuffer;
        int A5u;
        if (!A1B()) {
            boolean z2 = this.A0P;
            java.lang.String[] strArr = A12;
            if (strArr[6].length() == strArr[5].length()) {
                java.lang.String[] strArr2 = A12;
                strArr2[4] = "3Zz5yYcdEnea2Q2Ufvkja4";
                strArr2[3] = "iabR8Vve1dDezsMpvwSmTE3MhP0dx";
                if (z2) {
                    boolean z3 = this.A0V;
                    java.lang.String[] strArr3 = A12;
                    if (strArr3[6].length() != strArr3[5].length()) {
                        throw new java.lang.RuntimeException();
                    }
                    A12[0] = "OUdi";
                    if (z3) {
                        try {
                            A5u = this.A0F.A5u(this.A0n);
                            if (A5u < 0) {
                                if (this.A0b) {
                                    this.A0b = false;
                                    com.facebook.ads.redexgen.core.B0 b0 = this.A0F;
                                    if (A12[2].charAt(29) == 'f') {
                                        b0.AHi(A5u, false);
                                        return true;
                                    }
                                    java.lang.String[] strArr4 = A12;
                                    strArr4[6] = "Sxw7BJ5DCdkMn";
                                    strArr4[5] = "uR5ffcKC2c0Qe";
                                    b0.AHi(A5u, false);
                                    return true;
                                }
                                if (this.A0n.size == 0 && (this.A0n.flags & 4) != 0) {
                                    A11();
                                    return false;
                                }
                                this.A06 = A5u;
                                java.nio.ByteBuffer A0z = A0z(A5u);
                                if (A12[2].charAt(29) != 'f') {
                                    A12[0] = "bTu1";
                                    this.A0K = A0z;
                                } else {
                                    A12[2] = "jn7zZa5Ao9aeuRKBiubAI8gr9vrzbXZe";
                                    this.A0K = A0z;
                                }
                            } else if (A5u == -2) {
                                A12();
                                java.lang.String[] strArr5 = A12;
                                java.lang.String str = strArr5[6];
                                java.lang.String str2 = strArr5[5];
                                int length = str.length();
                                int outputIndex = str2.length();
                                if (length == outputIndex) {
                                    java.lang.String[] strArr6 = A12;
                                    strArr6[7] = "7r6cHUpNxW9OyUOBJtqRlgz4yWKhxuS5";
                                    strArr6[1] = "dTVs3H4w0ZVIwZf9Hv7c5Sb2vArQM5gg";
                                    return true;
                                }
                            } else {
                                if (A5u == -3) {
                                    return true;
                                }
                                if (this.A0Q && (this.A0X || this.A04 == 2)) {
                                    A11();
                                }
                                return false;
                            }
                        } catch (java.lang.IllegalStateException unused) {
                            A11();
                            if (this.A0a) {
                                A1n();
                            }
                            return false;
                        }
                    }
                }
                A5u = this.A0F.A5u(this.A0n);
                if (A5u < 0) {
                }
            }
            throw new java.lang.RuntimeException();
        }
        if (this.A0P && this.A0V) {
            try {
                z = false;
            } catch (java.lang.IllegalStateException unused2) {
                z = false;
            }
            try {
                processedOutputBuffer = A23(j, j2, this.A0F, this.A0K, this.A06, this.A0n.flags, this.A0n.presentationTimeUs, this.A0c, this.A0Y);
            } catch (java.lang.IllegalStateException unused3) {
                A11();
                if (this.A0a) {
                    A1n();
                }
                return z;
            }
        } else {
            z = false;
            processedOutputBuffer = A23(j, j2, this.A0F, this.A0K, this.A06, this.A0n.flags, this.A0n.presentationTimeUs, this.A0c, this.A0Y);
        }
        if (processedOutputBuffer) {
            A1q(this.A0n.presentationTimeUs);
            boolean processedOutputBuffer2 = (this.A0n.flags & 4) != 0;
            A14();
            if (!processedOutputBuffer2) {
                return true;
            }
            A11();
        }
        return z;
    }

    private boolean A1F(android.media.MediaCrypto mediaCrypto, boolean z) throws com.facebook.ads.redexgen.core.BA {
        com.facebook.ads.redexgen.core.BA A00;
        if (this.A0L == null) {
            try {
                java.util.List<com.facebook.ads.redexgen.core.B3> A10 = A10(z);
                if (this.A0v) {
                    this.A0L = new java.util.ArrayDeque<>(A10);
                } else {
                    this.A0L = new java.util.ArrayDeque<>(java.util.Collections.singletonList(A10.get(0)));
                }
                this.A0H = null;
            } catch (com.facebook.ads.redexgen.core.BX e) {
                throw new com.facebook.ads.redexgen.core.BA(this.A0g, e, z, -49998);
            }
        }
        if (!this.A0i && A21()) {
            this.A0L.addFirst(com.facebook.ads.redexgen.core.B3.A02(A0x(799, 22, 19), this.A0g.A0W, this.A0g.A0W, null, false, true, false, false, false));
        }
        if (!this.A0L.isEmpty()) {
            com.facebook.ads.redexgen.core.B3 peekFirst = this.A0L.peekFirst();
            do {
                com.facebook.ads.redexgen.core.B3 peekFirst2 = this.A0L.peekFirst();
                if (!A25(peekFirst2)) {
                    return false;
                }
                try {
                    A17(peekFirst, peekFirst2, mediaCrypto);
                    return true;
                } catch (java.lang.Exception e2) {
                    com.facebook.ads.redexgen.core.AbstractC04284g.A0A(A0x(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 18, 67), A0x(156, 30, 18) + peekFirst2, e2);
                    this.A0L.removeFirst();
                    com.facebook.ads.redexgen.core.BA ba = new com.facebook.ads.redexgen.core.BA(this.A0g, e2, z, peekFirst2);
                    if (this.A0H == null) {
                        this.A0H = ba;
                    } else {
                        A00 = this.A0H.A00(ba);
                        this.A0H = A00;
                    }
                }
            } while (!this.A0L.isEmpty());
            throw this.A0H;
        }
        throw new com.facebook.ads.redexgen.core.BA(this.A0g, (java.lang.Throwable) null, z, -49999);
    }

    public static boolean A1G(com.facebook.ads.redexgen.core.C2196qI c2196qI) {
        return c2196qI.A07 == 0 || c2196qI.A07 == 2;
    }

    public static boolean A1H(com.facebook.ads.redexgen.core.B3 b3) {
        java.lang.String str = b3.A03;
        if (com.facebook.ads.redexgen.core.C5C.A02 <= 17) {
            java.lang.String name = A0x(566, 24, 127);
            if (!name.equals(str)) {
                java.lang.String name2 = A0x(419, 31, 56);
                if (name2.equals(str)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (A0x(450, 31, 59).equals(r6) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        if (A0x(481, 38, 125).equals(r6) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
    
        if (A0x(450, 31, 59).equals(r6) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        if (A0x(541, 25, 116).equals(r6) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x007d, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A1I(java.lang.String str) {
        if (com.facebook.ads.redexgen.core.C5C.A02 <= 23) {
            java.lang.String[] strArr = A12;
            if (strArr[4].length() == strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A12;
            strArr2[4] = "BtOe3nAvRfSweps9KMSbQL";
            strArr2[3] = "8BFXWDNhFQQqbiuKKB32KUMMZhTUo";
        }
        if (com.facebook.ads.redexgen.core.C5C.A02 <= 19) {
            if (A0x(787, 6, 102).equals(com.facebook.ads.redexgen.core.C5C.A03)) {
                java.lang.String[] strArr3 = A12;
                if (strArr3[6].length() == strArr3[5].length()) {
                    java.lang.String[] strArr4 = A12;
                    strArr4[7] = "lQUGM0gwxiouwODu2Sf00uvqO0zTfr3c";
                    strArr4[1] = "xcBcqPxRh43dKrs9lyzAmVul0JtIaCtf";
                }
            }
        }
        return false;
    }

    public static boolean A1J(java.lang.String str) {
        return com.facebook.ads.redexgen.core.C5C.A02 == 21 && A0x(519, 22, 41).equals(str);
    }

    public static boolean A1K(java.lang.String str) {
        if (com.facebook.ads.redexgen.core.C5C.A02 >= 18 && (com.facebook.ads.redexgen.core.C5C.A02 != 18 || (!A0x(382, 15, 68).equals(str) && !A0x(397, 22, 77).equals(str)))) {
            if (com.facebook.ads.redexgen.core.C5C.A02 == 19 && com.facebook.ads.redexgen.core.C5C.A06.startsWith(A0x(667, 7, 124))) {
                if (!A0x(238, 18, 34).equals(str)) {
                    if (A12[0].length() != 4) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr = A12;
                    strArr[6] = "NlNH7MPHVQXxq";
                    strArr[5] = "FDVIIX4T9j7Ji";
                    if (A0x(256, 25, 89).equals(str)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A1L(java.lang.String str, com.facebook.ads.redexgen.core.C2196qI c2196qI) {
        return com.facebook.ads.redexgen.core.C5C.A02 < 21 && c2196qI.A0X.isEmpty() && A0x(306, 25, 22).equals(str);
    }

    public static boolean A1M(java.lang.String str, com.facebook.ads.redexgen.core.C2196qI c2196qI) {
        return com.facebook.ads.redexgen.core.C5C.A02 <= 18 && c2196qI.A06 == 1 && A0x(281, 25, 33).equals(str);
    }

    private boolean A1N(boolean z) throws com.facebook.ads.redexgen.core.AD {
        if (this.A0D == null || (!z && this.A0x)) {
            return false;
        }
        int A9A = this.A0D.A9A();
        if (A9A != 1) {
            return A9A != 4;
        }
        com.facebook.ads.redexgen.core.C05609q c05609q = (com.facebook.ads.redexgen.core.C05609q) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A0D.A80());
        com.facebook.ads.redexgen.core.C05609q A80 = this.A0D.A80();
        com.facebook.ads.redexgen.core.C2196qI c2196qI = this.A0g;
        int drmSessionState = c05609q.A00;
        throw A1S(A80, c2196qI, drmSessionState);
    }

    @Override // com.facebook.ads.redexgen.core.AE
    public void A1X() {
    }

    @Override // com.facebook.ads.redexgen.core.AE
    public void A1Y() {
    }

    @Override // com.facebook.ads.redexgen.core.AE
    public void A1Z() {
        this.A0g = null;
        A18(com.facebook.ads.redexgen.core.BC.A04);
        this.A0t.clear();
        this.A0L = null;
        try {
            A1n();
            try {
                if (this.A0D != null) {
                    this.A0D.AHc(null);
                }
                try {
                    if (this.A0E != null && this.A0E != this.A0D) {
                        this.A0E.AHc(null);
                    }
                } finally {
                }
            } catch (java.lang.Throwable th) {
                try {
                    if (this.A0E != null && this.A0E != this.A0D) {
                        this.A0E.AHc(null);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (java.lang.Throwable th2) {
            try {
                if (this.A0D != null) {
                    this.A0D.AHc(null);
                }
                try {
                    if (this.A0E != null && this.A0E != this.A0D) {
                        this.A0E.AHc(null);
                    }
                    throw th2;
                } finally {
                }
            } catch (java.lang.Throwable th3) {
                try {
                    if (this.A0E != null && this.A0E != this.A0D) {
                        this.A0E.AHc(null);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AE
    public void A1a(long j, boolean z) throws com.facebook.ads.redexgen.core.AD {
        this.A0X = false;
        this.A0a = false;
        if (this.A0F != null) {
            A1m();
        }
        this.A0I.A03.A01();
        this.A0t.clear();
    }

    @Override // com.facebook.ads.redexgen.core.AE
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("D36797879: Adding implementation for calculating avg render time")
    public void A1b(boolean z, boolean z2) throws com.facebook.ads.redexgen.core.AD {
        this.A0h = new com.facebook.ads.redexgen.core.C6I();
        this.A0f = 0L;
    }

    @Override // com.facebook.ads.redexgen.core.AE
    public void A1c(com.facebook.ads.redexgen.core.C2196qI[] c2196qIArr, long j, long j2) throws com.facebook.ads.redexgen.core.AD {
    }

    public final float A1f() {
        return this.A00;
    }

    public final long A1i() {
        return this.A0I.A02;
    }

    public final com.facebook.ads.redexgen.core.B0 A1j() {
        return this.A0F;
    }

    public final com.facebook.ads.redexgen.core.B3 A1k() {
        return this.A0G;
    }

    public void A1m() throws com.facebook.ads.redexgen.core.AD {
        this.A07 = -9223372036854775807L;
        A13();
        A14();
        this.A0d = true;
        this.A0e = false;
        this.A0c = false;
        this.A0u.clear();
        this.A0M = false;
        this.A0b = false;
        this.A0Y = false;
        this.A0B = -9223372036854775807L;
        if (!this.A0R) {
            boolean z = this.A0O;
            java.lang.String[] strArr = A12;
            if (strArr[6].length() != strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            A12[0] = "8Nzt";
            if ((!z || !this.A0V) && !A20()) {
                if (this.A04 != 0) {
                    A1n();
                    A1p();
                } else {
                    this.A0F.flush();
                    this.A0U = false;
                }
                if (!this.A0W && this.A0g != null) {
                    this.A03 = 1;
                    return;
                }
            }
        }
        A1n();
        A1p();
        if (!this.A0W) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1n() {
        this.A07 = -9223372036854775807L;
        this.A09 = -9223372036854775807L;
        this.A08 = -9223372036854775807L;
        A13();
        A14();
        this.A0C = null;
        this.A0T = false;
        this.A0e = false;
        this.A0c = false;
        this.A0u.clear();
        this.A0G = null;
        this.A0W = false;
        this.A0U = false;
        this.A0N = false;
        this.A0R = false;
        this.A02 = 0;
        this.A0Q = false;
        this.A0O = false;
        this.A0S = false;
        this.A0M = false;
        this.A0b = false;
        this.A0V = false;
        this.A03 = 0;
        this.A04 = 0;
        if (this.A0F != null) {
            this.A0h.A03++;
            try {
                com.facebook.ads.redexgen.core.B7.A02().A0L(A22(), this.A0z, this.A0y.getA00(), com.facebook.ads.redexgen.core.EnumC1789jL.A05, this.A0J, this.A0F);
                this.A0F = null;
                com.facebook.ads.redexgen.core.InterfaceC05629s interfaceC05629s = this.A0D;
                java.lang.String[] strArr = A12;
                if (strArr[6].length() == strArr[5].length()) {
                    java.lang.String[] strArr2 = A12;
                    strArr2[7] = "JSCNcek9dAkyOPO1KkbpJsRj9JD6rmzz";
                    strArr2[1] = "RONQ7IAwO8Bcbv1Krrdz5fvlVLwlovmm";
                    if (interfaceC05629s != null && this.A0E != this.A0D) {
                        try {
                            this.A0D.AHc(null);
                            return;
                        } finally {
                        }
                    }
                    return;
                }
            } catch (java.lang.Throwable th) {
                this.A0F = null;
                java.lang.String[] strArr3 = A12;
                if (strArr3[7].charAt(2) != strArr3[1].charAt(2)) {
                    A12[2] = "iwo0woIVvHFpnZaxaWQfv32BCS9fYlqT";
                    if (this.A0D != null && this.A0E != this.A0D) {
                        try {
                            this.A0D.AHc(null);
                        } finally {
                        }
                    }
                    throw th;
                }
            }
            throw new java.lang.RuntimeException();
        }
    }

    public void A1o() throws com.facebook.ads.redexgen.core.AD {
    }

    public final void A1p() throws com.facebook.ads.redexgen.core.AD {
        long j;
        if (this.A0F != null || this.A0g == null) {
            return;
        }
        this.A0D = this.A0E;
        if (this.A0D != null) {
            this.A0D.A7V();
            if (0 == 0) {
                if (this.A0D.A80() == null) {
                    return;
                }
            } else {
                throw new java.lang.NullPointerException(A0x(759, 21, 39));
            }
        }
        try {
            if (!A1F(null, false)) {
                return;
            }
            java.lang.String str = this.A0G.A03;
            this.A02 = A0w(str);
            this.A0N = A1L(str, this.A0g);
            this.A0R = A1K(str);
            this.A0Q = A1H(this.A0G);
            this.A0O = A1I(str);
            this.A0P = A1J(str);
            this.A0S = A1M(str, this.A0g);
            if (A9A() == 2) {
                j = android.os.SystemClock.elapsedRealtime() + 1000;
            } else {
                j = -9223372036854775807L;
            }
            this.A07 = j;
            A13();
            A14();
            this.A09 = -9223372036854775807L;
            this.A0d = true;
            this.A0h.A02++;
        } catch (com.facebook.ads.redexgen.core.BA e) {
            java.lang.String mimeType = A12[0];
            if (mimeType.length() != 4) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A12;
            strArr[4] = "htoDBH0u2SWwWLv1LDVpoG";
            strArr[3] = "VZtqtU1mGbN1CVtxZAbUMauSXb3bc";
            if (this.A0m > 0 && (this.A09 == -9223372036854775807L || java.lang.System.currentTimeMillis() - this.A09 <= this.A0m)) {
                if (this.A09 == -9223372036854775807L) {
                    java.lang.String A0x = A0x(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 18, 67);
                    java.lang.String mimeType2 = A0x(59, 36, 3);
                    com.facebook.ads.redexgen.core.AbstractC04284g.A07(A0x, mimeType2);
                    this.A09 = java.lang.System.currentTimeMillis();
                }
                if (this.A0L != null && this.A0L.isEmpty()) {
                    this.A0L = null;
                    return;
                }
                return;
            }
            throw A1S(e, this.A0g, 4001);
        }
    }

    public void A1q(long j) {
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Needed for sr video effects")
    public void A1r(com.facebook.ads.redexgen.core.C2196qI c2196qI) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
    
        if (r6 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
    
        r2 = r8.A0F;
        r1 = r8.A0G;
        r0 = r8.A0g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
    
        switch(A1g(r2, r1, r4, r0)) {
            case 0: goto L44;
            case 1: goto L43;
            case 2: goto L26;
            case 3: goto L32;
            default: goto L26;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
    
        throw new java.lang.IllegalStateException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b0, code lost:
    
        r7 = true;
        r8.A0W = true;
        r8.A03 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b8, code lost:
    
        if (r8.A02 == 2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bc, code lost:
    
        if (r8.A02 != 1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00be, code lost:
    
        r0 = r8.A0g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c4, code lost:
    
        if (r0.A0L != r4.A0L) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c6, code lost:
    
        r0 = r8.A0g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cc, code lost:
    
        if (r0.A0A != r4.A0A) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d2, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cf, code lost:
    
        r8.A0M = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d4, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:
    
        if (r6 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A1s(com.facebook.ads.redexgen.core.C2196qI c2196qI) throws com.facebook.ads.redexgen.core.AD {
        com.facebook.ads.androidx.media3.common.DrmInitData drmInitData;
        A1r(c2196qI);
        com.facebook.ads.redexgen.core.C2196qI c2196qI2 = this.A0g;
        this.A0g = c2196qI;
        com.facebook.ads.redexgen.core.C2196qI oldFormat = this.A0g;
        com.facebook.ads.androidx.media3.common.DrmInitData drmInitData2 = oldFormat.A0O;
        if (c2196qI2 == null) {
            drmInitData = null;
        } else {
            drmInitData = c2196qI2.A0O;
        }
        if (!com.facebook.ads.redexgen.core.C5C.A1E(drmInitData2, drmInitData)) {
            com.facebook.ads.redexgen.core.C2196qI oldFormat2 = this.A0g;
            if (oldFormat2.A0O != null) {
                if (this.A0r != null) {
                    com.facebook.ads.redexgen.core.A6 a6 = this.A0r;
                    com.facebook.ads.redexgen.core.C2196qI oldFormat3 = this.A0g;
                    this.A0E = a6.A3C(null, oldFormat3);
                    java.lang.String[] strArr = A12;
                    if (strArr[7].charAt(2) != strArr[1].charAt(2)) {
                        java.lang.String[] strArr2 = A12;
                        strArr2[4] = "XpQaMzaYCeQHSX1wHIt01O";
                        strArr2[3] = "hhT7VitQ1539e1hJWaIaN1DiIME5w";
                        if (this.A0E == this.A0D) {
                            com.facebook.ads.redexgen.core.InterfaceC05629s interfaceC05629s = this.A0E;
                            java.lang.String[] strArr3 = A12;
                            if (strArr3[7].charAt(2) != strArr3[1].charAt(2)) {
                                A12[2] = "mOmb8wihr9xQYP3CL5DV18o0OoEn6eG9";
                                interfaceC05629s.AHc(null);
                            }
                        }
                    }
                    throw new java.lang.RuntimeException();
                }
                throw A1S(new com.facebook.ads.redexgen.core.AnonymousClass70(A0x(186, 34, 1)), this.A0g, 4005);
            }
            this.A0E = null;
        }
        boolean z = false;
        if (this.A0E == this.A0D) {
            com.facebook.ads.redexgen.core.B0 b0 = this.A0F;
            java.lang.String[] strArr4 = A12;
            if (strArr4[4].length() != strArr4[3].length()) {
                A12[2] = "hgu32AMElELcnmKjNvgDCLPWqu1wVZzY";
            }
        }
        if (!z) {
            this.A0L = null;
            if (this.A0U) {
                this.A04 = 1;
                return;
            }
            A1n();
            java.lang.String[] strArr5 = A12;
            if (strArr5[4].length() == strArr5[3].length()) {
                java.lang.String[] strArr6 = A12;
                strArr6[4] = "dwUbabJ3IwMscliKIocfEp";
                strArr6[3] = "JfvGwuyJKwyqA9Lq7c7l5Q2QpU3EJ";
                A1p();
                return;
            }
            java.lang.String[] strArr7 = A12;
            strArr7[7] = "gISXyGsiclUqTl6XD9kKbrjQIkSYs6OI";
            strArr7[1] = "jfDUbzltiW2K1dT11OQ1e62SyOqvP2px";
            A1p();
        }
    }

    public void A1t(com.facebook.ads.redexgen.core.C2196qI c2196qI) throws com.facebook.ads.redexgen.core.AD {
    }

    public void A1z(java.lang.String str, com.facebook.ads.redexgen.core.C2196qI c2196qI) throws com.facebook.ads.redexgen.core.AD {
        A1t(c2196qI);
    }

    public boolean A20() {
        return false;
    }

    public final boolean A21() {
        return A24(this.A0g);
    }

    public final boolean A24(com.facebook.ads.redexgen.core.C2196qI c2196qI) {
        if (c2196qI == null || !this.A0k || !A0x(838, 10, 89).equalsIgnoreCase(c2196qI.A0W)) {
            return false;
        }
        return true;
    }

    public boolean A25(com.facebook.ads.redexgen.core.B3 b3) {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2105oo
    public boolean AAP() {
        return this.A0a;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2105oo
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("D18870411: Adding start stall debug reason")
    public boolean AAe() {
        if (this.A0g == null) {
            super.A0B = com.facebook.ads.redexgen.core.EnumC1762ir.A07;
        } else if (this.A0e) {
            super.A0B = com.facebook.ads.redexgen.core.EnumC1762ir.A0A;
        } else if (!A1d() && !A1B()) {
            super.A0B = com.facebook.ads.redexgen.core.EnumC1762ir.A06;
        }
        if (this.A0g != null) {
            boolean z = this.A0e;
            if (A12[2].charAt(29) == 'f') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A12;
            strArr[7] = "joohYCoWTVCMZ7ZK6VknoEQ3356Yke9R";
            strArr[1] = "gcfLSJm2tOx4UzvBIoCvVtFxExIT9beD";
            if (!z && (A1d() || A1B() || (this.A07 != -9223372036854775807L && android.os.SystemClock.elapsedRealtime() < this.A07))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2105oo
    public void AIX(long j, long j2) throws com.facebook.ads.redexgen.core.AD {
        if (this.A0a) {
            A1o();
            return;
        }
        if (this.A0g == null && !A1C(2)) {
            return;
        }
        A1p();
        if (this.A0F != null) {
            try {
                try {
                    com.facebook.ads.redexgen.core.AnonymousClass54.A02(A0x(727, 12, 16));
                    while (A1E(j, j2)) {
                    }
                    while (A1A()) {
                    }
                    this.A08 = -9223372036854775807L;
                } catch (java.lang.IllegalStateException e) {
                    if (!A19()) {
                        throw A1S(e, this.A0g, 4003);
                    }
                }
            } finally {
                com.facebook.ads.redexgen.core.AnonymousClass54.A00();
            }
        } else {
            this.A0h.A0A += A1Q(j);
            A1C(1);
        }
        this.A0h.A02();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05157p
    public final int AKM(com.facebook.ads.redexgen.core.C2196qI c2196qI) throws com.facebook.ads.redexgen.core.AD {
        try {
            return A1h(this.A0s, this.A0r, c2196qI);
        } catch (com.facebook.ads.redexgen.core.BX e) {
            throw A1S(e, c2196qI, 4002);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AE, com.facebook.ads.redexgen.core.InterfaceC05157p
    public final int AKO() {
        return 8;
    }
}
