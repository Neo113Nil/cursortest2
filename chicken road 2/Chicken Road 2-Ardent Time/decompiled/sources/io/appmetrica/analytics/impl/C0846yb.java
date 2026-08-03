package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.yb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0846yb implements io.appmetrica.analytics.networktasks.internal.ConfigProvider {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.X4 f7140a;

    /* renamed from: b, reason: collision with root package name */
    public final h1.InterfaceC0171c f7141b = Q1.l.q(new io.appmetrica.analytics.impl.C0820xb(this));

    public C0846yb(io.appmetrica.analytics.impl.X4 x4) {
        this.f7140a = x4;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0489kh getConfig() {
        return (io.appmetrica.analytics.impl.C0489kh) ((h1.C0175g) this.f7141b).a();
    }
}
