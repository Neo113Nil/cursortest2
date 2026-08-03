package com.ironsource;

/* loaded from: classes5.dex */
public class U3 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f5996a = "NETWORK_TYPE_WIFI";
    public static final java.lang.String b = "NETWORK_TYPE_VPN";
    public static final java.lang.String c = "NETWORK_TYPE_ETHERNET";
    public static final java.lang.String d = "NETWORK_TYPE_UNKNOWN";
    public static final java.lang.String e = "notReachable";
    public static final java.lang.String f = "PHONE_TYPE_NONE";
    public static final java.lang.String g = "NETWORK_TYPE_GPRS";
    public static final java.lang.String h = "NETWORK_TYPE_EDGE";
    public static final java.lang.String i = "NETWORK_TYPE_UMTS";
    public static final java.lang.String j = "NETWORK_TYPE_CDMA";
    public static final java.lang.String k = "NETWORK_TYPE_EVDO_0";
    public static final java.lang.String l = "NETWORK_TYPE_EVDO_A";
    public static final java.lang.String m = "NETWORK_TYPE_1xRTT";
    public static final java.lang.String n = "NETWORK_TYPE_HSDPA";
    public static final java.lang.String o = "NETWORK_TYPE_HSUPA";
    public static final java.lang.String p = "NETWORK_TYPE_HSPA";
    public static final java.lang.String q = "NETWORK_TYPE_IDEN";
    public static final java.lang.String r = "NETWORK_TYPE_EVDO_B";
    public static final java.lang.String s = "NETWORK_TYPE_LTE";
    public static final java.lang.String t = "NETWORK_TYPE_EHRPD";
    public static final java.lang.String u = "NETWORK_TYPE_HSPAP";
    public static final java.lang.String v = "NETWORK_TYPE_GSM";
    public static final java.lang.String w = "NETWORK_TYPE_TD_SCDMA";
    public static final java.lang.String x = "NETWORK_TYPE_IWLAN";
    public static final java.lang.String y = "NETWORK_TYPE_LTE_CA";
    public static final java.lang.String z = "NETWORK_TYPE_NR";

    public static java.lang.String b(android.content.Context context) {
        return android.os.Build.VERSION.SDK_INT >= 23 ? a(a(context), context) : c(context);
    }

    private static java.lang.String c(android.content.Context context) {
        java.lang.String a2 = com.ironsource.T3.a(context);
        return android.text.TextUtils.isEmpty(a2) ? "none" : a2;
    }

    public static boolean e(android.content.Context context) {
        return b(context, a(context)).equals("vpn");
    }

    public static java.lang.String a(android.net.Network network, android.content.Context context) {
        java.lang.String c2;
        if (context == null) {
            return "none";
        }
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        if (network == null || connectivityManager == null) {
            return "none";
        }
        try {
            android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities == null) {
                return c(context);
            }
            if (networkCapabilities.hasTransport(1)) {
                c2 = com.ironsource.T3.b;
            } else if (networkCapabilities.hasTransport(0)) {
                c2 = com.ironsource.T3.f5974a;
            } else {
                c2 = c(context);
            }
            return c2;
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            return "none";
        }
    }

    public static java.lang.String d(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager;
        android.net.NetworkInfo activeNetworkInfo;
        if (context != null && (connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity")) != null) {
            android.net.Network a2 = a(connectivityManager);
            if (a2 == null) {
                return e;
            }
            try {
                android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(a2);
                if (networkCapabilities == null) {
                    return d;
                }
                if (networkCapabilities.hasTransport(1)) {
                    return f5996a;
                }
                if (networkCapabilities.hasTransport(0) && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                    return a(activeNetworkInfo.getSubtype());
                }
            } catch (java.lang.Throwable th) {
                com.ironsource.C3180n4.d().a(th);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("Error getting network capabilities: " + th);
            }
        }
        return d;
    }

    private static java.lang.String b(android.content.Context context, android.net.Network network) {
        android.net.NetworkCapabilities networkCapabilities;
        if (android.os.Build.VERSION.SDK_INT >= 23 && network != null && context != null) {
            try {
                android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null) {
                    return "";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return com.ironsource.T3.b;
                }
                if (networkCapabilities.hasTransport(0)) {
                    return com.ironsource.T3.g;
                }
                if (networkCapabilities.hasTransport(4)) {
                    return "vpn";
                }
                if (networkCapabilities.hasTransport(3)) {
                    return com.ironsource.T3.e;
                }
                if (networkCapabilities.hasTransport(5)) {
                    return com.ironsource.T3.h;
                }
                if (networkCapabilities.hasTransport(6)) {
                    return com.ironsource.T3.i;
                }
                if (networkCapabilities.hasTransport(2)) {
                    return com.ironsource.T3.d;
                }
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            }
        }
        return "";
    }

    public static android.net.Network a(android.content.Context context) {
        if (context == null) {
            return null;
        }
        return a((android.net.ConnectivityManager) context.getSystemService("connectivity"));
    }

    public static org.json.JSONObject a(android.content.Context context, android.net.Network network) {
        android.net.NetworkCapabilities networkCapabilities;
        if (context == null) {
            return new org.json.JSONObject();
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (android.os.Build.VERSION.SDK_INT >= 23 && network != null) {
            try {
                android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                    jSONObject.put("networkCapabilities", networkCapabilities.toString());
                    jSONObject.put("downloadSpeed", networkCapabilities.getLinkDownstreamBandwidthKbps());
                    jSONObject.put("uploadSpeed", networkCapabilities.getLinkUpstreamBandwidthKbps());
                    jSONObject.put(com.ironsource.X3.j.v, e(context));
                }
            } catch (java.lang.Exception e2) {
                com.ironsource.C3180n4.d().a(e2);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            }
        }
        return jSONObject;
    }

    private static java.lang.String a(int i2) {
        switch (i2) {
            case 0:
                return f;
            case 1:
                return g;
            case 2:
                return h;
            case 3:
                return i;
            case 4:
                return j;
            case 5:
                return k;
            case 6:
                return l;
            case 7:
                return m;
            case 8:
                return n;
            case 9:
                return o;
            case 10:
                return p;
            case 11:
                return q;
            case 12:
                return r;
            case 13:
                return s;
            case 14:
                return t;
            case 15:
                return u;
            case 16:
                return v;
            case 17:
                return w;
            case 18:
                return x;
            case 19:
                return y;
            case 20:
                return z;
            default:
                return d;
        }
    }

    private static android.net.Network a(android.net.ConnectivityManager connectivityManager) {
        try {
            if (android.os.Build.VERSION.SDK_INT >= 23) {
                return connectivityManager.getActiveNetwork();
            }
            return null;
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            return null;
        }
    }
}
