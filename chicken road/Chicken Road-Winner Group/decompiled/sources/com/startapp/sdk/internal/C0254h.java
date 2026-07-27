package com.startapp.sdk.internal;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: com.startapp.sdk.internal.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0254h extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0255i f3809a;

    public C0254h(C0255i c0255i) {
        this.f3809a = c0255i;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        int a3 = f6.a(networkCapabilities);
        synchronized (this.f3809a.f3847c) {
            this.f3809a.f3847c.put(network, Integer.valueOf(a3));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (this.f3809a.f3847c) {
            this.f3809a.f3847c.remove(network);
        }
    }
}
