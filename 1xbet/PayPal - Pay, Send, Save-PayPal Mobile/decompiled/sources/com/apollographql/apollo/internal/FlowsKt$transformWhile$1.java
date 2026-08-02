package com.apollographql.apollo.internal;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.internal.FlowsKt$transformWhile$1", f = "flows.kt", i = {0}, l = {61}, m = "invokeSuspend", n = {"collector$iv"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class FlowsKt$transformWhile$1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T> getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 flowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1;
        com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 flowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.Camera2StreamConfigurationMap;
            kotlinx.coroutines.flow.Flow<T> flow = this.getHighSpeedVideoSizes;
            final com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 flowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$13 = new com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1(this.getHighSpeedVideoFpsRangesFor, flowCollector);
            try {
                this.Camera2StreamConfigurationMap = flowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$13;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (flow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        java.lang.Object emit = com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1.this.emit(t, continuation);
                        return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (com.apollographql.apollo.internal.AbortFlowException e) {
                e = e;
                flowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 = flowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$13;
                flowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12 = flowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12, "");
                if (e.getHighSpeedVideoSizes != flowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12) {
                    throw e;
                }
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 = (com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1) this.Camera2StreamConfigurationMap;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (com.apollographql.apollo.internal.AbortFlowException e2) {
                e = e2;
                flowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12 = flowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12, "");
                if (e.getHighSpeedVideoSizes != flowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.internal.FlowsKt$transformWhile$1) create((kotlinx.coroutines.flow.FlowCollector) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.apollographql.apollo.internal.FlowsKt$transformWhile$1 flowsKt$transformWhile$1 = new com.apollographql.apollo.internal.FlowsKt$transformWhile$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
        flowsKt$transformWhile$1.Camera2StreamConfigurationMap = obj;
        return flowsKt$transformWhile$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowsKt$transformWhile$1(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super com.apollographql.apollo.internal.FlowsKt$transformWhile$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = flow;
        this.getHighSpeedVideoFpsRangesFor = function3;
    }
}
