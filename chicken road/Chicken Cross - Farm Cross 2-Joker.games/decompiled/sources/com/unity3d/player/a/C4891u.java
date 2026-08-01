package com.unity3d.player.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: com.unity3d.player.a.u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C4891u {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f11776a;

    public void a() {
    }

    public C4891u(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f11776a = connectivityManager;
        if (connectivityManager == null) {
            AbstractC4890t.Log(6, "NetworkConnectivity: ConnectivityManager not found");
        }
    }

    public int b() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = this.f11776a;
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = this.f11776a.getNetworkCapabilities(activeNetwork)) == null) {
            return 0;
        }
        return networkCapabilities.hasTransport(0) ? 1 : 2;
    }
}
