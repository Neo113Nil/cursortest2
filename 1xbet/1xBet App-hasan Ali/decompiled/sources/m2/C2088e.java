package m2;

import T2.E;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import f2.m;
import k2.C2030a;
import r2.InterfaceC2348a;

/* renamed from: m2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2088e extends AbstractC2087d {

    /* renamed from: j, reason: collision with root package name */
    public static final String f17989j = m.f("NetworkStateTracker");

    /* renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f17990g;

    /* renamed from: h, reason: collision with root package name */
    public final D2.g f17991h;
    public final E i;

    public C2088e(Context context, InterfaceC2348a interfaceC2348a) {
        super(context, interfaceC2348a);
        this.f17990g = (ConnectivityManager) this.f17985b.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 24) {
            this.f17991h = new D2.g(4, this);
        } else {
            this.i = new E(7, this);
        }
    }

    @Override // m2.AbstractC2087d
    public final Object a() {
        return f();
    }

    @Override // m2.AbstractC2087d
    public final void d() {
        boolean z3 = Build.VERSION.SDK_INT >= 24;
        String str = f17989j;
        if (!z3) {
            m.d().a(str, "Registering broadcast receiver", new Throwable[0]);
            this.f17985b.registerReceiver(this.i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            m.d().a(str, "Registering network callback", new Throwable[0]);
            this.f17990g.registerDefaultNetworkCallback(this.f17991h);
        } catch (IllegalArgumentException | SecurityException e3) {
            m.d().b(str, "Received exception while registering network callback", e3);
        }
    }

    @Override // m2.AbstractC2087d
    public final void e() {
        boolean z3 = Build.VERSION.SDK_INT >= 24;
        String str = f17989j;
        if (!z3) {
            m.d().a(str, "Unregistering broadcast receiver", new Throwable[0]);
            this.f17985b.unregisterReceiver(this.i);
            return;
        }
        try {
            m.d().a(str, "Unregistering network callback", new Throwable[0]);
            this.f17990g.unregisterNetworkCallback(this.f17991h);
        } catch (IllegalArgumentException | SecurityException e3) {
            m.d().b(str, "Received exception while unregistering network callback", e3);
        }
    }

    public final C2030a f() {
        boolean z3;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = this.f17990g;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z5 = false;
        boolean z6 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (SecurityException e3) {
            m.d().b(f17989j, "Unable to validate active network", e3);
        }
        if (networkCapabilities != null) {
            if (networkCapabilities.hasCapability(16)) {
                z3 = true;
                boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
                    z5 = true;
                }
                C2030a c2030a = new C2030a();
                c2030a.f17578a = z6;
                c2030a.f17579b = z3;
                c2030a.f17580c = isActiveNetworkMetered;
                c2030a.f17581d = z5;
                return c2030a;
            }
        }
        z3 = false;
        boolean isActiveNetworkMetered2 = connectivityManager.isActiveNetworkMetered();
        if (activeNetworkInfo != null) {
            z5 = true;
        }
        C2030a c2030a2 = new C2030a();
        c2030a2.f17578a = z6;
        c2030a2.f17579b = z3;
        c2030a2.f17580c = isActiveNetworkMetered2;
        c2030a2.f17581d = z5;
        return c2030a2;
    }
}
