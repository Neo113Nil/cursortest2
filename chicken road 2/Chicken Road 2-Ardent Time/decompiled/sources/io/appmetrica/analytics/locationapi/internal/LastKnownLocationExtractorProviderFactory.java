package io.appmetrica.analytics.locationapi.internal;

/* loaded from: classes.dex */
public interface LastKnownLocationExtractorProviderFactory {
    io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider getGplLastKnownLocationExtractorProvider();

    io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider getGpsLastKnownLocationExtractorProvider();

    io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider getNetworkLastKnownLocationExtractorProvider();

    io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider getPassiveLastKnownLocationExtractorProvider();
}
