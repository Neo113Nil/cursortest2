package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
final class zze implements com.google.android.play.core.splitinstall.zzp {
    private final com.google.android.play.core.splitinstall.zze zza = this;
    private final com.google.android.play.core.splitinstall.internal.zzcb zzb;
    private final com.google.android.play.core.splitinstall.internal.zzcb zzc;
    private final com.google.android.play.core.splitinstall.internal.zzcb zzd;
    private final com.google.android.play.core.splitinstall.internal.zzcb zze;
    private final com.google.android.play.core.splitinstall.internal.zzcb zzf;
    private final com.google.android.play.core.splitinstall.internal.zzcb zzg;
    private final com.google.android.play.core.splitinstall.internal.zzcb zzh;
    private final com.google.android.play.core.splitinstall.internal.zzcb zzi;
    private final com.google.android.play.core.splitinstall.internal.zzcb zzj;
    private final com.google.android.play.core.splitinstall.internal.zzcb zzk;
    private final com.google.android.play.core.splitinstall.internal.zzcb zzl;

    /* synthetic */ zze(com.google.android.play.core.splitinstall.zzac zzacVar, com.google.android.play.core.splitinstall.zzd zzdVar) {
        com.google.android.play.core.splitinstall.zzad zzadVar = new com.google.android.play.core.splitinstall.zzad(zzacVar);
        this.zzb = zzadVar;
        com.google.android.play.core.splitinstall.internal.zzcb zzc = com.google.android.play.core.splitinstall.internal.zzbz.zzc(new com.google.android.play.core.splitinstall.zzbd(zzadVar));
        this.zzc = zzc;
        com.google.android.play.core.splitinstall.internal.zzcb zzc2 = com.google.android.play.core.splitinstall.internal.zzbz.zzc(new com.google.android.play.core.splitinstall.zzag(zzacVar));
        this.zzd = zzc2;
        com.google.android.play.core.splitinstall.internal.zzcb zzc3 = com.google.android.play.core.splitinstall.internal.zzbz.zzc(new com.google.android.play.core.splitinstall.zzt(zzadVar));
        this.zze = zzc3;
        com.google.android.play.core.splitinstall.internal.zzcb zzc4 = com.google.android.play.core.splitinstall.internal.zzbz.zzc(new com.google.android.play.core.splitinstall.zzbf(zzadVar));
        this.zzf = zzc4;
        com.google.android.play.core.splitinstall.internal.zzcb zzc5 = com.google.android.play.core.splitinstall.internal.zzbz.zzc(new com.google.android.play.core.splitinstall.zzab(zzc, zzc2, zzc3, zzc4));
        this.zzg = zzc5;
        com.google.android.play.core.splitinstall.internal.zzcb zzc6 = com.google.android.play.core.splitinstall.internal.zzbz.zzc(new com.google.android.play.core.splitinstall.zzaf(zzadVar));
        this.zzh = zzc6;
        com.google.android.play.core.splitinstall.zzae zzaeVar = new com.google.android.play.core.splitinstall.zzae(zzc6);
        this.zzi = zzaeVar;
        com.google.android.play.core.splitinstall.internal.zzcb zzc7 = com.google.android.play.core.splitinstall.internal.zzbz.zzc(new com.google.android.play.core.splitinstall.testing.zzt(zzadVar, zzc6, zzc3, zzaeVar));
        this.zzj = zzc7;
        com.google.android.play.core.splitinstall.internal.zzcb zzc8 = com.google.android.play.core.splitinstall.internal.zzbz.zzc(new com.google.android.play.core.splitinstall.zzm(zzc5, zzc7, zzc6));
        this.zzk = zzc8;
        this.zzl = com.google.android.play.core.splitinstall.internal.zzbz.zzc(new com.google.android.play.core.splitinstall.zzah(zzacVar, zzc8));
    }

    @Override // com.google.android.play.core.splitinstall.zzp
    public final com.google.android.play.core.splitinstall.SplitInstallManager zza() {
        return (com.google.android.play.core.splitinstall.SplitInstallManager) this.zzl.zza();
    }

    @Override // com.google.android.play.core.splitinstall.zzp
    public final java.io.File zzb() {
        return (java.io.File) this.zzh.zza();
    }
}
