package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.0w, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0w extends com.facebook.ads.redexgen.core.C1J {
    public com.facebook.ads.redexgen.core.C6X A00;
    public java.util.List<com.facebook.ads.redexgen.core.C1474e5> A01;

    public C0w(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        super(c1636gi);
        this.A00 = new com.facebook.ads.redexgen.core.C6X(this, 1, null, null, null);
    }

    public final void A20(com.facebook.ads.redexgen.core.C1581fp c1581fp) {
        if (this.A00 != null) {
            this.A00.A0c(c1581fp);
        }
    }

    public com.facebook.ads.redexgen.core.C6X getCarouselCardBehaviorHelper() {
        return this.A00;
    }

    public void setCardsInfo(java.util.ArrayList arrayList) {
        this.A01 = arrayList;
        this.A00.A0d(this.A01);
    }
}
