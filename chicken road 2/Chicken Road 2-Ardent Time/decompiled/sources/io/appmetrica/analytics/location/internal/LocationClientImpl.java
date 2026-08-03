package io.appmetrica.analytics.location.internal;

/* loaded from: classes.dex */
public final class LocationClientImpl implements io.appmetrica.analytics.locationapi.internal.LocationClient {

    /* renamed from: a, reason: collision with root package name */
    private io.appmetrica.analytics.location.impl.k f7259a;

    /* renamed from: b, reason: collision with root package name */
    private final io.appmetrica.analytics.location.impl.g f7260b;

    /* renamed from: c, reason: collision with root package name */
    private final io.appmetrica.analytics.location.impl.o f7261c;

    /* renamed from: d, reason: collision with root package name */
    private io.appmetrica.analytics.location.impl.i f7262d;

    public LocationClientImpl() {
        io.appmetrica.analytics.location.impl.q qVar = new io.appmetrica.analytics.location.impl.q();
        this.f7260b = new io.appmetrica.analytics.location.impl.g(qVar);
        this.f7261c = new io.appmetrica.analytics.location.impl.o(qVar);
        this.f7262d = new io.appmetrica.analytics.location.impl.i();
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f7260b;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f7261c;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public synchronized android.location.Location getSystemLocation() {
        io.appmetrica.analytics.location.impl.k kVar;
        kVar = this.f7259a;
        return kVar != null ? kVar.a() : null;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public synchronized android.location.Location getUserLocation() {
        io.appmetrica.analytics.location.impl.k kVar;
        kVar = this.f7259a;
        return kVar != null ? kVar.b() : null;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void init(android.content.Context context, io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor permissionExtractor, io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor iHandlerExecutor, java.util.List<? extends io.appmetrica.analytics.coreapi.internal.backport.Consumer<android.location.Location>> list) {
        if (this.f7259a == null) {
            this.f7259a = new io.appmetrica.analytics.location.impl.k(context, permissionExtractor, iHandlerExecutor, new io.appmetrica.analytics.location.impl.p(list, this.f7262d));
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void registerSystemLocationSource(io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        io.appmetrica.analytics.location.impl.k kVar = this.f7259a;
        if (kVar != null) {
            kVar.a(lastKnownLocationExtractorProvider);
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public synchronized void startLocationTracking() {
        io.appmetrica.analytics.location.impl.k kVar = this.f7259a;
        if (kVar != null) {
            kVar.startLocationTracking();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public synchronized void stopLocationTracking() {
        io.appmetrica.analytics.location.impl.k kVar = this.f7259a;
        if (kVar != null) {
            kVar.stopLocationTracking();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void unregisterSystemLocationSource(io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        io.appmetrica.analytics.location.impl.k kVar = this.f7259a;
        if (kVar != null) {
            kVar.b(lastKnownLocationExtractorProvider);
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void updateCacheArguments(io.appmetrica.analytics.locationapi.internal.CacheArguments cacheArguments) {
        io.appmetrica.analytics.location.impl.i iVar = new io.appmetrica.analytics.location.impl.i(this.f7262d.f7215a, cacheArguments);
        this.f7262d = iVar;
        io.appmetrica.analytics.location.impl.k kVar = this.f7259a;
        if (kVar != null) {
            kVar.f7222d.execute(new io.appmetrica.analytics.location.impl.j(kVar, iVar));
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void updateLocationFilter(io.appmetrica.analytics.locationapi.internal.LocationFilter locationFilter) {
        io.appmetrica.analytics.location.impl.i iVar = new io.appmetrica.analytics.location.impl.i(locationFilter, this.f7262d.f7216b);
        this.f7262d = iVar;
        io.appmetrica.analytics.location.impl.k kVar = this.f7259a;
        if (kVar != null) {
            kVar.f7222d.execute(new io.appmetrica.analytics.location.impl.j(kVar, iVar));
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void updateUserLocation(android.location.Location location) {
        io.appmetrica.analytics.location.impl.k kVar = this.f7259a;
        if (kVar != null) {
            kVar.a(location);
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void registerSystemLocationSource(io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider locationReceiverProvider) {
        io.appmetrica.analytics.location.impl.k kVar = this.f7259a;
        if (kVar != null) {
            kVar.a(locationReceiverProvider);
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void unregisterSystemLocationSource(io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider locationReceiverProvider) {
        io.appmetrica.analytics.location.impl.k kVar = this.f7259a;
        if (kVar != null) {
            kVar.b(locationReceiverProvider);
        }
    }
}
