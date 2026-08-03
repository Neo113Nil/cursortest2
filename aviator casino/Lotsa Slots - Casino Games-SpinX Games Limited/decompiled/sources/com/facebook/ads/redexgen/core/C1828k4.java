package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.k4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1828k4 implements com.facebook.ads.redexgen.core.SM {
    public final /* synthetic */ int A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.AnonymousClass81 A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.AnonymousClass81 A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1068Tx A03;

    public C1828k4(com.facebook.ads.redexgen.core.AnonymousClass81 anonymousClass81, int i, com.facebook.ads.redexgen.core.C1068Tx c1068Tx, com.facebook.ads.redexgen.core.AnonymousClass81 anonymousClass812) {
        this.A01 = anonymousClass81;
        this.A00 = i;
        this.A03 = c1068Tx;
        this.A02 = anonymousClass812;
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACx() {
        this.A01.A0C(this.A00, this.A03);
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACy() {
        com.facebook.ads.redexgen.core.N9 n9;
        n9 = this.A01.A00;
        n9.AEN(this.A02, com.facebook.ads.redexgen.core.C1108Vm.A00(com.facebook.ads.internal.protocol.AdErrorType.NO_FILL));
    }
}
