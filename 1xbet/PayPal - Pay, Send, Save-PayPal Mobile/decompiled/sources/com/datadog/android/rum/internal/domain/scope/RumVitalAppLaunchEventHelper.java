package com.datadog.android.rum.internal.domain.scope;

@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ}\u0010#\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00132\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b#\u0010$R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010(\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010%\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010+\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010-"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumVitalAppLaunchEventHelper;", "", "Lcom/datadog/android/rum/RumSessionType;", "rumSessionTypeOverride", "Lcom/datadog/android/rum/internal/domain/InfoProvider;", "Lcom/datadog/android/rum/internal/domain/battery/BatteryInfo;", "batteryInfoProvider", "Lcom/datadog/android/rum/internal/domain/display/DisplayInfo;", "displayInfoProvider", "", "sampleRate", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/rum/RumSessionType;Lcom/datadog/android/rum/internal/domain/InfoProvider;Lcom/datadog/android/rum/internal/domain/InfoProvider;FLcom/datadog/android/api/InternalLogger;)V", "", "timestampMs", "Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "", "", "eventAttributes", "customAttributes", "", "hasReplay", "Lcom/datadog/android/rum/internal/domain/RumContext;", "rumContext", "durationNs", "Lcom/datadog/android/rum/internal/startup/RumStartupScenario;", com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporterImpl.KEY_SCENARIO, "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$AppLaunchMetric;", "appLaunchMetric", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ProfilingStatus;", "profilingStatus", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent;", "newVitalAppLaunchEvent", "(JLcom/datadog/android/api/context/DatadogContext;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Boolean;Lcom/datadog/android/rum/internal/domain/RumContext;JLcom/datadog/android/rum/internal/startup/RumStartupScenario;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$AppLaunchMetric;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ProfilingStatus;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent;", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/rum/internal/domain/InfoProvider;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoSizes", "Lcom/datadog/android/rum/RumSessionType;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RumVitalAppLaunchEventHelper {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final float getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.display.DisplayInfo> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.battery.BatteryInfo> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.rum.RumSessionType getHighSpeedVideoFpsRangesFor;

    public RumVitalAppLaunchEventHelper(com.datadog.android.rum.RumSessionType rumSessionType, com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.battery.BatteryInfo> infoProvider, com.datadog.android.rum.internal.domain.InfoProvider<com.datadog.android.rum.internal.domain.display.DisplayInfo> infoProvider2, float f, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(infoProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(infoProvider2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighSpeedVideoFpsRangesFor = rumSessionType;
        this.Camera2StreamConfigurationMap = infoProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = infoProvider2;
        this.getHighSpeedVideoSizes = f;
        this.getHighSpeedVideoFpsRanges = internalLogger;
    }

    public final com.datadog.android.rum.model.VitalAppLaunchEvent newVitalAppLaunchEvent(long timestampMs, com.datadog.android.api.context.DatadogContext datadogContext, java.util.Map<java.lang.String, ? extends java.lang.Object> eventAttributes, java.util.Map<java.lang.String, ? extends java.lang.Object> customAttributes, java.lang.Boolean hasReplay, com.datadog.android.rum.internal.domain.RumContext rumContext, long durationNs, com.datadog.android.rum.internal.startup.RumStartupScenario scenario, com.datadog.android.rum.model.VitalAppLaunchEvent.AppLaunchMetric appLaunchMetric, com.datadog.android.rum.model.VitalAppLaunchEvent.ProfilingStatus profilingStatus) {
        com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSessionType vitalAppLaunchEventSessionType;
        java.lang.String syntheticsResultId;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventAttributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customAttributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scenario, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appLaunchMetric, "");
        java.lang.String syntheticsTestId = rumContext.getSyntheticsTestId();
        com.datadog.android.rum.model.VitalAppLaunchEvent.Synthetics synthetics = (syntheticsTestId == null || kotlin.text.StringsKt.isBlank(syntheticsTestId) || (syntheticsResultId = rumContext.getSyntheticsResultId()) == null || kotlin.text.StringsKt.isBlank(syntheticsResultId)) ? null : new com.datadog.android.rum.model.VitalAppLaunchEvent.Synthetics(rumContext.getSyntheticsTestId(), rumContext.getSyntheticsResultId(), null, 4, null);
        com.datadog.android.rum.RumSessionType rumSessionType = this.getHighSpeedVideoFpsRangesFor;
        if (rumSessionType != null) {
            vitalAppLaunchEventSessionType = com.datadog.android.rum.internal.RumSessionTypeExtKt.toVitalAppLaunch(rumSessionType);
        } else if (synthetics == null) {
            vitalAppLaunchEventSessionType = com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSessionType.USER;
        } else {
            vitalAppLaunchEventSessionType = com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSessionType.SYNTHETICS;
        }
        com.datadog.android.rum.internal.domain.battery.BatteryInfo camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap.getCamera2StreamConfigurationMap();
        com.datadog.android.rum.internal.domain.display.DisplayInfo camera2StreamConfigurationMap2 = this.getHighResolutionOutputSizeshNQ4ISI.getCamera2StreamConfigurationMap();
        com.datadog.android.api.context.UserInfo userInfo = datadogContext.getUserInfo();
        java.lang.String viewId = rumContext.getViewId();
        if (viewId == null) {
            viewId = com.datadog.android.rum.internal.domain.RumContext.INSTANCE.getNULL_UUID();
        }
        java.lang.String viewUrl = rumContext.getViewUrl();
        if (viewUrl == null) {
            viewUrl = "";
        }
        com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventView vitalAppLaunchEventView = new com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventView(viewId, null, viewUrl, rumContext.getViewName());
        java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(customAttributes);
        mutableMap.putAll(eventAttributes);
        com.datadog.android.rum.model.VitalAppLaunchEvent.Context context = new com.datadog.android.rum.model.VitalAppLaunchEvent.Context(mutableMap);
        com.datadog.android.rum.model.VitalAppLaunchEvent.Dd dd = new com.datadog.android.rum.model.VitalAppLaunchEvent.Dd(new com.datadog.android.rum.model.VitalAppLaunchEvent.DdSession(null, com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toVitalAppLaunchSessionPrecondition(rumContext.getSessionStartReason()), 1, null), new com.datadog.android.rum.model.VitalAppLaunchEvent.Configuration(java.lang.Float.valueOf(this.getHighSpeedVideoSizes), null, null, null, 14, null), null, null, new com.datadog.android.rum.model.VitalAppLaunchEvent.Profiling(profilingStatus, null, 2, null), 12, null);
        com.datadog.android.rum.model.VitalAppLaunchEvent.Application application = new com.datadog.android.rum.model.VitalAppLaunchEvent.Application(rumContext.getApplicationId(), datadogContext.getDeviceInfo().getLocaleInfo().getCurrentLocale());
        com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSession vitalAppLaunchEventSession = new com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSession(rumContext.getSessionId(), vitalAppLaunchEventSessionType, hasReplay);
        com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource tryFromSource = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.tryFromSource(com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource.INSTANCE, datadogContext.getSource(), this.getHighSpeedVideoFpsRanges);
        com.datadog.android.api.context.AccountInfo accountInfo = datadogContext.getAccountInfo();
        com.datadog.android.rum.model.VitalAppLaunchEvent.Account account = accountInfo != null ? new com.datadog.android.rum.model.VitalAppLaunchEvent.Account(accountInfo.getId(), accountInfo.getName(), kotlin.collections.MapsKt.toMutableMap(accountInfo.getExtraInfo())) : null;
        com.datadog.android.rum.model.VitalAppLaunchEvent.Usr usr = com.datadog.android.rum.internal.utils.RuntimeUtilsKt.hasUserData(userInfo) ? new com.datadog.android.rum.model.VitalAppLaunchEvent.Usr(userInfo.getId(), userInfo.getName(), userInfo.getEmail(), userInfo.getAnonymousId(), kotlin.collections.MapsKt.toMutableMap(userInfo.getAdditionalProperties())) : null;
        com.datadog.android.rum.model.VitalAppLaunchEvent.Device device = new com.datadog.android.rum.model.VitalAppLaunchEvent.Device(com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toVitalAppLaunchSchemaType(datadogContext.getDeviceInfo().getDeviceType()), datadogContext.getDeviceInfo().getDeviceName(), datadogContext.getDeviceInfo().getDeviceModel(), datadogContext.getDeviceInfo().getDeviceBrand(), datadogContext.getDeviceInfo().getArchitecture(), null, datadogContext.getDeviceInfo().getLocaleInfo().getLocales(), datadogContext.getDeviceInfo().getLocaleInfo().getTimeZone(), camera2StreamConfigurationMap.getBatteryLevel(), camera2StreamConfigurationMap.getLowPowerMode(), camera2StreamConfigurationMap2.getScreenBrightness(), java.lang.Integer.valueOf(datadogContext.getDeviceInfo().getLogicalCpuCount()), datadogContext.getDeviceInfo().getTotalRam(), datadogContext.getDeviceInfo().isLowRam(), 32, null);
        com.datadog.android.rum.model.VitalAppLaunchEvent.Os os = new com.datadog.android.rum.model.VitalAppLaunchEvent.Os(datadogContext.getDeviceInfo().getOsName(), datadogContext.getDeviceInfo().getOsVersion(), null, datadogContext.getDeviceInfo().getOsMajorVersion(), 4, null);
        com.datadog.android.rum.model.VitalAppLaunchEvent.Connectivity appLaunchVitalConnectivity = com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toAppLaunchVitalConnectivity(datadogContext.getNetworkInfo());
        java.lang.String version = datadogContext.getVersion();
        java.lang.String service = datadogContext.getService();
        java.lang.String buildDDTagsString = com.datadog.android.rum.internal.utils.RumTagsUtilsKt.buildDDTagsString(datadogContext);
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return new com.datadog.android.rum.model.VitalAppLaunchEvent(timestampMs, application, service, version, null, null, buildDDTagsString, vitalAppLaunchEventSession, tryFromSource, vitalAppLaunchEventView, usr, account, appLaunchVitalConnectivity, null, synthetics, null, os, device, dd, context, null, new com.datadog.android.rum.model.VitalAppLaunchEvent.Vital(obj, com.datadog.android.rum.internal.domain.scope.RumVitalAppLaunchEventHelperKt.access$vitalName(appLaunchMetric), null, appLaunchMetric, java.lang.Long.valueOf(durationNs), com.datadog.android.rum.internal.domain.scope.RumEventExtKt.toVitalAppLaunchStartupType(scenario), null, java.lang.Boolean.valueOf(scenario.getHasSavedInstanceStateBundle())), 1089584, null);
    }
}
