package androidx.core.app;

/* loaded from: classes.dex */
public final class ServiceCompat {
    private static final int FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_Q = 255;
    private static final int FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_U = 1073745919;
    public static final int START_STICKY = 1;
    public static final int STOP_FOREGROUND_DETACH = 2;
    public static final int STOP_FOREGROUND_REMOVE = 1;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface StopForegroundFlags {
    }

    private ServiceCompat() {
    }

    public static void startForeground(android.app.Service service, int i, android.app.Notification notification, int i2) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.core.app.ServiceCompat.Api34Impl.startForeground(service, i, notification, i2);
        } else if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.app.ServiceCompat.Api29Impl.startForeground(service, i, notification, i2);
        } else {
            service.startForeground(i, notification);
        }
    }

    public static void stopForeground(android.app.Service service, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            androidx.core.app.ServiceCompat.Api24Impl.stopForeground(service, i);
        } else {
            service.stopForeground((i & 1) != 0);
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static void stopForeground(android.app.Service service, int i) {
            service.stopForeground(i);
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void startForeground(android.app.Service service, int i, android.app.Notification notification, int i2) {
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

        static void startForeground(android.app.Service service, int i, android.app.Notification notification, int i2) {
            if (i2 == 0 || i2 == -1) {
                service.startForeground(i, notification, i2);
            } else {
                service.startForeground(i, notification, i2 & androidx.core.app.ServiceCompat.FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_U);
            }
        }
    }
}
