package io.appmetrica.analytics.coreutils.internal.permission;

/* loaded from: classes.dex */
public final class SinglePermissionStrategy implements io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor f3756a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f3757b;

    public SinglePermissionStrategy(io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor permissionExtractor, java.lang.String str) {
        this.f3756a = permissionExtractor;
        this.f3757b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy
    public boolean hasNecessaryPermissions(android.content.Context context) {
        return this.f3756a.hasPermission(context, this.f3757b);
    }
}
