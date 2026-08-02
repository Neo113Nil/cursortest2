package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public final class zzbsi extends zzaxn implements zzbsk {
    public zzbsi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbsk
    public final zzbsh zze(InterfaceC1506a interfaceC1506a, zzboo zzbooVar, int i7) {
        zzbsh zzbsfVar;
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzf(zza, zzbooVar);
        zza.writeInt(250930000);
        Parcel zzcZ = zzcZ(1, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsfVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbsfVar = queryLocalInterface instanceof zzbsh ? (zzbsh) queryLocalInterface : new zzbsf(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbsfVar;
    }
}
