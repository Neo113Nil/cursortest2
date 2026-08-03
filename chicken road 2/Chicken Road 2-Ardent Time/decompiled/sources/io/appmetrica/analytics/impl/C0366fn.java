package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.fn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0366fn implements io.appmetrica.analytics.impl.InterfaceC0704t {

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0756v f5937b;

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0730u f5936a = new io.appmetrica.analytics.impl.C0730u();

    /* renamed from: c, reason: collision with root package name */
    public final h1.InterfaceC0171c f5938c = Q1.l.q(new io.appmetrica.analytics.impl.C0340en(this));

    public C0366fn(android.content.Context context) {
        this.f5937b = new io.appmetrica.analytics.impl.C0756v(context);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0704t
    public final java.util.Map<java.lang.String, java.lang.String> a(java.util.Map<java.lang.String, java.lang.String> map) {
        map.putAll((java.util.Map) ((h1.C0175g) this.f5938c).a());
        return map;
    }
}
