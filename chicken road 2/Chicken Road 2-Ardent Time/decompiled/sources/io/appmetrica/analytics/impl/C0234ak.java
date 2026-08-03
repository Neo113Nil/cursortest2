package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ak, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0234ak implements io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.X4 f5479a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0725tk f5480b;

    public C0234ak(io.appmetrica.analytics.impl.X4 x4, io.appmetrica.analytics.impl.C0725tk c0725tk) {
        this.f5479a = x4;
        this.f5480b = c0725tk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter
    public final void handleReport(io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport serviceModuleCounterReport) {
        this.f5480b.getClass();
        this.f5479a.a(io.appmetrica.analytics.impl.C0725tk.a(serviceModuleCounterReport));
    }

    public /* synthetic */ C0234ak(io.appmetrica.analytics.impl.X4 x4, io.appmetrica.analytics.impl.C0725tk c0725tk, int i2, kotlin.jvm.internal.e eVar) {
        this(x4, (i2 & 2) != 0 ? new io.appmetrica.analytics.impl.C0725tk() : c0725tk);
    }
}
