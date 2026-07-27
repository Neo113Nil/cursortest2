package io.appmetrica.analytics.coreutils.internal.permission;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import java.util.List;

/* loaded from: classes.dex */
public abstract class MultiplePermissionBaseStrategy implements PermissionResolutionStrategy {

    /* renamed from: a, reason: collision with root package name */
    private final PermissionExtractor f5437a;

    /* renamed from: b, reason: collision with root package name */
    private final List f5438b;

    public MultiplePermissionBaseStrategy(PermissionExtractor permissionExtractor, List<String> list) {
        this.f5437a = permissionExtractor;
        this.f5438b = list;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy
    public boolean hasNecessaryPermissions(Context context) {
        return this.f5438b.isEmpty() || hasNecessaryPermissions(context, this.f5437a, this.f5438b);
    }

    public abstract boolean hasNecessaryPermissions(Context context, PermissionExtractor permissionExtractor, List<String> list);
}
