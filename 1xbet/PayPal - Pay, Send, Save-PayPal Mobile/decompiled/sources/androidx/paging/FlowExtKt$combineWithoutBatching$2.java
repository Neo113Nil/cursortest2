package androidx.paging;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Landroidx/paging/SimpleProducerScope;"}, k = 3, mv = {2, 0, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2", f = "FlowExt.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
public final class FlowExtKt$combineWithoutBatching$2<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.paging.SimpleProducerScope<R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T1> Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T2> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function4<T1, T2, androidx.paging.CombineSource, kotlin.coroutines.Continuation<? super R>, java.lang.Object> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CompletableJob Job$default;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.paging.SimpleProducerScope simpleProducerScope = (androidx.paging.SimpleProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
            java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(2);
            androidx.paging.UnbatchedFlowCombiner unbatchedFlowCombiner = new androidx.paging.UnbatchedFlowCombiner(new androidx.paging.FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1(simpleProducerScope, this.getHighSpeedVideoSizes, null));
            Job$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
            kotlinx.coroutines.flow.Flow[] flowArr = {this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor};
            int i2 = 0;
            int i3 = 0;
            while (i2 < 2) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(simpleProducerScope, Job$default, null, new androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1(flowArr[i2], atomicInteger, simpleProducerScope, unbatchedFlowCombiner, i3, null), 2, null);
                i2++;
                i3++;
            }
            this.getHighSpeedVideoFpsRanges = 1;
            if (simpleProducerScope.awaitClose(new androidx.paging.FlowExtKt$combineWithoutBatching$2.AnonymousClass2(Job$default), this) == coroutine_suspended) {
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

    public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
        kotlinx.coroutines.CompletableJob Job$default;
        androidx.paging.SimpleProducerScope simpleProducerScope = (androidx.paging.SimpleProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(2);
        androidx.paging.UnbatchedFlowCombiner unbatchedFlowCombiner = new androidx.paging.UnbatchedFlowCombiner(new androidx.paging.FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1(simpleProducerScope, this.getHighSpeedVideoSizes, null));
        Job$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
        kotlinx.coroutines.flow.Flow[] flowArr = {this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor};
        int i = 0;
        int i2 = 0;
        while (i < 2) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(simpleProducerScope, Job$default, null, new androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1(flowArr[i], atomicInteger, simpleProducerScope, unbatchedFlowCombiner, java.lang.Integer.valueOf(i2).intValue(), null), 2, null);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            i++;
            i2++;
        }
        simpleProducerScope.awaitClose(new androidx.paging.FlowExtKt$combineWithoutBatching$2.AnonymousClass2(Job$default), this);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    /* renamed from: androidx.paging.FlowExtKt$combineWithoutBatching$2$2, reason: invalid class name */
    public static final class AnonymousClass2 implements kotlin.jvm.functions.Function0<kotlin.Unit> {
        final /* synthetic */ kotlinx.coroutines.CompletableJob getHighSpeedVideoSizes;

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
            invoke2();
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) this.getHighSpeedVideoSizes, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }

        public AnonymousClass2(kotlinx.coroutines.CompletableJob completableJob) {
            this.getHighSpeedVideoSizes = completableJob;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(androidx.paging.SimpleProducerScope<R> simpleProducerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.paging.FlowExtKt$combineWithoutBatching$2) create(simpleProducerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.paging.FlowExtKt$combineWithoutBatching$2 flowExtKt$combineWithoutBatching$2 = new androidx.paging.FlowExtKt$combineWithoutBatching$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
        flowExtKt$combineWithoutBatching$2.getHighResolutionOutputSizeshNQ4ISI = obj;
        return flowExtKt$combineWithoutBatching$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtKt$combineWithoutBatching$2(kotlinx.coroutines.flow.Flow<? extends T1> flow, kotlinx.coroutines.flow.Flow<? extends T2> flow2, kotlin.jvm.functions.Function4<? super T1, ? super T2, ? super androidx.paging.CombineSource, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function4, kotlin.coroutines.Continuation<? super androidx.paging.FlowExtKt$combineWithoutBatching$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = flow;
        this.getHighSpeedVideoFpsRangesFor = flow2;
        this.getHighSpeedVideoSizes = function4;
    }
}
