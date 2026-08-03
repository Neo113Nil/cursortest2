package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcav extends com.google.android.gms.internal.ads.zzbee implements android.os.IInterface {
    zzcav(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void zze(java.lang.String str, com.google.android.gms.internal.ads.zzcam zzcamVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzcamVar);
        zzda(1, zza);
    }

    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzbaVar);
        zzda(2, zza);
    }
}
