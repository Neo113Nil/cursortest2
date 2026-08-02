package com.datadog.android.rum.internal.domain.event;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/internal/domain/event/RumEventDeserializer;", "Lcom/datadog/android/core/internal/persistence/Deserializer;", "Lcom/google/gson/JsonObject;", "", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "model", "deserialize", "(Lcom/google/gson/JsonObject;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RumEventDeserializer implements com.datadog.android.core.internal.persistence.Deserializer<com.google.gson.JsonObject, java.lang.Object> {
    public static final java.lang.String DESERIALIZE_ERROR_MESSAGE_FORMAT = "Error while trying to deserialize the RumEvent: %s";
    public static final java.lang.String EVENT_TELEMETRY_KEY_NAME = "telemetry";
    public static final java.lang.String EVENT_TELEMETRY_STATUS_KEY_NAME = "status";
    public static final java.lang.String EVENT_TYPE_ACTION = "action";
    public static final java.lang.String EVENT_TYPE_ERROR = "error";
    public static final java.lang.String EVENT_TYPE_KEY_NAME = "type";
    public static final java.lang.String EVENT_TYPE_LONG_TASK = "long_task";
    public static final java.lang.String EVENT_TYPE_RESOURCE = "resource";
    public static final java.lang.String EVENT_TYPE_TELEMETRY = "telemetry";
    public static final java.lang.String EVENT_TYPE_VIEW = "view";
    public static final java.lang.String TELEMETRY_TYPE_DEBUG = "debug";
    public static final java.lang.String TELEMETRY_TYPE_ERROR = "error";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoFpsRangesFor;

    public RumEventDeserializer(com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighSpeedVideoFpsRangesFor = internalLogger;
    }

    @Override // com.datadog.android.core.internal.persistence.Deserializer
    public final java.lang.Object deserialize(final com.google.gson.JsonObject model) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
        try {
            com.google.gson.JsonPrimitive asJsonPrimitive = model.getAsJsonPrimitive("type");
            java.lang.String asString = asJsonPrimitive != null ? asJsonPrimitive.getAsString() : null;
            if (asString != null) {
                switch (asString.hashCode()) {
                    case -1422950858:
                        if (asString.equals("action")) {
                            return com.datadog.android.rum.model.ActionEvent.INSTANCE.fromJsonObject(model);
                        }
                        break;
                    case -341064690:
                        if (asString.equals("resource")) {
                            return com.datadog.android.rum.model.ResourceEvent.INSTANCE.fromJsonObject(model);
                        }
                        break;
                    case 3619493:
                        if (asString.equals("view")) {
                            return com.datadog.android.rum.model.ViewEvent.INSTANCE.fromJsonObject(model);
                        }
                        break;
                    case 96784904:
                        if (asString.equals("error")) {
                            return com.datadog.android.rum.model.ErrorEvent.INSTANCE.fromJsonObject(model);
                        }
                        break;
                    case 128111976:
                        if (asString.equals(EVENT_TYPE_LONG_TASK)) {
                            return com.datadog.android.rum.model.LongTaskEvent.INSTANCE.fromJsonObject(model);
                        }
                        break;
                    case 780346297:
                        if (asString.equals("telemetry")) {
                            java.lang.String asString2 = model.getAsJsonObject("telemetry").getAsJsonPrimitive("status").getAsString();
                            if (kotlin.jvm.internal.Intrinsics.areEqual(asString2, TELEMETRY_TYPE_DEBUG)) {
                                return com.datadog.android.telemetry.model.TelemetryDebugEvent.INSTANCE.fromJsonObject(model);
                            }
                            if (kotlin.jvm.internal.Intrinsics.areEqual(asString2, "error")) {
                                return com.datadog.android.telemetry.model.TelemetryErrorEvent.INSTANCE.fromJsonObject(model);
                            }
                            throw new com.google.gson.JsonParseException("We could not deserialize the telemetry event with status: ".concat(java.lang.String.valueOf(asString2)));
                        }
                        break;
                }
            }
            throw new com.google.gson.JsonParseException("We could not deserialize the event with type: ".concat(java.lang.String.valueOf(asString)));
        } catch (com.google.gson.JsonParseException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.event.RumEventDeserializer$deserialize$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, "Error while trying to deserialize the RumEvent: %s", java.util.Arrays.copyOf(new java.lang.Object[]{com.google.gson.JsonObject.this}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                {
                    super(0);
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        } catch (java.lang.IllegalStateException e2) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.event.RumEventDeserializer$deserialize$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, "Error while trying to deserialize the RumEvent: %s", java.util.Arrays.copyOf(new java.lang.Object[]{com.google.gson.JsonObject.this}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                {
                    super(0);
                }
            }, (java.lang.Throwable) e2, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }
}
