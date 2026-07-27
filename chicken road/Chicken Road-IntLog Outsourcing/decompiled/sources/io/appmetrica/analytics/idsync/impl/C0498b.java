package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;

/* renamed from: io.appmetrica.analytics.idsync.impl.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0498b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f6391a;

    public C0498b(ServiceContext serviceContext) {
        this.f6391a = serviceContext;
    }

    @Override // io.appmetrica.analytics.idsync.impl.t
    public final boolean a() {
        return this.f6391a.getActiveNetworkTypeProvider().getNetworkType(this.f6391a.getContext()) == NetworkType.CELL;
    }
}
