package com.google.android.gms.ads;

import F2.T0;
import J2.j;
import android.os.RemoteException;
import com.google.android.gms.common.internal.D;

/* loaded from: classes.dex */
public class MobileAds {
    private static void setPlugin(String str) {
        T0 e7 = T0.e();
        synchronized (e7.f2638e) {
            D.k("MobileAds.initialize() must be called prior to setting the plugin.", e7.f2639f != null);
            try {
                e7.f2639f.zzt(str);
            } catch (RemoteException e8) {
                j.e("Unable to set plugin.", e8);
            }
        }
    }
}
