package io.appmetrica.analytics.location.impl;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n implements LocationListener {

    /* renamed from: a, reason: collision with root package name */
    public final p f8757a;

    public n(p pVar) {
        this.f8757a = pVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (location != null) {
            p pVar = this.f8757a;
            pVar.getClass();
            String provider = location.getProvider();
            t tVar = (t) pVar.f8763e.get(provider);
            if (tVar == null) {
                t tVar2 = new t(pVar.f8759a.f8738a);
                tVar2.f8769c.add(pVar.f8761c);
                Iterator it = pVar.f8762d.iterator();
                while (it.hasNext()) {
                    tVar2.f8769c.add((Consumer) it.next());
                }
                pVar.f8763e.put(provider, tVar2);
                tVar = tVar2;
            } else {
                tVar.f8767a = pVar.f8759a.f8738a;
            }
            if (tVar.f8770d != null) {
                boolean didTimePassMillis = tVar.f8768b.didTimePassMillis(tVar.f8771e, tVar.f8767a.getUpdateTimeInterval(), "isSavedLocationOutdated");
                boolean z3 = location.distanceTo(tVar.f8770d) > tVar.f8767a.getUpdateDistanceInterval();
                boolean z4 = tVar.f8770d == null || location.getTime() - tVar.f8770d.getTime() >= 0;
                if ((!didTimePassMillis && !z3) || !z4) {
                    return;
                }
            }
            tVar.f8770d = location;
            tVar.f8771e = System.currentTimeMillis();
            Iterator it2 = tVar.f8769c.iterator();
            while (it2.hasNext()) {
                ((Consumer) it2.next()).consume(location);
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i3, Bundle bundle) {
    }
}
