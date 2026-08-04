package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbov extends zzaxn implements zzbox {
    public zzbov(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final p105o3.a zze() {
        return p150v0.a.h(zzcZ(1, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final boolean zzf() {
        Parcel parcelZzcZ = zzcZ(2, zza());
        boolean zZzg = zzaxp.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }
}
