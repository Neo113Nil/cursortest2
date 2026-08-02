package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.domain.usecase.RemoveExistingPayLaterCardsUseCase", f = "RemoveExistingPayLaterCardsUseCase.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {41, 58}, m = "invoke", n = {"raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-RemoveExistingPayLaterCardsUseCase$invoke$2", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "$this$forEach$iv", "element$iv", "card", "allCards", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-RemoveExistingPayLaterCardsUseCase$invoke$2", "$i$f$forEach", "$i$a$-forEach-RemoveExistingPayLaterCardsUseCase$invoke$2$3"}, nl = {42, 59}, s = {"L$0", "L$1", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5"}, v = 2)
/* loaded from: classes11.dex */
final class RemoveExistingPayLaterCardsUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    int getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.usecase.RemoveExistingPayLaterCardsUseCase getValidOutputFormatsForInputhNQ4ISI;
    /* synthetic */ java.lang.Object unwrapAs;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.unwrapAs = obj;
        this.getOutputStallDuration |= Integer.MIN_VALUE;
        return this.getValidOutputFormatsForInputhNQ4ISI.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoveExistingPayLaterCardsUseCase$invoke$1(com.paypal.oslo.feature.bnplacquisition.domain.usecase.RemoveExistingPayLaterCardsUseCase removeExistingPayLaterCardsUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.usecase.RemoveExistingPayLaterCardsUseCase$invoke$1> continuation) {
        super(continuation);
        this.getValidOutputFormatsForInputhNQ4ISI = removeExistingPayLaterCardsUseCase;
    }
}
