package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Fb {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.O2 f4287a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0371g2 f4288b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f4289c;

    public Fb(io.appmetrica.analytics.impl.O2 o2, io.appmetrica.analytics.impl.C0371g2 c0371g2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f4289c = arrayList;
        this.f4287a = o2;
        arrayList.add(o2);
        this.f4288b = c0371g2;
        arrayList.add(c0371g2);
    }

    public final synchronized void a() {
        java.util.Iterator it = this.f4289c.iterator();
        while (it.hasNext()) {
            ((io.appmetrica.analytics.impl.InterfaceC0518lk) it.next()).onCreate();
        }
    }

    public final synchronized void a(io.appmetrica.analytics.impl.C0534ma c0534ma) {
        this.f4289c.add(c0534ma);
    }
}
