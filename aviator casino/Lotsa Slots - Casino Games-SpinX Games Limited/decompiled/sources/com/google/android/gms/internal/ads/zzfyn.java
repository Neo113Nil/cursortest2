package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfyn extends com.google.android.gms.internal.ads.zzbee implements android.os.IInterface {
    zzfyn(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final com.google.android.gms.internal.ads.zzfyl zze(com.google.android.gms.internal.ads.zzfyj zzfyjVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzfyjVar);
        android.os.Parcel zzcZ = zzcZ(1, zza);
        com.google.android.gms.internal.ads.zzfyl zzfylVar = (com.google.android.gms.internal.ads.zzfyl) com.google.android.gms.internal.ads.zzbeg.zzb(zzcZ, com.google.android.gms.internal.ads.zzfyl.CREATOR);
        zzcZ.recycle();
        return zzfylVar;
    }

    public final void zzf(com.google.android.gms.internal.ads.zzfyg zzfygVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzfygVar);
        zzda(2, zza);
    }

    public final com.google.android.gms.internal.ads.zzfyu zzg(com.google.android.gms.internal.ads.zzfys zzfysVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzfysVar);
        android.os.Parcel zzcZ = zzcZ(3, zza);
        com.google.android.gms.internal.ads.zzfyu zzfyuVar = (com.google.android.gms.internal.ads.zzfyu) com.google.android.gms.internal.ads.zzbeg.zzb(zzcZ, com.google.android.gms.internal.ads.zzfyu.CREATOR);
        zzcZ.recycle();
        return zzfyuVar;
    }
}
