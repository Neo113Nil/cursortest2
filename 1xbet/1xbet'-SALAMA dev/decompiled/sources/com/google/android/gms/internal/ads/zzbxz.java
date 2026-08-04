package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbxz extends zzaxn implements zzbyb {
    public zzbxz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final zzbxy zze(p105o3.a aVar, zzboo zzbooVar, int i7) {
        zzbxy zzbxwVar;
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzf(parcelZza, zzbooVar);
        parcelZza.writeInt(250930000);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbxwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzbxwVar = iInterfaceQueryLocalInterface instanceof zzbxy ? (zzbxy) iInterfaceQueryLocalInterface : new zzbxw(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbxwVar;
    }
}
