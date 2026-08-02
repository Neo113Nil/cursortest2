package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.domain.usecase.UpdateApplicationAndFetchOffersUseCase", f = "UpdateApplicationAndFetchOffersUseCase.kt", i = {0}, l = {25}, m = "invoke", n = {"request"}, nl = {-1}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class UpdateApplicationAndFetchOffersUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.usecase.UpdateApplicationAndFetchOffersUseCase getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.invoke2((com.paypal.oslo.feature.bnplacquisition.domain.model.requests.AvailableOffersRequest) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateApplicationAndFetchOffersUseCase$invoke$1(com.paypal.oslo.feature.bnplacquisition.domain.usecase.UpdateApplicationAndFetchOffersUseCase updateApplicationAndFetchOffersUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.usecase.UpdateApplicationAndFetchOffersUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = updateApplicationAndFetchOffersUseCase;
    }
}
