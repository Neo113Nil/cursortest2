package com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel$loadFIMetadata$1", f = "CardSharedViewModel.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, nl = {59}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class CardSharedViewModel$loadFIMetadata$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.inappcheckout.domain.usecase.GetFIMetadataUseCase getFIMetadataUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getFIMetadataUseCase = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = getFIMetadataUseCase.invoke(this);
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
        com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel cardSharedViewModel = this.Camera2StreamConfigurationMap;
        if (either.isRight()) {
            com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity fIMetadataEntity = (com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity) ((arrow.core.Either.Right) either).getValue();
            mutableStateFlow2 = cardSharedViewModel.getHighSpeedVideoSizes;
            mutableStateFlow2.setValue(fIMetadataEntity);
        }
        com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel cardSharedViewModel2 = this.Camera2StreamConfigurationMap;
        if (either.isLeft()) {
            mutableStateFlow = cardSharedViewModel2.getHighSpeedVideoSizes;
            mutableStateFlow.setValue(null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel$loadFIMetadata$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel$loadFIMetadata$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardSharedViewModel$loadFIMetadata$1(com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel cardSharedViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel$loadFIMetadata$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = cardSharedViewModel;
    }
}
