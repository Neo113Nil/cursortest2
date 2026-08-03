package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcvg extends com.google.android.gms.internal.ads.zzbgi {
    private final com.google.android.gms.internal.ads.zzcvf zza;
    private final com.google.android.gms.ads.internal.client.zzbu zzb;
    private final com.google.android.gms.internal.ads.zzfge zzc;
    private boolean zzd;
    private final com.google.android.gms.internal.ads.zzdzl zze;

    public zzcvg(com.google.android.gms.internal.ads.zzcvf zzcvfVar, com.google.android.gms.ads.internal.client.zzbu zzbuVar, com.google.android.gms.internal.ads.zzfge zzfgeVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        this.zza = zzcvfVar;
        this.zzb = zzbuVar;
        this.zzc = zzfgeVar;
        this.zze = zzdzlVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbp)).booleanValue() && android.os.Build.VERSION.SDK_INT >= 35) {
            this.zzd = true;
        } else {
            this.zzd = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbs)).booleanValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgj
    public final com.google.android.gms.ads.internal.client.zzbu zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgj
    public final void zzf(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbgq zzbgqVar) {
        try {
            this.zzc.zzp(zzbgqVar);
            this.zza.zzb((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), zzbgqVar, this.zzd);
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgj
    public final com.google.android.gms.ads.internal.client.zzdx zzg() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhI)).booleanValue()) {
            return this.zza.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgj
    public final void zzh(boolean z) {
        this.zzd = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbgj
    public final void zzi(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!zzdqVar.zzf()) {
                    this.zze.zzb();
                }
            } catch (android.os.RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e);
            }
            this.zzc.zzr(zzdqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgj
    public final java.lang.String zzj() {
        try {
            return this.zzb.zzu();
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgj
    public final long zzk() {
        com.google.android.gms.internal.ads.zzcvf zzcvfVar = this.zza;
        if (zzcvfVar == null || zzcvfVar.zzo() == null) {
            return 0L;
        }
        return zzcvfVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbgj
    public final void zzl(long j) {
        com.google.android.gms.internal.ads.zzcvf zzcvfVar = this.zza;
        if (zzcvfVar == null || zzcvfVar.zzo() == null) {
            return;
        }
        zzcvfVar.zzo().zzb(j);
    }
}
