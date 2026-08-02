package com.datadog.trace.util;

/* loaded from: classes3.dex */
public final class PidHelper {
    private static final com.datadog.trace.logger.Logger Camera2StreamConfigurationMap = com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.util.PidHelper.class);
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap();
    private static final long getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();

    public static java.lang.String getPid() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static long getPidAsLong() {
        return getHighSpeedVideoFpsRanges;
    }

    private static java.lang.String Camera2StreamConfigurationMap() {
        java.lang.String trim;
        if (com.datadog.trace.api.Platform.isJavaVersionAtLeast(9)) {
            try {
                trim = com.datadog.trace.util.Strings.trim((java.lang.String) ((com.datadog.android.trace.internal.compat.function.Supplier) java.lang.Class.forName("com.datadog.trace.util.JDK9PidSupplier").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0])).get());
            } catch (java.lang.Throwable th) {
                Camera2StreamConfigurationMap.debug("JDK9PidSupplier not available", th);
            }
            trim.isEmpty();
            return trim;
        }
        trim = "";
        trim.isEmpty();
        return trim;
    }

    private static long getHighSpeedVideoFpsRanges() {
        java.lang.String str = getHighSpeedVideoFpsRangesFor;
        if (str.isEmpty()) {
            return 0L;
        }
        try {
            return java.lang.Long.parseLong(str);
        } catch (java.lang.NumberFormatException e) {
            Camera2StreamConfigurationMap.warn("Cannot parse PID {} as number. Default to 0", getHighSpeedVideoFpsRangesFor, e);
            return 0L;
        }
    }
}
