package com.instagram.common.viewpoint.core;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.lh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3220lh implements InterfaceC2094Jj {
    public final List<C3440pT> A00;

    public C3220lh(List<C3440pT> list) {
        this.A00 = list;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2094Jj
    public final List<C3440pT> A7X(long j) {
        return j >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2094Jj
    public final long A83(int i) {
        AbstractC17143y.A07(i == 0);
        return 0L;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2094Jj
    public final int A84() {
        return 1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2094Jj
    public final int A8a(long j) {
        return j < 0 ? 0 : -1;
    }
}
