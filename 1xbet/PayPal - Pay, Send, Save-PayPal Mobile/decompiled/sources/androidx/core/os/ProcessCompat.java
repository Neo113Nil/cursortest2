package androidx.core.os;

/* loaded from: classes7.dex */
public final class ProcessCompat {
    private ProcessCompat() {
    }

    public static boolean isApplicationUid(int i) {
        return androidx.core.os.ProcessCompat.Api24Impl.Camera2StreamConfigurationMap(i);
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static boolean Camera2StreamConfigurationMap(int i) {
            return android.os.Process.isApplicationUid(i);
        }
    }

    static class Api19Impl {
        private static final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();

        private Api19Impl() {
        }
    }
}
