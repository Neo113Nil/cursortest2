package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbkq extends zzaxn implements IInterface {
    public zzbkq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbkk zzbkkVar, zzbkp zzbkpVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzbkkVar);
        zzaxp.zzf(zza, zzbkpVar);
        zzdb(2, zza);
    }
}
