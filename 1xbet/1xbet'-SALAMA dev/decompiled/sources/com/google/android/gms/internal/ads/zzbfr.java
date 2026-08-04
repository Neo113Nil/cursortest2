package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbfr extends zzaxn implements zzbft {
    public zzbfr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final void zzb(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final void zzc(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final void zzd() {
        zzda(2, zza());
    }
}
