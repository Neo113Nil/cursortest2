package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.nF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2009nF extends com.facebook.ads.redexgen.core.AbstractC0670Eh<com.facebook.ads.redexgen.core.C2009nF> {
    public static java.lang.String[] A0H = {"VuHjt8oOpq8N7C214wGoSA1AvoAEOrJ7", "uFvhlxS5lUy9ksGg6O4Xt3y9x", "z2gekC5V6p56SAeTbAO0jRL35", "AJl44cd0wjf7yp80NhOEfrZac9uQkeAm", "fvb2kSFN69PWkoJ4Ln26XpHSuOzso8Xv", "xYIwGH1EqCgaa9qjZOqbWgZcWwFFG4Ev", "iW7gA0b6LPVcA0KpSRoleRmfzjbkINez", "mxsnKoNumrVzSuMZZmY48wO5LDc3OokM"};
    public final int A00;
    public final int A01;
    public final int A02;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public final int A03;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final com.facebook.ads.redexgen.core.C05549i A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public C2009nF(int i, com.facebook.ads.redexgen.core.C2159pg c2159pg, int i2, com.facebook.ads.redexgen.core.C05549i c05549i, int i3, java.lang.String str, int i4, boolean z) {
        super(i, c2159pg, i2);
        int requiredAdaptiveSupport;
        int A00;
        int A07;
        this.A09 = c05549i;
        if (c05549i.A07) {
            requiredAdaptiveSupport = 24;
        } else {
            requiredAdaptiveSupport = 16;
        }
        this.A0A = c05549i.A06 && (i4 & requiredAdaptiveSupport) != 0;
        this.A0C = z && (super.A02.A0L == -1 || super.A02.A0L <= ((com.facebook.ads.redexgen.core.C2155pc) c05549i).A06) && ((super.A02.A0A == -1 || super.A02.A0A <= ((com.facebook.ads.redexgen.core.C2155pc) c05549i).A05) && ((super.A02.A01 == -1.0f || super.A02.A01 <= ((float) ((com.facebook.ads.redexgen.core.C2155pc) c05549i).A04)) && (super.A02.A05 == -1 || super.A02.A05 <= ((com.facebook.ads.redexgen.core.C2155pc) c05549i).A03)));
        this.A0D = z && (super.A02.A0L == -1 || super.A02.A0L >= ((com.facebook.ads.redexgen.core.C2155pc) c05549i).A0A) && ((super.A02.A0A == -1 || super.A02.A0A >= ((com.facebook.ads.redexgen.core.C2155pc) c05549i).A09) && ((super.A02.A01 == -1.0f || super.A02.A01 >= ((float) ((com.facebook.ads.redexgen.core.C2155pc) c05549i).A08)) && (super.A02.A05 == -1 || super.A02.A05 >= ((com.facebook.ads.redexgen.core.C2155pc) c05549i).A07)));
        this.A0E = com.facebook.ads.redexgen.core.C05539h.A0S(i3, false);
        int bestLanguageIndex = 0;
        int i5 = Integer.MAX_VALUE;
        int i6 = 0;
        while (true) {
            if (i6 >= c05549i.A0L.size()) {
                break;
            }
            int A02 = com.facebook.ads.redexgen.core.C05539h.A02(super.A02, c05549i.A0L.get(i6), false);
            if (A02 > 0) {
                i5 = i6;
                bestLanguageIndex = A02;
                break;
            }
            i6++;
        }
        this.A03 = i5;
        this.A04 = bestLanguageIndex;
        this.A00 = super.A02.A05;
        this.A02 = super.A02.A06();
        A00 = com.facebook.ads.redexgen.core.C05539h.A00(super.A02.A0E, ((com.facebook.ads.redexgen.core.C2155pc) c05549i).A0D);
        this.A06 = A00;
        this.A0B = super.A02.A0E == 0 || (super.A02.A0E & 1) != 0;
        this.A07 = com.facebook.ads.redexgen.core.C05539h.A02(super.A02, str, com.facebook.ads.redexgen.core.C05539h.A0K(str) == null);
        int i7 = Integer.MAX_VALUE;
        int i8 = 0;
        while (true) {
            if (i8 < c05549i.A0M.size()) {
                if (super.A02.A0W != null && super.A02.A0W.equals(c05549i.A0M.get(i8))) {
                    i7 = i8;
                    break;
                }
                i8++;
            } else {
                break;
            }
        }
        this.A05 = i7;
        this.A0G = com.facebook.ads.redexgen.core.AbstractC05087i.A02(i3) == 128;
        this.A0F = com.facebook.ads.redexgen.core.AbstractC05087i.A04(i3) == 64;
        A07 = com.facebook.ads.redexgen.core.C05539h.A07(super.A02.A0W);
        this.A01 = A07;
        this.A08 = A00(i3, requiredAdaptiveSupport);
    }

    private int A00(int i, int i2) {
        if ((super.A02.A0E & 16384) != 0 || !com.facebook.ads.redexgen.core.C05539h.A0S(i, this.A09.A0B)) {
            return 0;
        }
        if (!this.A0C && !this.A09.A0C) {
            return 0;
        }
        if (com.facebook.ads.redexgen.core.C05539h.A0S(i, false) && this.A0D && this.A0C && super.A02.A05 != -1 && !this.A09.A0N && !this.A09.A0O && (i & i2) != 0) {
            return 2;
        }
        return 1;
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public static int A01(com.facebook.ads.redexgen.core.C2009nF c2009nF, com.facebook.ads.redexgen.core.C2009nF c2009nF2) {
        com.facebook.ads.redexgen.core.AbstractC2048ns A09 = com.facebook.ads.redexgen.core.AbstractC2048ns.A01().A09(c2009nF.A0E, c2009nF2.A0E).A08(java.lang.Integer.valueOf(c2009nF.A03), java.lang.Integer.valueOf(c2009nF2.A03), com.facebook.ads.redexgen.core.AbstractC2198qK.A03().A06()).A06(c2009nF.A04, c2009nF2.A04).A06(c2009nF.A06, c2009nF2.A06).A09(c2009nF.A0B, c2009nF2.A0B).A06(c2009nF.A07, c2009nF2.A07).A09(c2009nF.A0C, c2009nF2.A0C).A09(c2009nF.A0D, c2009nF2.A0D).A08(java.lang.Integer.valueOf(c2009nF.A05), java.lang.Integer.valueOf(c2009nF2.A05), com.facebook.ads.redexgen.core.AbstractC2198qK.A03().A06()).A09(c2009nF.A0G, c2009nF2.A0G).A09(c2009nF.A0F, c2009nF2.A0F);
        if (c2009nF.A0G && c2009nF.A0F) {
            int i = c2009nF.A01;
            int i2 = c2009nF2.A01;
            if (A0H[4].charAt(7) == 'c') {
                throw new java.lang.RuntimeException();
            }
            A0H[4] = "L7q4oO3o2NLjefqLZehpujqtxzeKbA5O";
            A09 = A09.A06(i, i2);
        }
        int A05 = A09.A05();
        if (A0H[7].charAt(14) != 'M') {
            return A05;
        }
        A0H[0] = "TVm4CsN40i91TfwfawYUT3UYECpWhhhJ";
        return A05;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.qK != com.google.common.collect.Ordering<java.lang.Integer> */
    public static int A02(com.facebook.ads.redexgen.core.C2009nF c2009nF, com.facebook.ads.redexgen.core.C2009nF c2009nF2) {
        com.facebook.ads.redexgen.core.AbstractC2198qK abstractC2198qK;
        com.facebook.ads.redexgen.core.AbstractC2198qK A06;
        com.facebook.ads.redexgen.core.AbstractC2198qK abstractC2198qK2;
        com.facebook.ads.redexgen.core.AbstractC2198qK abstractC2198qK3;
        if (!c2009nF.A0C || !c2009nF.A0E) {
            abstractC2198qK = com.facebook.ads.redexgen.core.C05539h.A09;
            A06 = abstractC2198qK.A06();
        } else {
            A06 = com.facebook.ads.redexgen.core.C05539h.A09;
        }
        com.facebook.ads.redexgen.core.AbstractC2048ns A01 = com.facebook.ads.redexgen.core.AbstractC2048ns.A01();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(c2009nF.A00);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(c2009nF2.A00);
        boolean z = c2009nF.A09.A0O;
        java.lang.String[] strArr = A0H;
        if (strArr[6].charAt(5) == strArr[5].charAt(5)) {
            throw new java.lang.RuntimeException();
        }
        A0H[4] = "07GlML0JAKsk4TXVd5GQtUxHkz6E2kCF";
        if (z) {
            abstractC2198qK3 = com.facebook.ads.redexgen.core.C05539h.A09;
            abstractC2198qK2 = abstractC2198qK3.A06();
        } else {
            abstractC2198qK2 = com.facebook.ads.redexgen.core.C05539h.A0A;
        }
        return A01.A08(valueOf, valueOf2, abstractC2198qK2).A08(java.lang.Integer.valueOf(c2009nF.A02), java.lang.Integer.valueOf(c2009nF2.A02), A06).A08(java.lang.Integer.valueOf(c2009nF.A00), java.lang.Integer.valueOf(c2009nF2.A00), A06).A05();
    }

    public static int A05(java.util.List<com.facebook.ads.redexgen.core.C2009nF> list, java.util.List<com.facebook.ads.redexgen.core.C2009nF> list2) {
        return com.facebook.ads.redexgen.core.AbstractC2048ns.A01().A08((com.facebook.ads.redexgen.core.C2009nF) java.util.Collections.max(list, new java.util.Comparator() { // from class: com.facebook.ads.redexgen.X.Ei
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int A01;
                A01 = com.facebook.ads.redexgen.core.C2009nF.A01((com.facebook.ads.redexgen.core.C2009nF) obj, (com.facebook.ads.redexgen.core.C2009nF) obj2);
                return A01;
            }
        }), (com.facebook.ads.redexgen.core.C2009nF) java.util.Collections.max(list2, new java.util.Comparator() { // from class: com.facebook.ads.redexgen.X.Ei
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int A01;
                A01 = com.facebook.ads.redexgen.core.C2009nF.A01((com.facebook.ads.redexgen.core.C2009nF) obj, (com.facebook.ads.redexgen.core.C2009nF) obj2);
                return A01;
            }
        }), new java.util.Comparator() { // from class: com.facebook.ads.redexgen.X.Ei
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int A01;
                A01 = com.facebook.ads.redexgen.core.C2009nF.A01((com.facebook.ads.redexgen.core.C2009nF) obj, (com.facebook.ads.redexgen.core.C2009nF) obj2);
                return A01;
            }
        }).A06(list.size(), list2.size()).A08((com.facebook.ads.redexgen.core.C2009nF) java.util.Collections.max(list, new java.util.Comparator() { // from class: com.facebook.ads.redexgen.X.Ej
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int A02;
                A02 = com.facebook.ads.redexgen.core.C2009nF.A02((com.facebook.ads.redexgen.core.C2009nF) obj, (com.facebook.ads.redexgen.core.C2009nF) obj2);
                return A02;
            }
        }), (com.facebook.ads.redexgen.core.C2009nF) java.util.Collections.max(list2, new java.util.Comparator() { // from class: com.facebook.ads.redexgen.X.Ej
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int A02;
                A02 = com.facebook.ads.redexgen.core.C2009nF.A02((com.facebook.ads.redexgen.core.C2009nF) obj, (com.facebook.ads.redexgen.core.C2009nF) obj2);
                return A02;
            }
        }), new java.util.Comparator() { // from class: com.facebook.ads.redexgen.X.Ej
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int A02;
                A02 = com.facebook.ads.redexgen.core.C2009nF.A02((com.facebook.ads.redexgen.core.C2009nF) obj, (com.facebook.ads.redexgen.core.C2009nF) obj2);
                return A02;
            }
        }).A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$VideoTrackInfo> */
    public static com.facebook.ads.redexgen.core.BP<com.facebook.ads.redexgen.core.C2009nF> A06(int pixelCount, com.facebook.ads.redexgen.core.C2159pg c2159pg, com.facebook.ads.redexgen.core.C05549i c05549i, int[] iArr, java.lang.String str, int i) {
        int A03;
        A03 = com.facebook.ads.redexgen.core.C05539h.A03(c2159pg, ((com.facebook.ads.redexgen.core.C2155pc) c05549i).A0F, ((com.facebook.ads.redexgen.core.C2155pc) c05549i).A0E, c05549i.A0Q);
        com.facebook.ads.redexgen.core.C2K A01 = com.facebook.ads.redexgen.core.BP.A01();
        int i2 = 0;
        while (true) {
            int i3 = c2159pg.A01;
            java.lang.String[] strArr = A0H;
            if (strArr[1].length() != strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0H;
            strArr2[6] = "2BgCu4KRvJ20zb7ljNDccj45OL5WeAVY";
            strArr2[5] = "2mW0v3SSZTDHEKi4uYotr9FneqRXRzcE";
            if (i2 < i3) {
                int A06 = c2159pg.A08(i2).A06();
                A01.A04(new com.facebook.ads.redexgen.core.C2009nF(pixelCount, c2159pg, i2, c05549i, iArr[i2], str, i, A03 == Integer.MAX_VALUE || (A06 != -1 && A06 <= A03)));
                i2++;
            } else {
                return A01.A05();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC0670Eh
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final boolean A09(com.facebook.ads.redexgen.core.C2009nF c2009nF) {
        if (this.A0A || com.facebook.ads.redexgen.core.C5C.A1E(super.A02.A0W, ((com.facebook.ads.redexgen.core.AbstractC0670Eh) c2009nF).A02.A0W)) {
            if (!this.A09.A05) {
                if (this.A0G == c2009nF.A0G) {
                    boolean z = this.A0F;
                    if (A0H[7].charAt(14) != 'M') {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr = A0H;
                    strArr[1] = "O482IHGDjbokfcz29RQKjL9l7";
                    strArr[2] = "cI8rqKrS6U71hTMAagWNF9taj";
                    if (z == c2009nF.A0F) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0670Eh
    public final int A08() {
        return this.A08;
    }
}
