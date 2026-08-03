package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfjw extends com.google.android.gms.internal.ads.zzcch {
    private final com.google.android.gms.internal.ads.zzfjs zza;
    private final com.google.android.gms.internal.ads.zzfjj zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.internal.ads.zzfkr zzd;
    private final android.content.Context zze;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzf;
    private final com.google.android.gms.internal.ads.zzbap zzg;
    private final com.google.android.gms.internal.ads.zzdzl zzh;
    private com.google.android.gms.internal.ads.zzdvm zzi;
    private boolean zzj;

    public zzfjw(java.lang.String str, com.google.android.gms.internal.ads.zzfjs zzfjsVar, android.content.Context context, com.google.android.gms.internal.ads.zzfjj zzfjjVar, com.google.android.gms.internal.ads.zzfkr zzfkrVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzbap zzbapVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        this.zzc = str;
        this.zza = zzfjsVar;
        this.zzb = zzfjjVar;
        this.zzd = zzfkrVar;
        this.zze = context;
        this.zzf = versionInfoParcel;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbp)).booleanValue() || android.os.Build.VERSION.SDK_INT < 35) {
            this.zzj = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbo)).booleanValue();
        } else {
            this.zzj = true;
        }
        this.zzg = zzbapVar;
        this.zzh = zzdzlVar;
    }

    private final synchronized void zzy(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.internal.ads.zzccp zzccpVar, int i) throws android.os.RemoteException {
        if (!zzmVar.zzb()) {
            boolean z = false;
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbko.zzk.zze()).booleanValue()) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmD)).booleanValue()) {
                    z = true;
                }
            }
            if (this.zzf.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmE)).intValue() || !z) {
                com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
            }
        }
        com.google.android.gms.internal.ads.zzfjj zzfjjVar = this.zzb;
        zzfjjVar.zzh(zzccpVar);
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzK(this.zze) && zzmVar.zzs == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
            zzfjjVar.zzdJ(com.google.android.gms.internal.ads.zzfma.zzd(4, null, null));
        } else {
            if (this.zzi != null) {
                return;
            }
            com.google.android.gms.internal.ads.zzfjl zzfjlVar = new com.google.android.gms.internal.ads.zzfjl(null);
            com.google.android.gms.internal.ads.zzfjs zzfjsVar = this.zza;
            zzfjsVar.zzj(i);
            zzfjsVar.zza(zzmVar, this.zzc, zzfjlVar, new com.google.android.gms.internal.ads.zzfjv(this));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final synchronized void zzb(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        zzk(iObjectWrapper, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final synchronized void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.internal.ads.zzccp zzccpVar) throws android.os.RemoteException {
        zzy(zzmVar, zzccpVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.internal.ads.zzccp zzccpVar) throws android.os.RemoteException {
        zzy(zzmVar, zzccpVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zze(com.google.android.gms.internal.ads.zzccl zzcclVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzi(zzcclVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzf(com.google.android.gms.ads.internal.client.zzdn zzdnVar) {
        if (zzdnVar == null) {
            this.zzb.zzk(null);
        } else {
            this.zzb.zzk(new com.google.android.gms.internal.ads.zzfju(this, zzdnVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final android.os.Bundle zzg() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzdvm zzdvmVar = this.zzi;
        return zzdvmVar != null ? zzdvmVar.zzg() : new android.os.Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final synchronized void zzh(com.google.android.gms.internal.ads.zzccw zzccwVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzfkr zzfkrVar = this.zzd;
        zzfkrVar.zza = zzccwVar.zza;
        zzfkrVar.zzb = zzccwVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final boolean zzi() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzdvm zzdvmVar = this.zzi;
        return (zzdvmVar == null || zzdvmVar.zzb()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final synchronized java.lang.String zzj() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzdvm zzdvmVar = this.zzi;
        if (zzdvmVar == null || zzdvmVar.zzn() == null) {
            return null;
        }
        return zzdvmVar.zzn().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final synchronized void zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, boolean z) throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Rewarded can not be shown before loaded");
            this.zzb.zzj(com.google.android.gms.internal.ads.zzfma.zzd(9, null, null));
        } else {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdG)).booleanValue()) {
                this.zzg.zzb().zzi(new java.lang.Throwable().getStackTrace());
            }
            this.zzi.zza(z, (android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final com.google.android.gms.internal.ads.zzccf zzl() {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzdvm zzdvmVar = this.zzi;
        if (zzdvmVar != null) {
            return zzdvmVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final com.google.android.gms.ads.internal.client.zzdx zzm() {
        com.google.android.gms.internal.ads.zzdvm zzdvmVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhI)).booleanValue() && (zzdvmVar = this.zzi) != null) {
            return zzdvmVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final java.lang.String zzn() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzo(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdqVar.zzf()) {
                this.zzh.zzb();
            }
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzb.zzl(zzdqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final synchronized void zzp(boolean z) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final synchronized long zzq() {
        com.google.android.gms.internal.ads.zzdvm zzdvmVar = this.zzi;
        if (zzdvmVar == null || zzdvmVar.zzo() == null) {
            return 0L;
        }
        return zzdvmVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final synchronized void zzr(long j) {
        com.google.android.gms.internal.ads.zzdvm zzdvmVar = this.zzi;
        if (zzdvmVar == null || zzdvmVar.zzo() == null) {
            return;
        }
        zzdvmVar.zzo().zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzs(com.google.android.gms.internal.ads.zzccq zzccqVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzp(zzccqVar);
    }

    public final void zzu(com.google.android.gms.internal.ads.zzfsy zzfsyVar) {
        this.zzb.zzo(zzfsyVar);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfkr zzv() {
        return this.zzd;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdvm zzw() {
        return this.zzi;
    }

    final /* synthetic */ void zzx(com.google.android.gms.internal.ads.zzdvm zzdvmVar) {
        this.zzi = zzdvmVar;
    }
}
