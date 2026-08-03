package io.appmetrica.analytics.coreutils.internal.permission;

/* loaded from: classes.dex */
public abstract class MultiplePermissionBaseStrategy implements io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor f3754a;

    /* renamed from: b, reason: collision with root package name */
    private final java.util.List f3755b;

    public MultiplePermissionBaseStrategy(io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor permissionExtractor, java.util.List<java.lang.String> list) {
        this.f3754a = permissionExtractor;
        this.f3755b = list;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy
    public boolean hasNecessaryPermissions(android.content.Context context) {
        return this.f3755b.isEmpty() || hasNecessaryPermissions(context, this.f3754a, this.f3755b);
    }

    public abstract boolean hasNecessaryPermissions(android.content.Context context, io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor permissionExtractor, java.util.List<java.lang.String> list);
}
