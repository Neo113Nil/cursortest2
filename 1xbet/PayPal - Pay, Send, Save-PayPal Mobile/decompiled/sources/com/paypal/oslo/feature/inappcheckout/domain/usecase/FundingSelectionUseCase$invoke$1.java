package com.paypal.oslo.feature.inappcheckout.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase", f = "FundingSelectionUseCase.kt", i = {1}, l = {38, 40}, m = "invoke", n = {"result"}, nl = {39, 38}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class FundingSelectionUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FundingSelectionUseCase$invoke$1(com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase fundingSelectionUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = fundingSelectionUseCase;
    }
}
