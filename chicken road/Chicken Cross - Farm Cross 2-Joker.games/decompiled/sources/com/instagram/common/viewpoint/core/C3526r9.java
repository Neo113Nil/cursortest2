package com.instagram.common.viewpoint.core;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.r9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3526r9 {
    public final InterfaceC3530rD A00;
    public final String A01;
    public final Collection<C3539rN> A02;
    public final Collection<C3539rN> A03;
    public final List<Rect> A04;

    public C3526r9(String str, InterfaceC3530rD interfaceC3530rD, List<Rect> rects, Collection<C3539rN> collection, Collection<C3539rN> collection2) {
        this.A01 = str;
        this.A00 = interfaceC3530rD;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
