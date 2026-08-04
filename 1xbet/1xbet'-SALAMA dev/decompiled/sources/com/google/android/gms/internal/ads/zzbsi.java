package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbsi extends zzaxn implements zzbsk {
    public zzbsi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbsk
    public final zzbsh zze(p105o3.a aVar, zzboo zzbooVar, int i7) {
        zzbsh zzbsfVar;
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzf(parcelZza, zzbooVar);
        parcelZza.writeInt(250930000);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbsfVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbsfVar = iInterfaceQueryLocalInterface instanceof zzbsh ? (zzbsh) iInterfaceQueryLocalInterface : new zzbsf(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbsfVar;
    }
}
