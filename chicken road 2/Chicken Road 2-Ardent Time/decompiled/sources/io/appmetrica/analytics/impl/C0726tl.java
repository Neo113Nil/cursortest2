package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.tl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0726tl implements io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor {

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f6862b = "[SimplePermissionExtractor]";

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy f6863a;

    public C0726tl(io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy permissionStrategy) {
        this.f6863a = permissionStrategy;
    }

    public final io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy a() {
        return this.f6863a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor
    public final boolean hasPermission(android.content.Context context, java.lang.String str) {
        if (this.f6863a.forbidUsePermission(str)) {
            return false;
        }
        return io.appmetrica.analytics.coreutils.internal.services.ContextPermissionChecker.hasPermission(context, str);
    }
}
