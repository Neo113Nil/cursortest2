package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1;", "Lkotlinx/coroutines/flow/FlowCollector;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes5.dex */
public final class FlowKt__LimitKt$collectWhile$collector$1<T> implements kotlinx.coroutines.flow.FlowCollector<T> {
    final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$collectWhile$collector$1(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2) {
        this.getHighSpeedVideoFpsRanges = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1 flowKt__LimitKt$collectWhile$collector$1$emit$1;
        java.lang.Object obj;
        int i;
        kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1<T> flowKt__LimitKt$collectWhile$collector$1;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1) {
            flowKt__LimitKt$collectWhile$collector$1$emit$1 = (kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1) continuation;
            if ((flowKt__LimitKt$collectWhile$collector$1$emit$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$collectWhile$collector$1$emit$1.getHighSpeedVideoFpsRanges -= 2147483648;
                obj = flowKt__LimitKt$collectWhile$collector$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__LimitKt$collectWhile$collector$1$emit$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> function2 = this.getHighSpeedVideoFpsRanges;
                    flowKt__LimitKt$collectWhile$collector$1$emit$1.getHighSpeedVideoSizes = this;
                    flowKt__LimitKt$collectWhile$collector$1$emit$1.getHighSpeedVideoFpsRanges = 1;
                    obj = function2.invoke(t, flowKt__LimitKt$collectWhile$collector$1$emit$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    flowKt__LimitKt$collectWhile$collector$1 = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowKt__LimitKt$collectWhile$collector$1 = (kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1) flowKt__LimitKt$collectWhile$collector$1$emit$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    throw new kotlinx.coroutines.flow.internal.AbortFlowException(flowKt__LimitKt$collectWhile$collector$1);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        flowKt__LimitKt$collectWhile$collector$1$emit$1 = new kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, continuation);
        obj = flowKt__LimitKt$collectWhile$collector$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__LimitKt$collectWhile$collector$1$emit$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    public final java.lang.Object emit$$forInline(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        new kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, continuation);
        if (!((java.lang.Boolean) this.getHighSpeedVideoFpsRanges.invoke(t, continuation)).booleanValue()) {
            throw new kotlinx.coroutines.flow.internal.AbortFlowException(this);
        }
        return kotlin.Unit.INSTANCE;
    }
}
