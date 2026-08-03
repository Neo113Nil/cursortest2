package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.eI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1487eI extends android.widget.FrameLayout {
    public static byte[] A0C;
    public static java.lang.String[] A0D = {"5vYLtEaU9MAxDoI06TlJjFfWs8tiaGj", "TX23sib3Tj6X7eJy5cgYAILp0vVPLOiW", "Lxz50jZMaNdiu", "yIxUapHBf", "xsW4qvb7U5EMj5cNQbMl14i5qh6u6uOh", "8XLPt3rjq6gnj0Cd96o3z24ZTqMdgzej", "IIODaFrLnzdPntRGftRJpuPC", "ODWlzaCdU1siup4vWOfVQK22DnthNinE"};
    public static final float A0E;
    public static final android.widget.RelativeLayout.LayoutParams A0F;
    public int A00;
    public long A01;
    public java.util.Map<java.lang.String, java.lang.String> A02;
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A03;
    public final com.facebook.ads.redexgen.core.C0908No A04;
    public final com.facebook.ads.redexgen.core.C1636gi A05;
    public final com.facebook.ads.redexgen.core.VA A06;
    public final com.facebook.ads.redexgen.core.InterfaceC1285b1 A07;
    public final com.facebook.ads.redexgen.core.LV A08;
    public final com.facebook.ads.redexgen.core.InterfaceC1485eG A09;
    public final java.util.concurrent.atomic.AtomicBoolean A0A;
    public final java.util.concurrent.atomic.AtomicBoolean A0B;

    public static java.lang.String A07(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 9);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0A() {
        java.lang.String[] strArr = A0D;
        if (strArr[1].charAt(1) != strArr[5].charAt(1)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0D;
        strArr2[7] = "Af0WM9g7Nak7nSkWG18ndsMVC8MahONd";
        strArr2[4] = "VergmF1iO6RBn6aZ7U2vBdquKGl77VZm";
        A0C = new byte[]{54, com.google.common.base.Ascii.DC2, 32, com.google.common.base.Ascii.FS, 17, 9, 17, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.NAK, 49, com.google.common.base.Ascii.DC4, 19, 34, 49, 48, 42, 45, 36, 99, 38, 49, 49, 44, 49, 68, 120, 117, 109, 117, 118, 120, 113, 52, 112, 123, 87, 96, 117, 87, 120, 125, 119, Byte.MAX_VALUE, 52, 96, 102, 125, 115, 115, 113, 102, 113, 112, 52, 99, 125, 96, 124, 52, 100, 102, 113, 57, 113, 98, 113, 122, 96, 52, 119, 120, 125, 119, Byte.MAX_VALUE, 103, 52, 119, 123, 97, 122, 96, 52, 117, 122, 112, 52, 80, 113, 120, 117, 109, com.google.common.base.Ascii.CR, 49, 60, 36, 60, 63, 49, 56, com.google.common.base.Ascii.FS, 57, 46, com.google.common.base.Ascii.VT, 52, 56, 42, 114, 117, 119, 121, 126, 48, 124, Byte.MAX_VALUE, 113, 116, 121, 126, 119, 48, 98, 117, 125, Byte.MAX_VALUE, 100, 117, 48, 96, 124, 113, 105, 113, 114, 124, 117, 34, 45, 40, 34, 42, 50, 5, 4, com.google.common.base.Ascii.CR, 0, com.google.common.base.Ascii.CAN, 114, 110, 99, 123, 99, 96, 110, 103, 52, 40, 37, kotlin.io.encoding.Base64.padSymbol, 37, 38, 40, 33, com.google.common.base.Ascii.ESC, 54, 33, 41, 43, 48, 33, 95, 72, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 66, 89, 72, 114, 94, 72, 94, 94, 68, 66, 67, 114, 68, 73, 78, 85, 81, 95, 84, 119, 101, 98, 95, 118, 105, 101, 119};
    }

    static {
        A0A();
        A0E = (int) (com.facebook.ads.redexgen.core.XX.A02 * 4.0f);
        A0F = new android.widget.RelativeLayout.LayoutParams(-1, -1);
    }

    public C1487eI(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.C0908No c0908No, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.InterfaceC1485eG interfaceC1485eG, java.util.Map<java.lang.String, java.lang.String> playableMetricsData) {
        super(c1636gi);
        this.A0A = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.A0B = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.A01 = -1L;
        this.A00 = 0;
        this.A07 = new com.facebook.ads.redexgen.core.AbstractC0858Lp() { // from class: com.facebook.ads.redexgen.X.4S
            @Override // com.facebook.ads.redexgen.core.InterfaceC1285b1
            public final void ACz() {
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC0858Lp, com.facebook.ads.redexgen.core.InterfaceC1285b1
            public final void ADu(int i, java.lang.String str) {
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
                com.facebook.ads.redexgen.core.InterfaceC1485eG interfaceC1485eG2;
                atomicBoolean = com.facebook.ads.redexgen.core.C1487eI.this.A0B;
                atomicBoolean.set(true);
                interfaceC1485eG2 = com.facebook.ads.redexgen.core.C1487eI.this.A09;
                interfaceC1485eG2.AEh();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1285b1
            public final void AEA() {
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean2;
                com.facebook.ads.redexgen.core.InterfaceC1485eG interfaceC1485eG2;
                atomicBoolean = com.facebook.ads.redexgen.core.C1487eI.this.A0B;
                if (atomicBoolean.get()) {
                    return;
                }
                atomicBoolean2 = com.facebook.ads.redexgen.core.C1487eI.this.A0A;
                if (!atomicBoolean2.compareAndSet(false, true)) {
                    return;
                }
                interfaceC1485eG2 = com.facebook.ads.redexgen.core.C1487eI.this.A09;
                interfaceC1485eG2.AEA();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1285b1
            public final void AF8() {
                com.facebook.ads.redexgen.core.C0908No c0908No2;
                com.facebook.ads.redexgen.core.InterfaceC1485eG interfaceC1485eG2;
                c0908No2 = com.facebook.ads.redexgen.core.C1487eI.this.A04;
                if (!c0908No2.A0b()) {
                    return;
                }
                interfaceC1485eG2 = com.facebook.ads.redexgen.core.C1487eI.this.A09;
                interfaceC1485eG2.AFQ();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1285b1
            public final void AGg() {
                com.facebook.ads.redexgen.core.InterfaceC1485eG interfaceC1485eG2;
                interfaceC1485eG2 = com.facebook.ads.redexgen.core.C1487eI.this.A09;
                interfaceC1485eG2.AGg();
            }
        };
        this.A05 = c1636gi;
        this.A03 = abstractC1801jd;
        this.A04 = c0908No;
        this.A06 = va;
        this.A09 = interfaceC1485eG;
        this.A02 = playableMetricsData;
        this.A08 = A05();
        if (com.facebook.ads.redexgen.core.C1086Up.A1z(this.A05)) {
            this.A05.A0B().AKn(this.A08, this.A03.A2E(), false);
        }
        addView(this.A08, A0F);
    }

    public static /* synthetic */ int A00(com.facebook.ads.redexgen.core.C1487eI c1487eI) {
        int i = c1487eI.A00;
        c1487eI.A00 = i + 1;
        return i;
    }

    private com.facebook.ads.redexgen.core.LV A05() {
        com.facebook.ads.redexgen.core.LV lv = new com.facebook.ads.redexgen.core.LV(this.A05, (java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC1285b1>) new java.lang.ref.WeakReference(this.A07), 10, com.facebook.ads.redexgen.core.C1086Up.A28(this.A05));
        lv.setCornerRadius(A0E);
        lv.setLogMultipleImpressions(false);
        lv.setCheckAssetsByJavascriptBridge(false);
        lv.setWebViewTimeoutInMillis(this.A04.A0F());
        lv.setRequestId(this.A03.A1D());
        lv.setOnTouchListener(new com.facebook.ads.redexgen.core.ViewOnTouchListenerC1486eH(this));
        android.webkit.WebSettings settings = lv.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs(true);
        lv.addJavascriptInterface(new com.facebook.ads.redexgen.core.C1488eJ(this.A05, this, this.A06, this.A02, this.A03.A2E()), A07(0, 12, 121));
        return lv;
    }

    public final void A0B() {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.A01;
        com.facebook.ads.redexgen.core.C1049Te c1049Te = new com.facebook.ads.redexgen.core.C1049Te(A07(25, 67, 29));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(A07(136, 6, 72), this.A00);
            jSONObject.put(A07(142, 5, 104), currentTimeMillis);
            jSONObject.put(A07(187, 5, 51), this.A03.A2E());
        } catch (org.json.JSONException e) {
            android.util.Log.e(A07(92, 15, 84), A07(12, 13, 74), e);
        }
        c1049Te.A07(jSONObject);
        c1049Te.A05(1);
        com.facebook.ads.redexgen.core.InterfaceC1047Tc A08 = this.A05.A08();
        int i = com.facebook.ads.redexgen.core.AbstractC1048Td.A2D;
        java.lang.String A07 = A07(147, 8, 11);
        A08.ABD(A07, i, c1049Te);
        this.A00 = 0;
        if (!com.facebook.ads.redexgen.core.C1086Up.A1u(this.A05)) {
            this.A09.ADX();
            return;
        }
        if (currentTimeMillis <= com.facebook.ads.redexgen.core.C1086Up.A0L(this.A05)) {
            com.facebook.ads.redexgen.core.InterfaceC1485eG interfaceC1485eG = this.A09;
            java.lang.String[] strArr = A0D;
            if (strArr[7].charAt(0) == strArr[4].charAt(0)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0D;
            strArr2[1] = "0XAlcIRGce3nNmobAWWNAzxTwWjfpKo1";
            strArr2[5] = "vX4VpuJxASYV4FwrDvVxGQ4QiWthZxUm";
            interfaceC1485eG.ADX();
            return;
        }
        c1049Te.A05(0);
        this.A05.A08().ABC(A07, com.facebook.ads.redexgen.core.AbstractC1048Td.A2E, c1049Te);
    }

    public final void A0C() {
        java.lang.String A0L;
        if (this.A04.A0Y()) {
            com.facebook.ads.redexgen.core.C1049Te c1049Te = new com.facebook.ads.redexgen.core.C1049Te(A07(107, 29, 25));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(A07(170, 17, 36), this.A04.A0P());
                jSONObject.put(A07(187, 5, 51), this.A03.A2E());
            } catch (org.json.JSONException e) {
                java.lang.String A07 = A07(92, 15, 84);
                java.lang.String A072 = A07(12, 13, 74);
                java.lang.String[] strArr = A0D;
                if (strArr[1].charAt(1) != strArr[5].charAt(1)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A0D;
                strArr2[3] = "qKqF8GsLC";
                strArr2[6] = "yUBs4wOBB81EmWZp6CsNCuI0";
                android.util.Log.e(A07, A072, e);
            }
            c1049Te.A07(jSONObject);
            c1049Te.A05(1);
            com.facebook.ads.redexgen.core.InterfaceC1047Tc A08 = this.A05.A08();
            int i = com.facebook.ads.redexgen.core.AbstractC1048Td.A2G;
            java.lang.String A073 = A07(155, 15, 77);
            A08.ABD(A073, i, c1049Te);
            if (com.facebook.ads.redexgen.core.C1086Up.A0r(this.A05) && com.facebook.ads.redexgen.core.AbstractC1169Xz.A00(this.A05) == com.facebook.ads.redexgen.core.EnumC1168Xy.A07) {
                this.A05.A08().ABD(A073, com.facebook.ads.redexgen.core.AbstractC1048Td.A2F, c1049Te);
                this.A07.ADu(0, null);
                java.lang.String[] strArr3 = A0D;
                if (strArr3[1].charAt(1) != strArr3[5].charAt(1)) {
                    java.lang.String[] strArr4 = A0D;
                    strArr4[7] = "eYeTyqsAvkMxTzxGPJMzaaOJBs1WoRUE";
                    strArr4[4] = "DGSgvEgHkFrTWskIwQomZOyU4ros1fyW";
                    return;
                } else {
                    java.lang.String[] strArr5 = A0D;
                    strArr5[1] = "QXwUk7ZcYbXDO6xLw92fyo5XHWgn18Du";
                    strArr5[5] = "iXthj0ZXJZZP0QlicLBvNNfJ4d5EWvqr";
                    return;
                }
            }
        }
        try {
            com.facebook.ads.redexgen.core.LV lv = this.A08;
            if (!android.text.TextUtils.isEmpty(this.A04.A0I())) {
                A0L = this.A04.A0I();
            } else {
                A0L = this.A04.A0L();
            }
            lv.loadUrl(A0L);
        } catch (java.lang.Exception e2) {
            this.A05.A08().ABC(A07(192, 8, 9), com.facebook.ads.redexgen.core.AbstractC1048Td.A2f, new com.facebook.ads.redexgen.core.C1049Te(e2));
        }
    }

    public final void A0D() {
        if (com.facebook.ads.redexgen.core.C1086Up.A1z(this.A05)) {
            this.A05.A0B().AKU(this.A08);
        }
        this.A08.removeJavascriptInterface(A07(0, 12, 121));
        this.A08.destroy();
    }

    public final void A0E(int i) {
        this.A08.setVisibility(i);
        if (i == 0) {
            this.A08.resumeTimers();
        } else {
            this.A08.pauseTimers();
        }
    }

    public com.facebook.ads.redexgen.core.Y2 getTouchDataRecorder() {
        return this.A08.getTouchDataRecorder();
    }

    public com.facebook.ads.redexgen.core.C1581fp getViewabilityChecker() {
        return this.A08.getViewabilityChecker();
    }
}
