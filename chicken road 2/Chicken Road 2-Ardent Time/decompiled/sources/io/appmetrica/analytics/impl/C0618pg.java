package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.pg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0618pg {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Na f6654a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0488kg f6655b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.La f6656c;

    public C0618pg(io.appmetrica.analytics.impl.Na na, io.appmetrica.analytics.impl.InterfaceC0488kg interfaceC0488kg, io.appmetrica.analytics.impl.La la) {
        this.f6654a = na;
        this.f6655b = interfaceC0488kg;
        this.f6656c = la;
    }

    public final void a(io.appmetrica.analytics.impl.C0566ng c0566ng) {
        if (this.f6654a.a(c0566ng)) {
            this.f6655b.a(c0566ng);
            this.f6656c.a();
        }
    }

    public final io.appmetrica.analytics.impl.InterfaceC0488kg b() {
        return this.f6655b;
    }

    public final io.appmetrica.analytics.impl.La c() {
        return this.f6656c;
    }

    public final io.appmetrica.analytics.impl.Na a() {
        return this.f6654a;
    }
}
