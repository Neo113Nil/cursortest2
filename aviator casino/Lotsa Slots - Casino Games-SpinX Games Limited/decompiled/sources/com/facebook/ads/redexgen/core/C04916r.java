package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.6r, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04916r extends com.facebook.ads.redexgen.core.C0673Ek {
    public static byte[] A0F;
    public static java.lang.String[] A0G = {"Cb7nBOTqt", "Uv90YERdy9SZ9btNePue9j4WSufKww0d", "5tFdsnJl1aHC8QazlewrqKxrXvRcdsO5", "4XUHzfDXngka", "6zmG8GCKaenNI", "iTvfTfiU680tAW5ZUJpNe0fUcB62AaOp", "iIjhxtVkNHrsB", "9VdyyBhNHsky"};
    public static final java.lang.String A0H;
    public android.net.Uri A00;
    public com.facebook.ads.NativeAd A01;
    public com.facebook.ads.redexgen.core.VA A02;
    public com.facebook.ads.redexgen.core.InterfaceC1191Yv A03;
    public com.facebook.ads.redexgen.core.C0683Eu A04;
    public com.facebook.ads.redexgen.core.C4L A05;
    public java.lang.String A06;
    public java.lang.String A07;
    public java.lang.String A08;
    public final com.facebook.ads.redexgen.core.NL A09;
    public final com.facebook.ads.redexgen.core.C1636gi A0A;
    public final com.facebook.ads.redexgen.core.EA A0B;
    public final com.facebook.ads.redexgen.core.E4 A0C;
    public final com.facebook.ads.redexgen.core.E2 A0D;
    public final java.lang.String A0E;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            if (A0G[0].length() == 17) {
                throw new java.lang.RuntimeException();
            }
            A0G[2] = "GV7dEmS9dQikFIsLGq03TvmmBp0PGqms";
            copyOfRange[i4] = (byte) ((b ^ i3) ^ 4);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A0F = new byte[]{32, 2, com.google.common.base.Ascii.CR, 68, com.google.common.base.Ascii.ETB, 67, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.ETB, 2, 17, com.google.common.base.Ascii.ETB, 67, 34, com.google.common.base.Ascii.SYN, 7, 10, 6, com.google.common.base.Ascii.CR, 0, 6, 45, 6, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.FF, 17, 8, 34, 0, com.google.common.base.Ascii.ETB, 10, com.google.common.base.Ascii.NAK, 10, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SUB, 77, 67, 46, 2, 8, 6, 67, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SYN, 17, 6, 67, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.VT, 2, com.google.common.base.Ascii.ETB, 67, 10, com.google.common.base.Ascii.ETB, 68, com.google.common.base.Ascii.DLE, 67, 10, com.google.common.base.Ascii.CR, 67, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SYN, 17, 67, 34, com.google.common.base.Ascii.CR, 7, 17, com.google.common.base.Ascii.FF, 10, 7, 46, 2, com.google.common.base.Ascii.CR, 10, 5, 6, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.ETB, 77, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SI, 67, 5, 10, com.google.common.base.Ascii.SI, 6, 77, com.google.common.base.Ascii.GS, 42, 42, 55, 42, 98, 120, 35, 39, 36, com.google.common.base.Ascii.DLE, 1, com.google.common.base.Ascii.FF, 0, com.google.common.base.Ascii.VT, 6, 0, 43, 0, 17, com.google.common.base.Ascii.DC2, 10, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.NAK, 45, 43, 44, 120, 43, kotlin.io.encoding.Base64.padSymbol, 44, com.google.common.base.Ascii.ESC, 52, 49, kotlin.io.encoding.Base64.padSymbol, 54, 44, com.google.common.base.Ascii.FF, 55, 51, kotlin.io.encoding.Base64.padSymbol, 54, 120, 62, 49, 42, 43, 44, 3, 59, kotlin.io.encoding.Base64.padSymbol, 58, 110, kotlin.io.encoding.Base64.padSymbol, 43, 58, com.google.common.base.Ascii.CAN, 39, 42, 43, 33, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FS, 7, 110, 33, 60, 110, kotlin.io.encoding.Base64.padSymbol, 43, 58, com.google.common.base.Ascii.CAN, 39, 42, 43, 33, 3, com.google.common.base.Ascii.RS, 10, 110, 40, 39, 60, kotlin.io.encoding.Base64.padSymbol, 58, com.google.common.base.Ascii.RS, 17, 32, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SYN, 9, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.VT, 6, 51, 60, 57, 53, 62, 36, 4, 63, 59, 53, 62, 62, 47, 60, kotlin.io.encoding.Base64.padSymbol, 39, 32, 41, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.NAK, 2, 3, 2, 1, com.google.common.base.Ascii.SO, 9, 2, 3, 40, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SO, 2, 9, 19, 6, 19, com.google.common.base.Ascii.SO, 8, 9, 44, 2, com.google.common.base.Ascii.RS, 86, 77, 74, 82, 86, 70, 106, 71, 42, 44, 58, 17, 62, 43, 54, 41, 58, com.google.common.base.Ascii.FS, 43, 62, com.google.common.base.Ascii.GS, 42, 43, 43, 48, 49, 117, 106, 103, 102, 108, 79, 108, 100, 100, 102, 113, 85, 74, 71, 70, 76, 110, 115, 103, 66, 93, 80, 81, 91, 103, 81, 81, 95, 96, 93, 89, 81, 99, 124, 113, 112, 122, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 71, 89, 17, com.google.common.base.Ascii.SO, 3, 2, 8, 56, 19, com.google.common.base.Ascii.SO, 10, 2, 56, com.google.common.base.Ascii.ETB, 8, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SO, 9, 0, 56, com.google.common.base.Ascii.SO, 9, 19, 2, com.google.common.base.Ascii.NAK, 17, 6, com.google.common.base.Ascii.VT, 19, com.google.common.base.Ascii.FF, 0, com.google.common.base.Ascii.DC2, 49, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.NAK, 0};
    }

    static {
        A03();
        A0H = com.facebook.ads.redexgen.core.C04916r.class.getSimpleName();
    }

    public C04916r(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        super(c1636gi);
        this.A0E = java.util.UUID.randomUUID().toString();
        this.A0D = new com.facebook.ads.redexgen.core.E2() { // from class: com.facebook.ads.redexgen.X.6u
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.E3 e3) {
                com.facebook.ads.redexgen.core.InterfaceC1191Yv interfaceC1191Yv;
                com.facebook.ads.redexgen.core.InterfaceC1191Yv interfaceC1191Yv2;
                interfaceC1191Yv = com.facebook.ads.redexgen.core.C04916r.this.A03;
                if (interfaceC1191Yv != null) {
                    interfaceC1191Yv2 = com.facebook.ads.redexgen.core.C04916r.this.A03;
                    interfaceC1191Yv2.AFC();
                }
            }
        };
        this.A0C = new com.facebook.ads.redexgen.core.E4() { // from class: com.facebook.ads.redexgen.X.6t
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4B c4b) {
                com.facebook.ads.redexgen.core.InterfaceC1191Yv interfaceC1191Yv;
                com.facebook.ads.redexgen.core.InterfaceC1191Yv interfaceC1191Yv2;
                interfaceC1191Yv = com.facebook.ads.redexgen.core.C04916r.this.A03;
                if (interfaceC1191Yv != null) {
                    interfaceC1191Yv2 = com.facebook.ads.redexgen.core.C04916r.this.A03;
                    interfaceC1191Yv2.onPause();
                }
            }
        };
        this.A0B = new com.facebook.ads.redexgen.core.EA() { // from class: com.facebook.ads.redexgen.X.6s
            public static java.lang.String[] A01 = {"NidaN7FoPBbaKg721Bw4T4ZedkUEC8Kp", "T6", "FoXhB5efLBt1Ix1VLvHMf2xPaJTvayS4", "Ki7KmbouuPEeN63k7Tf8VIoYM6z8lFxL", "sQ99pP", "JVozQuP1BqTf", "NfzwiYkR35AXK2rv0hn4uIoCH9D93AVk", "I59WEHRkBvEx"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4K c4k) {
                com.facebook.ads.redexgen.core.InterfaceC1191Yv interfaceC1191Yv;
                com.facebook.ads.redexgen.core.InterfaceC1191Yv interfaceC1191Yv2;
                interfaceC1191Yv = com.facebook.ads.redexgen.core.C04916r.this.A03;
                if (interfaceC1191Yv != null) {
                    interfaceC1191Yv2 = com.facebook.ads.redexgen.core.C04916r.this.A03;
                    interfaceC1191Yv2.ADQ();
                    if (A01[3].charAt(11) == 'F') {
                        throw new java.lang.RuntimeException();
                    }
                    A01[3] = "dba5oiQ8v4CkqUII5uWz8sPENBYPSf9M";
                }
            }
        };
        this.A09 = new com.facebook.ads.redexgen.core.NL(this, c1636gi);
        this.A0A = c1636gi;
        A02();
    }

    public C04916r(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.util.AttributeSet attributeSet) {
        super(c1636gi, attributeSet);
        this.A0E = java.util.UUID.randomUUID().toString();
        this.A0D = new com.facebook.ads.redexgen.core.E2() { // from class: com.facebook.ads.redexgen.X.6u
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.E3 e3) {
                com.facebook.ads.redexgen.core.InterfaceC1191Yv interfaceC1191Yv;
                com.facebook.ads.redexgen.core.InterfaceC1191Yv interfaceC1191Yv2;
                interfaceC1191Yv = com.facebook.ads.redexgen.core.C04916r.this.A03;
                if (interfaceC1191Yv != null) {
                    interfaceC1191Yv2 = com.facebook.ads.redexgen.core.C04916r.this.A03;
                    interfaceC1191Yv2.AFC();
                }
            }
        };
        this.A0C = new com.facebook.ads.redexgen.core.E4() { // from class: com.facebook.ads.redexgen.X.6t
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4B c4b) {
                com.facebook.ads.redexgen.core.InterfaceC1191Yv interfaceC1191Yv;
                com.facebook.ads.redexgen.core.InterfaceC1191Yv interfaceC1191Yv2;
                interfaceC1191Yv = com.facebook.ads.redexgen.core.C04916r.this.A03;
                if (interfaceC1191Yv != null) {
                    interfaceC1191Yv2 = com.facebook.ads.redexgen.core.C04916r.this.A03;
                    interfaceC1191Yv2.onPause();
                }
            }
        };
        this.A0B = new com.facebook.ads.redexgen.core.EA() { // from class: com.facebook.ads.redexgen.X.6s
            public static java.lang.String[] A01 = {"NidaN7FoPBbaKg721Bw4T4ZedkUEC8Kp", "T6", "FoXhB5efLBt1Ix1VLvHMf2xPaJTvayS4", "Ki7KmbouuPEeN63k7Tf8VIoYM6z8lFxL", "sQ99pP", "JVozQuP1BqTf", "NfzwiYkR35AXK2rv0hn4uIoCH9D93AVk", "I59WEHRkBvEx"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4K c4k) {
                com.facebook.ads.redexgen.core.InterfaceC1191Yv interfaceC1191Yv;
                com.facebook.ads.redexgen.core.InterfaceC1191Yv interfaceC1191Yv2;
                interfaceC1191Yv = com.facebook.ads.redexgen.core.C04916r.this.A03;
                if (interfaceC1191Yv != null) {
                    interfaceC1191Yv2 = com.facebook.ads.redexgen.core.C04916r.this.A03;
                    interfaceC1191Yv2.ADQ();
                    if (A01[3].charAt(11) == 'F') {
                        throw new java.lang.RuntimeException();
                    }
                    A01[3] = "dba5oiQ8v4CkqUII5uWz8sPENBYPSf9M";
                }
            }
        };
        this.A09 = new com.facebook.ads.redexgen.core.NL(this, c1636gi);
        this.A0A = c1636gi;
        A02();
    }

    public C04916r(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.util.AttributeSet attributeSet, int i) {
        super(c1636gi, attributeSet, i);
        this.A0E = java.util.UUID.randomUUID().toString();
        this.A0D = new com.facebook.ads.redexgen.core.E2() { // from class: com.facebook.ads.redexgen.X.6u
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.E3 e3) {
                com.facebook.ads.redexgen.core.InterfaceC1191Yv interfaceC1191Yv;
                com.facebook.ads.redexgen.core.InterfaceC1191Yv interfaceC1191Yv2;
                interfaceC1191Yv = com.facebook.ads.redexgen.core.C04916r.this.A03;
                if (interfaceC1191Yv != null) {
                    interfaceC1191Yv2 = com.facebook.ads.redexgen.core.C04916r.this.A03;
                    interfaceC1191Yv2.AFC();
                }
            }
        };
        this.A0C = new com.facebook.ads.redexgen.core.E4() { // from class: com.facebook.ads.redexgen.X.6t
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4B c4b) {
                com.facebook.ads.redexgen.core.InterfaceC1191Yv interfaceC1191Yv;
                com.facebook.ads.redexgen.core.InterfaceC1191Yv interfaceC1191Yv2;
                interfaceC1191Yv = com.facebook.ads.redexgen.core.C04916r.this.A03;
                if (interfaceC1191Yv != null) {
                    interfaceC1191Yv2 = com.facebook.ads.redexgen.core.C04916r.this.A03;
                    interfaceC1191Yv2.onPause();
                }
            }
        };
        this.A0B = new com.facebook.ads.redexgen.core.EA() { // from class: com.facebook.ads.redexgen.X.6s
            public static java.lang.String[] A01 = {"NidaN7FoPBbaKg721Bw4T4ZedkUEC8Kp", "T6", "FoXhB5efLBt1Ix1VLvHMf2xPaJTvayS4", "Ki7KmbouuPEeN63k7Tf8VIoYM6z8lFxL", "sQ99pP", "JVozQuP1BqTf", "NfzwiYkR35AXK2rv0hn4uIoCH9D93AVk", "I59WEHRkBvEx"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4K c4k) {
                com.facebook.ads.redexgen.core.InterfaceC1191Yv interfaceC1191Yv;
                com.facebook.ads.redexgen.core.InterfaceC1191Yv interfaceC1191Yv2;
                interfaceC1191Yv = com.facebook.ads.redexgen.core.C04916r.this.A03;
                if (interfaceC1191Yv != null) {
                    interfaceC1191Yv2 = com.facebook.ads.redexgen.core.C04916r.this.A03;
                    interfaceC1191Yv2.ADQ();
                    if (A01[3].charAt(11) == 'F') {
                        throw new java.lang.RuntimeException();
                    }
                    A01[3] = "dba5oiQ8v4CkqUII5uWz8sPENBYPSf9M";
                }
            }
        };
        this.A09 = new com.facebook.ads.redexgen.core.NL(this, c1636gi);
        this.A0A = c1636gi;
        A02();
    }

    private void A02() {
        getEventBus().A03(this.A0D, this.A0C, this.A0B);
    }

    private void A04(android.content.Intent intent) {
        if (this.A05 == null) {
            A05(A01(114, 25, 92));
            return;
        }
        if (this.A00 == null && this.A08 == null) {
            A05(A01(androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_UHD, 37, 74));
            java.lang.String[] strArr = A0G;
            if (strArr[4].length() != strArr[6].length()) {
                throw new java.lang.RuntimeException();
            }
            A0G[0] = "rwc2";
            return;
        }
        intent.putExtra(A01(237, 18, 91), this.A07);
        intent.putExtra(A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_UNRECOGNIZED_COMMAND_VALUE, 8, 97), com.facebook.ads.redexgen.core.WK.A09);
        intent.putExtra(A01(287, 8, 17), this.A00.toString());
        intent.putExtra(A01(187, 11, 84), this.A06 == null ? A01(0, 0, 6) : this.A06);
        intent.putExtra(A01(266, 8, 39), this.A08);
        intent.putExtra(A01(205, 24, 99), com.facebook.ads.redexgen.core.XX.A00(this.A0A));
        intent.putExtra(A01(274, 13, 48), getCurrentPositionInMillis());
        java.lang.String[] strArr2 = A0G;
        if (strArr2[7].length() != strArr2[3].length()) {
            throw new java.lang.RuntimeException();
        }
        A0G[0] = "bFTSk0Gp6QusC65PcsD";
        intent.putExtra(A01(229, 8, 39), this.A0E);
        intent.putExtra(A01(255, 11, 7), this.A05.A0c());
        intent.putExtra(A01(295, 27, 99), getVideoProgressReportIntervalMs());
        intent.addFlags(268435456);
    }

    private void A05(java.lang.String str) {
        this.A0A.A08().ABC(A01(198, 7, 74), com.facebook.ads.redexgen.core.AbstractC1048Td.A28, new com.facebook.ads.redexgen.core.C1049Te(com.facebook.ads.internal.protocol.AdErrorType.PARSER_FAILURE.getDefaultErrorMessage(), A01(90, 7, 92) + str));
        if (com.facebook.ads.internal.settings.AdInternalSettings.isDebugBuild()) {
            android.util.Log.w(A0H, str);
        }
    }

    public final void A0r() {
        if (this.A01 != null) {
            this.A01.onCtaBroadcast();
        }
    }

    public final void A0s() {
        com.facebook.ads.internal.util.activity.AdActivityIntent A05 = com.facebook.ads.redexgen.core.C1140Wu.A05(this.A0A);
        A04(A05);
        try {
            A0i(false, 6);
            setVisibility(8);
            com.facebook.ads.redexgen.core.C1140Wu.A0B(this.A0A, A05);
        } catch (java.lang.Exception e) {
            this.A0A.A08().ABC(A01(176, 11, 123), com.facebook.ads.redexgen.core.AbstractC1048Td.A0D, new com.facebook.ads.redexgen.core.C1049Te(e));
            android.util.Log.e(A01(97, 17, 97), A01(0, 90, 103), e);
        }
    }

    public com.facebook.ads.redexgen.core.InterfaceC1191Yv getListener() {
        return this.A03;
    }

    public java.lang.String getUniqueId() {
        return this.A0E;
    }

    @Override // com.facebook.ads.redexgen.core.C0673Ek, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A09.A02();
    }

    @Override // com.facebook.ads.redexgen.core.C0673Ek, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.A09.A03();
        super.onDetachedFromWindow();
    }

    public void setAdEventManager(com.facebook.ads.redexgen.core.VA va) {
        this.A02 = va;
    }

    public void setClientToken(java.lang.String str) {
        com.facebook.ads.redexgen.core.C4L c4l;
        if (this.A04 != null) {
            com.facebook.ads.redexgen.core.C0683Eu c0683Eu = this.A04;
            java.lang.String[] strArr = A0G;
            if (strArr[5].charAt(7) == strArr[1].charAt(7)) {
                throw new java.lang.RuntimeException();
            }
            A0G[2] = "geldSN57Uojbab2WOS9MzcIW4E8sQ4xA";
            c0683Eu.A07();
        }
        if (this.A05 != null) {
            this.A05.A0p();
        }
        this.A06 = str;
        com.facebook.ads.redexgen.core.C0683Eu c0683Eu2 = null;
        if (str != null) {
            c4l = new com.facebook.ads.redexgen.core.C4L(this.A0A, this.A02, this, str);
        } else {
            c4l = null;
        }
        this.A05 = c4l;
        if (this.A05 != null && com.facebook.ads.redexgen.core.C1086Up.A20(this.A0A)) {
            if (str != null) {
                c0683Eu2 = new com.facebook.ads.redexgen.core.C0683Eu(this.A0A, this.A02, this, str, false, this.A05, null);
            }
            this.A04 = c0683Eu2;
            return;
        }
        this.A04 = null;
    }

    public void setEnableBackgroundVideo(boolean z) {
        super.A0E.setBackgroundPlaybackEnabled(z);
    }

    public void setListener(com.facebook.ads.redexgen.core.InterfaceC1191Yv interfaceC1191Yv) {
        this.A03 = interfaceC1191Yv;
    }

    public void setNativeAd(com.facebook.ads.NativeAd nativeAd) {
        this.A01 = nativeAd;
    }

    public void setVideoCTA(java.lang.String str) {
        this.A07 = str;
    }

    @Override // com.facebook.ads.redexgen.core.C0673Ek
    public void setVideoMPD(java.lang.String str) {
        if (str != null && this.A05 == null) {
            A05(A01(114, 25, 92));
            return;
        }
        this.A08 = str;
        java.lang.String[] strArr = A0G;
        if (strArr[7].length() != strArr[3].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0G;
        strArr2[4] = "ao7Mn74HmNnh4";
        strArr2[6] = "E6rOC8IWnX5Ja";
        super.setVideoMPD(str);
    }

    @Override // com.facebook.ads.redexgen.core.C0673Ek
    public void setVideoURI(android.net.Uri uri) {
        if (uri != null && this.A05 == null) {
            A05(A01(114, 25, 92));
            return;
        }
        this.A00 = uri;
        super.setVideoURI(uri);
        java.lang.String[] strArr = A0G;
        if (strArr[5].charAt(7) == strArr[1].charAt(7)) {
            throw new java.lang.RuntimeException();
        }
        A0G[0] = "z2OQUaNXEwktMvnJ8h1OzGBt0";
    }
}
