package com.datadog.android.rum.internal.domain.event;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010%\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00122\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/datadog/android/rum/internal/domain/event/RumEventSerializer;", "Lcom/datadog/android/core/persistence/Serializer;", "", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/core/constraints/DataConstraints;", "dataConstraints", "<init>", "(Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/core/constraints/DataConstraints;)V", "Lcom/google/gson/JsonObject;", "p0", "getHighSpeedVideoSizes", "(Lcom/google/gson/JsonObject;)Lcom/google/gson/JsonObject;", "model", "", "serialize", "(Ljava/lang/Object;)Ljava/lang/String;", "", "", "getHighSpeedVideoFpsRangesFor", "(Ljava/util/Map;)Ljava/util/Map;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/core/constraints/DataConstraints;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/api/InternalLogger;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RumEventSerializer implements com.datadog.android.core.persistence.Serializer<java.lang.Object> {
    public static final java.lang.String ACCOUNT_ATTRIBUTE_PREFIX = "account";
    public static final java.lang.String ACCOUNT_EXTRA_GROUP_VERBOSE_NAME = "account extra information";
    public static final java.lang.String GLOBAL_ATTRIBUTE_PREFIX = "context";
    public static final java.lang.String USER_ATTRIBUTE_PREFIX = "usr";
    public static final java.lang.String USER_EXTRA_GROUP_VERBOSE_NAME = "user extra information";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.core.constraints.DataConstraints getHighSpeedVideoFpsRangesFor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.internal.domain.event.RumEventSerializer.Companion INSTANCE = new com.datadog.android.rum.internal.domain.event.RumEventSerializer.Companion(null);
    private static final java.util.Set<java.lang.String> knownAttributes = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{com.datadog.android.rum.RumAttributes.ACTION_GESTURE_DIRECTION, com.datadog.android.rum.RumAttributes.ACTION_GESTURE_FROM_STATE, com.datadog.android.rum.RumAttributes.ACTION_GESTURE_TO_STATE, com.datadog.android.rum.RumAttributes.ACTION_TARGET_PARENT_RESOURCE_ID, com.datadog.android.rum.RumAttributes.ACTION_TARGET_PARENT_CLASSNAME, com.datadog.android.rum.RumAttributes.ACTION_TARGET_PARENT_INDEX, com.datadog.android.rum.RumAttributes.ACTION_TARGET_CLASS_NAME, com.datadog.android.rum.RumAttributes.ACTION_TARGET_RESOURCE_ID, com.datadog.android.rum.RumAttributes.ACTION_TARGET_TITLE, com.datadog.android.rum.RumAttributes.ACTION_TARGET_SELECTED, com.datadog.android.rum.RumAttributes.ACTION_TARGET_ROLE, com.datadog.android.rum.RumAttributes.ERROR_RESOURCE_METHOD, com.datadog.android.rum.RumAttributes.ERROR_RESOURCE_STATUS_CODE, com.datadog.android.rum.RumAttributes.ERROR_RESOURCE_URL});
    private static final java.util.Set<java.lang.String> ignoredAttributes = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{com.datadog.android.rum.RumAttributes.INTERNAL_TIMESTAMP, com.datadog.android.rum.RumAttributes.INTERNAL_ERROR_TYPE, "_dd.error.source_type", com.datadog.android.rum.RumAttributes.INTERNAL_ERROR_IS_CRASH});
    private static final java.util.Set<java.lang.String> crossPlatformTransitAttributes = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{com.datadog.android.rum.RumAttributes.INTERNAL_TIMESTAMP, com.datadog.android.rum.RumAttributes.INTERNAL_ERROR_TYPE, "_dd.error.source_type", com.datadog.android.rum.RumAttributes.INTERNAL_ERROR_IS_CRASH});

    public RumEventSerializer(com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.core.constraints.DataConstraints dataConstraints) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataConstraints, "");
        this.getHighSpeedVideoSizes = internalLogger;
        this.getHighSpeedVideoFpsRangesFor = dataConstraints;
    }

    public /* synthetic */ RumEventSerializer(com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.core.constraints.DatadogDataConstraints datadogDataConstraints, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(internalLogger, (i & 2) != 0 ? new com.datadog.android.core.constraints.DatadogDataConstraints(internalLogger) : datadogDataConstraints);
    }

    @Override // com.datadog.android.core.persistence.Serializer
    public final java.lang.String serialize(java.lang.Object model) {
        com.datadog.android.rum.model.VitalAppLaunchEvent copy;
        com.datadog.android.rum.model.VitalOperationStepEvent copy2;
        com.datadog.android.rum.model.LongTaskEvent copy3;
        com.datadog.android.rum.model.ResourceEvent copy4;
        com.datadog.android.rum.model.ActionEvent copy5;
        com.datadog.android.rum.model.ErrorEvent copy6;
        com.datadog.android.rum.model.ViewEvent.ViewEventView copy7;
        com.datadog.android.rum.model.ViewEvent copy8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
        if (model instanceof com.datadog.android.rum.model.ViewEvent) {
            com.datadog.android.rum.model.ViewEvent viewEvent = (com.datadog.android.rum.model.ViewEvent) model;
            com.datadog.android.rum.model.ViewEvent.Usr usr = viewEvent.getUsr();
            com.datadog.android.rum.model.ViewEvent.Usr copy$default = usr != null ? com.datadog.android.rum.model.ViewEvent.Usr.copy$default(usr, null, null, null, null, kotlin.collections.MapsKt.toMutableMap(com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.safeMapValuesToJson(this.getHighSpeedVideoFpsRangesFor.validateAttributes(viewEvent.getUsr().getAdditionalProperties(), "usr", USER_EXTRA_GROUP_VERBOSE_NAME, ignoredAttributes), this.getHighSpeedVideoSizes)), 15, null) : null;
            com.datadog.android.rum.model.ViewEvent.Account account = viewEvent.getAccount();
            com.datadog.android.rum.model.ViewEvent.Account copy$default2 = account != null ? com.datadog.android.rum.model.ViewEvent.Account.copy$default(account, null, null, kotlin.collections.MapsKt.toMutableMap(com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.safeMapValuesToJson(this.getHighSpeedVideoFpsRangesFor.validateAttributes(viewEvent.getAccount().getAdditionalProperties(), "account", ACCOUNT_EXTRA_GROUP_VERBOSE_NAME, ignoredAttributes), this.getHighSpeedVideoSizes)), 3, null) : null;
            com.datadog.android.rum.model.ViewEvent.Context context = viewEvent.getContext();
            com.datadog.android.rum.model.ViewEvent.Context copy9 = context != null ? context.copy(kotlin.collections.MapsKt.toMutableMap(com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.safeMapValuesToJson(getHighSpeedVideoFpsRangesFor(viewEvent.getContext().getAdditionalProperties()), this.getHighSpeedVideoSizes))) : null;
            com.datadog.android.rum.model.ViewEvent.ViewEventView view = viewEvent.getView();
            com.datadog.android.rum.model.ViewEvent.CustomTimings customTimings = viewEvent.getView().getCustomTimings();
            copy7 = view.copy((r74 & 1) != 0 ? view.id : null, (r74 & 2) != 0 ? view.referrer : null, (r74 & 4) != 0 ? view.url : null, (r74 & 8) != 0 ? view.name : null, (r74 & 16) != 0 ? view.loadingTime : null, (r74 & 32) != 0 ? view.networkSettledTime : null, (r74 & 64) != 0 ? view.interactionToNextViewTime : null, (r74 & 128) != 0 ? view.loadingType : null, (r74 & 256) != 0 ? view.timeSpent : 0L, (r74 & 512) != 0 ? view.firstContentfulPaint : null, (r74 & 1024) != 0 ? view.largestContentfulPaint : null, (r74 & 2048) != 0 ? view.largestContentfulPaintTargetSelector : null, (r74 & 4096) != 0 ? view.firstInputDelay : null, (r74 & 8192) != 0 ? view.firstInputTime : null, (r74 & 16384) != 0 ? view.firstInputTargetSelector : null, (r74 & 32768) != 0 ? view.interactionToNextPaint : null, (r74 & 65536) != 0 ? view.interactionToNextPaintTime : null, (r74 & 131072) != 0 ? view.interactionToNextPaintTargetSelector : null, (r74 & 262144) != 0 ? view.cumulativeLayoutShift : null, (r74 & 524288) != 0 ? view.cumulativeLayoutShiftTime : null, (r74 & 1048576) != 0 ? view.cumulativeLayoutShiftTargetSelector : null, (r74 & 2097152) != 0 ? view.domComplete : null, (r74 & 4194304) != 0 ? view.domContentLoaded : null, (r74 & 8388608) != 0 ? view.domInteractive : null, (r74 & 16777216) != 0 ? view.loadEvent : null, (r74 & 33554432) != 0 ? view.firstByte : null, (r74 & 67108864) != 0 ? view.customTimings : customTimings != null ? customTimings.copy(this.getHighSpeedVideoFpsRangesFor.validateTimings(viewEvent.getView().getCustomTimings().getAdditionalProperties())) : null, (r74 & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? view.isActive : null, (r74 & 268435456) != 0 ? view.isSlowRendered : null, (r74 & 536870912) != 0 ? view.action : null, (r74 & 1073741824) != 0 ? view.error : null, (r74 & Integer.MIN_VALUE) != 0 ? view.crash : null, (r75 & 1) != 0 ? view.longTask : null, (r75 & 2) != 0 ? view.frozenFrame : null, (r75 & 4) != 0 ? view.slowFrames : null, (r75 & 8) != 0 ? view.resource : null, (r75 & 16) != 0 ? view.frustration : null, (r75 & 32) != 0 ? view.inForegroundPeriods : null, (r75 & 64) != 0 ? view.memoryAverage : null, (r75 & 128) != 0 ? view.memoryMax : null, (r75 & 256) != 0 ? view.cpuTicksCount : null, (r75 & 512) != 0 ? view.cpuTicksPerSecond : null, (r75 & 1024) != 0 ? view.refreshRateAverage : null, (r75 & 2048) != 0 ? view.refreshRateMin : null, (r75 & 4096) != 0 ? view.slowFramesRate : null, (r75 & 8192) != 0 ? view.freezeRate : null, (r75 & 16384) != 0 ? view.flutterBuildTime : null, (r75 & 32768) != 0 ? view.flutterRasterTime : null, (r75 & 65536) != 0 ? view.jsRefreshRate : null, (r75 & 131072) != 0 ? view.performance : null, (r75 & 262144) != 0 ? view.accessibility : null);
            copy8 = viewEvent.copy((r42 & 1) != 0 ? viewEvent.date : 0L, (r42 & 2) != 0 ? viewEvent.application : null, (r42 & 4) != 0 ? viewEvent.service : null, (r42 & 8) != 0 ? viewEvent.version : null, (r42 & 16) != 0 ? viewEvent.buildVersion : null, (r42 & 32) != 0 ? viewEvent.buildId : null, (r42 & 64) != 0 ? viewEvent.ddtags : null, (r42 & 128) != 0 ? viewEvent.session : null, (r42 & 256) != 0 ? viewEvent.source : null, (r42 & 512) != 0 ? viewEvent.view : copy7, (r42 & 1024) != 0 ? viewEvent.usr : copy$default, (r42 & 2048) != 0 ? viewEvent.account : copy$default2, (r42 & 4096) != 0 ? viewEvent.connectivity : null, (r42 & 8192) != 0 ? viewEvent.display : null, (r42 & 16384) != 0 ? viewEvent.synthetics : null, (r42 & 32768) != 0 ? viewEvent.ciTest : null, (r42 & 65536) != 0 ? viewEvent.os : null, (r42 & 131072) != 0 ? viewEvent.device : null, (r42 & 262144) != 0 ? viewEvent.dd : null, (r42 & 524288) != 0 ? viewEvent.context : copy9, (r42 & 1048576) != 0 ? viewEvent.container : null, (r42 & 2097152) != 0 ? viewEvent.featureFlags : null, (r42 & 4194304) != 0 ? viewEvent.privacy : null);
            com.google.gson.JsonObject asJsonObject = copy8.toJson().getAsJsonObject();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
            java.lang.String obj = getHighSpeedVideoSizes(asJsonObject).toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            return obj;
        }
        if (model instanceof com.datadog.android.rum.model.ErrorEvent) {
            com.datadog.android.rum.model.ErrorEvent errorEvent = (com.datadog.android.rum.model.ErrorEvent) model;
            com.datadog.android.rum.model.ErrorEvent.Usr usr2 = errorEvent.getUsr();
            com.datadog.android.rum.model.ErrorEvent.Usr copy$default3 = usr2 != null ? com.datadog.android.rum.model.ErrorEvent.Usr.copy$default(usr2, null, null, null, null, kotlin.collections.MapsKt.toMutableMap(com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.safeMapValuesToJson(this.getHighSpeedVideoFpsRangesFor.validateAttributes(errorEvent.getUsr().getAdditionalProperties(), "usr", USER_EXTRA_GROUP_VERBOSE_NAME, ignoredAttributes), this.getHighSpeedVideoSizes)), 15, null) : null;
            com.datadog.android.rum.model.ErrorEvent.Account account2 = errorEvent.getAccount();
            com.datadog.android.rum.model.ErrorEvent.Account copy$default4 = account2 != null ? com.datadog.android.rum.model.ErrorEvent.Account.copy$default(account2, null, null, kotlin.collections.MapsKt.toMutableMap(com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.safeMapValuesToJson(this.getHighSpeedVideoFpsRangesFor.validateAttributes(errorEvent.getAccount().getAdditionalProperties(), "account", ACCOUNT_EXTRA_GROUP_VERBOSE_NAME, ignoredAttributes), this.getHighSpeedVideoSizes)), 3, null) : null;
            com.datadog.android.rum.model.ErrorEvent.Context context2 = errorEvent.getContext();
            copy6 = errorEvent.copy((r44 & 1) != 0 ? errorEvent.date : 0L, (r44 & 2) != 0 ? errorEvent.application : null, (r44 & 4) != 0 ? errorEvent.service : null, (r44 & 8) != 0 ? errorEvent.version : null, (r44 & 16) != 0 ? errorEvent.buildVersion : null, (r44 & 32) != 0 ? errorEvent.buildId : null, (r44 & 64) != 0 ? errorEvent.ddtags : null, (r44 & 128) != 0 ? errorEvent.session : null, (r44 & 256) != 0 ? errorEvent.source : null, (r44 & 512) != 0 ? errorEvent.view : null, (r44 & 1024) != 0 ? errorEvent.usr : copy$default3, (r44 & 2048) != 0 ? errorEvent.account : copy$default4, (r44 & 4096) != 0 ? errorEvent.connectivity : null, (r44 & 8192) != 0 ? errorEvent.display : null, (r44 & 16384) != 0 ? errorEvent.synthetics : null, (r44 & 32768) != 0 ? errorEvent.ciTest : null, (r44 & 65536) != 0 ? errorEvent.os : null, (r44 & 131072) != 0 ? errorEvent.device : null, (r44 & 262144) != 0 ? errorEvent.dd : null, (r44 & 524288) != 0 ? errorEvent.context : context2 != null ? context2.copy(kotlin.collections.MapsKt.toMutableMap(com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.safeMapValuesToJson(getHighSpeedVideoFpsRangesFor(errorEvent.getContext().getAdditionalProperties()), this.getHighSpeedVideoSizes))) : null, (r44 & 1048576) != 0 ? errorEvent.action : null, (r44 & 2097152) != 0 ? errorEvent.container : null, (r44 & 4194304) != 0 ? errorEvent.error : null, (r44 & 8388608) != 0 ? errorEvent.freeze : null, (r44 & 16777216) != 0 ? errorEvent.featureFlags : null);
            com.google.gson.JsonObject asJsonObject2 = copy6.toJson().getAsJsonObject();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject2, "");
            java.lang.String obj2 = getHighSpeedVideoSizes(asJsonObject2).toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
            return obj2;
        }
        if (model instanceof com.datadog.android.rum.model.ActionEvent) {
            com.datadog.android.rum.model.ActionEvent actionEvent = (com.datadog.android.rum.model.ActionEvent) model;
            com.datadog.android.rum.model.ActionEvent.Usr usr3 = actionEvent.getUsr();
            com.datadog.android.rum.model.ActionEvent.Usr copy$default5 = usr3 != null ? com.datadog.android.rum.model.ActionEvent.Usr.copy$default(usr3, null, null, null, null, kotlin.collections.MapsKt.toMutableMap(com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.safeMapValuesToJson(this.getHighSpeedVideoFpsRangesFor.validateAttributes(actionEvent.getUsr().getAdditionalProperties(), "usr", USER_EXTRA_GROUP_VERBOSE_NAME, ignoredAttributes), this.getHighSpeedVideoSizes)), 15, null) : null;
            com.datadog.android.rum.model.ActionEvent.Account account3 = actionEvent.getAccount();
            com.datadog.android.rum.model.ActionEvent.Account copy$default6 = account3 != null ? com.datadog.android.rum.model.ActionEvent.Account.copy$default(account3, null, null, kotlin.collections.MapsKt.toMutableMap(com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.safeMapValuesToJson(this.getHighSpeedVideoFpsRangesFor.validateAttributes(actionEvent.getAccount().getAdditionalProperties(), "account", ACCOUNT_EXTRA_GROUP_VERBOSE_NAME, ignoredAttributes), this.getHighSpeedVideoSizes)), 3, null) : null;
            com.datadog.android.rum.model.ActionEvent.Context context3 = actionEvent.getContext();
            copy5 = actionEvent.copy((r41 & 1) != 0 ? actionEvent.date : 0L, (r41 & 2) != 0 ? actionEvent.application : null, (r41 & 4) != 0 ? actionEvent.service : null, (r41 & 8) != 0 ? actionEvent.version : null, (r41 & 16) != 0 ? actionEvent.buildVersion : null, (r41 & 32) != 0 ? actionEvent.buildId : null, (r41 & 64) != 0 ? actionEvent.ddtags : null, (r41 & 128) != 0 ? actionEvent.session : null, (r41 & 256) != 0 ? actionEvent.source : null, (r41 & 512) != 0 ? actionEvent.view : null, (r41 & 1024) != 0 ? actionEvent.usr : copy$default5, (r41 & 2048) != 0 ? actionEvent.account : copy$default6, (r41 & 4096) != 0 ? actionEvent.connectivity : null, (r41 & 8192) != 0 ? actionEvent.display : null, (r41 & 16384) != 0 ? actionEvent.synthetics : null, (r41 & 32768) != 0 ? actionEvent.ciTest : null, (r41 & 65536) != 0 ? actionEvent.os : null, (r41 & 131072) != 0 ? actionEvent.device : null, (r41 & 262144) != 0 ? actionEvent.dd : null, (r41 & 524288) != 0 ? actionEvent.context : context3 != null ? context3.copy(kotlin.collections.MapsKt.toMutableMap(com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.safeMapValuesToJson(getHighSpeedVideoFpsRangesFor(actionEvent.getContext().getAdditionalProperties()), this.getHighSpeedVideoSizes))) : null, (r41 & 1048576) != 0 ? actionEvent.container : null, (r41 & 2097152) != 0 ? actionEvent.action : null);
            com.google.gson.JsonObject asJsonObject3 = copy5.toJson().getAsJsonObject();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject3, "");
            java.lang.String obj3 = getHighSpeedVideoSizes(asJsonObject3).toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "");
            return obj3;
        }
        if (model instanceof com.datadog.android.rum.model.ResourceEvent) {
            com.datadog.android.rum.model.ResourceEvent resourceEvent = (com.datadog.android.rum.model.ResourceEvent) model;
            com.datadog.android.rum.model.ResourceEvent.Usr usr4 = resourceEvent.getUsr();
            com.datadog.android.rum.model.ResourceEvent.Usr copy$default7 = usr4 != null ? com.datadog.android.rum.model.ResourceEvent.Usr.copy$default(usr4, null, null, null, null, kotlin.collections.MapsKt.toMutableMap(com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.safeMapValuesToJson(this.getHighSpeedVideoFpsRangesFor.validateAttributes(resourceEvent.getUsr().getAdditionalProperties(), "usr", USER_EXTRA_GROUP_VERBOSE_NAME, ignoredAttributes), this.getHighSpeedVideoSizes)), 15, null) : null;
            com.datadog.android.rum.model.ResourceEvent.Account account4 = resourceEvent.getAccount();
            com.datadog.android.rum.model.ResourceEvent.Account copy$default8 = account4 != null ? com.datadog.android.rum.model.ResourceEvent.Account.copy$default(account4, null, null, kotlin.collections.MapsKt.toMutableMap(com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.safeMapValuesToJson(this.getHighSpeedVideoFpsRangesFor.validateAttributes(resourceEvent.getAccount().getAdditionalProperties(), "account", ACCOUNT_EXTRA_GROUP_VERBOSE_NAME, ignoredAttributes), this.getHighSpeedVideoSizes)), 3, null) : null;
            com.datadog.android.rum.model.ResourceEvent.Context context4 = resourceEvent.getContext();
            copy4 = resourceEvent.copy((r42 & 1) != 0 ? resourceEvent.date : 0L, (r42 & 2) != 0 ? resourceEvent.application : null, (r42 & 4) != 0 ? resourceEvent.service : null, (r42 & 8) != 0 ? resourceEvent.version : null, (r42 & 16) != 0 ? resourceEvent.buildVersion : null, (r42 & 32) != 0 ? resourceEvent.buildId : null, (r42 & 64) != 0 ? resourceEvent.ddtags : null, (r42 & 128) != 0 ? resourceEvent.session : null, (r42 & 256) != 0 ? resourceEvent.source : null, (r42 & 512) != 0 ? resourceEvent.view : null, (r42 & 1024) != 0 ? resourceEvent.usr : copy$default7, (r42 & 2048) != 0 ? resourceEvent.account : copy$default8, (r42 & 4096) != 0 ? resourceEvent.connectivity : null, (r42 & 8192) != 0 ? resourceEvent.display : null, (r42 & 16384) != 0 ? resourceEvent.synthetics : null, (r42 & 32768) != 0 ? resourceEvent.ciTest : null, (r42 & 65536) != 0 ? resourceEvent.os : null, (r42 & 131072) != 0 ? resourceEvent.device : null, (r42 & 262144) != 0 ? resourceEvent.dd : null, (r42 & 524288) != 0 ? resourceEvent.context : context4 != null ? context4.copy(kotlin.collections.MapsKt.toMutableMap(com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.safeMapValuesToJson(getHighSpeedVideoFpsRangesFor(resourceEvent.getContext().getAdditionalProperties()), this.getHighSpeedVideoSizes))) : null, (r42 & 1048576) != 0 ? resourceEvent.action : null, (r42 & 2097152) != 0 ? resourceEvent.container : null, (r42 & 4194304) != 0 ? resourceEvent.resource : null);
            com.google.gson.JsonObject asJsonObject4 = copy4.toJson().getAsJsonObject();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject4, "");
            java.lang.String obj4 = getHighSpeedVideoSizes(asJsonObject4).toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj4, "");
            return obj4;
        }
        if (model instanceof com.datadog.android.rum.model.LongTaskEvent) {
            com.datadog.android.rum.model.LongTaskEvent longTaskEvent = (com.datadog.android.rum.model.LongTaskEvent) model;
            com.datadog.android.rum.model.LongTaskEvent.Usr usr5 = longTaskEvent.getUsr();
            com.datadog.android.rum.model.LongTaskEvent.Usr copy$default9 = usr5 != null ? com.datadog.android.rum.model.LongTaskEvent.Usr.copy$default(usr5, null, null, null, null, kotlin.collections.MapsKt.toMutableMap(com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.safeMapValuesToJson(this.getHighSpeedVideoFpsRangesFor.validateAttributes(longTaskEvent.getUsr().getAdditionalProperties(), "usr", USER_EXTRA_GROUP_VERBOSE_NAME, ignoredAttributes), this.getHighSpeedVideoSizes)), 15, null) : null;
            com.datadog.android.rum.model.LongTaskEvent.Account account5 = longTaskEvent.getAccount();
            com.datadog.android.rum.model.LongTaskEvent.Account copy$default10 = account5 != null ? com.datadog.android.rum.model.LongTaskEvent.Account.copy$default(account5, null, null, kotlin.collections.MapsKt.toMutableMap(com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.safeMapValuesToJson(this.getHighSpeedVideoFpsRangesFor.validateAttributes(longTaskEvent.getAccount().getAdditionalProperties(), "account", ACCOUNT_EXTRA_GROUP_VERBOSE_NAME, ignoredAttributes), this.getHighSpeedVideoSizes)), 3, null) : null;
            com.datadog.android.rum.model.LongTaskEvent.Context context5 = longTaskEvent.getContext();
            copy3 = longTaskEvent.copy((r42 & 1) != 0 ? longTaskEvent.date : 0L, (r42 & 2) != 0 ? longTaskEvent.application : null, (r42 & 4) != 0 ? longTaskEvent.service : null, (r42 & 8) != 0 ? longTaskEvent.version : null, (r42 & 16) != 0 ? longTaskEvent.buildVersion : null, (r42 & 32) != 0 ? longTaskEvent.buildId : null, (r42 & 64) != 0 ? longTaskEvent.ddtags : null, (r42 & 128) != 0 ? longTaskEvent.session : null, (r42 & 256) != 0 ? longTaskEvent.source : null, (r42 & 512) != 0 ? longTaskEvent.view : null, (r42 & 1024) != 0 ? longTaskEvent.usr : copy$default9, (r42 & 2048) != 0 ? longTaskEvent.account : copy$default10, (r42 & 4096) != 0 ? longTaskEvent.connectivity : null, (r42 & 8192) != 0 ? longTaskEvent.display : null, (r42 & 16384) != 0 ? longTaskEvent.synthetics : null, (r42 & 32768) != 0 ? longTaskEvent.ciTest : null, (r42 & 65536) != 0 ? longTaskEvent.os : null, (r42 & 131072) != 0 ? longTaskEvent.device : null, (r42 & 262144) != 0 ? longTaskEvent.dd : null, (r42 & 524288) != 0 ? longTaskEvent.context : context5 != null ? context5.copy(kotlin.collections.MapsKt.toMutableMap(com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.safeMapValuesToJson(getHighSpeedVideoFpsRangesFor(longTaskEvent.getContext().getAdditionalProperties()), this.getHighSpeedVideoSizes))) : null, (r42 & 1048576) != 0 ? longTaskEvent.action : null, (r42 & 2097152) != 0 ? longTaskEvent.container : null, (r42 & 4194304) != 0 ? longTaskEvent.longTask : null);
            com.google.gson.JsonObject asJsonObject5 = copy3.toJson().getAsJsonObject();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject5, "");
            java.lang.String obj5 = getHighSpeedVideoSizes(asJsonObject5).toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj5, "");
            return obj5;
        }
        if (model instanceof com.datadog.android.rum.model.VitalOperationStepEvent) {
            com.datadog.android.rum.model.VitalOperationStepEvent vitalOperationStepEvent = (com.datadog.android.rum.model.VitalOperationStepEvent) model;
            com.datadog.android.rum.model.VitalOperationStepEvent.Usr usr6 = vitalOperationStepEvent.getUsr();
            com.datadog.android.rum.model.VitalOperationStepEvent.Usr copy$default11 = usr6 != null ? com.datadog.android.rum.model.VitalOperationStepEvent.Usr.copy$default(usr6, null, null, null, null, kotlin.collections.MapsKt.toMutableMap(com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.safeMapValuesToJson(this.getHighSpeedVideoFpsRangesFor.validateAttributes(vitalOperationStepEvent.getUsr().getAdditionalProperties(), "usr", USER_EXTRA_GROUP_VERBOSE_NAME, ignoredAttributes), this.getHighSpeedVideoSizes)), 15, null) : null;
            com.datadog.android.rum.model.VitalOperationStepEvent.Account account6 = vitalOperationStepEvent.getAccount();
            com.datadog.android.rum.model.VitalOperationStepEvent.Account copy$default12 = account6 != null ? com.datadog.android.rum.model.VitalOperationStepEvent.Account.copy$default(account6, null, null, kotlin.collections.MapsKt.toMutableMap(com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.safeMapValuesToJson(this.getHighSpeedVideoFpsRangesFor.validateAttributes(vitalOperationStepEvent.getAccount().getAdditionalProperties(), "account", ACCOUNT_EXTRA_GROUP_VERBOSE_NAME, ignoredAttributes), this.getHighSpeedVideoSizes)), 3, null) : null;
            com.datadog.android.rum.model.VitalOperationStepEvent.Context context6 = vitalOperationStepEvent.getContext();
            copy2 = vitalOperationStepEvent.copy((r41 & 1) != 0 ? vitalOperationStepEvent.date : 0L, (r41 & 2) != 0 ? vitalOperationStepEvent.application : null, (r41 & 4) != 0 ? vitalOperationStepEvent.service : null, (r41 & 8) != 0 ? vitalOperationStepEvent.version : null, (r41 & 16) != 0 ? vitalOperationStepEvent.buildVersion : null, (r41 & 32) != 0 ? vitalOperationStepEvent.buildId : null, (r41 & 64) != 0 ? vitalOperationStepEvent.ddtags : null, (r41 & 128) != 0 ? vitalOperationStepEvent.session : null, (r41 & 256) != 0 ? vitalOperationStepEvent.source : null, (r41 & 512) != 0 ? vitalOperationStepEvent.view : null, (r41 & 1024) != 0 ? vitalOperationStepEvent.usr : copy$default11, (r41 & 2048) != 0 ? vitalOperationStepEvent.account : copy$default12, (r41 & 4096) != 0 ? vitalOperationStepEvent.connectivity : null, (r41 & 8192) != 0 ? vitalOperationStepEvent.display : null, (r41 & 16384) != 0 ? vitalOperationStepEvent.synthetics : null, (r41 & 32768) != 0 ? vitalOperationStepEvent.ciTest : null, (r41 & 65536) != 0 ? vitalOperationStepEvent.os : null, (r41 & 131072) != 0 ? vitalOperationStepEvent.device : null, (r41 & 262144) != 0 ? vitalOperationStepEvent.dd : null, (r41 & 524288) != 0 ? vitalOperationStepEvent.context : context6 != null ? context6.copy(kotlin.collections.MapsKt.toMutableMap(com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.safeMapValuesToJson(getHighSpeedVideoFpsRangesFor(vitalOperationStepEvent.getContext().getAdditionalProperties()), this.getHighSpeedVideoSizes))) : null, (r41 & 1048576) != 0 ? vitalOperationStepEvent.container : null, (r41 & 2097152) != 0 ? vitalOperationStepEvent.vital : null);
            com.google.gson.JsonObject asJsonObject6 = copy2.toJson().getAsJsonObject();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject6, "");
            java.lang.String obj6 = getHighSpeedVideoSizes(asJsonObject6).toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj6, "");
            return obj6;
        }
        if (model instanceof com.datadog.android.rum.model.VitalAppLaunchEvent) {
            com.datadog.android.rum.model.VitalAppLaunchEvent vitalAppLaunchEvent = (com.datadog.android.rum.model.VitalAppLaunchEvent) model;
            com.datadog.android.rum.model.VitalAppLaunchEvent.Usr usr7 = vitalAppLaunchEvent.getUsr();
            com.datadog.android.rum.model.VitalAppLaunchEvent.Usr copy$default13 = usr7 != null ? com.datadog.android.rum.model.VitalAppLaunchEvent.Usr.copy$default(usr7, null, null, null, null, kotlin.collections.MapsKt.toMutableMap(com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.safeMapValuesToJson(this.getHighSpeedVideoFpsRangesFor.validateAttributes(vitalAppLaunchEvent.getUsr().getAdditionalProperties(), "usr", USER_EXTRA_GROUP_VERBOSE_NAME, ignoredAttributes), this.getHighSpeedVideoSizes)), 15, null) : null;
            com.datadog.android.rum.model.VitalAppLaunchEvent.Account account7 = vitalAppLaunchEvent.getAccount();
            com.datadog.android.rum.model.VitalAppLaunchEvent.Account copy$default14 = account7 != null ? com.datadog.android.rum.model.VitalAppLaunchEvent.Account.copy$default(account7, null, null, kotlin.collections.MapsKt.toMutableMap(com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.safeMapValuesToJson(this.getHighSpeedVideoFpsRangesFor.validateAttributes(vitalAppLaunchEvent.getAccount().getAdditionalProperties(), "account", ACCOUNT_EXTRA_GROUP_VERBOSE_NAME, ignoredAttributes), this.getHighSpeedVideoSizes)), 3, null) : null;
            com.datadog.android.rum.model.VitalAppLaunchEvent.Context context7 = vitalAppLaunchEvent.getContext();
            copy = vitalAppLaunchEvent.copy((r41 & 1) != 0 ? vitalAppLaunchEvent.date : 0L, (r41 & 2) != 0 ? vitalAppLaunchEvent.application : null, (r41 & 4) != 0 ? vitalAppLaunchEvent.service : null, (r41 & 8) != 0 ? vitalAppLaunchEvent.version : null, (r41 & 16) != 0 ? vitalAppLaunchEvent.buildVersion : null, (r41 & 32) != 0 ? vitalAppLaunchEvent.buildId : null, (r41 & 64) != 0 ? vitalAppLaunchEvent.ddtags : null, (r41 & 128) != 0 ? vitalAppLaunchEvent.session : null, (r41 & 256) != 0 ? vitalAppLaunchEvent.source : null, (r41 & 512) != 0 ? vitalAppLaunchEvent.view : null, (r41 & 1024) != 0 ? vitalAppLaunchEvent.usr : copy$default13, (r41 & 2048) != 0 ? vitalAppLaunchEvent.account : copy$default14, (r41 & 4096) != 0 ? vitalAppLaunchEvent.connectivity : null, (r41 & 8192) != 0 ? vitalAppLaunchEvent.display : null, (r41 & 16384) != 0 ? vitalAppLaunchEvent.synthetics : null, (r41 & 32768) != 0 ? vitalAppLaunchEvent.ciTest : null, (r41 & 65536) != 0 ? vitalAppLaunchEvent.os : null, (r41 & 131072) != 0 ? vitalAppLaunchEvent.device : null, (r41 & 262144) != 0 ? vitalAppLaunchEvent.dd : null, (r41 & 524288) != 0 ? vitalAppLaunchEvent.context : context7 != null ? context7.copy(kotlin.collections.MapsKt.toMutableMap(com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.safeMapValuesToJson(getHighSpeedVideoFpsRangesFor(vitalAppLaunchEvent.getContext().getAdditionalProperties()), this.getHighSpeedVideoSizes))) : null, (r41 & 1048576) != 0 ? vitalAppLaunchEvent.container : null, (r41 & 2097152) != 0 ? vitalAppLaunchEvent.vital : null);
            com.google.gson.JsonObject asJsonObject7 = copy.toJson().getAsJsonObject();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject7, "");
            java.lang.String obj7 = getHighSpeedVideoSizes(asJsonObject7).toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj7, "");
            return obj7;
        }
        if (model instanceof com.datadog.android.telemetry.model.TelemetryDebugEvent) {
            java.lang.String obj8 = ((com.datadog.android.telemetry.model.TelemetryDebugEvent) model).toJson().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj8, "");
            return obj8;
        }
        if (model instanceof com.datadog.android.telemetry.model.TelemetryErrorEvent) {
            java.lang.String obj9 = ((com.datadog.android.telemetry.model.TelemetryErrorEvent) model).toJson().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj9, "");
            return obj9;
        }
        if (model instanceof com.datadog.android.telemetry.model.TelemetryConfigurationEvent) {
            java.lang.String obj10 = ((com.datadog.android.telemetry.model.TelemetryConfigurationEvent) model).toJson().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj10, "");
            return obj10;
        }
        if (model instanceof com.datadog.android.telemetry.model.TelemetryUsageEvent) {
            java.lang.String obj11 = ((com.datadog.android.telemetry.model.TelemetryUsageEvent) model).toJson().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj11, "");
            return obj11;
        }
        if (model instanceof com.google.gson.JsonObject) {
            return model.toString();
        }
        java.lang.String obj12 = new com.google.gson.JsonObject().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj12, "");
        return obj12;
    }

    private final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRangesFor(java.util.Map<java.lang.String, ? extends java.lang.Object> p0) {
        com.datadog.android.core.constraints.DataConstraints dataConstraints = this.getHighSpeedVideoFpsRangesFor;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry : p0.entrySet()) {
            if (!crossPlatformTransitAttributes.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return com.datadog.android.core.constraints.DataConstraints.DefaultImpls.validateAttributes$default(dataConstraints, linkedHashMap, "context", null, ignoredAttributes, 4, null);
    }

    private static com.google.gson.JsonObject getHighSpeedVideoSizes(com.google.gson.JsonObject p0) {
        if (p0.has("context")) {
            com.google.gson.JsonObject asJsonObject = p0.getAsJsonObject("context");
            java.util.Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> entrySet = asJsonObject.entrySet();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(entrySet, "");
            java.util.ArrayList<java.util.Map.Entry> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : entrySet) {
                if (knownAttributes.contains(((java.util.Map.Entry) obj).getKey())) {
                    arrayList.add(obj);
                }
            }
            for (java.util.Map.Entry entry : arrayList) {
                asJsonObject.remove((java.lang.String) entry.getKey());
                p0.add((java.lang.String) entry.getKey(), (com.google.gson.JsonElement) entry.getValue());
            }
        }
        return p0;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f"}, d2 = {"Lcom/datadog/android/rum/internal/domain/event/RumEventSerializer$Companion;", "", "<init>", "()V", "", "ACCOUNT_ATTRIBUTE_PREFIX", "Ljava/lang/String;", "ACCOUNT_EXTRA_GROUP_VERBOSE_NAME", "GLOBAL_ATTRIBUTE_PREFIX", "USER_ATTRIBUTE_PREFIX", "USER_EXTRA_GROUP_VERBOSE_NAME", "", "crossPlatformTransitAttributes", "Ljava/util/Set;", "getCrossPlatformTransitAttributes$dd_sdk_android_rum_release", "()Ljava/util/Set;", "ignoredAttributes", "getIgnoredAttributes$dd_sdk_android_rum_release", "knownAttributes", "getKnownAttributes$dd_sdk_android_rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.Set<java.lang.String> getKnownAttributes$dd_sdk_android_rum_release() {
            return com.datadog.android.rum.internal.domain.event.RumEventSerializer.knownAttributes;
        }

        public final java.util.Set<java.lang.String> getIgnoredAttributes$dd_sdk_android_rum_release() {
            return com.datadog.android.rum.internal.domain.event.RumEventSerializer.ignoredAttributes;
        }

        public final java.util.Set<java.lang.String> getCrossPlatformTransitAttributes$dd_sdk_android_rum_release() {
            return com.datadog.android.rum.internal.domain.event.RumEventSerializer.crossPlatformTransitAttributes;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
