package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.d4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1412d4 extends android.widget.FrameLayout {
    public static byte[] A0L;
    public static java.lang.String[] A0M = {"nL4f6tElOIWkWIMY", "pafc", "mmt", "r2KL", "cPD1EcNrMsc9Il", "HjHry0SxIHtlyHB0wW8GJ6CkWWRugdPq", "pjLQgfnHLp272wJByK44k5CENQyu64qM", "USuv5isgmNE5xLLzg"};
    public com.facebook.ads.redexgen.core.EnumC1523et A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A05;
    public final com.facebook.ads.redexgen.core.C1042Sx A06;
    public final com.facebook.ads.redexgen.core.C1636gi A07;
    public final com.facebook.ads.redexgen.core.VI A08;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A09;
    public final com.facebook.ads.redexgen.core.ZU A0A;
    public final com.facebook.ads.redexgen.core.InterfaceC1411d3 A0B;
    public final com.facebook.ads.redexgen.core.C0683Eu A0C;
    public final com.facebook.ads.redexgen.core.C0673Ek A0D;
    public final com.facebook.ads.redexgen.core.C4L A0E;
    public final com.facebook.ads.redexgen.core.EA A0F;
    public final com.facebook.ads.redexgen.core.E8 A0G;
    public final com.facebook.ads.redexgen.core.E4 A0H;
    public final com.facebook.ads.redexgen.core.E2 A0I;
    public final com.facebook.ads.redexgen.core.E0 A0J;
    public final com.facebook.ads.redexgen.core.AbstractC0662Dz A0K;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0L, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0M[0].length() != 16) {
                throw new java.lang.RuntimeException();
            }
            A0M[0] = "7kRjpWt7kPSYf5Zn";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 13);
            i4++;
        }
    }

    public static void A0C() {
        A0L = new byte[]{-112, -94, -97, -97, -110, -101, -95, -127, -106, -102, -110, -81, -64, -67, -84, -65, -76, -70, -71, -20, -12, -13, -28, -29, -14, -29, -9, -11, -25, -26, -60, -5, -41, -11, -25, -12, -19, -17, -20, -28, -17, -30, -16, -16};
    }

    static {
        A0C();
    }

    public C1412d4(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.C1042Sx c1042Sx, com.facebook.ads.redexgen.core.VI vi, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.ZU zu, com.facebook.ads.redexgen.core.InterfaceC1411d3 interfaceC1411d3) {
        super(c1636gi);
        boolean z;
        this.A0J = new com.facebook.ads.redexgen.core.E0() { // from class: com.facebook.ads.redexgen.X.5w
            public static byte[] A01;

            static {
                A01();
            }

            public static java.lang.String A00(int i, int i2, int i3) {
                byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 124);
                }
                return new java.lang.String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{53, 55, 42, 53, 38, 55, 42, 41};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.E1 e1) {
                com.facebook.ads.redexgen.core.InterfaceC1411d3 interfaceC1411d32;
                org.json.JSONObject A03;
                com.facebook.ads.redexgen.core.C1412d4.this.A03 = true;
                interfaceC1411d32 = com.facebook.ads.redexgen.core.C1412d4.this.A0B;
                A03 = com.facebook.ads.redexgen.core.C1412d4.this.A03();
                interfaceC1411d32.AGR(A00(0, 8, 73), A03);
            }
        };
        this.A0I = new com.facebook.ads.redexgen.core.E2() { // from class: com.facebook.ads.redexgen.X.5s
            public static byte[] A01;

            static {
                A01();
            }

            public static java.lang.String A00(int i, int i2, int i3) {
                byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 106);
                }
                return new java.lang.String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{112, 108, 97, 121};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.E3 e3) {
                com.facebook.ads.redexgen.core.InterfaceC1411d3 interfaceC1411d32;
                org.json.JSONObject A03;
                com.facebook.ads.redexgen.core.C1412d4.this.A04 = true;
                interfaceC1411d32 = com.facebook.ads.redexgen.core.C1412d4.this.A0B;
                A03 = com.facebook.ads.redexgen.core.C1412d4.this.A03();
                interfaceC1411d32.AGR(A00(0, 4, 106), A03);
            }
        };
        this.A0H = new com.facebook.ads.redexgen.core.E4() { // from class: com.facebook.ads.redexgen.X.5r
            public static byte[] A01;
            public static java.lang.String[] A02 = {"QUZtp6d2PVvxohxxHBY0lFVIZrOHPJmP", "NfxzKLWElZxETrhEeUBSDM4deWBqLSti", "M1wrkGT1p8fg9I16hadPO98y5LyXX3HA", "lshWtPbnAXBsXbgnJLDmxkjrZI", "6PixpSZW8UzyowqAm", "UIpIdTluG2bhvKFOHpQ9k0cfwSXrRmCx", "lSmcWeUXMp1pu4geeqYJMaSrMHF509BD", "gheUZ0KSYWPh4kTG81LfbEHF2a7TTHcT"};

            public static java.lang.String A00(int i, int i2, int i3) {
                byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
                int i4 = 0;
                while (true) {
                    int length = copyOfRange.length;
                    if (A02[6].charAt(28) != '0') {
                        throw new java.lang.RuntimeException();
                    }
                    A02[6] = "QE45n4HEQOiTUZDVXPk8ylx4JLny0ok5";
                    if (i4 >= length) {
                        return new java.lang.String(copyOfRange);
                    }
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 111);
                    i4++;
                }
            }

            public static void A01() {
                A01 = new byte[]{59, 44, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 62, 48};
            }

            static {
                A01();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4B c4b) {
                com.facebook.ads.redexgen.core.InterfaceC1411d3 interfaceC1411d32;
                org.json.JSONObject A03;
                interfaceC1411d32 = com.facebook.ads.redexgen.core.C1412d4.this.A0B;
                A03 = com.facebook.ads.redexgen.core.C1412d4.this.A03();
                interfaceC1411d32.AGR(A00(0, 5, 92), A03);
            }
        };
        this.A0K = new com.facebook.ads.redexgen.core.AbstractC0662Dz() { // from class: com.facebook.ads.redexgen.X.5q
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4A c4a) {
                com.facebook.ads.redexgen.core.C1412d4.this.A0H(c4a);
                com.facebook.ads.redexgen.core.C1412d4.this.A0A();
            }
        };
        this.A0F = new com.facebook.ads.redexgen.core.EA() { // from class: com.facebook.ads.redexgen.X.5n
            public static byte[] A01;

            static {
                A01();
            }

            public static java.lang.String A00(int i, int i2, int i3) {
                byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 95);
                }
                return new java.lang.String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{107, 103, 101, 120, 100, 109, 124, 109, 108};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4K c4k) {
                com.facebook.ads.redexgen.core.InterfaceC1411d3 interfaceC1411d32;
                com.facebook.ads.redexgen.core.C0673Ek c0673Ek;
                org.json.JSONObject A04;
                com.facebook.ads.redexgen.core.C1412d4.this.A07();
                interfaceC1411d32 = com.facebook.ads.redexgen.core.C1412d4.this.A0B;
                com.facebook.ads.redexgen.core.C1412d4 c1412d4 = com.facebook.ads.redexgen.core.C1412d4.this;
                c0673Ek = com.facebook.ads.redexgen.core.C1412d4.this.A0D;
                A04 = c1412d4.A04(c0673Ek.getDuration());
                interfaceC1411d32.AGR(A00(0, 9, 87), A04);
            }
        };
        this.A0G = new com.facebook.ads.redexgen.core.C04605m(this);
        this.A03 = false;
        this.A04 = false;
        this.A02 = false;
        this.A01 = false;
        this.A07 = c1636gi;
        this.A05 = abstractC1801jd;
        this.A06 = c1042Sx;
        this.A08 = vi;
        this.A09 = interfaceC1177Yh;
        this.A0A = zu;
        this.A0D = new com.facebook.ads.redexgen.core.C0673Ek(c1636gi);
        this.A0B = interfaceC1411d3;
        this.A0D.setFunnelLoggingHandler(vi);
        this.A0D.getEventBus().A03(this.A0J, this.A0I, this.A0H, this.A0K, this.A0F, this.A0G);
        this.A0E = new com.facebook.ads.redexgen.core.C4L(c1636gi, va, this.A0D, abstractC1801jd.A2E());
        if (com.facebook.ads.redexgen.core.C1086Up.A20(this.A07)) {
            z = true;
            this.A0C = new com.facebook.ads.redexgen.core.C0683Eu(c1636gi, va, this.A0D, abstractC1801jd.A2E(), false, this.A0E, null);
        } else {
            z = true;
            this.A0C = null;
        }
        A0B();
        this.A0D.setVideoURI(this.A06.A0T(this.A05.A29().A0H().A09()));
        A09();
        com.facebook.ads.redexgen.core.YB.A0N(this, this.A05.A28().A01().A08(z));
        java.lang.String videoUrl = abstractC1801jd.A29().A0H().A08();
        if (!android.text.TextUtils.isEmpty(videoUrl)) {
            com.facebook.ads.redexgen.core.AbstractC1337br.A00(c1636gi, this, videoUrl);
        }
        addView(this.A0D, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.json.JSONObject A03() {
        return A04(this.A0D.getCurrentPositionInMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.json.JSONObject A04(int i) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(A02(0, 11, 32), i);
            jSONObject.put(A02(11, 8, 62), this.A0D.getDuration());
            jSONObject.put(A02(19, 5, 114), this.A0D.A0m());
            jSONObject.put(A02(24, 12, 117), this.A0D.A0o());
            return jSONObject;
        } catch (org.json.JSONException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        if (this.A02) {
            return;
        }
        this.A02 = true;
    }

    private void A08() {
        this.A0D.postDelayed(new com.facebook.ads.redexgen.core.JC(this), com.facebook.ads.redexgen.core.C1086Up.A0O(this.A07));
    }

    private void A09() {
        this.A0D.postDelayed(new com.facebook.ads.redexgen.core.J8(this), com.facebook.ads.redexgen.core.C1086Up.A0P(this.A07));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        this.A0B.AGR(A02(36, 8, 112), A03());
    }

    private void A0B() {
        if (!android.text.TextUtils.isEmpty(this.A05.A29().A0H().A08())) {
            com.facebook.ads.redexgen.core.C3S c3s = new com.facebook.ads.redexgen.core.C3S(this.A07);
            this.A0D.A0f(c3s);
            c3s.setImage(this.A05.A29().A0H().A08());
        }
        com.facebook.ads.redexgen.core.AnonymousClass34 anonymousClass34 = new com.facebook.ads.redexgen.core.AnonymousClass34(this.A07, true, this.A08);
        this.A0D.A0f(anonymousClass34);
        this.A0D.A0f(new com.facebook.ads.redexgen.core.C0644Dh(anonymousClass34, com.facebook.ads.redexgen.core.EnumC1539f9.A02, true));
        this.A0D.A0f(new com.facebook.ads.redexgen.core.C3B(this.A07));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(com.facebook.ads.redexgen.core.C4A c4a) {
        if (this.A0D.getState() == com.facebook.ads.redexgen.core.EnumC1578fm.A02 && com.facebook.ads.redexgen.core.C1086Up.A1e(this.A07)) {
            this.A0D.postDelayed(new com.facebook.ads.redexgen.core.J5(this, c4a), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(java.lang.String str) {
        this.A07.A0F().A3a(str);
        if (com.facebook.ads.redexgen.core.C1086Up.A1f(this.A07)) {
            A07();
        } else {
            this.A09.A4j(this.A0A.A81());
            this.A09.A4j(this.A0A.A7w());
        }
    }

    public final void A0N() {
        this.A0D.setVolume(this.A05.A29().A0H().A0A() ? 0.0f : 1.0f);
        this.A0D.A0e(com.facebook.ads.redexgen.core.EnumC1523et.A02, 26);
        A08();
    }

    public final void A0O() {
        if (this.A0D != null) {
            if (!this.A02) {
                this.A0D.A0d(com.facebook.ads.redexgen.core.EnumC1515el.A03);
            }
            this.A0D.getEventBus().A04(this.A0J, this.A0I, this.A0H, this.A0K, this.A0F, this.A0G);
            this.A0D.A0W();
        }
        if (this.A0C != null) {
            this.A0C.A07();
        }
        this.A0E.A0p();
    }

    public final void A0P() {
        this.A0D.A0b(9);
        com.facebook.ads.redexgen.core.YB.A0W(this);
        com.facebook.ads.redexgen.core.YB.A0H(this.A0D);
        com.facebook.ads.redexgen.core.YB.A0d(this.A0D);
    }

    public final void A0Q() {
        this.A0D.A0d(com.facebook.ads.redexgen.core.EnumC1515el.A04);
    }

    public final void A0R(boolean z) {
        if (z) {
            this.A0D.setVolume(0.0f);
        } else {
            this.A0D.setVolume(1.0f);
        }
        A0A();
    }

    public final void A0S(boolean z) {
        if (this.A0D.A0n()) {
            return;
        }
        this.A00 = this.A0D.getVideoStartReason();
        this.A01 = z;
        this.A0D.A0i(false, 19);
    }

    public final void A0T(boolean z) {
        if (this.A0D.A0o() || this.A02 || this.A0D.getState() == com.facebook.ads.redexgen.core.EnumC1578fm.A06 || this.A00 == null) {
            return;
        }
        if (!this.A01 || z) {
            this.A0D.A0e(this.A00, 27);
        }
    }

    public final void A0U(boolean z) {
        this.A0D.A0i(z, 18);
    }

    public final void A0V(boolean z) {
        this.A0D.A0e(com.facebook.ads.redexgen.core.EnumC1523et.A04, 25);
    }
}
