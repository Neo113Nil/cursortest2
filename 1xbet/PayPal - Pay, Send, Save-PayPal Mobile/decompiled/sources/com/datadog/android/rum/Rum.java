package com.datadog.android.rum;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\r"}, d2 = {"Lcom/datadog/android/rum/Rum;", "", "<init>", "()V", "Lcom/datadog/android/rum/RumConfiguration;", "rumConfiguration", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "", "enable", "(Lcom/datadog/android/rum/RumConfiguration;Lcom/datadog/android/api/SdkCore;)V", "", "INVALID_APPLICATION_ID_ERROR_MESSAGE", "Ljava/lang/String;", "RUM_FEATURE_ALREADY_ENABLED", "UNEXPECTED_SDK_CORE_TYPE"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Rum {
    public static final com.datadog.android.rum.Rum INSTANCE = new com.datadog.android.rum.Rum();
    public static final java.lang.String INVALID_APPLICATION_ID_ERROR_MESSAGE = "You're trying to create a RumMonitor instance, but the RUM application id was empty. No RUM data will be sent.";
    public static final java.lang.String RUM_FEATURE_ALREADY_ENABLED = "RUM Feature is already enabled in this SDK core, ignoring the call to enable it.";
    public static final java.lang.String UNEXPECTED_SDK_CORE_TYPE = "SDK instance provided doesn't implement InternalSdkCore.";

    private Rum() {
    }

    public static /* synthetic */ void enable$default(com.datadog.android.rum.RumConfiguration rumConfiguration, com.datadog.android.api.SdkCore sdkCore, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            sdkCore = com.datadog.android.Datadog.getInstance$default(null, 1, null);
        }
        enable(rumConfiguration, sdkCore);
    }

    @kotlin.jvm.JvmStatic
    public static final void enable(com.datadog.android.rum.RumConfiguration rumConfiguration, com.datadog.android.api.SdkCore sdkCore) {
        com.datadog.android.api.storage.datastore.DataStoreHandler dataStore;
        com.datadog.android.api.InternalLogger unbound;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        if (!(sdkCore instanceof com.datadog.android.core.InternalSdkCore)) {
            com.datadog.android.api.feature.FeatureSdkCore featureSdkCore = sdkCore instanceof com.datadog.android.api.feature.FeatureSdkCore ? (com.datadog.android.api.feature.FeatureSdkCore) sdkCore : null;
            if (featureSdkCore == null || (unbound = featureSdkCore.getInternalLogger()) == null) {
                unbound = com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND();
            }
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(unbound, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.Rum$enable$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.rum.Rum.UNEXPECTED_SDK_CORE_TYPE;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return;
        }
        if (kotlin.text.StringsKt.isBlank(rumConfiguration.getApplicationId$dd_sdk_android_rum_release())) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(((com.datadog.android.core.InternalSdkCore) sdkCore).getInternalLogger(), com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.Rum$enable$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.rum.Rum.INVALID_APPLICATION_ID_ERROR_MESSAGE;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return;
        }
        final com.datadog.android.core.InternalSdkCore internalSdkCore = (com.datadog.android.core.InternalSdkCore) sdkCore;
        if (internalSdkCore.getFeature("rum") != null) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalSdkCore.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.Rum$enable$3
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.rum.Rum.RUM_FEATURE_ALREADY_ENABLED;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return;
        }
        com.datadog.android.api.feature.FeatureSdkCore featureSdkCore2 = (com.datadog.android.api.feature.FeatureSdkCore) sdkCore;
        com.datadog.android.rum.internal.RumFeature rumFeature = new com.datadog.android.rum.internal.RumFeature(featureSdkCore2, rumConfiguration.getApplicationId$dd_sdk_android_rum_release(), rumConfiguration.getFeatureConfiguration$dd_sdk_android_rum_release(), null, null, 24, null);
        internalSdkCore.registerFeature(rumFeature);
        com.datadog.android.api.feature.FeatureScope feature = internalSdkCore.getFeature(rumFeature.getName());
        if (feature != null && (dataStore = feature.getDataStore()) != null) {
            new com.datadog.android.rum.internal.RumAnonymousIdentifierManager(dataStore, featureSdkCore2).manageAnonymousId(rumConfiguration.getFeatureConfiguration$dd_sdk_android_rum_release().getTrackAnonymousUser());
        }
        com.datadog.android.rum.internal.metric.SessionEndedMetricDispatcher sessionEndedMetricDispatcher = new com.datadog.android.rum.internal.metric.SessionEndedMetricDispatcher(internalSdkCore.getInternalLogger(), rumFeature.getConfiguration().getSampleRate());
        final com.datadog.android.rum.internal.domain.scope.RumVitalAppLaunchEventHelper rumVitalAppLaunchEventHelper = new com.datadog.android.rum.internal.domain.scope.RumVitalAppLaunchEventHelper(rumFeature.getConfiguration().getRumSessionTypeOverride(), rumFeature.getBatteryInfoProvider$dd_sdk_android_rum_release(), rumFeature.getDisplayInfoProvider$dd_sdk_android_rum_release(), rumFeature.getSampleRate(), internalSdkCore.getInternalLogger());
        final com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporter create = com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporter.INSTANCE.create(internalSdkCore);
        com.datadog.android.rum.internal.metric.SessionEndedMetricDispatcher sessionEndedMetricDispatcher2 = sessionEndedMetricDispatcher;
        com.datadog.android.rum.internal.monitor.DatadogRumMonitor datadogRumMonitor = new com.datadog.android.rum.internal.monitor.DatadogRumMonitor(rumFeature.getApplicationId(), internalSdkCore, new com.datadog.android.core.sampling.DeterministicSampler((kotlin.jvm.functions.Function1) new com.datadog.android.rum.Rum$createMonitor$sessionSampler$1(com.datadog.android.rum.internal.sampling.SessionSamplingIdProvider.INSTANCE), rumFeature.getSampleRate()), rumFeature.getBackgroundEventTracking(), rumFeature.getTrackFrustrations(), rumFeature.getDataWriter$dd_sdk_android_rum_release(), new android.os.Handler(android.os.Looper.getMainLooper()), new com.datadog.android.telemetry.internal.TelemetryEventHandler(internalSdkCore, new com.datadog.android.core.sampling.RateBasedSampler(rumFeature.getTelemetrySampleRate()), new com.datadog.android.core.sampling.RateBasedSampler(rumFeature.getTelemetryConfigurationSampleRate()), sessionEndedMetricDispatcher2, 0, 16, null), sessionEndedMetricDispatcher2, internalSdkCore.getFirstPartyHostResolver(), rumFeature.getCpuVitalMonitor(), rumFeature.getMemoryVitalMonitor(), rumFeature.getFrameRateVitalMonitor(), rumFeature.getSessionListener(), internalSdkCore.createSingleThreadExecutorService("rum-pipeline"), rumFeature.getInitialResourceIdentifier(), rumFeature.getLastInteractionIdentifier(), rumFeature.getSlowFramesListener(), rumFeature.getConfiguration().getRumSessionTypeOverride(), rumFeature.getAccessibilitySnapshotManager(), rumFeature.getBatteryInfoProvider$dd_sdk_android_rum_release(), rumFeature.getDisplayInfoProvider$dd_sdk_android_rum_release(), new kotlin.jvm.functions.Function0<com.datadog.android.rum.internal.startup.RumSessionScopeStartupManager>() { // from class: com.datadog.android.rum.Rum$createMonitor$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final com.datadog.android.rum.internal.startup.RumSessionScopeStartupManager invoke() {
                return com.datadog.android.rum.internal.startup.RumSessionScopeStartupManager.INSTANCE.create(com.datadog.android.rum.internal.domain.scope.RumVitalAppLaunchEventHelper.this, internalSdkCore, create);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, rumFeature.getInsightsCollector());
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            rumFeature.consumeLastFatalAnr$dd_sdk_android_rum_release(datadogRumMonitor.getExecutorService());
        }
        com.datadog.android.rum.GlobalRumMonitor.INSTANCE.registerIfAbsent$dd_sdk_android_rum_release(datadogRumMonitor, sdkCore);
        datadogRumMonitor.start();
    }

    @kotlin.jvm.JvmStatic
    public static final void enable(com.datadog.android.rum.RumConfiguration rumConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumConfiguration, "");
        enable$default(rumConfiguration, null, 2, null);
    }
}
