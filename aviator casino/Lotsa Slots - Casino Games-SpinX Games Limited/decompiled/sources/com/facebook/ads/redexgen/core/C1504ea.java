package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ea, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1504ea {
    public static byte[] A05;
    public java.util.concurrent.Executor A00 = com.facebook.ads.redexgen.core.YG.A06;
    public final com.facebook.ads.redexgen.core.C1636gi A01;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A02;
    public final com.facebook.ads.redexgen.core.ZU A03;
    public final java.lang.String A04;

    static {
        A05();
    }

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 76);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{5, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.CR, 8, 19, com.google.common.base.Ascii.US, com.google.common.base.Ascii.US, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.RS, -27, -38, -38, 34, 34, 34, -39, -48, com.google.common.base.Ascii.RS, -39, 17, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.SYN, -39, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.CAN, -38, com.google.common.base.Ascii.FF, 32, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.DLE, 10, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.US, 34, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SYN, -38, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.GS, 33, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.GS, 10, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DLE, 10, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.DLE, 34, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SI, -31, -19, -19, -23, -20, -77, -88, -88, -16, -16, -16, -89, -33, -38, -36, -34, -37, -24, -24, -28, -89, -36, -24, -26, -88, -38, -18, -35, -30, -34, -25, -36, -34, -40, -25, -34, -19, -16, -24, -21, -28, -88, -20, -34, -21, -17, -34, -21, -40, -20, -30, -35, -34, -40, -21, -34, -16, -38, -21, -35, com.google.common.base.Ascii.DC4, 7, com.google.common.base.Ascii.US, 35, com.google.common.base.Ascii.CAN, 19, 42, 47, 35, com.google.common.base.Ascii.RS};
    }

    public C1504ea(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.ZU zu, java.lang.String str, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh) {
        this.A01 = c1636gi;
        this.A03 = zu;
        this.A04 = str;
        this.A02 = interfaceC1177Yh;
    }

    public static java.lang.String A04(com.facebook.ads.RewardData rewardData, java.lang.String str, java.lang.String str2) {
        java.lang.String urlPrefix;
        if (rewardData != null) {
            java.lang.String serverSideProxyURL = com.facebook.ads.AdSettings.getUrlPrefix();
            if (serverSideProxyURL == null || serverSideProxyURL.isEmpty()) {
                urlPrefix = A03(68, 60, 45);
            } else {
                java.lang.String urlPrefix2 = A03(5, 63, 95);
                urlPrefix = java.lang.String.format(java.util.Locale.US, urlPrefix2, serverSideProxyURL);
            }
            android.net.Uri A00 = com.facebook.ads.redexgen.core.XB.A00(urlPrefix);
            android.net.Uri.Builder uriBuilder = new android.net.Uri.Builder();
            java.lang.String urlPrefix3 = A00.getScheme();
            uriBuilder.scheme(urlPrefix3);
            java.lang.String urlPrefix4 = A00.getAuthority();
            uriBuilder.authority(urlPrefix4);
            java.lang.String urlPrefix5 = A00.getPath();
            uriBuilder.path(urlPrefix5);
            java.lang.String urlPrefix6 = A00.getQuery();
            uriBuilder.query(urlPrefix6);
            java.lang.String urlPrefix7 = A00.getFragment();
            uriBuilder.fragment(urlPrefix7);
            java.lang.String serverSideProxyURL2 = A03(134, 4, 110);
            java.lang.String urlPrefix8 = rewardData.getUserID();
            uriBuilder.appendQueryParameter(serverSideProxyURL2, urlPrefix8);
            java.lang.String serverSideProxyURL3 = A03(128, 2, 88);
            java.lang.String urlPrefix9 = rewardData.getCurrency();
            uriBuilder.appendQueryParameter(serverSideProxyURL3, urlPrefix9);
            java.lang.String urlPrefix10 = A03(130, 4, 99);
            uriBuilder.appendQueryParameter(urlPrefix10, str);
            java.lang.String urlPrefix11 = A03(0, 5, 88);
            uriBuilder.appendQueryParameter(urlPrefix11, str2);
            java.lang.String urlPrefix12 = uriBuilder.build().toString();
            return urlPrefix12;
        }
        return null;
    }

    public final void A06() {
        if (!android.text.TextUtils.isEmpty(this.A04)) {
            com.facebook.ads.redexgen.core.AsyncTaskC1607gF asyncTaskC1607gF = new com.facebook.ads.redexgen.core.AsyncTaskC1607gF(this.A01, new java.util.HashMap());
            asyncTaskC1607gF.A07(new com.facebook.ads.redexgen.core.F8(this));
            asyncTaskC1607gF.executeOnExecutor(this.A00, this.A04);
        }
    }
}
