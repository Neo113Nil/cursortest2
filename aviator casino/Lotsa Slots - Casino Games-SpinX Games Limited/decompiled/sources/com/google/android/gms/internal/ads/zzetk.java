package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzetk extends com.google.android.gms.ads.internal.client.zzbt {
    private final com.google.android.gms.ads.internal.client.zzr zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzfii zzc;
    private final java.lang.String zzd;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zze;
    private final com.google.android.gms.internal.ads.zzetc zzf;
    private final com.google.android.gms.internal.ads.zzfjj zzg;
    private final com.google.android.gms.internal.ads.zzbap zzh;
    private final com.google.android.gms.internal.ads.zzdzl zzi;
    private com.google.android.gms.internal.ads.zzdlz zzj;
    private boolean zzk;

    public zzetk(android.content.Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, java.lang.String str, com.google.android.gms.internal.ads.zzfii zzfiiVar, com.google.android.gms.internal.ads.zzetc zzetcVar, com.google.android.gms.internal.ads.zzfjj zzfjjVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzbap zzbapVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        this.zza = zzrVar;
        this.zzd = str;
        this.zzb = context;
        this.zzc = zzfiiVar;
        this.zzf = zzetcVar;
        this.zzg = zzfjjVar;
        this.zze = versionInfoParcel;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbp)).booleanValue() || android.os.Build.VERSION.SDK_INT < 35) {
            this.zzk = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbo)).booleanValue();
        } else {
            this.zzk = true;
        }
        this.zzh = zzbapVar;
        this.zzi = zzdzlVar;
    }

    private final synchronized boolean zzO() {
        com.google.android.gms.internal.ads.zzdlz zzdlzVar = this.zzj;
        if (zzdlzVar != null) {
            if (!zzdlzVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzA() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzB() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(com.google.android.gms.internal.ads.zzcbv zzcbvVar) {
        this.zzg.zzn(zzcbvVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(java.lang.String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(java.lang.String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzea zzF() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(com.google.android.gms.ads.internal.client.zzee zzeeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(com.google.android.gms.ads.internal.client.zzx zzxVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(com.google.android.gms.internal.ads.zzbgm zzbgmVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzK(boolean z) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzk = z;
    }

    public final void zzL(com.google.android.gms.internal.ads.zzfsy zzfsyVar) {
        this.zzf.zzn(zzfsyVar);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdlz zzM() {
        return this.zzj;
    }

    final /* synthetic */ void zzN(com.google.android.gms.internal.ads.zzdlz zzdlzVar) {
        this.zzj = zzdlzVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdqVar.zzf()) {
                this.zzi.zzb();
            }
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzf.zzp(zzdqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) throws android.os.RemoteException {
        this.zzf.zzq(zzbkVar);
        zze(zzmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzR(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        if (this.zzj == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Interstitial can not be shown before loaded.");
            this.zzf.zzj(com.google.android.gms.internal.ads.zzfma.zzd(9, null, null));
        } else {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdG)).booleanValue()) {
                this.zzh.zzb().zzi(new java.lang.Throwable().getStackTrace());
            }
            this.zzj.zza(this.zzk, (android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzf.zzr(zzcsVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzT(long j) {
        com.google.android.gms.internal.ads.zzdlz zzdlzVar = this.zzj;
        if (zzdlzVar == null || zzdlzVar.zzo() == null) {
            return;
        }
        zzdlzVar.zzo().zzb(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized long zzU() {
        com.google.android.gms.internal.ads.zzdlz zzdlzVar = this.zzj;
        if (zzdlzVar == null || zzdlzVar.zzo() == null) {
            return 0L;
        }
        return zzdlzVar.zzo().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzY(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.dynamic.IObjectWrapper zzb() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzc() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzdlz zzdlzVar = this.zzj;
        if (zzdlzVar != null) {
            zzdlzVar.zzl().zzc(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzd() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzO();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzdS(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzf.zzl(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zze(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        boolean z;
        if (!zzmVar.zzb()) {
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbko.zzi.zze()).booleanValue()) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmD)).booleanValue()) {
                    z = true;
                    if (this.zze.clientJarVersion >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmE)).intValue() || !z) {
                        com.google.android.gms.common.internal.Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                    }
                }
            }
            z = false;
            if (this.zze.clientJarVersion >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmE)).intValue()) {
            }
            com.google.android.gms.common.internal.Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        android.content.Context context = this.zzb;
        if (com.google.android.gms.ads.internal.util.zzs.zzK(context) && zzmVar.zzs == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
            com.google.android.gms.internal.ads.zzetc zzetcVar = this.zzf;
            if (zzetcVar != null) {
                zzetcVar.zzdJ(com.google.android.gms.internal.ads.zzfma.zzd(4, null, null));
            }
        } else if (!zzO()) {
            com.google.android.gms.internal.ads.zzflv.zzb(context, zzmVar.zzf);
            this.zzj = null;
            return this.zzc.zza(zzmVar, this.zzd, new com.google.android.gms.internal.ads.zzfib(this.zza), new com.google.android.gms.internal.ads.zzetj(this));
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzf() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("pause must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzdlz zzdlzVar = this.zzj;
        if (zzdlzVar != null) {
            zzdlzVar.zzl().zza(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzg() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("resume must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzdlz zzdlzVar = this.zzj;
        if (zzdlzVar != null) {
            zzdlzVar.zzl().zzb(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzf.zzo(zzclVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzj(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final android.os.Bundle zzk() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new android.os.Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzl() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
        if (this.zzj == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Interstitial can not be shown before loaded.");
            this.zzf.zzj(com.google.android.gms.internal.ads.zzfma.zzd(9, null, null));
        } else {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdG)).booleanValue()) {
                this.zzh.zzb().zzi(new java.lang.Throwable().getStackTrace());
            }
            this.zzj.zza(this.zzk, null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzm() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzr zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(com.google.android.gms.ads.internal.client.zzr zzrVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(com.google.android.gms.internal.ads.zzbzk zzbzkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzq(com.google.android.gms.internal.ads.zzbzn zzbznVar, java.lang.String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized java.lang.String zzr() {
        com.google.android.gms.internal.ads.zzdlz zzdlzVar = this.zzj;
        if (zzdlzVar == null || zzdlzVar.zzn() == null) {
            return null;
        }
        return zzdlzVar.zzn().zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized java.lang.String zzs() {
        com.google.android.gms.internal.ads.zzdlz zzdlzVar = this.zzj;
        if (zzdlzVar == null || zzdlzVar.zzn() == null) {
            return null;
        }
        return zzdlzVar.zzn().zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzdx zzt() {
        com.google.android.gms.internal.ads.zzdlz zzdlzVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhI)).booleanValue() && (zzdlzVar = this.zzj) != null) {
            return zzdlzVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized java.lang.String zzu() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcl zzv() {
        return this.zzf.zzk();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzw() {
        return this.zzf.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzx(com.google.android.gms.internal.ads.zzbjl zzbjlVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzc.zzc(zzbjlVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz(boolean z) {
    }
}
