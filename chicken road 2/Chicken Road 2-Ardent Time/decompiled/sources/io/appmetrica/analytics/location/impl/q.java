package io.appmetrica.analytics.location.impl;

/* loaded from: classes.dex */
public final class q implements io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider, io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7243a = "location-passive-provider";

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.location.impl.r f7244b;

    public final io.appmetrica.analytics.location.impl.r a(android.content.Context context, io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor permissionExtractor, io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor iHandlerExecutor, android.location.LocationListener locationListener) {
        return c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }

    public final io.appmetrica.analytics.location.impl.r b(android.content.Context context, io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor permissionExtractor, io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor iHandlerExecutor, android.location.LocationListener locationListener) {
        return c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }

    public final synchronized io.appmetrica.analytics.location.impl.r c(android.content.Context context, io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor permissionExtractor, io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor iHandlerExecutor, android.location.LocationListener locationListener) {
        io.appmetrica.analytics.location.impl.r rVar;
        try {
            if (this.f7244b == null) {
                this.f7244b = new io.appmetrica.analytics.location.impl.r(context, iHandlerExecutor.getLooper(), new io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy(permissionExtractor, "android.permission.ACCESS_FINE_LOCATION"), locationListener);
            }
            rVar = this.f7244b;
            if (rVar == null) {
                kotlin.jvm.internal.i.i("passiveProviderLocationReceiver");
                throw null;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return rVar;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider
    public final io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor getExtractor(android.content.Context context, io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor permissionExtractor, io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor iHandlerExecutor, android.location.LocationListener locationListener) {
        return c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    public final java.lang.String getIdentifier() {
        return this.f7243a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider
    public final io.appmetrica.analytics.locationapi.internal.LocationReceiver getLocationReceiver(android.content.Context context, io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor permissionExtractor, io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor iHandlerExecutor, android.location.LocationListener locationListener) {
        return c(context, permissionExtractor, iHandlerExecutor, locationListener);
    }
}
