package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.vk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0777vk implements io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0234ak f6982a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Zj f6983b;

    /* JADX WARN: Multi-variable type inference failed */
    public C0777vk(io.appmetrica.analytics.impl.X4 x4, io.appmetrica.analytics.impl.C0580o4 c0580o4) {
        this.f6982a = new io.appmetrica.analytics.impl.C0234ak(x4, null, 2, 0 == true ? 1 : 0);
        this.f6983b = new io.appmetrica.analytics.impl.Zj(c0580o4);
    }

    public final io.appmetrica.analytics.impl.Zj a() {
        return this.f6983b;
    }

    public final io.appmetrica.analytics.impl.C0234ak b() {
        return this.f6982a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig getConfig() {
        return this.f6983b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter getReporter() {
        return this.f6982a;
    }
}
