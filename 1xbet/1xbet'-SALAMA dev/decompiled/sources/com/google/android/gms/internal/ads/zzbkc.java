package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbkc extends zzaxn implements zzbke {
    public zzbkc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbke
    public final zzbkb zze(p105o3.a aVar, zzboo zzbooVar, int i7, zzbjy zzbjyVar) {
        zzbkb zzbjzVar;
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzf(parcelZza, zzbooVar);
        parcelZza.writeInt(250930000);
        zzaxp.zzf(parcelZza, zzbjyVar);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbjzVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbjzVar = iInterfaceQueryLocalInterface instanceof zzbkb ? (zzbkb) iInterfaceQueryLocalInterface : new zzbjz(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbjzVar;
    }
}
