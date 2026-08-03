package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.g5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0374g5 implements io.appmetrica.analytics.impl.Bo {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f5960a;

    public C0374g5(java.util.List<? extends h1.C0172d> list) {
        this.f5960a = list;
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final java.lang.String a() {
        java.util.Iterator it = this.f5960a.iterator();
        while (it.hasNext()) {
            java.lang.String a2 = ((io.appmetrica.analytics.impl.Bo) ((h1.C0172d) it.next()).f3296b).a();
            if (a2 != null && a2.length() > 0) {
                return a2;
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final void a(java.lang.String str) {
        java.util.Iterator it = this.f5960a.iterator();
        while (it.hasNext()) {
            ((io.appmetrica.analytics.impl.Bo) ((h1.C0172d) it.next()).f3296b).a(str);
        }
    }
}
