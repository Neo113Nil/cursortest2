package com.paypal.oslo.feature.taptopay.domain.api;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.api.GetAllCardsApiImpl", f = "GetAllCardsApiImpl.kt", i = {0, 0}, l = {33}, m = "invoke", n = {"getCardArt", "waitForRefresh"}, nl = {36}, s = {"Z$0", "Z$1"}, v = 2)
/* loaded from: classes15.dex */
final class GetAllCardsApiImpl$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    boolean Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.api.GetAllCardsApiImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.invoke(false, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetAllCardsApiImpl$invoke$1(com.paypal.oslo.feature.taptopay.domain.api.GetAllCardsApiImpl getAllCardsApiImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.api.GetAllCardsApiImpl$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = getAllCardsApiImpl;
    }
}
