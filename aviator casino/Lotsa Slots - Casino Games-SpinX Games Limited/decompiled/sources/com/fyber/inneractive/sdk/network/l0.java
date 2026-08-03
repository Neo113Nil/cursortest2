package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class l0 {
    public static final com.fyber.inneractive.sdk.network.h0 g = new com.fyber.inneractive.sdk.network.h0();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.PriorityBlockingQueue f3846a = new java.util.concurrent.PriorityBlockingQueue(100, new com.fyber.inneractive.sdk.network.k0());
    public volatile boolean b = false;
    public final android.os.Handler c = new android.os.Handler(android.os.Looper.getMainLooper());
    public final java.util.concurrent.ThreadPoolExecutor d = new java.util.concurrent.ThreadPoolExecutor(6, 6, 1000, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(100), g);
    public final com.fyber.inneractive.sdk.network.i0 e = new com.fyber.inneractive.sdk.network.i0(this);
    public final com.fyber.inneractive.sdk.network.j1 f = new com.fyber.inneractive.sdk.network.j1();

    public final void a(com.fyber.inneractive.sdk.network.t0 t0Var) {
        com.fyber.inneractive.sdk.network.p0 p0Var;
        if (!this.f3846a.offer(t0Var)) {
            com.fyber.inneractive.sdk.util.IAlog.a("Request queue is full! current request is dropped! %s", t0Var.r());
            return;
        }
        com.fyber.inneractive.sdk.network.i1 i1Var = com.fyber.inneractive.sdk.network.i1.QUEUED;
        t0Var.f = i1Var;
        if (i1Var != com.fyber.inneractive.sdk.network.i1.QUEUED_FOR_RETRY || (p0Var = t0Var.d) == null) {
            return;
        }
        p0Var.a("sdkRequestEndedButWillBeRetried");
    }

    public final void b(com.fyber.inneractive.sdk.network.t0 t0Var) {
        com.fyber.inneractive.sdk.network.j1 j1Var = this.f;
        j1Var.getClass();
        java.lang.String str = t0Var.g;
        com.fyber.inneractive.sdk.util.IAlog.a("%s : NetworkRequestWatchdog : finalize request: %s", com.fyber.inneractive.sdk.util.IAlog.a(j1Var), str);
        com.fyber.inneractive.sdk.network.n1 n1Var = (com.fyber.inneractive.sdk.network.n1) j1Var.f3843a.get(str);
        if (n1Var != null) {
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(n1Var.d);
        }
        j1Var.f3843a.remove(str);
    }

    public final boolean c(com.fyber.inneractive.sdk.network.t0 t0Var) {
        if (!t0Var.u()) {
            return false;
        }
        t0Var.f = com.fyber.inneractive.sdk.network.i1.QUEUED_FOR_RETRY;
        com.fyber.inneractive.sdk.network.p0 p0Var = t0Var.d;
        if (p0Var != null) {
            p0Var.a("sdkRequestEndedButWillBeRetried");
        }
        long g2 = t0Var.g();
        com.fyber.inneractive.sdk.util.IAlog.e("retryNetworkRequest queue up in main thread - %s with delay of %d", t0Var.getClass().getName(), java.lang.Long.valueOf(g2));
        this.c.postDelayed(new com.fyber.inneractive.sdk.network.j0(this, t0Var), g2);
        return true;
    }

    public static void a(com.fyber.inneractive.sdk.network.t0 t0Var, com.fyber.inneractive.sdk.network.l lVar, com.fyber.inneractive.sdk.network.o0 o0Var) {
        try {
            if (t0Var.f3857a || t0Var.h() == null || o0Var == null || lVar == null || lVar.f3845a != 200) {
                return;
            }
            t0Var.a(o0Var, t0Var.h(), lVar.e);
        } catch (java.lang.Exception e) {
            com.fyber.inneractive.sdk.util.IAlog.a("Failed cache network response data for url: %s msg: %s", t0Var.r(), e.getMessage());
        }
    }

    public static void a(com.fyber.inneractive.sdk.network.t0 t0Var, com.fyber.inneractive.sdk.network.o0 o0Var) {
        try {
            if (t0Var.f3857a || o0Var == null) {
                return;
            }
            t0Var.a(o0Var.f3851a, (java.lang.Exception) null, false);
        } catch (java.lang.Exception e) {
            com.fyber.inneractive.sdk.util.IAlog.a("failed notifying the listener request complete for url: %s msg: %s", t0Var.r(), e.getMessage());
            if (t0Var.f3857a) {
                return;
            }
            t0Var.a((java.lang.Object) null, e, false);
        }
    }

    public final com.fyber.inneractive.sdk.network.o0 a(com.fyber.inneractive.sdk.network.t0 t0Var, com.fyber.inneractive.sdk.network.l lVar) {
        com.fyber.inneractive.sdk.network.o0 o0Var = null;
        if (lVar != null) {
            try {
                if (!t0Var.f3857a) {
                    int i = lVar.f3845a;
                    if (i != 200 && (i < 300 || i >= 304)) {
                        if (i == 304) {
                            t0Var.a((java.lang.Object) null, (java.lang.Exception) new com.fyber.inneractive.sdk.network.g(), false);
                        } else {
                            t0Var.a((java.lang.Object) null, (java.lang.Exception) new com.fyber.inneractive.sdk.network.k1(lVar.b, lVar.f3845a), false);
                        }
                    }
                    o0Var = t0Var.a(lVar, lVar.d, i);
                }
            } catch (com.fyber.inneractive.sdk.network.t1 e) {
                com.fyber.inneractive.sdk.util.IAlog.a("failed parsing network request but will retry url: %s msg: %s", t0Var.r(), e.getMessage());
                if (c(t0Var)) {
                    throw e;
                }
                throw new com.fyber.inneractive.sdk.network.s1(e);
            } catch (java.lang.Exception e2) {
                com.fyber.inneractive.sdk.util.IAlog.a("failed parsing network request url: %s msg: %s", t0Var.r(), e2.getMessage());
                throw e2;
            }
        }
        return o0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.fyber.inneractive.sdk.network.l a(com.fyber.inneractive.sdk.network.t0 t0Var, com.fyber.inneractive.sdk.network.a aVar) {
        java.lang.String str;
        try {
            if (t0Var.f3857a) {
                return null;
            }
            if (aVar != null) {
                str = aVar.f3830a;
            } else {
                str = "";
            }
            a();
            return t0Var.a(str);
        } catch (com.fyber.inneractive.sdk.network.b e) {
            e = e;
            com.fyber.inneractive.sdk.util.IAlog.a("failed sending network request for url: %s msg: %s", t0Var.r(), e.getMessage());
            if (c(t0Var)) {
                throw new com.fyber.inneractive.sdk.network.t1(e);
            }
            throw new com.fyber.inneractive.sdk.network.s1(e);
        } catch (com.fyber.inneractive.sdk.network.t1 e2) {
            com.fyber.inneractive.sdk.util.IAlog.a("failed sending network request but will retry url: %s msg: %s", t0Var.r(), e2.getMessage());
            if (c(t0Var)) {
                throw e2;
            }
            throw new com.fyber.inneractive.sdk.network.s1(e2);
        } catch (java.net.SocketTimeoutException e3) {
            e = e3;
            com.fyber.inneractive.sdk.util.IAlog.a("failed sending network request for url: %s msg: %s", t0Var.r(), e.getMessage());
            if (c(t0Var)) {
            }
        } catch (java.net.UnknownHostException e4) {
            e = e4;
            com.fyber.inneractive.sdk.util.IAlog.a("failed sending network request for url: %s msg: %s", t0Var.r(), e.getMessage());
            if (c(t0Var)) {
            }
        } catch (java.lang.Exception e5) {
            com.fyber.inneractive.sdk.util.IAlog.a("failed sending network request for url: %s msg: %s", t0Var.r(), e5.getMessage());
            throw e5;
        }
    }

    public static void a() {
        java.lang.Boolean c = ((com.fyber.inneractive.sdk.config.global.features.l) com.fyber.inneractive.sdk.config.IAConfigManager.N.L.a(com.fyber.inneractive.sdk.config.global.features.l.class)).c("should_use_is_network_connected");
        if (c == null || !c.booleanValue()) {
            return;
        }
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.fyber.inneractive.sdk.util.o.f4302a.getSystemService("connectivity");
            android.net.NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (com.fyber.inneractive.sdk.util.o.a("android.permission.ACCESS_NETWORK_STATE") && activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnectedOrConnecting()) {
                    return;
                }
            }
            throw new com.fyber.inneractive.sdk.network.b("No network connection");
        } catch (java.lang.Throwable unused) {
            com.fyber.inneractive.sdk.util.IAlog.b("Error retrieved when trying to get the network state - Perhaps you forgot to declare android.permission.ACCESS_NETWORK_STATE in your Android manifest file.", new java.lang.Object[0]);
        }
    }
}
