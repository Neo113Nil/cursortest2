package com.paypal.android.taptopay.domain.repository.card;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.domain.repository.card.CardRepositoryWrapper$observeCardState$$inlined$flatMapLatest$1", f = "CardRepositoryWrapper.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class CardRepositoryWrapper$observeCardState$$inlined$flatMapLatest$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super com.paypal.android.taptopay.domain.model.card.CardStateChange>, java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.android.taptopay.domain.repository.card.CardRepositoryWrapper getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository;
        kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.card.CardStateChange> observeCardState;
        com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.Camera2StreamConfigurationMap;
            com.paypal.android.taptopay.domain.repository.card.CardRepositoryWrapper$observeCardState$$inlined$flatMapLatest$1 cardRepositoryWrapper$observeCardState$$inlined$flatMapLatest$1 = this;
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.String) this.getHighSpeedVideoFpsRanges, "payair")) {
                cardRepository2 = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
                observeCardState = cardRepository2.observeCardState();
            } else {
                cardRepository = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
                observeCardState = cardRepository.observeCardState();
            }
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (kotlinx.coroutines.flow.FlowKt.emitAll(flowCollector, observeCardState, cardRepositoryWrapper$observeCardState$$inlined$flatMapLatest$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.android.taptopay.domain.model.card.CardStateChange> flowCollector, java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.android.taptopay.domain.repository.card.CardRepositoryWrapper$observeCardState$$inlined$flatMapLatest$1 cardRepositoryWrapper$observeCardState$$inlined$flatMapLatest$1 = new com.paypal.android.taptopay.domain.repository.card.CardRepositoryWrapper$observeCardState$$inlined$flatMapLatest$1(continuation, this.getHighSpeedVideoSizes);
        cardRepositoryWrapper$observeCardState$$inlined$flatMapLatest$1.Camera2StreamConfigurationMap = flowCollector;
        cardRepositoryWrapper$observeCardState$$inlined$flatMapLatest$1.getHighSpeedVideoFpsRanges = str;
        return cardRepositoryWrapper$observeCardState$$inlined$flatMapLatest$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryWrapper$observeCardState$$inlined$flatMapLatest$1(kotlin.coroutines.Continuation continuation, com.paypal.android.taptopay.domain.repository.card.CardRepositoryWrapper cardRepositoryWrapper) {
        super(3, continuation);
        this.getHighSpeedVideoSizes = cardRepositoryWrapper;
    }
}
