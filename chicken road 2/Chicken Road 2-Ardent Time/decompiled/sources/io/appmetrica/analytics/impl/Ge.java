package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class Ge {

    /* renamed from: a, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ce f4329a;

    /* renamed from: b, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.De f4330b;

    /* renamed from: c, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ee f4331c;

    static {
        io.appmetrica.analytics.coreapi.internal.system.NetworkType networkType = io.appmetrica.analytics.coreapi.internal.system.NetworkType.UNDEFINED;
        f4329a = new io.appmetrica.analytics.impl.Ce(networkType);
        f4330b = new io.appmetrica.analytics.impl.De(networkType);
        f4331c = new io.appmetrica.analytics.impl.Ee(2);
    }

    public static java.lang.String a(java.util.Locale locale) {
        java.lang.String language = locale.getLanguage();
        java.lang.String country = locale.getCountry();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(language);
        java.lang.String script = locale.getScript();
        if (!android.text.TextUtils.isEmpty(script)) {
            sb.append('-');
            sb.append(script);
        }
        if (!android.text.TextUtils.isEmpty(country)) {
            sb.append('_');
            sb.append(country);
        }
        return sb.toString();
    }

    public static io.appmetrica.analytics.coreapi.internal.system.NetworkType a(android.net.ConnectivityManager connectivityManager) {
        android.net.NetworkInfo networkInfo;
        io.appmetrica.analytics.coreapi.internal.system.NetworkType networkType = io.appmetrica.analytics.coreapi.internal.system.NetworkType.UNDEFINED;
        android.net.Network activeNetwork = connectivityManager.getActiveNetwork();
        if (!io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(29) ? !(activeNetwork != null && ((networkInfo = connectivityManager.getNetworkInfo(activeNetwork)) == null || networkInfo.isConnected())) : activeNetwork == null) {
            return io.appmetrica.analytics.coreapi.internal.system.NetworkType.OFFLINE;
        }
        android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            return networkType;
        }
        for (java.lang.Integer num : f4330b.f4207a.keySet()) {
            if (networkCapabilities.hasTransport(num.intValue())) {
                return (io.appmetrica.analytics.coreapi.internal.system.NetworkType) f4330b.a(num);
            }
        }
        return networkType;
    }
}
