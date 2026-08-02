package androidx.core.database;

/* loaded from: classes7.dex */
public final class CursorWindowCompat {
    private CursorWindowCompat() {
    }

    public static android.database.CursorWindow create(java.lang.String str, long j) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.database.CursorWindowCompat.Api28Impl.Camera2StreamConfigurationMap(str, j);
        }
        return new android.database.CursorWindow(str);
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static android.database.CursorWindow Camera2StreamConfigurationMap(java.lang.String str, long j) {
            return new android.database.CursorWindow(str, j);
        }
    }
}
