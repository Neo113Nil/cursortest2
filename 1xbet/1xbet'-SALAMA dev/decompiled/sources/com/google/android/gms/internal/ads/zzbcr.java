package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbcr extends zzaxn implements zzbct {
    public zzbcr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final void zze(zzbcq zzbcqVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, zzbcqVar);
        zzda(1, parcelZza);
    }
}
