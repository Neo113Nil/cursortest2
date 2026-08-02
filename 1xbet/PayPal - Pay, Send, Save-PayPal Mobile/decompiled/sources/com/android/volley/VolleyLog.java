package com.android.volley;

/* loaded from: classes3.dex */
public class VolleyLog {
    public static java.lang.String TAG = "Volley";
    public static boolean DEBUG = android.util.Log.isLoggable("Volley", 2);
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = com.android.volley.VolleyLog.class.getName();

    public static void setTag(java.lang.String str) {
        d("Changing log tag to %s", str);
        TAG = str;
        DEBUG = android.util.Log.isLoggable(str, 2);
    }

    public static void v(java.lang.String str, java.lang.Object... objArr) {
        if (DEBUG) {
            getHighResolutionOutputSizeshNQ4ISI(str, objArr);
        }
    }

    public static void d(java.lang.String str, java.lang.Object... objArr) {
        getHighResolutionOutputSizeshNQ4ISI(str, objArr);
    }

    public static void e(java.lang.String str, java.lang.Object... objArr) {
        getHighResolutionOutputSizeshNQ4ISI(str, objArr);
    }

    public static void e(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        getHighResolutionOutputSizeshNQ4ISI(str, objArr);
    }

    public static void wtf(java.lang.String str, java.lang.Object... objArr) {
        android.util.Log.wtf(TAG, getHighResolutionOutputSizeshNQ4ISI(str, objArr));
    }

    public static void wtf(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        android.util.Log.wtf(TAG, getHighResolutionOutputSizeshNQ4ISI(str, objArr), th);
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.Object... objArr) {
        java.lang.String str2;
        if (objArr != null) {
            str = java.lang.String.format(java.util.Locale.US, str, objArr);
        }
        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = androidx.camera.core.CameraInfo.IMPLEMENTATION_TYPE_UNKNOWN;
                break;
            }
            if (!stackTrace[i].getClassName().equals(getHighSpeedVideoFpsRangesFor)) {
                java.lang.String className = stackTrace[i].getClassName();
                java.lang.String substring = className.substring(className.lastIndexOf(46) + 1);
                java.lang.String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(substring2);
                sb.append(".");
                sb.append(stackTrace[i].getMethodName());
                str2 = sb.toString();
                break;
            }
            i++;
        }
        return java.lang.String.format(java.util.Locale.US, "[%d] %s: %s", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), str2, str);
    }

    static class MarkerLog {
        public static final boolean getHighResolutionOutputSizeshNQ4ISI = com.android.volley.VolleyLog.DEBUG;
        private final java.util.List<com.android.volley.VolleyLog.MarkerLog.Marker> Camera2StreamConfigurationMap = new java.util.ArrayList();
        private boolean getHighSpeedVideoFpsRanges = false;

        MarkerLog() {
        }

        static class Marker {
            public final long Camera2StreamConfigurationMap;
            public final java.lang.String getHighSpeedVideoFpsRangesFor;
            public final long getHighSpeedVideoSizes;

            public Marker(java.lang.String str, long j, long j2) {
                this.getHighSpeedVideoFpsRangesFor = str;
                this.Camera2StreamConfigurationMap = j;
                this.getHighSpeedVideoSizes = j2;
            }
        }

        public final void getHighSpeedVideoFpsRanges(java.lang.String str, long j) {
            synchronized (this) {
                if (this.getHighSpeedVideoFpsRanges) {
                    throw new java.lang.IllegalStateException("Marker added to finished log");
                }
                this.Camera2StreamConfigurationMap.add(new com.android.volley.VolleyLog.MarkerLog.Marker(str, j, android.os.SystemClock.elapsedRealtime()));
            }
        }

        public final void Camera2StreamConfigurationMap(java.lang.String str) {
            synchronized (this) {
                this.getHighSpeedVideoFpsRanges = true;
                long highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
                if (highResolutionOutputSizeshNQ4ISI <= 0) {
                    return;
                }
                long j = this.Camera2StreamConfigurationMap.get(0).getHighSpeedVideoSizes;
                com.android.volley.VolleyLog.d("(%-4d ms) %s", java.lang.Long.valueOf(highResolutionOutputSizeshNQ4ISI), str);
                for (com.android.volley.VolleyLog.MarkerLog.Marker marker : this.Camera2StreamConfigurationMap) {
                    long j2 = marker.getHighSpeedVideoSizes;
                    com.android.volley.VolleyLog.d("(+%-4d) [%2d] %s", java.lang.Long.valueOf(j2 - j), java.lang.Long.valueOf(marker.Camera2StreamConfigurationMap), marker.getHighSpeedVideoFpsRangesFor);
                    j = j2;
                }
            }
        }

        protected void finalize() throws java.lang.Throwable {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            Camera2StreamConfigurationMap("Request on the loose");
            com.android.volley.VolleyLog.e("Marker log finalized without finish() - uncaught exit point for request", new java.lang.Object[0]);
        }

        private long getHighResolutionOutputSizeshNQ4ISI() {
            if (this.Camera2StreamConfigurationMap.size() == 0) {
                return 0L;
            }
            return this.Camera2StreamConfigurationMap.get(r2.size() - 1).getHighSpeedVideoSizes - this.Camera2StreamConfigurationMap.get(0).getHighSpeedVideoSizes;
        }
    }
}
