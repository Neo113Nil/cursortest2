package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class zzcfz extends zzaxo implements zzcga {
    public static zzcga zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        return queryLocalInterface instanceof zzcga ? (zzcga) queryLocalInterface : new zzcfy(iBinder);
    }
}
