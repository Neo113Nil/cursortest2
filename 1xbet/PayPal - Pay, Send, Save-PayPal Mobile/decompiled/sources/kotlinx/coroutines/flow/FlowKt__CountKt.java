package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a \u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004\u001aD\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@¢\u0006\u0004\b\u0003\u0010\n"}, d2 = {"T", "Lkotlinx/coroutines/flow/Flow;", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "p0", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
final /* synthetic */ class FlowKt__CountKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object count(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        kotlinx.coroutines.flow.FlowKt__CountKt$count$1 flowKt__CountKt$count$1;
        int i;
        kotlin.jvm.internal.Ref.IntRef intRef;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__CountKt$count$1) {
            flowKt__CountKt$count$1 = (kotlinx.coroutines.flow.FlowKt__CountKt$count$1) continuation;
            if ((flowKt__CountKt$count$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                flowKt__CountKt$count$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = flowKt__CountKt$count$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__CountKt$count$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
                    kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector = new kotlinx.coroutines.flow.FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__CountKt$count$2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                            kotlin.jvm.internal.Ref.IntRef.this.element++;
                            int i2 = kotlin.jvm.internal.Ref.IntRef.this.element;
                            return kotlin.Unit.INSTANCE;
                        }
                    };
                    flowKt__CountKt$count$1.getHighSpeedVideoSizes = intRef2;
                    flowKt__CountKt$count$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (flow.collect(flowCollector, flowKt__CountKt$count$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    intRef = intRef2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    intRef = (kotlin.jvm.internal.Ref.IntRef) flowKt__CountKt$count$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxInt(intRef.element);
            }
        }
        flowKt__CountKt$count$1 = new kotlinx.coroutines.flow.FlowKt__CountKt$count$1(continuation);
        java.lang.Object obj2 = flowKt__CountKt$count$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__CountKt$count$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxInt(intRef.element);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object count(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        kotlinx.coroutines.flow.FlowKt__CountKt$count$3 flowKt__CountKt$count$3;
        int i;
        kotlin.jvm.internal.Ref.IntRef intRef;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__CountKt$count$3) {
            flowKt__CountKt$count$3 = (kotlinx.coroutines.flow.FlowKt__CountKt$count$3) continuation;
            if ((flowKt__CountKt$count$3.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                flowKt__CountKt$count$3.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = flowKt__CountKt$count$3.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__CountKt$count$3.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
                    kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowKt__CountKt$count$4 = new kotlinx.coroutines.flow.FlowKt__CountKt$count$4<>(function2, intRef2);
                    flowKt__CountKt$count$3.getHighResolutionOutputSizeshNQ4ISI = intRef2;
                    flowKt__CountKt$count$3.getHighSpeedVideoFpsRanges = 1;
                    if (flow.collect(flowKt__CountKt$count$4, flowKt__CountKt$count$3) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    intRef = intRef2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    intRef = (kotlin.jvm.internal.Ref.IntRef) flowKt__CountKt$count$3.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxInt(intRef.element);
            }
        }
        flowKt__CountKt$count$3 = new kotlinx.coroutines.flow.FlowKt__CountKt$count$3(continuation);
        java.lang.Object obj2 = flowKt__CountKt$count$3.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__CountKt$count$3.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxInt(intRef.element);
    }
}
