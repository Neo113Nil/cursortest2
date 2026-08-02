package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/FlowKt__CollectKt$collect$3;", "Lkotlinx/coroutines/flow/FlowCollector;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes17.dex */
public final class FlowKt__CollectKt$collect$3<T> implements kotlinx.coroutines.flow.FlowCollector<T> {
    final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__CollectKt$collect$3(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object invoke = this.getHighResolutionOutputSizeshNQ4ISI.invoke(t, continuation);
        return invoke == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object emit$$forInline(T t, final kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        new kotlin.coroutines.jvm.internal.ContinuationImpl(continuation) { // from class: kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3$emit$1
            int Camera2StreamConfigurationMap;
            /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                this.getHighResolutionOutputSizeshNQ4ISI = obj;
                this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
                return kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3.this.emit(null, this);
            }
        };
        this.getHighResolutionOutputSizeshNQ4ISI.invoke(t, continuation);
        return kotlin.Unit.INSTANCE;
    }
}
