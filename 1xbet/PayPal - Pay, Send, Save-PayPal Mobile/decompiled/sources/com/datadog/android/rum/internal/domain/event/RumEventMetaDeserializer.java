package com.datadog.android.rum.internal.domain.event;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/internal/domain/event/RumEventMetaDeserializer;", "Lcom/datadog/android/core/internal/persistence/Deserializer;", "", "Lcom/datadog/android/rum/internal/domain/event/RumEventMeta;", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "model", "deserialize", "([B)Lcom/datadog/android/rum/internal/domain/event/RumEventMeta;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RumEventMetaDeserializer implements com.datadog.android.core.internal.persistence.Deserializer<byte[], com.datadog.android.rum.internal.domain.event.RumEventMeta> {
    public static final java.lang.String DESERIALIZATION_ERROR = "Failed to deserialize RUM event meta";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoFpsRangesFor;

    public RumEventMetaDeserializer(com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighSpeedVideoFpsRangesFor = internalLogger;
    }

    @Override // com.datadog.android.core.internal.persistence.Deserializer
    public final com.datadog.android.rum.internal.domain.event.RumEventMeta deserialize(byte[] model) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
        if (model.length == 0) {
            return null;
        }
        try {
            return com.datadog.android.rum.internal.domain.event.RumEventMeta.INSTANCE.fromJson(new java.lang.String(model, kotlin.text.Charsets.UTF_8), this.getHighSpeedVideoFpsRangesFor);
        } catch (com.google.gson.JsonParseException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.domain.event.RumEventMetaDeserializer$deserialize$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.rum.internal.domain.event.RumEventMetaDeserializer.DESERIALIZATION_ERROR;
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }
}
