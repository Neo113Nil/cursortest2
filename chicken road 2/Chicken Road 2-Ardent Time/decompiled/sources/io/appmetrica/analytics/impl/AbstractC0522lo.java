package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.lo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0522lo {
    public static boolean a(java.lang.Object obj) {
        return obj != null;
    }

    public static void a(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static void a(android.database.Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public static boolean a(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static boolean a(java.util.Map map) {
        return map == null || map.size() == 0;
    }

    public static boolean a(java.util.Collection collection) {
        return collection == null || collection.size() == 0;
    }

    public static java.math.BigDecimal a(long j2) {
        return new java.math.BigDecimal(j2).divide(new java.math.BigDecimal(1000000), 6, 6);
    }

    public static double a(double d2) {
        return (java.lang.Double.isNaN(d2) || java.lang.Double.isInfinite(d2)) ? com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE : d2;
    }
}
