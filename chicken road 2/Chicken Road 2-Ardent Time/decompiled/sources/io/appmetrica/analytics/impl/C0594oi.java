package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.oi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0594oi {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f6596a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0861z0 f6597b;

    public C0594oi(io.appmetrica.analytics.impl.C0861z0 c0861z0) {
        this.f6597b = c0861z0;
    }

    public static io.appmetrica.analytics.impl.C0594oi a() {
        return io.appmetrica.analytics.impl.AbstractC0568ni.f6537a;
    }

    public final io.appmetrica.analytics.impl.C0387gi a(android.content.Context context, java.lang.String str) {
        io.appmetrica.analytics.impl.C0387gi c0387gi = (io.appmetrica.analytics.impl.C0387gi) this.f6596a.get(str);
        if (c0387gi == null) {
            synchronized (this.f6596a) {
                try {
                    c0387gi = (io.appmetrica.analytics.impl.C0387gi) this.f6596a.get(str);
                    if (c0387gi == null) {
                        io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor a2 = io.appmetrica.analytics.impl.C0244b4.l().f5493c.a();
                        this.f6597b.getClass();
                        if (io.appmetrica.analytics.impl.C0835y0.f7125e == null) {
                            ((io.appmetrica.analytics.impl.C0870z9) a2).f7180b.post(new io.appmetrica.analytics.impl.RunnableC0542mi(this, context));
                        }
                        c0387gi = new io.appmetrica.analytics.impl.C0387gi(context.getApplicationContext(), str, new io.appmetrica.analytics.impl.C0861z0());
                        this.f6596a.put(str, c0387gi);
                        c0387gi.c(str);
                    }
                } finally {
                }
            }
        }
        return c0387gi;
    }
}
