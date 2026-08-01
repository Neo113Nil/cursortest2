package com.instagram.common.viewpoint.core;

import java.io.IOException;

/* loaded from: assets/audience_network/classes2.dex */
public final class LO {
    public final int A00;
    public final long A01;

    public LO(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public static LO A00(InterfaceC3281ms interfaceC3281ms, C17374v c17374v) throws IOException {
        interfaceC3281ms.AGt(c17374v.A0l(), 0, 8);
        c17374v.A0f(0);
        int A0C = c17374v.A0C();
        long size = c17374v.A0O();
        return new LO(A0C, size);
    }
}
