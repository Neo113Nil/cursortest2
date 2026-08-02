package com.paypal.oslo.feature.bnplservicing.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPlanDetailsOverviewUseCase", f = "GetPlanDetailsOverviewUseCase.kt", i = {0}, l = {45}, m = "invoke", n = {"request"}, nl = {46}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class GetPlanDetailsOverviewUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPlanDetailsOverviewUseCase getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.invoke2((java.lang.String) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetPlanDetailsOverviewUseCase$invoke$1(com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPlanDetailsOverviewUseCase getPlanDetailsOverviewUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPlanDetailsOverviewUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = getPlanDetailsOverviewUseCase;
    }
}
