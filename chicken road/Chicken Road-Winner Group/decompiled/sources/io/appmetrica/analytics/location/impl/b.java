package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;
import io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class b implements LastKnownLocationExtractor {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8727a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f8728b;

    /* renamed from: c, reason: collision with root package name */
    public final LocationListener f8729c;

    /* renamed from: d, reason: collision with root package name */
    public final IHandlerExecutor f8730d;

    /* renamed from: e, reason: collision with root package name */
    public final d f8731e = new d();

    public b(Context context, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener, IHandlerExecutor iHandlerExecutor) {
        this.f8727a = context;
        this.f8728b = permissionResolutionStrategy;
        this.f8729c = locationListener;
        this.f8730d = iHandlerExecutor;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    public final void updateLastKnownLocation() {
        IGplLibraryWrapper gplLibraryWrapper;
        if (this.f8728b.hasNecessaryPermissions(this.f8727a)) {
            try {
                d dVar = this.f8731e;
                Context context = this.f8727a;
                LocationListener locationListener = this.f8729c;
                IHandlerExecutor iHandlerExecutor = this.f8730d;
                dVar.getClass();
                if (ReflectionUtils.detectClassExists("com.google.android.gms.location.LocationRequest")) {
                    try {
                        gplLibraryWrapper = new GplLibraryWrapper(context, locationListener, iHandlerExecutor.getLooper(), iHandlerExecutor, TimeUnit.SECONDS.toMillis(1L));
                    } catch (Throwable unused) {
                    }
                    gplLibraryWrapper.updateLastKnownLocation();
                }
                gplLibraryWrapper = new a();
                gplLibraryWrapper.updateLastKnownLocation();
            } catch (Throwable unused2) {
            }
        }
    }
}
