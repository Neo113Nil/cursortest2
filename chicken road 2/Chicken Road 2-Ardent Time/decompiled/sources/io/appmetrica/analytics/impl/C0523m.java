package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0523m implements io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f6378a = new java.util.HashSet();

    public C0523m(io.appmetrica.analytics.impl.C0575o c0575o) {
        c0575o.registerListener(this, new io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent[0]);
    }

    public final synchronized void a(io.appmetrica.analytics.impl.InterfaceC0497l interfaceC0497l) {
        this.f6378a.add(interfaceC0497l);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(android.app.Activity activity, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent activityEvent) {
        io.appmetrica.analytics.impl.C0244b4.l().f5493c.a().execute(new io.appmetrica.analytics.impl.RunnableC0471k(this, activity));
    }

    public final void a(android.app.Activity activity) {
        java.util.HashSet hashSet;
        synchronized (this) {
            hashSet = new java.util.HashSet(this.f6378a);
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((io.appmetrica.analytics.impl.C0259bj) ((io.appmetrica.analytics.impl.InterfaceC0497l) it.next())).a(activity);
        }
    }
}
