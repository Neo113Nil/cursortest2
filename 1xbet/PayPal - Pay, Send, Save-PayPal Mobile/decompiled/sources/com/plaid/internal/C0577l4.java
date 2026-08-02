package com.plaid.internal;

/* renamed from: com.plaid.internal.l4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0577l4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f6474a;
    public final com.plaid.internal.C0680x0 b;

    /* renamed from: com.plaid.internal.l4$a */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6475a;

        static {
            int[] iArr = new int[com.plaid.internal.EnumC0559j4.values().length];
            f6475a = iArr;
            try {
                iArr[com.plaid.internal.EnumC0559j4.WIFI.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f6475a[com.plaid.internal.EnumC0559j4.WIRED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.plaid.internal.l4$b */
    public static final class b extends android.net.ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        public final com.plaid.internal.C0680x0 f6476a;
        public final java.util.concurrent.CountDownLatch b;
        public volatile com.plaid.internal.C0532g4 c;
        public volatile com.plaid.internal.RunnableC0568k4 d;
        public final android.net.ConnectivityManager e;

        public b(android.net.ConnectivityManager connectivityManager) {
            com.plaid.internal.W3 w3 = com.plaid.internal.Z3.f5986a;
            this.f6476a = new com.plaid.internal.C0680x0("network-callback");
            this.b = new java.util.concurrent.CountDownLatch(1);
            this.e = connectivityManager;
        }

        public final void a(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
            if (this.d == null) {
                this.f6476a.a(com.plaid.internal.W3.ERROR, "network callback already unregistered", new java.lang.Object[0]);
                return;
            }
            try {
                com.plaid.internal.C0523f4 c0523f4 = new com.plaid.internal.C0523f4(networkCapabilities);
                com.plaid.internal.EnumC0697z enumC0697z = c0523f4.c == com.plaid.internal.EnumC0697z.YES ? c0523f4.d : com.plaid.internal.EnumC0697z.NO;
                if (this.c != null && this.c.f6419a.equals(network)) {
                    this.f6476a.a(com.plaid.internal.W3.INFO, "update validated network %s %s", network, c0523f4);
                    this.c.c = enumC0697z;
                } else {
                    if (this.c != null || enumC0697z == com.plaid.internal.EnumC0697z.NO) {
                        this.f6476a.a(com.plaid.internal.W3.INFO, "update network %s %s", network, c0523f4);
                        return;
                    }
                    this.f6476a.a(com.plaid.internal.W3.INFO, "found validated network %s %s", network, c0523f4);
                    this.c = new com.plaid.internal.C0532g4(network, this.d);
                    this.c.c = enumC0697z;
                    this.b.countDown();
                }
            } catch (java.lang.RuntimeException e) {
                this.f6476a.a(e, "fatal network callback error");
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(android.net.Network network) {
            android.net.NetworkCapabilities networkCapabilities = this.e.getNetworkCapabilities(network);
            if (networkCapabilities != null) {
                this.f6476a.a(com.plaid.internal.W3.INFO, "available network %s", network);
                a(network, networkCapabilities);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
            a(network, networkCapabilities);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(android.net.Network network) {
            if (this.c == null || !this.c.f6419a.equals(network)) {
                return;
            }
            this.f6476a.a(com.plaid.internal.W3.INFO, "lost network %s", network);
            com.plaid.internal.C0532g4 c0532g4 = this.c;
            if (c0532g4.d) {
                return;
            }
            c0532g4.d = true;
            c0532g4.b.run();
        }
    }

    public C0577l4(android.content.Context context) {
        com.plaid.internal.W3 w3 = com.plaid.internal.Z3.f5986a;
        this.b = new com.plaid.internal.C0680x0("network-utils");
        this.f6474a = context;
    }

    public final boolean a() {
        com.plaid.internal.W3 w3 = com.plaid.internal.W3.DEBUG;
        this.b.a(w3, "isAirplaneMode: Checking if device is in airplane mode.", new java.lang.Object[0]);
        boolean z = android.provider.Settings.Global.getInt(this.f6474a.getContentResolver(), "airplane_mode_on", 0) != 0;
        com.plaid.internal.C0680x0 c0680x0 = this.b;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("isAirplaneMode: Airplane mode ");
        sb.append(z ? "IS" : "IS NOT");
        sb.append(" active.");
        c0680x0.a(w3, sb.toString(), new java.lang.Object[0]);
        return z;
    }

    public final com.plaid.internal.C0532g4 a(com.plaid.internal.EnumC0559j4 enumC0559j4) {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) this.f6474a.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager != null) {
            android.net.NetworkRequest.Builder addCapability = new android.net.NetworkRequest.Builder().addCapability(12);
            int i2 = com.plaid.internal.C0577l4.a.f6475a[enumC0559j4.ordinal()];
            if (i2 == 1) {
                i = 1;
            } else if (i2 == 2) {
                i = 3;
            }
            android.net.NetworkRequest build = addCapability.addTransportType(i).build();
            com.plaid.internal.C0577l4.b bVar = new com.plaid.internal.C0577l4.b(connectivityManager);
            this.b.a(com.plaid.internal.W3.DEBUG, "Network %s requested, waiting (%d)ms for result (%s)", enumC0559j4, 10000, java.lang.Thread.currentThread());
            bVar.d = new com.plaid.internal.RunnableC0568k4(connectivityManager, bVar);
            connectivityManager.requestNetwork(build, bVar);
            try {
                bVar.b.await(10000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            }
            if (bVar.c == null) {
                com.plaid.internal.RunnableC0568k4 runnableC0568k4 = bVar.d;
                runnableC0568k4.f6462a.unregisterNetworkCallback(runnableC0568k4.b);
            }
            return bVar.c;
        }
        this.b.a(com.plaid.internal.W3.ERROR, "ConnectivityManager is null!", new java.lang.Object[0]);
        throw new java.lang.IllegalStateException("ConnectivityManager not available!");
    }
}
