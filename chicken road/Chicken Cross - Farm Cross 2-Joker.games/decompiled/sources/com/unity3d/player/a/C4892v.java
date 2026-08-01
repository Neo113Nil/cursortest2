package com.unity3d.player.a;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: com.unity3d.player.a.v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4892v extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4893w f11777a;

    public C4892v(C4893w c4893w) {
        this.f11777a = c4893w;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        super.onCapabilitiesChanged(network, networkCapabilities);
        if (networkCapabilities.hasTransport(0)) {
            this.f11777a.b = 1;
        } else {
            this.f11777a.b = 2;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        super.onUnavailable();
        this.f11777a.b = 0;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        super.onLost(network);
        this.f11777a.b = 0;
    }
}
