package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class zzfqg extends zzaxo implements zzfqh {
    public static zzfqh zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
        return queryLocalInterface instanceof zzfqh ? (zzfqh) queryLocalInterface : new zzfqf(iBinder);
    }
}
