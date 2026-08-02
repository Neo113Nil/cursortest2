package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbwb extends zzaxn implements IInterface {
    public zzbwb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbvq zzbvqVar, String str, String str2) {
        Parcel zza = zza();
        zzaxp.zzf(zza, zzbvqVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzda(2, zza);
    }
}
