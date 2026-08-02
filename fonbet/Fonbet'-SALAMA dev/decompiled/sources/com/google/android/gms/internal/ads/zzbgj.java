package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class zzbgj extends zzaxo implements zzbgk {
    public static zzbgk zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        return queryLocalInterface instanceof zzbgk ? (zzbgk) queryLocalInterface : new zzbgi(iBinder);
    }
}
