package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.7Y, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C7Y extends com.facebook.ads.redexgen.core.AbstractC1756ik {
    public static final com.facebook.ads.redexgen.core.OJ A02 = new com.facebook.ads.redexgen.core.C1743iV();
    public com.facebook.ads.redexgen.core.C1750id A00;
    public final com.facebook.ads.redexgen.core.C1746iY A01;

    public C7Y(com.facebook.ads.redexgen.core.C1746iY c1746iY, java.lang.String str) {
        super(c1746iY.A05(), str, A02.A5T(c1746iY));
        this.A01 = c1746iY;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1756ik
    public final void A08() {
        if (this.A00 != null) {
            this.A00.destroy();
        }
        super.A00.AJM(com.facebook.ads.redexgen.core.OD.A03);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1756ik
    public final void A09() {
        this.A00 = new com.facebook.ads.redexgen.core.C1750id(this.A01, this, A04());
        this.A00.A0G(this.A01.A0B(), this.A01.A07());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1756ik
    public final void A0D(boolean z) {
        this.A05.AJn(z);
    }

    public final void A0E(com.facebook.ads.InterstitialAd interstitialAd, java.util.EnumSet<com.facebook.ads.CacheFlag> cacheFlags, java.lang.String str) {
        if (super.A00.A6U()) {
            return;
        }
        this.A01.A0D(interstitialAd);
        if (this.A00 != null) {
            this.A00.A0G(cacheFlags, str);
            return;
        }
        this.A01.A0K(cacheFlags);
        this.A01.A0H(str);
        if (com.facebook.ads.redexgen.core.AbstractC1089Us.A09(this.A02) && com.facebook.ads.redexgen.core.AbstractC1089Us.A0A(this.A02)) {
            if (com.facebook.ads.redexgen.core.AbstractC1089Us.A0M(str)) {
                A05();
                return;
            } else {
                A09();
                return;
            }
        }
        A09();
    }

    public final void A0F(com.facebook.ads.RewardData rewardData) {
        this.A01.A0F(rewardData);
        if (super.A01.A01) {
            super.A01.A0F(1013, com.facebook.ads.redexgen.core.OY.A00(new android.os.Bundle(), rewardData));
        }
    }

    public final boolean A0G() {
        if (this.A00 != null) {
            return this.A00.A0H();
        }
        return this.A01.A00() > 0 && com.facebook.ads.redexgen.core.Y1.A00() > this.A01.A00();
    }

    public final boolean A0H() {
        if (this.A00 != null) {
            return this.A00.A0I();
        }
        return super.A00.A6p() == com.facebook.ads.redexgen.core.OD.A05;
    }

    public final boolean A0I(com.facebook.ads.InterstitialAd interstitialAd, com.facebook.ads.InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        if (super.A00.A6V()) {
            return false;
        }
        this.A01.A0D(interstitialAd);
        if (super.A01.A01) {
            A0A(-1);
            return true;
        }
        if (this.A00 != null) {
            return this.A00.A0J();
        }
        this.A00 = new com.facebook.ads.redexgen.core.C1750id(this.A01, this, A04());
        this.A00.A0J();
        return false;
    }
}
