package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbvo extends zzaxn implements zzbvq {
    public zzbvo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final int zze() {
        Parcel parcelZzcZ = zzcZ(2, zza());
        int i7 = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final String zzf() {
        Parcel parcelZzcZ = zzcZ(1, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }
}
