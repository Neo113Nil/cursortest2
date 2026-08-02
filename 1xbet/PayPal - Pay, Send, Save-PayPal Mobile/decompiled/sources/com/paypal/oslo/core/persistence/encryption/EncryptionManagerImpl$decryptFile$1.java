package com.paypal.oslo.core.persistence.encryption;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.persistence.encryption.EncryptionManagerImpl", f = "EncryptionManagerImpl.kt", i = {0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, m = "decryptFile", n = {"src", "dest", "aad", "$this$decryptFile_u24lambda_u240", "$i$a$-runCatching-EncryptionManagerImpl$decryptFile$2"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
/* loaded from: classes5.dex */
final class EncryptionManagerImpl$decryptFile$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    int getOutputFormats;
    final /* synthetic */ com.paypal.oslo.core.persistence.encryption.EncryptionManagerImpl getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.decryptFile(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EncryptionManagerImpl$decryptFile$1(com.paypal.oslo.core.persistence.encryption.EncryptionManagerImpl encryptionManagerImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.persistence.encryption.EncryptionManagerImpl$decryptFile$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = encryptionManagerImpl;
    }
}
