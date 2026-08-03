package io.appmetrica.analytics.idsync.impl;

/* renamed from: io.appmetrica.analytics.idsync.impl.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0207b implements io.appmetrica.analytics.idsync.impl.y {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.modulesapi.internal.service.ServiceContext f3902a;

    public C0207b(io.appmetrica.analytics.modulesapi.internal.service.ServiceContext serviceContext) {
        this.f3902a = serviceContext;
    }

    @Override // io.appmetrica.analytics.idsync.impl.y
    public final boolean a() {
        return this.f3902a.getActiveNetworkTypeProvider().getNetworkType(this.f3902a.getContext()) == io.appmetrica.analytics.coreapi.internal.system.NetworkType.CELL;
    }
}
