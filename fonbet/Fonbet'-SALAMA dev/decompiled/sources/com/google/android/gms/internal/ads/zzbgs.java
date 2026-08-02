package com.google.android.gms.internal.ads;

import F2.M;
import android.os.IBinder;
import android.os.Parcel;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public final class zzbgs extends zzaxn implements zzbgu {
    public zzbgs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgu
    public final void zze(M m7, InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, m7);
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(1, zza);
    }
}
