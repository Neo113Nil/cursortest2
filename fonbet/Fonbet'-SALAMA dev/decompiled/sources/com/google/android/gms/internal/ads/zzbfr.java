package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public final class zzbfr extends zzaxn implements zzbft {
    public zzbfr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final void zzb(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final void zzc(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final void zzd() {
        zzda(2, zza());
    }
}
