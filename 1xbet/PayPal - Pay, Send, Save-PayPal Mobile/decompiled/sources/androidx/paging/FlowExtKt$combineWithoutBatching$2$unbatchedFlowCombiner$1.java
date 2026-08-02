package androidx.paging;

/* JADX INFO: Add missing generic type declarations: [T1, T2] */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0005\u001a\u0002H\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, d2 = {"<anonymous>", "", "T1", "T2", "t1", "t2", "updateFrom", "Landroidx/paging/CombineSource;"}, k = 3, mv = {2, 0, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1", f = "FlowExt.kt", i = {}, l = {126, 126}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
public final class FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1<T1, T2> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function4<T1, T2, androidx.paging.CombineSource, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function4<T1, T2, androidx.paging.CombineSource, kotlin.coroutines.Continuation<? super R>, java.lang.Object> Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.paging.SimpleProducerScope<R> getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (r1.send(r9, r8) == r0) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.paging.SimpleProducerScope simpleProducerScope;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Object obj2 = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object obj3 = this.getHighSpeedVideoSizes;
            androidx.paging.CombineSource combineSource = (androidx.paging.CombineSource) this.getHighSpeedVideoFpsRanges;
            androidx.paging.SimpleProducerScope simpleProducerScope2 = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.functions.Function4<T1, T2, androidx.paging.CombineSource, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function4 = this.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = simpleProducerScope2;
            this.getHighSpeedVideoSizes = null;
            this.getInputSizeshNQ4ISI = 1;
            obj = function4.invoke(obj2, obj3, combineSource, this);
            if (obj != coroutine_suspended) {
                simpleProducerScope = simpleProducerScope2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        simpleProducerScope = (androidx.paging.SimpleProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getInputSizeshNQ4ISI = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor.send(this.Camera2StreamConfigurationMap.invoke(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, (androidx.paging.CombineSource) this.getHighSpeedVideoFpsRanges, this), this);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function4
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, androidx.paging.CombineSource combineSource, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return invoke2((androidx.paging.FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1<T1, T2>) obj, obj2, combineSource, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(T1 t1, T2 t2, androidx.paging.CombineSource combineSource, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.paging.FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1 flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1 = new androidx.paging.FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
        flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1.getHighResolutionOutputSizeshNQ4ISI = t1;
        flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1.getHighSpeedVideoSizes = t2;
        flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1.getHighSpeedVideoFpsRanges = combineSource;
        return flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1(androidx.paging.SimpleProducerScope<R> simpleProducerScope, kotlin.jvm.functions.Function4<? super T1, ? super T2, ? super androidx.paging.CombineSource, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function4, kotlin.coroutines.Continuation<? super androidx.paging.FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1> continuation) {
        super(4, continuation);
        this.getHighSpeedVideoFpsRangesFor = simpleProducerScope;
        this.Camera2StreamConfigurationMap = function4;
    }
}
