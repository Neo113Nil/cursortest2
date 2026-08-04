package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbgf extends zzaxn implements zzbgh {
    public zzbgf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgh
    public final void zze(zzbfy zzbfyVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, zzbfyVar);
        zzda(1, parcelZza);
    }
}
