package com.datadog.android;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\u00020\u000f8\u0007¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/datadog/android/_InternalProxy;", "", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "<init>", "(Lcom/datadog/android/api/SdkCore;)V", "", "version", "", "setCustomAppVersion", "(Ljava/lang/String;)V", "", "sampleRate", "setMetricTelemetrySampleRateBypass", "(F)V", "Lcom/datadog/android/_InternalProxy$_TelemetryProxy;", "_telemetry", "Lcom/datadog/android/_InternalProxy$_TelemetryProxy;", "get_telemetry", "()Lcom/datadog/android/_InternalProxy$_TelemetryProxy;", "get_telemetry$annotations", "()V", "Camera2StreamConfigurationMap", "Lcom/datadog/android/api/SdkCore;", "getHighResolutionOutputSizeshNQ4ISI", "Companion", "_TelemetryProxy"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class _InternalProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android._InternalProxy.Companion INSTANCE = new com.datadog.android._InternalProxy.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.api.SdkCore getHighResolutionOutputSizeshNQ4ISI;
    private final com.datadog.android._InternalProxy._TelemetryProxy _telemetry;

    public static /* synthetic */ void get_telemetry$annotations() {
    }

    public _InternalProxy(com.datadog.android.api.SdkCore sdkCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        this.getHighResolutionOutputSizeshNQ4ISI = sdkCore;
        this._telemetry = new com.datadog.android._InternalProxy._TelemetryProxy(sdkCore);
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\r\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/datadog/android/_InternalProxy$_TelemetryProxy;", "", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "<init>", "(Lcom/datadog/android/api/SdkCore;)V", "", "message", "", com.datadog.android.rum.internal.domain.event.RumEventDeserializer.TELEMETRY_TYPE_DEBUG, "(Ljava/lang/String;)V", com.datadog.android.trace.api.DatadogTracingConstants.LogAttributes.STACK, "kind", "error", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Lcom/datadog/android/api/feature/FeatureScope;", "getHighResolutionOutputSizeshNQ4ISI", "()Lcom/datadog/android/api/feature/FeatureScope;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/api/SdkCore;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class _TelemetryProxy {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final com.datadog.android.api.SdkCore getHighSpeedVideoFpsRangesFor;

        public _TelemetryProxy(com.datadog.android.api.SdkCore sdkCore) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
            this.getHighSpeedVideoFpsRangesFor = sdkCore;
        }

        private final com.datadog.android.api.feature.FeatureScope getHighResolutionOutputSizeshNQ4ISI() {
            com.datadog.android.api.SdkCore sdkCore = this.getHighSpeedVideoFpsRangesFor;
            com.datadog.android.api.feature.FeatureSdkCore featureSdkCore = sdkCore instanceof com.datadog.android.api.feature.FeatureSdkCore ? (com.datadog.android.api.feature.FeatureSdkCore) sdkCore : null;
            if (featureSdkCore != null) {
                return featureSdkCore.getFeature("rum");
            }
            return null;
        }

        public final void debug(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log.Debug debug = new com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log.Debug(message, null);
            com.datadog.android.api.feature.FeatureScope highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            if (highResolutionOutputSizeshNQ4ISI != null) {
                highResolutionOutputSizeshNQ4ISI.sendEvent(debug);
            }
        }

        public static /* synthetic */ void error$default(com.datadog.android._InternalProxy._TelemetryProxy _telemetryproxy, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                th = null;
            }
            _telemetryproxy.error(str, th);
        }

        public final void error(java.lang.String message, java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log.Error error = new com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log.Error(message, null, throwable, null, null, 26, null);
            com.datadog.android.api.feature.FeatureScope highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            if (highResolutionOutputSizeshNQ4ISI != null) {
                highResolutionOutputSizeshNQ4ISI.sendEvent(error);
            }
        }

        public final void error(java.lang.String message, java.lang.String stack, java.lang.String kind) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log.Error error = new com.datadog.android.internal.telemetry.InternalTelemetryEvent.Log.Error(message, null, null, stack, kind, 6, null);
            com.datadog.android.api.feature.FeatureScope highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            if (highResolutionOutputSizeshNQ4ISI != null) {
                highResolutionOutputSizeshNQ4ISI.sendEvent(error);
            }
        }
    }

    public final com.datadog.android._InternalProxy._TelemetryProxy get_telemetry() {
        return this._telemetry;
    }

    public final void setMetricTelemetrySampleRateBypass(float sampleRate) {
        com.datadog.android.api.SdkCore sdkCore = this.getHighResolutionOutputSizeshNQ4ISI;
        com.datadog.android.core.internal.DatadogCore datadogCore = sdkCore instanceof com.datadog.android.core.internal.DatadogCore ? (com.datadog.android.core.internal.DatadogCore) sdkCore : null;
        com.datadog.android.core.internal.CoreFeature coreFeature$dd_sdk_android_core_release = datadogCore != null ? datadogCore.getCoreFeature$dd_sdk_android_core_release() : null;
        if (coreFeature$dd_sdk_android_core_release == null) {
            return;
        }
        coreFeature$dd_sdk_android_core_release.setMetricTelemetrySampleRateBypass$dd_sdk_android_core_release(java.lang.Float.valueOf(sampleRate));
    }

    public final void setCustomAppVersion(java.lang.String version) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
        com.datadog.android.api.SdkCore sdkCore = this.getHighResolutionOutputSizeshNQ4ISI;
        com.datadog.android.core.internal.DatadogCore datadogCore = sdkCore instanceof com.datadog.android.core.internal.DatadogCore ? (com.datadog.android.core.internal.DatadogCore) sdkCore : null;
        com.datadog.android.core.internal.CoreFeature coreFeature$dd_sdk_android_core_release = datadogCore != null ? datadogCore.getCoreFeature$dd_sdk_android_core_release() : null;
        com.datadog.android.core.internal.system.AppVersionProvider packageVersionProvider = coreFeature$dd_sdk_android_core_release != null ? coreFeature$dd_sdk_android_core_release.getPackageVersionProvider() : null;
        if (packageVersionProvider == null) {
            return;
        }
        packageVersionProvider.setVersion(version);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/datadog/android/_InternalProxy$Companion;", "", "<init>", "()V", "Lcom/datadog/android/core/configuration/Configuration$Builder;", "builder", "allowClearTextHttp", "(Lcom/datadog/android/core/configuration/Configuration$Builder;)Lcom/datadog/android/core/configuration/Configuration$Builder;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.datadog.android.core.configuration.Configuration.Builder allowClearTextHttp(com.datadog.android.core.configuration.Configuration.Builder builder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
            return builder.allowClearTextHttp$dd_sdk_android_core_release();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
