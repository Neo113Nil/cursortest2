package org.chromium.net.impl;

/* loaded from: classes5.dex */
public final class CronetLoggerFactory {
    private static org.chromium.net.impl.CronetLogger getHighSpeedVideoFpsRanges;

    private CronetLoggerFactory() {
    }

    public static org.chromium.net.impl.CronetLogger createLogger(android.content.Context context, org.chromium.net.impl.CronetLogger.CronetSource cronetSource) {
        org.chromium.net.impl.CronetLogger cronetLogger;
        synchronized (org.chromium.net.impl.CronetLoggerFactory.class) {
            if (getHighSpeedVideoFpsRanges == null && android.os.Build.VERSION.SDK_INT >= 30 && org.chromium.net.impl.CronetManifest.isAppOptedInForTelemetry(context, cronetSource)) {
                try {
                    getHighSpeedVideoFpsRanges = new org.chromium.net.telemetry.CronetLoggerImpl(1);
                } catch (java.lang.Exception unused) {
                }
            }
            if (getHighSpeedVideoFpsRanges == null) {
                getHighSpeedVideoFpsRanges = new org.chromium.net.impl.NoOpLogger();
            }
            cronetLogger = getHighSpeedVideoFpsRanges;
        }
        return cronetLogger;
    }

    /* loaded from: classes18.dex */
    public static final class SwapLoggerForTesting implements java.lang.AutoCloseable {
        public SwapLoggerForTesting(org.chromium.net.impl.CronetLogger cronetLogger) {
            org.chromium.net.impl.CronetLoggerFactory.Camera2StreamConfigurationMap(cronetLogger);
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            org.chromium.net.impl.CronetLoggerFactory.Camera2StreamConfigurationMap(null);
        }
    }

    static /* bridge */ /* synthetic */ void Camera2StreamConfigurationMap(org.chromium.net.impl.CronetLogger cronetLogger) {
        synchronized (org.chromium.net.impl.CronetLoggerFactory.class) {
            getHighSpeedVideoFpsRanges = cronetLogger;
        }
    }
}
