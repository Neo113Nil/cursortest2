package com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.GetPrequalificationSummaryUseCase", f = "GetPrequalificationSummaryUseCase.kt", i = {0}, l = {53}, m = "invoke", n = {"request"}, nl = {55}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class GetPrequalificationSummaryUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.GetPrequalificationSummaryUseCase getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.invoke2((java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier>) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetPrequalificationSummaryUseCase$invoke$1(com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.GetPrequalificationSummaryUseCase getPrequalificationSummaryUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.GetPrequalificationSummaryUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = getPrequalificationSummaryUseCase;
    }
}
