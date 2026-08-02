package com.paypal.oslo.feature.taptopay.data.repository.paypal.card;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepository", f = "RemotePayPalCardRepository.kt", i = {0, 1, 1, 1, 1}, l = {369, 376}, m = "closeCards", n = {"deviceId", "deviceId", "deviceInfo", "input", "mutation"}, nl = {com.knotapi.knot.utilities.Constants.ID_KROGER, 446}, s = {"L$0", "L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes5.dex */
final class RemotePayPalCardRepository$closeCards$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepository getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getOutputFormats.closeCards(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemotePayPalCardRepository$closeCards$1(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepository remotePayPalCardRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepository$closeCards$1> continuation) {
        super(continuation);
        this.getOutputFormats = remotePayPalCardRepository;
    }
}
