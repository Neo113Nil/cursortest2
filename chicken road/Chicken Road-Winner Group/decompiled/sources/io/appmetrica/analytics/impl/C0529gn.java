package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.gn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0529gn implements Nn {

    /* renamed from: a, reason: collision with root package name */
    public final Nn f7393a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7394b;

    public C0529gn(Nn nn, Object obj) {
        this.f7393a = nn;
        this.f7394b = obj;
    }

    @Override // io.appmetrica.analytics.impl.Nn
    public final Object a(Object obj) {
        return obj != this.f7393a.a(obj) ? this.f7394b : obj;
    }
}
