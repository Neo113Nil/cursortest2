package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ld, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1922ld implements com.facebook.ads.redexgen.core.InterfaceC0800Jj {
    public final long[] A00;
    public final com.facebook.ads.redexgen.core.C2146pT[] A01;

    public C1922ld(com.facebook.ads.redexgen.core.C2146pT[] c2146pTArr, long[] jArr) {
        this.A01 = c2146pTArr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0800Jj
    public final java.util.List<com.facebook.ads.redexgen.core.C2146pT> A7X(long j) {
        int A0L = com.facebook.ads.redexgen.core.C5C.A0L(this.A00, j, true, false);
        if (A0L == -1 || this.A01[A0L] == com.facebook.ads.redexgen.core.C2146pT.A0J) {
            return java.util.Collections.emptyList();
        }
        return java.util.Collections.singletonList(this.A01[A0L]);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0800Jj
    public final long A83(int i) {
        boolean z = true;
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(i >= 0);
        if (i >= this.A00.length) {
            z = false;
        }
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(z);
        return this.A00[i];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0800Jj
    public final int A84() {
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0800Jj
    public final int A8a(long j) {
        int A0K = com.facebook.ads.redexgen.core.C5C.A0K(this.A00, j, false, false);
        int index = this.A00.length;
        if (A0K < index) {
            return A0K;
        }
        return -1;
    }
}
