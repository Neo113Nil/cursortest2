package com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleEConsentContingencyUseCase", f = "HandleEConsentContingencyUseCase.kt", i = {0}, l = {28}, m = "invoke", n = {"contingencyInput"}, nl = {30}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class HandleEConsentContingencyUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleEConsentContingencyUseCase getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.invoke2((com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.EconsentContingencyInput) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandleEConsentContingencyUseCase$invoke$1(com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleEConsentContingencyUseCase handleEConsentContingencyUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleEConsentContingencyUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = handleEConsentContingencyUseCase;
    }
}
