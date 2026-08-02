package androidx.media3.common.util;

/* loaded from: classes7.dex */
public final class Log {
    private static boolean Camera2StreamConfigurationMap = true;
    public static final int LOG_LEVEL_ALL = 0;
    public static final int LOG_LEVEL_ERROR = 3;
    public static final int LOG_LEVEL_INFO = 1;
    public static final int LOG_LEVEL_OFF = Integer.MAX_VALUE;
    public static final int LOG_LEVEL_WARNING = 2;
    private static final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();
    private static androidx.media3.common.util.Log.Logger getHighSpeedVideoFpsRangesFor = androidx.media3.common.util.Log.Logger.DEFAULT;
    private static int getHighSpeedVideoSizes;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface LogLevel {
    }

    public interface Logger {
        public static final androidx.media3.common.util.Log.Logger DEFAULT = new androidx.media3.common.util.Log.Logger() { // from class: androidx.media3.common.util.Log.Logger.1
            @Override // androidx.media3.common.util.Log.Logger
            public void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
                androidx.media3.common.util.Log.appendThrowableString(str2, th);
            }

            @Override // androidx.media3.common.util.Log.Logger
            public void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
                androidx.media3.common.util.Log.appendThrowableString(str2, th);
            }

            @Override // androidx.media3.common.util.Log.Logger
            public void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
                androidx.media3.common.util.Log.appendThrowableString(str2, th);
            }

            @Override // androidx.media3.common.util.Log.Logger
            public void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
                androidx.media3.common.util.Log.appendThrowableString(str2, th);
            }
        };

        void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th);

        void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th);

        void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th);

        void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th);
    }

    private Log() {
    }

    @org.checkerframework.dataflow.qual.Pure
    public static int getLogLevel() {
        int i;
        synchronized (getHighSpeedVideoFpsRanges) {
            i = getHighSpeedVideoSizes;
        }
        return i;
    }

    public static void setLogLevel(int i) {
        synchronized (getHighSpeedVideoFpsRanges) {
            getHighSpeedVideoSizes = i;
        }
    }

    public static void setLogStackTraces(boolean z) {
        synchronized (getHighSpeedVideoFpsRanges) {
            Camera2StreamConfigurationMap = z;
        }
    }

    public static void setLogger(androidx.media3.common.util.Log.Logger logger) {
        synchronized (getHighSpeedVideoFpsRanges) {
            getHighSpeedVideoFpsRangesFor = logger;
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void d(java.lang.String str, java.lang.String str2) {
        synchronized (getHighSpeedVideoFpsRanges) {
            if (getHighSpeedVideoSizes == 0) {
                getHighSpeedVideoFpsRangesFor.d(str, str2, null);
            }
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        synchronized (getHighSpeedVideoFpsRanges) {
            if (getHighSpeedVideoSizes == 0) {
                getHighSpeedVideoFpsRangesFor.d(str, str2, th);
            }
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void i(java.lang.String str, java.lang.String str2) {
        synchronized (getHighSpeedVideoFpsRanges) {
            if (getHighSpeedVideoSizes <= 1) {
                getHighSpeedVideoFpsRangesFor.i(str, str2, null);
            }
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        synchronized (getHighSpeedVideoFpsRanges) {
            if (getHighSpeedVideoSizes <= 1) {
                getHighSpeedVideoFpsRangesFor.i(str, str2, th);
            }
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void w(java.lang.String str, java.lang.String str2) {
        synchronized (getHighSpeedVideoFpsRanges) {
            if (getHighSpeedVideoSizes <= 2) {
                getHighSpeedVideoFpsRangesFor.w(str, str2, null);
            }
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        synchronized (getHighSpeedVideoFpsRanges) {
            if (getHighSpeedVideoSizes <= 2) {
                getHighSpeedVideoFpsRangesFor.w(str, str2, th);
            }
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void e(java.lang.String str, java.lang.String str2) {
        synchronized (getHighSpeedVideoFpsRanges) {
            if (getHighSpeedVideoSizes <= 3) {
                getHighSpeedVideoFpsRangesFor.e(str, str2, null);
            }
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        synchronized (getHighSpeedVideoFpsRanges) {
            if (getHighSpeedVideoSizes <= 3) {
                getHighSpeedVideoFpsRangesFor.e(str, str2, th);
            }
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static java.lang.String getThrowableString(java.lang.Throwable th) {
        if (th == null) {
            return null;
        }
        synchronized (getHighSpeedVideoFpsRanges) {
            for (java.lang.Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                try {
                    if (th2 instanceof java.net.UnknownHostException) {
                        return "UnknownHostException (no network)";
                    }
                } catch (java.lang.Throwable th3) {
                    throw th3;
                }
            }
            if (!Camera2StreamConfigurationMap) {
                return th.getMessage();
            }
            return android.util.Log.getStackTraceString(th).trim().replace("\t", "    ");
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static java.lang.String appendThrowableString(java.lang.String str, java.lang.Throwable th) {
        java.lang.String throwableString = getThrowableString(th);
        if (android.text.TextUtils.isEmpty(throwableString)) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("\n  ");
        sb.append(throwableString.replace(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, "\n  "));
        sb.append('\n');
        return sb.toString();
    }
}
