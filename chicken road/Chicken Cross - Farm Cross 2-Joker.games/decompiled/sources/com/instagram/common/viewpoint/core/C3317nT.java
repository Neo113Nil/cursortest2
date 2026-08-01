package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.nT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3317nT implements InterfaceC2094Jj {
    public final long A00;
    public final BP<C3440pT> A01;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.text.Cue> */
    public C3317nT(long j, BP<C3440pT> bp) {
        this.A00 = j;
        this.A01 = bp;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2094Jj
    public final List<C3440pT> A7X(long j) {
        return j >= this.A00 ? this.A01 : Collections.emptyList();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2094Jj
    public final long A83(int i) {
        AbstractC17143y.A07(i == 0);
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2094Jj
    public final int A84() {
        return 1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2094Jj
    public final int A8a(long j) {
        return this.A00 > j ? 0 : -1;
    }
}
