package com.paypal.oslo.core.persistence.encryption;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.persistence.encryption.EncryptionManagerImpl", f = "EncryptionManagerImpl.kt", i = {0, 0, 0, 0, 0}, l = {238}, m = "encryptFile", n = {"src", "dest", "aad", "$this$encryptFile_u24lambda_u240", "$i$a$-runCatching-EncryptionManagerImpl$encryptFile$2"}, nl = {256}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
/* loaded from: classes5.dex */
final class EncryptionManagerImpl$encryptFile$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.core.persistence.encryption.EncryptionManagerImpl getInputSizeshNQ4ISI;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.encryptFile(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EncryptionManagerImpl$encryptFile$1(com.paypal.oslo.core.persistence.encryption.EncryptionManagerImpl encryptionManagerImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.persistence.encryption.EncryptionManagerImpl$encryptFile$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = encryptionManagerImpl;
    }
}
