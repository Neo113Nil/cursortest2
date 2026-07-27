package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;

/* renamed from: io.appmetrica.analytics.impl.fk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0649fk implements ServiceComponentModuleReporter {

    /* renamed from: a, reason: collision with root package name */
    public final C0608e5 f8190a;

    /* renamed from: b, reason: collision with root package name */
    public final C1140yk f8191b;

    public C0649fk(C0608e5 c0608e5, C1140yk c1140yk) {
        this.f8190a = c0608e5;
        this.f8191b = c1140yk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter
    public final void handleReport(ServiceModuleCounterReport serviceModuleCounterReport) {
        this.f8191b.getClass();
        this.f8190a.a(C1140yk.a(serviceModuleCounterReport));
    }

    public /* synthetic */ C0649fk(C0608e5 c0608e5, C1140yk c1140yk, int i2, kotlin.jvm.internal.e eVar) {
        this(c0608e5, (i2 & 2) != 0 ? new C1140yk() : c1140yk);
    }
}
