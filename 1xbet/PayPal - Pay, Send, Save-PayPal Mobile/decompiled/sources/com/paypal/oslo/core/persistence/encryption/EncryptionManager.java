package com.paypal.oslo.core.persistence.encryption;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u0002\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\n*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J8\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0004\b\u0019\u0010\u001aJ8\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0004\b\u001b\u0010\u001aÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/persistence/encryption/EncryptionManager;", "", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "encryptData", "(Ljava/lang/String;)[B", "encryptedData", "decryptData", "([B)Ljava/lang/String;", "T", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "encryptValue", "(Ljava/lang/Object;)Ljava/lang/String;", "encryptedValue", "Lkotlin/reflect/KClass;", "typeClass", "decryptValue", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "Ljava/io/File;", "src", "dest", "aad", "Larrow/core/Either;", "Lcom/paypal/oslo/core/persistence/encryption/EncryptionError;", "encryptFile", "(Ljava/io/File;Ljava/io/File;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "decryptFile"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface EncryptionManager {
    java.lang.String decryptData(byte[] encryptedData);

    java.lang.Object decryptFile(java.io.File file, java.io.File file2, byte[] bArr, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.persistence.encryption.EncryptionError, ? extends java.io.File>> continuation);

    <T> T decryptValue(java.lang.String encryptedValue, kotlin.reflect.KClass<T> typeClass);

    byte[] encryptData(java.lang.String data);

    java.lang.Object encryptFile(java.io.File file, java.io.File file2, byte[] bArr, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.persistence.encryption.EncryptionError, ? extends java.io.File>> continuation);

    <T> java.lang.String encryptValue(T value);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object encryptFile$default(com.paypal.oslo.core.persistence.encryption.EncryptionManager encryptionManager, java.io.File file, java.io.File file2, byte[] bArr, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encryptFile");
        }
        if ((i & 4) != 0) {
            bArr = null;
        }
        return encryptionManager.encryptFile(file, file2, bArr, continuation);
    }

    static /* synthetic */ java.lang.Object decryptFile$default(com.paypal.oslo.core.persistence.encryption.EncryptionManager encryptionManager, java.io.File file, java.io.File file2, byte[] bArr, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decryptFile");
        }
        if ((i & 4) != 0) {
            bArr = null;
        }
        return encryptionManager.decryptFile(file, file2, bArr, continuation);
    }
}
