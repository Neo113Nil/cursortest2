package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAccountSummaryUseCase", f = "GetAccountSummaryUseCase.kt", i = {0}, l = {50}, m = "invoke", n = {"request"}, nl = {51}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class GetAccountSummaryUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAccountSummaryUseCase Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetAccountSummaryUseCase$invoke$1(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAccountSummaryUseCase getAccountSummaryUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAccountSummaryUseCase$invoke$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = getAccountSummaryUseCase;
    }
}
