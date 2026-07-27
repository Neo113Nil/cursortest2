package io.appmetrica.analytics.coreutils.internal.permission;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;

/* loaded from: classes.dex */
public final class SinglePermissionStrategy implements PermissionResolutionStrategy {

    /* renamed from: a, reason: collision with root package name */
    private final PermissionExtractor f6259a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6260b;

    public SinglePermissionStrategy(PermissionExtractor permissionExtractor, String str) {
        this.f6259a = permissionExtractor;
        this.f6260b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy
    public boolean hasNecessaryPermissions(Context context) {
        return this.f6259a.hasPermission(context, this.f6260b);
    }
}
