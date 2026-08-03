package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class S3 implements com.facebook.ads.internal.api.NativeAdScrollViewApi {
    public static byte[] A07;
    public static java.lang.String[] A08 = {"nVlKDJKKuSIwTlTd16ukFrbX3MHjOHdA", "", "ICm0nIVybe3UlAuBnNKxRWg2mc3pSWnS", "", "SSXPkfr4Ttu5KI5IplEjDPNbu7CwAkh6", "a5Au6kTC9kTmWkoQnewo7jq8", "NRpBzWywFD0YlyTuhproyOYpEldGp2Hb", com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_MALE};
    public final int A00;
    public final com.facebook.ads.NativeAdScrollView.AdViewProvider A01;
    public final com.facebook.ads.NativeAdView.Type A02;
    public final com.facebook.ads.NativeAdViewAttributes A03;
    public final com.facebook.ads.NativeAdsManager A04;
    public final com.facebook.ads.redexgen.core.C1663h9 A05;
    public final com.facebook.ads.redexgen.core.C1636gi A06;

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 114);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A07() {
        byte[] bArr = {60, 4, 2, 5, 81, 1, 3, com.google.common.base.Ascii.RS, 7, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC4, 81, com.google.common.base.Ascii.DLE, 81, 63, com.google.common.base.Ascii.DLE, 5, com.google.common.base.Ascii.CAN, 7, com.google.common.base.Ascii.DC4, 48, com.google.common.base.Ascii.NAK, 39, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.DC4, 6, 95, 37, 8, 1, com.google.common.base.Ascii.DC4, 93, 81, 48, com.google.common.base.Ascii.NAK, 39, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.DC4, 6, 33, 3, com.google.common.base.Ascii.RS, 7, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC4, 3, 81, com.google.common.base.Ascii.RS, 3, 81, com.google.common.base.Ascii.DLE, 81, com.google.common.base.Ascii.US, com.google.common.base.Ascii.DLE, 5, com.google.common.base.Ascii.CAN, 7, com.google.common.base.Ascii.DC4, 48, com.google.common.base.Ascii.NAK, 39, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.DC4, 6, 57, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.EM, 5, 53, 1, 52, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SO, 19, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.US, 59, com.google.common.base.Ascii.RS, 9, 55, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.US, 8, 90, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SO, 90, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.US, com.google.common.base.Ascii.RS};
        java.lang.String[] strArr = A08;
        if (strArr[6].charAt(14) != strArr[0].charAt(14)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A08;
        strArr2[2] = "Ml52sYoz4FZavAZNhfJ3fi3jnwDnZY4L";
        strArr2[4] = "tWqTcrLKFqppCUd7uCsjOJfAn0Jrdt0w";
        A07 = bArr;
    }

    static {
        A07();
    }

    public S3(com.facebook.ads.NativeAdScrollView nativeAdScrollView, android.content.Context context, com.facebook.ads.NativeAdsManager nativeAdsManager, com.facebook.ads.NativeAdScrollView.AdViewProvider adViewProvider, int i, com.facebook.ads.NativeAdView.Type type, com.facebook.ads.NativeAdViewAttributes nativeAdViewAttributes, int i2) {
        if (nativeAdsManager.isLoaded()) {
            if (type != null || adViewProvider != null || i > 0) {
                this.A06 = com.facebook.ads.redexgen.core.C1009Rp.A03(context);
                this.A04 = nativeAdsManager;
                this.A03 = nativeAdViewAttributes;
                this.A01 = adViewProvider;
                this.A02 = type;
                this.A00 = i2;
                com.facebook.ads.redexgen.core.C1664hA c1664hA = new com.facebook.ads.redexgen.core.C1664hA(this);
                this.A05 = new com.facebook.ads.redexgen.core.C1663h9(context);
                if (this.A02 == null) {
                    if (i > 0) {
                        this.A05.A00(((int) com.facebook.ads.redexgen.core.XX.A02) * i);
                    }
                } else {
                    this.A05.A00((int) (com.facebook.ads.redexgen.core.XX.A02 * this.A02.getHeight()));
                }
                this.A05.setAdapter(c1664hA);
                setInset(20);
                c1664hA.A09();
                nativeAdScrollView.addView(this.A05);
                return;
            }
            throw new java.lang.IllegalArgumentException(A06(0, 74, 3));
        }
        throw new java.lang.IllegalStateException(A06(74, 27, 8));
    }

    @Override // com.facebook.ads.internal.api.NativeAdScrollViewApi
    public final void setInset(int i) {
        if (i > 0) {
            float f = com.facebook.ads.redexgen.core.XX.A02;
            float density = i;
            int insetDp = java.lang.Math.round(density * f);
            this.A05.setPadding(insetDp, 0, insetDp, 0);
            float density2 = i / 2;
            this.A05.setPageMargin(java.lang.Math.round(density2 * f));
            this.A05.setClipToPadding(false);
        }
    }
}
