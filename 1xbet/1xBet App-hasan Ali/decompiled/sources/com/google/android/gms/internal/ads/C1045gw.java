package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.google.android.gms.internal.ads.gw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1045gw extends AbstractC0952et {

    /* renamed from: m, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f13677m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f13678n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f13679o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f13680p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f13681q;

    public C1045gw(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(13);
        this.f13677m = atomicReferenceFieldUpdater;
        this.f13678n = atomicReferenceFieldUpdater2;
        this.f13679o = atomicReferenceFieldUpdater3;
        this.f13680p = atomicReferenceFieldUpdater4;
        this.f13681q = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0952et
    public final C1358nw C(AbstractC1403ow abstractC1403ow) {
        return (C1358nw) this.f13679o.getAndSet(abstractC1403ow, C1358nw.f14731c);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0952et
    public final void N(C1358nw c1358nw, C1358nw c1358nw2) {
        this.f13678n.lazySet(c1358nw, c1358nw2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0952et
    public final void S(C1358nw c1358nw, Thread thread) {
        this.f13677m.lazySet(c1358nw, thread);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0952et
    public final boolean Y(AbstractC1403ow abstractC1403ow, C1000fw c1000fw, C1000fw c1000fw2) {
        return AbstractC1400ot.r(this.f13680p, abstractC1403ow, c1000fw, c1000fw2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0952et
    public final boolean b0(AbstractC1403ow abstractC1403ow, Object obj, Object obj2) {
        return AbstractC1400ot.r(this.f13681q, abstractC1403ow, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0952et
    public final boolean d0(AbstractC1403ow abstractC1403ow, C1358nw c1358nw, C1358nw c1358nw2) {
        return AbstractC1400ot.r(this.f13679o, abstractC1403ow, c1358nw, c1358nw2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0952et
    public final C1000fw h(AbstractC1403ow abstractC1403ow) {
        return (C1000fw) this.f13680p.getAndSet(abstractC1403ow, C1000fw.f13528d);
    }
}
