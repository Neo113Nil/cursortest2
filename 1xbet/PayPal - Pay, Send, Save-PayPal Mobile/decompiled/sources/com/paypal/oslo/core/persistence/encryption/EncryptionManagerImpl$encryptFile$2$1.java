package com.paypal.oslo.core.persistence.encryption;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.persistence.encryption.EncryptionManagerImpl$encryptFile$2$1", f = "EncryptionManagerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class EncryptionManagerImpl$encryptFile$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either>, java.lang.Object> {
    final /* synthetic */ byte[] Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.persistence.encryption.EncryptionManagerImpl getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.io.File getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.io.File getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.persistence.encryption.EncryptionConfig encryptionConfig;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            encryptionConfig = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(encryptionConfig.getTransformation());
            com.paypal.oslo.core.persistence.encryption.EncryptionManagerImpl encryptionManagerImpl = this.getHighResolutionOutputSizeshNQ4ISI;
            byte[] bArr = this.Camera2StreamConfigurationMap;
            java.io.File file = this.getHighSpeedVideoFpsRangesFor;
            java.io.File file2 = this.getHighSpeedVideoSizes;
            cipher.init(1, com.paypal.oslo.core.persistence.encryption.EncryptionManagerImpl.access$getSecretKey(encryptionManagerImpl));
            if (bArr != null) {
                cipher.updateAAD(bArr);
            }
            javax.crypto.CipherOutputStream fileInputStream = new java.io.FileInputStream(file);
            try {
                java.io.FileInputStream fileInputStream2 = fileInputStream;
                fileInputStream = new java.io.FileOutputStream(file2);
                try {
                    java.io.FileOutputStream fileOutputStream = fileInputStream;
                    fileOutputStream.write(cipher.getIV());
                    fileInputStream = new javax.crypto.CipherOutputStream(fileOutputStream, cipher);
                    try {
                        kotlin.io.ByteStreamsKt.copyTo(fileInputStream2, fileInputStream, 8192);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        kotlin.io.CloseableKt.closeFinally(fileInputStream, null);
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        kotlin.io.CloseableKt.closeFinally(fileInputStream, null);
                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        kotlin.io.CloseableKt.closeFinally(fileInputStream, null);
                        return arrow.core.EitherKt.right(this.getHighSpeedVideoSizes);
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } else {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either> continuation) {
        return ((com.paypal.oslo.core.persistence.encryption.EncryptionManagerImpl$encryptFile$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.persistence.encryption.EncryptionManagerImpl$encryptFile$2$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EncryptionManagerImpl$encryptFile$2$1(com.paypal.oslo.core.persistence.encryption.EncryptionManagerImpl encryptionManagerImpl, java.io.File file, byte[] bArr, java.io.File file2, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.persistence.encryption.EncryptionManagerImpl$encryptFile$2$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = encryptionManagerImpl;
        this.getHighSpeedVideoSizes = file;
        this.Camera2StreamConfigurationMap = bArr;
        this.getHighSpeedVideoFpsRangesFor = file2;
    }
}
