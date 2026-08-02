package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public final class zzcfy extends zzaxn implements zzcga {
    public zzcfy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final void zze(InterfaceC1506a interfaceC1506a, zzcfx zzcfxVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzf(zza, zzcfxVar);
        zzda(2, zza);
    }
}
