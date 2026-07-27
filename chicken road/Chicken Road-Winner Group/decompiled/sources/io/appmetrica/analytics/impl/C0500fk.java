package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;

/* renamed from: io.appmetrica.analytics.impl.fk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0500fk implements ServiceComponentModuleReporter {

    /* renamed from: a, reason: collision with root package name */
    public final C0459e5 f7295a;

    /* renamed from: b, reason: collision with root package name */
    public final C0991yk f7296b;

    public C0500fk(C0459e5 c0459e5, C0991yk c0991yk) {
        this.f7295a = c0459e5;
        this.f7296b = c0991yk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter
    public final void handleReport(ServiceModuleCounterReport serviceModuleCounterReport) {
        this.f7296b.getClass();
        this.f7295a.a(C0991yk.a(serviceModuleCounterReport));
    }

    public /* synthetic */ C0500fk(C0459e5 c0459e5, C0991yk c0991yk, int i3, kotlin.jvm.internal.f fVar) {
        this(c0459e5, (i3 & 2) != 0 ? new C0991yk() : c0991yk);
    }
}
