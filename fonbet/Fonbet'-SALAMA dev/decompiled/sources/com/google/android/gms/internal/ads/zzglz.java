package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class zzglz {
    private final zzgvd zza;
    private final Class zzb;

    public /* synthetic */ zzglz(zzgvd zzgvdVar, Class cls, zzgly zzglyVar) {
        this.zza = zzgvdVar;
        this.zzb = cls;
    }

    public static zzglz zzb(zzglx zzglxVar, zzgvd zzgvdVar, Class cls) {
        return new zzglw(zzgvdVar, cls, zzglxVar);
    }

    public abstract zzgdf zza(zzgna zzgnaVar);

    public final zzgvd zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
