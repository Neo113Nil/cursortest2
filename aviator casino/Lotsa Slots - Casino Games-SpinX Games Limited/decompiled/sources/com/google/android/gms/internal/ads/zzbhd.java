package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbhd extends com.google.android.gms.internal.ads.zzbee implements android.os.IInterface {
    zzbhd(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final com.google.android.gms.internal.ads.zzbgy zze(com.google.android.gms.internal.ads.zzbhb zzbhbVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzbhbVar);
        android.os.Parcel zzcZ = zzcZ(1, zza);
        com.google.android.gms.internal.ads.zzbgy zzbgyVar = (com.google.android.gms.internal.ads.zzbgy) com.google.android.gms.internal.ads.zzbeg.zzb(zzcZ, com.google.android.gms.internal.ads.zzbgy.CREATOR);
        zzcZ.recycle();
        return zzbgyVar;
    }

    public final com.google.android.gms.internal.ads.zzbgy zzf(com.google.android.gms.internal.ads.zzbhb zzbhbVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzbhbVar);
        android.os.Parcel zzcZ = zzcZ(2, zza);
        com.google.android.gms.internal.ads.zzbgy zzbgyVar = (com.google.android.gms.internal.ads.zzbgy) com.google.android.gms.internal.ads.zzbeg.zzb(zzcZ, com.google.android.gms.internal.ads.zzbgy.CREATOR);
        zzcZ.recycle();
        return zzbgyVar;
    }

    public final long zzg(com.google.android.gms.internal.ads.zzbhb zzbhbVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzbhbVar);
        android.os.Parcel zzcZ = zzcZ(3, zza);
        long readLong = zzcZ.readLong();
        zzcZ.recycle();
        return readLong;
    }
}
