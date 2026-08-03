package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Sg implements io.appmetrica.analytics.impl.InterfaceC0298d6 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f4967a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0218a4 f4968b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor f4969c = io.appmetrica.analytics.impl.C0560na.k().w().d();

    public Sg(android.content.Context context, io.appmetrica.analytics.impl.C0218a4 c0218a4) {
        this.f4967a = context;
        this.f4968b = c0218a4;
    }

    public final void a(io.appmetrica.analytics.impl.P5 p5, android.os.Bundle bundle) {
        if (p5.m()) {
            return;
        }
        this.f4969c.execute(new io.appmetrica.analytics.impl.RunnableC0515lh(this.f4967a, p5, bundle, this.f4968b));
    }

    public final void a(io.appmetrica.analytics.impl.P3 p3, io.appmetrica.analytics.impl.P5 p5, io.appmetrica.analytics.impl.C0606p4 c0606p4) {
        this.f4968b.a(p3, c0606p4).a(p5, c0606p4);
        this.f4968b.a(p3.f4809b, p3.f4810c, p3.f4811d);
    }
}
