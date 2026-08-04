package com.google.android.gms.internal.ads;

import F2.M;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbgs extends zzaxn implements zzbgu {
    public zzbgs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgu
    public final void zze(M m7, p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, m7);
        zzaxp.zzf(parcelZza, aVar);
        zzda(1, parcelZza);
    }
}
