package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/paypal/android/taptopay/domain/model/card/DigitizedCard;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ThalesGetDigitizedCardUseCase$invoke$2", f = "ThalesGetDigitizedCardUseCase.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class ThalesGetDigitizedCardUseCase$invoke$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.model.card.DigitizedCard>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesGetDigitizedCardUseCase getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Running ThalesGetDigitizedCardUseCase", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("tokenizedCardId", this.Camera2StreamConfigurationMap)), null, 4, null);
            if (kotlin.text.StringsKt.isBlank(this.Camera2StreamConfigurationMap)) {
                return null;
            }
            this.getHighSpeedVideoSizes = 1;
            obj = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return (com.paypal.android.taptopay.domain.model.card.DigitizedCard) obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.model.card.DigitizedCard> continuation) {
        return ((com.paypal.android.taptopay.data.thales.card.ThalesGetDigitizedCardUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.android.taptopay.data.thales.card.ThalesGetDigitizedCardUseCase$invoke$2(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesGetDigitizedCardUseCase$invoke$2(java.lang.String str, com.paypal.android.taptopay.data.thales.card.ThalesGetDigitizedCardUseCase thalesGetDigitizedCardUseCase, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ThalesGetDigitizedCardUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = str;
        this.getHighResolutionOutputSizeshNQ4ISI = thalesGetDigitizedCardUseCase;
    }
}
