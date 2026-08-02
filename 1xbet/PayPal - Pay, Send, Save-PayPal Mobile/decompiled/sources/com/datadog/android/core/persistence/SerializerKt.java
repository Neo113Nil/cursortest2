package com.datadog.android.core.persistence;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a3\u0010\u0007\u001a\u0004\u0018\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "T", "Lcom/datadog/android/core/persistence/Serializer;", "model", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "", "serializeToByteArray", "(Lcom/datadog/android/core/persistence/Serializer;Ljava/lang/Object;Lcom/datadog/android/api/InternalLogger;)[B"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SerializerKt {
    public static final <T> byte[] serializeToByteArray(com.datadog.android.core.persistence.Serializer<T> serializer, final T t, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            java.lang.String serialize = serializer.serialize(t);
            if (serialize == null) {
                return null;
            }
            byte[] bytes = serialize.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            return bytes;
        } catch (java.lang.Throwable th) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.USER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.persistence.SerializerKt$serializeToByteArray$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, "Error serializing %s model", java.util.Arrays.copyOf(new java.lang.Object[]{t.getClass().getSimpleName()}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, th, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }
}
