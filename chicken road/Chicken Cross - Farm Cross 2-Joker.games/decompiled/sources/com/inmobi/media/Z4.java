package com.inmobi.media;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class Z4 {
    public static final Qf a() {
        Context context = AbstractC3914mk.f7252a;
        if (context == null) {
            return Qf.f6803a;
        }
        try {
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type != 1) {
                        return Qf.b;
                    }
                    Object systemService2 = context.getApplicationContext().getSystemService(com.ironsource.Q3.b);
                    Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.net.wifi.WifiManager");
                    int linkSpeed = ((WifiManager) systemService2).getConnectionInfo().getLinkSpeed();
                    return linkSpeed >= 10 ? Qf.d : linkSpeed >= 2 ? Qf.c : Qf.b;
                }
                Intrinsics.checkNotNullParameter(context, "context");
                if (ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != 0) {
                    return Qf.f6803a;
                }
                Object systemService3 = context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                Intrinsics.checkNotNull(systemService3, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                int networkType = ((TelephonyManager) systemService3).getNetworkType();
                return (networkType == 1 || networkType == 2 || networkType == 4 || networkType == 7 || networkType == 11 || networkType == 16) ? Qf.b : (networkType == 18 || networkType == 20) ? Qf.d : Qf.c;
            }
            return Qf.f6803a;
        } catch (SecurityException unused) {
            return Qf.f6803a;
        }
    }
}
