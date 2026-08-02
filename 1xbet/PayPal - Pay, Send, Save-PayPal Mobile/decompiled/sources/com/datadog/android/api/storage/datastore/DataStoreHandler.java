package com.datadog.android.api.storage.datastore;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\nJM\u0010\u0011\u001a\u00020\u0002\"\b\b\u0000\u0010\u000b*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u00002\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012JO\u0010\u0016\u001a\u00020\u0002\"\b\b\u0000\u0010\u000b*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/datadog/android/api/storage/datastore/DataStoreHandler;", "", "", "clearAllData", "()V", "", "key", "Lcom/datadog/android/api/storage/datastore/DataStoreWriteCallback;", com.sun.jna.Callback.METHOD_NAME, "removeValue", "(Ljava/lang/String;Lcom/datadog/android/api/storage/datastore/DataStoreWriteCallback;)V", "T", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "version", "Lcom/datadog/android/core/persistence/Serializer;", "serializer", "setValue", "(Ljava/lang/String;Ljava/lang/Object;ILcom/datadog/android/api/storage/datastore/DataStoreWriteCallback;Lcom/datadog/android/core/persistence/Serializer;)V", "Lcom/datadog/android/api/storage/datastore/DataStoreReadCallback;", "Lcom/datadog/android/core/internal/persistence/Deserializer;", "deserializer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "(Ljava/lang/String;Ljava/lang/Integer;Lcom/datadog/android/api/storage/datastore/DataStoreReadCallback;Lcom/datadog/android/core/internal/persistence/Deserializer;)V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DataStoreHandler {
    public static final int CURRENT_DATASTORE_VERSION = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.api.storage.datastore.DataStoreHandler.Companion INSTANCE = com.datadog.android.api.storage.datastore.DataStoreHandler.Companion.getHighSpeedVideoFpsRangesFor;

    void clearAllData();

    void removeValue(java.lang.String key, com.datadog.android.api.storage.datastore.DataStoreWriteCallback callback);

    <T> void setValue(java.lang.String key, T data, int version, com.datadog.android.api.storage.datastore.DataStoreWriteCallback callback, com.datadog.android.core.persistence.Serializer<T> serializer);

    <T> void value(java.lang.String key, java.lang.Integer version, com.datadog.android.api.storage.datastore.DataStoreReadCallback<T> callback, com.datadog.android.core.internal.persistence.Deserializer<java.lang.String, T> deserializer);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void setValue$default(com.datadog.android.api.storage.datastore.DataStoreHandler dataStoreHandler, java.lang.String str, java.lang.Object obj, int i, com.datadog.android.api.storage.datastore.DataStoreWriteCallback dataStoreWriteCallback, com.datadog.android.core.persistence.Serializer serializer, int i2, java.lang.Object obj2) {
            if (obj2 != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setValue");
            }
            if ((i2 & 4) != 0) {
                i = 0;
            }
            int i3 = i;
            if ((i2 & 8) != 0) {
                dataStoreWriteCallback = null;
            }
            dataStoreHandler.setValue(str, obj, i3, dataStoreWriteCallback, serializer);
        }

        public static /* synthetic */ void value$default(com.datadog.android.api.storage.datastore.DataStoreHandler dataStoreHandler, java.lang.String str, java.lang.Integer num, com.datadog.android.api.storage.datastore.DataStoreReadCallback dataStoreReadCallback, com.datadog.android.core.internal.persistence.Deserializer deserializer, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: value");
            }
            if ((i & 2) != 0) {
                num = null;
            }
            dataStoreHandler.value(str, num, dataStoreReadCallback, deserializer);
        }

        public static /* synthetic */ void removeValue$default(com.datadog.android.api.storage.datastore.DataStoreHandler dataStoreHandler, java.lang.String str, com.datadog.android.api.storage.datastore.DataStoreWriteCallback dataStoreWriteCallback, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeValue");
            }
            if ((i & 2) != 0) {
                dataStoreWriteCallback = null;
            }
            dataStoreHandler.removeValue(str, dataStoreWriteCallback);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/api/storage/datastore/DataStoreHandler$Companion;", "", "<init>", "()V", "", "CURRENT_DATASTORE_VERSION", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static final int CURRENT_DATASTORE_VERSION = 0;
        static final /* synthetic */ com.datadog.android.api.storage.datastore.DataStoreHandler.Companion getHighSpeedVideoFpsRangesFor = new com.datadog.android.api.storage.datastore.DataStoreHandler.Companion();

        private Companion() {
        }
    }
}
