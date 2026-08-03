package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0906w implements io.appmetrica.analytics.screenshot.impl.InterfaceC0893i {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.modulesapi.internal.client.ClientContext f7590a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.U f7591b;

    public C0906w(io.appmetrica.analytics.modulesapi.internal.client.ClientContext clientContext, io.appmetrica.analytics.screenshot.impl.U u2) {
        this.f7590a = clientContext;
        this.f7591b = u2;
    }

    @Override // io.appmetrica.analytics.screenshot.impl.InterfaceC0893i
    public final java.util.List<io.appmetrica.analytics.screenshot.impl.T> a() {
        return i1.AbstractC0191j.H(new io.appmetrica.analytics.screenshot.impl.C0888d(this.f7590a, this.f7591b), new io.appmetrica.analytics.screenshot.impl.C0905v(this.f7590a, this.f7591b), new io.appmetrica.analytics.screenshot.impl.g0(this.f7590a, this.f7591b));
    }
}
