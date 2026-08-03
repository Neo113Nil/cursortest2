package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.la, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1919la implements com.facebook.ads.redexgen.core.InterfaceC0800Jj {
    public final java.util.List<com.facebook.ads.redexgen.core.C2146pT> A00;

    public C1919la(java.util.List<com.facebook.ads.redexgen.core.C2146pT> list) {
        this.A00 = java.util.Collections.unmodifiableList(list);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0800Jj
    public final java.util.List<com.facebook.ads.redexgen.core.C2146pT> A7X(long j) {
        return j >= 0 ? this.A00 : java.util.Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0800Jj
    public final long A83(int i) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(i == 0);
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0800Jj
    public final int A84() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0800Jj
    public final int A8a(long j) {
        return j < 0 ? 0 : -1;
    }
}
