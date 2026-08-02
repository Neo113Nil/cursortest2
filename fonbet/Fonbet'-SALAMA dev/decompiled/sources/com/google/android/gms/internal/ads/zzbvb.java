package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbvb extends zzaxn implements IInterface {
    public zzbvb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbva zzbvaVar, String str, String str2) {
        Parcel zza = zza();
        zzaxp.zzf(zza, zzbvaVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzda(2, zza);
    }
}
