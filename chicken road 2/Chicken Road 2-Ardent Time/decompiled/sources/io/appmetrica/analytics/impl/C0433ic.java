package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ic, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0433ic {

    /* renamed from: a, reason: collision with root package name */
    public int f6094a = 5;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0316e f6095b;

    public C0433ic(io.appmetrica.analytics.impl.InterfaceC0369g0 interfaceC0369g0) {
        this.f6095b = new io.appmetrica.analytics.impl.C0316e(new io.appmetrica.analytics.impl.Db(interfaceC0369g0));
    }

    public static final void b(io.appmetrica.analytics.AnrListener anrListener) {
        anrListener.onAppNotResponding();
    }

    public final void a(final io.appmetrica.analytics.AnrListener anrListener) {
        io.appmetrica.analytics.impl.C0316e c0316e = this.f6095b;
        c0316e.f5761a.add(new io.appmetrica.analytics.impl.InterfaceC0265c() { // from class: io.appmetrica.analytics.impl.Xo
            @Override // io.appmetrica.analytics.impl.InterfaceC0265c
            public final void onAppNotResponding() {
                io.appmetrica.analytics.impl.C0433ic.b(io.appmetrica.analytics.AnrListener.this);
            }
        });
    }
}
