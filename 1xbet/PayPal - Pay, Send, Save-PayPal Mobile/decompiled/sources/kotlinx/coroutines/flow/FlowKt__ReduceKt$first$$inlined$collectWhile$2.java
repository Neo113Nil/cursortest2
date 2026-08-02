package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¸\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1;", "Lkotlinx/coroutines/flow/FlowCollector;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FlowKt__ReduceKt$first$$inlined$collectWhile$2<T> implements kotlinx.coroutines.flow.FlowCollector<T> {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function2 getHighSpeedVideoFpsRangesFor;

    public FlowKt__ReduceKt$first$$inlined$collectWhile$2(kotlin.jvm.functions.Function2 function2, kotlin.jvm.internal.Ref.ObjectRef objectRef) {
        this.getHighSpeedVideoFpsRangesFor = function2;
        this.getHighSpeedVideoFpsRanges = objectRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2.AnonymousClass1 anonymousClass1;
        java.lang.Object obj;
        int i;
        kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2<T> flowKt__ReduceKt$first$$inlined$collectWhile$2;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2.AnonymousClass1) {
            anonymousClass1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2.AnonymousClass1) continuation;
            if ((anonymousClass1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                anonymousClass1.getHighSpeedVideoFpsRanges -= 2147483648;
                obj = anonymousClass1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = anonymousClass1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.functions.Function2 function2 = this.getHighSpeedVideoFpsRangesFor;
                    anonymousClass1.getHighSpeedVideoFpsRangesFor = this;
                    anonymousClass1.getHighSpeedVideoSizes = t;
                    anonymousClass1.getHighSpeedVideoFpsRanges = 1;
                    obj = function2.invoke(t, anonymousClass1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    flowKt__ReduceKt$first$$inlined$collectWhile$2 = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t = (T) anonymousClass1.getHighSpeedVideoSizes;
                    flowKt__ReduceKt$first$$inlined$collectWhile$2 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2) anonymousClass1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return kotlin.Unit.INSTANCE;
                }
                flowKt__ReduceKt$first$$inlined$collectWhile$2.getHighSpeedVideoFpsRanges.element = t;
                throw new kotlinx.coroutines.flow.internal.AbortFlowException(flowKt__ReduceKt$first$$inlined$collectWhile$2);
            }
        }
        anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2.AnonymousClass1(continuation);
        obj = anonymousClass1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = anonymousClass1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", i = {0, 0}, l = {132}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
        int getHighSpeedVideoFpsRanges;
        java.lang.Object getHighSpeedVideoFpsRangesFor;
        java.lang.Object getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.Camera2StreamConfigurationMap = obj;
            this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2.this.emit(null, this);
        }

        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
            super(continuation);
        }
    }
}
