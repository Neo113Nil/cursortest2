package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public final class zzbsp extends zzaxn implements zzbsr {
    public zzbsp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final IBinder zze(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        Parcel zzcZ = zzcZ(1, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        zzcZ.recycle();
        return readStrongBinder;
    }
}
