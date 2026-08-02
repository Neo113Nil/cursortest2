package com.paypal.oslo.feature.wallet.amexandp3.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.amexandp3.data.repository.ProvisionInstrumentsRepositoryImpl", f = "ProvisionInstrumentsRepositoryImpl.kt", i = {0}, l = {51}, m = "provisionEligibleInstruments", n = {"mutation"}, nl = {52}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class ProvisionInstrumentsRepositoryImpl$provisionEligibleInstruments$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.wallet.amexandp3.data.repository.ProvisionInstrumentsRepositoryImpl getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.provisionEligibleInstruments(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProvisionInstrumentsRepositoryImpl$provisionEligibleInstruments$1(com.paypal.oslo.feature.wallet.amexandp3.data.repository.ProvisionInstrumentsRepositoryImpl provisionInstrumentsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.amexandp3.data.repository.ProvisionInstrumentsRepositoryImpl$provisionEligibleInstruments$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = provisionInstrumentsRepositoryImpl;
    }
}
