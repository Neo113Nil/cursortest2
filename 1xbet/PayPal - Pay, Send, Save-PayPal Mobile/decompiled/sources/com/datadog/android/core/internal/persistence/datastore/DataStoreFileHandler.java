package com.datadog.android.core.internal.persistence.datastore;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014JI\u0010\u001c\u001a\u00020\f\"\b\b\u0000\u0010\u0016*\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJM\u0010!\u001a\u00020\f\"\b\b\u0000\u0010\u0016*\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u00000\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*"}, d2 = {"Lcom/datadog/android/core/internal/persistence/datastore/DataStoreFileHandler;", "Lcom/datadog/android/api/storage/datastore/DataStoreHandler;", "Ljava/util/concurrent/ExecutorService;", "executorService", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/core/internal/persistence/datastore/DatastoreFileReader;", "dataStoreFileReader", "Lcom/datadog/android/core/internal/persistence/datastore/DatastoreFileWriter;", "datastoreFileWriter", "<init>", "(Ljava/util/concurrent/ExecutorService;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/core/internal/persistence/datastore/DatastoreFileReader;Lcom/datadog/android/core/internal/persistence/datastore/DatastoreFileWriter;)V", "", "clearAllData", "()V", "", "key", "Lcom/datadog/android/api/storage/datastore/DataStoreWriteCallback;", com.sun.jna.Callback.METHOD_NAME, "removeValue", "(Ljava/lang/String;Lcom/datadog/android/api/storage/datastore/DataStoreWriteCallback;)V", "", "T", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "version", "Lcom/datadog/android/core/persistence/Serializer;", "serializer", "setValue", "(Ljava/lang/String;Ljava/lang/Object;ILcom/datadog/android/api/storage/datastore/DataStoreWriteCallback;Lcom/datadog/android/core/persistence/Serializer;)V", "Lcom/datadog/android/api/storage/datastore/DataStoreReadCallback;", "Lcom/datadog/android/core/internal/persistence/Deserializer;", "deserializer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "(Ljava/lang/String;Ljava/lang/Integer;Lcom/datadog/android/api/storage/datastore/DataStoreReadCallback;Lcom/datadog/android/core/internal/persistence/Deserializer;)V", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/core/internal/persistence/datastore/DatastoreFileReader;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/core/internal/persistence/datastore/DatastoreFileWriter;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/concurrent/ExecutorService;", "getHighSpeedVideoSizes", "Lcom/datadog/android/api/InternalLogger;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DataStoreFileHandler implements com.datadog.android.api.storage.datastore.DataStoreHandler {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.core.internal.persistence.datastore.DatastoreFileWriter getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.core.internal.persistence.datastore.DatastoreFileReader getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.concurrent.ExecutorService getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger Camera2StreamConfigurationMap;

    public DataStoreFileHandler(java.util.concurrent.ExecutorService executorService, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.core.internal.persistence.datastore.DatastoreFileReader datastoreFileReader, com.datadog.android.core.internal.persistence.datastore.DatastoreFileWriter datastoreFileWriter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executorService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datastoreFileReader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datastoreFileWriter, "");
        this.getHighSpeedVideoFpsRanges = executorService;
        this.Camera2StreamConfigurationMap = internalLogger;
        this.getHighResolutionOutputSizeshNQ4ISI = datastoreFileReader;
        this.getHighSpeedVideoFpsRangesFor = datastoreFileWriter;
    }

    @Override // com.datadog.android.api.storage.datastore.DataStoreHandler
    public final <T> void setValue(final java.lang.String key, final T data, final int version, final com.datadog.android.api.storage.datastore.DataStoreWriteCallback callback, final com.datadog.android.core.persistence.Serializer<T> serializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        com.datadog.android.core.internal.utils.ConcurrencyExtKt.executeSafe(this.getHighSpeedVideoFpsRanges, "dataStoreWrite", this.Camera2StreamConfigurationMap, new java.lang.Runnable() { // from class: com.datadog.android.core.internal.persistence.datastore.DataStoreFileHandler$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.datadog.android.core.internal.persistence.datastore.DataStoreFileHandler.this.getHighSpeedVideoFpsRangesFor.write$dd_sdk_android_core_release(key, data, serializer, callback, version);
            }
        });
    }

    @Override // com.datadog.android.api.storage.datastore.DataStoreHandler
    public final void removeValue(final java.lang.String key, final com.datadog.android.api.storage.datastore.DataStoreWriteCallback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        com.datadog.android.core.internal.utils.ConcurrencyExtKt.executeSafe(this.getHighSpeedVideoFpsRanges, "dataStoreRemove", this.Camera2StreamConfigurationMap, new java.lang.Runnable() { // from class: com.datadog.android.core.internal.persistence.datastore.DataStoreFileHandler$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.datadog.android.core.internal.persistence.datastore.DataStoreFileHandler.this.getHighSpeedVideoFpsRangesFor.delete$dd_sdk_android_core_release(key, callback);
            }
        });
    }

    @Override // com.datadog.android.api.storage.datastore.DataStoreHandler
    public final void clearAllData() {
        com.datadog.android.core.internal.utils.ConcurrencyExtKt.executeSafe(this.getHighSpeedVideoFpsRanges, "dataStoreClearAllData", this.Camera2StreamConfigurationMap, new java.lang.Runnable() { // from class: com.datadog.android.core.internal.persistence.datastore.DataStoreFileHandler$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.datadog.android.core.internal.persistence.datastore.DataStoreFileHandler.this.getHighSpeedVideoFpsRangesFor.clearAllData$dd_sdk_android_core_release();
            }
        });
    }

    @Override // com.datadog.android.api.storage.datastore.DataStoreHandler
    public final <T> void value(final java.lang.String key, final java.lang.Integer version, final com.datadog.android.api.storage.datastore.DataStoreReadCallback<T> callback, final com.datadog.android.core.internal.persistence.Deserializer<java.lang.String, T> deserializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "");
        com.datadog.android.core.internal.utils.ConcurrencyExtKt.executeSafe(this.getHighSpeedVideoFpsRanges, "dataStoreRead", this.Camera2StreamConfigurationMap, new java.lang.Runnable() { // from class: com.datadog.android.core.internal.persistence.datastore.DataStoreFileHandler$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.datadog.android.core.internal.persistence.datastore.DataStoreFileHandler.this.getHighResolutionOutputSizeshNQ4ISI.read$dd_sdk_android_core_release(key, deserializer, version, callback);
            }
        });
    }
}
