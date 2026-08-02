package com.paypal.oslo.feature.cryptocurrency.data.repository.rollover;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.data.repository.rollover.CryptoRolloverRepositoryImpl", f = "CryptoRolloverRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {60}, m = "createRollover", n = {"claimCode", "dateOfBirth", "partner", "raise$iv$iv$iv", "$this$createRollover_u24lambda_u240", "mutation", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-CryptoRolloverRepositoryImpl$createRollover$2"}, nl = {62}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes12.dex */
final class CryptoRolloverRepositoryImpl$createRollover$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.data.repository.rollover.CryptoRolloverRepositoryImpl getOutputSizes;
    int getOutputStallDuration;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputStallDuration |= Integer.MIN_VALUE;
        return this.getOutputSizes.createRollover(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoRolloverRepositoryImpl$createRollover$1(com.paypal.oslo.feature.cryptocurrency.data.repository.rollover.CryptoRolloverRepositoryImpl cryptoRolloverRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.data.repository.rollover.CryptoRolloverRepositoryImpl$createRollover$1> continuation) {
        super(continuation);
        this.getOutputSizes = cryptoRolloverRepositoryImpl;
    }
}
