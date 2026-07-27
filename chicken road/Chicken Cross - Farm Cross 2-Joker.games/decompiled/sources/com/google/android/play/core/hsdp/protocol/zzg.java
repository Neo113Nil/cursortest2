package com.google.android.play.core.hsdp.protocol;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes8.dex */
public abstract class zzg extends com.google.android.gms.internal.playcore_hsdp.zzb implements zzh {
    public static zzh zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.hsdp.protocol.IHsdpService");
        return queryLocalInterface instanceof zzh ? (zzh) queryLocalInterface : new zzf(iBinder);
    }
}
