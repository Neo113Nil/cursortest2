package io.appmetrica.analytics.location.impl;

/* loaded from: classes.dex */
public final class g implements io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider f7210a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.location.impl.c f7211b = new io.appmetrica.analytics.location.impl.c("location-module-gpl");

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.location.impl.v f7212c = new io.appmetrica.analytics.location.impl.v("network", new io.appmetrica.analytics.location.impl.f(), "location-module-network");

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.location.impl.v f7213d = new io.appmetrica.analytics.location.impl.v("gps", new io.appmetrica.analytics.location.impl.e(), "location-module-gps");

    public g(io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f7210a = lastKnownLocationExtractorProvider;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    public final io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider getGplLastKnownLocationExtractorProvider() {
        return this.f7211b;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    public final io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider getGpsLastKnownLocationExtractorProvider() {
        return this.f7213d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    public final io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider getNetworkLastKnownLocationExtractorProvider() {
        return this.f7212c;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    public final io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider getPassiveLastKnownLocationExtractorProvider() {
        return this.f7210a;
    }
}
