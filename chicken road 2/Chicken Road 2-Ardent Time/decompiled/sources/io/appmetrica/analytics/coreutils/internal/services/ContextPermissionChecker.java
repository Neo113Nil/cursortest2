package io.appmetrica.analytics.coreutils.internal.services;

/* loaded from: classes.dex */
public final class ContextPermissionChecker {
    public static final io.appmetrica.analytics.coreutils.internal.services.ContextPermissionChecker INSTANCE = new io.appmetrica.analytics.coreutils.internal.services.ContextPermissionChecker();

    private ContextPermissionChecker() {
    }

    public static final boolean hasPermission(android.content.Context context, java.lang.String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }
}
