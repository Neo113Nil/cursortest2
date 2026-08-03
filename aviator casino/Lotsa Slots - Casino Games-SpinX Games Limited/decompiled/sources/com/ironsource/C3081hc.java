package com.ironsource;

/* renamed from: com.ironsource.hc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3081hc implements com.ironsource.InterfaceC3254r7 {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f6289a = "hc";
    private int b = 23;
    private final com.ironsource.InterfaceC3272s7 c;
    private android.net.ConnectivityManager.NetworkCallback d;

    /* renamed from: com.ironsource.hc$a */
    class a extends android.net.ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f6290a;

        a(android.content.Context context) {
            this.f6290a = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(android.net.Network network) {
            if (network != null) {
                com.ironsource.C3081hc.this.c.a(com.ironsource.U3.a(network, this.f6290a), com.ironsource.U3.a(this.f6290a, network));
                return;
            }
            com.ironsource.InterfaceC3272s7 interfaceC3272s7 = com.ironsource.C3081hc.this.c;
            java.lang.String b = com.ironsource.U3.b(this.f6290a);
            android.content.Context context = this.f6290a;
            interfaceC3272s7.a(b, com.ironsource.U3.a(context, com.ironsource.U3.a(context)));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
            if (network != null) {
                com.ironsource.C3081hc.this.c.b(com.ironsource.U3.a(network, this.f6290a), com.ironsource.U3.a(this.f6290a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(android.net.Network network, android.net.LinkProperties linkProperties) {
            if (network != null) {
                com.ironsource.C3081hc.this.c.b(com.ironsource.U3.a(network, this.f6290a), com.ironsource.U3.a(this.f6290a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(android.net.Network network) {
            if (com.ironsource.U3.b(this.f6290a).equals("none")) {
                com.ironsource.C3081hc.this.c.a();
            }
        }
    }

    public C3081hc(com.ironsource.InterfaceC3272s7 interfaceC3272s7) {
        this.c = interfaceC3272s7;
    }

    @Override // com.ironsource.InterfaceC3254r7
    public void a(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager;
        if (android.os.Build.VERSION.SDK_INT < this.b || this.d == null || context == null || (connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this.d);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            android.util.Log.e(this.f6289a, "NetworkCallback for was not registered or already unregistered");
        }
    }

    @Override // com.ironsource.InterfaceC3254r7
    public void b(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= this.b) {
            a(context);
            if (com.ironsource.U3.b(context).equals("none")) {
                this.c.a();
            }
            if (this.d == null) {
                this.d = new com.ironsource.C3081hc.a(context);
            }
            android.net.NetworkRequest build = new android.net.NetworkRequest.Builder().addCapability(12).build();
            try {
                android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(build, this.d);
                }
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                android.util.Log.e(this.f6289a, "NetworkCallback was not able to register");
            }
        }
    }

    @Override // com.ironsource.InterfaceC3254r7
    public org.json.JSONObject c(android.content.Context context) {
        return com.ironsource.U3.a(context, com.ironsource.U3.a(context));
    }

    @Override // com.ironsource.InterfaceC3254r7
    public void a() {
        this.d = null;
    }
}
