package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class Gg implements Ul, Na {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5994a;

    /* renamed from: b, reason: collision with root package name */
    public final X4 f5995b;

    /* renamed from: c, reason: collision with root package name */
    public final Y4 f5996c;

    /* renamed from: d, reason: collision with root package name */
    public final Em f5997d;

    /* renamed from: e, reason: collision with root package name */
    public final Wa f5998e;

    public Gg(Context context, X4 x4, C0924w4 c0924w4, InterfaceC0485f5 interfaceC0485f5, Y4 y4, Ll ll) {
        this.f5994a = context;
        this.f5995b = x4;
        this.f5996c = y4;
        Em a3 = ll.a(context, x4, c0924w4.f8540a);
        this.f5997d = a3;
        this.f5998e = interfaceC0485f5.a(context, x4, c0924w4.f8541b, a3);
        ll.a(x4, this);
    }

    public final X4 a() {
        return this.f5995b;
    }

    public final Context b() {
        return this.f5994a;
    }

    public final void a(InterfaceC0665m4 interfaceC0665m4) {
        this.f5996c.f6848a.add(interfaceC0665m4);
    }

    public final void b(InterfaceC0665m4 interfaceC0665m4) {
        this.f5996c.f6848a.remove(interfaceC0665m4);
    }

    @Override // io.appmetrica.analytics.impl.Ul
    public final void a(C0605jm c0605jm) {
        ((C0459e5) this.f5998e).a(c0605jm);
    }

    @Override // io.appmetrica.analytics.impl.Ul
    public final void a(Nl nl, C0605jm c0605jm) {
        ((C0459e5) this.f5998e).getClass();
    }

    @Override // io.appmetrica.analytics.impl.Na
    public final void a(C0924w4 c0924w4) {
        this.f5997d.a(c0924w4.f8540a);
        this.f5998e.a(c0924w4.f8541b);
    }

    public Gg(Context context, X4 x4, C0924w4 c0924w4, InterfaceC0485f5 interfaceC0485f5) {
        this(context, x4, c0924w4, interfaceC0485f5, new Y4(), Ll.a());
    }

    public final void a(W5 w5, C0924w4 c0924w4) {
        if (!D9.f5836c.contains(EnumC0569ib.a(w5.f6778d))) {
            this.f5998e.a(c0924w4.f8541b);
        }
        ((C0459e5) this.f5998e).a(w5);
    }
}
