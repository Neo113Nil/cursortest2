package io.appmetrica.analytics.modulesapi.internal.service;

/* loaded from: classes.dex */
public interface LocationServiceApi extends io.appmetrica.analytics.locationapi.internal.LocationProvider {
    io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory();

    io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory getLocationReceiverProviderFactory();

    io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor getPermissionExtractor();

    void registerControllerObserver(io.appmetrica.analytics.locationapi.internal.LocationControllerObserver locationControllerObserver);

    void registerSource(io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider);

    void registerSource(io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider locationReceiverProvider);

    void unregisterSource(io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider);

    void unregisterSource(io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider locationReceiverProvider);

    void updateLocationFilter(io.appmetrica.analytics.locationapi.internal.LocationFilter locationFilter);
}
