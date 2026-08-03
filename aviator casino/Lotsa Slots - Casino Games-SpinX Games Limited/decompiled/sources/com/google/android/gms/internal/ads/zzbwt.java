package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbwt extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzbwv {
    zzbwt(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final void zze(com.google.android.gms.internal.ads.zzbvr zzbvrVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbvrVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final void zzf(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzeVar);
        zzda(3, zza);
    }
}
