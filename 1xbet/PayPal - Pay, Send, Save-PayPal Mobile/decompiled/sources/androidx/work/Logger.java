package androidx.work;

/* loaded from: classes.dex */
public abstract class Logger {
    private static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
    private static volatile androidx.work.Logger getHighSpeedVideoFpsRangesFor = null;
    private static final int getHighSpeedVideoSizes = 20;

    public abstract void debug(java.lang.String str, java.lang.String str2);

    public abstract void debug(java.lang.String str, java.lang.String str2, java.lang.Throwable th);

    public abstract void error(java.lang.String str, java.lang.String str2);

    public abstract void error(java.lang.String str, java.lang.String str2, java.lang.Throwable th);

    public abstract void info(java.lang.String str, java.lang.String str2);

    public abstract void info(java.lang.String str, java.lang.String str2, java.lang.Throwable th);

    public abstract void verbose(java.lang.String str, java.lang.String str2);

    public abstract void verbose(java.lang.String str, java.lang.String str2, java.lang.Throwable th);

    public abstract void warning(java.lang.String str, java.lang.String str2);

    public abstract void warning(java.lang.String str, java.lang.String str2, java.lang.Throwable th);

    public static void setLogger(androidx.work.Logger logger) {
        synchronized (getHighResolutionOutputSizeshNQ4ISI) {
            if (getHighSpeedVideoFpsRangesFor == null) {
                getHighSpeedVideoFpsRangesFor = logger;
            }
        }
    }

    public static java.lang.String tagWithPrefix(java.lang.String str) {
        int length = str.length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(23);
        sb.append("WM-");
        int i = getHighSpeedVideoSizes;
        if (length >= i) {
            sb.append(str.substring(0, i));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public static androidx.work.Logger get() {
        androidx.work.Logger logger;
        synchronized (getHighResolutionOutputSizeshNQ4ISI) {
            if (getHighSpeedVideoFpsRangesFor == null) {
                getHighSpeedVideoFpsRangesFor = new androidx.work.Logger.LogcatLogger(3);
            }
            logger = getHighSpeedVideoFpsRangesFor;
        }
        return logger;
    }

    public Logger(int i) {
    }

    /* loaded from: classes3.dex */
    public static class LogcatLogger extends androidx.work.Logger {
        private final int Camera2StreamConfigurationMap;

        @Override // androidx.work.Logger
        public void debug(java.lang.String str, java.lang.String str2) {
        }

        @Override // androidx.work.Logger
        public void debug(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        }

        @Override // androidx.work.Logger
        public void error(java.lang.String str, java.lang.String str2) {
        }

        @Override // androidx.work.Logger
        public void error(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        }

        @Override // androidx.work.Logger
        public void info(java.lang.String str, java.lang.String str2) {
        }

        @Override // androidx.work.Logger
        public void info(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        }

        @Override // androidx.work.Logger
        public void verbose(java.lang.String str, java.lang.String str2) {
        }

        @Override // androidx.work.Logger
        public void verbose(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        }

        @Override // androidx.work.Logger
        public void warning(java.lang.String str, java.lang.String str2) {
        }

        @Override // androidx.work.Logger
        public void warning(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        }

        public LogcatLogger(int i) {
            super(i);
            this.Camera2StreamConfigurationMap = i;
        }
    }
}
