package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.nT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2023nT implements com.facebook.ads.redexgen.core.InterfaceC0800Jj {
    public final long A00;
    public final com.facebook.ads.redexgen.core.BP<com.facebook.ads.redexgen.core.C2146pT> A01;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.text.Cue> */
    public C2023nT(long j, com.facebook.ads.redexgen.core.BP<com.facebook.ads.redexgen.core.C2146pT> bp) {
        this.A00 = j;
        this.A01 = bp;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0800Jj
    public final java.util.List<com.facebook.ads.redexgen.core.C2146pT> A7X(long j) {
        return j >= this.A00 ? this.A01 : java.util.Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0800Jj
    public final long A83(int i) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(i == 0);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0800Jj
    public final int A84() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0800Jj
    public final int A8a(long j) {
        return this.A00 > j ? 0 : -1;
    }
}
