package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzesb extends com.google.android.gms.ads.internal.client.zzbt {
    private final android.content.Context zza;
    private final com.google.android.gms.ads.internal.client.zzbh zzb;
    private final com.google.android.gms.internal.ads.zzfky zzc;
    private final com.google.android.gms.internal.ads.zzcvl zzd;
    private final android.view.ViewGroup zze;
    private final com.google.android.gms.internal.ads.zzdzl zzf;

    public zzesb(android.content.Context context, com.google.android.gms.ads.internal.client.zzbh zzbhVar, com.google.android.gms.internal.ads.zzfky zzfkyVar, com.google.android.gms.internal.ads.zzcvl zzcvlVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        this.zza = context;
        this.zzb = zzbhVar;
        this.zzc = zzfkyVar;
        this.zzd = zzcvlVar;
        this.zzf = zzdzlVar;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        frameLayout.removeAllViews();
        android.view.View zza = zzcvlVar.zza();
        com.google.android.gms.ads.internal.zzt.zzc();
        frameLayout.addView(zza, new android.view.ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzn().zzc);
        frameLayout.setMinimumWidth(zzn().zzf);
        this.zze = frameLayout;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzA() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzcvl zzcvlVar = this.zzd;
        return zzcvlVar != null && zzcvlVar.zzs();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzB() throws android.os.RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(com.google.android.gms.internal.ads.zzcbv zzcbvVar) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(java.lang.String str) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(java.lang.String str) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzea zzF() throws android.os.RemoteException {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(com.google.android.gms.ads.internal.client.zzfw zzfwVar) throws android.os.RemoteException {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(com.google.android.gms.ads.internal.client.zzee zzeeVar) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(com.google.android.gms.ads.internal.client.zzx zzxVar) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(com.google.android.gms.internal.ads.zzbgm zzbgmVar) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(boolean z) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmZ)).booleanValue()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        com.google.android.gms.internal.ads.zzetc zzetcVar = this.zzc.zzc;
        if (zzetcVar != null) {
            try {
                if (!zzdqVar.zzf()) {
                    this.zzf.zzb();
                }
            } catch (android.os.RemoteException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e);
            }
            zzetcVar.zzp(zzdqVar);
        }
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
        com.google.android.gms.internal.ads.zzcvl zzcvlVar = this.zzd;
        if (zzcvlVar.zzo() != null) {
            zzcvlVar.zzo().zzb(j);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final long zzU() {
        com.google.android.gms.internal.ads.zzcvl zzcvlVar = this.zzd;
        if (zzcvlVar == null || zzcvlVar.zzo() == null) {
            return 0L;
        }
        return zzcvlVar.zzo().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzY(com.google.android.gms.ads.internal.client.zzcp zzcpVar) throws android.os.RemoteException {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.dynamic.IObjectWrapper zzb() throws android.os.RemoteException {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzc() throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzd() throws android.os.RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzdS(com.google.android.gms.ads.internal.client.zzbh zzbhVar) throws android.os.RemoteException {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zze(com.google.android.gms.ads.internal.client.zzm zzmVar) throws android.os.RemoteException {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzf() throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzl().zza(null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg() throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzl().zzb(null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(com.google.android.gms.ads.internal.client.zzcl zzclVar) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzetc zzetcVar = this.zzc.zzc;
        if (zzetcVar != null) {
            zzetcVar.zzo(zzclVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzj(com.google.android.gms.ads.internal.client.zzby zzbyVar) throws android.os.RemoteException {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final android.os.Bundle zzk() throws android.os.RemoteException {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new android.os.Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl() throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzm() throws android.os.RemoteException {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzr zzn() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        return com.google.android.gms.internal.ads.zzfle.zza(this.zza, java.util.Collections.singletonList(this.zzd.zze()));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(com.google.android.gms.ads.internal.client.zzr zzrVar) throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzcvl zzcvlVar = this.zzd;
        if (zzcvlVar != null) {
            zzcvlVar.zzb(this.zze, zzrVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(com.google.android.gms.internal.ads.zzbzk zzbzkVar) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzq(com.google.android.gms.internal.ads.zzbzn zzbznVar, java.lang.String str) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final java.lang.String zzr() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzcvl zzcvlVar = this.zzd;
        if (zzcvlVar.zzn() != null) {
            return zzcvlVar.zzn().zze();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final java.lang.String zzs() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzcvl zzcvlVar = this.zzd;
        if (zzcvlVar.zzn() != null) {
            return zzcvlVar.zzn().zze();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzdx zzt() {
        return this.zzd.zzn();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final java.lang.String zzu() throws android.os.RemoteException {
        return this.zzc.zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcl zzv() throws android.os.RemoteException {
        return this.zzc.zzo;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzw() throws android.os.RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx(com.google.android.gms.internal.ads.zzbjl zzbjlVar) throws android.os.RemoteException {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(com.google.android.gms.ads.internal.client.zzbe zzbeVar) throws android.os.RemoteException {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz(boolean z) throws android.os.RemoteException {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }
}
