package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Lb implements io.appmetrica.analytics.impl.Kb, io.appmetrica.analytics.impl.InterfaceC0494km, io.appmetrica.analytics.locationapi.internal.LocationProvider {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f4600a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Pb f4601b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.locationapi.internal.LocationClient f4602c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0726tl f4603d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0829xk f4604e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory f4605f;

    /* renamed from: g, reason: collision with root package name */
    public final io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory f4606g;

    public Lb(android.content.Context context, io.appmetrica.analytics.impl.Pb pb, io.appmetrica.analytics.locationapi.internal.LocationClient locationClient) {
        this.f4600a = context;
        this.f4601b = pb;
        this.f4602c = locationClient;
        io.appmetrica.analytics.impl.Ub ub = new io.appmetrica.analytics.impl.Ub();
        this.f4603d = new io.appmetrica.analytics.impl.C0726tl(new io.appmetrica.analytics.impl.C0451j5(ub, io.appmetrica.analytics.impl.C0560na.k().p().getAskForPermissionStrategy()));
        this.f4604e = io.appmetrica.analytics.impl.C0560na.k().p();
        ((io.appmetrica.analytics.impl.Sb) pb).a(ub, true);
        ((io.appmetrica.analytics.impl.Sb) pb).a(locationClient, true);
        this.f4605f = locationClient.getLastKnownExtractorProviderFactory();
        this.f4606g = locationClient.getLocationReceiverProviderFactory();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0494km
    public final void a(io.appmetrica.analytics.impl.C0365fm c0365fm) {
        io.appmetrica.analytics.impl.C0295d3 c0295d3 = c0365fm.f5933x;
        if (c0295d3 != null) {
            long j2 = c0295d3.f5692a;
            this.f4602c.updateCacheArguments(new io.appmetrica.analytics.locationapi.internal.CacheArguments(j2, 2 * j2));
        }
    }

    public final io.appmetrica.analytics.impl.C0726tl b() {
        return this.f4603d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f4605f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f4606g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor getPermissionExtractor() {
        return this.f4603d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public final android.location.Location getSystemLocation() {
        return this.f4602c.getSystemLocation();
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public final android.location.Location getUserLocation() {
        return this.f4602c.getUserLocation();
    }

    @Override // io.appmetrica.analytics.impl.Kb, io.appmetrica.analytics.impl.Nb
    public final void init() {
        this.f4602c.init(this.f4600a, this.f4603d, io.appmetrica.analytics.impl.C0560na.f6484I.f6495d.b(), this.f4604e.e());
        io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController f2 = this.f4604e.f();
        if (f2 != null) {
            f2.init();
        } else {
            io.appmetrica.analytics.locationapi.internal.LocationClient locationClient = this.f4602c;
            locationClient.registerSystemLocationSource(locationClient.getLastKnownExtractorProviderFactory().getGplLastKnownLocationExtractorProvider());
            io.appmetrica.analytics.locationapi.internal.LocationClient locationClient2 = this.f4602c;
            locationClient2.registerSystemLocationSource(locationClient2.getLastKnownExtractorProviderFactory().getNetworkLastKnownLocationExtractorProvider());
        }
        ((io.appmetrica.analytics.impl.Sb) this.f4601b).a(this.f4604e.g());
        io.appmetrica.analytics.impl.C0560na.f6484I.f6511u.a(this);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerControllerObserver(io.appmetrica.analytics.locationapi.internal.LocationControllerObserver locationControllerObserver) {
        ((io.appmetrica.analytics.impl.Sb) this.f4601b).a(locationControllerObserver, true);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f4602c.registerSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f4602c.unregisterSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void updateLocationFilter(io.appmetrica.analytics.locationapi.internal.LocationFilter locationFilter) {
        this.f4602c.updateLocationFilter(locationFilter);
    }

    @Override // io.appmetrica.analytics.impl.Kb, io.appmetrica.analytics.impl.Nb
    public final void b(java.lang.Object obj) {
        ((io.appmetrica.analytics.impl.Sb) this.f4601b).a(obj);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider locationReceiverProvider) {
        this.f4602c.registerSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider locationReceiverProvider) {
        this.f4602c.unregisterSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.impl.Kb, io.appmetrica.analytics.impl.Nb
    public final void a(java.lang.Object obj) {
        ((io.appmetrica.analytics.impl.Sb) this.f4601b).b(obj);
    }

    @Override // io.appmetrica.analytics.impl.Kb, io.appmetrica.analytics.impl.Nb
    public final void a(boolean z2) {
        ((io.appmetrica.analytics.impl.Sb) this.f4601b).a(z2);
    }

    @Override // io.appmetrica.analytics.impl.Kb, io.appmetrica.analytics.impl.Nb
    public final void a(android.location.Location location) {
        this.f4602c.updateUserLocation(location);
    }
}
