package com.datadog.android.rum.internal.net;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/datadog/android/rum/internal/net/RumRequestFactory;", "Lcom/datadog/android/api/net/RequestFactory;", "", "customEndpointUrl", "Lcom/datadog/android/rum/internal/domain/event/RumViewEventFilter;", "viewEventFilter", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/event/RumViewEventFilter;Lcom/datadog/android/api/InternalLogger;)V", "Lcom/datadog/android/api/context/DatadogContext;", "context", "Lcom/datadog/android/api/net/RequestExecutionContext;", "executionContext", "", "Lcom/datadog/android/api/storage/RawBatchEvent;", "batchData", "", "batchMetadata", "Lcom/datadog/android/api/net/Request;", "create", "(Lcom/datadog/android/api/context/DatadogContext;Lcom/datadog/android/api/net/RequestExecutionContext;Ljava/util/List;[B)Lcom/datadog/android/api/net/Request;", "p0", "Camera2StreamConfigurationMap", "([B)Ljava/lang/String;", "Ljava/lang/String;", "getCustomEndpointUrl$dd_sdk_android_rum_release", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/rum/internal/domain/event/RumViewEventFilter;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RumRequestFactory implements com.datadog.android.api.net.RequestFactory {
    public static final java.lang.String LAST_FAILURE_STATUS_KEY = "last_failure_status";
    public static final java.lang.String RETRY_COUNT_KEY = "retry_count";
    private static final byte[] getHighSpeedVideoFpsRangesFor;
    private final java.lang.String customEndpointUrl;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.domain.event.RumViewEventFilter getHighSpeedVideoFpsRangesFor;

    public RumRequestFactory(java.lang.String str, com.datadog.android.rum.internal.domain.event.RumViewEventFilter rumViewEventFilter, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumViewEventFilter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.customEndpointUrl = str;
        this.getHighSpeedVideoFpsRangesFor = rumViewEventFilter;
        this.Camera2StreamConfigurationMap = internalLogger;
    }

    /* renamed from: getCustomEndpointUrl$dd_sdk_android_rum_release, reason: from getter */
    public final java.lang.String getCustomEndpointUrl() {
        return this.customEndpointUrl;
    }

    @Override // com.datadog.android.api.net.RequestFactory
    public final com.datadog.android.api.net.Request create(com.datadog.android.api.context.DatadogContext context, com.datadog.android.api.net.RequestExecutionContext executionContext, java.util.List<com.datadog.android.api.storage.RawBatchEvent> batchData, byte[] batchMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batchData, "");
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        java.util.List<com.datadog.android.api.storage.RawBatchEvent> filterOutRedundantViewEvents = this.getHighSpeedVideoFpsRangesFor.filterOutRedundantViewEvents(batchData);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(filterOutRedundantViewEvents, 10));
        java.util.Iterator<T> it = filterOutRedundantViewEvents.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.datadog.android.api.storage.RawBatchEvent) it.next()).getData());
        }
        byte[] join$default = com.datadog.android.core.internal.utils.ByteArrayExtKt.join$default(arrayList, getHighSpeedVideoFpsRangesFor, null, null, this.Camera2StreamConfigurationMap, 6, null);
        java.lang.String Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(join$default);
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder.put("ddsource", context.getSource());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (executionContext.getPreviousResponseCode() != null) {
            sb.append("retry_count:".concat(java.lang.String.valueOf(executionContext.getAttemptNumber())));
            sb.append(",");
            sb.append("last_failure_status:".concat(java.lang.String.valueOf(executionContext.getPreviousResponseCode())));
        }
        java.lang.String obj2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        if (obj2.length() > 0) {
            createMapBuilder.put("ddtags", obj2);
        }
        java.util.Map build = kotlin.collections.MapsKt.build(createMapBuilder);
        java.lang.String str = this.customEndpointUrl;
        if (str == null) {
            java.lang.String intakeEndpoint = context.getSite().getIntakeEndpoint();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(intakeEndpoint);
            sb2.append("/api/v2/rum");
            str = sb2.toString();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(build.size());
        for (java.util.Map.Entry entry : build.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(key);
            sb3.append("=");
            sb3.append(value);
            arrayList2.add(sb3.toString());
        }
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(arrayList2, "&", com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION, null, 0, null, null, 60, null);
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(str);
        sb4.append(joinToString$default);
        java.lang.String obj3 = sb4.toString();
        java.util.Map mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("DD-API-KEY", context.getClientToken()), kotlin.TuplesKt.to("DD-EVP-ORIGIN", context.getSource()), kotlin.TuplesKt.to("DD-EVP-ORIGIN-VERSION", context.getSdkVersion()), kotlin.TuplesKt.to("DD-REQUEST-ID", obj));
        if (Camera2StreamConfigurationMap != null) {
            mutableMapOf.put("DD-IDEMPOTENCY-KEY", Camera2StreamConfigurationMap);
        }
        return new com.datadog.android.api.net.Request(obj, "RUM Request", obj3, mutableMapOf, join$default, "text/plain;charset=UTF-8");
    }

    private final java.lang.String Camera2StreamConfigurationMap(byte[] p0) {
        try {
            byte[] digest = java.security.MessageDigest.getInstance("SHA-1").digest(p0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(digest, "");
            return com.datadog.android.internal.utils.ByteArrayExtKt.toHexString(digest);
        } catch (java.lang.IllegalArgumentException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.Camera2StreamConfigurationMap, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.net.RumRequestFactory$idempotencyKey$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Cannot generate SHA-1 hash for rum request idempotency key.";
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        } catch (java.lang.NullPointerException e2) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.Camera2StreamConfigurationMap, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.net.RumRequestFactory$idempotencyKey$4
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Cannot generate SHA-1 hash for rum request idempotency key.";
                }
            }, (java.lang.Throwable) e2, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        } catch (java.security.DigestException e3) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.Camera2StreamConfigurationMap, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.net.RumRequestFactory$idempotencyKey$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Cannot generate SHA-1 hash for rum request idempotency key.";
                }
            }, (java.lang.Throwable) e3, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        } catch (java.security.NoSuchAlgorithmException e4) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.Camera2StreamConfigurationMap, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.net.RumRequestFactory$idempotencyKey$3
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "SHA-1 algorithm could not be found in MessageDigest.";
                }
            }, (java.lang.Throwable) e4, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }

    static {
        byte[] bytes = com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        getHighSpeedVideoFpsRangesFor = bytes;
    }
}
