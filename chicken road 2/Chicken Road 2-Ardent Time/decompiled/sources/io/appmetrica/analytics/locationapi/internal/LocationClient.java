package io.appmetrica.analytics.locationapi.internal;

/* loaded from: classes.dex */
public interface LocationClient extends io.appmetrica.analytics.locationapi.internal.LocationControllerObserver, io.appmetrica.analytics.locationapi.internal.LocationProvider {
    io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory();

    io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory getLocationReceiverProviderFactory();

    void init(android.content.Context context, io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor permissionExtractor, io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor iHandlerExecutor, java.util.List<? extends io.appmetrica.analytics.coreapi.internal.backport.Consumer<android.location.Location>> list);

    void registerSystemLocationSource(io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider);

    void registerSystemLocationSource(io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider locationReceiverProvider);

    void unregisterSystemLocationSource(io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider);

    void unregisterSystemLocationSource(io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider locationReceiverProvider);

    void updateCacheArguments(io.appmetrica.analytics.locationapi.internal.CacheArguments cacheArguments);

    void updateLocationFilter(io.appmetrica.analytics.locationapi.internal.LocationFilter locationFilter);

    void updateUserLocation(android.location.Location location);
}
