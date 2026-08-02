package com.google.android.gms.internal.ads;

import F2.E0;
import F2.F0;
import F2.InterfaceC0265y0;
import F2.M;
import android.os.IBinder;
import android.os.Parcel;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public final class zzazo extends zzaxn implements zzazq {
    public zzazo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzazq
    public final M zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzazq
    public final F0 zzf() {
        Parcel zzcZ = zzcZ(5, zza());
        F0 zzb = E0.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzazq
    public final void zzg(boolean z4) {
        Parcel zza = zza();
        int i7 = zzaxp.zza;
        zza.writeInt(z4 ? 1 : 0);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzazq
    public final void zzh(InterfaceC0265y0 interfaceC0265y0) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC0265y0);
        zzda(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzazq
    public final void zzi(InterfaceC1506a interfaceC1506a, zzazx zzazxVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzf(zza, zzazxVar);
        zzda(4, zza);
    }
}
