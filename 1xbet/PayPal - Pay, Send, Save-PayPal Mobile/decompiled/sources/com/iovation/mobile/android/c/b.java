package com.iovation.mobile.android.c;

/* loaded from: classes9.dex */
public final class b implements android.location.LocationListener, android.location.GpsStatus.NmeaListener {

    /* renamed from: a, reason: collision with root package name */
    public final com.iovation.mobile.android.b.r f3940a;
    public final com.iovation.mobile.android.b.s b;

    public b(com.iovation.mobile.android.b.r rVar, com.iovation.mobile.android.b.s sVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sVar, "");
        this.f3940a = rVar;
        this.b = sVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(android.location.Location location) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(location, "");
        this.f3940a.invoke(location);
    }

    @Override // android.location.GpsStatus.NmeaListener
    public final void onNmeaReceived(long j, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.b.invoke();
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(java.lang.String str, int i, android.os.Bundle bundle) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }
}
