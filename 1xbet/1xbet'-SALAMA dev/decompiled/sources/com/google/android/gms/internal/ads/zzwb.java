package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class zzwb extends zztp implements zzvs {
    private final zzfw zza;
    private final zzrq zzb;
    private final int zzc;
    private boolean zzd = true;
    private long zze = -9223372036854775807L;
    private boolean zzf;
    private boolean zzg;
    private zzgx zzh;
    private zzap zzi;
    private final zzvy zzj;
    private final zzza zzk;

    public /* synthetic */ zzwb(zzap zzapVar, zzfw zzfwVar, zzvy zzvyVar, zzrq zzrqVar, zzza zzzaVar, int i7, int i8, zzz zzzVar, zzftz zzftzVar, zzwa zzwaVar) {
        this.zzi = zzapVar;
        this.zza = zzfwVar;
        this.zzj = zzvyVar;
        this.zzb = zzrqVar;
        this.zzk = zzzaVar;
        this.zzc = i7;
    }

    private final void zzw() {
        long j = this.zze;
        boolean z4 = this.zzf;
        boolean z7 = this.zzg;
        zzap zzapVarZzJ = zzJ();
        zzwo zzwoVar = new zzwo(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z4, false, false, null, zzapVarZzJ, z7 ? zzapVarZzJ.zzc : null);
        zzo(this.zzd ? new zzvx(this, zzwoVar) : zzwoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzG(zzuo zzuoVar) {
        ((zzvw) zzuoVar).zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final zzuo zzI(zzuq zzuqVar, zzyw zzywVar, long j) {
        zzfx zzfxVarZza = this.zza.zza();
        zzgx zzgxVar = this.zzh;
        if (zzgxVar != null) {
            zzfxVarZza.zzf(zzgxVar);
        }
        zzak zzakVar = zzJ().zzb;
        zzakVar.getClass();
        Uri uri = zzakVar.zza;
        zzvy zzvyVar = this.zzj;
        zzb();
        return new zzvw(uri, zzfxVarZza, new zzts(zzvyVar.zza), this.zzb, zzc(zzuqVar), this.zzk, zze(zzuqVar), this, zzywVar, null, this.zzc, 0, null, zzen.zzs(-9223372036854775807L), null);
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final synchronized zzap zzJ() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final void zza(long j, zzadu zzaduVar, boolean z4) {
        if (j == -9223372036854775807L) {
            j = this.zze;
        }
        boolean zZzh = zzaduVar.zzh();
        if (!this.zzd && this.zze == j && this.zzf == zZzh && this.zzg == z4) {
            return;
        }
        this.zze = j;
        this.zzf = zZzh;
        this.zzg = z4;
        this.zzd = false;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzn(zzgx zzgxVar) {
        this.zzh = zzgxVar;
        Looper.myLooper().getClass();
        zzb();
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzus
    public final synchronized void zzt(zzap zzapVar) {
        this.zzi = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzz() {
    }
}
