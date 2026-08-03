package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Eu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0683Eu implements com.facebook.ads.redexgen.core.InterfaceC1513ej {
    public final com.facebook.ads.redexgen.core.C1636gi A01;
    public final com.facebook.ads.redexgen.core.VA A02;
    public final com.facebook.ads.redexgen.core.C1510eg A03;
    public final com.facebook.ads.redexgen.core.C0673Ek A04;
    public final java.lang.String A07;
    public final com.facebook.ads.redexgen.core.E4 A06 = new com.facebook.ads.redexgen.core.E4() { // from class: com.facebook.ads.redexgen.X.4P
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.UN
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(com.facebook.ads.redexgen.core.C4B c4b) {
            java.lang.Boolean bool;
            com.facebook.ads.redexgen.core.C1636gi c1636gi;
            bool = com.facebook.ads.redexgen.core.C0683Eu.this.A00;
            if (bool.booleanValue()) {
                return;
            }
            c1636gi = com.facebook.ads.redexgen.core.C0683Eu.this.A01;
            c1636gi.A0F().AJ2();
            com.facebook.ads.redexgen.core.C0683Eu.this.A08();
        }
    };
    public final com.facebook.ads.redexgen.core.EA A05 = new com.facebook.ads.redexgen.core.EA() { // from class: com.facebook.ads.redexgen.X.4O
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.UN
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(com.facebook.ads.redexgen.core.C4K c4k) {
            java.lang.Boolean bool;
            com.facebook.ads.redexgen.core.C1636gi c1636gi;
            bool = com.facebook.ads.redexgen.core.C0683Eu.this.A00;
            if (!bool.booleanValue()) {
                c1636gi = com.facebook.ads.redexgen.core.C0683Eu.this.A01;
                c1636gi.A0F().AJ0();
                com.facebook.ads.redexgen.core.C0683Eu.this.A08();
            }
            com.facebook.ads.redexgen.core.C0683Eu.this.A00 = true;
        }
    };
    public java.lang.Boolean A00 = false;

    public C0683Eu(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.C0673Ek c0673Ek, java.lang.String str, boolean z, com.facebook.ads.redexgen.core.EF ef, java.util.Map<java.lang.String, java.lang.String> extraParams) {
        this.A01 = c1636gi;
        this.A02 = va;
        this.A07 = str;
        this.A04 = c0673Ek;
        this.A03 = new com.facebook.ads.redexgen.core.C1510eg(c0673Ek, str, z, extraParams);
        if (com.facebook.ads.redexgen.core.C1086Up.A2B(this.A01)) {
            this.A01.A0F().AIx();
            ef.A0m(this);
        } else {
            this.A01.A0F().AIy();
            this.A04.getEventBus().A03(this.A06, this.A05);
        }
    }

    public final void A07() {
        com.facebook.ads.redexgen.core.F1 f1 = new com.facebook.ads.redexgen.core.F1(this);
        if (this.A04.A0q()) {
            com.facebook.ads.redexgen.core.Y4.A00(f1);
        } else {
            this.A04.getStateHandler().post(f1);
        }
    }

    public final synchronized void A08() {
        if (!this.A00.booleanValue()) {
            this.A02.ABy(this.A07, this.A03.A06());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1513ej
    public final void AEk() {
        this.A01.A0F().AJ1();
        A08();
    }
}
