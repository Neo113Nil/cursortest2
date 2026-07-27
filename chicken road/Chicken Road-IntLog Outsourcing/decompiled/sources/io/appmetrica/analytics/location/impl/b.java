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
    public final Context f9690a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f9691b;

    /* renamed from: c, reason: collision with root package name */
    public final LocationListener f9692c;

    /* renamed from: d, reason: collision with root package name */
    public final IHandlerExecutor f9693d;

    /* renamed from: e, reason: collision with root package name */
    public final d f9694e = new d();

    public b(Context context, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener, IHandlerExecutor iHandlerExecutor) {
        this.f9690a = context;
        this.f9691b = permissionResolutionStrategy;
        this.f9692c = locationListener;
        this.f9693d = iHandlerExecutor;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    public final void updateLastKnownLocation() {
        IGplLibraryWrapper gplLibraryWrapper;
        if (this.f9691b.hasNecessaryPermissions(this.f9690a)) {
            try {
                d dVar = this.f9694e;
                Context context = this.f9690a;
                LocationListener locationListener = this.f9692c;
                IHandlerExecutor iHandlerExecutor = this.f9693d;
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
