package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0479f implements InterfaceC0665m4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7264a;

    /* renamed from: b, reason: collision with root package name */
    public final Gg f7265b;

    public AbstractC0479f(Context context, Gg gg) {
        this.f7264a = context.getApplicationContext();
        this.f7265b = gg;
        gg.a(this);
        C0878ua.k().n().b(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0665m4
    public final void a(W5 w5, C0924w4 c0924w4) {
        b(w5, c0924w4);
    }

    public final Gg b() {
        return this.f7265b;
    }

    public abstract void b(W5 w5, C0924w4 c0924w4);

    public final Context c() {
        return this.f7264a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0665m4
    public final void a() {
        this.f7265b.b(this);
        C0878ua.f8414H.m().a(this);
    }
}
