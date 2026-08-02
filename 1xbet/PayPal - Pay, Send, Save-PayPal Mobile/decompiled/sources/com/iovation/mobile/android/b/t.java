package com.iovation.mobile.android.b;

/* loaded from: classes9.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f3938a;
    public final android.location.LocationManager b;
    public com.iovation.mobile.android.b.o c;
    public int d;
    public boolean e;
    public boolean f;
    public final android.location.LocationListener g;

    public t(android.os.Handler handler, android.location.LocationManager locationManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locationManager, "");
        this.f3938a = handler;
        this.b = locationManager;
        this.c = com.iovation.mobile.android.b.l.f3935a;
        this.g = new com.iovation.mobile.android.c.a(new com.iovation.mobile.android.b.p(this), new com.iovation.mobile.android.b.q(this));
    }

    public final void a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (!com.iovation.mobile.android.d.a.a("android.permission.ACCESS_FINE_LOCATION", context) || (this.c instanceof com.iovation.mobile.android.b.n)) {
            return;
        }
        android.location.Location a2 = a(false);
        if (a2 == null || android.os.SystemClock.elapsedRealtimeNanos() - a2.getElapsedRealtimeNanos() >= kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_MINUTE) {
            this.c = com.iovation.mobile.android.b.n.f3937a;
            this.f = this.b.isProviderEnabled("network");
            this.e = this.b.isProviderEnabled("gps");
            android.location.Location lastKnownLocation = this.b.getLastKnownLocation("network");
            if (lastKnownLocation == null) {
                lastKnownLocation = this.b.getLastKnownLocation("gps");
            }
            if (lastKnownLocation != null && lastKnownLocation.getAccuracy() <= 100.0f && android.os.SystemClock.elapsedRealtimeNanos() - lastKnownLocation.getElapsedRealtimeNanos() <= kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_MINUTE) {
                this.g.onLocationChanged(lastKnownLocation);
                return;
            }
            this.d = 0;
            if (this.f) {
                try {
                    a("network");
                } catch (java.lang.Exception unused) {
                }
            }
            if (this.e) {
                try {
                    a("gps");
                } catch (java.lang.Exception unused2) {
                }
            }
            try {
                android.location.LocationManager locationManager = this.b;
                android.location.LocationListener locationListener = this.g;
                kotlin.jvm.internal.Intrinsics.checkNotNull(locationListener, "");
                locationManager.addNmeaListener((com.iovation.mobile.android.c.a) locationListener);
            } catch (java.lang.Exception unused3) {
            }
        }
    }

    public final void a() {
        if (this.c instanceof com.iovation.mobile.android.b.n) {
            this.c = com.iovation.mobile.android.b.l.f3935a;
        }
        try {
            this.b.removeUpdates(this.g);
            android.location.LocationManager locationManager = this.b;
            android.location.LocationListener locationListener = this.g;
            kotlin.jvm.internal.Intrinsics.checkNotNull(locationListener, "");
            locationManager.removeNmeaListener((com.iovation.mobile.android.c.a) locationListener);
        } catch (java.lang.Exception unused) {
        }
    }

    public final android.location.Location a(boolean z) {
        com.iovation.mobile.android.b.o oVar = this.c;
        if (oVar instanceof com.iovation.mobile.android.b.m) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(oVar, "");
            return ((com.iovation.mobile.android.b.m) oVar).f3936a;
        }
        if (!z) {
            return null;
        }
        android.location.Location lastKnownLocation = this.b.getLastKnownLocation("network");
        return lastKnownLocation == null ? this.b.getLastKnownLocation("gps") : lastKnownLocation;
    }

    public final void a(final java.lang.String str) {
        this.f3938a.post(new java.lang.Runnable() { // from class: com.iovation.mobile.android.b.t$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.iovation.mobile.android.b.t.a(com.iovation.mobile.android.b.t.this, str);
            }
        });
        this.f3938a.postDelayed(new java.lang.Runnable() { // from class: com.iovation.mobile.android.b.t$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.iovation.mobile.android.b.t.a(com.iovation.mobile.android.b.t.this);
            }
        }, 5000L);
    }

    public static final void a(com.iovation.mobile.android.b.t tVar, java.lang.String str) {
        tVar.b.requestLocationUpdates(str, 1000L, 100.0f, tVar.g);
    }

    public static final void a(com.iovation.mobile.android.b.t tVar) {
        tVar.a();
    }
}
