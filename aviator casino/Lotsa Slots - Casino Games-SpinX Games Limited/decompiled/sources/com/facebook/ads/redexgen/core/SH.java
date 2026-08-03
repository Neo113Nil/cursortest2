package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class SH implements com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.internal.context.Repairable {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"k8yEFjaDDmJNEMKVrce3vEWkKDhb9GrD", "5HJZEEaowyWiZ6x5JcW91LnqKILZK9iv", "JCdbC5zohUOjfclxz", "cbOkRGwJ0he66t85Zev39Ck1DLyP", "QnWh1EoQaEskbAIVlUx7Y0ywxM6b", "GMmjAnpO", "8CCIVLGxcMAoQXrfALv1hDyohO9DfryR", "UYxyoZ6BjjTfNK3ar4eEie7WMpDsFwCV"};
    public final com.facebook.ads.Ad A00;
    public final com.facebook.ads.redexgen.core.C1731iI A01;
    public final com.facebook.ads.redexgen.core.C7X A02;
    public final com.facebook.ads.redexgen.core.C1636gi A03;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 9);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{120, 124, 121, 121, 44, 40, 113, 45, com.google.common.base.Ascii.ESC, 74, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.SYN, 74, 76, com.google.common.base.Ascii.GS, 75, 102, 48, 50, 97, 53, 97, 48, 55, 32, 117, 34, 113, 37, 46, 46, 34, 52, 19, 9, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SI, 19, com.google.common.base.Ascii.FS, 17, 93, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SI, 83, 119, 105, 94, 76, 90, 73, 95, 94, 95, com.google.common.base.Ascii.ESC, 77, 82, 95, 94, 84, com.google.common.base.Ascii.ESC, 90, 95, com.google.common.base.Ascii.ESC, 95, 94, 72, 79, 73, 84, 66, 94, 95, 59, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.RS, 8, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.CR, 73, com.google.common.base.Ascii.US, 0, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.FF, 6, 73, 8, com.google.common.base.Ascii.CR, 73, 5, 6, 8, com.google.common.base.Ascii.CR, 73, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.CR, 33, com.google.common.base.Ascii.SYN, 4, com.google.common.base.Ascii.DC2, 1, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, 83, 5, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FS, 83, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.ETB, 83, 0, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FS, 4, 83, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.US, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, 66, 67, 85, 82, 84, 73, 95, 73, 74, 68, 65, 100, 65, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.CR, 10, com.google.common.base.Ascii.DC2};
    }

    static {
        A01();
    }

    public SH(android.content.Context context, java.lang.String str, com.facebook.ads.Ad ad) {
        java.lang.String uuid;
        this.A00 = ad;
        if (context instanceof com.facebook.ads.redexgen.core.C1636gi) {
            this.A03 = (com.facebook.ads.redexgen.core.C1636gi) context;
            uuid = this.A03.A0F().getId();
        } else {
            uuid = java.util.UUID.randomUUID().toString();
            this.A03 = com.facebook.ads.redexgen.core.C1009Rp.A07(context, uuid);
        }
        com.facebook.ads.redexgen.core.InterfaceC0862Lt A0F = this.A03.A0F();
        java.lang.String adId = com.facebook.ads.internal.protocol.AdPlacementType.REWARDED_VIDEO.toString();
        A0F.A3T(adId, str);
        this.A01 = new com.facebook.ads.redexgen.core.C1731iI(this.A03, str, this.A00, new com.facebook.ads.redexgen.core.C1755ij());
        this.A03.A0O(this);
        this.A02 = new com.facebook.ads.redexgen.core.C7X(this.A01, uuid);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.SI buildLoadAdConfig() {
        return new com.facebook.ads.redexgen.core.SI(this);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.SJ buildShowAdConfig() {
        return new com.facebook.ads.redexgen.core.SJ();
    }

    public final void A04() {
        if (com.facebook.ads.redexgen.core.C1086Up.A2M(this.A03)) {
            return;
        }
        this.A02.A08();
        this.A03.A0F().A3U();
    }

    public final void A05(com.facebook.ads.RewardData rewardData) {
        this.A02.A0G(rewardData);
    }

    public final void A06(com.facebook.ads.RewardedVideoAdListener rewardedVideoAdListener) {
        this.A01.A04 = rewardedVideoAdListener;
        this.A03.A0F().A3M(rewardedVideoAdListener != null);
        java.lang.String[] strArr = A05;
        if (strArr[1].charAt(24) != strArr[0].charAt(24)) {
            throw new java.lang.RuntimeException();
        }
        A05[6] = "1SRpemADNZd8xb9i9fuLSYNF0AwY2Tu2";
    }

    public final void A07(java.lang.String str, com.facebook.ads.AdExperienceType adExperienceType, boolean z) {
        if (str == null) {
            this.A03.A0F().A3Q();
        } else {
            com.facebook.ads.redexgen.core.C1636gi c1636gi = this.A03;
            if (A05[6].charAt(25) == 'H') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A05;
            strArr[3] = "67CWYk6q7caxeYWX3cgidRuGJDEH";
            strArr[4] = "JzT9b8y5FiDfchRrDecE58hhFV9F";
            c1636gi.A0F().A3P();
        }
        this.A02.A0F(this.A00, str, adExperienceType, z);
        this.A03.A0F().A3O();
    }

    public final boolean A08(com.facebook.ads.RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        this.A03.A0F().A3Z();
        boolean A0J = this.A02.A0J(this.A00, rewardedVideoShowAdConfig);
        this.A03.A0F().A3Y(A0J);
        return A0J;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    public final void destroy() {
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A05(A00(136, 7, 47), A00(48, 27, 50), A00(0, 8, 64));
        A04();
    }

    public final void finalize() {
        this.A02.A07();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    public final java.lang.String getPlacementId() {
        return this.A01.A0D;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final int getVideoDuration() {
        return this.A01.A00;
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean A0H = this.A02.A0H();
        this.A03.A0F().A5f(A0H);
        return A0H;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final boolean isAdLoaded() {
        return this.A02.A0I();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    public final void loadAd() {
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A05(A00(143, 6, 44), A00(75, 32, 96), A00(24, 8, 30));
        A07(null, null, true);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final void loadAd(com.facebook.ads.RewardedVideoAd.RewardedVideoLoadAdConfig rewardedVideoLoadAdConfig) {
        ((com.facebook.ads.redexgen.core.SI) rewardedVideoLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(java.lang.Throwable th) {
        if (this.A01.A04 != null) {
            this.A01.A04.onError(this.A00, new com.facebook.ads.AdError(2001, A00(32, 16, 116) + com.facebook.ads.redexgen.core.AbstractC1163Xt.A03(this.A01.A0B, th)));
        }
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    @java.lang.Deprecated
    public final void setExtraHints(com.facebook.ads.ExtraHints extraHints) {
        this.A01.A06 = extraHints.getHints();
        this.A01.A07 = extraHints.getMediationData();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A05(A00(149, 4, 108), A00(107, 29, 122), A00(8, 8, 38));
        return A08(new com.facebook.ads.redexgen.core.SJ().withAppOrientation(-1).build());
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final boolean show(com.facebook.ads.RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A05(A00(149, 4, 108), A00(107, 29, 122), A00(16, 8, 88));
        return A08(rewardedVideoShowAdConfig);
    }
}
