package com.startapp.sdk.internal;

import android.net.ConnectivityManager;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d6 implements ConnectivityManager.OnNetworkActiveListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f6 f3569a;

    public d6(f6 f6Var) {
        this.f3569a = f6Var;
    }

    @Override // android.net.ConnectivityManager.OnNetworkActiveListener
    public final void onNetworkActive() {
        f6 f6Var = this.f3569a;
        synchronized (f6Var.f3675c) {
            try {
                Iterator it = f6Var.f3675c.iterator();
                while (it.hasNext()) {
                    ((i7) it.next()).a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
