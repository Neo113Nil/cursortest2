package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ub, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0742ub implements io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0768vb f6904a = new io.appmetrica.analytics.impl.C0768vb();

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    public final io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider getGplLastKnownLocationExtractorProvider() {
        return this.f6904a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    public final io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider getGpsLastKnownLocationExtractorProvider() {
        return this.f6904a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    public final io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider getNetworkLastKnownLocationExtractorProvider() {
        return this.f6904a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory
    public final io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider getPassiveLastKnownLocationExtractorProvider() {
        return this.f6904a;
    }
}
