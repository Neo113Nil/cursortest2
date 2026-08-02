package com.datadog.android.core.persistence;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \u0007*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u0007J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/core/persistence/Serializer;", "", "T", "model", "", "serialize", "(Ljava/lang/Object;)Ljava/lang/String;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface Serializer<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.core.persistence.Serializer.Companion INSTANCE = com.datadog.android.core.persistence.Serializer.Companion.getHighSpeedVideoFpsRangesFor;
    public static final java.lang.String ERROR_SERIALIZING = "Error serializing %s model";

    java.lang.String serialize(T model);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/core/persistence/Serializer$Companion;", "", "<init>", "()V", "", "ERROR_SERIALIZING", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static final java.lang.String ERROR_SERIALIZING = "Error serializing %s model";
        static final /* synthetic */ com.datadog.android.core.persistence.Serializer.Companion getHighSpeedVideoFpsRangesFor = new com.datadog.android.core.persistence.Serializer.Companion();

        private Companion() {
        }
    }
}
