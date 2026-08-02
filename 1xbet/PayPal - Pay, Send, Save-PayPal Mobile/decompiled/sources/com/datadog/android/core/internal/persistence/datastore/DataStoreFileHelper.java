package com.datadog.android.core.internal.persistence.datastore;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/datadog/android/core/internal/persistence/datastore/DataStoreFileHelper;", "", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "Ljava/io/File;", "storageDir", "", "featureName", "getDataStoreDirectory$dd_sdk_android_core_release", "(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;", "key", "getDataStoreFile$dd_sdk_android_core_release", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DataStoreFileHelper {
    public static final java.lang.String DATASTORE_FOLDER_NAME = "datastore_v%s";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoFpsRangesFor;

    public DataStoreFileHelper(com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighSpeedVideoFpsRangesFor = internalLogger;
    }

    public final java.io.File getDataStoreFile$dd_sdk_android_core_release(java.io.File storageDir, java.lang.String featureName, java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageDir, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return new java.io.File(getDataStoreDirectory$dd_sdk_android_core_release(storageDir, featureName), key);
    }

    public final java.io.File getDataStoreDirectory$dd_sdk_android_core_release(java.io.File storageDir, java.lang.String featureName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageDir, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureName, "");
        java.lang.String format = java.lang.String.format(java.util.Locale.US, DATASTORE_FOLDER_NAME, java.util.Arrays.copyOf(new java.lang.Object[]{0}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        java.io.File file = new java.io.File(new java.io.File(storageDir, format), featureName);
        if (!com.datadog.android.core.internal.persistence.file.FileExtKt.existsSafe(file, this.getHighSpeedVideoFpsRangesFor)) {
            com.datadog.android.core.internal.persistence.file.FileExtKt.mkdirsSafe(file, this.getHighSpeedVideoFpsRangesFor);
        }
        return file;
    }
}
