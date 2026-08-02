package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class zzbsz extends zzaxo implements zzbta {
    public static zzbta zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return queryLocalInterface instanceof zzbta ? (zzbta) queryLocalInterface : new zzbsy(iBinder);
    }
}
