package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfkc extends com.google.android.gms.internal.ads.zzcbr {
    private final com.google.android.gms.internal.ads.zzfjs zza;
    private final com.google.android.gms.internal.ads.zzfjj zzb;
    private final com.google.android.gms.internal.ads.zzfkr zzc;
    private com.google.android.gms.internal.ads.zzdvm zzd;
    private boolean zze = false;

    public zzfkc(com.google.android.gms.internal.ads.zzfjs zzfjsVar, com.google.android.gms.internal.ads.zzfjj zzfjjVar, com.google.android.gms.internal.ads.zzfkr zzfkrVar) {
        this.zza = zzfjsVar;
        this.zzb = zzfjjVar;
        this.zzc = zzfkrVar;
    }

    private final synchronized boolean zzy() {
        com.google.android.gms.internal.ads.zzdvm zzdvmVar = this.zzd;
        if (zzdvmVar != null) {
            if (!zzdvmVar.zze()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgy)).booleanValue() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (java.util.regex.Pattern.matches(r1, r0) != false) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzcbs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzb(com.google.android.gms.internal.ads.zzcbw zzcbwVar) throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        java.lang.String str = zzcbwVar.zzb;
        java.lang.String str2 = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgw);
        if (str2 != null && str != null) {
            try {
            } catch (java.lang.RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "NonagonUtil.isPatternMatched");
            }
        }
        if (zzy()) {
        }
        com.google.android.gms.internal.ads.zzfjl zzfjlVar = new com.google.android.gms.internal.ads.zzfjl(null);
        this.zzd = null;
        com.google.android.gms.internal.ads.zzfjs zzfjsVar = this.zza;
        zzfjsVar.zzj(1);
        zzfjsVar.zza(zzcbwVar.zza, zzcbwVar.zzb, zzfjlVar, new com.google.android.gms.internal.ads.zzfka(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized void zzc() throws android.os.RemoteException {
        zzp(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzd(com.google.android.gms.internal.ads.zzcbv zzcbvVar) throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzn(zzcbvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final boolean zze() throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzf() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzg() {
        zzj(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzh() throws android.os.RemoteException {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized void zzi(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zza(iObjectWrapper == null ? null : (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized void zzj(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zzb(iObjectWrapper == null ? null : (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized void zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        android.content.Context context = null;
        this.zzb.zzk(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzl().zzc(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized java.lang.String zzl() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdvm zzdvmVar = this.zzd;
        if (zzdvmVar == null || zzdvmVar.zzn() == null) {
            return null;
        }
        return zzdvmVar.zzn().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized void zzm(java.lang.String str) throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzn(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzbyVar == null) {
            this.zzb.zzk(null);
        } else {
            this.zzb.zzk(new com.google.android.gms.internal.ads.zzfkb(this, zzbyVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final android.os.Bundle zzo() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        com.google.android.gms.internal.ads.zzdvm zzdvmVar = this.zzd;
        return zzdvmVar != null ? zzdvmVar.zzg() : new android.os.Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized void zzp(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("showAd must be called on the main UI thread.");
        if (this.zzd != null) {
            android.app.Activity activity = null;
            if (iObjectWrapper != null) {
                java.lang.Object unwrap = com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
                if (unwrap instanceof android.app.Activity) {
                    activity = (android.app.Activity) unwrap;
                }
            }
            this.zzd.zza(this.zze, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized void zzq(java.lang.String str) throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized void zzr(boolean z) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final boolean zzs() {
        com.google.android.gms.internal.ads.zzdvm zzdvmVar = this.zzd;
        return zzdvmVar != null && zzdvmVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final synchronized com.google.android.gms.ads.internal.client.zzdx zzt() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdvm zzdvmVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhI)).booleanValue() && (zzdvmVar = this.zzd) != null) {
            return zzdvmVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzu(com.google.android.gms.internal.ads.zzcbq zzcbqVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzq(zzcbqVar);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfkr zzv() {
        return this.zzc;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdvm zzw() {
        return this.zzd;
    }

    final /* synthetic */ void zzx(com.google.android.gms.internal.ads.zzdvm zzdvmVar) {
        this.zzd = zzdvmVar;
    }
}
