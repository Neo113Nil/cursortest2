package com.paypal.oslo.feature.taptopay.domain.observer.paypal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver", f = "SetDefaultCardOnCardStateChangeObserver.kt", i = {1, 1, 1, 1, 1, 1, 1}, l = {104, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m = "handleCardStateChanged", n = {"this_$iv", "cards", "card", "cardId", "$i$f$fold", "$i$a$-fold-SetDefaultCardOnCardStateChangeObserver$handleCardStateChanged$3", "$i$a$-let-SetDefaultCardOnCardStateChangeObserver$handleCardStateChanged$3$3"}, nl = {174, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes15.dex */
final class SetDefaultCardOnCardStateChangeObserver$handleCardStateChanged$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver.access$handleCardStateChanged(this.getOutputFormats, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SetDefaultCardOnCardStateChangeObserver$handleCardStateChanged$1(com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver setDefaultCardOnCardStateChangeObserver, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$handleCardStateChanged$1> continuation) {
        super(continuation);
        this.getOutputFormats = setDefaultCardOnCardStateChangeObserver;
    }
}
