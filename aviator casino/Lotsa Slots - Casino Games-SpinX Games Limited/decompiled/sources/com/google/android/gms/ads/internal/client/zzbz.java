package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzbz extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.ads.internal.client.zzcb {
    zzbz(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcb
    public final void zze(com.google.android.gms.ads.internal.client.zzfp zzfpVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzfpVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcb
    public final void zzf(com.google.android.gms.ads.internal.client.zzfp zzfpVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzfpVar);
        zzda(2, zza);
    }
}
