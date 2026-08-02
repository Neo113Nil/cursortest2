package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class zzgmm {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgmm(Class cls, Class cls2, zzgml zzgmlVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgmm zzb(zzgmk zzgmkVar, Class cls, Class cls2) {
        return new zzgmj(cls, cls2, zzgmkVar);
    }

    public abstract Object zza(zzgcs zzgcsVar);

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
