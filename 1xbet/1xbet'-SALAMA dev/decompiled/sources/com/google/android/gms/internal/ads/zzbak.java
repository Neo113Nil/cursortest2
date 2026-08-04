package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbak extends zzaxn implements IInterface {
    public zzbak(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzbai zzbaiVar) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, zzbaiVar);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        long j = parcelZzcZ.readLong();
        parcelZzcZ.recycle();
        return j;
    }

    public final zzbaf zzf(zzbai zzbaiVar) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, zzbaiVar);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        zzbaf zzbafVar = (zzbaf) zzaxp.zza(parcelZzcZ, zzbaf.CREATOR);
        parcelZzcZ.recycle();
        return zzbafVar;
    }

    public final zzbaf zzg(zzbai zzbaiVar) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, zzbaiVar);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        zzbaf zzbafVar = (zzbaf) zzaxp.zza(parcelZzcZ, zzbaf.CREATOR);
        parcelZzcZ.recycle();
        return zzbafVar;
    }
}
