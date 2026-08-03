package io.appmetrica.analytics.locationapi.internal;

/* loaded from: classes.dex */
public interface LastKnownLocationExtractorProvider extends io.appmetrica.analytics.locationapi.internal.Identifiable {
    io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor getExtractor(android.content.Context context, io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor permissionExtractor, io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor iHandlerExecutor, android.location.LocationListener locationListener);
}
