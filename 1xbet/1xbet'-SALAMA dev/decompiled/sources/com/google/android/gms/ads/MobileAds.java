package com.google.android.gms.ads;

import F2.T0;
import J2.j;
import android.os.RemoteException;
import com.google.android.gms.common.internal.D;

/* JADX INFO: loaded from: classes.dex */
public class MobileAds {
    private static void setPlugin(String str) {
        T0 t0E = T0.e();
        synchronized (t0E.f2638e) {
            D.k("MobileAds.initialize() must be called prior to setting the plugin.", t0E.f2639f != null);
            try {
                t0E.f2639f.zzt(str);
            } catch (RemoteException e7) {
                j.e("Unable to set plugin.", e7);
            }
        }
    }
}
