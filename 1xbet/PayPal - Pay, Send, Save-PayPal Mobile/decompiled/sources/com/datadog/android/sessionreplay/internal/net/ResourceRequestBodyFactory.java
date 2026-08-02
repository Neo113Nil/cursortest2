package com.datadog.android.sessionreplay.internal.net;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/net/ResourceRequestBodyFactory;", "", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "", "Lcom/datadog/android/api/storage/RawBatchEvent;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, "Lokhttp3/RequestBody;", "create$dd_sdk_android_session_replay_release", "(Ljava/util/List;)Lokhttp3/RequestBody;", "Lcom/datadog/android/sessionreplay/internal/net/ResourceEvent;", "deserializeToResourceEvents$dd_sdk_android_session_replay_release", "(Ljava/util/List;)Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/api/InternalLogger;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ResourceRequestBodyFactory {
    public static final java.lang.String FILENAME_BLOB = "blob";
    public static final java.lang.String MULTIPLE_APPLICATION_ID_ERROR = "There were multiple applicationIds associated with the resources";
    public static final java.lang.String NAME_EVENT = "event";
    public static final java.lang.String NAME_IMAGE = "image";
    public static final java.lang.String NO_RESOURCES_TO_SEND_ERROR = "No resources to send";
    public static final java.lang.String TYPE_KEY = "type";
    public static final java.lang.String TYPE_RESOURCE = "resource";

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.sessionreplay.internal.net.ResourceRequestBodyFactory.Companion INSTANCE = new com.datadog.android.sessionreplay.internal.net.ResourceRequestBodyFactory.Companion(null);
    private static final okhttp3.MediaType CONTENT_TYPE_IMAGE = okhttp3.MediaType.INSTANCE.parse(androidx.media3.common.MimeTypes.IMAGE_PNG);
    private static final okhttp3.MediaType CONTENT_TYPE_APPLICATION = okhttp3.MediaType.INSTANCE.parse("application/json");

    public ResourceRequestBodyFactory(com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighResolutionOutputSizeshNQ4ISI = internalLogger;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:7|(8:10|11|12|(1:23)|16|(3:18|19|20)(1:22)|21|8)|30|31|(2:32|33)|(1:35)|36|37|38|39) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x016b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x016c, code lost:
    
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(r17.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) com.datadog.android.sessionreplay.internal.net.ResourceRequestBodyFactory$create$result$1.getHighSpeedVideoSizes, (java.lang.Throwable) r0, false, (java.util.Map) null, 48, (java.lang.Object) null);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final okhttp3.RequestBody create$dd_sdk_android_session_replay_release(java.util.List<com.datadog.android.api.storage.RawBatchEvent> resources) {
        java.lang.String applicationId;
        okhttp3.RequestBody requestBody;
        okhttp3.RequestBody requestBody2;
        okhttp3.MediaType mediaType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        java.util.List<com.datadog.android.sessionreplay.internal.net.ResourceEvent> deserializeToResourceEvents$dd_sdk_android_session_replay_release = deserializeToResourceEvents$dd_sdk_android_session_replay_release(resources);
        okhttp3.MultipartBody multipartBody = null;
        if (deserializeToResourceEvents$dd_sdk_android_session_replay_release.isEmpty()) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.net.ResourceRequestBodyFactory$getApplicationId$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.sessionreplay.internal.net.ResourceRequestBodyFactory.NO_RESOURCES_TO_SEND_ERROR;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            applicationId = null;
        } else {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.lang.Object obj : deserializeToResourceEvents$dd_sdk_android_session_replay_release) {
                java.lang.String applicationId2 = ((com.datadog.android.sessionreplay.internal.net.ResourceEvent) obj).getApplicationId();
                java.lang.Object obj2 = linkedHashMap.get(applicationId2);
                if (obj2 == null) {
                    obj2 = (java.util.List) new java.util.ArrayList();
                    linkedHashMap.put(applicationId2, obj2);
                }
                ((java.util.List) obj2).add(obj);
            }
            if (linkedHashMap.size() > 1) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.net.ResourceRequestBodyFactory$getApplicationId$2
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return com.datadog.android.sessionreplay.internal.net.ResourceRequestBodyFactory.MULTIPLE_APPLICATION_ID_ERROR;
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            }
            applicationId = ((com.datadog.android.sessionreplay.internal.net.ResourceEvent) kotlin.collections.CollectionsKt.last((java.util.List) deserializeToResourceEvents$dd_sdk_android_session_replay_release)).getApplicationId();
        }
        if (applicationId == null) {
            return null;
        }
        okhttp3.MultipartBody.Builder type = new okhttp3.MultipartBody.Builder(null, 1, null).setType(okhttp3.MultipartBody.FORM);
        for (com.datadog.android.sessionreplay.internal.net.ResourceEvent resourceEvent : deserializeToResourceEvents$dd_sdk_android_session_replay_release) {
            java.lang.String identifier = resourceEvent.getIdentifier();
            byte[] resourceData = resourceEvent.getResourceData();
            java.lang.String mimeType = resourceEvent.getMimeType();
            try {
                okhttp3.RequestBody.Companion companion = okhttp3.RequestBody.INSTANCE;
                if (mimeType == null || (mediaType = okhttp3.MediaType.INSTANCE.parse(mimeType)) == null) {
                    mediaType = CONTENT_TYPE_IMAGE;
                }
                requestBody2 = okhttp3.RequestBody.Companion.create$default(companion, resourceData, mediaType, 0, 0, 6, (java.lang.Object) null);
            } catch (java.io.IOException e) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.net.ResourceRequestBodyFactory$addResourceRequestBody$body$2
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return "Error creating request body";
                    }
                }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
                requestBody2 = null;
                if (requestBody2 != null) {
                }
            } catch (java.lang.ArrayIndexOutOfBoundsException e2) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.net.ResourceRequestBodyFactory$addResourceRequestBody$body$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return "Error creating request body";
                    }
                }, (java.lang.Throwable) e2, false, (java.util.Map) null, 48, (java.lang.Object) null);
                requestBody2 = null;
                if (requestBody2 != null) {
                }
            }
            if (requestBody2 != null) {
                type.addFormDataPart("image", identifier, requestBody2);
            }
        }
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        com.google.gson.JsonObject jsonObject2 = new com.google.gson.JsonObject();
        jsonObject2.addProperty("id", applicationId);
        jsonObject.add("application", jsonObject2);
        jsonObject.addProperty("type", "resource");
        try {
            okhttp3.RequestBody.Companion companion2 = okhttp3.RequestBody.INSTANCE;
            java.lang.String obj3 = jsonObject.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "");
            requestBody = companion2.create(obj3, CONTENT_TYPE_APPLICATION);
        } catch (java.io.IOException e3) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.net.ResourceRequestBodyFactory$addApplicationIdSection$body$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Error creating request body";
                }
            }, (java.lang.Throwable) e3, false, (java.util.Map) null, 48, (java.lang.Object) null);
            requestBody = null;
            if (requestBody != null) {
            }
            multipartBody = type.build();
            return multipartBody;
        } catch (java.lang.ArrayIndexOutOfBoundsException e4) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.net.ResourceRequestBodyFactory$addApplicationIdSection$body$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Error creating request body";
                }
            }, (java.lang.Throwable) e4, false, (java.util.Map) null, 48, (java.lang.Object) null);
            requestBody = null;
            if (requestBody != null) {
            }
            multipartBody = type.build();
            return multipartBody;
        }
        if (requestBody != null) {
            type.addFormDataPart("event", "blob", requestBody);
        }
        multipartBody = type.build();
        return multipartBody;
    }

    public final java.util.List<com.datadog.android.sessionreplay.internal.net.ResourceEvent> deserializeToResourceEvents$dd_sdk_android_session_replay_release(java.util.List<com.datadog.android.api.storage.RawBatchEvent> resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.datadog.android.api.storage.RawBatchEvent rawBatchEvent : resources) {
            com.google.gson.JsonObject safeDeserializeToJsonObject$dd_sdk_android_session_replay_release = com.datadog.android.sessionreplay.internal.utils.MiscUtils.INSTANCE.safeDeserializeToJsonObject$dd_sdk_android_session_replay_release(this.getHighResolutionOutputSizeshNQ4ISI, rawBatchEvent.getMetadata());
            com.datadog.android.sessionreplay.internal.net.ResourceEvent resourceEvent = null;
            if (safeDeserializeToJsonObject$dd_sdk_android_session_replay_release != null) {
                java.lang.String safeGetStringFromJsonObject$dd_sdk_android_session_replay_release = com.datadog.android.sessionreplay.internal.utils.MiscUtils.INSTANCE.safeGetStringFromJsonObject$dd_sdk_android_session_replay_release(this.getHighResolutionOutputSizeshNQ4ISI, safeDeserializeToJsonObject$dd_sdk_android_session_replay_release, com.datadog.android.sessionreplay.internal.processor.EnrichedResource.APPLICATION_ID_KEY);
                java.lang.String safeGetStringFromJsonObject$dd_sdk_android_session_replay_release2 = com.datadog.android.sessionreplay.internal.utils.MiscUtils.INSTANCE.safeGetStringFromJsonObject$dd_sdk_android_session_replay_release(this.getHighResolutionOutputSizeshNQ4ISI, safeDeserializeToJsonObject$dd_sdk_android_session_replay_release, "filename");
                java.lang.String safeGetStringFromJsonObject$dd_sdk_android_session_replay_release3 = com.datadog.android.sessionreplay.internal.utils.MiscUtils.INSTANCE.safeGetStringFromJsonObject$dd_sdk_android_session_replay_release(this.getHighResolutionOutputSizeshNQ4ISI, safeDeserializeToJsonObject$dd_sdk_android_session_replay_release, com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE);
                if (safeGetStringFromJsonObject$dd_sdk_android_session_replay_release != null && safeGetStringFromJsonObject$dd_sdk_android_session_replay_release2 != null) {
                    resourceEvent = new com.datadog.android.sessionreplay.internal.net.ResourceEvent(safeGetStringFromJsonObject$dd_sdk_android_session_replay_release, safeGetStringFromJsonObject$dd_sdk_android_session_replay_release2, rawBatchEvent.getData(), safeGetStringFromJsonObject$dd_sdk_android_session_replay_release3);
                }
            }
            if (resourceEvent != null) {
                arrayList.add(resourceEvent);
            }
        }
        return arrayList;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0013\u0010\r"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/net/ResourceRequestBodyFactory$Companion;", "", "<init>", "()V", "Lokhttp3/MediaType;", "CONTENT_TYPE_APPLICATION", "Lokhttp3/MediaType;", "getCONTENT_TYPE_APPLICATION$dd_sdk_android_session_replay_release", "()Lokhttp3/MediaType;", "CONTENT_TYPE_IMAGE", "getCONTENT_TYPE_IMAGE$dd_sdk_android_session_replay_release", "", "FILENAME_BLOB", "Ljava/lang/String;", "MULTIPLE_APPLICATION_ID_ERROR", "NAME_EVENT", "NAME_IMAGE", "NO_RESOURCES_TO_SEND_ERROR", "TYPE_KEY", "TYPE_RESOURCE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final okhttp3.MediaType getCONTENT_TYPE_IMAGE$dd_sdk_android_session_replay_release() {
            return com.datadog.android.sessionreplay.internal.net.ResourceRequestBodyFactory.CONTENT_TYPE_IMAGE;
        }

        public final okhttp3.MediaType getCONTENT_TYPE_APPLICATION$dd_sdk_android_session_replay_release() {
            return com.datadog.android.sessionreplay.internal.net.ResourceRequestBodyFactory.CONTENT_TYPE_APPLICATION;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
