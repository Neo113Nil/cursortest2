package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzglr {
    private static final zzglr zza = new zzglr();
    private final AtomicReference zzb = new AtomicReference(new zzgmq(new zzgmn(null), null));

    public static zzglr zza() {
        return zza;
    }

    public final Object zzb(zzgcs zzgcsVar, Class cls) {
        return ((zzgmq) this.zzb.get()).zzc(zzgcsVar, cls);
    }

    public final synchronized void zzc(zzgmm zzgmmVar) {
        zzgmn zzgmnVar = new zzgmn((zzgmq) this.zzb.get(), null);
        zzgmnVar.zza(zzgmmVar);
        this.zzb.set(new zzgmq(zzgmnVar, null));
    }

    public final synchronized void zzd(zzgmv zzgmvVar) {
        zzgmn zzgmnVar = new zzgmn((zzgmq) this.zzb.get(), null);
        zzgmnVar.zzb(zzgmvVar);
        this.zzb.set(new zzgmq(zzgmnVar, null));
    }
}
