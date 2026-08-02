package com.paypal.oslo.feature.taptopay.domain.usecase.card;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase", f = "GetAllCardsUseCase.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {48, 52}, m = "invoke", n = {"getCardArt", "waitForRefresh", "this_$iv", "$this$flatMap$iv$iv", "it$iv", "digitizedCards", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "card", "getCardArt", "waitForRefresh", "$i$f$map", "$i$f$flatMap", "$i$a$-flatMap-Either$map$1$iv", "$i$a$-map-GetAllCardsUseCase$invoke$2", "$i$f$map", "$i$f$mapTo", "$i$a$-map-GetAllCardsUseCase$invoke$2$1"}, nl = {49, 53}, s = {"Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$8", "L$9", "Z$0", "Z$1", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6"}, v = 2)
/* loaded from: classes15.dex */
final class GetAllCardsUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object CoroutineDebuggingKt;
    int coroutineBoundary;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase coroutineCreation;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    java.lang.Object getValidOutputFormatsForInputhNQ4ISI;
    java.lang.Object isOutputSupportedFor;
    boolean isOutputSupportedForhNQ4ISI;
    java.lang.Object toString;
    boolean unwrapAs;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.CoroutineDebuggingKt = obj;
        this.coroutineBoundary |= Integer.MIN_VALUE;
        return this.coroutineCreation.invoke(false, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetAllCardsUseCase$invoke$1(com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase getAllCardsUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase$invoke$1> continuation) {
        super(continuation);
        this.coroutineCreation = getAllCardsUseCase;
    }
}
