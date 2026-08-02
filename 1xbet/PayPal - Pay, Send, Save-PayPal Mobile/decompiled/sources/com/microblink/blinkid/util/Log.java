package com.microblink.blinkid.util;

/* loaded from: classes.dex */
public class Log {
    private static int getHighSpeedVideoFpsRangesFor = com.microblink.blinkid.util.Log.LogLevel.LOG_WARNINGS_AND_ERRORS.ordinal();
    private static com.microblink.blinkid.util.Log.LogWriter Camera2StreamConfigurationMap = null;

    /* loaded from: classes10.dex */
    public enum LogLevel {
        LOG_QUIET,
        LOG_WARNINGS_AND_ERRORS,
        LOG_INFORMATION,
        LOG_DEBUG,
        LOG_VERBOSE
    }

    /* loaded from: classes10.dex */
    public interface LogWriter {
        void writeLog(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Throwable th);
    }

    public static void d(java.lang.Object obj, java.lang.String str, java.lang.Object... objArr) {
        if (getHighSpeedVideoFpsRangesFor >= com.microblink.blinkid.util.Log.LogLevel.LOG_DEBUG.ordinal()) {
            java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(obj);
            java.lang.String highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(str, objArr);
            com.microblink.blinkid.util.Log.LogWriter logWriter = Camera2StreamConfigurationMap;
            if (logWriter != null) {
                logWriter.writeLog("[D]", highSpeedVideoFpsRanges, highSpeedVideoFpsRanges2, null);
            }
        }
    }

    public static void e(java.lang.Object obj, java.lang.String str, java.lang.Object... objArr) {
        if (getHighSpeedVideoFpsRangesFor >= com.microblink.blinkid.util.Log.LogLevel.LOG_WARNINGS_AND_ERRORS.ordinal()) {
            java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(obj);
            java.lang.String highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(str, objArr);
            com.microblink.blinkid.util.Log.LogWriter logWriter = Camera2StreamConfigurationMap;
            if (logWriter != null) {
                logWriter.writeLog("[E]", highSpeedVideoFpsRanges, highSpeedVideoFpsRanges2, null);
            }
        }
    }

    public static com.microblink.blinkid.util.Log.LogLevel getCurrentLogLevel() {
        return com.microblink.blinkid.util.Log.LogLevel.values()[getHighSpeedVideoFpsRangesFor];
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.Object[] objArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String[] split = str.split("(?<!\\\\)\\{\\}", -1);
        int i = 0;
        int i2 = 0;
        while (i < split.length) {
            int i3 = i + 1;
            sb.append(split[i]);
            if (i3 < split.length) {
                if (i2 >= objArr.length) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("missing parameter for log message '");
                    sb2.append(str);
                    sb2.append("'");
                    throw new java.lang.RuntimeException(sb2.toString());
                }
                sb.append(objArr[i2]);
                i2++;
            }
            i = i3;
        }
        return sb.toString();
    }

    public static int getLineNumber() {
        if (java.lang.Thread.currentThread().getStackTrace().length > 5) {
            return java.lang.Thread.currentThread().getStackTrace()[5].getLineNumber();
        }
        return -1;
    }

    public static com.microblink.blinkid.util.Log.LogWriter getLogWriter() {
        return Camera2StreamConfigurationMap;
    }

    public static java.lang.String getThreadName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("@");
        sb.append(java.lang.Thread.currentThread().getName());
        return sb.toString();
    }

    public static void i(java.lang.Object obj, java.lang.String str, java.lang.Object... objArr) {
        if (getHighSpeedVideoFpsRangesFor >= com.microblink.blinkid.util.Log.LogLevel.LOG_INFORMATION.ordinal()) {
            java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(obj);
            java.lang.String highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(str, objArr);
            com.microblink.blinkid.util.Log.LogWriter logWriter = Camera2StreamConfigurationMap;
            if (logWriter != null) {
                logWriter.writeLog("[I]", highSpeedVideoFpsRanges, highSpeedVideoFpsRanges2, null);
            }
        }
    }

    public static void setLogLevel(com.microblink.blinkid.util.Log.LogLevel logLevel) {
        getHighSpeedVideoFpsRangesFor = logLevel.ordinal();
    }

    public static void setLogWriter(com.microblink.blinkid.util.Log.LogWriter logWriter) {
        Camera2StreamConfigurationMap = logWriter;
    }

    public static void v(java.lang.Object obj, java.lang.String str, java.lang.Object... objArr) {
        if (getHighSpeedVideoFpsRangesFor >= com.microblink.blinkid.util.Log.LogLevel.LOG_VERBOSE.ordinal()) {
            java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(obj);
            java.lang.String highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(str, objArr);
            com.microblink.blinkid.util.Log.LogWriter logWriter = Camera2StreamConfigurationMap;
            if (logWriter != null) {
                logWriter.writeLog("[V]", highSpeedVideoFpsRanges, highSpeedVideoFpsRanges2, null);
            }
        }
    }

    public static void w(java.lang.Object obj, java.lang.String str, java.lang.Object... objArr) {
        if (getHighSpeedVideoFpsRangesFor >= com.microblink.blinkid.util.Log.LogLevel.LOG_WARNINGS_AND_ERRORS.ordinal()) {
            java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(obj);
            java.lang.String highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(str, objArr);
            com.microblink.blinkid.util.Log.LogWriter logWriter = Camera2StreamConfigurationMap;
            if (logWriter != null) {
                logWriter.writeLog("[W]", highSpeedVideoFpsRanges, highSpeedVideoFpsRanges2, null);
            }
        }
    }

    public static void wtf(java.lang.Object obj, java.lang.String str, java.lang.Object... objArr) {
        if (getHighSpeedVideoFpsRangesFor >= com.microblink.blinkid.util.Log.LogLevel.LOG_WARNINGS_AND_ERRORS.ordinal()) {
            java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(obj);
            java.lang.String highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(str, objArr);
            android.util.Log.wtf(highSpeedVideoFpsRanges, highSpeedVideoFpsRanges2);
            com.microblink.blinkid.util.Log.LogWriter logWriter = Camera2StreamConfigurationMap;
            if (logWriter != null) {
                logWriter.writeLog("[WTF]", highSpeedVideoFpsRanges, highSpeedVideoFpsRanges2, null);
            }
        }
    }

    public static void d(java.lang.Object obj, java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        if (getHighSpeedVideoFpsRangesFor >= com.microblink.blinkid.util.Log.LogLevel.LOG_DEBUG.ordinal()) {
            java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(obj);
            java.lang.String highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(str, objArr);
            com.microblink.blinkid.util.Log.LogWriter logWriter = Camera2StreamConfigurationMap;
            if (logWriter != null) {
                logWriter.writeLog("[D]", highSpeedVideoFpsRanges, highSpeedVideoFpsRanges2, th);
            }
        }
    }

    public static void e(java.lang.Object obj, java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        if (getHighSpeedVideoFpsRangesFor >= com.microblink.blinkid.util.Log.LogLevel.LOG_WARNINGS_AND_ERRORS.ordinal()) {
            java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(obj);
            java.lang.String highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(str, objArr);
            com.microblink.blinkid.util.Log.LogWriter logWriter = Camera2StreamConfigurationMap;
            if (logWriter != null) {
                logWriter.writeLog("[E]", highSpeedVideoFpsRanges, highSpeedVideoFpsRanges2, th);
            }
        }
    }

    public static void i(java.lang.Object obj, java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        if (getHighSpeedVideoFpsRangesFor >= com.microblink.blinkid.util.Log.LogLevel.LOG_INFORMATION.ordinal()) {
            java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(obj);
            java.lang.String highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(str, objArr);
            com.microblink.blinkid.util.Log.LogWriter logWriter = Camera2StreamConfigurationMap;
            if (logWriter != null) {
                logWriter.writeLog("[I]", highSpeedVideoFpsRanges, highSpeedVideoFpsRanges2, th);
            }
        }
    }

    public static void v(java.lang.Object obj, java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        if (getHighSpeedVideoFpsRangesFor >= com.microblink.blinkid.util.Log.LogLevel.LOG_VERBOSE.ordinal()) {
            java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(obj);
            java.lang.String highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(str, objArr);
            com.microblink.blinkid.util.Log.LogWriter logWriter = Camera2StreamConfigurationMap;
            if (logWriter != null) {
                logWriter.writeLog("[V]", highSpeedVideoFpsRanges, highSpeedVideoFpsRanges2, th);
            }
        }
    }

    public static void w(java.lang.Object obj, java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        if (getHighSpeedVideoFpsRangesFor >= com.microblink.blinkid.util.Log.LogLevel.LOG_WARNINGS_AND_ERRORS.ordinal()) {
            java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(obj);
            java.lang.String highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(str, objArr);
            com.microblink.blinkid.util.Log.LogWriter logWriter = Camera2StreamConfigurationMap;
            if (logWriter != null) {
                logWriter.writeLog("[W]", highSpeedVideoFpsRanges, highSpeedVideoFpsRanges2, th);
            }
        }
    }

    public static void wtf(java.lang.Object obj, java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        if (getHighSpeedVideoFpsRangesFor >= com.microblink.blinkid.util.Log.LogLevel.LOG_WARNINGS_AND_ERRORS.ordinal()) {
            java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(obj);
            java.lang.String highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(str, objArr);
            android.util.Log.wtf(highSpeedVideoFpsRanges, highSpeedVideoFpsRanges2, th);
            com.microblink.blinkid.util.Log.LogWriter logWriter = Camera2StreamConfigurationMap;
            if (logWriter != null) {
                logWriter.writeLog("[WTF]", highSpeedVideoFpsRanges, highSpeedVideoFpsRanges2, th);
            }
        }
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.Object obj) {
        java.lang.String concat;
        if (obj == null) {
            concat = "";
        } else if (obj instanceof java.lang.String) {
            concat = (java.lang.String) obj;
        } else if (obj instanceof java.lang.Class) {
            concat = ((java.lang.Class) obj).getSimpleName().concat(".java");
        } else {
            concat = obj.getClass().getSimpleName().concat(".java");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(concat);
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb.append(getLineNumber());
        sb.append(getThreadName());
        return sb.toString();
    }
}
