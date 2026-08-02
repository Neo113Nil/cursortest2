package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class zzbgg extends zzaxo implements zzbgh {
    public static zzbgh zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        return queryLocalInterface instanceof zzbgh ? (zzbgh) queryLocalInterface : new zzbgf(iBinder);
    }
}
