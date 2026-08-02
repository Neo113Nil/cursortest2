package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public final class zzbfu extends zzaxn implements zzbfw {
    public zzbfu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final IBinder zze(InterfaceC1506a interfaceC1506a, InterfaceC1506a interfaceC1506a2, InterfaceC1506a interfaceC1506a3) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzf(zza, interfaceC1506a2);
        zzaxp.zzf(zza, interfaceC1506a3);
        Parcel zzcZ = zzcZ(1, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        zzcZ.recycle();
        return readStrongBinder;
    }
}
