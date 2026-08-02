package com.paypal.oslo.feature.identity.connect.inboundconnect.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.connect.inboundconnect.domain.usecase.InboundConnectUseCase", f = "InboundConnectUseCase.kt", i = {0, 0}, l = {70}, m = "invoke", n = {"request", "webSessionContext"}, nl = {106}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes12.dex */
final class InboundConnectUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.identity.connect.inboundconnect.domain.usecase.InboundConnectUseCase getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InboundConnectUseCase$invoke$1(com.paypal.oslo.feature.identity.connect.inboundconnect.domain.usecase.InboundConnectUseCase inboundConnectUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.connect.inboundconnect.domain.usecase.InboundConnectUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = inboundConnectUseCase;
    }
}
