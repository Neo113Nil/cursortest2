package com.paypal.oslo.core.persistence.domain.repository;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0010\u0010\fJ*\u0010\u0012\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0014\u0010\u000eJ\"\u0010\u0015\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0015\u0010\u000eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/persistence/domain/repository/FileOperationsRepository;", "", "", "temp", "", "", "listFiles", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fileName", "content", "Ljava/io/File;", "createTextFile", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readTextFile", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "appendToTextFile", "", "createBinaryFile", "(Ljava/lang/String;[BZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readBinaryFile", "deleteFile"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface FileOperationsRepository {
    java.lang.Object appendToTextFile(java.lang.String str, java.lang.String str2, boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object createBinaryFile(java.lang.String str, byte[] bArr, boolean z, kotlin.coroutines.Continuation<? super java.io.File> continuation);

    java.lang.Object createTextFile(java.lang.String str, java.lang.String str2, boolean z, kotlin.coroutines.Continuation<? super java.io.File> continuation);

    java.lang.Object deleteFile(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object listFiles(boolean z, kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> continuation);

    java.lang.Object readBinaryFile(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super byte[]> continuation);

    java.lang.Object readTextFile(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super java.lang.String> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object listFiles$default(com.paypal.oslo.core.persistence.domain.repository.FileOperationsRepository fileOperationsRepository, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listFiles");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return fileOperationsRepository.listFiles(z, continuation);
    }

    static /* synthetic */ java.lang.Object createTextFile$default(com.paypal.oslo.core.persistence.domain.repository.FileOperationsRepository fileOperationsRepository, java.lang.String str, java.lang.String str2, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createTextFile");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return fileOperationsRepository.createTextFile(str, str2, z, continuation);
    }

    static /* synthetic */ java.lang.Object readTextFile$default(com.paypal.oslo.core.persistence.domain.repository.FileOperationsRepository fileOperationsRepository, java.lang.String str, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readTextFile");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return fileOperationsRepository.readTextFile(str, z, continuation);
    }

    static /* synthetic */ java.lang.Object appendToTextFile$default(com.paypal.oslo.core.persistence.domain.repository.FileOperationsRepository fileOperationsRepository, java.lang.String str, java.lang.String str2, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendToTextFile");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return fileOperationsRepository.appendToTextFile(str, str2, z, continuation);
    }

    static /* synthetic */ java.lang.Object createBinaryFile$default(com.paypal.oslo.core.persistence.domain.repository.FileOperationsRepository fileOperationsRepository, java.lang.String str, byte[] bArr, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createBinaryFile");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return fileOperationsRepository.createBinaryFile(str, bArr, z, continuation);
    }

    static /* synthetic */ java.lang.Object readBinaryFile$default(com.paypal.oslo.core.persistence.domain.repository.FileOperationsRepository fileOperationsRepository, java.lang.String str, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readBinaryFile");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return fileOperationsRepository.readBinaryFile(str, z, continuation);
    }

    static /* synthetic */ java.lang.Object deleteFile$default(com.paypal.oslo.core.persistence.domain.repository.FileOperationsRepository fileOperationsRepository, java.lang.String str, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteFile");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return fileOperationsRepository.deleteFile(str, z, continuation);
    }
}
