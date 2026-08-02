package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public final class zzbxz extends zzaxn implements zzbyb {
    public zzbxz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final zzbxy zze(InterfaceC1506a interfaceC1506a, zzboo zzbooVar, int i7) {
        zzbxy zzbxwVar;
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzf(zza, zzbooVar);
        zza.writeInt(250930000);
        Parcel zzcZ = zzcZ(2, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbxwVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzbxwVar = queryLocalInterface instanceof zzbxy ? (zzbxy) queryLocalInterface : new zzbxw(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbxwVar;
    }
}
