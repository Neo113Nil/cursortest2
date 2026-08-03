package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzcc extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.ads.internal.client.zzce {
    zzcc(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zze(java.lang.String str, com.google.android.gms.ads.internal.client.zzdx zzdxVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzdxVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zzf(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zzg(java.lang.String str, com.google.android.gms.ads.internal.client.zze zzeVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzeVar);
        zzda(3, zza);
    }
}
