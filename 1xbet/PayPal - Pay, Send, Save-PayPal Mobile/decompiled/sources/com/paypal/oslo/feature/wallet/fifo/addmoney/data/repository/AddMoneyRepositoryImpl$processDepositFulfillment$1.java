package com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl", f = "AddMoneyRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE}, m = "processDepositFulfillment", n = {"input", "combineError$iv", "state$iv", "raise$iv$iv$iv", "$this$ior_u24lambda_u240$iv", "$this$processDepositFulfillment_u24lambda_u241", "addDepositInput", "mutation", "$i$f$ior", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-_foldOrThrow-RaiseKt__BuildersKt$ior$1$iv", "$i$a$-ior-AddMoneyRepositoryImpl$processDepositFulfillment$3"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2", "I$3", "I$4"}, v = 2)
/* loaded from: classes15.dex */
final class AddMoneyRepositoryImpl$processDepositFulfillment$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
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
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    int getOutputStallDurationlomOqCM;
    /* synthetic */ java.lang.Object isOutputSupportedFor;
    final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl isOutputSupportedForhNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.isOutputSupportedFor = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        return this.isOutputSupportedForhNQ4ISI.processDepositFulfillment(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddMoneyRepositoryImpl$processDepositFulfillment$1(com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl addMoneyRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.fifo.addmoney.data.repository.AddMoneyRepositoryImpl$processDepositFulfillment$1> continuation) {
        super(continuation);
        this.isOutputSupportedForhNQ4ISI = addMoneyRepositoryImpl;
    }
}
