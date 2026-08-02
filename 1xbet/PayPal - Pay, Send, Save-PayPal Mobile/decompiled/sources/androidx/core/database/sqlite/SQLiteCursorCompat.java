package androidx.core.database.sqlite;

/* loaded from: classes7.dex */
public final class SQLiteCursorCompat {
    private SQLiteCursorCompat() {
    }

    public static void setFillWindowForwardOnly(android.database.sqlite.SQLiteCursor sQLiteCursor, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.core.database.sqlite.SQLiteCursorCompat.Api28Impl.getHighResolutionOutputSizeshNQ4ISI(sQLiteCursor, z);
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.database.sqlite.SQLiteCursor sQLiteCursor, boolean z) {
            sQLiteCursor.setFillWindowForwardOnly(z);
        }
    }
}
