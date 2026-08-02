package com.instagram.common.viewpoint.core;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.pf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1863pf {
    public final InterfaceC1868pk A00;
    public final String A01;
    public final Collection<C1877pu> A02;
    public final Collection<C1877pu> A03;
    public final List<Rect> A04;

    public C1863pf(String str, InterfaceC1868pk interfaceC1868pk, List<Rect> rects, Collection<C1877pu> collection, Collection<C1877pu> collection2) {
        this.A01 = str;
        this.A00 = interfaceC1868pk;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
