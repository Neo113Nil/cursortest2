package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.k5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0477k5 implements io.appmetrica.analytics.impl.InterfaceC0637q9 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0766v9 f6255a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f6256b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f6257c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f6258d;

    public C0477k5(io.appmetrica.analytics.impl.InterfaceC0766v9 interfaceC0766v9, java.util.List<? extends io.appmetrica.analytics.impl.F8> list, java.util.List<? extends io.appmetrica.analytics.impl.F8> list2, io.appmetrica.analytics.impl.Q4 q4) {
        this.f6255a = interfaceC0766v9;
        this.f6256b = list;
        this.f6257c = list2;
        java.util.Objects.toString(q4);
        this.f6258d = new java.util.concurrent.atomic.AtomicBoolean(true);
    }

    public final boolean a() {
        java.util.List list = this.f6257c;
        if (!list.isEmpty() && !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((io.appmetrica.analytics.impl.F8) it.next()).b()) {
                    break;
                }
            }
        }
        java.util.List list2 = this.f6256b;
        if (!list2.isEmpty() && !list2.isEmpty()) {
            java.util.Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((io.appmetrica.analytics.impl.F8) it2.next()).b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        this.f6258d.set(false);
    }

    public final void c() {
        this.f6258d.set(true);
    }

    public final void d() {
        if (this.f6258d.get()) {
            java.util.List list = this.f6257c;
            if (!list.isEmpty() && !list.isEmpty()) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((io.appmetrica.analytics.impl.F8) it.next()).b()) {
                        return;
                    }
                }
            }
            ((io.appmetrica.analytics.impl.C0521ln) this.f6255a).c();
        }
    }

    public final void e() {
        if (this.f6258d.get() && a()) {
            ((io.appmetrica.analytics.impl.C0521ln) this.f6255a).c();
        }
    }

    public final void f() {
        if (this.f6258d.get() && a()) {
            ((io.appmetrica.analytics.impl.C0521ln) this.f6255a).b();
        }
    }
}
