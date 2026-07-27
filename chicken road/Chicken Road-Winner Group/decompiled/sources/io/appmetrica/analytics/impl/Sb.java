package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationClient;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;

/* loaded from: classes.dex */
public final class Sb implements Rb, InterfaceC0735om, LocationProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6586a;

    /* renamed from: b, reason: collision with root package name */
    public final Wb f6587b;

    /* renamed from: c, reason: collision with root package name */
    public final LocationClient f6588c;

    /* renamed from: d, reason: collision with root package name */
    public final C0967xl f6589d;

    /* renamed from: e, reason: collision with root package name */
    public final Ck f6590e;
    public final LastKnownLocationExtractorProviderFactory f;

    /* renamed from: g, reason: collision with root package name */
    public final LocationReceiverProviderFactory f6591g;

    public Sb(Context context, Wb wb, LocationClient locationClient) {
        this.f6586a = context;
        this.f6587b = wb;
        this.f6588c = locationClient;
        C0389bc c0389bc = new C0389bc();
        this.f6589d = new C0967xl(new C0770q5(c0389bc, C0878ua.k().p().getAskForPermissionStrategy()));
        this.f6590e = C0878ua.k().p();
        ((Zb) wb).a(c0389bc, true);
        ((Zb) wb).a(locationClient, true);
        this.f = locationClient.getLastKnownExtractorProviderFactory();
        this.f6591g = locationClient.getLocationReceiverProviderFactory();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0735om
    public final void a(C0605jm c0605jm) {
        C0638l3 c0638l3 = c0605jm.f7664x;
        if (c0638l3 != null) {
            long j3 = c0638l3.f7732a;
            this.f6588c.updateCacheArguments(new CacheArguments(j3, 2 * j3));
        }
    }

    public final C0967xl b() {
        return this.f6589d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f6591g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final PermissionExtractor getPermissionExtractor() {
        return this.f6589d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public final Location getSystemLocation() {
        return this.f6588c.getSystemLocation();
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public final Location getUserLocation() {
        return this.f6588c.getUserLocation();
    }

    @Override // io.appmetrica.analytics.impl.Rb, io.appmetrica.analytics.impl.Ub
    public final void init() {
        this.f6588c.init(this.f6586a, this.f6589d, C0878ua.f8414H.f8425d.c(), this.f6590e.e());
        ModuleLocationSourcesServiceController f = this.f6590e.f();
        if (f != null) {
            f.init();
        } else {
            LocationClient locationClient = this.f6588c;
            locationClient.registerSystemLocationSource(locationClient.getLastKnownExtractorProviderFactory().getGplLastKnownLocationExtractorProvider());
            LocationClient locationClient2 = this.f6588c;
            locationClient2.registerSystemLocationSource(locationClient2.getLastKnownExtractorProviderFactory().getNetworkLastKnownLocationExtractorProvider());
        }
        ((Zb) this.f6587b).a(this.f6590e.g());
        C0878ua.f8414H.f8441u.a(this);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerControllerObserver(LocationControllerObserver locationControllerObserver) {
        ((Zb) this.f6587b).a(locationControllerObserver, true);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f6588c.registerSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f6588c.unregisterSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void updateLocationFilter(LocationFilter locationFilter) {
        this.f6588c.updateLocationFilter(locationFilter);
    }

    @Override // io.appmetrica.analytics.impl.Rb, io.appmetrica.analytics.impl.Ub
    public final void b(Object obj) {
        ((Zb) this.f6587b).a(obj);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LocationReceiverProvider locationReceiverProvider) {
        this.f6588c.registerSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LocationReceiverProvider locationReceiverProvider) {
        this.f6588c.unregisterSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.impl.Rb, io.appmetrica.analytics.impl.Ub
    public final void a(Object obj) {
        ((Zb) this.f6587b).b(obj);
    }

    @Override // io.appmetrica.analytics.impl.Rb, io.appmetrica.analytics.impl.Ub
    public final void a(boolean z3) {
        ((Zb) this.f6587b).a(z3);
    }

    @Override // io.appmetrica.analytics.impl.Rb, io.appmetrica.analytics.impl.Ub
    public final void a(Location location) {
        this.f6588c.updateUserLocation(location);
    }
}
