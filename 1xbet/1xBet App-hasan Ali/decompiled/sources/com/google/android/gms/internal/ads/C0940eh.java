package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.eh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0940eh implements InterfaceC0814bo {

    /* renamed from: a, reason: collision with root package name */
    public final List f13324a;

    public C0940eh(List list) {
        this.f13324a = list;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0814bo
    public final void t() {
        for (E3.a aVar : this.f13324a) {
            V9 v9 = new V9(26);
            aVar.a(new Kw(0, aVar, v9), Ew.f8627k);
        }
    }

    public C0940eh(AbstractC0762ah abstractC0762ah) {
        this.f13324a = Collections.singletonList(AbstractC1400ot.c0(abstractC0762ah));
    }
}
