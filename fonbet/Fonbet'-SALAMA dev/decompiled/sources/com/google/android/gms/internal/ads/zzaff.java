package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class zzaff {
    protected final zzaeb zza;

    public zzaff(zzaeb zzaebVar) {
        this.zza = zzaebVar;
    }

    public abstract boolean zza(zzed zzedVar);

    public abstract boolean zzb(zzed zzedVar, long j);

    public final boolean zzf(zzed zzedVar, long j) {
        return zza(zzedVar) && zzb(zzedVar, j);
    }
}
