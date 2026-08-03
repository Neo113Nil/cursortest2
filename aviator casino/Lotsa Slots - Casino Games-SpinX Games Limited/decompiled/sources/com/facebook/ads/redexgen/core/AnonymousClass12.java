package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.12, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass12 extends com.facebook.ads.redexgen.core.AbstractC03541g implements com.facebook.ads.redexgen.core.AnonymousClass78 {
    public static byte[] A0J;
    public static java.lang.String[] A0K = {"77C8vP87Fd7b4BP9SQRJBzWPVk4TewQg", "oQ2qsKrmaNuyaLFB2ph9zkmGtpzAonXt", "MDqZPLCoXCzEQwxPxYtAKuxbh2tAcx1k", "aWPkhw6gWy0BTxYknUchyjQmABWF", "ais5GYfL5LR1KEYd6HRi1BBd2kmjCeGs", "pdewp8MC9mt7vaqV0Zkeu3U5mw150Zm9", "qv2CVs2gAdpJ8ZKBYAbfHfBiBdoePlCI", "lcPZgHPLbCISPmjsMn5qIGSBsvlpomMq"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public android.media.MediaFormat A06;
    public com.facebook.ads.redexgen.core.C2196qI A07;
    public com.facebook.ads.redexgen.core.InterfaceC05077h A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final android.content.Context A0E;
    public final com.facebook.ads.redexgen.core.C05398o A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final com.facebook.ads.redexgen.core.InterfaceC05478z A0I;

    public static java.lang.String A07(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0J, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            if (A0K[3].length() != 28) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0K;
            strArr[4] = "GcWDzLLiTAl0tD46XyRRBcNodd92JrSP";
            strArr[0] = "GhxldHXMoVDog6OAV5RKTarDpyl0kviC";
            copyOfRange[i4] = (byte) ((b - i3) - 65);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A09() {
        A0J = new byte[]{-103, -79, -80, -75, -83, -113, -69, -80, -79, -81, -115, -63, -80, -75, -69, -98, -79, -70, -80, -79, -66, -79, -66, -77, -79, -68, -110, -73, -87, -89, -110, -59, -59, -57, -110, -56, -55, -57, -36, -38, -27, -69, -12, -4, -4, -12, -7, -14, -69, -1, -18, 4, -69, -15, -14, -16, -4, -15, -14, -1, -17, -17, -15, -69, -14, 0, -15, -69, -13, -12, -12, -13, -15, 2, -69, 2, 7, -2, -13, -51, -51, -49, -103, -32, -51, -34, -45, -47, -32, -103, -34, -47, -46, -103, -40, -47, -30, -47, -40, 7, com.google.common.base.Ascii.ESC, 10, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.NAK, -43, com.google.common.base.Ascii.CAN, 7, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.US, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.GS, -34, com.google.common.base.Ascii.DC4, 32, 38, com.google.common.base.Ascii.US, 37, -85, -88, -75, -78, -81, -73, -88, -31, -34, -21, -24, -22, -27, -19, -34, -54, -66, -43, -118, -58, -53, -51, -46, -47, -118, -48, -58, -41, -62, -39, -43, -39, -47, -68, -65, -125, -80, 125, -125, Byte.MAX_VALUE, 125, -125, -127, -64, -62, -71, -65, -62, -71, -60, -55, -65, -83, -71, -68, -72, -79, 121, -66, -83, -64, -79, -27, -45, -33, -27, -25, -32, -39, -47, -68, -55, -58, -67, -61, -53, -68};
    }

    static {
        A09();
    }

    public AnonymousClass12(android.content.Context context, com.facebook.ads.redexgen.core.C1792jQ c1792jQ, com.facebook.ads.redexgen.core.MediaCodecRendererMetaParameters mediaCodecRendererMetaParameters, com.facebook.ads.redexgen.core.BT bt, com.facebook.ads.redexgen.core.A6 a6, boolean z, boolean z2, boolean z3, android.os.Handler handler, com.facebook.ads.redexgen.core.InterfaceC05408p interfaceC05408p, com.facebook.ads.redexgen.core.C8R c8r, com.facebook.ads.redexgen.core.InterfaceC04063k... interfaceC04063kArr) {
        this(context, c1792jQ, mediaCodecRendererMetaParameters, bt, a6, z, z2, z3, handler, interfaceC05408p, new com.facebook.ads.redexgen.core.C2077oM(c8r, interfaceC04063kArr));
    }

    public AnonymousClass12(android.content.Context context, com.facebook.ads.redexgen.core.C1792jQ c1792jQ, com.facebook.ads.redexgen.core.MediaCodecRendererMetaParameters mediaCodecRendererMetaParameters, com.facebook.ads.redexgen.core.BT bt, com.facebook.ads.redexgen.core.A6 a6, boolean z, boolean z2, boolean z3, android.os.Handler handler, com.facebook.ads.redexgen.core.InterfaceC05408p interfaceC05408p, com.facebook.ads.redexgen.core.InterfaceC05478z interfaceC05478z) {
        super(1, c1792jQ, mediaCodecRendererMetaParameters, bt, a6, z, false, 0, 0);
        this.A01 = 0;
        this.A02 = 0;
        this.A05 = 0L;
        this.A0E = context.getApplicationContext();
        this.A0I = interfaceC05478z;
        this.A0G = z2;
        this.A0H = z3;
        this.A0F = new com.facebook.ads.redexgen.core.C05398o(handler, interfaceC05408p);
        interfaceC05478z.AJV(new com.facebook.ads.redexgen.core.C2075oK(this));
        interfaceC05478z.AJQ(c1792jQ.A0D);
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Added in D36293647 for DRC")
    private int A00() {
        int i = this.A0z.A09;
        if (this.A0z.A0F) {
            int i2 = this.A0z.A03;
            int i3 = this.A0z.A04;
            int xHEAACEffectType = this.A0z.A05;
            return com.facebook.ads.redexgen.core.ContextAwareXHEAACDRCTypeUtil.A00(i2, i3, xHEAACEffectType);
        }
        return i;
    }

    public static int A01(com.facebook.ads.redexgen.core.C2196qI c2196qI) {
        if (A07(99, 9, 101).equals(c2196qI.A0W)) {
            return c2196qI.A0C;
        }
        return 2;
    }

    private int A02(com.facebook.ads.redexgen.core.B3 b3, com.facebook.ads.redexgen.core.C2196qI c2196qI) {
        if (A07(38, 22, 76).equals(b3.A03) && com.facebook.ads.redexgen.core.C5C.A02 < 24) {
            int i = com.facebook.ads.redexgen.core.C5C.A02;
            java.lang.String[] strArr = A0K;
            if (strArr[2].charAt(3) != strArr[7].charAt(3)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0K;
            strArr2[2] = "s8yZpZp8nIrL7EQY3mPJ1kqCekDwsY6i";
            strArr2[7] = "yd2Z0BEEocl53iuZqAxtcOKT0DXRknsH";
            if (i != 23 || !com.facebook.ads.redexgen.core.C5C.A18(this.A0E)) {
                java.lang.String[] strArr3 = A0K;
                if (strArr3[4].charAt(18) != strArr3[0].charAt(18)) {
                    throw new java.lang.RuntimeException();
                }
                A0K[3] = "9QHOUbokymVnxuZO6z7rLJCC2XoG";
                return -1;
            }
        }
        int i2 = c2196qI.A0B;
        java.lang.String[] strArr4 = A0K;
        if (strArr4[2].charAt(3) != strArr4[7].charAt(3)) {
            return i2;
        }
        java.lang.String[] strArr5 = A0K;
        strArr5[2] = "bWiZaXhFQHkoAXZnJ4ncaGOlncM6vz1V";
        strArr5[7] = "kg6ZwO8ePPrkJPsuoAADu0ZS0U6OWo96";
        return i2;
    }

    private final int A03(com.facebook.ads.redexgen.core.B3 b3, com.facebook.ads.redexgen.core.C2196qI c2196qI, com.facebook.ads.redexgen.core.C2196qI[] c2196qIArr) {
        int maxInputSize = A02(b3, c2196qI);
        return maxInputSize;
    }

    private final android.media.MediaFormat A04(com.facebook.ads.redexgen.core.C2196qI c2196qI, java.lang.String str, int i) {
        android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
        mediaFormat.setString(A07(androidx.compose.material.TextFieldImplKt.AnimationDuration, 4, 43), str);
        mediaFormat.setInteger(A07(108, 13, 112), c2196qI.A06);
        mediaFormat.setInteger(A07(172, 11, 11), c2196qI.A0G);
        com.facebook.ads.redexgen.core.AbstractC04304i.A06(mediaFormat, c2196qI.A0X);
        com.facebook.ads.redexgen.core.AbstractC04304i.A04(mediaFormat, A07(136, 14, 28), i);
        if (com.facebook.ads.redexgen.core.C5C.A02 >= 23) {
            java.lang.String A07 = A07(164, 8, 15);
            java.lang.String[] strArr = A0K;
            if (strArr[4].charAt(18) != strArr[0].charAt(18)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0K;
            strArr2[1] = "w8gjBPJzE632nZpBrlzwe1tLIvq8CsOY";
            strArr2[6] = "ag3DPBWcd6fSOrmBwunkDpt77Nl4HY4l";
            mediaFormat.setInteger(A07, 0);
        }
        if (c2196qI.A0R != null && c2196qI.A0R.equals(A07(154, 10, 14)) && this.A0z.A0G) {
            mediaFormat.setInteger(A07(60, 19, 77), A00());
            mediaFormat.setInteger(A07(79, 20, 43), this.A0z.A0A);
        }
        return mediaFormat;
    }

    public static /* synthetic */ com.facebook.ads.redexgen.core.InterfaceC05077h A05(com.facebook.ads.redexgen.core.AnonymousClass12 anonymousClass12) {
        return null;
    }

    private void A08() {
        long A7f = this.A0I.A7f(AAP());
        if (A7f != Long.MIN_VALUE) {
            if (!this.A0A) {
                long j = this.A04;
                java.lang.String[] strArr = A0K;
                if (strArr[2].charAt(3) != strArr[7].charAt(3)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A0K;
                strArr2[4] = "nIJcPeFAtvuDBzBlXMRw0HpU2OMpTIMr";
                strArr2[0] = "dapTBdH8hqStbvnLCARUyCc0T0ChI3T8";
                A7f = java.lang.Math.max(j, A7f);
            }
            this.A04 = A7f;
            this.A0A = false;
        }
    }

    private boolean A0A(com.facebook.ads.redexgen.core.C2196qI c2196qI) {
        java.lang.String str = c2196qI.A0W;
        java.lang.String mimeType = A07(99, 9, 101);
        if (!mimeType.equals(str)) {
            return this.A0I.AKN(c2196qI);
        }
        java.lang.String[] strArr = A0K;
        if (strArr[2].charAt(3) != strArr[7].charAt(3)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0K;
        strArr2[4] = "mDVewdn3RvQYeqn2qaR7zJPFTyK9zqzw";
        strArr2[0] = "a0e3mP5dmYOn07QMhHRhkP7lbfukdIg9";
        return false;
    }

    public static boolean A0B(java.lang.String str) {
        if (com.facebook.ads.redexgen.core.C5C.A02 < 24 && A07(23, 15, 35).equals(str)) {
            if (A07(183, 7, 49).equals(com.facebook.ads.redexgen.core.C5C.A05) && (com.facebook.ads.redexgen.core.C5C.A03.startsWith(A07(com.facebook.internal.FacebookRequestErrorClassification.EC_INVALID_TOKEN, 8, 22)) || com.facebook.ads.redexgen.core.C5C.A03.startsWith(A07(121, 7, 2)) || com.facebook.ads.redexgen.core.C5C.A03.startsWith(A07(128, 8, 56)))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03541g, com.facebook.ads.redexgen.core.AE
    public final void A1X() {
        super.A1X();
        this.A0I.AH0();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03541g, com.facebook.ads.redexgen.core.AE
    public final void A1Y() {
        A08();
        this.A0I.pause();
        super.A1Y();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03541g, com.facebook.ads.redexgen.core.AE
    public final void A1Z() {
        try {
            this.A0I.flush();
            try {
                super.A1Z();
            } finally {
            }
        } catch (java.lang.Throwable th) {
            try {
                super.A1Z();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03541g, com.facebook.ads.redexgen.core.AE
    public final void A1a(long j, boolean z) throws com.facebook.ads.redexgen.core.AD {
        super.A1a(j, z);
        if (this.A0C) {
            this.A0I.A6T();
        } else {
            this.A0I.flush();
        }
        this.A04 = j;
        this.A09 = true;
        this.A0A = true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03541g, com.facebook.ads.redexgen.core.AE
    public final void A1b(boolean z, boolean z2) throws com.facebook.ads.redexgen.core.AD {
        super.A1b(z, z2);
        this.A0F.A08(this.A0h);
        if (A1V().A00) {
            this.A0I.A6M();
        } else {
            this.A0I.A5z();
        }
        this.A0I.AJg(A1W());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03541g
    public final int A1g(com.facebook.ads.redexgen.core.B0 b0, com.facebook.ads.redexgen.core.B3 b3, com.facebook.ads.redexgen.core.C2196qI c2196qI, com.facebook.ads.redexgen.core.C2196qI c2196qI2) {
        if (this.A0z.A0O && A02(b3, c2196qI2) <= this.A00 && b3.A0U(c2196qI, c2196qI2, true) && c2196qI.A08 == 0 && c2196qI.A09 == 0 && c2196qI2.A08 == 0 && c2196qI2.A09 == 0) {
            return 1;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r2.AKP(r1, r12.A0C) != false) goto L21;
     */
    @Override // com.facebook.ads.redexgen.core.AbstractC03541g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int A1h(com.facebook.ads.redexgen.core.BT bt, com.facebook.ads.redexgen.core.A6 a6, com.facebook.ads.redexgen.core.C2196qI c2196qI) throws com.facebook.ads.redexgen.core.BX {
        int i;
        java.lang.String str = c2196qI.A0W;
        int adaptiveSupport = 0;
        if (!com.facebook.ads.redexgen.core.C3J.A0C(str)) {
            return 0;
        }
        int i2 = com.facebook.ads.redexgen.core.C5C.A02 >= 21 ? 32 : 0;
        boolean A1G = com.facebook.ads.redexgen.core.AbstractC03541g.A1G(c2196qI);
        int i3 = 4;
        if (A1G && A0A(c2196qI) && com.facebook.ads.redexgen.core.C0588Ba.A0I() != null) {
            return i2 | 8 | 4;
        }
        java.lang.String mimeType = A07(99, 9, 101);
        if (mimeType.equals(str)) {
            com.facebook.ads.redexgen.core.InterfaceC05478z interfaceC05478z = this.A0I;
            int tunnelingSupport = c2196qI.A06;
        }
        if (this.A0I.AKP(c2196qI.A06, 2)) {
            java.util.List<com.facebook.ads.redexgen.core.B3> A1l = A1l(bt, c2196qI, false);
            if (A1l.isEmpty()) {
                return com.facebook.ads.redexgen.core.AbstractC05087i.A00(1);
            }
            if (!A1G) {
                return com.facebook.ads.redexgen.core.AbstractC05087i.A00(2);
            }
            com.facebook.ads.redexgen.core.B3 b3 = A1l.get(0);
            int tunnelingSupport2 = A0K[5].charAt(0);
            if (tunnelingSupport2 != 112) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0K;
            strArr[4] = "n12bmxDOOVBzqYYOQBRjqp0moJyAYtSu";
            strArr[0] = "BaglFChNOdaklTSyUQRitIBwXJJTR14H";
            com.facebook.ads.redexgen.core.B3 b32 = b3;
            if (com.facebook.ads.redexgen.core.C5C.A02 < 21 || ((c2196qI.A0G == -1 || b32.A0Q(c2196qI.A0G)) && (c2196qI.A06 == -1 || b32.A0P(c2196qI.A06)))) {
                adaptiveSupport = 1;
            }
            if (adaptiveSupport != 0 && b32.A0T(c2196qI)) {
                i = 16;
            } else {
                i = 8;
            }
            if (adaptiveSupport == 0) {
                i3 = 3;
            }
            return i | i2 | i3;
        }
        return 1;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03541g
    public final java.util.List<com.facebook.ads.redexgen.core.B3> A1l(com.facebook.ads.redexgen.core.BT bt, com.facebook.ads.redexgen.core.C2196qI c2196qI, boolean z) throws com.facebook.ads.redexgen.core.BX {
        com.facebook.ads.redexgen.core.B3 A0I;
        java.lang.String mimeType = c2196qI.A0W;
        if (mimeType == null) {
            return java.util.Collections.emptyList();
        }
        if (A0A(c2196qI) && (A0I = com.facebook.ads.redexgen.core.C0588Ba.A0I()) != null) {
            java.util.List<com.facebook.ads.redexgen.core.B3> singletonList = java.util.Collections.singletonList(A0I);
            java.lang.String[] strArr = A0K;
            if (strArr[1].charAt(15) != strArr[6].charAt(15)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0K;
            strArr2[4] = "VH1rG9jH3WXhHTxnLXRxhYBKNNIMNlpD";
            strArr2[0] = "4dJInhYjvnfEcXSyIbRNEiIfORerumv3";
            return singletonList;
        }
        return java.util.Collections.unmodifiableList(bt.A7o(c2196qI.A0W, z, false));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03541g
    public final void A1o() throws com.facebook.ads.redexgen.core.AD {
        try {
            this.A0I.AH2();
        } catch (com.facebook.ads.redexgen.core.C05468y e) {
            throw A1T(e, e.A01, e.A02, 5002);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03541g
    public final void A1s(com.facebook.ads.redexgen.core.C2196qI c2196qI) throws com.facebook.ads.redexgen.core.AD {
        super.A1s(c2196qI);
        this.A07 = c2196qI;
        this.A0F.A05(this.A07, null);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03541g
    public final void A1u(com.facebook.ads.redexgen.core.C2117p0 c2117p0) {
        if (this.A09 && !c2117p0.A04()) {
            if (java.lang.Math.abs(c2117p0.A01 - this.A04) > 500000) {
                this.A04 = c2117p0.A01;
            }
            this.A09 = false;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:21:0x0099 */
    @Override // com.facebook.ads.redexgen.core.AbstractC03541g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A1v(com.facebook.ads.redexgen.core.B0 b0, android.media.MediaFormat mediaFormat) throws com.facebook.ads.redexgen.core.AD {
        int sampleRate;
        android.media.MediaFormat mediaFormat2;
        int[] channelMap;
        if (this.A06 != null) {
            sampleRate = com.facebook.ads.redexgen.core.C3J.A00(this.A06.getString(A07(androidx.compose.material.TextFieldImplKt.AnimationDuration, 4, 43)));
            mediaFormat2 = this.A06;
        } else {
            sampleRate = A01(this.A07);
            mediaFormat2 = mediaFormat;
        }
        java.lang.String A07 = A07(108, 13, 112);
        int integer = mediaFormat2.getInteger(A07);
        java.lang.String A072 = A07(172, 11, 11);
        if (A0K[5].charAt(0) != 'p') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0K;
        strArr[1] = "oVYorWwiJ9QuTT6BmhgOhsdn4ih9katO";
        strArr[6] = "s4BjQ2RFQmOrQGZBZgzfkwBc6WQlVCBr";
        int encoding = mediaFormat2.getInteger(A072);
        this.A03 = encoding * integer;
        try {
            if (this.A0B) {
                java.lang.String[] strArr2 = A0K;
                java.lang.String str = strArr2[1];
                java.lang.String str2 = strArr2[6];
                int charAt = str.charAt(15);
                int encoding2 = str2.charAt(15);
                if (charAt != encoding2) {
                    throw new java.lang.RuntimeException();
                }
                A0K[5] = "pG08ZDLF1Nwa7YWNReZn10nEeTPXXDD5";
                if (integer == 6) {
                    int encoding3 = this.A07.A06;
                    if (encoding3 < 6) {
                        int encoding4 = this.A07.A06;
                        channelMap = new int[encoding4];
                        for (int i = 0; i < encoding; i++) {
                            channelMap[i] = i;
                        }
                        com.facebook.ads.redexgen.core.C03872p A0i = new com.facebook.ads.redexgen.core.C03872p().A11(A07(99, 9, 101)).A0i(sampleRate);
                        int encoding5 = mediaFormat.getInteger(A07);
                        com.facebook.ads.redexgen.core.C03872p A0b = A0i.A0b(encoding5);
                        int encoding6 = mediaFormat.getInteger(A072);
                        com.facebook.ads.redexgen.core.C2196qI audioSinkInputFormat = A0b.A0m(encoding6).A14();
                        this.A0I.A59(audioSinkInputFormat, 0, channelMap);
                        return;
                    }
                }
            }
            this.A0I.A59(audioSinkInputFormat, 0, channelMap);
            return;
        } catch (com.facebook.ads.redexgen.core.C05428s e) {
            throw A1S(e, e.A00, 5001);
        }
        channelMap = null;
        com.facebook.ads.redexgen.core.C03872p A0i2 = new com.facebook.ads.redexgen.core.C03872p().A11(A07(99, 9, 101)).A0i(sampleRate);
        int encoding52 = mediaFormat.getInteger(A07);
        com.facebook.ads.redexgen.core.C03872p A0b2 = A0i2.A0b(encoding52);
        int encoding62 = mediaFormat.getInteger(A072);
        com.facebook.ads.redexgen.core.C2196qI audioSinkInputFormat2 = A0b2.A0m(encoding62).A14();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03541g
    public final void A1w(com.facebook.ads.redexgen.core.B3 b3, com.facebook.ads.redexgen.core.B0 b0, com.facebook.ads.redexgen.core.C2196qI c2196qI, android.media.MediaCrypto mediaCrypto) {
        this.A00 = A03(b3, c2196qI, A1e());
        this.A0B = A0B(b3.A03);
        java.lang.String str = b3.A02;
        java.lang.String A07 = A07(99, 9, 101);
        this.A0D = A07.equals(str) && !A07.equals(c2196qI.A0W);
        android.media.MediaFormat A04 = A04(c2196qI, b3.A01, this.A00);
        b0.A58(A04, null, mediaCrypto, 0, null);
        if (this.A0D) {
            this.A06 = A04;
            this.A06.setString(A07(androidx.compose.material.TextFieldImplKt.AnimationDuration, 4, 43), c2196qI.A0W);
        } else {
            this.A06 = null;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03541g
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("D45988204: [FBLite][Video] Add Codec Hooks for Logging")
    public final void A1x(java.lang.String str) {
        this.A0F.A0F(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03541g
    public final void A1y(java.lang.String str, long j, long j2) {
        this.A0F.A0G(str, j, j2);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03541g
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Added in D6142814")
    public final boolean A22() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03541g
    public final boolean A23(long j, long j2, com.facebook.ads.redexgen.core.B0 b0, java.nio.ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, boolean z2) throws com.facebook.ads.redexgen.core.AD {
        if (this.A0D) {
            int i3 = i2 & 2;
            if (A0K[3].length() != 28) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0K;
            strArr[2] = "qFTZlqBsfbROWjHKIBaS9ttrRfnfHc6a";
            strArr[7] = "sZoZRvagNjZKK9rko7XS8oWwcuS8hqha";
            if (i3 != 0) {
                b0.AHi(i, false);
                return true;
            }
        }
        if (z) {
            b0.AHi(i, false);
            if (A0K[5].charAt(0) != 'p') {
                java.lang.String[] strArr2 = A0K;
                strArr2[4] = "i4U0xdeb2kJYTtTzacReJ5RV5axgIdhD";
                strArr2[0] = "rrPeATHc6C5SnSGUS9RZuIpTT0sGFjMh";
                this.A0h.A0B++;
                this.A0I.A9h();
                return true;
            }
            java.lang.String[] strArr3 = A0K;
            strArr3[1] = "GzmR5b8Z6T6If0UBPoEMKvf6QjFSlvzk";
            strArr3[6] = "qLQdQ1juS6S8x5RB3mUlKTK412OZk0qd";
            this.A0h.A0B++;
            this.A0I.A9h();
            return true;
        }
        if (this.A0H && A01(this.A07) == 2 && i2 == 0 && this.A03 > 0 && byteBuffer.limit() - byteBuffer.position() >= 12) {
            int position = byteBuffer.position();
            int limit = byteBuffer.limit();
            byteBuffer.position(10);
            short s = byteBuffer.getShort();
            byteBuffer.position(position);
            byteBuffer.limit(limit);
            int i4 = this.A01;
            int limit2 = byteBuffer.limit();
            int originalPosition = byteBuffer.position();
            this.A01 = i4 + (limit2 - originalPosition);
            int i5 = this.A02;
            java.lang.String[] strArr4 = A0K;
            java.lang.String str = strArr4[4];
            java.lang.String str2 = strArr4[0];
            int charAt = str.charAt(18);
            int originalPosition2 = str2.charAt(18);
            if (charAt != originalPosition2) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr5 = A0K;
            strArr5[1] = "MwudhWWmLfAHxFUBWVuNAQ0R1ppnonhu";
            strArr5[6] = "h4oByFchRKdWl7IBcc7CSq20vr2fgRzF";
            this.A02 = i5 + 1;
            long j4 = this.A05;
            int originalPosition3 = java.lang.Math.abs((int) s);
            this.A05 = j4 + originalPosition3;
            int i6 = this.A01;
            int originalPosition4 = this.A03;
            if (i6 >= originalPosition4 * 2) {
                this.A0F.A00((int) (this.A05 / this.A02));
                this.A01 = 0;
                this.A02 = 0;
                this.A05 = 0L;
            }
        }
        if (this.A0G) {
            int limit3 = byteBuffer.limit();
            int originalPosition5 = byteBuffer.position();
            if (limit3 > originalPosition5) {
                int position2 = byteBuffer.position();
                int limit4 = byteBuffer.limit();
                int originalPosition6 = limit4 - position2;
                java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(originalPosition6);
                allocate.put(byteBuffer);
                allocate.flip();
                byteBuffer.position(position2);
                byteBuffer.limit(limit4);
                this.A0F.A0K(allocate.array(), j3 / 1000);
            }
        }
        try {
            if (!this.A0I.A9e(byteBuffer, j3, 1)) {
                return false;
            }
            b0.AHi(i, false);
            this.A0h.A09++;
            return true;
        } catch (com.facebook.ads.redexgen.core.C05438t e) {
            throw A1T(e, this.A07, e.A02, 5001);
        } catch (com.facebook.ads.redexgen.core.C05468y e2) {
            throw A1T(e2, this.A0g, e2.A02, 5002);
        }
    }

    public final void A26() {
        this.A0A = true;
    }

    @Override // com.facebook.ads.redexgen.core.AE, com.facebook.ads.redexgen.core.InterfaceC2105oo
    public final com.facebook.ads.redexgen.core.AnonymousClass78 A8T() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass78
    public final com.facebook.ads.redexgen.core.C2175px A8m() {
        return this.A0I.A8m();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass78
    public final long A8p() {
        if (A9A() == 2) {
            A08();
        }
        long j = this.A04;
        java.lang.String[] strArr = A0K;
        if (strArr[1].charAt(15) != strArr[6].charAt(15)) {
            throw new java.lang.RuntimeException();
        }
        A0K[5] = "p6YKYNxicnjzLIFANgsfPKErY7h8fvSp";
        return j;
    }

    @Override // com.facebook.ads.redexgen.core.AE, com.facebook.ads.redexgen.core.InterfaceC05027c
    public final void A9i(int i, java.lang.Object obj) throws com.facebook.ads.redexgen.core.AD {
        switch (i) {
            case 2:
                this.A0I.setVolume(((java.lang.Float) obj).floatValue());
                return;
            case 3:
                this.A0I.AJG((com.facebook.ads.redexgen.core.C2202qQ) obj);
                return;
            case 4:
            case 5:
            case 7:
            case 8:
            default:
                super.A9i(i, obj);
                return;
            case 6:
                this.A0I.AJI((com.facebook.ads.redexgen.core.AnonymousClass21) obj);
                return;
            case 9:
                this.A0I.AJo(((java.lang.Boolean) obj).booleanValue());
                return;
            case 10:
                this.A0I.AJH(((java.lang.Integer) obj).intValue());
                return;
            case 11:
                this.A08 = null;
                return;
            case 12:
                if (com.facebook.ads.redexgen.core.C5C.A02 < 23) {
                    return;
                }
                com.facebook.ads.redexgen.core.InterfaceC05478z interfaceC05478z = this.A0I;
                if (A0K[3].length() != 28) {
                    throw new java.lang.RuntimeException();
                }
                A0K[3] = "XCf3J2AEJJ1Zd2j3qAi6tezJ2mG7";
                com.facebook.ads.redexgen.core.C9S.A00(interfaceC05478z, obj);
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03541g, com.facebook.ads.redexgen.core.InterfaceC2105oo
    public final boolean AAP() {
        return super.AAP() && this.A0I.AAP();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03541g, com.facebook.ads.redexgen.core.InterfaceC2105oo
    public final boolean AAe() {
        if (!this.A0I.A9o()) {
            boolean AAe = super.AAe();
            if (A0K[5].charAt(0) != 'p') {
                throw new java.lang.RuntimeException();
            }
            A0K[3] = "YZui0KIXZR8KzjI1EkPC1GaIUT4y";
            if (!AAe) {
                return false;
            }
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass78
    public final void AJd(com.facebook.ads.redexgen.core.C2175px c2175px) {
        this.A0I.AJd(c2175px);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2105oo, com.facebook.ads.redexgen.core.InterfaceC05157p
    public final java.lang.String getName() {
        return A07(0, 23, 11);
    }
}
