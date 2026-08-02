package com.datadog.android.core.internal.persistence.file.single;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0012\b\u0010\u0018\u0000 )*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001)B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016¢\u0006\u0004\b\u0016\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000e\u001a\u00020\r8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\f\u001a\u00020\u000b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010("}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/single/SingleItemDataWriter;", "", "T", "Lcom/datadog/android/core/internal/persistence/DataWriter;", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "fileOrchestrator", "Lcom/datadog/android/core/persistence/Serializer;", "serializer", "Lcom/datadog/android/core/internal/persistence/file/FileWriter;", "", "fileWriter", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "filePersistenceConfig", "<init>", "(Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;Lcom/datadog/android/core/persistence/Serializer;Lcom/datadog/android/core/internal/persistence/file/FileWriter;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;)V", "p0", "", "getHighSpeedVideoSizes", "(Ljava/lang/Object;)V", "element", "write", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/util/List;)V", "Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "getFileOrchestrator$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FileOrchestrator;", "Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "getFilePersistenceConfig$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "Lcom/datadog/android/core/internal/persistence/file/FileWriter;", "getFileWriter$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FileWriter;", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger$dd_sdk_android_core_release", "()Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/core/persistence/Serializer;", "getSerializer$dd_sdk_android_core_release", "()Lcom/datadog/android/core/persistence/Serializer;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public class SingleItemDataWriter<T> implements com.datadog.android.core.internal.persistence.DataWriter<T> {
    public static final java.lang.String ERROR_LARGE_DATA = "Can't write data with size %d (max item size is %d)";
    private final com.datadog.android.core.internal.persistence.file.FileOrchestrator fileOrchestrator;
    private final com.datadog.android.core.internal.persistence.file.FilePersistenceConfig filePersistenceConfig;
    private final com.datadog.android.core.internal.persistence.file.FileWriter<byte[]> fileWriter;
    private final com.datadog.android.api.InternalLogger internalLogger;
    private final com.datadog.android.core.persistence.Serializer<T> serializer;

    public SingleItemDataWriter(com.datadog.android.core.internal.persistence.file.FileOrchestrator fileOrchestrator, com.datadog.android.core.persistence.Serializer<T> serializer, com.datadog.android.core.internal.persistence.file.FileWriter<byte[]> fileWriter, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.core.internal.persistence.file.FilePersistenceConfig filePersistenceConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileOrchestrator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePersistenceConfig, "");
        this.fileOrchestrator = fileOrchestrator;
        this.serializer = serializer;
        this.fileWriter = fileWriter;
        this.internalLogger = internalLogger;
        this.filePersistenceConfig = filePersistenceConfig;
    }

    /* renamed from: getFileOrchestrator$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.persistence.file.FileOrchestrator getFileOrchestrator() {
        return this.fileOrchestrator;
    }

    public final com.datadog.android.core.persistence.Serializer<T> getSerializer$dd_sdk_android_core_release() {
        return this.serializer;
    }

    public final com.datadog.android.core.internal.persistence.file.FileWriter<byte[]> getFileWriter$dd_sdk_android_core_release() {
        return this.fileWriter;
    }

    /* renamed from: getInternalLogger$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.api.InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    /* renamed from: getFilePersistenceConfig$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.persistence.file.FilePersistenceConfig getFilePersistenceConfig() {
        return this.filePersistenceConfig;
    }

    @Override // com.datadog.android.core.internal.persistence.DataWriter
    public void write(T element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
        getHighSpeedVideoSizes(element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.datadog.android.core.internal.persistence.DataWriter
    public void write(java.util.List<? extends T> data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.lang.Object lastOrNull = kotlin.collections.CollectionsKt.lastOrNull((java.util.List<? extends java.lang.Object>) data);
        if (lastOrNull == null) {
            return;
        }
        getHighSpeedVideoSizes(lastOrNull);
    }

    private final void getHighSpeedVideoSizes(T p0) {
        byte[] serializeToByteArray = com.datadog.android.core.persistence.SerializerKt.serializeToByteArray(this.serializer, p0, this.internalLogger);
        if (serializeToByteArray == null) {
            return;
        }
        synchronized (this) {
            final int length = serializeToByteArray.length;
            if (length <= this.filePersistenceConfig.getMaxItemSize()) {
                java.io.File writableFile = this.fileOrchestrator.getWritableFile();
                if (writableFile != null) {
                    this.fileWriter.writeData(writableFile, serializeToByteArray, false);
                }
            } else {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.USER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.single.SingleItemDataWriter$checkEventSize$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        java.lang.String format = java.lang.String.format(java.util.Locale.US, "Can't write data with size %d (max item size is %d)", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(length), java.lang.Long.valueOf(this.getFilePersistenceConfig().getMaxItemSize())}, 2));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                        return format;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            }
        }
    }
}
