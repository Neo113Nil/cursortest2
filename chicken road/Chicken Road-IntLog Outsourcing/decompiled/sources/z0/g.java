package z0;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import s0.s;

/* loaded from: classes.dex */
public final class g extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f12458a;

    public g(h hVar) {
        this.f12458a = hVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
        kotlin.jvm.internal.i.e(network, "network");
        kotlin.jvm.internal.i.e(capabilities, "capabilities");
        s.d().a(i.f12461a, "Network capabilities changed: " + capabilities);
        h hVar = this.f12458a;
        hVar.c(i.a(hVar.f12459f));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        kotlin.jvm.internal.i.e(network, "network");
        s.d().a(i.f12461a, "Network connection lost");
        h hVar = this.f12458a;
        hVar.c(i.a(hVar.f12459f));
    }
}
