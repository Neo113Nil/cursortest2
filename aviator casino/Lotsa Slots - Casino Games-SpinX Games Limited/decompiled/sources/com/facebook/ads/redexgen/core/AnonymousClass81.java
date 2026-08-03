package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.81, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass81<NativeViewabilityLogger> implements com.facebook.ads.redexgen.core.InterfaceC1832k8 {
    public static byte[] A0J;
    public static java.lang.String[] A0K = {"NhwOmA8H17maQr2Thm3XPPVG1xwEsLhZ", "rranxCubAcBFDRhPr2LDrxoK3htxcyeL", "LmhV8", "ZLGOK7uKxyyp5W3sNEqoBEODv8zXcPE1", "dNK0bBZMrDk2YJmjrhSzlk1RMTFmUAsD", "q33l17MPfjO0fzYSahPh7EE95Ux5x03H", "4VfBn9Mh4W5rafl7A4va0uDeREUgOp63", "NLrbv196ww605txiYhOndsfSQjY"};
    public static final java.lang.String A0L;
    public com.facebook.ads.redexgen.core.N9 A00;
    public com.facebook.ads.redexgen.core.NA A01;
    public com.facebook.ads.redexgen.core.C1809jl A02;
    public com.facebook.ads.redexgen.core.C05147o A03;
    public com.facebook.ads.redexgen.core.AnonymousClass76 A04;
    public com.facebook.ads.redexgen.core.VA A05;
    public com.facebook.ads.redexgen.core.EnumC1110Vp A06;
    public com.facebook.ads.redexgen.core.InterfaceC1285b1 A07;
    public com.facebook.ads.redexgen.core.LV A08;
    public com.facebook.ads.redexgen.core.AnonymousClass62 A09;
    public com.facebook.ads.redexgen.core.AbstractC1580fo A0A;
    public com.facebook.ads.redexgen.core.C1581fp A0B;
    public java.lang.String A0D;
    public final java.lang.String A0I = java.util.UUID.randomUUID().toString();
    public boolean A0E = false;
    public boolean A0F = false;
    public boolean A0G = false;
    public final com.facebook.ads.redexgen.core.Y2 A0H = new com.facebook.ads.redexgen.core.Y2();
    public java.lang.Boolean A0C = false;

    public static java.lang.String A08(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0J, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + androidx.media3.common.PlaybackException.ERROR_CODE_NOT_AVAILABLE_IN_REGION);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0B() {
        A0J = new byte[]{com.google.common.base.Ascii.FS, 40, 38, -25, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.ESC, 40, 40, 36, -25, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.GS, 44, -25, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SUB, 39, 39, com.google.common.base.Ascii.RS, 43, -25, com.google.common.base.Ascii.FS, 37, 34, com.google.common.base.Ascii.FS, 36, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.GS, -15, -30, -11, -15, -84, -27, -15, -22, -23, -21, -22, -36, -93, -82};
    }

    static {
        A0B();
        A0L = com.facebook.ads.redexgen.core.AnonymousClass81.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0A() {
        if (this.A00 != null && this.A09 != null && this.A03 != null && this.A03.A1g()) {
            this.A00.ADD(this, this.A09);
        }
        if (this.A00 != null) {
            boolean z = this.A0E;
            if (A0K[1].charAt(21) == 'I') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0K;
            strArr[6] = "pcQhCrMOoUvf1wSUiS8eXhj7G6bioSrh";
            strArr[4] = "JWZBC7ZhFf7k7YrTz5pa22tV9NT1Mc4w";
            if (z && (this.A0F || !this.A0G)) {
                com.facebook.ads.redexgen.core.N9 n9 = this.A00;
                if (A0K[3].charAt(25) != 'G') {
                    A0K[3] = "irPj8aYnTZH6GsdLYSbTyVfXBLXHQnPh";
                    n9.ADD(this, this.A08);
                } else {
                    A0K[3] = "5PA9hoTjlgD01Tr6eTkR8jxCvDfXc2RO";
                    n9.ADD(this, this.A08);
                }
            }
        }
        this.A04.A0F().A4O(this.A00 != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0C(int i, com.facebook.ads.redexgen.core.C1068Tx c1068Tx) {
        com.facebook.ads.redexgen.core.C1826k2 c1826k2 = new com.facebook.ads.redexgen.core.C1826k2(this);
        this.A09 = new com.facebook.ads.redexgen.core.AnonymousClass62(this.A04, this.A05, c1826k2, this.A03, A08(0, 31, 79), 2, this.A0H);
        this.A0A = new com.facebook.ads.redexgen.core.C1825k1(this);
        this.A0B = new com.facebook.ads.redexgen.core.C1581fp(this.A09, c1068Tx.A04(), c1068Tx.A09(), true, new java.lang.ref.WeakReference(this.A0A), this.A04);
        this.A0B.A0W(this.A03.A0m());
        this.A0B.A0X(this.A03.A0n());
        this.A09.setVisibility(0);
        this.A04.getResources();
        this.A09.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, i));
        this.A09.AKD();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    private void A0F(com.facebook.ads.redexgen.core.C1068Tx c1068Tx, org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.EnumC1110Vp enumC1110Vp) {
        this.A0F = false;
        final com.facebook.ads.redexgen.core.C1811jn A00 = com.facebook.ads.redexgen.core.C1811jn.A00(this.A04, jSONObject);
        this.A0D = A00.A7O();
        if (com.facebook.ads.redexgen.core.AbstractC0892Mx.A06(this.A04, A00, this.A05)) {
            this.A04.A0F().A52();
            this.A00.AEN(this, com.facebook.ads.redexgen.core.C1108Vm.A00(com.facebook.ads.internal.protocol.AdErrorType.NO_FILL));
            return;
        }
        this.A07 = new com.facebook.ads.redexgen.core.AbstractC0858Lp() { // from class: com.facebook.ads.redexgen.X.82
            public static byte[] A02;
            public static java.lang.String[] A03 = {"dvnbyrX9L5Wlup6c2JnWkpTYBAz3QIun", "ITj", "KqeTcLSx6Zay5vtxcnHqZ", "bGeXa7nDz1byFpBCq22utpLnb", "UYph9iPsD3jee8BOLuPQ6r57rjKJpmVb", "DfaYbRSw6X21pxGApii0qweOJ64z1eNB", "52vckdype7aS5lLwU46sLHF0XTMQAze7", "uuBWL9In1wjj"};

            public static java.lang.String A00(int i, int i2, int i3) {
                byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 105);
                }
                return new java.lang.String(copyOfRange);
            }

            public static void A01() {
                A02 = new byte[]{67, 116, 116, 105, 116, 38, 99, 126, 99, 101, 115, 114, 111, 104, 97, 38, 103, 101, 114, 111, 105, 104, 119, 117, 120, 120, 113, 102, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 109, 100, 113, 116, 112, 115, 118, 81, 74, 77, 85, 81, 65, 109, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO};
            }

            static {
                A01();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1285b1
            public final void ACz() {
                boolean z;
                com.facebook.ads.redexgen.core.AnonymousClass81.this.A0F = true;
                z = com.facebook.ads.redexgen.core.AnonymousClass81.this.A0G;
                if (z) {
                    com.facebook.ads.redexgen.core.AnonymousClass81.this.A0A();
                }
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC0858Lp, com.facebook.ads.redexgen.core.InterfaceC1285b1
            public final void ADN(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
                com.facebook.ads.redexgen.core.AnonymousClass76 anonymousClass76;
                java.lang.String str2;
                com.facebook.ads.redexgen.core.AnonymousClass76 anonymousClass762;
                com.facebook.ads.redexgen.core.VA va;
                com.facebook.ads.redexgen.core.C05147o c05147o;
                com.facebook.ads.redexgen.core.C05147o c05147o2;
                com.facebook.ads.redexgen.core.C0900Ng A2A;
                java.lang.String str3;
                com.facebook.ads.redexgen.core.AnonymousClass76 anonymousClass763;
                com.facebook.ads.redexgen.core.N9 n9;
                com.facebook.ads.redexgen.core.N9 n92;
                anonymousClass76 = com.facebook.ads.redexgen.core.AnonymousClass81.this.A04;
                anonymousClass76.A0F().A4P();
                android.net.Uri A002 = com.facebook.ads.redexgen.core.XB.A00(str);
                map.put(A00(22, 10, 125), com.facebook.ads.internal.protocol.AdPlacementType.BANNER.name());
                str2 = com.facebook.ads.redexgen.core.AnonymousClass81.this.A0I;
                map.put(A00(36, 8, 77), str2);
                anonymousClass762 = com.facebook.ads.redexgen.core.AnonymousClass81.this.A04;
                va = com.facebook.ads.redexgen.core.AnonymousClass81.this.A05;
                java.lang.String A7O = A00.A7O();
                c05147o = com.facebook.ads.redexgen.core.AnonymousClass81.this.A03;
                if (c05147o == null) {
                    A2A = null;
                } else {
                    com.facebook.ads.redexgen.core.AnonymousClass81 anonymousClass81 = com.facebook.ads.redexgen.core.AnonymousClass81.this;
                    if (A03[7].length() == 4) {
                        throw new java.lang.RuntimeException();
                    }
                    A03[2] = "7FoTEC4l3Pv3ceMVIqf";
                    c05147o2 = anonymousClass81.A03;
                    A2A = c05147o2.A2A();
                }
                com.facebook.ads.redexgen.core.AbstractC0888Mt adAction = com.facebook.ads.redexgen.core.C0889Mu.A00(anonymousClass762, va, A7O, A002, map, A2A);
                com.facebook.ads.redexgen.core.EnumC0885Mq enumC0885Mq = com.facebook.ads.redexgen.core.EnumC0885Mq.A09;
                if (adAction != null) {
                    try {
                        anonymousClass763 = com.facebook.ads.redexgen.core.AnonymousClass81.this.A04;
                        anonymousClass763.A0F().A4M();
                        enumC0885Mq = adAction.A0G(null);
                    } catch (java.lang.Exception e) {
                        str3 = com.facebook.ads.redexgen.core.AnonymousClass81.A0L;
                        android.util.Log.e(str3, A00(0, 22, 111), e);
                    }
                }
                if (A00(32, 4, 123).equals(A002.getScheme()) && com.facebook.ads.redexgen.core.C0889Mu.A04(A002.getAuthority())) {
                    n9 = com.facebook.ads.redexgen.core.AnonymousClass81.this.A00;
                    if (n9 != null && enumC0885Mq != com.facebook.ads.redexgen.core.EnumC0885Mq.A06) {
                        n92 = com.facebook.ads.redexgen.core.AnonymousClass81.this.A00;
                        n92.ADC(com.facebook.ads.redexgen.core.AnonymousClass81.this);
                    }
                }
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1285b1
            public final void AEA() {
                com.facebook.ads.redexgen.core.AnonymousClass76 anonymousClass76;
                com.facebook.ads.redexgen.core.C1809jl c1809jl;
                com.facebook.ads.redexgen.core.C1809jl c1809jl2;
                com.facebook.ads.redexgen.core.C1809jl c1809jl3;
                anonymousClass76 = com.facebook.ads.redexgen.core.AnonymousClass81.this.A04;
                com.facebook.ads.redexgen.core.InterfaceC1863kf A0F = anonymousClass76.A0F();
                c1809jl = com.facebook.ads.redexgen.core.AnonymousClass81.this.A02;
                A0F.A4Q(c1809jl != null);
                c1809jl2 = com.facebook.ads.redexgen.core.AnonymousClass81.this.A02;
                if (c1809jl2 != null) {
                    c1809jl3 = com.facebook.ads.redexgen.core.AnonymousClass81.this.A02;
                    c1809jl3.A03();
                }
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1285b1
            public final void AF8() {
                com.facebook.ads.redexgen.core.AnonymousClass76 anonymousClass76;
                com.facebook.ads.redexgen.core.C1809jl c1809jl;
                anonymousClass76 = com.facebook.ads.redexgen.core.AnonymousClass81.this.A04;
                anonymousClass76.A0F().A4S();
                c1809jl = com.facebook.ads.redexgen.core.AnonymousClass81.this.A02;
                c1809jl.A09();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1285b1
            public final void AGg() {
            }
        };
        this.A08 = new com.facebook.ads.redexgen.core.LV(this.A04, (java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC1285b1>) new java.lang.ref.WeakReference(this.A07), c1068Tx.A04(), A7O());
        this.A08.A0L(c1068Tx.A07(), c1068Tx.A08());
        com.facebook.ads.redexgen.core.N4 impressionHelper = new com.facebook.ads.redexgen.core.C1824k0(this);
        this.A02 = new com.facebook.ads.redexgen.core.C1809jl(this.A04, this.A05, this.A08, this.A08.getViewabilityChecker(), impressionHelper, enumC1110Vp);
        this.A02.A0A(A00);
        this.A08.loadDataWithBaseURL(com.facebook.ads.redexgen.core.AbstractC1288b4.A01(com.facebook.ads.internal.settings.AdInternalSettings.getUrlPrefix()), A00.A04(), A08(31, 9, 19), A08(40, 5, 12), null);
        this.A0E = true;
        A0A();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0051, code lost:
    
        if (com.facebook.ads.redexgen.core.C1086Up.A2H(r10.A04) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        if (com.facebook.ads.redexgen.core.SN.A0A(r10.A03.A1H()) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        if (com.facebook.ads.redexgen.core.C1086Up.A2H(r10.A04) != false) goto L13;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0G(com.facebook.ads.redexgen.core.EnumC1110Vp enumC1110Vp, com.facebook.ads.redexgen.core.C1068Tx c1068Tx) {
        int i;
        int bannerHeight;
        if (this.A03 != null) {
            com.facebook.ads.redexgen.core.VA va = this.A05;
            if (A0K[1].charAt(21) == 'I') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0K;
            strArr[6] = "0asQ5nS3mEJJFXqECkaJp8czAINd5ojj";
            strArr[4] = "wkfCN0fAVUFan65EWCqz3ffd3K2ZXjjS";
            if (va == null) {
                return;
            }
            int A03 = enumC1110Vp.A03();
            if (A0K[3].charAt(25) != 'G') {
                A0K[5] = "7AAzPingpmVfFCqSXKHauNoNKo9Xv93Z";
                i = (int) (A03 * android.content.res.Resources.getSystem().getDisplayMetrics().density);
            } else {
                i = (int) (A03 * android.content.res.Resources.getSystem().getDisplayMetrics().density);
            }
            if (bannerHeight == 0) {
                A0C(i, c1068Tx);
            } else {
                new com.facebook.ads.redexgen.core.SN(new com.facebook.ads.redexgen.core.C1042Sx(this.A04), this.A03.A1H(), this.A03.A10(), this.A03.A1D(), true, new com.facebook.ads.redexgen.core.C1828k4(this, i, c1068Tx, this)).A0B();
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.N1
    public final java.lang.String A7O() {
        return this.A0D;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.N1
    public final com.facebook.ads.internal.protocol.AdPlacementType A8k() {
        if (com.facebook.ads.redexgen.core.C1086Up.A1A(this.A04)) {
            com.facebook.ads.redexgen.core.EnumC1110Vp enumC1110Vp = this.A06;
            java.lang.String[] strArr = A0K;
            if (strArr[2].length() == strArr[7].length()) {
                throw new java.lang.RuntimeException();
            }
            A0K[0] = "gRyzGCsQg6apk2eHBZ3N290V4KDgGwY2";
            if (enumC1110Vp != null && this.A06 == com.facebook.ads.redexgen.core.EnumC1110Vp.A09) {
                return com.facebook.ads.internal.protocol.AdPlacementType.MEDIUM_RECTANGLE;
            }
        }
        return com.facebook.ads.internal.protocol.AdPlacementType.BANNER;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1832k8
    public final void AAt(com.facebook.ads.redexgen.core.AnonymousClass76 anonymousClass76, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.EnumC1110Vp enumC1110Vp, com.facebook.ads.redexgen.core.N9 n9, org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.C1068Tx c1068Tx) {
        anonymousClass76.A0F().A4N();
        this.A04 = anonymousClass76;
        this.A05 = va;
        this.A00 = n9;
        this.A06 = enumC1110Vp;
        this.A0G = com.facebook.ads.redexgen.core.C1086Up.A1o(this.A04.getApplicationContext());
        this.A03 = com.facebook.ads.redexgen.core.C05147o.A00(jSONObject, this.A04);
        if (this.A03.A1g()) {
            A0G(enumC1110Vp, c1068Tx);
        } else {
            A0F(c1068Tx, jSONObject, enumC1110Vp);
        }
        this.A01 = new com.facebook.ads.redexgen.core.NA(this.A04, this.A0I, this, n9);
        this.A01.A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.N1
    public final boolean AKL() {
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.N1
    public final void onDestroy() {
        this.A04.A0F().A4L(this.A08 != null);
        if (this.A08 != null) {
            this.A08.destroy();
            this.A08 = null;
            this.A07 = null;
        }
        if (this.A01 != null) {
            this.A01.A03();
        }
    }
}
