package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Yn {
    public static boolean a(android.content.Context context) {
        return ((java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils.accessSystemServiceSafelyOrDefault((android.os.UserManager) context.getSystemService(android.os.UserManager.class), "detect unlocked user state", "User manager", java.lang.Boolean.TRUE, new io.appmetrica.analytics.impl.Xn())).booleanValue();
    }
}
