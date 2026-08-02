package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class zzgkl {
    private final zzgvd zza;
    private final Class zzb;

    public /* synthetic */ zzgkl(zzgvd zzgvdVar, Class cls, zzgkk zzgkkVar) {
        this.zza = zzgvdVar;
        this.zzb = cls;
    }

    public static zzgkl zzb(zzgkj zzgkjVar, zzgvd zzgvdVar, Class cls) {
        return new zzgki(zzgvdVar, cls, zzgkjVar);
    }

    public abstract zzgcs zza(zzgna zzgnaVar, zzgdj zzgdjVar);

    public final zzgvd zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
