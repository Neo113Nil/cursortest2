package com.startapp.sdk.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.telephony.TelephonyManager;

/* loaded from: classes.dex */
public abstract class rd {
    public static String a(Context context) {
        NetworkCapabilities networkCapabilities;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return "e100";
            }
            if (!p0.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                return "e105";
            }
            int i3 = Build.VERSION.SDK_INT;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                if (networkCapabilities.hasTransport(1)) {
                    return "WIFI";
                }
                if (networkCapabilities.hasTransport(0)) {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager != null) {
                        return Integer.toString(i3 < 30 ? telephonyManager.getNetworkType() : telephonyManager.getDataNetworkType());
                    }
                    return "e101";
                }
            }
            return "e102";
        } catch (Exception unused) {
            return "e105";
        }
    }
}
