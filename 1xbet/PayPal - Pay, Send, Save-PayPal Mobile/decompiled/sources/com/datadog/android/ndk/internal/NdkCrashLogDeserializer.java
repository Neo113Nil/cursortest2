package com.datadog.android.ndk.internal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/ndk/internal/NdkCrashLogDeserializer;", "Lcom/datadog/android/core/internal/persistence/Deserializer;", "", "Lcom/datadog/android/ndk/internal/NdkCrashLog;", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "model", "deserialize", "(Ljava/lang/String;)Lcom/datadog/android/ndk/internal/NdkCrashLog;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/api/InternalLogger;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NdkCrashLogDeserializer implements com.datadog.android.core.internal.persistence.Deserializer<java.lang.String, com.datadog.android.ndk.internal.NdkCrashLog> {
    public static final java.lang.String DESERIALIZE_ERROR_MESSAGE_FORMAT = "Error while trying to deserialize the NDK Crash info: %s";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighResolutionOutputSizeshNQ4ISI;

    public NdkCrashLogDeserializer(com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighResolutionOutputSizeshNQ4ISI = internalLogger;
    }

    @Override // com.datadog.android.core.internal.persistence.Deserializer
    public final com.datadog.android.ndk.internal.NdkCrashLog deserialize(final java.lang.String model) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
        try {
            return com.datadog.android.ndk.internal.NdkCrashLog.INSTANCE.fromJson$dd_sdk_android_core_release(model);
        } catch (com.google.gson.JsonParseException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.ndk.internal.NdkCrashLogDeserializer$deserialize$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.ndk.internal.NdkCrashLogDeserializer.DESERIALIZE_ERROR_MESSAGE_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{model}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        } catch (java.lang.IllegalStateException e2) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.ndk.internal.NdkCrashLogDeserializer$deserialize$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.ndk.internal.NdkCrashLogDeserializer.DESERIALIZE_ERROR_MESSAGE_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{model}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) e2, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }
}
