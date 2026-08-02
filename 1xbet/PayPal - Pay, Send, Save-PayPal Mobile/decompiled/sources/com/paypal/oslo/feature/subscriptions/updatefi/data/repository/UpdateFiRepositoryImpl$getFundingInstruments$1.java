package com.paypal.oslo.feature.subscriptions.updatefi.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl", f = "UpdateFiRepositoryImpl.kt", i = {0, 0, 0}, l = {51}, m = "getFundingInstruments", n = {"agreementIds", "agreementType", "query"}, nl = {69}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes15.dex */
final class UpdateFiRepositoryImpl$getFundingInstruments$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getOutputFormats.getFundingInstruments(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateFiRepositoryImpl$getFundingInstruments$1(com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl updateFiRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl$getFundingInstruments$1> continuation) {
        super(continuation);
        this.getOutputFormats = updateFiRepositoryImpl;
    }
}
