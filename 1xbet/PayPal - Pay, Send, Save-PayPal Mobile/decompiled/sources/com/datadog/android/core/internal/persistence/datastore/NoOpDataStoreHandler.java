package com.datadog.android.core.internal.persistence.datastore;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJI\u0010\u0013\u001a\u00020\u0004\"\b\b\u0000\u0010\r*\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014JM\u0010\u0018\u001a\u00020\u0004\"\b\b\u0000\u0010\r*\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/datadog/android/core/internal/persistence/datastore/NoOpDataStoreHandler;", "Lcom/datadog/android/api/storage/datastore/DataStoreHandler;", "<init>", "()V", "", "clearAllData", "", "key", "Lcom/datadog/android/api/storage/datastore/DataStoreWriteCallback;", com.sun.jna.Callback.METHOD_NAME, "removeValue", "(Ljava/lang/String;Lcom/datadog/android/api/storage/datastore/DataStoreWriteCallback;)V", "", "T", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "version", "Lcom/datadog/android/core/persistence/Serializer;", "serializer", "setValue", "(Ljava/lang/String;Ljava/lang/Object;ILcom/datadog/android/api/storage/datastore/DataStoreWriteCallback;Lcom/datadog/android/core/persistence/Serializer;)V", "Lcom/datadog/android/api/storage/datastore/DataStoreReadCallback;", "Lcom/datadog/android/core/internal/persistence/Deserializer;", "deserializer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "(Ljava/lang/String;Ljava/lang/Integer;Lcom/datadog/android/api/storage/datastore/DataStoreReadCallback;Lcom/datadog/android/core/internal/persistence/Deserializer;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpDataStoreHandler implements com.datadog.android.api.storage.datastore.DataStoreHandler {
    @Override // com.datadog.android.api.storage.datastore.DataStoreHandler
    public final void clearAllData() {
    }

    @Override // com.datadog.android.api.storage.datastore.DataStoreHandler
    public final <T> void value(java.lang.String key, java.lang.Integer version, com.datadog.android.api.storage.datastore.DataStoreReadCallback<T> callback, com.datadog.android.core.internal.persistence.Deserializer<java.lang.String, T> deserializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "");
    }

    @Override // com.datadog.android.api.storage.datastore.DataStoreHandler
    public final <T> void setValue(java.lang.String key, T data, int version, com.datadog.android.api.storage.datastore.DataStoreWriteCallback callback, com.datadog.android.core.persistence.Serializer<T> serializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
    }

    @Override // com.datadog.android.api.storage.datastore.DataStoreHandler
    public final void removeValue(java.lang.String key, com.datadog.android.api.storage.datastore.DataStoreWriteCallback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
    }
}
