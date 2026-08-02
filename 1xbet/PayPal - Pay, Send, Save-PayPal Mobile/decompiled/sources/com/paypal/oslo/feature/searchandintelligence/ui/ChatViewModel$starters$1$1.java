package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/Starters;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$starters$1$1", f = "ChatViewModel.kt", i = {0, 1, 1}, l = {96, 101}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "result"}, nl = {101, 102}, s = {"L$0", "L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class ChatViewModel$starters$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.searchandintelligence.domain.model.Starters>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x009c, code lost:
    
        if (r0.emit(r2, r9) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a8, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
    
        if (r10 != r1) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetStartersUseCase getStartersUseCase;
        java.lang.Object value;
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getStartersUseCase = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
            kotlin.enums.EnumEntries<com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface> entries = com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface.getEntries();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : entries) {
                if (((com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface) obj2) != com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface.ANY) {
                    arrayList.add(obj2);
                }
            }
            this.getHighSpeedVideoSizes = flowCollector;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = getStartersUseCase.invoke(arrayList, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        if (either instanceof arrow.core.Either.Left) {
            value = new com.paypal.oslo.feature.searchandintelligence.domain.model.Starters(null, null, 3, null);
        } else {
            if (!(either instanceof arrow.core.Either.Right)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            value = ((arrow.core.Either.Right) either).getValue();
        }
        this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
        this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
        this.getHighSpeedVideoFpsRanges = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.searchandintelligence.domain.model.Starters> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$starters$1$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$starters$1$1 chatViewModel$starters$1$1 = new com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$starters$1$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        chatViewModel$starters$1$1.getHighSpeedVideoSizes = obj;
        return chatViewModel$starters$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChatViewModel$starters$1$1(com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel chatViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.searchandintelligence.ui.ChatViewModel$starters$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = chatViewModel;
    }
}
