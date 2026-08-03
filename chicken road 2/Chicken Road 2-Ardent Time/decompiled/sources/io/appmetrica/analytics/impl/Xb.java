package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Xb implements io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5299a = "Location receiver stub";

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    public final java.lang.String getIdentifier() {
        return this.f5299a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider
    public final io.appmetrica.analytics.locationapi.internal.LocationReceiver getLocationReceiver(android.content.Context context, io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor permissionExtractor, io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor iHandlerExecutor, android.location.LocationListener locationListener) {
        return new io.appmetrica.analytics.impl.Yb();
    }
}
