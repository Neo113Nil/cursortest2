package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class MI implements com.facebook.ads.redexgen.core.InterfaceC1178Yi {
    public static byte[] A0D;
    public int A00;
    public com.facebook.ads.redexgen.core.C0683Eu A01;
    public com.facebook.ads.redexgen.core.C4L A02;
    public java.lang.String A03;
    public final com.facebook.ads.redexgen.core.C1636gi A04;
    public final com.facebook.ads.redexgen.core.VA A05;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A06;
    public final com.facebook.ads.redexgen.core.ZP A07;
    public final com.facebook.ads.redexgen.core.C0673Ek A08;
    public final com.facebook.ads.redexgen.core.E2 A0C = new com.facebook.ads.redexgen.core.E2() { // from class: com.facebook.ads.redexgen.X.6d
        public static byte[] A01;

        static {
            A01();
        }

        public static java.lang.String A00(int i, int i2, int i3) {
            byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
            for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
            }
            return new java.lang.String(copyOfRange);
        }

        public static void A01() {
            A01 = new byte[]{115, 108, 97, 96, 106, 76, 107, 113, 96, 119, 118, 113, 108, 113, 100, 105, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 115, 96, 107, 113};
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.UN
        /* renamed from: A02, reason: merged with bridge method [inline-methods] */
        public final void A03(com.facebook.ads.redexgen.core.E3 e3) {
            com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh;
            interfaceC1177Yh = com.facebook.ads.redexgen.core.MI.this.A06;
            interfaceC1177Yh.A4k(A00(0, 21, 63), e3);
        }
    };
    public final com.facebook.ads.redexgen.core.E4 A0B = new com.facebook.ads.redexgen.core.E4() { // from class: com.facebook.ads.redexgen.X.6a
        public static byte[] A01;

        static {
            A01();
        }

        public static java.lang.String A00(int i, int i2, int i3) {
            byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
            for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 120);
            }
            return new java.lang.String(copyOfRange);
        }

        public static void A01() {
            A01 = new byte[]{38, 57, 52, 53, 63, com.google.common.base.Ascii.EM, 62, 36, 53, 34, 35, 36, 57, 36, 49, 60, com.google.common.base.Ascii.NAK, 38, 53, 62, 36};
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.UN
        /* renamed from: A02, reason: merged with bridge method [inline-methods] */
        public final void A03(com.facebook.ads.redexgen.core.C4B c4b) {
            com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh;
            interfaceC1177Yh = com.facebook.ads.redexgen.core.MI.this.A06;
            interfaceC1177Yh.A4k(A00(0, 21, 40), c4b);
        }
    };
    public final com.facebook.ads.redexgen.core.EA A09 = new com.facebook.ads.redexgen.core.EA() { // from class: com.facebook.ads.redexgen.X.6Z
        public static byte[] A01;
        public static java.lang.String[] A02 = {"cVYzzU3WDwilAiB6lBwH", "ltb11yKnDLf", "qD1l7ddw57WScFbFlpW6gLQQ4LJZYMm4", "7tmDLtuP1dSUokfmYRKMMhnjp75BOUEQ", "O1T", "OUAaXGhWo5xW6BfvCbr", "NPW6PnCzVK8iTd9b27h5", "ykk8Miz3Z2gvnB5Rb4Sxgn912BIo"};

        public static java.lang.String A00(int i, int i2, int i3) {
            byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
            for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                int i5 = copyOfRange[i4] ^ i3;
                if (A02[2].charAt(8) != '5') {
                    throw new java.lang.RuntimeException();
                }
                A02[5] = "7KI0j9KfVtSFY3dF";
                copyOfRange[i4] = (byte) (i5 ^ 70);
            }
            return new java.lang.String(copyOfRange);
        }

        public static void A01() {
            A01 = new byte[]{3, com.google.common.base.Ascii.FS, 17, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SUB, 60, com.google.common.base.Ascii.ESC, 1, com.google.common.base.Ascii.DLE, 7, 6, 1, com.google.common.base.Ascii.FS, 1, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.EM, 48, 3, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.ESC, 1};
        }

        static {
            A01();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.UN
        /* renamed from: A02, reason: merged with bridge method [inline-methods] */
        public final void A03(com.facebook.ads.redexgen.core.C4K c4k) {
            com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh;
            interfaceC1177Yh = com.facebook.ads.redexgen.core.MI.this.A06;
            interfaceC1177Yh.A4k(A00(0, 21, 51), c4k);
        }
    };
    public final com.facebook.ads.redexgen.core.E8 A0A = new com.facebook.ads.redexgen.core.E8() { // from class: com.facebook.ads.redexgen.X.6Y
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.UN
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(com.facebook.ads.redexgen.core.E9 e9) {
            com.facebook.ads.redexgen.core.ZP zp;
            zp = com.facebook.ads.redexgen.core.MI.this.A07;
            zp.ADv();
        }
    };

    static {
        A03();
    }

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 102);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A0D = new byte[]{44, 56, 57, 34, kotlin.io.encoding.Base64.padSymbol, 33, 44, 52, 122, 117, 112, 124, 119, 109, 77, 118, 114, 124, 119, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.DC2, 4, 47, 0, com.google.common.base.Ascii.NAK, 8, com.google.common.base.Ascii.ETB, 4, 34, com.google.common.base.Ascii.NAK, 0, 35, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SI, 55, 40, 37, 36, 46, 8, 47, 53, 36, 51, 50, 53, 40, 53, 32, 45, 4, 55, 36, 47, 53, 81, 78, 67, 66, 72, 107, 72, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 66, 85, 116, 107, 102, 103, 109, 79, 82, 70, 103, 120, 117, 116, 126, 66, 116, 116, 122, 69, 120, 124, 116, 63, 32, 45, 44, 38, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.ESC, 5};
    }

    public MI(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.ZP zp, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh) {
        this.A04 = c1636gi;
        this.A05 = va;
        this.A07 = zp;
        this.A08 = new com.facebook.ads.redexgen.core.C0673Ek(c1636gi);
        this.A08.A0f(new com.facebook.ads.redexgen.core.C04123q(c1636gi));
        this.A08.getEventBus().A03(this.A0C, this.A0B, this.A09, this.A0A);
        this.A06 = interfaceC1177Yh;
        this.A08.setIsFullScreen(true);
        this.A08.setVolume(1.0f);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        interfaceC1177Yh.A45(this.A08, layoutParams);
        com.facebook.ads.redexgen.core.C1185Yp closeButton = new com.facebook.ads.redexgen.core.C1185Yp(c1636gi);
        closeButton.setOnClickListener(new com.facebook.ads.redexgen.core.ZN(this));
        android.widget.RelativeLayout.LayoutParams params = closeButton.getDefaultLayoutParams();
        interfaceC1177Yh.A45(closeButton, params);
    }

    public final void A04(int i) {
        this.A08.setVideoProgressReportIntervalMs(i);
    }

    public final void A05(android.view.View view) {
        this.A08.setControlsAnchorView(view);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AAu(android.content.Intent intent, android.os.Bundle bundle, com.facebook.ads.redexgen.core.C0998Re c0998Re) {
        java.lang.String ctaText = A02(8, 11, 127);
        if (bundle == null) {
            this.A03 = intent.getStringExtra(ctaText);
        } else {
            this.A03 = bundle.getString(ctaText);
        }
        java.lang.String stringExtra = intent.getStringExtra(A02(19, 18, 7));
        if (stringExtra != null && !stringExtra.isEmpty()) {
            com.facebook.ads.redexgen.core.C1472e3 c1472e3 = new com.facebook.ads.redexgen.core.C1472e3(this.A04, stringExtra);
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            int i = (int) (16.0f * com.facebook.ads.redexgen.core.XX.A02);
            layoutParams.setMargins(i, i, i, i);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            c1472e3.setOnClickListener(new com.facebook.ads.redexgen.core.ZO(this));
            this.A06.A45(c1472e3, layoutParams);
        }
        this.A00 = intent.getIntExtra(A02(77, 13, 119), 0);
        this.A02 = new com.facebook.ads.redexgen.core.C4L(this.A04, this.A05, this.A08, this.A03, intent.getBundleExtra(A02(58, 11, 65)), null);
        if (com.facebook.ads.redexgen.core.C1086Up.A20(this.A04)) {
            this.A01 = new com.facebook.ads.redexgen.core.C0683Eu(this.A04, this.A05, this.A08, this.A03, false, this.A02, null);
        } else {
            this.A01 = null;
        }
        this.A08.setVideoMPD(intent.getStringExtra(A02(69, 8, 100)));
        this.A08.setVideoURI(intent.getStringExtra(A02(90, 8, 47)));
        if (this.A00 > 0) {
            this.A08.A0a(this.A00);
        }
        if (intent.getBooleanExtra(A02(0, 8, 43), false)) {
            this.A08.A0e(com.facebook.ads.redexgen.core.EnumC1523et.A04, 17);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AFA(boolean z) {
        this.A06.A4k(A02(37, 21, 39), new com.facebook.ads.redexgen.core.E6());
        this.A08.A0X();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AFi(boolean z) {
        this.A06.A4k(A02(37, 21, 39), new com.facebook.ads.redexgen.core.E5());
        if (!this.A08.A0o()) {
            this.A08.A0e(com.facebook.ads.redexgen.core.EnumC1523et.A04, 18);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AIv(android.os.Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final java.lang.String getCurrentClientToken() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final boolean onActivityResult(int i, int i2, android.content.Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void onDestroy() {
        this.A06.A4k(A02(37, 21, 39), new com.facebook.ads.redexgen.core.C0661Dy(this.A00, this.A08.getCurrentPositionInMillis()));
        this.A02.A0j(this.A08.getCurrentPositionInMillis());
        if (this.A01 != null) {
            this.A01.A08();
        }
        this.A08.A0b(1);
        this.A08.A0W();
    }
}
