package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class zzblr extends zzaxo implements zzbls {
    public static zzbls zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        return queryLocalInterface instanceof zzbls ? (zzbls) queryLocalInterface : new zzblq(iBinder);
    }
}
