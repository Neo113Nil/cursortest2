package p072k1;

import K4.C0318e;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import p023d1.n;
import p111p1.a;

/* JADX INFO: loaded from: classes.dex */
public final class e extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f14675i = n.g("NetworkStateTracker");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f14676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0318e f14677h;

    public e(Context context, a aVar) {
        super(context, aVar);
        this.f14676g = (ConnectivityManager) this.f14671b.getSystemService("connectivity");
        this.f14677h = new C0318e(this, 2);
    }

    @Override // p072k1.d
    public final Object a() {
        return f();
    }

    @Override // p072k1.d
    public final void d() {
        String str = f14675i;
        try {
            n.d().b(str, "Registering network callback", new Throwable[0]);
            this.f14676g.registerDefaultNetworkCallback(this.f14677h);
        } catch (IllegalArgumentException | SecurityException e7) {
            n.d().c(str, "Received exception while registering network callback", e7);
        }
    }

    @Override // p072k1.d
    public final void e() {
        String str = f14675i;
        try {
            n.d().b(str, "Unregistering network callback", new Throwable[0]);
            this.f14676g.unregisterNetworkCallback(this.f14677h);
        } catch (IllegalArgumentException | SecurityException e7) {
            n.d().c(str, "Received exception while unregistering network callback", e7);
        }
    }

    public final p060i1.a f() {
        boolean z4;
        ConnectivityManager connectivityManager = this.f14676g;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z7 = false;
        boolean z8 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            z4 = networkCapabilities != null && networkCapabilities.hasCapability(16);
        } catch (SecurityException e7) {
            n.d().c(f14675i, "Unable to validate active network", e7);
        }
        boolean zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z7 = true;
        }
        p060i1.a aVar = new p060i1.a();
        aVar.f13835a = z8;
        aVar.f13836b = z4;
        aVar.f13837c = zIsActiveNetworkMetered;
        aVar.f13838d = z7;
        return aVar;
    }
}
