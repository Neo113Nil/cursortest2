package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
final class zzgae extends zzgad {
    private static final AtomicReferenceFieldUpdater zza;
    private static final AtomicIntegerFieldUpdater zzb;

    static {
        int i7 = zzgah.zza;
        zza = AtomicReferenceFieldUpdater.newUpdater(zzgah.class, Set.class, "seenExceptions");
        zzb = AtomicIntegerFieldUpdater.newUpdater(zzgah.class, "remaining");
    }

    private zzgae() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgad
    public final int zza(zzgah zzgahVar) {
        return zzb.decrementAndGet(zzgahVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgad
    public final void zzb(zzgah zzgahVar, Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zza;
        while (!atomicReferenceFieldUpdater.compareAndSet(zzgahVar, null, set2)) {
            if (atomicReferenceFieldUpdater.get(zzgahVar) != null && atomicReferenceFieldUpdater.get(zzgahVar) != null) {
                return;
            }
        }
    }

    public /* synthetic */ zzgae(zzgag zzgagVar) {
        super(null);
    }
}
