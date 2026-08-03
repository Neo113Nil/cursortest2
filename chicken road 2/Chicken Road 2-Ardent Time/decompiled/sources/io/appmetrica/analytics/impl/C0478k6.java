package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.k6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0478k6 implements io.appmetrica.analytics.impl.Fa {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f6259a = new java.util.concurrent.CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.Fa
    public final void a(java.lang.Throwable th, io.appmetrica.analytics.impl.V v2) {
        java.util.Iterator it = this.f6259a.iterator();
        while (it.hasNext()) {
            ((io.appmetrica.analytics.impl.Fa) it.next()).a(th, v2);
        }
    }

    public final void a(io.appmetrica.analytics.impl.Fa... faArr) {
        i1.AbstractC0196o.L(this.f6259a, faArr);
    }

    public final void a(java.util.List<? extends io.appmetrica.analytics.impl.Fa> list) {
        this.f6259a.addAll(list);
    }

    public final void a() {
        this.f6259a.clear();
    }
}
