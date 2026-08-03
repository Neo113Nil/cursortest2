package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzesg extends com.google.android.gms.ads.internal.client.zzbt implements com.google.android.gms.internal.ads.zzdfn {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzfgs zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.internal.ads.zzetc zzd;
    private com.google.android.gms.ads.internal.client.zzr zze;
    private final com.google.android.gms.internal.ads.zzfkx zzf;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzg;
    private final com.google.android.gms.internal.ads.zzdzl zzh;
    private com.google.android.gms.internal.ads.zzcvl zzi;

    public zzesg(android.content.Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, java.lang.String str, com.google.android.gms.internal.ads.zzfgs zzfgsVar, com.google.android.gms.internal.ads.zzetc zzetcVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        this.zza = context;
        this.zzb = zzfgsVar;
        this.zze = zzrVar;
        this.zzc = str;
        this.zzd = zzetcVar;
        this.zzf = zzfgsVar.zzg();
        this.zzg = versionInfoParcel;
        this.zzh = zzdzlVar;
        zzfgsVar.zzi(this);
    }

    private final synchronized void zzO(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        com.google.android.gms.internal.ads.zzfkx zzfkxVar = this.zzf;
        zzfkxVar.zzc(zzrVar);
        zzfkxVar.zze(this.zze.zzn);
    }

    private final synchronized boolean zzV(com.google.android.gms.ads.internal.client.zzm zzmVar) throws android.os.RemoteException {
        if (zzW()) {
            com.google.android.gms.common.internal.Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        android.content.Context context = this.zza;
        if (!com.google.android.gms.ads.internal.util.zzs.zzK(context) || zzmVar.zzs != null) {
            com.google.android.gms.internal.ads.zzflv.zzb(context, zzmVar.zzf);
            return this.zzb.zza(zzmVar, this.zzc, null, new com.google.android.gms.internal.ads.zzesf(this));
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
        com.google.android.gms.internal.ads.zzetc zzetcVar = this.zzd;
        if (zzetcVar != null) {
            zzetcVar.zzdJ(com.google.android.gms.internal.ads.zzfma.zzd(4, null, null));
        }
        return false;
    }

    private final boolean zzW() {
        boolean z;
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbko.zzf.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmD)).booleanValue()) {
                z = true;
                return this.zzg.clientJarVersion >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmE)).intValue() || !z;
            }
        }
        z = false;
        if (this.zzg.clientJarVersion >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmE)).intValue()) {
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzA() {
        com.google.android.gms.internal.ads.zzcvl zzcvlVar = this.zzi;
        if (zzcvlVar != null) {
            if (zzcvlVar.zzs()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzB() {
        return this.zzb.zzb();
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
        com.google.android.gms.common.internal.Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        com.google.android.gms.internal.ads.zzcvl zzcvlVar = this.zzi;
        if (zzcvlVar == null) {
            return null;
        }
        return zzcvlVar.zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzG(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
        if (zzW()) {
            com.google.android.gms.common.internal.Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
        }
        this.zzf.zzi(zzfwVar);
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
    public final void zzK(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzdfn
    public final synchronized void zzL() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        com.google.android.gms.internal.ads.zzfgs zzfgsVar = this.zzb;
        if (zzfgsVar.zzh()) {
            zzfgsVar.zzc();
        } else {
            zzfgsVar.zzk();
        }
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzcvl zzM() {
        return this.zzi;
    }

    final /* synthetic */ void zzN(com.google.android.gms.internal.ads.zzcvl zzcvlVar) {
        this.zzi = zzcvlVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        if (zzW()) {
            com.google.android.gms.common.internal.Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!zzdqVar.zzf()) {
                this.zzh.zzb();
            }
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzd.zzp(zzdqVar);
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
    public final synchronized void zzT(long j) {
        this.zzf.zzx(j);
        com.google.android.gms.internal.ads.zzcvl zzcvlVar = this.zzi;
        if (zzcvlVar == null || zzcvlVar.zzo() == null) {
            return;
        }
        zzcvlVar.zzo().zzb(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized long zzU() {
        com.google.android.gms.internal.ads.zzcvl zzcvlVar = this.zzi;
        if (zzcvlVar == null || zzcvlVar.zzo() == null) {
            return this.zzf.zzw();
        }
        return zzcvlVar.zzo().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzY(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzab(zzcpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdfn
    public final synchronized void zza() {
        if (!this.zzb.zzh()) {
            this.zzb.zzj();
            return;
        }
        com.google.android.gms.internal.ads.zzfkx zzfkxVar = this.zzf;
        com.google.android.gms.ads.internal.client.zzr zzf = zzfkxVar.zzf();
        if (this.zzi != null && zzfkxVar.zzD()) {
            zzf = com.google.android.gms.internal.ads.zzfle.zza(this.zza, java.util.Collections.singletonList(this.zzi.zzf()));
        }
        zzO(zzf);
        zzfkxVar.zzd(true);
        try {
            zzV(zzfkxVar.zzb());
        } catch (android.os.RemoteException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to refresh the banner ad.");
        }
        this.zzf.zzd(false);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.dynamic.IObjectWrapper zzb() {
        if (zzW()) {
            com.google.android.gms.common.internal.Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        }
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzb.zzd());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r3.zzg.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmF)).intValue()) goto L9;
     */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzc() {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbko.zze.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmA)).booleanValue()) {
            }
        }
        com.google.android.gms.common.internal.Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzcvl zzcvlVar = this.zzi;
        if (zzcvlVar != null) {
            zzcvlVar.zzd();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzdS(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        if (zzW()) {
            com.google.android.gms.common.internal.Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zzl(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zze(com.google.android.gms.ads.internal.client.zzm zzmVar) throws android.os.RemoteException {
        zzO(this.zze);
        return zzV(zzmVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r3.zzg.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmF)).intValue()) goto L9;
     */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzf() {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbko.zzg.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmB)).booleanValue()) {
            }
        }
        com.google.android.gms.common.internal.Preconditions.checkMainThread("pause must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzcvl zzcvlVar = this.zzi;
        if (zzcvlVar != null) {
            zzcvlVar.zzl().zza(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r3.zzg.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmF)).intValue()) goto L9;
     */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzg() {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbko.zzh.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmz)).booleanValue()) {
            }
        }
        com.google.android.gms.common.internal.Preconditions.checkMainThread("resume must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzcvl zzcvlVar = this.zzi;
        if (zzcvlVar != null) {
            zzcvlVar.zzl().zzb(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        if (zzW()) {
            com.google.android.gms.common.internal.Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzo(zzclVar);
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
    public final void zzl() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzm() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzcvl zzcvlVar = this.zzi;
        if (zzcvlVar != null) {
            zzcvlVar.zzi();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzr zzn() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzcvl zzcvlVar = this.zzi;
        if (zzcvlVar != null) {
            return com.google.android.gms.internal.ads.zzfle.zza(this.zza, java.util.Collections.singletonList(zzcvlVar.zze()));
        }
        return this.zzf.zzf();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzo(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.zzf.zzc(zzrVar);
        this.zze = zzrVar;
        com.google.android.gms.internal.ads.zzcvl zzcvlVar = this.zzi;
        if (zzcvlVar != null) {
            zzcvlVar.zzb(this.zzb.zzd(), zzrVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(com.google.android.gms.internal.ads.zzbzk zzbzkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzq(com.google.android.gms.internal.ads.zzbzn zzbznVar, java.lang.String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized java.lang.String zzr() {
        com.google.android.gms.internal.ads.zzcvl zzcvlVar = this.zzi;
        if (zzcvlVar == null || zzcvlVar.zzn() == null) {
            return null;
        }
        return zzcvlVar.zzn().zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized java.lang.String zzs() {
        com.google.android.gms.internal.ads.zzcvl zzcvlVar = this.zzi;
        if (zzcvlVar == null || zzcvlVar.zzn() == null) {
            return null;
        }
        return zzcvlVar.zzn().zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzdx zzt() {
        com.google.android.gms.internal.ads.zzcvl zzcvlVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhI)).booleanValue() && (zzcvlVar = this.zzi) != null) {
            return zzcvlVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized java.lang.String zzu() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcl zzv() {
        return this.zzd.zzk();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzw() {
        return this.zzd.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzx(com.google.android.gms.internal.ads.zzbjl zzbjlVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zze(zzbjlVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
        if (zzW()) {
            com.google.android.gms.common.internal.Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzf(zzbeVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzz(boolean z) {
        if (zzW()) {
            com.google.android.gms.common.internal.Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
        }
        this.zzf.zzk(z);
    }
}
