package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public final class zzbpz extends zzaxn implements zzbqb {
    public zzbpz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbqb
    public final void zze(String str) {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqb
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzeVar);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqb
    public final void zzg(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqb
    public final void zzh(zzbox zzboxVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, zzboxVar);
        zzda(4, zza);
    }
}
