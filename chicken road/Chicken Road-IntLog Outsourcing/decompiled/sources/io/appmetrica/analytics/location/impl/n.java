package io.appmetrica.analytics.location.impl;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n implements LocationListener {

    /* renamed from: a, reason: collision with root package name */
    public final p f9722a;

    public n(p pVar) {
        this.f9722a = pVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (location != null) {
            p pVar = this.f9722a;
            pVar.getClass();
            String provider = location.getProvider();
            t tVar = (t) pVar.f9728e.get(provider);
            if (tVar == null) {
                t tVar2 = new t(pVar.f9724a.f9701a);
                tVar2.f9735c.add(pVar.f9726c);
                Iterator it = pVar.f9727d.iterator();
                while (it.hasNext()) {
                    tVar2.f9735c.add((Consumer) it.next());
                }
                pVar.f9728e.put(provider, tVar2);
                tVar = tVar2;
            } else {
                tVar.f9733a = pVar.f9724a.f9701a;
            }
            if (tVar.f9736d != null) {
                boolean didTimePassMillis = tVar.f9734b.didTimePassMillis(tVar.f9737e, tVar.f9733a.getUpdateTimeInterval(), "isSavedLocationOutdated");
                boolean z = location.distanceTo(tVar.f9736d) > tVar.f9733a.getUpdateDistanceInterval();
                boolean z5 = tVar.f9736d == null || location.getTime() - tVar.f9736d.getTime() >= 0;
                if ((!didTimePassMillis && !z) || !z5) {
                    return;
                }
            }
            tVar.f9736d = location;
            tVar.f9737e = System.currentTimeMillis();
            Iterator it2 = tVar.f9735c.iterator();
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
    public final void onStatusChanged(String str, int i2, Bundle bundle) {
    }
}
