package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbgi extends zzaxn implements zzbgk {
    public zzbgi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void zze(zzbga zzbgaVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, zzbgaVar);
        zzda(1, parcelZza);
    }
}
