package com.fyber.inneractive.sdk.config.cellular;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.a1;
import com.fyber.inneractive.sdk.util.k;

/* loaded from: classes4.dex */
public final class f extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public h f5241a;
    public final ConnectivityManager b;

    public f(ConnectivityManager connectivityManager, h hVar) {
        this.f5241a = hVar;
        this.b = connectivityManager;
    }

    public final void a() {
        this.f5241a = null;
        ConnectivityManager connectivityManager = this.b;
        if (connectivityManager != null) {
            try {
                connectivityManager.unregisterNetworkCallback(this);
            } catch (Throwable th) {
                IAlog.a("failed to unregister network callback", th, new Object[0]);
            }
        }
    }

    public final void b() {
        ConnectivityManager connectivityManager = this.b;
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(this);
            } catch (Throwable th) {
                IAlog.a("failed to register network callback", th, new Object[0]);
            }
        }
    }

    public final void c() {
        ConnectivityManager connectivityManager = this.b;
        if (connectivityManager != null) {
            try {
                connectivityManager.unregisterNetworkCallback(this);
            } catch (Throwable th) {
                IAlog.a("failed to unregister network callback", th, new Object[0]);
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        a1 a1Var = a1.UNKNOWN;
        if (networkCapabilities.hasTransport(3)) {
            a1Var = a1.ETHERNET;
        } else if (networkCapabilities.hasTransport(0)) {
            int h = k.h();
            if (h != 0) {
                if (h != 3) {
                    if (h == 18) {
                        a1Var = a1.WIFI;
                    } else if (h == 20) {
                        a1Var = a1.MOBILE_5G;
                    } else if (h != 5 && h != 6) {
                        switch (h) {
                            default:
                                switch (h) {
                                    case 12:
                                    case 14:
                                    case 15:
                                        break;
                                    case 13:
                                        a1Var = a1.MOBILE_4G;
                                        break;
                                    default:
                                        a1Var = a1.CELLULAR;
                                        break;
                                }
                            case 8:
                            case 9:
                            case 10:
                                a1Var = a1.MOBILE_3G;
                                break;
                        }
                    }
                }
                a1Var = a1.MOBILE_3G;
            }
        } else if (networkCapabilities.hasTransport(1)) {
            a1Var = a1.WIFI;
        }
        h hVar = this.f5241a;
        if (hVar != null) {
            hVar.a(a1Var);
        }
    }
}
