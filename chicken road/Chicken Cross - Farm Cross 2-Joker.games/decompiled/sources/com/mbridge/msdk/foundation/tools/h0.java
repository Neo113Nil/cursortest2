package com.mbridge.msdk.foundation.tools;

import android.net.ConnectivityManager;

/* compiled from: NetManager.java */
/* loaded from: classes6.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    private static ConnectivityManager f9428a;

    public static synchronized ConnectivityManager a() {
        ConnectivityManager connectivityManager;
        synchronized (h0.class) {
            try {
                if (f9428a == null && com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    f9428a = (ConnectivityManager) com.mbridge.msdk.foundation.controller.c.n().d().getSystemService("connectivity");
                }
            } catch (Exception e) {
                q0.b("NetManager", e.getMessage());
            }
            connectivityManager = f9428a;
        }
        return connectivityManager;
    }
}
