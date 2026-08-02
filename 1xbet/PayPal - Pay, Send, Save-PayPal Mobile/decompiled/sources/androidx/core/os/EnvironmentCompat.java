package androidx.core.os;

/* loaded from: classes7.dex */
public final class EnvironmentCompat {

    @java.lang.Deprecated
    public static final java.lang.String MEDIA_UNKNOWN = "unknown";

    public static java.lang.String getStorageState(java.io.File file) {
        return android.os.Environment.getExternalStorageState(file);
    }

    private EnvironmentCompat() {
    }
}
