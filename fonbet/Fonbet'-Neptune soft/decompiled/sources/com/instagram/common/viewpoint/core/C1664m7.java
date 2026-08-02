package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.m7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1664m7 implements J7 {
    public final long A00;
    public final AbstractC0297Am<C1781o2> A01;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.text.Cue> */
    public C1664m7(long j, AbstractC0297Am<C1781o2> abstractC0297Am) {
        this.A00 = j;
        this.A01 = abstractC0297Am;
    }

    @Override // com.instagram.common.viewpoint.core.J7
    public final List<C1781o2> A7P(long j) {
        return j >= this.A00 ? this.A01 : Collections.emptyList();
    }

    @Override // com.instagram.common.viewpoint.core.J7
    public final long A7v(int i) {
        C3M.A07(i == 0);
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.J7
    public final int A7w() {
        return 1;
    }

    @Override // com.instagram.common.viewpoint.core.J7
    public final int A8S(long j) {
        return this.A00 > j ? 0 : -1;
    }
}
