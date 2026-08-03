package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.vb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0768vb implements io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider {
    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider
    public final io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor getExtractor(android.content.Context context, io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor permissionExtractor, io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor iHandlerExecutor, android.location.LocationListener locationListener) {
        return new io.appmetrica.analytics.impl.C0794wb();
    }

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    public final java.lang.String getIdentifier() {
        return "Last known extractor stub";
    }
}
