package io.appmetrica.analytics.coreutils.internal.permission;

import android.content.Context;
import e2.AbstractC0290e;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class AllOfPermissionStrategy extends MultiplePermissionBaseStrategy {
    public AllOfPermissionStrategy(PermissionExtractor permissionExtractor, String... strArr) {
        super(permissionExtractor, AbstractC0290e.Z(strArr));
    }

    @Override // io.appmetrica.analytics.coreutils.internal.permission.MultiplePermissionBaseStrategy
    public boolean hasNecessaryPermissions(Context context, PermissionExtractor permissionExtractor, List<String> list) {
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!permissionExtractor.hasPermission(context, (String) it.next())) {
                return false;
            }
        }
        return true;
    }
}
