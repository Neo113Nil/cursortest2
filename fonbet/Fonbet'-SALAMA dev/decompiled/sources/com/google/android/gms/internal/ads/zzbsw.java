package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class zzbsw extends zzaxo implements zzbsx {
    public static zzbsx zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return queryLocalInterface instanceof zzbsx ? (zzbsx) queryLocalInterface : new zzbsv(iBinder);
    }
}
