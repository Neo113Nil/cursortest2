package com.datadog.android.core.internal;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/datadog/android/core/internal/DatadogContextProvider;", "Lcom/datadog/android/core/internal/ContextProvider;", "Lcom/datadog/android/core/internal/CoreFeature;", "coreFeature", "Lcom/datadog/android/core/internal/FeatureContextProvider;", "featureContextProvider", "<init>", "(Lcom/datadog/android/core/internal/CoreFeature;Lcom/datadog/android/core/internal/FeatureContextProvider;)V", "", "", "withFeatureContexts", "Lcom/datadog/android/api/context/DatadogContext;", "getContext", "(Ljava/util/Set;)Lcom/datadog/android/api/context/DatadogContext;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/core/internal/CoreFeature;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/datadog/android/core/internal/FeatureContextProvider;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DatadogContextProvider implements com.datadog.android.core.internal.ContextProvider {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.core.internal.CoreFeature getHighSpeedVideoFpsRangesFor;
    private final com.datadog.android.core.internal.FeatureContextProvider getHighSpeedVideoSizes;

    public DatadogContextProvider(com.datadog.android.core.internal.CoreFeature coreFeature, com.datadog.android.core.internal.FeatureContextProvider featureContextProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coreFeature, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureContextProvider, "");
        this.getHighSpeedVideoFpsRangesFor = coreFeature;
        this.getHighSpeedVideoSizes = featureContextProvider;
    }

    @Override // com.datadog.android.core.internal.ContextProvider
    public final com.datadog.android.api.context.DatadogContext getContext(java.util.Set<java.lang.String> withFeatureContexts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withFeatureContexts, "");
        com.datadog.android.DatadogSite site = this.getHighSpeedVideoFpsRangesFor.getSite();
        java.lang.String clientToken = this.getHighSpeedVideoFpsRangesFor.getClientToken();
        java.lang.String serviceName = this.getHighSpeedVideoFpsRangesFor.getServiceName();
        java.lang.String envName = this.getHighSpeedVideoFpsRangesFor.getEnvName();
        java.lang.String version = this.getHighSpeedVideoFpsRangesFor.getPackageVersionProvider().getVersion();
        int versionCode = this.getHighSpeedVideoFpsRangesFor.getPackageVersionProvider().getVersionCode();
        java.lang.String variant = this.getHighSpeedVideoFpsRangesFor.getVariant();
        java.lang.String sdkVersion = this.getHighSpeedVideoFpsRangesFor.getSdkVersion();
        java.lang.String sourceName = this.getHighSpeedVideoFpsRangesFor.getSourceName();
        com.datadog.android.api.context.TimeInfo composeTimeInfo = com.datadog.android.core.internal.time.TimeProviderExtKt.composeTimeInfo(this.getHighSpeedVideoFpsRangesFor.getTimeProvider());
        com.datadog.android.api.context.ProcessInfo processInfo = new com.datadog.android.api.context.ProcessInfo(this.getHighSpeedVideoFpsRangesFor.getIsMainProcess());
        com.datadog.android.api.context.NetworkInfo getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor.getNetworkInfoProvider().getGetHighSpeedVideoFpsRanges();
        com.datadog.android.core.internal.system.AndroidInfoProvider androidInfoProvider = this.getHighSpeedVideoFpsRangesFor.getAndroidInfoProvider();
        java.lang.String deviceName = androidInfoProvider.getDeviceName();
        java.lang.String deviceBrand = androidInfoProvider.getDeviceBrand();
        com.datadog.android.api.context.DeviceType deviceType = androidInfoProvider.getDeviceType();
        java.lang.String deviceModel = androidInfoProvider.getDeviceModel();
        java.lang.String deviceBuildId = androidInfoProvider.getDeviceBuildId();
        java.lang.String osName = androidInfoProvider.getOsName();
        java.lang.String osVersion = androidInfoProvider.getOsVersion();
        java.lang.String osMajorVersion = androidInfoProvider.getOsMajorVersion();
        java.lang.String architecture = androidInfoProvider.getArchitecture();
        java.lang.Integer numberOfDisplays = androidInfoProvider.getNumberOfDisplays();
        com.datadog.android.core.internal.system.AndroidInfoProvider androidInfoProvider2 = this.getHighSpeedVideoFpsRangesFor.getAndroidInfoProvider();
        com.datadog.android.api.context.DeviceInfo deviceInfo = new com.datadog.android.api.context.DeviceInfo(deviceName, deviceBrand, deviceModel, deviceType, deviceBuildId, osName, osMajorVersion, osVersion, architecture, numberOfDisplays, new com.datadog.android.api.context.LocaleInfo(androidInfoProvider2.getLocales(), androidInfoProvider2.getCurrentLocale(), androidInfoProvider2.getTimeZone()), androidInfoProvider.getLogicalCpuCount(), androidInfoProvider.getTotalRam(), androidInfoProvider.getIsLowRam());
        com.datadog.android.api.context.UserInfo userInfo = this.getHighSpeedVideoFpsRangesFor.getUserInfoProvider().getGetHighResolutionOutputSizeshNQ4ISI();
        com.datadog.android.api.context.AccountInfo accountInfo = this.getHighSpeedVideoFpsRangesFor.getAccountInfoProvider().getGetHighSpeedVideoFpsRanges();
        com.datadog.android.privacy.TrackingConsent getHighSpeedVideoFpsRanges2 = this.getHighSpeedVideoFpsRangesFor.getTrackingConsentProvider().getGetHighSpeedVideoFpsRanges();
        java.lang.String appBuildId = this.getHighSpeedVideoFpsRangesFor.getAppBuildId();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.String str : withFeatureContexts) {
            java.util.Map<java.lang.String, java.lang.Object> featureContext = this.getHighSpeedVideoSizes.getFeatureContext(str);
            if (!featureContext.isEmpty()) {
                linkedHashMap.put(str, featureContext);
            }
        }
        return new com.datadog.android.api.context.DatadogContext(site, clientToken, serviceName, envName, version, versionCode, variant, sourceName, sdkVersion, composeTimeInfo, processInfo, getHighSpeedVideoFpsRanges, deviceInfo, userInfo, accountInfo, getHighSpeedVideoFpsRanges2, appBuildId, linkedHashMap);
    }
}
