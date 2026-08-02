package E3;

import D3.l;
import D3.m;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import m3.N;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7396a;

    /* renamed from: b, reason: collision with root package name */
    private final l f7397b;

    /* renamed from: c, reason: collision with root package name */
    private final E3.a f7398c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f7399d;

    /* renamed from: e, reason: collision with root package name */
    private int f7400e;

    /* renamed from: f, reason: collision with root package name */
    private C0164b f7401f;

    private class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            b.a(b.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E3.b$b, reason: collision with other inner class name */
    final class C0164b extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        private boolean f7403a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f7404b;

        C0164b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            b.this.f7399d.post(new c(this));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onBlockedStatusChanged(Network network, boolean z11) {
            if (z11) {
                return;
            }
            b.this.f7399d.post(new d(this));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean hasCapability = networkCapabilities.hasCapability(16);
            boolean z11 = this.f7403a;
            b bVar = b.this;
            if (z11 && this.f7404b == hasCapability) {
                if (hasCapability) {
                    bVar.f7399d.post(new d(this));
                }
            } else {
                this.f7403a = true;
                this.f7404b = hasCapability;
                bVar.f7399d.post(new c(this));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            b.this.f7399d.post(new c(this));
        }
    }

    public b(Context context, l lVar) {
        E3.a aVar = m.f5667h;
        this.f7396a = context.getApplicationContext();
        this.f7397b = lVar;
        this.f7398c = aVar;
        this.f7399d = N.q(null);
    }

    static void a(b bVar) {
        int a11 = bVar.f7398c.a(bVar.f7396a);
        if (bVar.f7400e != a11) {
            bVar.f7400e = a11;
            m.a((m) bVar.f7397b.f5666a, bVar, a11);
        }
    }

    static void d(b bVar) {
        int a11;
        if ((bVar.f7400e & 3) == 0 || bVar.f7400e == (a11 = bVar.f7398c.a(bVar.f7396a))) {
            return;
        }
        bVar.f7400e = a11;
        m.a((m) bVar.f7397b.f5666a, bVar, a11);
    }

    public final int e() {
        E3.a aVar = this.f7398c;
        Context context = this.f7396a;
        this.f7400e = aVar.a(context);
        IntentFilter intentFilter = new IntentFilter();
        if (aVar.d()) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            connectivityManager.getClass();
            C0164b c0164b = new C0164b();
            this.f7401f = c0164b;
            connectivityManager.registerDefaultNetworkCallback(c0164b);
        }
        if (aVar.b()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (aVar.c()) {
            intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        if (aVar.e()) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        context.registerReceiver(new a(), intentFilter, null, this.f7399d);
        return this.f7400e;
    }
}
