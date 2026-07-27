package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;

/* renamed from: io.appmetrica.analytics.idsync.impl.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0349b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f5569a;

    public C0349b(ServiceContext serviceContext) {
        this.f5569a = serviceContext;
    }

    @Override // io.appmetrica.analytics.idsync.impl.t
    public final boolean a() {
        return this.f5569a.getActiveNetworkTypeProvider().getNetworkType(this.f5569a.getContext()) == NetworkType.CELL;
    }
}
