package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbgk extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzbgm {
    zzbgk(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final void zzb(com.google.android.gms.internal.ads.zzbgj zzbgjVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbgjVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final void zzc(int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzeVar);
        zzda(3, zza);
    }
}
