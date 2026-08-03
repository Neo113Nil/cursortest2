package io.appmetrica.analytics.idsync.impl;

/* loaded from: classes.dex */
public final class p implements io.appmetrica.analytics.idsync.impl.s {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.modulesapi.internal.service.ServiceContext f3962a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f3963b = "id_sync";

    public p(io.appmetrica.analytics.modulesapi.internal.service.ServiceContext serviceContext) {
        this.f3962a = serviceContext;
    }

    @Override // io.appmetrica.analytics.idsync.impl.s
    public final void a(java.lang.String str, io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers sdkIdentifiers) {
        this.f3962a.getSelfReporter().reportEvent(this.f3963b, str);
    }
}
