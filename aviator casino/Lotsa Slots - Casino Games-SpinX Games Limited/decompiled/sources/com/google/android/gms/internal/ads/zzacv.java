package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzacv implements com.google.android.gms.internal.ads.zzaeu {
    private final com.google.android.gms.internal.ads.zzadu zza;
    private final com.google.android.gms.internal.ads.zzadv zzb;
    private final com.google.android.gms.internal.ads.zzaec zzc;
    private final java.util.Queue zzd;
    private android.view.Surface zze;
    private com.google.android.gms.internal.ads.zzv zzf;
    private long zzg;
    private com.google.android.gms.internal.ads.zzaer zzh;
    private java.util.concurrent.Executor zzi;
    private com.google.android.gms.internal.ads.zzadr zzj;

    public zzacv(com.google.android.gms.internal.ads.zzadu zzaduVar, com.google.android.gms.internal.ads.zzadv zzadvVar, com.google.android.gms.internal.ads.zzdo zzdoVar) {
        this.zza = zzaduVar;
        this.zzb = zzadvVar;
        zzaduVar.zzg(zzdoVar);
        this.zzc = new com.google.android.gms.internal.ads.zzaec(new com.google.android.gms.internal.ads.zzacu(this, null), zzaduVar, zzadvVar);
        this.zzd = new java.util.ArrayDeque();
        this.zzf = new com.google.android.gms.internal.ads.zzt().zzO();
        this.zzg = -9223372036854775807L;
        this.zzh = com.google.android.gms.internal.ads.zzaer.zzb;
        this.zzi = com.google.android.gms.internal.ads.zzacq.zza;
        this.zzj = com.google.android.gms.internal.ads.zzaco.zza;
    }

    final /* synthetic */ android.view.Surface zzA() {
        return this.zze;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzaer zzB() {
        return this.zzh;
    }

    final /* synthetic */ java.util.concurrent.Executor zzC() {
        return this.zzi;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzadr zzD() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zza() {
        this.zzb.zzd();
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzb() {
        this.zzb.zzd();
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(com.google.android.gms.internal.ads.zzaer zzaerVar, java.util.concurrent.Executor executor) {
        this.zzh = zzaerVar;
        this.zzi = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zzd(com.google.android.gms.internal.ads.zzv zzvVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzg(boolean z) {
        if (z) {
            this.zza.zzl();
        }
        this.zzb.zzd();
        this.zzc.zza();
        this.zzd.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zzh(boolean z) {
        return this.zza.zzi(z);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzi() {
        this.zzc.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zzj() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzl(com.google.android.gms.internal.ads.zzadr zzadrVar) {
        this.zzj = zzadrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzm(float f) {
        this.zza.zzn(f);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzn(java.util.List list) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzo(long j) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzp(android.view.Surface surface, com.google.android.gms.internal.ads.zzeu zzeuVar) {
        this.zze = surface;
        this.zza.zzd(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzq() {
        this.zze = null;
        this.zza.zzd(null);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzr(int i) {
        this.zza.zzm(i);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzs(int i, com.google.android.gms.internal.ads.zzv zzvVar, long j, int i2, java.util.List list) {
        com.google.android.gms.internal.ads.zzgtj.zzi(list.isEmpty());
        int i3 = zzvVar.zzw;
        com.google.android.gms.internal.ads.zzv zzvVar2 = this.zzf;
        if (i3 != zzvVar2.zzw || zzvVar.zzx != zzvVar2.zzx) {
            this.zzc.zzc(i3, zzvVar.zzx);
        }
        float f = zzvVar.zzA;
        if (f != this.zzf.zzA) {
            this.zza.zze(f);
        }
        this.zzf = zzvVar;
        if (j != this.zzg) {
            this.zzc.zzd(i2, j);
            this.zzg = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzt() {
        this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zzu(long j, com.google.android.gms.internal.ads.zzaes zzaesVar) {
        this.zzd.add(zzaesVar);
        this.zzc.zze(j);
        this.zzi.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzacp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzacv.this.zzy();
            }
        });
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzw(boolean z) {
        this.zza.zzj(z);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzx() {
    }

    final /* synthetic */ void zzy() {
        this.zzh.zza();
    }

    final /* synthetic */ java.util.Queue zzz() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final android.view.Surface zzk() {
        android.view.Surface surface = this.zze;
        surface.getClass();
        return surface;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzv(long j, long j2) throws com.google.android.gms.internal.ads.zzaet {
        try {
            this.zzc.zzb(j, j2);
        } catch (com.google.android.gms.internal.ads.zzjk e) {
            throw new com.google.android.gms.internal.ads.zzaet(e, this.zzf);
        }
    }
}
