package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardUpdatedNotifier", f = "CardUpdatedNotifier.kt", i = {0, 0, 1, 1, 1, 1, 1, 1}, l = {39, 45}, m = "invoke$taptopay_prodRelease", n = {"card", "digitizedCard", "card", "digitizedCard", "$this$flatMap$iv", "cardMetadata", "$i$f$flatMap", "$i$a$-flatMap-CardUpdatedNotifier$invoke$3"}, nl = {40, 49}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1"}, v = 2)
/* loaded from: classes15.dex */
final class CardUpdatedNotifier$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardUpdatedNotifier getInputFormats;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getInputFormats.invoke$taptopay_prodRelease(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardUpdatedNotifier$invoke$1(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardUpdatedNotifier cardUpdatedNotifier, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardUpdatedNotifier$invoke$1> continuation) {
        super(continuation);
        this.getInputFormats = cardUpdatedNotifier;
    }
}
