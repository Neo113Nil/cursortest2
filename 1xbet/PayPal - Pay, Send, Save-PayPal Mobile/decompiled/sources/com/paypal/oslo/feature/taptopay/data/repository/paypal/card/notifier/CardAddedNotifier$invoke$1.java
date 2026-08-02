package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardAddedNotifier", f = "CardAddedNotifier.kt", i = {0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {42, 48, 54}, m = "invoke$taptopay_prodRelease", n = {"cardIdGroup", "cardIdGroup", "$this$flatMap$iv", "digitizedCard", "$i$f$flatMap", "$i$a$-flatMap-CardAddedNotifier$invoke$3", "cardIdGroup", "$this$flatMap$iv", "digitizedCard", "$this$flatMap$iv", "cardMetadata", "$i$f$flatMap", "$i$a$-flatMap-CardAddedNotifier$invoke$3", "$i$f$flatMap", "$i$a$-flatMap-CardAddedNotifier$invoke$3$2"}, nl = {43, 49, 58}, s = {"L$0", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes15.dex */
final class CardAddedNotifier$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardAddedNotifier getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getOutputStallDuration.invoke$taptopay_prodRelease(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardAddedNotifier$invoke$1(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardAddedNotifier cardAddedNotifier, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardAddedNotifier$invoke$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = cardAddedNotifier;
    }
}
