package io.appmetrica.analytics.location.impl;

/* loaded from: classes.dex */
public final class o implements io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.location.impl.q f7237a;

    public o(io.appmetrica.analytics.location.impl.q qVar) {
        this.f7237a = qVar;
    }

    public final io.appmetrica.analytics.location.impl.q a() {
        return this.f7237a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory
    public final io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider getPassiveLocationReceiverProvider() {
        return this.f7237a;
    }
}
