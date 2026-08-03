package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Nu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0914Nu {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"SwW", "nKJOmWTx3LjNZvOp7YbBROgXIyGkfXUh", "cNvS8LZQYgXEdOP85dYAvAy4C3J", "ICxq6EmLG0dgZi7UJ5PBV2wBsvrmCfpb", "tKedy3gZYTLe", "bmz0vq", "hvIAQTYE0cdtFIL2", "tj9oqRvQS19ndgZTuA"};
    public com.facebook.ads.redexgen.core.C1042Sx A00;
    public com.facebook.ads.redexgen.core.EnumC1297bD A01 = com.facebook.ads.redexgen.core.EnumC1297bD.A05;
    public java.util.ArrayList<com.facebook.ads.redexgen.core.C1420dC> A02 = new java.util.ArrayList<>();
    public final com.facebook.ads.redexgen.core.NQ A03;
    public final com.facebook.ads.redexgen.core.InterfaceC0913Nt A04;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 97);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-35, com.google.common.base.Ascii.ETB, 35, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.ESC, -66, -29, -23, -38, -25, -29, -42, -31, -107, -70, -25, -25, -28, -25, -107, -89, -91, -91, -85, -107, -20, -34, -23, -35, -28, -22, -23, -107, -42, -107, -21, -42, -31, -34, -39, -107, -74, -39, -66, -29, -37, -28, -93, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.CAN, 19, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.NAK, 40, com.google.common.base.Ascii.NAK, 19, com.google.common.base.Ascii.SYN, 41, 34, com.google.common.base.Ascii.CAN, 32, com.google.common.base.Ascii.EM, -29, -14, -21, -36, -31, -38, -30, -25, -40, -23, -38, -21, -38, -26, -20, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.DC4, 19, -16, 19, -13, com.google.common.base.Ascii.DLE, 35, com.google.common.base.Ascii.DLE, -15, 36, com.google.common.base.Ascii.GS, 19, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.DC4, 63, 68, 74, 59, 72, 73, 74, 63, 74, 63, 55, 66};
    }

    static {
        A06();
    }

    public C0914Nu(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.O8 o8, com.facebook.ads.redexgen.core.InterfaceC0913Nt interfaceC0913Nt, java.lang.String str) {
        org.json.JSONObject dataObject = o8.A03();
        this.A03 = A01(c1636gi, o8, str, dataObject);
        this.A04 = interfaceC0913Nt;
    }

    private com.facebook.ads.AdError A00(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        if (abstractC1801jd == null || abstractC1801jd.A2G().isEmpty()) {
            c1636gi.A08().ABC(A04(62, 3, 33), com.facebook.ads.redexgen.core.AbstractC1048Td.A0Z, new com.facebook.ads.redexgen.core.C1049Te(A04(5, 43, 20)));
            return com.facebook.ads.AdError.internalError(2006);
        }
        return null;
    }

    public static com.facebook.ads.redexgen.core.NQ A01(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.O8 o8, java.lang.String str, org.json.JSONObject jSONObject) {
        com.facebook.ads.redexgen.core.NQ nq = null;
        if (jSONObject.has(A04(65, 12, 24))) {
            try {
                nq = com.facebook.ads.redexgen.core.C1795jT.A01(jSONObject, c1636gi, true);
                nq.A1Q(true);
                nq.A1N(A04(96, 12, 117));
            } catch (org.json.JSONException unused) {
            }
        }
        if (nq == null) {
            nq = com.facebook.ads.redexgen.core.C05137n.A00(jSONObject, c1636gi);
        }
        nq.A1M(str);
        com.facebook.ads.redexgen.core.C1068Tx A01 = o8.A01();
        if (A01 != null) {
            nq.A1I(A01.A06());
        }
        return nq;
    }

    private com.facebook.ads.redexgen.core.C1042Sx A03(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        return this.A00 != null ? this.A00 : new com.facebook.ads.redexgen.core.C1042Sx(c1636gi);
    }

    private void A08(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.C05137n c05137n) {
        com.facebook.ads.redexgen.core.C0908No playableData = c05137n.A29().A0H().A07();
        A0B(playableData != null ? playableData.A0H() : com.facebook.ads.redexgen.core.EnumC1297bD.A05);
        com.facebook.ads.redexgen.core.C1781jC c1781jC = new com.facebook.ads.redexgen.core.C1781jC(this);
        com.facebook.ads.redexgen.core.C1042Sx c1042Sx = new com.facebook.ads.redexgen.core.C1042Sx(c1636gi);
        boolean z = com.facebook.ads.redexgen.core.C1086Up.A2H(c1636gi) && com.facebook.ads.redexgen.core.SN.A0A(c05137n.A1H());
        if (z) {
            com.facebook.ads.redexgen.core.SN unifiedAssetsLoader = new com.facebook.ads.redexgen.core.SN(c1042Sx, c05137n.A1H(), c05137n.A10(), c05137n.A1D(), z, new com.facebook.ads.redexgen.core.C1780jB(this));
            c1042Sx.A0e(new com.facebook.ads.redexgen.core.VI(c05137n.A2E(), c1636gi.A0A()));
            unifiedAssetsLoader.A0B();
            return;
        }
        com.facebook.ads.redexgen.core.O5.A02(c1636gi, c05137n, true, c1781jC);
    }

    private void A09(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.util.EnumSet<com.facebook.ads.CacheFlag> enumSet, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, int i, com.facebook.ads.redexgen.core.InterfaceC0913Nt interfaceC0913Nt) {
        boolean isDSL = abstractC1801jd.A1g();
        com.facebook.ads.redexgen.core.C1042Sx A03 = A03(c1636gi);
        A03.A0e(new com.facebook.ads.redexgen.core.VI(abstractC1801jd.A2E(), c1636gi.A0A()));
        boolean z = com.facebook.ads.redexgen.core.C1086Up.A2H(c1636gi) && com.facebook.ads.redexgen.core.SN.A0A(abstractC1801jd.A1H());
        if (z) {
            new com.facebook.ads.redexgen.core.SN(A03, abstractC1801jd.A1H(), abstractC1801jd.A10(), abstractC1801jd.A1D(), z, new com.facebook.ads.redexgen.core.C1784jF(this, c1636gi, isDSL, abstractC1801jd, interfaceC0913Nt)).A0B();
            return;
        }
        java.lang.String A04 = A04(96, 12, 117);
        if (isDSL) {
            com.facebook.ads.redexgen.core.C1038St c1038St = new com.facebook.ads.redexgen.core.C1038St(abstractC1801jd.A0x(), abstractC1801jd.A1D(), A04);
            c1038St.A04 = true;
            c1038St.A03 = A04(0, 5, 78);
            A03.A0Y(c1038St);
        }
        A03.A0d(new com.facebook.ads.redexgen.core.C1040Sv(abstractC1801jd.A2C().A01(), com.facebook.ads.redexgen.core.C1473e4.A04, com.facebook.ads.redexgen.core.C1473e4.A04, abstractC1801jd.A1D(), A04(96, 12, 117)));
        boolean isUnifiedAssetsLoaderEnabled = enumSet.contains(com.facebook.ads.CacheFlag.VIDEO);
        int i2 = 0;
        boolean A30 = com.facebook.ads.redexgen.core.C1086Up.A30(c1636gi, com.facebook.ads.redexgen.core.C1563fX.A03());
        for (com.facebook.ads.redexgen.core.NR nr : abstractC1801jd.A2G()) {
            com.facebook.ads.redexgen.core.C1040Sv c1040Sv = new com.facebook.ads.redexgen.core.C1040Sv(nr.A0H().A08(), com.facebook.ads.redexgen.core.O1.A00(nr.A0H()), com.facebook.ads.redexgen.core.O1.A01(nr.A0H()), abstractC1801jd.A1D(), A04(96, 12, 117));
            if (i2 == 0) {
                A03.A0c(c1040Sv);
            } else {
                A03.A0d(c1040Sv);
            }
            java.util.Iterator<java.lang.String> it = nr.A0K().A02().iterator();
            while (it.hasNext()) {
                A03.A0d(new com.facebook.ads.redexgen.core.C1040Sv(it.next(), -1, -1, abstractC1801jd.A1D(), A04(96, 12, 117)));
            }
            if (isUnifiedAssetsLoaderEnabled && !android.text.TextUtils.isEmpty(nr.A0H().A09())) {
                com.facebook.ads.redexgen.core.C1038St c1038St2 = new com.facebook.ads.redexgen.core.C1038St(nr.A0H().A09(), abstractC1801jd.A1D(), A04(96, 12, 117), nr.A0H().A06());
                c1038St2.A04 = false;
                if (i2 == 0) {
                    if (isDSL && !A30) {
                        A03.A0Y(c1038St2);
                    } else {
                        A03.A0b(c1038St2);
                    }
                } else if (isDSL && !A30) {
                    A03.A0Z(c1038St2);
                } else {
                    A03.A0a(c1038St2);
                }
            }
            i2++;
        }
        if (abstractC1801jd.A1W() && !android.text.TextUtils.isEmpty(abstractC1801jd.A11())) {
            A03.A0d(new com.facebook.ads.redexgen.core.C1040Sv(abstractC1801jd.A11(), com.facebook.ads.redexgen.core.C0950Pe.A0A, com.facebook.ads.redexgen.core.C0950Pe.A0A, abstractC1801jd.A1D(), A04(96, 12, 117)));
        }
        com.facebook.ads.redexgen.core.O0.A00(abstractC1801jd, A03, A04);
        A03.A0X(new com.facebook.ads.redexgen.core.C1782jD(this, c1636gi, isDSL, abstractC1801jd, interfaceC0913Nt), new com.facebook.ads.redexgen.core.C1035Sq(abstractC1801jd.A1D(), A04, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.util.EnumSet<com.facebook.ads.CacheFlag> enumSet, com.facebook.ads.redexgen.core.C1795jT c1795jT, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, int i, com.facebook.ads.redexgen.core.InterfaceC0913Nt interfaceC0913Nt) {
        A09(c1636gi, enumSet, abstractC1801jd, i, new com.facebook.ads.redexgen.core.C1786jH(this, c1636gi, abstractC1801jd, c1795jT, i, interfaceC0913Nt, enumSet));
    }

    private void A0B(com.facebook.ads.redexgen.core.EnumC1297bD enumC1297bD) {
        this.A01 = enumC1297bD;
    }

    private boolean A0C(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        com.facebook.ads.AdError A00 = A00(c1636gi, abstractC1801jd);
        if (A00 != null) {
            this.A04.ACo(A00);
            return true;
        }
        return false;
    }

    public final com.facebook.ads.redexgen.core.NQ A0D() {
        return this.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        return com.facebook.ads.redexgen.core.WK.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.facebook.ads.redexgen.core.WK A0E() {
        if (this.A03.A1b()) {
            return com.facebook.ads.redexgen.core.WK.A04;
        }
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd = (com.facebook.ads.redexgen.core.AbstractC1801jd) this.A03;
        if (abstractC1801jd.A1g()) {
            return com.facebook.ads.redexgen.core.WK.A06;
        }
        if (abstractC1801jd.A2G().size() > 1) {
            return com.facebook.ads.redexgen.core.WK.A0A;
        }
        com.facebook.ads.redexgen.core.C0908No A07 = abstractC1801jd.A29().A0H().A07();
        if (A06[4].length() == 14) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A06;
        strArr[1] = "HO5lN2vl3hawZ3xdOTbB4PXxItmZOFKM";
        strArr[3] = "QabHGQsenJFHZf5mHftqzVXi6FXcwsQx";
        if (A07 != null) {
            if (!abstractC1801jd.A1n()) {
                boolean A1u = abstractC1801jd.A1u();
                if (A06[0].length() != 2) {
                    java.lang.String[] strArr2 = A06;
                    strArr2[1] = "iV2CDA2M2IfUZLXvhnmiNr1pV0Sur2CQ";
                    strArr2[3] = "GDT4frbvCKvkZrCQcOaJTMqN9T6RIdn0";
                }
            }
            return com.facebook.ads.redexgen.core.WK.A0E;
        }
        boolean A0L = A0L(abstractC1801jd);
        if (A06[0].length() == 2) {
            throw new java.lang.RuntimeException();
        }
        A06[0] = "iDu";
        if (A0L) {
            return com.facebook.ads.redexgen.core.WK.A0D;
        }
        return com.facebook.ads.redexgen.core.WK.A0B;
    }

    public final com.facebook.ads.redexgen.core.EnumC1297bD A0F() {
        return this.A01;
    }

    public final java.lang.String A0G() {
        if (this.A03.A1b()) {
            return ((com.facebook.ads.redexgen.core.C1795jT) this.A03).A2A();
        }
        return ((com.facebook.ads.redexgen.core.AbstractC1801jd) this.A03).A2E();
    }

    public final void A0H() {
        this.A04.AKX();
    }

    public final void A0I(android.content.Intent intent, com.facebook.ads.RewardData rewardData, java.lang.String str) {
        this.A03.A1K(rewardData);
        this.A03.A1O(str);
        if (A0D().A1b()) {
            intent.putExtra(A04(77, 19, 78), this.A03);
        }
        intent.putExtra(A04(48, 14, 83), this.A03);
    }

    public final void A0J(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.util.EnumSet<com.facebook.ads.CacheFlag> enumSet) {
        if (A0E() == com.facebook.ads.redexgen.core.WK.A04) {
            com.facebook.ads.redexgen.core.C1795jT c1795jT = (com.facebook.ads.redexgen.core.C1795jT) this.A03;
            com.facebook.ads.redexgen.core.AbstractC1801jd A26 = c1795jT.A26();
            if (A0C(c1636gi, A26) || A26 == null) {
                return;
            }
            this.A04.AHY();
            A0A(c1636gi, enumSet, c1795jT, A26, 0, this.A04);
            return;
        }
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd = (com.facebook.ads.redexgen.core.AbstractC1801jd) this.A03;
        if (A06[5].length() == 0) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A06;
        strArr[1] = "h3j4XQE4N9RDZ4AU6tvjsFYKX3e30HKG";
        strArr[3] = "lDhcJ7lgFtqhZjTb781X3zaoWDc2BWUc";
        if (A0C(c1636gi, abstractC1801jd)) {
            return;
        }
        this.A04.AHY();
        if (A0E() == com.facebook.ads.redexgen.core.WK.A0C) {
            com.facebook.ads.redexgen.core.C05137n c05137n = (com.facebook.ads.redexgen.core.C05137n) this.A03;
            java.lang.String[] strArr2 = A06;
            if (strArr2[2].length() != strArr2[6].length()) {
                A06[7] = "0uVLF1bkkTEn2WeYm46QMmOd1A6";
                A08(c1636gi, c05137n);
                return;
            } else {
                A08(c1636gi, c05137n);
                return;
            }
        }
        A09(c1636gi, enumSet, (com.facebook.ads.redexgen.core.C05137n) this.A03, -1, this.A04);
    }

    public final boolean A0K() {
        return this.A03.A1U();
    }

    public final boolean A0L(com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        return !android.text.TextUtils.isEmpty(abstractC1801jd.A29().A0H().A09());
    }
}
