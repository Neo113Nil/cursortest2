package com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel$loadCardFormData$1", f = "CardSharedViewModel.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, nl = {46}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class CardSharedViewModel$loadCardFormData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase getCardFormDataUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
            getCardFormDataUseCase = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = getCardFormDataUseCase.invoke(this.getHighResolutionOutputSizeshNQ4ISI, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel cardSharedViewModel = this.getHighSpeedVideoFpsRangesFor;
        if (either.isRight()) {
            com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity cardFormDataEntity = (com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity) ((arrow.core.Either.Right) either).getValue();
            mutableStateFlow4 = cardSharedViewModel.Camera2StreamConfigurationMap;
            mutableStateFlow4.setValue(cardFormDataEntity);
        }
        com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel cardSharedViewModel2 = this.getHighSpeedVideoFpsRangesFor;
        if (either.isLeft()) {
            mutableStateFlow3 = cardSharedViewModel2.Camera2StreamConfigurationMap;
            mutableStateFlow3.setValue(null);
        }
        mutableStateFlow2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
        mutableStateFlow2.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel$loadCardFormData$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel$loadCardFormData$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardSharedViewModel$loadCardFormData$1(com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel cardSharedViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel$loadCardFormData$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = cardSharedViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }
}
