package com.datadog.android.sessionreplay.internal.gson;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\r8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0010\u001a\u00020\r8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\r8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\"\u0014\u0010\u0012\u001a\u00020\r8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000f"}, d2 = {"Lcom/google/gson/JsonElement;", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/google/gson/JsonArray;", "safeGetAsJsonArray", "(Lcom/google/gson/JsonElement;Lcom/datadog/android/api/InternalLogger;)Lcom/google/gson/JsonArray;", "Lcom/google/gson/JsonObject;", "safeGetAsJsonObject", "(Lcom/google/gson/JsonElement;Lcom/datadog/android/api/InternalLogger;)Lcom/google/gson/JsonObject;", "Lcom/google/gson/JsonPrimitive;", "", "safeGetAsLong", "(Lcom/google/gson/JsonPrimitive;Lcom/datadog/android/api/InternalLogger;)Ljava/lang/Long;", "", "BROKEN_JSON_ERROR_MESSAGE_FORMAT", "Ljava/lang/String;", "JSON_ARRAY_TYPE", "JSON_OBJECT_TYPE", "JSON_PRIMITIVE_TYPE"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GsonExtKt {
    public static final java.lang.String BROKEN_JSON_ERROR_MESSAGE_FORMAT = "SR GsonExt: Unable parse the batch data into a JsonObject: expected to parse [%s] as %s";
    public static final java.lang.String JSON_ARRAY_TYPE = "JsonArray";
    public static final java.lang.String JSON_OBJECT_TYPE = "JsonObject";
    public static final java.lang.String JSON_PRIMITIVE_TYPE = "JsonPrimitive";

    public static final com.google.gson.JsonObject safeGetAsJsonObject(final com.google.gson.JsonElement jsonElement, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonElement, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        if (jsonElement.isJsonObject()) {
            return jsonElement.getAsJsonObject();
        }
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.TELEMETRY, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.gson.GsonExtKt$safeGetAsJsonObject$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, com.datadog.android.sessionreplay.internal.gson.GsonExtKt.BROKEN_JSON_ERROR_MESSAGE_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{com.google.gson.JsonElement.this.toString(), com.datadog.android.sessionreplay.internal.gson.GsonExtKt.JSON_OBJECT_TYPE}, 2));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                return format;
            }

            {
                super(0);
            }
        }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        return null;
    }

    public static final java.lang.Long safeGetAsLong(final com.google.gson.JsonPrimitive jsonPrimitive, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonPrimitive, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            return java.lang.Long.valueOf(jsonPrimitive.getAsLong());
        } catch (java.lang.NumberFormatException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.TELEMETRY, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.gson.GsonExtKt$safeGetAsLong$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, com.datadog.android.sessionreplay.internal.gson.GsonExtKt.BROKEN_JSON_ERROR_MESSAGE_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{com.google.gson.JsonPrimitive.this.toString(), com.datadog.android.sessionreplay.internal.gson.GsonExtKt.JSON_PRIMITIVE_TYPE}, 2));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                {
                    super(0);
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }

    public static final com.google.gson.JsonArray safeGetAsJsonArray(final com.google.gson.JsonElement jsonElement, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonElement, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        if (jsonElement.isJsonArray()) {
            return jsonElement.getAsJsonArray();
        }
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.TELEMETRY, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.gson.GsonExtKt$safeGetAsJsonArray$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, com.datadog.android.sessionreplay.internal.gson.GsonExtKt.BROKEN_JSON_ERROR_MESSAGE_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{com.google.gson.JsonElement.this.toString(), com.datadog.android.sessionreplay.internal.gson.GsonExtKt.JSON_ARRAY_TYPE}, 2));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                return format;
            }

            {
                super(0);
            }
        }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        return null;
    }
}
