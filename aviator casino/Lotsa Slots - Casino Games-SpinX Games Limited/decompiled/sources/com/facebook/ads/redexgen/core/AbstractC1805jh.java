package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.jh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1805jh implements com.facebook.ads.redexgen.core.N1 {
    public int A00;
    public long A01;
    public com.facebook.ads.RewardData A02;

    public abstract int A0H();

    public abstract com.facebook.ads.redexgen.core.NQ A0I();

    public abstract boolean A0J();

    public final void A00(int i) {
        this.A00 = i;
    }

    public final void A01(long j) {
        this.A01 = j;
    }

    public final void A02(com.facebook.ads.RewardData rewardData) {
        this.A02 = rewardData;
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final com.facebook.ads.internal.protocol.AdPlacementType A8k() {
        return com.facebook.ads.internal.protocol.AdPlacementType.REWARDED_VIDEO;
    }
}
