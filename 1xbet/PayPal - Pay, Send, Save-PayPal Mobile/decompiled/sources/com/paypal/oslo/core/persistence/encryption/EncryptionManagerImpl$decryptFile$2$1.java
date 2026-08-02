package com.paypal.oslo.core.persistence.encryption;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.persistence.encryption.EncryptionManagerImpl$decryptFile$2$1", f = "EncryptionManagerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class EncryptionManagerImpl$decryptFile$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.persistence.encryption.EncryptionManagerImpl getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.io.File getHighSpeedVideoFpsRanges;
    final /* synthetic */ byte[] getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.io.File getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.persistence.encryption.EncryptionConfig encryptionConfig;
        com.paypal.oslo.core.persistence.encryption.EncryptionConfig encryptionConfig2;
        com.paypal.oslo.core.persistence.encryption.EncryptionConfig encryptionConfig3;
        com.paypal.oslo.core.persistence.encryption.EncryptionConfig encryptionConfig4;
        javax.crypto.spec.GCMParameterSpec gCMParameterSpec;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        javax.crypto.CipherInputStream fileInputStream = new java.io.FileInputStream(this.getHighSpeedVideoSizes);
        com.paypal.oslo.core.persistence.encryption.EncryptionManagerImpl encryptionManagerImpl = this.getHighResolutionOutputSizeshNQ4ISI;
        java.io.File file = this.getHighSpeedVideoFpsRanges;
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        try {
            java.io.FileInputStream fileInputStream2 = fileInputStream;
            encryptionConfig = encryptionManagerImpl.Camera2StreamConfigurationMap;
            byte[] bArr2 = new byte[encryptionConfig.getIvSize()];
            fileInputStream2.read(bArr2);
            encryptionConfig2 = encryptionManagerImpl.Camera2StreamConfigurationMap;
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(encryptionConfig2.getTransformation());
            javax.crypto.SecretKey access$getSecretKey = com.paypal.oslo.core.persistence.encryption.EncryptionManagerImpl.access$getSecretKey(encryptionManagerImpl);
            encryptionConfig3 = encryptionManagerImpl.Camera2StreamConfigurationMap;
            int i = com.paypal.oslo.core.persistence.encryption.EncryptionManagerImpl$decryptFile$2$1.WhenMappings.$EnumSwitchMapping$0[encryptionConfig3.getBlockMode().ordinal()];
            if (i == 1) {
                encryptionConfig4 = encryptionManagerImpl.Camera2StreamConfigurationMap;
                gCMParameterSpec = new javax.crypto.spec.GCMParameterSpec(encryptionConfig4.getTagSize().getBits(), bArr2);
            } else {
                if (i != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                gCMParameterSpec = new javax.crypto.spec.IvParameterSpec(bArr2);
            }
            cipher.init(2, access$getSecretKey, gCMParameterSpec);
            if (bArr != null) {
                cipher.updateAAD(bArr);
            }
            fileInputStream = new java.io.FileOutputStream(file);
            try {
                java.io.FileOutputStream fileOutputStream = fileInputStream;
                fileInputStream = new javax.crypto.CipherInputStream(fileInputStream2, cipher);
                try {
                    kotlin.io.ByteStreamsKt.copyTo(fileInputStream, fileOutputStream, 8192);
                    kotlin.io.CloseableKt.closeFinally(fileInputStream, null);
                    kotlin.io.CloseableKt.closeFinally(fileInputStream, null);
                    kotlin.io.CloseableKt.closeFinally(fileInputStream, null);
                    return arrow.core.EitherKt.right(this.getHighSpeedVideoFpsRanges);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either> continuation) {
        return ((com.paypal.oslo.core.persistence.encryption.EncryptionManagerImpl$decryptFile$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.persistence.encryption.BlockMode.values().length];
            try {
                iArr[com.paypal.oslo.core.persistence.encryption.BlockMode.GCM.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.persistence.encryption.BlockMode.CBC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.persistence.encryption.EncryptionManagerImpl$decryptFile$2$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EncryptionManagerImpl$decryptFile$2$1(java.io.File file, java.io.File file2, com.paypal.oslo.core.persistence.encryption.EncryptionManagerImpl encryptionManagerImpl, byte[] bArr, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.persistence.encryption.EncryptionManagerImpl$decryptFile$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = file;
        this.getHighSpeedVideoFpsRanges = file2;
        this.getHighResolutionOutputSizeshNQ4ISI = encryptionManagerImpl;
        this.getHighSpeedVideoFpsRangesFor = bArr;
    }
}
