package kotlinx.coroutines.flow.internal;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1;", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes17.dex */
public final class SafeCollector_commonKt$unsafeFlow$1<T> implements kotlinx.coroutines.flow.Flow<T> {
    final /* synthetic */ kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector_commonKt$unsafeFlow$1(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object invoke = this.getHighResolutionOutputSizeshNQ4ISI.invoke(flowCollector, continuation);
        return invoke == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object collect$$forInline(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, final kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        new kotlin.coroutines.jvm.internal.ContinuationImpl(continuation) { // from class: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$unsafeFlow$1$collect$1
            /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
            int getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                this.Camera2StreamConfigurationMap = obj;
                this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
                return kotlinx.coroutines.flow.internal.SafeCollector_commonKt$unsafeFlow$1.this.collect(null, this);
            }
        };
        this.getHighResolutionOutputSizeshNQ4ISI.invoke(flowCollector, continuation);
        return kotlin.Unit.INSTANCE;
    }
}
