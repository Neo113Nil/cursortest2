package io.appmetrica.analytics.coreutils.internal.permission;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;

/* loaded from: classes.dex */
public final class SinglePermissionStrategy implements PermissionResolutionStrategy {

    /* renamed from: a, reason: collision with root package name */
    private final PermissionExtractor f5439a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5440b;

    public SinglePermissionStrategy(PermissionExtractor permissionExtractor, String str) {
        this.f5439a = permissionExtractor;
        this.f5440b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy
    public boolean hasNecessaryPermissions(Context context) {
        return this.f5439a.hasPermission(context, this.f5440b);
    }
}
