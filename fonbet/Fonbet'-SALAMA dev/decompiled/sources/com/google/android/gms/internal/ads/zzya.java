package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class zzya {
    public final int zza;
    public final zzbo zzb;
    public final int zzc;
    public final zzz zzd;

    public zzya(int i7, zzbo zzboVar, int i8) {
        this.zza = i7;
        this.zzb = zzboVar;
        this.zzc = i8;
        this.zzd = zzboVar.zzb(i8);
    }

    public abstract int zzb();

    public abstract boolean zzc(zzya zzyaVar);
}
