package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzadk implements com.google.android.gms.internal.ads.zzaeu {
    final /* synthetic */ com.google.android.gms.internal.ads.zzadq zza;
    private com.google.android.gms.internal.ads.zzgwm zzb;
    private com.google.android.gms.internal.ads.zzv zzc;
    private long zzd;
    private long zze;
    private int zzf;

    public zzadk(com.google.android.gms.internal.ads.zzadq zzadqVar, android.content.Context context, int i) {
        java.util.Objects.requireNonNull(zzadqVar);
        this.zza = zzadqVar;
        com.google.android.gms.internal.ads.zzfl.zzU(context);
        this.zzb = com.google.android.gms.internal.ads.zzgwm.zzi();
        this.zze = -9223372036854775807L;
        com.google.android.gms.internal.ads.zzaer zzaerVar = com.google.android.gms.internal.ads.zzaer.zzb;
    }

    private static final void zzy(com.google.android.gms.internal.ads.zzv zzvVar) {
        com.google.android.gms.internal.ads.zzi zzC;
        com.google.android.gms.internal.ads.zzt zza = zzvVar.zza();
        zzC = com.google.android.gms.internal.ads.zzadq.zzC(zzvVar.zzF);
        zza.zzE(zzC);
        zza.zzO();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zza() {
        com.google.android.gms.internal.ads.zzadq zzadqVar = this.zza;
        if (zzadqVar.zzt()) {
            zzadqVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzb() {
        com.google.android.gms.internal.ads.zzadq zzadqVar = this.zza;
        if (zzadqVar.zzt()) {
            zzadqVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(com.google.android.gms.internal.ads.zzaer zzaerVar, java.util.concurrent.Executor executor) {
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zzd(com.google.android.gms.internal.ads.zzv zzvVar) throws com.google.android.gms.internal.ads.zzaet {
        return this.zza.zzi(zzvVar, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzg(boolean z) {
        this.zze = -9223372036854775807L;
        this.zza.zzm(z);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zzh(boolean z) {
        return this.zza.zzj(false);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzi() {
        com.google.android.gms.internal.ads.zzadq zzadqVar = this.zza;
        zzadqVar.zzA(this.zze);
        if (zzadqVar.zzy() >= zzadqVar.zzz()) {
            zzadqVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zzj() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final android.view.Surface zzk() {
        com.google.android.gms.internal.ads.zzgtj.zzi(false);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzl(com.google.android.gms.internal.ads.zzadr zzadrVar) {
        this.zza.zzp(zzadrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzm(float f) {
        this.zza.zzq(f);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzn(java.util.List list) {
        if (this.zzb.equals(list)) {
            return;
        }
        this.zzb = com.google.android.gms.internal.ads.zzgwm.zzq(list);
        com.google.android.gms.internal.ads.zzv zzvVar = this.zzc;
        if (zzvVar != null) {
            zzy(zzvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzo(long j) {
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzp(android.view.Surface surface, com.google.android.gms.internal.ads.zzeu zzeuVar) {
        this.zza.zzc(surface, zzeuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzq() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzr(int i) {
        this.zza.zzr(i);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzs(int i, com.google.android.gms.internal.ads.zzv zzvVar, long j, int i2, java.util.List list) {
        com.google.android.gms.internal.ads.zzgtj.zzi(false);
        this.zzb = com.google.android.gms.internal.ads.zzgwm.zzq(list);
        this.zzc = zzvVar;
        com.google.android.gms.internal.ads.zzadq zzadqVar = this.zza;
        zzadqVar.zzA(-9223372036854775807L);
        zzy(zzvVar);
        long j2 = this.zze;
        long j3 = -4611686018427387904L;
        if (zzadqVar.zzt()) {
            if (j2 != -9223372036854775807L) {
                j3 = j2 + 1;
            }
        } else if (j2 != -9223372036854775807L) {
            return;
        }
        zzadqVar.zzw().zza(j3, new com.google.android.gms.internal.ads.zzadp(j + this.zzd, i2, j3));
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzt() {
        com.google.android.gms.internal.ads.zzadq zzadqVar = this.zza;
        if (zzadqVar.zzw().zzc() == 0) {
            zzadqVar.zzo();
            return;
        }
        com.google.android.gms.internal.ads.zzfh zzfhVar = new com.google.android.gms.internal.ads.zzfh(10);
        boolean z = true;
        while (zzadqVar.zzw().zzc() > 0) {
            com.google.android.gms.internal.ads.zzadp zzadpVar = (com.google.android.gms.internal.ads.zzadp) zzadqVar.zzw().zzd();
            zzadpVar.getClass();
            if (z) {
                int i = zzadpVar.zzb;
                if (i == 0 || i == 1) {
                    zzadpVar = new com.google.android.gms.internal.ads.zzadp(zzadpVar.zza, 0, zzadpVar.zzc);
                } else {
                    zzadqVar.zzo();
                }
            }
            zzfhVar.zza(zzadpVar.zzc, zzadpVar);
            z = false;
        }
        zzadqVar.zzx(zzfhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zzu(long j, com.google.android.gms.internal.ads.zzaes zzaesVar) {
        int i;
        com.google.android.gms.internal.ads.zzgtj.zzi(false);
        long j2 = j + this.zzd;
        com.google.android.gms.internal.ads.zzadq zzadqVar = this.zza;
        long zzb = zzadqVar.zzv().zzb(j2);
        if (zzb == -9223372036854775807L || zzb >= zzadqVar.zzu() || (i = this.zzf) >= 2) {
            if (zzadqVar.zzs()) {
                throw null;
            }
            return false;
        }
        this.zzf = i + 1;
        zzaesVar.zzb();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzv(long j, long j2) throws com.google.android.gms.internal.ads.zzaet {
        this.zza.zzl(j + this.zzd, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzw(boolean z) {
        com.google.android.gms.internal.ads.zzadq zzadqVar = this.zza;
        if (zzadqVar.zzt()) {
            zzadqVar.zzn(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzx() {
        this.zza.zzg();
    }
}
