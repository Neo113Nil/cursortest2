package com.google.android.exoplayer2.util;

/* loaded from: classes3.dex */
public final class Log {
    public static final int LOG_LEVEL_ALL = 0;
    public static final int LOG_LEVEL_ERROR = 3;
    public static final int LOG_LEVEL_INFO = 1;
    public static final int LOG_LEVEL_OFF = Integer.MAX_VALUE;
    public static final int LOG_LEVEL_WARNING = 2;
    private static int logLevel = 0;
    private static boolean logStackTraces = true;
    private static final java.lang.Object lock = new java.lang.Object();
    private static com.google.android.exoplayer2.util.Log.Logger logger = com.google.android.exoplayer2.util.Log.Logger.DEFAULT;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface LogLevel {
    }

    public interface Logger {
        public static final com.google.android.exoplayer2.util.Log.Logger DEFAULT = new com.google.android.exoplayer2.util.Log.Logger() { // from class: com.google.android.exoplayer2.util.Log.Logger.1
            @Override // com.google.android.exoplayer2.util.Log.Logger
            public void d(java.lang.String str, java.lang.String str2) {
                android.util.Log.d(str, str2);
            }

            @Override // com.google.android.exoplayer2.util.Log.Logger
            public void i(java.lang.String str, java.lang.String str2) {
                android.util.Log.i(str, str2);
            }

            @Override // com.google.android.exoplayer2.util.Log.Logger
            public void w(java.lang.String str, java.lang.String str2) {
                android.util.Log.w(str, str2);
            }

            @Override // com.google.android.exoplayer2.util.Log.Logger
            public void e(java.lang.String str, java.lang.String str2) {
                android.util.Log.e(str, str2);
            }
        };

        void d(java.lang.String str, java.lang.String str2);

        void e(java.lang.String str, java.lang.String str2);

        void i(java.lang.String str, java.lang.String str2);

        void w(java.lang.String str, java.lang.String str2);
    }

    private Log() {
    }

    @org.checkerframework.dataflow.qual.Pure
    public static int getLogLevel() {
        int i;
        synchronized (lock) {
            i = logLevel;
        }
        return i;
    }

    public static void setLogLevel(int i) {
        synchronized (lock) {
            logLevel = i;
        }
    }

    public static void setLogStackTraces(boolean z) {
        synchronized (lock) {
            logStackTraces = z;
        }
    }

    public static void setLogger(com.google.android.exoplayer2.util.Log.Logger logger2) {
        synchronized (lock) {
            logger = logger2;
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void d(java.lang.String str, java.lang.String str2) {
        synchronized (lock) {
            if (logLevel == 0) {
                logger.d(str, str2);
            }
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        d(str, appendThrowableString(str2, th));
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void i(java.lang.String str, java.lang.String str2) {
        synchronized (lock) {
            if (logLevel <= 1) {
                logger.i(str, str2);
            }
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        i(str, appendThrowableString(str2, th));
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void w(java.lang.String str, java.lang.String str2) {
        synchronized (lock) {
            if (logLevel <= 2) {
                logger.w(str, str2);
            }
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        w(str, appendThrowableString(str2, th));
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void e(java.lang.String str, java.lang.String str2) {
        synchronized (lock) {
            if (logLevel <= 3) {
                logger.e(str, str2);
            }
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        e(str, appendThrowableString(str2, th));
    }

    @org.checkerframework.dataflow.qual.Pure
    public static java.lang.String getThrowableString(java.lang.Throwable th) {
        synchronized (lock) {
            if (th == null) {
                return null;
            }
            if (isCausedByUnknownHostException(th)) {
                return "UnknownHostException (no network)";
            }
            if (!logStackTraces) {
                return th.getMessage();
            }
            return android.util.Log.getStackTraceString(th).trim().replace("\t", "    ");
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    private static java.lang.String appendThrowableString(java.lang.String str, java.lang.Throwable th) {
        java.lang.String throwableString = getThrowableString(th);
        if (android.text.TextUtils.isEmpty(throwableString)) {
            return str;
        }
        return str + "\n  " + throwableString.replace("\n", "\n  ") + '\n';
    }

    @org.checkerframework.dataflow.qual.Pure
    private static boolean isCausedByUnknownHostException(java.lang.Throwable th) {
        while (th != null) {
            if (th instanceof java.net.UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }
}
