package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public final class zzbkc extends zzaxn implements zzbke {
    public zzbkc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbke
    public final zzbkb zze(InterfaceC1506a interfaceC1506a, zzboo zzbooVar, int i7, zzbjy zzbjyVar) {
        zzbkb zzbjzVar;
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzf(zza, zzbooVar);
        zza.writeInt(250930000);
        zzaxp.zzf(zza, zzbjyVar);
        Parcel zzcZ = zzcZ(1, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbjzVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbjzVar = queryLocalInterface instanceof zzbkb ? (zzbkb) queryLocalInterface : new zzbjz(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbjzVar;
    }
}
