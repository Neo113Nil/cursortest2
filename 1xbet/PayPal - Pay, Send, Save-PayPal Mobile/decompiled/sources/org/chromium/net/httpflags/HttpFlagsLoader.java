package org.chromium.net.httpflags;

/* loaded from: classes18.dex */
public final class HttpFlagsLoader {
    private static java.lang.String Camera2StreamConfigurationMap = null;
    public static final java.lang.String LOG_FLAG_NAME = "Cronet_log_me";
    public static final java.lang.String TAG = "HttpFlagsLoader";
    private static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
    private static org.chromium.net.httpflags.ResolvedFlags getHighSpeedVideoSizes;

    private HttpFlagsLoader() {
    }

    public static org.chromium.net.httpflags.Flags load(android.content.Context context) {
        try {
            android.content.pm.ApplicationInfo Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(context);
            if (Camera2StreamConfigurationMap2 == null) {
                return null;
            }
            new java.lang.Object[]{Camera2StreamConfigurationMap2.packageName};
            java.io.File file = new java.io.File(new java.io.File(new java.io.File(Camera2StreamConfigurationMap2.deviceProtectedDataDir), "app_httpflags"), "flags.binarypb");
            new java.lang.Object[]{file.getAbsolutePath()};
            org.chromium.net.httpflags.Flags highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(file);
            if (highSpeedVideoFpsRangesFor == null) {
                return null;
            }
            new java.lang.Object[]{highSpeedVideoFpsRangesFor};
            return highSpeedVideoFpsRangesFor;
        } catch (java.lang.RuntimeException unused) {
            return null;
        }
    }

    public static void flushHttpFlags() {
        getHighSpeedVideoSizes = null;
        Camera2StreamConfigurationMap = null;
    }

    public static org.chromium.net.httpflags.ResolvedFlags getHttpFlags(android.content.Context context, java.lang.String str, boolean z, boolean z2) {
        synchronized (getHighResolutionOutputSizeshNQ4ISI) {
            java.lang.String str2 = Camera2StreamConfigurationMap;
            if (str2 != null && !str.equals(str2)) {
                throw new java.lang.IllegalStateException("getHttpFlags() called multiple times with different versions");
            }
            org.chromium.net.httpflags.ResolvedFlags resolvedFlags = getHighSpeedVideoSizes;
            if (resolvedFlags != null) {
                return resolvedFlags;
            }
            Camera2StreamConfigurationMap = str;
            org.chromium.base.metrics.ScopedSysTraceEvent scoped = org.chromium.base.metrics.ScopedSysTraceEvent.scoped("HttpFlagsLoader#getHttpFlags loading flags");
            try {
                org.chromium.net.httpflags.Flags load = !org.chromium.net.impl.CronetManifest.shouldReadHttpFlags(context) ? null : load(context);
                if (load == null) {
                    load = org.chromium.net.httpflags.Flags.newBuilder().build();
                }
                org.chromium.net.httpflags.ResolvedFlags resolve = org.chromium.net.httpflags.ResolvedFlags.resolve(load, context.getPackageName(), str, z2);
                getHighSpeedVideoSizes = resolve;
                org.chromium.net.httpflags.ResolvedFlags.Value value = resolve.flags().get(LOG_FLAG_NAME);
                if (value != null) {
                    new java.lang.Object[]{z ? com.izettle.android.auth.repository.BaseUriRepositoryImpl.API_SERVICE_KEY : "Impl", value.getStringValue()};
                }
                org.chromium.net.httpflags.ResolvedFlags resolvedFlags2 = getHighSpeedVideoSizes;
                if (scoped != null) {
                    scoped.close();
                }
                return resolvedFlags2;
            } finally {
            }
        }
    }

    private static android.content.pm.ApplicationInfo Camera2StreamConfigurationMap(android.content.Context context) {
        org.chromium.base.metrics.ScopedSysTraceEvent scoped = org.chromium.base.metrics.ScopedSysTraceEvent.scoped("HttpFlagsLoader#getProviderApplicationInfo");
        try {
            android.content.pm.ResolveInfo resolveService = context.getPackageManager().resolveService(new android.content.Intent("android.net.http.FLAGS_FILE_PROVIDER"), 1048576);
            if (resolveService == null) {
                if (scoped == null) {
                    return null;
                }
                scoped.close();
                return null;
            }
            android.content.pm.ApplicationInfo applicationInfo = resolveService.serviceInfo.applicationInfo;
            if (scoped != null) {
                scoped.close();
            }
            return applicationInfo;
        } catch (java.lang.Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static org.chromium.net.httpflags.Flags getHighSpeedVideoFpsRangesFor(java.io.File file) {
        org.chromium.base.metrics.ScopedSysTraceEvent scoped = org.chromium.base.metrics.ScopedSysTraceEvent.scoped("HttpFlagsLoader#loadFlagsFile");
        try {
            try {
                try {
                    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
                    try {
                        org.chromium.net.httpflags.Flags parseDelimitedFrom = org.chromium.net.httpflags.Flags.parseDelimitedFrom(fileInputStream);
                        fileInputStream.close();
                        if (scoped != null) {
                            scoped.close();
                        }
                        return parseDelimitedFrom;
                    } catch (java.lang.Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (java.io.IOException e) {
                    throw new java.lang.RuntimeException("Unable to read HTTP flags file", e);
                }
            } catch (java.io.FileNotFoundException unused) {
                new java.lang.Object[]{file.getPath()};
                if (scoped == null) {
                    return null;
                }
                scoped.close();
                return null;
            }
        } catch (java.lang.Throwable th3) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }
}
