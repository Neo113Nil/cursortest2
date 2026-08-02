package androidx.core.os;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public final class TraceCompat {
    private static java.lang.reflect.Method Camera2StreamConfigurationMap;
    private static java.lang.reflect.Method getHighResolutionOutputSizeshNQ4ISI;
    private static java.lang.reflect.Method getHighSpeedVideoFpsRanges;
    private static java.lang.reflect.Method getHighSpeedVideoFpsRangesFor;
    private static long getHighSpeedVideoSizes;

    static {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            try {
                getHighSpeedVideoSizes = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                getHighResolutionOutputSizeshNQ4ISI = android.os.Trace.class.getMethod("isTagEnabled", java.lang.Long.TYPE);
                Camera2StreamConfigurationMap = android.os.Trace.class.getMethod("asyncTraceBegin", java.lang.Long.TYPE, java.lang.String.class, java.lang.Integer.TYPE);
                getHighSpeedVideoFpsRanges = android.os.Trace.class.getMethod("asyncTraceEnd", java.lang.Long.TYPE, java.lang.String.class, java.lang.Integer.TYPE);
                getHighSpeedVideoFpsRangesFor = android.os.Trace.class.getMethod("traceCounter", java.lang.Long.TYPE, java.lang.String.class, java.lang.Integer.TYPE);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static boolean isEnabled() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.core.os.TraceCompat.Api29Impl.getHighSpeedVideoSizes();
        }
        try {
            return ((java.lang.Boolean) getHighResolutionOutputSizeshNQ4ISI.invoke(null, java.lang.Long.valueOf(getHighSpeedVideoSizes))).booleanValue();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static void beginSection(java.lang.String str) {
        android.os.Trace.beginSection(str);
    }

    public static void endSection() {
        android.os.Trace.endSection();
    }

    public static void beginAsyncSection(java.lang.String str, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.os.TraceCompat.Api29Impl.getHighSpeedVideoFpsRangesFor(str, i);
        } else {
            try {
                Camera2StreamConfigurationMap.invoke(null, java.lang.Long.valueOf(getHighSpeedVideoSizes), str, java.lang.Integer.valueOf(i));
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static void endAsyncSection(java.lang.String str, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.os.TraceCompat.Api29Impl.getHighSpeedVideoFpsRanges(str, i);
        } else {
            try {
                getHighSpeedVideoFpsRanges.invoke(null, java.lang.Long.valueOf(getHighSpeedVideoSizes), str, java.lang.Integer.valueOf(i));
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static void setCounter(java.lang.String str, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.os.TraceCompat.Api29Impl.getHighSpeedVideoFpsRanges(str, i);
        } else {
            try {
                getHighSpeedVideoFpsRangesFor.invoke(null, java.lang.Long.valueOf(getHighSpeedVideoSizes), str, java.lang.Integer.valueOf(i));
            } catch (java.lang.Exception unused) {
            }
        }
    }

    private TraceCompat() {
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static boolean getHighSpeedVideoSizes() {
            return android.os.Trace.isEnabled();
        }

        static void getHighSpeedVideoFpsRanges(java.lang.String str, int i) {
            android.os.Trace.endAsyncSection(str, i);
        }

        static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i) {
            android.os.Trace.beginAsyncSection(str, i);
        }

        static void getHighSpeedVideoFpsRanges(java.lang.String str, long j) {
            android.os.Trace.setCounter(str, j);
        }
    }
}
