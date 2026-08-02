package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class zzbya extends zzaxo implements zzbyb {
    public static zzbyb zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
        return queryLocalInterface instanceof zzbyb ? (zzbyb) queryLocalInterface : new zzbxz(iBinder);
    }
}
