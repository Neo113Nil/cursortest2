package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Rd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0997Rd implements com.facebook.ads.internal.api.AdViewApi {
    public static byte[] A0D;
    public static java.lang.String[] A0E = {"8ZsaPqFHBksSubEDxj161z8v83o0PIqL", "1NWTdVv6N7aOqefGpQ3nVAkwh7f4QYaR", "Q4l1tys1ZSMgMj214694goNihNba6PJ2", "j8ts1um9VlgNYzePKTTbdrZm7P7LEYQS", "t56Pwr0qdwmiw03ThNEKvYWwkytCRLDg", "RREINDdqXCKFIVRasebbhTe", "edGRVZA6FwzGspMgtzkdHpprfoIdLjRD", "fNcadsm2hMDvYVzuw1qW3xw"};
    public long A00;
    public android.view.View A01;
    public com.facebook.ads.AdListener A02;
    public com.facebook.ads.redexgen.core.C05107k A03;
    public com.facebook.ads.redexgen.core.C1290b6 A04;
    public java.lang.String A05;
    public java.lang.String A06;
    public final android.util.DisplayMetrics A07;
    public final com.facebook.ads.AdView A08;
    public final com.facebook.ads.internal.api.AdViewParentApi A09;
    public final com.facebook.ads.redexgen.core.AnonymousClass76 A0A;
    public final com.facebook.ads.redexgen.core.EnumC1110Vp A0B;
    public final java.lang.String A0C;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 39);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A0D = new byte[]{-111, -66, -113, -112, -107, -110, -114, -109, -105, -57, -110, -56, -108, -101, -60, -58, 100, 96, 100, 93, 99, 101, 94, 99, -83, -52, -39, -39, -48, -35, -117, -52, -49, -117, -49, -48, -34, -33, -35, -38, -28, -48, -49, -35, -4, 9, 9, 0, com.google.common.base.Ascii.CR, -69, -4, -1, -69, 7, 10, -4, -1, -69, com.google.common.base.Ascii.CR, 0, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.DLE, 0, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SI, 0, -1, -35, -5, 8, 8, 9, com.google.common.base.Ascii.SO, -70, 0, 3, 8, -2, -70, -5, -70, com.google.common.base.Ascii.SO, -1, 7, 10, 6, -5, com.google.common.base.Ascii.SO, -1, -70, com.google.common.base.Ascii.SO, 2, -5, com.google.common.base.Ascii.SO, -70, 6, 9, -5, -2, -70, -4, 3, -2, -70, -63, -65, com.google.common.base.Ascii.CR, -63, -83, -80, -97, -75, -58, -79, -72, -71, -57, -56, -58, -61, -51, -62, -59, -73, -70, -105, -70};
    }

    static {
        A02();
    }

    public C0997Rd(android.content.Context context, java.lang.String str, com.facebook.ads.AdSize adSize, com.facebook.ads.internal.api.AdViewParentApi adViewParentApi, com.facebook.ads.AdView adView) {
        this.A00 = -1L;
        if (adSize != null && adSize != com.facebook.ads.AdSize.INTERSTITIAL) {
            this.A07 = adView.getContext().getResources().getDisplayMetrics();
            this.A0B = com.facebook.ads.redexgen.core.XG.A04(adSize);
            this.A0C = str;
            this.A09 = adViewParentApi;
            this.A08 = adView;
            this.A0A = com.facebook.ads.redexgen.core.C1009Rp.A08(context);
            this.A0A.A0F().A3T(com.facebook.ads.internal.protocol.AdPlacementType.BANNER.toString(), str);
            com.facebook.ads.redexgen.core.O7 o7 = new com.facebook.ads.redexgen.core.O7(str, com.facebook.ads.redexgen.core.XG.A05(this.A0B), com.facebook.ads.internal.protocol.AdPlacementType.BANNER, com.facebook.ads.redexgen.core.XG.A04(adSize), 1, new com.facebook.ads.redexgen.core.C1755ij());
            o7.A06(this.A05);
            o7.A07(this.A06);
            this.A03 = new com.facebook.ads.redexgen.core.C05107k(this.A0A, o7);
            this.A03.A0S(new com.facebook.ads.redexgen.core.C1676hM(this));
            return;
        }
        throw new java.lang.IllegalArgumentException(A01(108, 6, 37));
    }

    public C0997Rd(android.content.Context context, java.lang.String str, java.lang.String str2, com.facebook.ads.internal.api.AdViewParentApi adViewParentApi, com.facebook.ads.AdView adView) throws com.facebook.ads.redexgen.core.C1109Vn {
        this(context, str, A00(str2), adViewParentApi, adView);
        this.A0A.A0F().A4T();
    }

    public static com.facebook.ads.AdSize A00(java.lang.String str) throws com.facebook.ads.redexgen.core.C1109Vn {
        com.facebook.ads.redexgen.core.EnumC1111Vq template = com.facebook.ads.redexgen.core.C1115Vu.A00(str);
        if (template != null) {
            com.facebook.ads.redexgen.core.C1115Vu.A03(template);
            return com.facebook.ads.redexgen.core.XG.A01(template);
        }
        throw new com.facebook.ads.redexgen.core.C1109Vn(com.facebook.ads.internal.protocol.AdErrorType.BID_PAYLOAD_ERROR, java.lang.String.format(java.util.Locale.US, A01(67, 41, 115), str));
    }

    private void A03(java.lang.String str) {
        this.A00 = java.lang.System.currentTimeMillis();
        if (str == null) {
            this.A0A.A0F().A3Q();
        } else {
            com.facebook.ads.redexgen.core.AnonymousClass76 anonymousClass76 = this.A0A;
            if (A0E[1].charAt(22) == 'v') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0E;
            strArr[5] = "M5Y3D3mNGdfLR2WDul4k9MR";
            strArr[7] = "fol70tWokzFUGtpcuxJkkr6";
            anonymousClass76.A0F().A3P();
        }
        com.facebook.ads.redexgen.core.C05107k c05107k = this.A03;
        java.lang.String[] strArr2 = A0E;
        if (strArr2[2].charAt(21) == strArr2[3].charAt(21)) {
            throw new java.lang.RuntimeException();
        }
        A0E[1] = "pe4oZgDQ3sTDNo8k5JxuPcj1mqE4f2TD";
        if (c05107k != null) {
            this.A03.A0W(str);
        }
        this.A0A.A0F().A3O();
        if (A0E[1].charAt(22) != 'v') {
            A0E[1] = "D8Oc2vjooMbkdhwRsJFg2j6kNTTlIbDv";
        }
    }

    public final long A04() {
        return this.A00;
    }

    public final android.util.DisplayMetrics A05() {
        return this.A07;
    }

    public final com.facebook.ads.AdListener A06() {
        return this.A02;
    }

    public final com.facebook.ads.AdView A07() {
        return this.A08;
    }

    public final com.facebook.ads.redexgen.core.C05107k A08() {
        return this.A03;
    }

    public final com.facebook.ads.redexgen.core.AnonymousClass76 A09() {
        return this.A0A;
    }

    public final com.facebook.ads.redexgen.core.EnumC1110Vp A0A() {
        return this.A0B;
    }

    public final void A0B(android.widget.RelativeLayout relativeLayout, android.view.View view) {
        com.facebook.ads.redexgen.core.C1484eF A01;
        this.A0A.A0F().A4g(this.A06 != null);
        if (this.A06 != null && (A01 = com.facebook.ads.redexgen.core.AbstractC1483eE.A01(this.A0A, this.A06)) != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            relativeLayout.addView(A01, new android.widget.RelativeLayout.LayoutParams(layoutParams.width, layoutParams.height));
        }
    }

    public final void A0C(com.facebook.ads.AdListener adListener) {
        this.A0A.A0F().A3M(adListener != null);
        this.A02 = adListener;
    }

    public final void A0D(com.facebook.ads.redexgen.core.C1290b6 c1290b6) {
        this.A04 = c1290b6;
    }

    @Override // com.facebook.ads.internal.api.AdViewApi
    public final com.facebook.ads.AdView.AdViewLoadConfigBuilder buildLoadAdConfig() {
        return new com.facebook.ads.redexgen.core.VO(this);
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A05(A01(114, 7, 45), A01(24, 19, 68), A01(16, 8, 6));
        this.A0A.A0F().A3U();
        if (this.A03 != null) {
            this.A03.A0Y(true);
            this.A03.A0K();
            this.A03 = null;
        }
        if (this.A04 != null) {
            com.facebook.ads.AdView adView = this.A08;
            java.lang.String[] strArr = A0E;
            if (strArr[2].charAt(21) == strArr[3].charAt(21)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0E;
            strArr2[0] = "SHsAoZcgZfma8JU5HMv6EkUhgjUJ0aGa";
            strArr2[4] = "YiN0xr4bPRWWNOnd45hBajl5vHs2Fp2h";
            if (com.facebook.ads.redexgen.core.C1086Up.A1C(adView.getContext())) {
                this.A04.A07();
                if (this.A01 != null) {
                    android.view.ViewOverlay overlay = this.A01.getOverlay();
                    java.lang.String[] strArr3 = A0E;
                    if (strArr3[0].charAt(29) != strArr3[4].charAt(29)) {
                        java.lang.String[] strArr4 = A0E;
                        strArr4[2] = "J1HUKKESb8xh9TFSe40ffgC38LRgNVZ2";
                        strArr4[3] = "o5XwXeFkKzkcKZo9S4DQ1FFyX8pzWZSK";
                        overlay.remove(this.A04);
                    } else {
                        java.lang.String[] strArr5 = A0E;
                        strArr5[0] = "s1kiAbubcu5fNfkZcH7haOM3HmV2C0HH";
                        strArr5[4] = "uWy9U3opZwSsfb0VGZsAFVhup97A7xCm";
                        overlay.remove(this.A04);
                    }
                }
            }
        }
        this.A08.removeAllViews();
        this.A01 = null;
        this.A02 = null;
    }

    @Override // com.facebook.ads.Ad
    public final java.lang.String getPlacementId() {
        return this.A0C;
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean z = this.A03 == null || this.A03.A0Z();
        this.A0A.A0F().A5f(z);
        return z;
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A05(A01(121, 6, 47), A01(43, 24, 116), A01(8, 8, 59));
        A03(null);
    }

    @Override // com.facebook.ads.internal.api.AdViewApi
    public final void loadAd(com.facebook.ads.AdView.AdViewLoadConfig adViewLoadConfig) {
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A05(A01(121, 6, 47), A01(43, 24, 116), A01(0, 8, 54));
        A03(((com.facebook.ads.redexgen.core.VO) adViewLoadConfig).A00());
    }

    @Override // com.facebook.ads.internal.api.AdViewApi, com.facebook.ads.internal.api.AdViewParentApi
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        this.A09.onConfigurationChanged(configuration);
        if (this.A01 != null) {
            com.facebook.ads.redexgen.core.AbstractC1113Vs.A01(this.A07, this.A01, this.A0B);
        }
    }

    @Override // com.facebook.ads.internal.api.AdViewApi, com.facebook.ads.Ad
    @java.lang.Deprecated
    public final void setExtraHints(com.facebook.ads.ExtraHints extraHints) {
        this.A05 = extraHints.getHints();
        this.A06 = extraHints.getMediationData();
        if (com.facebook.ads.redexgen.core.C1086Up.A0l(this.A0A) && this.A03 != null) {
            this.A03.A08.A06(this.A05);
            this.A03.A08.A07(this.A06);
        }
    }
}
