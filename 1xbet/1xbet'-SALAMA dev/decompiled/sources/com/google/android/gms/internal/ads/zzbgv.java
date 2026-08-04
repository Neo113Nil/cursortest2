package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbgv extends zzaxn implements zzbgx {
    public zzbgv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final void zze(zzbhd zzbhdVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, zzbhdVar);
        zzda(1, parcelZza);
    }
}
