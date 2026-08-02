package androidx.core.app;

/* loaded from: classes7.dex */
public final class ServiceCompat {
    public static final int START_STICKY = 1;
    public static final int STOP_FOREGROUND_DETACH = 2;
    public static final int STOP_FOREGROUND_REMOVE = 1;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface StopForegroundFlags {
    }

    private ServiceCompat() {
    }

    public static void startForeground(android.app.Service service, int i, android.app.Notification notification, int i2) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.core.app.ServiceCompat.Api34Impl.getHighSpeedVideoSizes(service, i, notification, i2);
        } else if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.app.ServiceCompat.Api29Impl.Camera2StreamConfigurationMap(service, i, notification, i2);
        } else {
            service.startForeground(i, notification);
        }
    }

    public static void stopForeground(android.app.Service service, int i) {
        androidx.core.app.ServiceCompat.Api24Impl.getHighSpeedVideoFpsRangesFor(service, i);
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static void getHighSpeedVideoFpsRangesFor(android.app.Service service, int i) {
            service.stopForeground(i);
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void Camera2StreamConfigurationMap(android.app.Service service, int i, android.app.Notification notification, int i2) {
            if (i2 == 0 || i2 == -1) {
                service.startForeground(i, notification, i2);
            } else {
                service.startForeground(i, notification, i2 & 255);
            }
        }
    }

    static class Api34Impl {
        private Api34Impl() {
        }

        static void getHighSpeedVideoSizes(android.app.Service service, int i, android.app.Notification notification, int i2) {
            if (i2 == 0 || i2 == -1) {
                service.startForeground(i, notification, i2);
            } else {
                service.startForeground(i, notification, i2 & 1073745919);
            }
        }
    }
}
