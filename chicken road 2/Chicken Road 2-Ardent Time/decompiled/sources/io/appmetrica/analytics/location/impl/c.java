package io.appmetrica.analytics.location.impl;

/* loaded from: classes.dex */
public final class c implements io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7209a;

    public c(java.lang.String str) {
        this.f7209a = str;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider
    public final io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor getExtractor(android.content.Context context, io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor permissionExtractor, io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor iHandlerExecutor, android.location.LocationListener locationListener) {
        return new io.appmetrica.analytics.location.impl.b(context, new io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy(permissionExtractor, "android.permission.ACCESS_COARSE_LOCATION"), locationListener, iHandlerExecutor);
    }

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    public final java.lang.String getIdentifier() {
        return this.f7209a;
    }
}
