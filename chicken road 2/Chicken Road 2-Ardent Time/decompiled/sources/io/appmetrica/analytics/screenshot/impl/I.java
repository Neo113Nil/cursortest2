package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class I implements io.appmetrica.analytics.screenshot.impl.InterfaceC0893i {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.modulesapi.internal.client.ClientContext f7499a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.U f7500b;

    public I(io.appmetrica.analytics.modulesapi.internal.client.ClientContext clientContext, io.appmetrica.analytics.screenshot.impl.U u2) {
        this.f7499a = clientContext;
        this.f7500b = u2;
    }

    @Override // io.appmetrica.analytics.screenshot.impl.InterfaceC0893i
    public final java.util.List<io.appmetrica.analytics.screenshot.impl.T> a() {
        return i1.AbstractC0191j.H(new io.appmetrica.analytics.screenshot.impl.C0905v(this.f7499a, this.f7500b), new io.appmetrica.analytics.screenshot.impl.g0(this.f7499a, this.f7500b));
    }
}
