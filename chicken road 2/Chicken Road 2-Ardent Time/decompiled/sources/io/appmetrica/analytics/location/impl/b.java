package io.appmetrica.analytics.location.impl;

/* loaded from: classes.dex */
public final class b implements io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7204a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy f7205b;

    /* renamed from: c, reason: collision with root package name */
    public final android.location.LocationListener f7206c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor f7207d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.location.impl.d f7208e = new io.appmetrica.analytics.location.impl.d();

    public b(android.content.Context context, io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy permissionResolutionStrategy, android.location.LocationListener locationListener, io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor iHandlerExecutor) {
        this.f7204a = context;
        this.f7205b = permissionResolutionStrategy;
        this.f7206c = locationListener;
        this.f7207d = iHandlerExecutor;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    public final void updateLastKnownLocation() {
        io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper gplLibraryWrapper;
        if (this.f7205b.hasNecessaryPermissions(this.f7204a)) {
            try {
                io.appmetrica.analytics.location.impl.d dVar = this.f7208e;
                android.content.Context context = this.f7204a;
                android.location.LocationListener locationListener = this.f7206c;
                io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor iHandlerExecutor = this.f7207d;
                dVar.getClass();
                if (io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils.detectClassExists("com.google.android.gms.location.LocationRequest")) {
                    try {
                        gplLibraryWrapper = new io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper(context, locationListener, iHandlerExecutor.getLooper(), iHandlerExecutor, java.util.concurrent.TimeUnit.SECONDS.toMillis(1L));
                    } catch (java.lang.Throwable unused) {
                    }
                    gplLibraryWrapper.updateLastKnownLocation();
                }
                gplLibraryWrapper = new io.appmetrica.analytics.location.impl.a();
                gplLibraryWrapper.updateLastKnownLocation();
            } catch (java.lang.Throwable unused2) {
            }
        }
    }
}
