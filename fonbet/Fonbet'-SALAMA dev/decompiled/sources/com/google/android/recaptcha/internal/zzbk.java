package com.google.android.recaptcha.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import f6.C1111d;
import g6.AbstractC1170s;
import g6.C1169r;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import t6.h;

/* loaded from: classes.dex */
public final class zzbk {
    public zzbk() {
        new ConcurrentHashMap();
        zzc();
    }

    public static final Set zza(Context context) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Object systemService = context.getSystemService("connectivity");
            h.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                linkedHashSet.add(zznz.TRANSPORT_WIFI);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                linkedHashSet.add(zznz.TRANSPORT_CELLULAR);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                linkedHashSet.add(zznz.TRANSPORT_VPN);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(3)) {
                linkedHashSet.add(zznz.TRANSPORT_ETHERNET);
            }
            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                linkedHashSet.add(zznz.NET_CAPABILITY_VALIDATED);
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return C1169r.f13304a;
        }
    }

    public static final boolean zzb(Context context) {
        ConnectivityManager connectivityManager;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        try {
            Object systemService = context.getSystemService("connectivity");
            h.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            connectivityManager = (ConnectivityManager) systemService;
            activeNetwork = connectivityManager.getActiveNetwork();
        } catch (Exception unused) {
        }
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasCapability(16);
    }

    private static final Map zzc() {
        LinkedHashMap N02 = AbstractC1170s.N0(new C1111d(0, zznz.NET_CAPABILITY_MMS), new C1111d(1, zznz.NET_CAPABILITY_SUPL), new C1111d(2, zznz.NET_CAPABILITY_DUN), new C1111d(3, zznz.NET_CAPABILITY_FOTA), new C1111d(4, zznz.NET_CAPABILITY_IMS), new C1111d(5, zznz.NET_CAPABILITY_CBS), new C1111d(6, zznz.NET_CAPABILITY_WIFI_P2P), new C1111d(7, zznz.NET_CAPABILITY_IA), new C1111d(8, zznz.NET_CAPABILITY_RCS), new C1111d(9, zznz.NET_CAPABILITY_XCAP), new C1111d(10, zznz.NET_CAPABILITY_EIMS), new C1111d(11, zznz.NET_CAPABILITY_NOT_METERED), new C1111d(12, zznz.NET_CAPABILITY_INTERNET), new C1111d(13, zznz.NET_CAPABILITY_NOT_RESTRICTED), new C1111d(14, zznz.NET_CAPABILITY_TRUSTED), new C1111d(15, zznz.NET_CAPABILITY_NOT_VPN));
        int i7 = Build.VERSION.SDK_INT;
        N02.put(17, zznz.NET_CAPABILITY_CAPTIVE_PORTAL);
        N02.put(16, zznz.NET_CAPABILITY_VALIDATED);
        if (i7 >= 28) {
            N02.put(18, zznz.NET_CAPABILITY_NOT_ROAMING);
            N02.put(19, zznz.NET_CAPABILITY_FOREGROUND);
            N02.put(20, zznz.NET_CAPABILITY_NOT_CONGESTED);
            N02.put(21, zznz.NET_CAPABILITY_NOT_SUSPENDED);
        }
        if (i7 >= 29) {
            N02.put(23, zznz.NET_CAPABILITY_MCX);
        }
        if (i7 >= 30) {
            N02.put(25, zznz.NET_CAPABILITY_TEMPORARILY_NOT_METERED);
        }
        if (i7 >= 31) {
            N02.put(32, zznz.NET_CAPABILITY_HEAD_UNIT);
            N02.put(29, zznz.NET_CAPABILITY_ENTERPRISE);
        }
        if (i7 >= 33) {
            N02.put(35, zznz.NET_CAPABILITY_PRIORITIZE_BANDWIDTH);
            N02.put(34, zznz.NET_CAPABILITY_PRIORITIZE_LATENCY);
            N02.put(33, zznz.NET_CAPABILITY_MMTEL);
        }
        return N02;
    }
}
