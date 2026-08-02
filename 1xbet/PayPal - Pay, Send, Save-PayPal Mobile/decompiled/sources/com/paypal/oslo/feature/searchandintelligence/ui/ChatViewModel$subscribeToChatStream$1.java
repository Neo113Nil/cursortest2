package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$subscribeToChatStream$1", f = "ChatViewModel.kt", i = {}, l = {378}, m = "invokeSuspend", n = {}, nl = {390}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class ChatViewModel$subscribeToChatStream$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SubscribeToStream getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.searchandintelligence.domain.usecase.SubscribeToChatUseCase subscribeToChatUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            subscribeToChatUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.core.network.sse.domain.error.SseError, com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse>> invoke = subscribeToChatUseCase.invoke(this.getHighSpeedVideoFpsRanges.getSessionId(), this.getHighSpeedVideoFpsRanges.getInput());
            final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent, kotlin.Unit> function1 = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = 1;
            if (invoke.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$subscribeToChatStream$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    arrow.core.Either either = (arrow.core.Either) obj2;
                    kotlin.jvm.functions.Function1<com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent, kotlin.Unit> function12 = function1;
                    if (either instanceof arrow.core.Either.Right) {
                        function12.invoke(new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SseResponseReceived((com.paypal.oslo.feature.searchandintelligence.domain.model.SseResponse) ((arrow.core.Either.Right) either).getValue()));
                    } else if (either instanceof arrow.core.Either.Left) {
                        function12.invoke(new com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SseErrorReceived((com.paypal.oslo.core.network.sse.domain.error.SseError) ((arrow.core.Either.Left) either).getValue()));
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.Camera2StreamConfigurationMap.invoke(com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.StreamCompleted.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$subscribeToChatStream$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$subscribeToChatStream$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChatViewModel$subscribeToChatStream$1(com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel chatViewModel, com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent.SubscribeToStream subscribeToStream, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.searchandintelligence.ui.ChatEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$subscribeToChatStream$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = chatViewModel;
        this.getHighSpeedVideoFpsRanges = subscribeToStream;
        this.Camera2StreamConfigurationMap = function1;
    }
}
