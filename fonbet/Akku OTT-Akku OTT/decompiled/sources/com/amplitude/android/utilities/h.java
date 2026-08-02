package com.amplitude.android.utilities;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.RequiresPermission;
import com.amplitude.android.plugins.e;
import com.amplitude.android.utilities.g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h extends ConnectivityManager.NetworkCallback {
    public g.a a;
    public final /* synthetic */ ConnectivityManager b;
    public final /* synthetic */ g c;

    public h(ConnectivityManager connectivityManager, g gVar) {
        this.b = connectivityManager;
        this.c = gVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public final void onAvailable(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        NetworkCapabilities networkCapabilities = this.b.getNetworkCapabilities(network);
        e.c cVar = this.c.b;
        boolean z = true;
        if (networkCapabilities != null) {
            boolean hasCapability = networkCapabilities.hasCapability(16);
            if (!networkCapabilities.hasCapability(12) || !hasCapability) {
                z = false;
            }
        }
        this.a = new g.a(network, cVar, z);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        Intrinsics.checkNotNullParameter(network, "network");
        g.a aVar = this.a;
        if (aVar != null) {
            g.a.a(aVar, network, false, z, 2);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
        g.a aVar = this.a;
        if (aVar != null) {
            g.a.a(aVar, network, networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16), false, 4);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        g.a aVar = this.a;
        if (aVar != null) {
            g.a.a(aVar, network, false, false, 4);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        this.c.b.a();
    }
}
