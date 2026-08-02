package com.iovation.mobile.android.c;

/* loaded from: classes9.dex */
public final class a implements android.location.LocationListener, android.location.OnNmeaMessageListener {

    /* renamed from: a, reason: collision with root package name */
    public final com.iovation.mobile.android.b.p f3939a;
    public final com.iovation.mobile.android.b.q b;

    public a(com.iovation.mobile.android.b.p pVar, com.iovation.mobile.android.b.q qVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qVar, "");
        this.f3939a = pVar;
        this.b = qVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(android.location.Location location) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(location, "");
        this.f3939a.invoke(location);
    }

    @Override // android.location.OnNmeaMessageListener
    public final void onNmeaMessage(java.lang.String str, long j) {
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
