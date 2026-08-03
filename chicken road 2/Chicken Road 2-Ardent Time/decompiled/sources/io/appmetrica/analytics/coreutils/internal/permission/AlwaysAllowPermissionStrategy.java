package io.appmetrica.analytics.coreutils.internal.permission;

/* loaded from: classes.dex */
public final class AlwaysAllowPermissionStrategy implements io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy {
    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy
    public boolean hasNecessaryPermissions(android.content.Context context) {
        return true;
    }
}
