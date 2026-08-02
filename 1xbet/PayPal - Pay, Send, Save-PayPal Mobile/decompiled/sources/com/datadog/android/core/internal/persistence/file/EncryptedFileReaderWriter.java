package com.datadog.android.core.internal.persistence.file;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00018\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/datadog/android/core/internal/persistence/file/EncryptedFileReaderWriter;", "Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;", "Lcom/datadog/android/security/Encryption;", "encryption", "delegate", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/security/Encryption;Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;Lcom/datadog/android/api/InternalLogger;)V", "Ljava/io/File;", "file", "", "readData", "(Ljava/io/File;)[B", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "append", "writeData", "(Ljava/io/File;[BZ)Z", "Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;", "getDelegate$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/persistence/file/FileReaderWriter;", "Lcom/datadog/android/security/Encryption;", "getEncryption$dd_sdk_android_core_release", "()Lcom/datadog/android/security/Encryption;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EncryptedFileReaderWriter implements com.datadog.android.core.internal.persistence.file.FileReaderWriter {
    public static final java.lang.String APPEND_MODE_NOT_SUPPORTED_MESSAGE = "Append mode is not supported, use EncryptedBatchFileReaderWriter instead.";
    public static final java.lang.String BAD_ENCRYPTION_RESULT_MESSAGE = "Encryption of non-empty data produced empty result, aborting write operation.";
    private final com.datadog.android.core.internal.persistence.file.FileReaderWriter delegate;
    private final com.datadog.android.security.Encryption encryption;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoFpsRangesFor;

    public EncryptedFileReaderWriter(com.datadog.android.security.Encryption encryption, com.datadog.android.core.internal.persistence.file.FileReaderWriter fileReaderWriter, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encryption, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileReaderWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.encryption = encryption;
        this.delegate = fileReaderWriter;
        this.getHighSpeedVideoFpsRangesFor = internalLogger;
    }

    /* renamed from: getEncryption$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.security.Encryption getEncryption() {
        return this.encryption;
    }

    /* renamed from: getDelegate$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.core.internal.persistence.file.FileReaderWriter getDelegate() {
        return this.delegate;
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileWriter
    public final boolean writeData(java.io.File file, byte[] data, boolean append) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        if (append) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.EncryptedFileReaderWriter$writeData$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.core.internal.persistence.file.EncryptedFileReaderWriter.APPEND_MODE_NOT_SUPPORTED_MESSAGE;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return false;
        }
        byte[] encrypt = this.encryption.encrypt(data);
        if (data.length != 0 && encrypt.length == 0) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.persistence.file.EncryptedFileReaderWriter$writeData$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Encryption of non-empty data produced empty result, aborting write operation.";
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return false;
        }
        return this.delegate.writeData(file, encrypt, append);
    }

    @Override // com.datadog.android.core.internal.persistence.file.FileReader
    public final byte[] readData(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        return this.encryption.decrypt(this.delegate.readData(file));
    }
}
