package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.po, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0626po {
    public static boolean a(java.lang.String str) {
        java.util.UUID uuid;
        if (str == null || str.length() != 32) {
            return false;
        }
        try {
            uuid = java.util.UUID.fromString(b(str));
        } catch (java.lang.Throwable unused) {
            uuid = null;
        }
        return uuid != null;
    }

    public static java.lang.String b(java.lang.String str) {
        return str.substring(0, 8) + "-" + str.substring(8, 12) + "-" + str.substring(12, 16) + "-" + str.substring(16, 20) + "-" + str.substring(20, 32);
    }
}
