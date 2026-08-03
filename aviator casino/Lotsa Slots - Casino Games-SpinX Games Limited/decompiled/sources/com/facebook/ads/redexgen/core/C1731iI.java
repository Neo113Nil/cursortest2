package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.iI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1731iI implements com.facebook.ads.redexgen.core.T5 {
    public int A00 = -1;
    public long A01 = -1;
    public com.facebook.ads.AdExperienceType A02;
    public com.facebook.ads.RewardData A03;
    public com.facebook.ads.RewardedVideoAdListener A04;
    public java.lang.String A05;
    public java.lang.String A06;
    public java.lang.String A07;
    public boolean A08;
    public com.facebook.ads.Ad A09;
    public java.lang.ref.WeakReference<com.facebook.ads.Ad> A0A;
    public final com.facebook.ads.redexgen.core.C1636gi A0B;
    public final com.facebook.ads.redexgen.core.U3 A0C;
    public final java.lang.String A0D;

    public C1731iI(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.lang.String str, com.facebook.ads.Ad ad, com.facebook.ads.redexgen.core.U3 u3) {
        this.A0B = c1636gi;
        this.A0D = str;
        this.A09 = ad;
        this.A0A = new java.lang.ref.WeakReference<>(ad);
        this.A0C = u3;
        c1636gi.A0N(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.T5
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.RewardedVideoAdListener A6o() {
        return this.A04;
    }

    public final com.facebook.ads.redexgen.core.C1636gi A01() {
        return this.A0B;
    }

    public final void A02(com.facebook.ads.Ad ad) {
        if (ad == null && !com.facebook.ads.redexgen.core.C1086Up.A0u(this.A0B)) {
            return;
        }
        this.A09 = ad;
    }

    @Override // com.facebook.ads.redexgen.core.T5
    public final com.facebook.ads.Ad A6k() {
        return this.A09 != null ? this.A09 : this.A0A.get();
    }
}
