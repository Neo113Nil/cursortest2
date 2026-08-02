package com.plaid.internal;

/* renamed from: com.plaid.internal.k4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class RunnableC0568k4 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.net.ConnectivityManager f6462a;
    public final /* synthetic */ com.plaid.internal.C0577l4.b b;

    public RunnableC0568k4(android.net.ConnectivityManager connectivityManager, com.plaid.internal.C0577l4.b bVar) {
        this.f6462a = connectivityManager;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6462a.unregisterNetworkCallback(this.b);
    }
}
