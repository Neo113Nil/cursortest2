package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class zzbvf extends zzaxo implements zzbvg {
    public static zzbvg zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        return queryLocalInterface instanceof zzbvg ? (zzbvg) queryLocalInterface : new zzbve(iBinder);
    }
}
