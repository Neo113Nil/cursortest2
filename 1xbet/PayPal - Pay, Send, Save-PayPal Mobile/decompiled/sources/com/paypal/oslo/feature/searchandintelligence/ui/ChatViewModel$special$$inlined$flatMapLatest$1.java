package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$special$$inlined$flatMapLatest$1", f = "ChatViewModel.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m = "invokeSuspend", n = {"$this$transformLatest", "it"}, nl = {-1}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
public final class ChatViewModel$special$$inlined$flatMapLatest$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.searchandintelligence.domain.model.Starters>, java.lang.Long, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizes;
            java.lang.Object obj2 = this.getHighSpeedVideoFpsRangesFor;
            kotlinx.coroutines.flow.Flow flow = kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$starters$1$1(this.getHighResolutionOutputSizeshNQ4ISI, null));
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.flow.FlowKt.emitAll(flowCollector, flow, this) == coroutine_suspended) {
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
    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.searchandintelligence.domain.model.Starters> flowCollector, java.lang.Long l, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$special$$inlined$flatMapLatest$1 chatViewModel$special$$inlined$flatMapLatest$1 = new com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$special$$inlined$flatMapLatest$1(continuation, this.getHighResolutionOutputSizeshNQ4ISI);
        chatViewModel$special$$inlined$flatMapLatest$1.getHighSpeedVideoSizes = flowCollector;
        chatViewModel$special$$inlined$flatMapLatest$1.getHighSpeedVideoFpsRangesFor = l;
        return chatViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$special$$inlined$flatMapLatest$1(kotlin.coroutines.Continuation continuation, com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel chatViewModel) {
        super(3, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = chatViewModel;
    }
}
