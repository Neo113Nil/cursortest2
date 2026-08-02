package k1;

import K4.C0318e;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import d1.n;
import i1.C1242a;
import p1.InterfaceC1533a;

/* renamed from: k1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1333e extends AbstractC1332d {

    /* renamed from: i, reason: collision with root package name */
    public static final String f14669i = n.g("NetworkStateTracker");

    /* renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f14670g;

    /* renamed from: h, reason: collision with root package name */
    public final C0318e f14671h;

    public C1333e(Context context, InterfaceC1533a interfaceC1533a) {
        super(context, interfaceC1533a);
        this.f14670g = (ConnectivityManager) this.f14665b.getSystemService("connectivity");
        this.f14671h = new C0318e(this, 2);
    }

    @Override // k1.AbstractC1332d
    public final Object a() {
        return f();
    }

    @Override // k1.AbstractC1332d
    public final void d() {
        String str = f14669i;
        try {
            n.d().b(str, "Registering network callback", new Throwable[0]);
            this.f14670g.registerDefaultNetworkCallback(this.f14671h);
        } catch (IllegalArgumentException | SecurityException e7) {
            n.d().c(str, "Received exception while registering network callback", e7);
        }
    }

    @Override // k1.AbstractC1332d
    public final void e() {
        String str = f14669i;
        try {
            n.d().b(str, "Unregistering network callback", new Throwable[0]);
            this.f14670g.unregisterNetworkCallback(this.f14671h);
        } catch (IllegalArgumentException | SecurityException e7) {
            n.d().c(str, "Received exception while unregistering network callback", e7);
        }
    }

    public final C1242a f() {
        boolean z4;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = this.f14670g;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z7 = false;
        boolean z8 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (SecurityException e7) {
            n.d().c(f14669i, "Unable to validate active network", e7);
        }
        if (networkCapabilities != null) {
            if (networkCapabilities.hasCapability(16)) {
                z4 = true;
                boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
                    z7 = true;
                }
                C1242a c1242a = new C1242a();
                c1242a.f13829a = z8;
                c1242a.f13830b = z4;
                c1242a.f13831c = isActiveNetworkMetered;
                c1242a.f13832d = z7;
                return c1242a;
            }
        }
        z4 = false;
        boolean isActiveNetworkMetered2 = connectivityManager.isActiveNetworkMetered();
        if (activeNetworkInfo != null) {
            z7 = true;
        }
        C1242a c1242a2 = new C1242a();
        c1242a2.f13829a = z8;
        c1242a2.f13830b = z4;
        c1242a2.f13831c = isActiveNetworkMetered2;
        c1242a2.f13832d = z7;
        return c1242a2;
    }
}
