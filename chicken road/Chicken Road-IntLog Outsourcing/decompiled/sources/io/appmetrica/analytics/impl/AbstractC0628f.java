package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0628f implements InterfaceC0814m4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8159a;

    /* renamed from: b, reason: collision with root package name */
    public final Gg f8160b;

    public AbstractC0628f(Context context, Gg gg) {
        this.f8159a = context.getApplicationContext();
        this.f8160b = gg;
        gg.a(this);
        C1027ua.k().n().b(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0814m4
    public final void a(W5 w5, C1073w4 c1073w4) {
        b(w5, c1073w4);
    }

    public final Gg b() {
        return this.f8160b;
    }

    public abstract void b(W5 w5, C1073w4 c1073w4);

    public final Context c() {
        return this.f8159a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0814m4
    public final void a() {
        this.f8160b.b(this);
        C1027ua.f9366H.m().a(this);
    }
}
