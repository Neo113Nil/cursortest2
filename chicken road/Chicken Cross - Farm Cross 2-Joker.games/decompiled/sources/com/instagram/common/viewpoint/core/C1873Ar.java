package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ar, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1873Ar implements InterfaceC3546rY {
    public final List<InterfaceC3547rZ> A00 = new ArrayList();

    @Override // com.instagram.common.viewpoint.core.InterfaceC3546rY
    public final InterfaceC3547rZ A6i(int i) {
        this.A00.get(i);
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC3547rZ> iterator() {
        return this.A00.iterator();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3546rY
    public final int size() {
        return this.A00.size();
    }
}
