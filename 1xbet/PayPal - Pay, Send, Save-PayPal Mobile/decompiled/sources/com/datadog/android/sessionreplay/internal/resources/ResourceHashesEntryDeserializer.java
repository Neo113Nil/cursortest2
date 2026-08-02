package com.datadog.android.sessionreplay.internal.resources;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/resources/ResourceHashesEntryDeserializer;", "Lcom/datadog/android/core/internal/persistence/Deserializer;", "", "Lcom/datadog/android/sessionreplay/model/ResourceHashesEntry;", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "model", "deserialize", "(Ljava/lang/String;)Lcom/datadog/android/sessionreplay/model/ResourceHashesEntry;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/api/InternalLogger;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ResourceHashesEntryDeserializer implements com.datadog.android.core.internal.persistence.Deserializer<java.lang.String, com.datadog.android.sessionreplay.model.ResourceHashesEntry> {
    public static final java.lang.String DESERIALIZE_ERROR_MESSAGE_FORMAT = "Error while trying to deserialize the ResourceHashesEntry: %s";

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger Camera2StreamConfigurationMap;

    public ResourceHashesEntryDeserializer(com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.Camera2StreamConfigurationMap = internalLogger;
    }

    @Override // com.datadog.android.core.internal.persistence.Deserializer
    public final com.datadog.android.sessionreplay.model.ResourceHashesEntry deserialize(final java.lang.String model) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
        try {
            return com.datadog.android.sessionreplay.model.ResourceHashesEntry.INSTANCE.fromJson(model);
        } catch (com.google.gson.JsonParseException unused) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.Camera2StreamConfigurationMap, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.resources.ResourceHashesEntryDeserializer$deserialize$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.sessionreplay.internal.resources.ResourceHashesEntryDeserializer.DESERIALIZE_ERROR_MESSAGE_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{model}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return null;
        }
    }
}
