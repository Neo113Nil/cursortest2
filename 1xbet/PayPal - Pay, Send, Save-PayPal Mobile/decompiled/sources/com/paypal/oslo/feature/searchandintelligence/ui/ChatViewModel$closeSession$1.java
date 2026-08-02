package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$closeSession$1", f = "ChatViewModel.kt", i = {}, l = {431}, m = "invokeSuspend", n = {}, nl = {androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class ChatViewModel$closeSession$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.searchandintelligence.domain.usecase.CloseChatUseCase closeChatUseCase;
        com.paypal.oslo.feature.searchandintelligence.ui.ChatMetricsTracker chatMetricsTracker;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            closeChatUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = 1;
            obj = closeChatUseCase.invoke(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this);
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
        com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel chatViewModel = this.Camera2StreamConfigurationMap;
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, "Chat closed successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("result", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((java.lang.Boolean) ((arrow.core.Either.Right) either).getValue()).booleanValue())), kotlin.TuplesKt.to("session_id", str)), null, 4, null);
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.core.network.http.error.NetworkError networkError = (com.paypal.oslo.core.network.http.error.NetworkError) ((arrow.core.Either.Left) either).getValue();
            chatMetricsTracker = chatViewModel.getInputFormats;
            chatMetricsTracker.logSessionCloseFailed(str, networkError);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$closeSession$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$closeSession$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChatViewModel$closeSession$1(com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel chatViewModel, java.lang.String str, com.paypal.oslo.feature.searchandintelligence.domain.model.CloseChatReason closeChatReason, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$closeSession$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = chatViewModel;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = closeChatReason;
    }
}
