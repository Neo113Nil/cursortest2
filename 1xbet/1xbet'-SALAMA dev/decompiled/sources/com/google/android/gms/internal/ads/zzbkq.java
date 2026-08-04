package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbkq extends zzaxn implements IInterface {
    public zzbkq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbkk zzbkkVar, zzbkp zzbkpVar) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, zzbkkVar);
        zzaxp.zzf(parcelZza, zzbkpVar);
        zzdb(2, parcelZza);
    }
}
