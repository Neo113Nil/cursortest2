package io.appmetrica.analytics.location.impl;

/* loaded from: classes.dex */
public final class v implements io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7256a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.location.impl.s f7257b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f7258c;

    public v(java.lang.String str, io.appmetrica.analytics.location.impl.s sVar, java.lang.String str2) {
        this.f7256a = str;
        this.f7257b = sVar;
        this.f7258c = str2;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.location.impl.u getExtractor(android.content.Context context, io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor permissionExtractor, io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor iHandlerExecutor, android.location.LocationListener locationListener) {
        return new io.appmetrica.analytics.location.impl.u(context, this.f7257b.a(permissionExtractor), locationListener, this.f7256a);
    }

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    public final java.lang.String getIdentifier() {
        return this.f7258c;
    }
}
