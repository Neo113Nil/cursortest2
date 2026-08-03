package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzfj extends com.google.android.gms.ads.internal.client.zzcx {
    private com.google.android.gms.internal.ads.zzbrw zza;

    final /* synthetic */ void zzb() {
        com.google.android.gms.internal.ads.zzbrw zzbrwVar = this.zza;
        if (zzbrwVar != null) {
            try {
                zzbrwVar.zzb(java.util.Collections.emptyList());
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not notify onComplete event.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zze() throws android.os.RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzf("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.ads.internal.client.zzfj.this.zzb();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzf(float f) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzg(java.lang.String str) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzh(boolean z) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzi(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzj(java.lang.String str, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final float zzk() throws android.os.RemoteException {
        return 1.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final boolean zzl() throws android.os.RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final java.lang.String zzm() {
        return "";
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzn(java.lang.String str) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzo(com.google.android.gms.internal.ads.zzbvc zzbvcVar) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzp(com.google.android.gms.internal.ads.zzbrw zzbrwVar) throws android.os.RemoteException {
        this.zza = zzbrwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final java.util.List zzq() throws android.os.RemoteException {
        return java.util.Collections.emptyList();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzr(com.google.android.gms.ads.internal.client.zzfr zzfrVar) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzs() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzt(com.google.android.gms.ads.internal.client.zzdk zzdkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzu(boolean z) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzv(java.lang.String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzw() {
    }
}
