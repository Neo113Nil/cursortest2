package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.dn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0315dn implements io.appmetrica.analytics.impl.Ln {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ln f5754a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f5755b;

    public C0315dn(io.appmetrica.analytics.impl.Ln ln, java.lang.Object obj) {
        this.f5754a = ln;
        this.f5755b = obj;
    }

    @Override // io.appmetrica.analytics.impl.Ln
    public final java.lang.Object a(java.lang.Object obj) {
        return obj != this.f5754a.a(obj) ? this.f5755b : obj;
    }
}
