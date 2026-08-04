package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzgkp {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgkp(Class cls, Class cls2, zzgko zzgkoVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgkp zzb(zzgkn zzgknVar, Class cls, Class cls2) {
        return new zzgkm(cls, cls2, zzgknVar);
    }

    public abstract zzgna zza(zzgcs zzgcsVar, zzgdj zzgdjVar);

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
