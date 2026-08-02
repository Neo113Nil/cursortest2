package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class zzaxr extends zzaxo implements zzaxs {
    public static zzaxs zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return queryLocalInterface instanceof zzaxs ? (zzaxs) queryLocalInterface : new zzaxq(iBinder);
    }
}
