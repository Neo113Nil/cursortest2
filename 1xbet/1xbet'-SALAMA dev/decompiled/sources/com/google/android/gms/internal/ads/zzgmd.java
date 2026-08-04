package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzgmd {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgmd(Class cls, Class cls2, zzgmc zzgmcVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgmd zzb(zzgmb zzgmbVar, Class cls, Class cls2) {
        return new zzgma(cls, cls2, zzgmbVar);
    }

    public abstract zzgna zza(zzgdf zzgdfVar);

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
