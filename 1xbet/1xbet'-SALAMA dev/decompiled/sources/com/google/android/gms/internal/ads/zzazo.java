package com.google.android.gms.internal.ads;

import F2.E0;
import F2.F0;
import F2.InterfaceC0265y0;
import F2.M;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
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
        Parcel parcelZzcZ = zzcZ(5, zza());
        F0 f0Zzb = E0.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return f0Zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzazq
    public final void zzg(boolean z4) {
        Parcel parcelZza = zza();
        int i7 = zzaxp.zza;
        parcelZza.writeInt(z4 ? 1 : 0);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzazq
    public final void zzh(InterfaceC0265y0 interfaceC0265y0) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, interfaceC0265y0);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzazq
    public final void zzi(p105o3.a aVar, zzazx zzazxVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzf(parcelZza, zzazxVar);
        zzda(4, parcelZza);
    }
}
