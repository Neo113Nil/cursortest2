package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.cache.LocationDataCacheUpdateScheduler;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k implements ILastKnownUpdater, LocationControllerObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8742a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionExtractor f8743b;

    /* renamed from: c, reason: collision with root package name */
    public final p f8744c;

    /* renamed from: d, reason: collision with root package name */
    public final IHandlerExecutor f8745d;

    /* renamed from: e, reason: collision with root package name */
    public final n f8746e;
    public final LocationDataCacheUpdateScheduler f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8747g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f8748h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f8749i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public Location f8750j;

    public k(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, p pVar) {
        this.f8742a = context;
        this.f8744c = pVar;
        this.f8743b = permissionExtractor;
        this.f8745d = iHandlerExecutor;
        this.f8746e = new n(pVar);
        LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler = new LocationDataCacheUpdateScheduler(iHandlerExecutor, this, pVar.a(), "loc");
        this.f = locationDataCacheUpdateScheduler;
        pVar.a().setUpdateScheduler(locationDataCacheUpdateScheduler);
    }

    public final synchronized Location a() {
        return (Location) this.f8744c.f8760b.getData();
    }

    public final synchronized void b(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f8748h.remove(lastKnownLocationExtractorProvider.getIdentifier());
    }

    public final synchronized Location c() {
        Location location;
        location = this.f8750j;
        if (location == null) {
            location = a();
        }
        return location;
    }

    public final synchronized void d() {
        try {
            this.f.startUpdates();
            Iterator it = this.f8749i.values().iterator();
            while (it.hasNext()) {
                ((LocationReceiver) it.next()).startLocationUpdates();
            }
            updateLastKnown();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e() {
        this.f.stopUpdates();
        Iterator it = this.f8749i.values().iterator();
        while (it.hasNext()) {
            ((LocationReceiver) it.next()).stopLocationUpdates();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void startLocationTracking() {
        if (!this.f8747g) {
            this.f8747g = true;
            d();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void stopLocationTracking() {
        if (this.f8747g) {
            this.f8747g = false;
            e();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater
    public final synchronized void updateLastKnown() {
        Iterator it = this.f8748h.values().iterator();
        while (it.hasNext()) {
            ((LastKnownLocationExtractor) it.next()).updateLastKnownLocation();
        }
    }

    public final synchronized void b(LocationReceiverProvider locationReceiverProvider) {
        LocationReceiver locationReceiver = (LocationReceiver) this.f8749i.remove(locationReceiverProvider.getIdentifier());
        if (locationReceiver != null && this.f8747g) {
            locationReceiver.stopLocationUpdates();
        }
    }

    public final void a(i iVar) {
        this.f8745d.execute(new j(this, iVar));
    }

    public final synchronized void a(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        LastKnownLocationExtractor extractor = lastKnownLocationExtractorProvider.getExtractor(this.f8742a, this.f8743b, this.f8745d, this.f8746e);
        this.f8748h.put(lastKnownLocationExtractorProvider.getIdentifier(), extractor);
        if (this.f8747g) {
            extractor.updateLastKnownLocation();
        }
    }

    public final synchronized Location b() {
        return this.f8750j;
    }

    public final synchronized void a(LocationReceiverProvider locationReceiverProvider) {
        try {
            LocationReceiver locationReceiver = locationReceiverProvider.getLocationReceiver(this.f8742a, this.f8743b, this.f8745d, this.f8746e);
            LocationReceiver locationReceiver2 = (LocationReceiver) this.f8749i.put(locationReceiverProvider.getIdentifier(), locationReceiver);
            if (this.f8747g) {
                if (locationReceiver2 != null) {
                    locationReceiver2.stopLocationUpdates();
                }
                locationReceiver.startLocationUpdates();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(Location location) {
        if (location != null) {
            this.f8750j = location;
        }
    }
}
