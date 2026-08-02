package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import o3.InterfaceC1506a;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class zzbov extends zzaxn implements zzbox {
    public zzbov(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final InterfaceC1506a zze() {
        return AbstractC1663a.h(zzcZ(1, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final boolean zzf() {
        Parcel zzcZ = zzcZ(2, zza());
        boolean zzg = zzaxp.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }
}
