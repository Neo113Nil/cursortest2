package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzvz implements zzvd {
    public static final /* synthetic */ int zza = 0;
    private final zzfw zzc;
    private int zzd;
    private final zzvy zze;
    private final zzza zzf;

    public zzvz(zzfw zzfwVar, zzvy zzvyVar) {
        zzza zzzaVar = new zzza(-1);
        this.zzc = zzfwVar;
        this.zze = zzvyVar;
        this.zzf = zzzaVar;
        this.zzd = 1048576;
    }

    public final zzvz zza(int i7) {
        this.zzd = i7;
        return this;
    }

    public final zzwb zzb(zzap zzapVar) {
        zzapVar.zzb.getClass();
        return new zzwb(zzapVar, this.zzc, this.zze, zzrq.zza, this.zzf, this.zzd, 0, null, null, null);
    }
}
