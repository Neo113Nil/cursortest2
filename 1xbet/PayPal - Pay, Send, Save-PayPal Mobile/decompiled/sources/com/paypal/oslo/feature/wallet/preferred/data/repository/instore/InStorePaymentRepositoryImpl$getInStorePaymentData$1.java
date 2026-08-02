package com.paypal.oslo.feature.wallet.preferred.data.repository.instore;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.preferred.data.repository.instore.InStorePaymentRepositoryImpl", f = "InStorePaymentRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {48}, m = "getInStorePaymentData", n = {"combineError$iv", "state$iv", "raise$iv$iv$iv", "$this$ior_u24lambda_u240$iv", "$this$getInStorePaymentData_u24lambda_u241", "$i$f$ior", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-_foldOrThrow-RaiseKt__BuildersKt$ior$1$iv", "$i$a$-ior-InStorePaymentRepositoryImpl$getInStorePaymentData$3"}, nl = {52}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "I$4"}, v = 2)
/* loaded from: classes16.dex */
final class InStorePaymentRepositoryImpl$getInStorePaymentData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.wallet.preferred.data.repository.instore.InStorePaymentRepositoryImpl getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputStallDuration;
    int getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDuration = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDurationlomOqCM.getInStorePaymentData(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InStorePaymentRepositoryImpl$getInStorePaymentData$1(com.paypal.oslo.feature.wallet.preferred.data.repository.instore.InStorePaymentRepositoryImpl inStorePaymentRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.preferred.data.repository.instore.InStorePaymentRepositoryImpl$getInStorePaymentData$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDurationlomOqCM = inStorePaymentRepositoryImpl;
    }
}
