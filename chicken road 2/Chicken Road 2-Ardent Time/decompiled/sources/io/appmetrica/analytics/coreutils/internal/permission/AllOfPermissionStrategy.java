package io.appmetrica.analytics.coreutils.internal.permission;

/* loaded from: classes.dex */
public final class AllOfPermissionStrategy extends io.appmetrica.analytics.coreutils.internal.permission.MultiplePermissionBaseStrategy {
    public AllOfPermissionStrategy(io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor permissionExtractor, java.lang.String... strArr) {
        super(permissionExtractor, i1.AbstractC0189h.S(strArr));
    }

    @Override // io.appmetrica.analytics.coreutils.internal.permission.MultiplePermissionBaseStrategy
    public boolean hasNecessaryPermissions(android.content.Context context, io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor permissionExtractor, java.util.List<java.lang.String> list) {
        if (list == null || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!permissionExtractor.hasPermission(context, (java.lang.String) it.next())) {
                    return false;
                }
            }
        }
        return true;
    }
}
