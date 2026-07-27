package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.gn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0678gn implements Nn {

    /* renamed from: a, reason: collision with root package name */
    public final Nn f8295a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8296b;

    public C0678gn(Nn nn, Object obj) {
        this.f8295a = nn;
        this.f8296b = obj;
    }

    @Override // io.appmetrica.analytics.impl.Nn
    public final Object a(Object obj) {
        return obj != this.f8295a.a(obj) ? this.f8296b : obj;
    }
}
