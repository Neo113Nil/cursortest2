package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzfm extends com.google.android.gms.internal.ads.zzcch {
    private static void zzu(final com.google.android.gms.internal.ads.zzccp zzccpVar) {
        com.google.android.gms.ads.internal.util.client.zzo.zzf("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzccp zzccpVar2 = com.google.android.gms.internal.ads.zzccp.this;
                if (zzccpVar2 != null) {
                    try {
                        zzccpVar2.zzf(1);
                    } catch (android.os.RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzb(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.internal.ads.zzccp zzccpVar) throws android.os.RemoteException {
        zzu(zzccpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.internal.ads.zzccp zzccpVar) throws android.os.RemoteException {
        zzu(zzccpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zze(com.google.android.gms.internal.ads.zzccl zzcclVar) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzf(com.google.android.gms.ads.internal.client.zzdn zzdnVar) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final android.os.Bundle zzg() throws android.os.RemoteException {
        return new android.os.Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzh(com.google.android.gms.internal.ads.zzccw zzccwVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final boolean zzi() throws android.os.RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final java.lang.String zzj() throws android.os.RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final com.google.android.gms.internal.ads.zzccf zzl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final com.google.android.gms.ads.internal.client.zzdx zzm() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final java.lang.String zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzo(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzp(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final long zzq() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzr(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzs(com.google.android.gms.internal.ads.zzccq zzccqVar) throws android.os.RemoteException {
    }
}
