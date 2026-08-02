package com.paypal.oslo.feature.taptopay.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.mock.MockTapToPayService$processCommandApdu$1", f = "MockTapToPayService.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, nl = {90}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class MockTapToPayService$processCommandApdu$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.mock.MockTapToPayService getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            obj = this.getHighSpeedVideoFpsRanges.getCardRepository().getDefaultCard(this);
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
        com.paypal.oslo.feature.taptopay.data.repository.mock.MockTapToPayService mockTapToPayService = this.getHighSpeedVideoFpsRanges;
        if (either.isRight()) {
            com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) ((arrow.core.Either.Right) either).getValue();
            com.paypal.oslo.feature.taptopay.data.repository.mock.MockTapToPayService.access$notifyMockTransaction(mockTapToPayService, digitizedCard != null ? digitizedCard.getCardId() : null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.repository.mock.MockTapToPayService$processCommandApdu$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.data.repository.mock.MockTapToPayService$processCommandApdu$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockTapToPayService$processCommandApdu$1(com.paypal.oslo.feature.taptopay.data.repository.mock.MockTapToPayService mockTapToPayService, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.mock.MockTapToPayService$processCommandApdu$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = mockTapToPayService;
    }
}
