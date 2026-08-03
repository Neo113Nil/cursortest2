package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Mb implements io.appmetrica.analytics.impl.Kb {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0771ve f4657a = new io.appmetrica.analytics.impl.C0771ve();

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0742ub f4658b = new io.appmetrica.analytics.impl.C0742ub();

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Wb f4659c = new io.appmetrica.analytics.impl.Wb();

    @Override // io.appmetrica.analytics.impl.Kb, io.appmetrica.analytics.impl.Nb
    public final void a(android.location.Location location) {
    }

    @Override // io.appmetrica.analytics.impl.Kb, io.appmetrica.analytics.impl.Nb
    public final void b(java.lang.Object obj) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f4658b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f4659c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor getPermissionExtractor() {
        return this.f4657a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public final android.location.Location getSystemLocation() {
        return null;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public final android.location.Location getUserLocation() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Kb, io.appmetrica.analytics.impl.Nb
    public final void init() {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerControllerObserver(io.appmetrica.analytics.locationapi.internal.LocationControllerObserver locationControllerObserver) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void updateLocationFilter(io.appmetrica.analytics.locationapi.internal.LocationFilter locationFilter) {
    }

    @Override // io.appmetrica.analytics.impl.Kb, io.appmetrica.analytics.impl.Nb
    public final void a(java.lang.Object obj) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider locationReceiverProvider) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider locationReceiverProvider) {
    }

    @Override // io.appmetrica.analytics.impl.Kb, io.appmetrica.analytics.impl.Nb
    public final void a(boolean z2) {
    }
}
