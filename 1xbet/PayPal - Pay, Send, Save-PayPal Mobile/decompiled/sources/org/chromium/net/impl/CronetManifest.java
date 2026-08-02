package org.chromium.net.impl;

/* loaded from: classes5.dex */
public final class CronetManifest {
    public static final java.lang.String ENABLE_TELEMETRY_META_DATA_KEY = "android.net.http.EnableTelemetry";
    public static final java.lang.String READ_HTTP_FLAGS_META_DATA_KEY = "android.net.http.ReadHttpFlags";
    public static final java.lang.String USE_PERFETTO_META_DATA_KEY = "android.net.http.UsePerfetto";
    private static android.os.Bundle getHighSpeedVideoFpsRanges;
    private static final java.lang.Object getHighSpeedVideoFpsRangesFor = new java.lang.Object();
    private static android.content.Context getHighSpeedVideoSizes;

    private CronetManifest() {
    }

    public static boolean isAppOptedInForTelemetry(android.content.Context context, org.chromium.net.impl.CronetLogger.CronetSource cronetSource) {
        return Camera2StreamConfigurationMap(context).getBoolean(ENABLE_TELEMETRY_META_DATA_KEY, cronetSource == org.chromium.net.impl.CronetLogger.CronetSource.CRONET_SOURCE_PLATFORM || cronetSource == org.chromium.net.impl.CronetLogger.CronetSource.CRONET_SOURCE_PLAY_SERVICES);
    }

    public static boolean isAppOptedInForTelemetry(android.content.Context context) {
        boolean z = false;
        try {
            java.lang.Class.forName("org.chromium.net.impl.NativeCronetEngineBuilderImpl", false, org.chromium.net.impl.CronetManifest.class.getClassLoader());
            z = true;
        } catch (java.lang.ClassNotFoundException unused) {
        }
        return Camera2StreamConfigurationMap(context).getBoolean(ENABLE_TELEMETRY_META_DATA_KEY, true ^ z);
    }

    public static boolean shouldReadHttpFlags(android.content.Context context) {
        return Camera2StreamConfigurationMap(context).getBoolean(READ_HTTP_FLAGS_META_DATA_KEY, true);
    }

    public static boolean shouldUsePerfetto(android.content.Context context) {
        return Camera2StreamConfigurationMap(context).getBoolean(USE_PERFETTO_META_DATA_KEY, true);
    }

    private static android.os.Bundle Camera2StreamConfigurationMap(android.content.Context context) {
        android.os.Bundle bundle;
        android.content.pm.ServiceInfo serviceInfo;
        android.os.Bundle bundle2;
        android.content.Context applicationContext = context.getApplicationContext();
        synchronized (getHighSpeedVideoFpsRangesFor) {
            if (applicationContext != getHighSpeedVideoSizes) {
                org.chromium.base.metrics.ScopedSysTraceEvent scoped = org.chromium.base.metrics.ScopedSysTraceEvent.scoped("CronetManifest#getMetaData fetching info");
                try {
                    try {
                        serviceInfo = applicationContext.getPackageManager().getServiceInfo(new android.content.ComponentName(applicationContext, "android.net.http.MetaDataHolder"), 787072);
                    } finally {
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.NullPointerException unused) {
                    serviceInfo = null;
                }
                if (serviceInfo != null && serviceInfo.metaData != null) {
                    bundle2 = serviceInfo.metaData;
                } else {
                    bundle2 = new android.os.Bundle();
                }
                getHighSpeedVideoFpsRanges = bundle2;
                getHighSpeedVideoSizes = applicationContext;
                if (scoped != null) {
                    scoped.close();
                }
            }
            bundle = getHighSpeedVideoFpsRanges;
        }
        return bundle;
    }

    public static void resetCache() {
        getHighSpeedVideoFpsRanges = null;
        getHighSpeedVideoSizes = null;
    }
}
