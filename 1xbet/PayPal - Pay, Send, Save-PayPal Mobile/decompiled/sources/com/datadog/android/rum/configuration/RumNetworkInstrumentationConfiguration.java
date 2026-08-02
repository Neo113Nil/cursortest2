package com.datadog.android.rum.configuration;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/datadog/android/rum/configuration/RumNetworkInstrumentationConfiguration;", "", "<init>", "()V", "", "instrumentationName", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$NetworkInstrumentation$LibraryType;", "libraryType", "Lcom/datadog/android/rum/internal/net/RumNetworkInstrumentation;", "createInstrumentation$dd_sdk_android_rum_release", "(Ljava/lang/String;Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$NetworkInstrumentation$LibraryType;)Lcom/datadog/android/rum/internal/net/RumNetworkInstrumentation;", "Lcom/datadog/android/rum/RumResourceAttributesProvider;", "rumResourceAttributesProvider", "setRumResourceAttributesProvider", "(Lcom/datadog/android/rum/RumResourceAttributesProvider;)Lcom/datadog/android/rum/configuration/RumNetworkInstrumentationConfiguration;", "sdkInstanceName", "setSdkInstanceName", "(Ljava/lang/String;)Lcom/datadog/android/rum/configuration/RumNetworkInstrumentationConfiguration;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/rum/RumResourceAttributesProvider;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RumNetworkInstrumentationConfiguration {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private com.datadog.android.rum.RumResourceAttributesProvider getHighSpeedVideoSizes = new com.datadog.android.rum.NoOpRumResourceAttributesProvider();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.String Camera2StreamConfigurationMap;

    public final com.datadog.android.rum.configuration.RumNetworkInstrumentationConfiguration setSdkInstanceName(java.lang.String sdkInstanceName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInstanceName, "");
        this.Camera2StreamConfigurationMap = sdkInstanceName;
        return this;
    }

    public final com.datadog.android.rum.configuration.RumNetworkInstrumentationConfiguration setRumResourceAttributesProvider(com.datadog.android.rum.RumResourceAttributesProvider rumResourceAttributesProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumResourceAttributesProvider, "");
        this.getHighSpeedVideoSizes = rumResourceAttributesProvider;
        return this;
    }

    public final com.datadog.android.rum.internal.net.RumNetworkInstrumentation createInstrumentation$dd_sdk_android_rum_release(java.lang.String instrumentationName, com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.NetworkInstrumentation.LibraryType libraryType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentationName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(libraryType, "");
        return new com.datadog.android.rum.internal.net.RumNetworkInstrumentation(this.Camera2StreamConfigurationMap, instrumentationName, this.getHighSpeedVideoSizes, libraryType);
    }
}
