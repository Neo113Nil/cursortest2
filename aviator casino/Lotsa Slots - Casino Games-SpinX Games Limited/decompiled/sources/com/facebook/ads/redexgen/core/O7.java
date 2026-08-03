package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class O7 {
    public static java.lang.String[] A0E = {"e4QKd0vFJKlBfNQUlIHhfqQvs", "ktN6BUw9VrN2JTOHJ8TIrrXahMZ3fTmV", "DLbbL7kcZ5O", "9b4HlLYHdUSJ33wbgi9UrYdebMHGJs2L", "z1qfKPKzPcrrDsrmM", "3k9SvbOHIOGx0S2BWPTRCyg1cNUtQJE0", "0GDGJhxXKJqU0yOd0NeRuUkLVmalwgCj", "KW1MjCrhBg"};
    public int A00;
    public long A01;
    public com.facebook.ads.RewardData A02;
    public com.facebook.ads.redexgen.core.VW A03;
    public java.lang.String A04;
    public java.lang.String A05;
    public boolean A06;
    public final com.facebook.ads.redexgen.core.U3 A07;
    public final com.facebook.ads.redexgen.core.EnumC1110Vp A08;
    public final com.facebook.ads.redexgen.core.EnumC1111Vq A09;
    public final java.lang.String A0A;
    public final java.util.EnumSet<com.facebook.ads.CacheFlag> A0B;
    public final int A0C;
    public final com.facebook.ads.internal.protocol.AdPlacementType A0D;

    public O7(java.lang.String str, com.facebook.ads.redexgen.core.EnumC1111Vq enumC1111Vq, com.facebook.ads.internal.protocol.AdPlacementType adPlacementType, com.facebook.ads.redexgen.core.EnumC1110Vp enumC1110Vp, int i, com.facebook.ads.redexgen.core.U3 u3) {
        this(str, enumC1111Vq, adPlacementType, enumC1110Vp, i, java.util.EnumSet.of(com.facebook.ads.CacheFlag.NONE), u3);
    }

    public O7(java.lang.String str, com.facebook.ads.redexgen.core.EnumC1111Vq enumC1111Vq, com.facebook.ads.internal.protocol.AdPlacementType adPlacementType, com.facebook.ads.redexgen.core.EnumC1110Vp enumC1110Vp, int i, java.util.EnumSet<com.facebook.ads.CacheFlag> cacheFlags, com.facebook.ads.redexgen.core.U3 u3) {
        this.A0A = str;
        this.A0D = adPlacementType;
        this.A08 = enumC1110Vp;
        this.A0C = i;
        this.A0B = cacheFlags;
        this.A09 = enumC1111Vq;
        this.A00 = -1;
        this.A07 = u3;
    }

    public final com.facebook.ads.redexgen.core.WA A00(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.C1115Vu c1115Vu, com.facebook.ads.AdExperienceType adExperienceType) {
        return new com.facebook.ads.redexgen.core.WA(c1636gi, this.A0A, this.A08 != null ? new com.facebook.ads.redexgen.core.C1157Xn(this.A08.A04(), this.A08.A03()) : null, this.A09, this.A0C, c1115Vu, com.facebook.ads.redexgen.core.AbstractC1163Xt.A01(com.facebook.ads.redexgen.core.C1086Up.A0N(c1636gi)), this.A04, adExperienceType != null ? adExperienceType.getAdExperienceType() : null, this.A07);
    }

    public final java.util.Set<com.facebook.ads.internal.protocol.AdPlacementType> A01() {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(2);
        if (this.A0D == com.facebook.ads.internal.protocol.AdPlacementType.BANNER && this.A09 == com.facebook.ads.redexgen.core.EnumC1111Vq.A0D) {
            linkedHashSet.add(com.facebook.ads.internal.protocol.AdPlacementType.BANNER);
            com.facebook.ads.internal.protocol.AdPlacementType adPlacementType = com.facebook.ads.internal.protocol.AdPlacementType.MEDIUM_RECTANGLE;
            java.lang.String[] strArr = A0E;
            if (strArr[4].length() == strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0E;
            strArr2[4] = "dJCx3L7RUa0HYA9jO";
            strArr2[0] = "pYtnX6DZAplUTv76Lm34k0kqX";
            linkedHashSet.add(adPlacementType);
            return linkedHashSet;
        }
        if (this.A0D != null) {
            linkedHashSet.add(this.A0D);
            return linkedHashSet;
        }
        if (this.A08 == null) {
            linkedHashSet.add(com.facebook.ads.internal.protocol.AdPlacementType.NATIVE);
            return linkedHashSet;
        }
        if (this.A08 == com.facebook.ads.redexgen.core.EnumC1110Vp.A08) {
            linkedHashSet.add(com.facebook.ads.internal.protocol.AdPlacementType.INTERSTITIAL);
            return linkedHashSet;
        }
        linkedHashSet.add(com.facebook.ads.internal.protocol.AdPlacementType.BANNER);
        return linkedHashSet;
    }

    public final void A02(int i) {
        this.A00 = i;
    }

    public final void A03(long j) {
        this.A01 = j;
    }

    public final void A04(com.facebook.ads.RewardData rewardData) {
        this.A02 = rewardData;
    }

    public final void A05(com.facebook.ads.redexgen.core.VW vw) {
        this.A03 = vw;
    }

    public final void A06(java.lang.String str) {
        this.A04 = str;
    }

    public final void A07(java.lang.String str) {
        this.A05 = str;
    }

    public final void A08(boolean z) {
        this.A06 = z;
    }
}
