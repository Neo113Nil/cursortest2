package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzyu extends com.google.android.gms.internal.ads.zzwj implements com.google.android.gms.internal.ads.zzyi {
    private final com.google.android.gms.internal.ads.zzho zza;
    private final com.google.android.gms.internal.ads.zzyc zzb;
    private final com.google.android.gms.internal.ads.zzun zzc;
    private final int zzd;
    private boolean zze = true;
    private long zzf = -9223372036854775807L;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private com.google.android.gms.internal.ads.zzin zzj;
    private com.google.android.gms.internal.ads.zzak zzk;
    private final com.google.android.gms.internal.ads.zzabu zzl;

    /* synthetic */ zzyu(com.google.android.gms.internal.ads.zzak zzakVar, com.google.android.gms.internal.ads.zzho zzhoVar, com.google.android.gms.internal.ads.zzyc zzycVar, com.google.android.gms.internal.ads.zzun zzunVar, com.google.android.gms.internal.ads.zzabu zzabuVar, int i, boolean z, int i2, com.google.android.gms.internal.ads.zzv zzvVar, com.google.android.gms.internal.ads.zzgub zzgubVar, byte[] bArr) {
        this.zzk = zzakVar;
        this.zza = zzhoVar;
        this.zzb = zzycVar;
        this.zzc = zzunVar;
        this.zzl = zzabuVar;
        this.zzd = i;
    }

    private final void zzu() {
        long j = this.zzf;
        boolean z = this.zzg;
        boolean z2 = this.zzh;
        com.google.android.gms.internal.ads.zzak zzJ = zzJ();
        com.google.android.gms.internal.ads.zzzg zzzgVar = new com.google.android.gms.internal.ads.zzzg(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, zzJ, z2 ? zzJ.zzc : null);
        zze(this.zze ? new com.google.android.gms.internal.ads.zzyr(this, zzzgVar) : zzzgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwj, com.google.android.gms.internal.ads.zzxm
    public final synchronized void zzA(com.google.android.gms.internal.ads.zzak zzakVar) {
        this.zzk = zzakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzD(com.google.android.gms.internal.ads.zzxi zzxiVar) {
        ((com.google.android.gms.internal.ads.zzyq) zzxiVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final com.google.android.gms.internal.ads.zzxi zzG(com.google.android.gms.internal.ads.zzxk zzxkVar, com.google.android.gms.internal.ads.zzabl zzablVar, long j) {
        com.google.android.gms.internal.ads.zzhp zza = this.zza.zza();
        com.google.android.gms.internal.ads.zzin zzinVar = this.zzj;
        if (zzinVar != null) {
            zza.zze(zzinVar);
        }
        com.google.android.gms.internal.ads.zzag zzagVar = zzJ().zzb;
        zzagVar.getClass();
        return new com.google.android.gms.internal.ads.zzyq(zzagVar.zza, zza, this.zzb.zza(zzk()), this.zzc, zzh(zzxkVar), this.zzl, zzf(zzxkVar), this, zzablVar, null, this.zzd, false, 0, null, com.google.android.gms.internal.ads.zzfl.zzs(-9223372036854775807L), null);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final synchronized com.google.android.gms.internal.ads.zzak zzJ() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzwj
    protected final void zza(com.google.android.gms.internal.ads.zzin zzinVar) {
        this.zzj = zzinVar;
        android.os.Looper.myLooper().getClass();
        zzk();
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzyi
    public final void zzb(long j, com.google.android.gms.internal.ads.zzahb zzahbVar, boolean z) {
        if (this.zzi && zzahbVar.zzj()) {
            return;
        }
        this.zzi = !zzahbVar.zzj();
        if (j == -9223372036854775807L) {
            j = this.zzf;
        }
        boolean zzb = zzahbVar.zzb();
        if (!this.zze && this.zzf == j && this.zzg == zzb && this.zzh == z) {
            return;
        }
        this.zzf = j;
        this.zzg = zzb;
        this.zzh = z;
        this.zze = false;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzwj
    protected final void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzt() {
    }
}
