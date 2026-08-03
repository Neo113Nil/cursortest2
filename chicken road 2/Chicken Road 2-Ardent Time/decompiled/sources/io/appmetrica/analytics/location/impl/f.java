package io.appmetrica.analytics.location.impl;

/* loaded from: classes.dex */
public final class f implements io.appmetrica.analytics.location.impl.s {
    @Override // io.appmetrica.analytics.location.impl.s
    public final io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy a(io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor permissionExtractor) {
        return new io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy(permissionExtractor, "android.permission.ACCESS_COARSE_LOCATION");
    }
}
