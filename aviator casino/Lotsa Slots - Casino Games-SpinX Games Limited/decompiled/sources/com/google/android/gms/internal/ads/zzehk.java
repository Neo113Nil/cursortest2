package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzehk implements com.google.android.gms.internal.ads.zzefw {
    final /* synthetic */ com.google.android.gms.internal.ads.zzehn zza;

    zzehk(com.google.android.gms.internal.ads.zzehn zzehnVar) {
        java.util.Objects.requireNonNull(zzehnVar);
        this.zza = zzehnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefw
    public final void zza() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpC)).booleanValue()) {
            com.google.android.gms.internal.ads.zzdzk zza = this.zza.zzd().zza();
            zza.zzc("action", "ptard");
            zza.zzc("ptard", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            zza.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefw
    public final void zzb(android.os.RemoteException remoteException) {
        this.zza.zzc();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpD)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(remoteException, "Preconnect Remote");
        }
    }
}
