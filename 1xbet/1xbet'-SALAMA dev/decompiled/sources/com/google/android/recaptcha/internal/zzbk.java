package com.google.android.recaptcha.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p044f6.d;
import p050g6.r;
import p050g6.s;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
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
            return r.f13310a;
        }
    }

    public static final boolean zzb(Context context) {
        NetworkCapabilities networkCapabilities;
        try {
            Object systemService = context.getSystemService("connectivity");
            h.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            return (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(16)) ? false : true;
        } catch (Exception unused) {
        }
    }

    private static final Map zzc() {
        LinkedHashMap linkedHashMapN0 = s.N0(new d(0, zznz.NET_CAPABILITY_MMS), new d(1, zznz.NET_CAPABILITY_SUPL), new d(2, zznz.NET_CAPABILITY_DUN), new d(3, zznz.NET_CAPABILITY_FOTA), new d(4, zznz.NET_CAPABILITY_IMS), new d(5, zznz.NET_CAPABILITY_CBS), new d(6, zznz.NET_CAPABILITY_WIFI_P2P), new d(7, zznz.NET_CAPABILITY_IA), new d(8, zznz.NET_CAPABILITY_RCS), new d(9, zznz.NET_CAPABILITY_XCAP), new d(10, zznz.NET_CAPABILITY_EIMS), new d(11, zznz.NET_CAPABILITY_NOT_METERED), new d(12, zznz.NET_CAPABILITY_INTERNET), new d(13, zznz.NET_CAPABILITY_NOT_RESTRICTED), new d(14, zznz.NET_CAPABILITY_TRUSTED), new d(15, zznz.NET_CAPABILITY_NOT_VPN));
        int i7 = Build.VERSION.SDK_INT;
        linkedHashMapN0.put(17, zznz.NET_CAPABILITY_CAPTIVE_PORTAL);
        linkedHashMapN0.put(16, zznz.NET_CAPABILITY_VALIDATED);
        if (i7 >= 28) {
            linkedHashMapN0.put(18, zznz.NET_CAPABILITY_NOT_ROAMING);
            linkedHashMapN0.put(19, zznz.NET_CAPABILITY_FOREGROUND);
            linkedHashMapN0.put(20, zznz.NET_CAPABILITY_NOT_CONGESTED);
            linkedHashMapN0.put(21, zznz.NET_CAPABILITY_NOT_SUSPENDED);
        }
        if (i7 >= 29) {
            linkedHashMapN0.put(23, zznz.NET_CAPABILITY_MCX);
        }
        if (i7 >= 30) {
            linkedHashMapN0.put(25, zznz.NET_CAPABILITY_TEMPORARILY_NOT_METERED);
        }
        if (i7 >= 31) {
            linkedHashMapN0.put(32, zznz.NET_CAPABILITY_HEAD_UNIT);
            linkedHashMapN0.put(29, zznz.NET_CAPABILITY_ENTERPRISE);
        }
        if (i7 >= 33) {
            linkedHashMapN0.put(35, zznz.NET_CAPABILITY_PRIORITIZE_BANDWIDTH);
            linkedHashMapN0.put(34, zznz.NET_CAPABILITY_PRIORITIZE_LATENCY);
            linkedHashMapN0.put(33, zznz.NET_CAPABILITY_MMTEL);
        }
        return linkedHashMapN0;
    }
}
