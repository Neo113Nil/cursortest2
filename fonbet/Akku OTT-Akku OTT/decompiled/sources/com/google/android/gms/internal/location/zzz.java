package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.AbstractC0927f;
import com.google.android.gms.location.C0929h;
import com.google.android.gms.location.InterfaceC0928g;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;

@VisibleForTesting
/* loaded from: classes4.dex */
public final class zzz {
    public final i<Status> flushLocations(h hVar) {
        return hVar.b(new zzq(this, hVar));
    }

    public final Location getLastLocation(h hVar) {
        a<a.d.c> aVar = C0929h.a;
        C0875q.b(hVar != null, "GoogleApiClient parameter is required.");
        hVar.getClass();
        throw new UnsupportedOperationException();
    }

    public final LocationAvailability getLocationAvailability(h hVar) {
        a<a.d.c> aVar = C0929h.a;
        C0875q.b(hVar != null, "GoogleApiClient parameter is required.");
        hVar.getClass();
        throw new UnsupportedOperationException();
    }

    public final i<Status> removeLocationUpdates(h hVar, PendingIntent pendingIntent) {
        return hVar.b(new zzw(this, hVar, pendingIntent));
    }

    public final i<Status> requestLocationUpdates(h hVar, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return hVar.b(new zzu(this, hVar, locationRequest, pendingIntent));
    }

    public final i<Status> setMockLocation(h hVar, Location location) {
        return hVar.b(new zzp(this, hVar, location));
    }

    public final i<Status> setMockMode(h hVar, boolean z) {
        return hVar.b(new zzo(this, hVar, z));
    }

    public final i<Status> removeLocationUpdates(h hVar, AbstractC0927f abstractC0927f) {
        return hVar.b(new zzn(this, hVar, abstractC0927f));
    }

    public final i<Status> requestLocationUpdates(h hVar, LocationRequest locationRequest, AbstractC0927f abstractC0927f, Looper looper) {
        return hVar.b(new zzt(this, hVar, locationRequest, abstractC0927f, looper));
    }

    public final i<Status> removeLocationUpdates(h hVar, InterfaceC0928g interfaceC0928g) {
        return hVar.b(new zzv(this, hVar, interfaceC0928g));
    }

    public final i<Status> requestLocationUpdates(h hVar, LocationRequest locationRequest, InterfaceC0928g interfaceC0928g) {
        C0875q.h(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
        return hVar.b(new zzr(this, hVar, locationRequest, interfaceC0928g));
    }

    public final i<Status> requestLocationUpdates(h hVar, LocationRequest locationRequest, InterfaceC0928g interfaceC0928g, Looper looper) {
        return hVar.b(new zzs(this, hVar, locationRequest, interfaceC0928g, looper));
    }
}
