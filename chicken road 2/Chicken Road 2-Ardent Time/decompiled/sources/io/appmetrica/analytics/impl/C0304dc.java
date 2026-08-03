package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.dc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0304dc implements io.appmetrica.analytics.impl.InterfaceC0662r9 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0477k5 f5725a;

    public C0304dc(io.appmetrica.analytics.impl.InterfaceC0766v9 interfaceC0766v9, io.appmetrica.analytics.impl.L6 l6, io.appmetrica.analytics.impl.Qg qg, io.appmetrica.analytics.impl.C0580o4 c0580o4, io.appmetrica.analytics.impl.Q4 q4, io.appmetrica.analytics.impl.We we) {
        io.appmetrica.analytics.impl.C0278cc c0278cc = new io.appmetrica.analytics.impl.C0278cc(l6, qg, this, c0580o4, we);
        this.f5725a = new io.appmetrica.analytics.impl.C0477k5(interfaceC0766v9, c0278cc.a(), c0278cc.b(), q4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0662r9
    public final io.appmetrica.analytics.impl.InterfaceC0637q9 a() {
        return this.f5725a;
    }

    public final io.appmetrica.analytics.impl.C0477k5 b() {
        return this.f5725a;
    }
}
