package com.datadog.android.core.internal.persistence.datastore;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJO\u0010\u0017\u001a\u00020\u0016\"\b\b\u0000\u0010\u000e*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\""}, d2 = {"Lcom/datadog/android/core/internal/persistence/datastore/DatastoreFileReader;", "", "Lcom/datadog/android/core/internal/persistence/datastore/DataStoreFileHelper;", "dataStoreFileHelper", "", "featureName", "Ljava/io/File;", "storageDir", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockFileReader;", "tlvBlockFileReader", "<init>", "(Lcom/datadog/android/core/internal/persistence/datastore/DataStoreFileHelper;Ljava/lang/String;Ljava/io/File;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockFileReader;)V", "T", "key", "Lcom/datadog/android/core/internal/persistence/Deserializer;", "deserializer", "", "version", "Lcom/datadog/android/api/storage/datastore/DataStoreReadCallback;", com.sun.jna.Callback.METHOD_NAME, "", "read$dd_sdk_android_core_release", "(Ljava/lang/String;Lcom/datadog/android/core/internal/persistence/Deserializer;Ljava/lang/Integer;Lcom/datadog/android/api/storage/datastore/DataStoreReadCallback;)V", "Camera2StreamConfigurationMap", "Lcom/datadog/android/core/internal/persistence/datastore/DataStoreFileHelper;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoFpsRanges", "Ljava/io/File;", "Lcom/datadog/android/core/internal/persistence/tlvformat/TLVBlockFileReader;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DatastoreFileReader {
    public static final java.lang.String INVALID_NUMBER_OF_BLOCKS_ERROR = "Read error - datastore entry has invalid number of blocks. Was: %d, expected: %d";
    public static final java.lang.String UNEXPECTED_BLOCKS_ORDER_ERROR = "Read error - blocks are in an unexpected order";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.core.internal.persistence.datastore.DataStoreFileHelper getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.core.internal.persistence.tlvformat.TLVBlockFileReader Camera2StreamConfigurationMap;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.io.File getHighResolutionOutputSizeshNQ4ISI;

    public DatastoreFileReader(com.datadog.android.core.internal.persistence.datastore.DataStoreFileHelper dataStoreFileHelper, java.lang.String str, java.io.File file, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.core.internal.persistence.tlvformat.TLVBlockFileReader tLVBlockFileReader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataStoreFileHelper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tLVBlockFileReader, "");
        this.getHighSpeedVideoSizes = dataStoreFileHelper;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighResolutionOutputSizeshNQ4ISI = file;
        this.getHighSpeedVideoFpsRanges = internalLogger;
        this.Camera2StreamConfigurationMap = tLVBlockFileReader;
    }

    public static /* synthetic */ void read$dd_sdk_android_core_release$default(com.datadog.android.core.internal.persistence.datastore.DatastoreFileReader datastoreFileReader, java.lang.String str, com.datadog.android.core.internal.persistence.Deserializer deserializer, java.lang.Integer num, com.datadog.android.api.storage.datastore.DataStoreReadCallback dataStoreReadCallback, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        datastoreFileReader.read$dd_sdk_android_core_release(str, deserializer, num, dataStoreReadCallback);
    }

    public final <T> void read$dd_sdk_android_core_release(java.lang.String key, com.datadog.android.core.internal.persistence.Deserializer<java.lang.String, T> deserializer, java.lang.Integer version, com.datadog.android.api.storage.datastore.DataStoreReadCallback<T> callback) {
        com.datadog.android.core.persistence.datastore.DataStoreContent<T> dataStoreContent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        java.io.File dataStoreFile$dd_sdk_android_core_release = this.getHighSpeedVideoSizes.getDataStoreFile$dd_sdk_android_core_release(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, key);
        if (!com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(dataStoreFile$dd_sdk_android_core_release, this.getHighSpeedVideoFpsRanges)) {
            callback.onSuccess(null);
            return;
        }
        java.util.List<com.datadog.android.core.internal.persistence.tlvformat.TLVBlock> read$dd_sdk_android_core_release = this.Camera2StreamConfigurationMap.read$dd_sdk_android_core_release(dataStoreFile$dd_sdk_android_core_release);
        final int size = read$dd_sdk_android_core_release.size();
        final int length = com.datadog.android.core.internal.persistence.tlvformat.TLVBlockType.values().length;
        if (size != length) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRanges, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.datastore.DatastoreFileReader$logInvalidNumberOfBlocksError$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.core.internal.persistence.datastore.DatastoreFileReader.INVALID_NUMBER_OF_BLOCKS_ERROR, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(length)}, 2));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            callback.onFailure();
            return;
        }
        if (read$dd_sdk_android_core_release.get(0).getType() == com.datadog.android.core.internal.persistence.tlvformat.TLVBlockType.VERSION_CODE || read$dd_sdk_android_core_release.get(1).getType() == com.datadog.android.core.internal.persistence.tlvformat.TLVBlockType.DATA) {
            dataStoreContent = new com.datadog.android.core.persistence.datastore.DataStoreContent<>(com.datadog.android.core.internal.utils.ByteArrayExtKt.toInt(read$dd_sdk_android_core_release.get(0).getData()), deserializer.deserialize(new java.lang.String(read$dd_sdk_android_core_release.get(1).getData(), kotlin.text.Charsets.UTF_8)));
        } else {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRanges, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.datastore.DatastoreFileReader$logBlocksInUnexpectedBlocksOrderError$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.core.internal.persistence.datastore.DatastoreFileReader.UNEXPECTED_BLOCKS_ORDER_ERROR;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            dataStoreContent = null;
        }
        if (dataStoreContent == null) {
            callback.onFailure();
            return;
        }
        if (version != null) {
            if (version.intValue() != dataStoreContent.getVersionCode()) {
                callback.onSuccess(null);
                return;
            }
        }
        callback.onSuccess(dataStoreContent);
    }
}
