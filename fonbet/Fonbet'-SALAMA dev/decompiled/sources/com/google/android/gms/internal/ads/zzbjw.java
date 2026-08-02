package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbjw extends zzaxn implements zzbjy {
    public zzbjw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbjy
    public final void zzb(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(1, zza);
    }
}
