package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfgm extends com.google.android.gms.ads.internal.client.zzbt implements com.google.android.gms.ads.internal.overlay.zzr, com.google.android.gms.internal.ads.zzbgd {
    protected com.google.android.gms.internal.ads.zzcvf zza;
    private final com.google.android.gms.internal.ads.zzcnj zzb;
    private final android.content.Context zzc;
    private final java.lang.String zze;
    private final com.google.android.gms.internal.ads.zzfgg zzf;
    private final com.google.android.gms.internal.ads.zzfge zzg;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzh;
    private final com.google.android.gms.internal.ads.zzdzl zzi;
    private com.google.android.gms.internal.ads.zzcus zzk;
    private java.util.concurrent.atomic.AtomicBoolean zzd = new java.util.concurrent.atomic.AtomicBoolean();
    private long zzj = -1;

    public zzfgm(com.google.android.gms.internal.ads.zzcnj zzcnjVar, android.content.Context context, java.lang.String str, com.google.android.gms.internal.ads.zzfgg zzfggVar, com.google.android.gms.internal.ads.zzfge zzfgeVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        this.zzb = zzcnjVar;
        this.zzc = context;
        this.zze = str;
        this.zzf = zzfggVar;
        this.zzg = zzfgeVar;
        this.zzh = versionInfoParcel;
        this.zzi = zzdzlVar;
        zzfgeVar.zzq(this);
    }

    private final synchronized void zzW(int i) {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzg.zzu();
            com.google.android.gms.internal.ads.zzcus zzcusVar = this.zzk;
            if (zzcusVar != null) {
                com.google.android.gms.ads.internal.zzt.zzg().zzc(zzcusVar);
            }
            if (this.zza != null) {
                long j = -1;
                if (this.zzj != -1) {
                    j = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzj;
                }
                this.zza.zze(j, i);
            }
            zzc();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzA() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzB() {
        return this.zzf.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(com.google.android.gms.internal.ads.zzcbv zzcbvVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(java.lang.String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(java.lang.String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzea zzF() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzG(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(com.google.android.gms.ads.internal.client.zzee zzeeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.zzf.zzd(zzxVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(com.google.android.gms.internal.ads.zzbgm zzbgmVar) {
        this.zzg.zzo(zzbgmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(boolean z) {
    }

    public final void zzL(com.google.android.gms.internal.ads.zzfsy zzfsyVar) {
        this.zzg.zzs(zzfsyVar);
    }

    final /* synthetic */ void zzM() {
        zzW(5);
    }

    final /* synthetic */ void zzN() {
        this.zzb.zzb().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfgl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzfgm.this.zzM();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfge zzO() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(long j) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final long zzU() {
        return 0L;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdzl zzV() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzY(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final void zza() {
        zzW(3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.dynamic.IObjectWrapper zzb() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzc() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzcvf zzcvfVar = this.zza;
        if (zzcvfVar != null) {
            zzcvfVar.zzd();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzdS(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdv() {
        com.google.android.gms.internal.ads.zzcvf zzcvfVar = this.zza;
        if (zzcvfVar != null) {
            zzcvfVar.zze(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzj, 1);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zze(com.google.android.gms.ads.internal.client.zzm zzmVar) throws android.os.RemoteException {
        boolean z;
        if (!zzmVar.zzb()) {
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbko.zzd.zze()).booleanValue()) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmD)).booleanValue()) {
                    z = true;
                    if (this.zzh.clientJarVersion >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmE)).intValue() || !z) {
                        com.google.android.gms.common.internal.Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                    }
                }
            }
            z = false;
            if (this.zzh.clientJarVersion >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmE)).intValue()) {
            }
            com.google.android.gms.common.internal.Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzK(this.zzc) && zzmVar.zzs == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
            this.zzg.zzdJ(com.google.android.gms.internal.ads.zzfma.zzd(4, null, null));
            return false;
        }
        if (zzB()) {
            return false;
        }
        this.zzd = new java.util.concurrent.atomic.AtomicBoolean();
        return this.zzf.zza(zzmVar, this.zze, new com.google.android.gms.internal.ads.zzfgi(this), new com.google.android.gms.internal.ads.zzfgj(this));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzf() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzg() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzh() {
        if (this.zza != null) {
            this.zzj = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            int zzc = this.zza.zzc();
            if (zzc > 0) {
                com.google.android.gms.internal.ads.zzcus zzcusVar = new com.google.android.gms.internal.ads.zzcus(this.zzb.zzc(), com.google.android.gms.ads.internal.zzt.zzk());
                this.zzk = zzcusVar;
                zzcusVar.zzb(zzc, new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfgk
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.internal.ads.zzfgm.this.zzN();
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzj(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final android.os.Bundle zzk() {
        return new android.os.Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzl() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzm() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzr zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzo(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(com.google.android.gms.internal.ads.zzbzk zzbzkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzq(com.google.android.gms.internal.ads.zzbzn zzbznVar, java.lang.String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized java.lang.String zzr() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized java.lang.String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzdx zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized java.lang.String zzu() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcl zzv() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzw() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzx(com.google.android.gms.internal.ads.zzbjl zzbjlVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzz(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdU(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            zzW(2);
            return;
        }
        if (i2 == 1) {
            zzW(4);
        } else if (i2 != 2) {
            zzW(6);
        } else {
            zzW(3);
        }
    }
}
