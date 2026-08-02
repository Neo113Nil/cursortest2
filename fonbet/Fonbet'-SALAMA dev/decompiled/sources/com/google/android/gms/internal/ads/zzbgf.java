package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbgf extends zzaxn implements zzbgh {
    public zzbgf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgh
    public final void zze(zzbfy zzbfyVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, zzbfyVar);
        zzda(1, zza);
    }
}
