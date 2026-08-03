package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0472k0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f6243a = new java.util.HashMap();

    public final synchronized io.appmetrica.analytics.impl.C0446j0 a(io.appmetrica.analytics.impl.Q4 q4, io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger, io.appmetrica.analytics.impl.We we) {
        io.appmetrica.analytics.impl.C0446j0 c0446j0;
        c0446j0 = (io.appmetrica.analytics.impl.C0446j0) this.f6243a.get(q4.toString());
        if (c0446j0 == null) {
            io.appmetrica.analytics.impl.C0421i0 d2 = we.d();
            c0446j0 = new io.appmetrica.analytics.impl.C0446j0(d2.f6067a, d2.f6068b, new io.appmetrica.analytics.impl.C0674rl(publicLogger, "[App Environment]"));
            this.f6243a.put(q4.toString(), c0446j0);
        }
        return c0446j0;
    }

    public final synchronized void a(io.appmetrica.analytics.impl.C0421i0 c0421i0, io.appmetrica.analytics.impl.We we) {
        we.a(c0421i0).b();
    }
}
