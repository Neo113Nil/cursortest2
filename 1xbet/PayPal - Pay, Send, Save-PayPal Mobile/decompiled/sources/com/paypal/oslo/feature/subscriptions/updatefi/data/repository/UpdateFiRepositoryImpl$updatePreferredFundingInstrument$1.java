package com.paypal.oslo.feature.subscriptions.updatefi.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl", f = "UpdateFiRepositoryImpl.kt", i = {0, 0, 0, 0, 0}, l = {121}, m = "updatePreferredFundingInstrument", n = {"agreementIds", "fundingInstrumentId", "balancePreference", "agreementType", "mutation"}, nl = {144}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes15.dex */
final class UpdateFiRepositoryImpl$updatePreferredFundingInstrument$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl getInputSizeshNQ4ISI;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.updatePreferredFundingInstrument(null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateFiRepositoryImpl$updatePreferredFundingInstrument$1(com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl updateFiRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl$updatePreferredFundingInstrument$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = updateFiRepositoryImpl;
    }
}
