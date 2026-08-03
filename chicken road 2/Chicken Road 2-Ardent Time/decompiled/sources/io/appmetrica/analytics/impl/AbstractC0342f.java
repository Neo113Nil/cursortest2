package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0342f implements io.appmetrica.analytics.impl.InterfaceC0347f4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f5865a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Bg f5866b;

    public AbstractC0342f(android.content.Context context, io.appmetrica.analytics.impl.Bg bg) {
        this.f5865a = context.getApplicationContext();
        this.f5866b = bg;
        bg.a(this);
        io.appmetrica.analytics.impl.C0560na.k().n().b(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0347f4
    public final void a(io.appmetrica.analytics.impl.P5 p5, io.appmetrica.analytics.impl.C0606p4 c0606p4) {
        b(p5, c0606p4);
    }

    public final io.appmetrica.analytics.impl.Bg b() {
        return this.f5866b;
    }

    public abstract void b(io.appmetrica.analytics.impl.P5 p5, io.appmetrica.analytics.impl.C0606p4 c0606p4);

    public final android.content.Context c() {
        return this.f5865a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0347f4
    public final void a() {
        this.f5866b.b(this);
        io.appmetrica.analytics.impl.C0560na.f6484I.m().a(this);
    }
}
