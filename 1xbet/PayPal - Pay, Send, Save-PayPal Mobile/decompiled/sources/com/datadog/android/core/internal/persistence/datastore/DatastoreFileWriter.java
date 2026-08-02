package com.datadog.android.core.internal.persistence.datastore;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001)B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015JI\u0010\u001c\u001a\u00020\u000e\"\b\b\u0000\u0010\u0016*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00028\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010 \u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010%R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'"}, d2 = {"Lcom/datadog/android/core/internal/persistence/datastore/DatastoreFileWriter;", "", "Lcom/datadog/android/core/internal/persistence/datastore/DataStoreFileHelper;", "dataStoreFileHelper", "", "featureName", "Ljava/io/File;", "storageDir", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;", "fileReaderWriter", "<init>", "(Lcom/datadog/android/core/internal/persistence/datastore/DataStoreFileHelper;Ljava/lang/String;Ljava/io/File;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;)V", "", "clearAllData$dd_sdk_android_core_release", "()V", "key", "Lcom/datadog/android/api/storage/datastore/DataStoreWriteCallback;", com.sun.jna.Callback.METHOD_NAME, "delete$dd_sdk_android_core_release", "(Ljava/lang/String;Lcom/datadog/android/api/storage/datastore/DataStoreWriteCallback;)V", "T", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/datadog/android/core/persistence/Serializer;", "serializer", "", "version", "write$dd_sdk_android_core_release", "(Ljava/lang/String;Ljava/lang/Object;Lcom/datadog/android/core/persistence/Serializer;Lcom/datadog/android/api/storage/datastore/DataStoreWriteCallback;I)V", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/core/internal/persistence/datastore/DataStoreFileHelper;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;", "Lcom/datadog/android/api/InternalLogger;", "getInputSizeshNQ4ISI", "Ljava/io/File;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DatastoreFileWriter {
    public static final java.lang.String FAILED_TO_SERIALIZE_DATA_ERROR = "Write error - Failed to serialize data for the datastore";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;
    private final com.datadog.android.core.internal.persistence.file.FileReaderWriter getHighSpeedVideoFpsRanges;
    private final com.datadog.android.core.internal.persistence.datastore.DataStoreFileHelper getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.io.File Camera2StreamConfigurationMap;
    private static final byte[] Camera2StreamConfigurationMap = new byte[0];

    public DatastoreFileWriter(com.datadog.android.core.internal.persistence.datastore.DataStoreFileHelper dataStoreFileHelper, java.lang.String str, java.io.File file, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.core.internal.persistence.file.FileReaderWriter fileReaderWriter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataStoreFileHelper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileReaderWriter, "");
        this.getHighSpeedVideoFpsRangesFor = dataStoreFileHelper;
        this.getHighSpeedVideoSizes = str;
        this.Camera2StreamConfigurationMap = file;
        this.getHighResolutionOutputSizeshNQ4ISI = internalLogger;
        this.getHighSpeedVideoFpsRanges = fileReaderWriter;
    }

    public final <T> void write$dd_sdk_android_core_release(java.lang.String key, T data, com.datadog.android.core.persistence.Serializer<T> serializer, com.datadog.android.api.storage.datastore.DataStoreWriteCallback callback, int version) {
        byte[] bArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        java.io.File dataStoreFile$dd_sdk_android_core_release = this.getHighSpeedVideoFpsRangesFor.getDataStoreFile$dd_sdk_android_core_release(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, key);
        byte[] bArr2 = null;
        byte[] serialize$dd_sdk_android_core_release$default = com.datadog.android.core.internal.persistence.tlvformat.TLVBlock.serialize$dd_sdk_android_core_release$default(new com.datadog.android.core.internal.persistence.tlvformat.TLVBlock(com.datadog.android.core.internal.persistence.tlvformat.TLVBlockType.VERSION_CODE, com.datadog.android.core.internal.utils.NumberExtKt.toByteArray(version), this.getHighResolutionOutputSizeshNQ4ISI), 0, 1, null);
        java.lang.String serialize = serializer.serialize(data);
        if (serialize != null) {
            bArr = serialize.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArr, "");
        } else {
            bArr = null;
        }
        if (bArr != null) {
            bArr2 = com.datadog.android.core.internal.persistence.tlvformat.TLVBlock.serialize$dd_sdk_android_core_release$default(new com.datadog.android.core.internal.persistence.tlvformat.TLVBlock(com.datadog.android.core.internal.persistence.tlvformat.TLVBlockType.DATA, bArr, this.getHighResolutionOutputSizeshNQ4ISI), 0, 1, null);
        } else {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.datastore.DatastoreFileWriter$logFailedToSerializeDataError$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.core.internal.persistence.datastore.DatastoreFileWriter.FAILED_TO_SERIALIZE_DATA_ERROR;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        }
        if (serialize$dd_sdk_android_core_release$default == null || bArr2 == null) {
            if (callback != null) {
                callback.onFailure();
                return;
            }
            return;
        }
        if (this.getHighSpeedVideoFpsRanges.writeData(dataStoreFile$dd_sdk_android_core_release, com.datadog.android.core.internal.utils.ByteArrayExtKt.join$default(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new byte[][]{serialize$dd_sdk_android_core_release$default, bArr2}), Camera2StreamConfigurationMap, null, null, this.getHighResolutionOutputSizeshNQ4ISI, 6, null), false)) {
            if (callback != null) {
                callback.onSuccess();
            }
        } else if (callback != null) {
            callback.onFailure();
        }
    }

    public final void delete$dd_sdk_android_core_release(java.lang.String key, com.datadog.android.api.storage.datastore.DataStoreWriteCallback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.io.File dataStoreFile$dd_sdk_android_core_release = this.getHighSpeedVideoFpsRangesFor.getDataStoreFile$dd_sdk_android_core_release(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, key);
        if (com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(dataStoreFile$dd_sdk_android_core_release, this.getHighResolutionOutputSizeshNQ4ISI)) {
            if (com.datadog.android.core.internal.persistence.file.FileExtKt.deleteSafe(dataStoreFile$dd_sdk_android_core_release, this.getHighResolutionOutputSizeshNQ4ISI)) {
                if (callback != null) {
                    callback.onSuccess();
                }
            } else if (callback != null) {
                callback.onFailure();
            }
        }
    }

    public final void clearAllData$dd_sdk_android_core_release() {
        java.io.File dataStoreDirectory$dd_sdk_android_core_release = this.getHighSpeedVideoFpsRangesFor.getDataStoreDirectory$dd_sdk_android_core_release(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
        if (com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(dataStoreDirectory$dd_sdk_android_core_release, this.getHighResolutionOutputSizeshNQ4ISI)) {
            com.datadog.android.core.internal.persistence.file.FileExtKt.deleteDirectoryContentsSafe(dataStoreDirectory$dd_sdk_android_core_release, this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }
}
