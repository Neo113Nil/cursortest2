package com.fyber.inneractive.sdk.config.cellular;

/* loaded from: classes3.dex */
public final class f extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.cellular.h f3591a;
    public final android.net.ConnectivityManager b;

    public f(android.net.ConnectivityManager connectivityManager, com.fyber.inneractive.sdk.config.cellular.h hVar) {
        this.f3591a = hVar;
        this.b = connectivityManager;
    }

    public final void a() {
        this.f3591a = null;
        android.net.ConnectivityManager connectivityManager = this.b;
        if (connectivityManager != null) {
            try {
                connectivityManager.unregisterNetworkCallback(this);
            } catch (java.lang.Throwable th) {
                com.fyber.inneractive.sdk.util.IAlog.a("failed to unregister network callback", th, new java.lang.Object[0]);
            }
        }
    }

    public final void b() {
        android.net.ConnectivityManager connectivityManager = this.b;
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(this);
            } catch (java.lang.Throwable th) {
                com.fyber.inneractive.sdk.util.IAlog.a("failed to register network callback", th, new java.lang.Object[0]);
            }
        }
    }

    public final void c() {
        android.net.ConnectivityManager connectivityManager = this.b;
        if (connectivityManager != null) {
            try {
                connectivityManager.unregisterNetworkCallback(this);
            } catch (java.lang.Throwable th) {
                com.fyber.inneractive.sdk.util.IAlog.a("failed to unregister network callback", th, new java.lang.Object[0]);
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
        com.fyber.inneractive.sdk.util.a1 a1Var = com.fyber.inneractive.sdk.util.a1.UNKNOWN;
        if (networkCapabilities.hasTransport(3)) {
            a1Var = com.fyber.inneractive.sdk.util.a1.ETHERNET;
        } else if (networkCapabilities.hasTransport(0)) {
            int k = com.fyber.inneractive.sdk.util.k.k();
            if (k != 0) {
                if (k != 3) {
                    if (k == 18) {
                        a1Var = com.fyber.inneractive.sdk.util.a1.WIFI;
                    } else if (k == 20) {
                        a1Var = com.fyber.inneractive.sdk.util.a1.MOBILE_5G;
                    } else if (k != 5 && k != 6) {
                        switch (k) {
                            default:
                                switch (k) {
                                    case 12:
                                    case 14:
                                    case 15:
                                        break;
                                    case 13:
                                        a1Var = com.fyber.inneractive.sdk.util.a1.MOBILE_4G;
                                        break;
                                    default:
                                        a1Var = com.fyber.inneractive.sdk.util.a1.CELLULAR;
                                        break;
                                }
                            case 8:
                            case 9:
                            case 10:
                                a1Var = com.fyber.inneractive.sdk.util.a1.MOBILE_3G;
                                break;
                        }
                    }
                }
                a1Var = com.fyber.inneractive.sdk.util.a1.MOBILE_3G;
            }
        } else if (networkCapabilities.hasTransport(1)) {
            a1Var = com.fyber.inneractive.sdk.util.a1.WIFI;
        }
        com.fyber.inneractive.sdk.config.cellular.h hVar = this.f3591a;
        if (hVar != null) {
            hVar.a(a1Var);
        }
    }
}
