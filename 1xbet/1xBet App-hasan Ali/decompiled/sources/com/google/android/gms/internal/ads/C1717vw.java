package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.google.android.gms.internal.ads.vw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1717vw extends AbstractC0952et {

    /* renamed from: m, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f16065m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicIntegerFieldUpdater f16066n;

    public C1717vw(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(14);
        this.f16065m = atomicReferenceFieldUpdater;
        this.f16066n = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0952et
    public final void H(AbstractC1672uw abstractC1672uw, Set set) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.f16065m;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1672uw, null, set)) {
                return;
            }
            if (atomicReferenceFieldUpdater.get(abstractC1672uw) != null && atomicReferenceFieldUpdater.get(abstractC1672uw) != null) {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0952et
    public final int c(AbstractC1672uw abstractC1672uw) {
        return this.f16066n.decrementAndGet(abstractC1672uw);
    }
}
