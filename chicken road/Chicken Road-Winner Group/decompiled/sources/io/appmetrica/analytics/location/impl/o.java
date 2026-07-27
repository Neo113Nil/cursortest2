package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;

/* loaded from: classes.dex */
public final class o implements LocationReceiverProviderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final q f8758a;

    public o(q qVar) {
        this.f8758a = qVar;
    }

    public final q a() {
        return this.f8758a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory
    public final LocationReceiverProvider getPassiveLocationReceiverProvider() {
        return this.f8758a;
    }
}
