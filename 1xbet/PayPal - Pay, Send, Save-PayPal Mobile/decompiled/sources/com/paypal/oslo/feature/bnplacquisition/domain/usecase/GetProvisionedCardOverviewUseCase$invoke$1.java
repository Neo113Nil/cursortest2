package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetProvisionedCardOverviewUseCase", f = "GetProvisionedCardOverviewUseCase.kt", i = {0}, l = {26}, m = "invoke", n = {"request"}, nl = {-1}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class GetProvisionedCardOverviewUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetProvisionedCardOverviewUseCase Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.invoke2((com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ProvisionedCardOverviewRequest) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetProvisionedCardOverviewUseCase$invoke$1(com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetProvisionedCardOverviewUseCase getProvisionedCardOverviewUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetProvisionedCardOverviewUseCase$invoke$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = getProvisionedCardOverviewUseCase;
    }
}
