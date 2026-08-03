package io.appmetrica.analytics.location.impl;

/* loaded from: classes.dex */
public final class n implements android.location.LocationListener {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.location.impl.p f7236a;

    public n(io.appmetrica.analytics.location.impl.p pVar) {
        this.f7236a = pVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(android.location.Location location) {
        if (location != null) {
            io.appmetrica.analytics.location.impl.p pVar = this.f7236a;
            pVar.getClass();
            java.lang.String provider = location.getProvider();
            io.appmetrica.analytics.location.impl.t tVar = (io.appmetrica.analytics.location.impl.t) pVar.f7242e.get(provider);
            if (tVar == null) {
                io.appmetrica.analytics.location.impl.t tVar2 = new io.appmetrica.analytics.location.impl.t(pVar.f7238a.f7215a);
                tVar2.f7249c.add(pVar.f7240c);
                java.util.Iterator it = pVar.f7241d.iterator();
                while (it.hasNext()) {
                    tVar2.f7249c.add((io.appmetrica.analytics.coreapi.internal.backport.Consumer) it.next());
                }
                pVar.f7242e.put(provider, tVar2);
                tVar = tVar2;
            } else {
                tVar.f7247a = pVar.f7238a.f7215a;
            }
            if (tVar.f7250d != null) {
                boolean didTimePassMillis = tVar.f7248b.didTimePassMillis(tVar.f7251e, tVar.f7247a.getUpdateTimeInterval(), "isSavedLocationOutdated");
                boolean z2 = location.distanceTo(tVar.f7250d) > tVar.f7247a.getUpdateDistanceInterval();
                boolean z3 = tVar.f7250d == null || location.getTime() - tVar.f7250d.getTime() >= 0;
                if ((!didTimePassMillis && !z2) || !z3) {
                    return;
                }
            }
            tVar.f7250d = location;
            tVar.f7251e = java.lang.System.currentTimeMillis();
            java.util.Iterator it2 = tVar.f7249c.iterator();
            while (it2.hasNext()) {
                ((io.appmetrica.analytics.coreapi.internal.backport.Consumer) it2.next()).consume(location);
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(java.lang.String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(java.lang.String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(java.lang.String str, int i2, android.os.Bundle bundle) {
    }
}
