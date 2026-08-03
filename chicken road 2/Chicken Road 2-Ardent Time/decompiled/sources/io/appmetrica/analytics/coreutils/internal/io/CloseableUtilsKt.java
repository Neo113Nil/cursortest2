package io.appmetrica.analytics.coreutils.internal.io;

/* loaded from: classes.dex */
public final class CloseableUtilsKt {
    public static final void closeSafely(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static final void closeSafely(android.database.Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}
