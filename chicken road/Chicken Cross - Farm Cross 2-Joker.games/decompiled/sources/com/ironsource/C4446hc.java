package com.ironsource;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import org.json.JSONObject;

/* renamed from: com.ironsource.hc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4446hc implements InterfaceC4566o7 {

    /* renamed from: a, reason: collision with root package name */
    private String f8226a = "hc";
    private int b = 23;
    private final InterfaceC4584p7 c;
    private ConnectivityManager.NetworkCallback d;

    /* renamed from: com.ironsource.hc$a */
    class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f8227a;

        a(Context context) {
            this.f8227a = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (network != null) {
                C4446hc.this.c.a(R3.a(network, this.f8227a), R3.a(this.f8227a, network));
                return;
            }
            InterfaceC4584p7 interfaceC4584p7 = C4446hc.this.c;
            String b = R3.b(this.f8227a);
            Context context = this.f8227a;
            interfaceC4584p7.a(b, R3.a(context, R3.a(context)));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network != null) {
                C4446hc.this.c.b(R3.a(network, this.f8227a), R3.a(this.f8227a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (network != null) {
                C4446hc.this.c.b(R3.a(network, this.f8227a), R3.a(this.f8227a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (R3.b(this.f8227a).equals("none")) {
                C4446hc.this.c.a();
            }
        }
    }

    public C4446hc(InterfaceC4584p7 interfaceC4584p7) {
        this.c = interfaceC4584p7;
    }

    @Override // com.ironsource.InterfaceC4566o7
    public void a(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < this.b || this.d == null || context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this.d);
        } catch (Exception e) {
            C4491k4.d().a(e);
            Log.e(this.f8226a, "NetworkCallback for was not registered or already unregistered");
        }
    }

    @Override // com.ironsource.InterfaceC4566o7
    public void b(Context context) {
        if (Build.VERSION.SDK_INT >= this.b) {
            a(context);
            if (R3.b(context).equals("none")) {
                this.c.a();
            }
            if (this.d == null) {
                this.d = new a(context);
            }
            NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(build, this.d);
                }
            } catch (Exception e) {
                C4491k4.d().a(e);
                Log.e(this.f8226a, "NetworkCallback was not able to register");
            }
        }
    }

    @Override // com.ironsource.InterfaceC4566o7
    public JSONObject c(Context context) {
        return R3.a(context, R3.a(context));
    }

    @Override // com.ironsource.InterfaceC4566o7
    public void a() {
        this.d = null;
    }
}
