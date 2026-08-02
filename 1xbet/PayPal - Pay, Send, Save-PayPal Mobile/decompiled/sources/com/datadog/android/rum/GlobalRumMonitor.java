package com.datadog.android.rum;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/datadog/android/rum/GlobalRumMonitor;", "", "<init>", "()V", "", "clear$dd_sdk_android_rum_release", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Lcom/datadog/android/rum/RumMonitor;", "get", "(Lcom/datadog/android/api/SdkCore;)Lcom/datadog/android/rum/RumMonitor;", "", "isRegistered", "(Lcom/datadog/android/api/SdkCore;)Z", "monitor", "registerIfAbsent$dd_sdk_android_rum_release", "(Lcom/datadog/android/rum/RumMonitor;Lcom/datadog/android/api/SdkCore;)Z", "unregister$dd_sdk_android_rum_release", "(Lcom/datadog/android/api/SdkCore;)V", "", "NO_MONITOR_REGISTERED_MESSAGE", "Ljava/lang/String;", "", "getHighSpeedVideoSizes", "Ljava/util/Map;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GlobalRumMonitor {
    public static final java.lang.String NO_MONITOR_REGISTERED_MESSAGE = "No RumMonitor for the SDK instance with name %s found, returning no-op implementation.";
    public static final com.datadog.android.rum.GlobalRumMonitor INSTANCE = new com.datadog.android.rum.GlobalRumMonitor();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.Map<com.datadog.android.api.SdkCore, com.datadog.android.rum.RumMonitor> getHighSpeedVideoFpsRanges = new java.util.LinkedHashMap();

    private GlobalRumMonitor() {
    }

    public static /* synthetic */ boolean isRegistered$default(com.datadog.android.api.SdkCore sdkCore, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            sdkCore = com.datadog.android.Datadog.getInstance$default(null, 1, null);
        }
        return isRegistered(sdkCore);
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isRegistered(com.datadog.android.api.SdkCore sdkCore) {
        boolean containsKey;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        java.util.Map<com.datadog.android.api.SdkCore, com.datadog.android.rum.RumMonitor> map = getHighSpeedVideoFpsRanges;
        synchronized (map) {
            containsKey = map.containsKey(sdkCore);
        }
        return containsKey;
    }

    public static /* synthetic */ com.datadog.android.rum.RumMonitor get$default(com.datadog.android.api.SdkCore sdkCore, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            sdkCore = com.datadog.android.Datadog.getInstance$default(null, 1, null);
        }
        return get(sdkCore);
    }

    @kotlin.jvm.JvmStatic
    public static final com.datadog.android.rum.RumMonitor get(final com.datadog.android.api.SdkCore sdkCore) {
        com.datadog.android.rum.internal.monitor.NoOpAdvancedRumMonitor noOpAdvancedRumMonitor;
        com.datadog.android.api.InternalLogger internalLogger;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        java.util.Map<com.datadog.android.api.SdkCore, com.datadog.android.rum.RumMonitor> map = getHighSpeedVideoFpsRanges;
        synchronized (map) {
            noOpAdvancedRumMonitor = map.get(sdkCore);
            if (noOpAdvancedRumMonitor == null) {
                com.datadog.android.api.feature.FeatureSdkCore featureSdkCore = sdkCore instanceof com.datadog.android.api.feature.FeatureSdkCore ? (com.datadog.android.api.feature.FeatureSdkCore) sdkCore : null;
                if (featureSdkCore != null && (internalLogger = featureSdkCore.getInternalLogger()) != null) {
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.GlobalRumMonitor$get$1$1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.rum.GlobalRumMonitor.NO_MONITOR_REGISTERED_MESSAGE, java.util.Arrays.copyOf(new java.lang.Object[]{com.datadog.android.api.SdkCore.this.getName()}, 1));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                            return format;
                        }

                        {
                            super(0);
                        }
                    }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                }
                noOpAdvancedRumMonitor = new com.datadog.android.rum.internal.monitor.NoOpAdvancedRumMonitor();
            }
        }
        return noOpAdvancedRumMonitor;
    }

    public static /* synthetic */ boolean registerIfAbsent$dd_sdk_android_rum_release$default(com.datadog.android.rum.GlobalRumMonitor globalRumMonitor, com.datadog.android.rum.RumMonitor rumMonitor, com.datadog.android.api.SdkCore sdkCore, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            sdkCore = com.datadog.android.Datadog.getInstance$default(null, 1, null);
        }
        return globalRumMonitor.registerIfAbsent$dd_sdk_android_rum_release(rumMonitor, sdkCore);
    }

    public final boolean registerIfAbsent$dd_sdk_android_rum_release(com.datadog.android.rum.RumMonitor monitor, com.datadog.android.api.SdkCore sdkCore) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monitor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        java.util.Map<com.datadog.android.api.SdkCore, com.datadog.android.rum.RumMonitor> map = getHighSpeedVideoFpsRanges;
        synchronized (map) {
            if (map.containsKey(sdkCore)) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(((com.datadog.android.api.feature.FeatureSdkCore) sdkCore).getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.GlobalRumMonitor$registerIfAbsent$1$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return "A RumMonitor has already been registered for this SDK instance";
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                z = false;
            } else {
                map.put(sdkCore, monitor);
                z = true;
            }
        }
        return z;
    }

    public static /* synthetic */ void unregister$dd_sdk_android_rum_release$default(com.datadog.android.rum.GlobalRumMonitor globalRumMonitor, com.datadog.android.api.SdkCore sdkCore, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            sdkCore = com.datadog.android.Datadog.getInstance$default(null, 1, null);
        }
        globalRumMonitor.unregister$dd_sdk_android_rum_release(sdkCore);
    }

    public final void unregister$dd_sdk_android_rum_release(com.datadog.android.api.SdkCore sdkCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        java.util.Map<com.datadog.android.api.SdkCore, com.datadog.android.rum.RumMonitor> map = getHighSpeedVideoFpsRanges;
        synchronized (map) {
            map.remove(sdkCore);
        }
    }

    public final void clear$dd_sdk_android_rum_release() {
        java.util.Map<com.datadog.android.api.SdkCore, com.datadog.android.rum.RumMonitor> map = getHighSpeedVideoFpsRanges;
        synchronized (map) {
            map.clear();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isRegistered() {
        return isRegistered$default(null, 1, null);
    }

    @kotlin.jvm.JvmStatic
    public static final com.datadog.android.rum.RumMonitor get() {
        return get$default(null, 1, null);
    }
}
