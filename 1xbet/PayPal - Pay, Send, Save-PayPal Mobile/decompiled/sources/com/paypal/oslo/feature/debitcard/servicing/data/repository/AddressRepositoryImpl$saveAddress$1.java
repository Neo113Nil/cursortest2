package com.paypal.oslo.feature.debitcard.servicing.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.data.repository.AddressRepositoryImpl", f = "AddressRepositoryImpl.kt", i = {0, 0, 0}, l = {75}, m = "saveAddress", n = {"debitInstrumentId", "address", "input"}, nl = {80}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes5.dex */
final class AddressRepositoryImpl$saveAddress$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.data.repository.AddressRepositoryImpl getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.saveAddress(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressRepositoryImpl$saveAddress$1(com.paypal.oslo.feature.debitcard.servicing.data.repository.AddressRepositoryImpl addressRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.data.repository.AddressRepositoryImpl$saveAddress$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = addressRepositoryImpl;
    }
}
