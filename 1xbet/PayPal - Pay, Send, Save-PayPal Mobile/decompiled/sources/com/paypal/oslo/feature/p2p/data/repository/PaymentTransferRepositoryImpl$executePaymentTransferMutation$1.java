package com.paypal.oslo.feature.p2p.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl", f = "PaymentTransferRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m = "executePaymentTransferMutation", n = {"input", "combineError$iv", "state$iv", "raise$iv$iv$iv", "$this$ior_u24lambda_u240$iv", "$this$executePaymentTransferMutation_u24lambda_u241", "$i$f$ior", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-_foldOrThrow-RaiseKt__BuildersKt$ior$1$iv", "$i$a$-ior-PaymentTransferRepositoryImpl$executePaymentTransferMutation$3"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "I$3", "I$4"}, v = 2)
/* loaded from: classes5.dex */
final class PaymentTransferRepositoryImpl$executePaymentTransferMutation$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
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
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    /* synthetic */ java.lang.Object getOutputSizes;
    final /* synthetic */ com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    int getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getOutputSizes = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getOutputSizeshNQ4ISI.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentTransferRepositoryImpl$executePaymentTransferMutation$1(com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl paymentTransferRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl$executePaymentTransferMutation$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = paymentTransferRepositoryImpl;
    }
}
