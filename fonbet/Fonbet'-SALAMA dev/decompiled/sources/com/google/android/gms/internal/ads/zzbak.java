package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbak extends zzaxn implements IInterface {
    public zzbak(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzbai zzbaiVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzbaiVar);
        Parcel zzcZ = zzcZ(3, zza);
        long readLong = zzcZ.readLong();
        zzcZ.recycle();
        return readLong;
    }

    public final zzbaf zzf(zzbai zzbaiVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzbaiVar);
        Parcel zzcZ = zzcZ(1, zza);
        zzbaf zzbafVar = (zzbaf) zzaxp.zza(zzcZ, zzbaf.CREATOR);
        zzcZ.recycle();
        return zzbafVar;
    }

    public final zzbaf zzg(zzbai zzbaiVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzbaiVar);
        Parcel zzcZ = zzcZ(2, zza);
        zzbaf zzbafVar = (zzbaf) zzaxp.zza(zzcZ, zzbaf.CREATOR);
        zzcZ.recycle();
        return zzbafVar;
    }
}
