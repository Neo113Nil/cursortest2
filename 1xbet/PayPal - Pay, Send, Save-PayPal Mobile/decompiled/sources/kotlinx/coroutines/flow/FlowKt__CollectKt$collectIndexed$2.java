package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2;", "Lkotlinx/coroutines/flow/FlowCollector;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes17.dex */
public final class FlowKt__CollectKt$collectIndexed$2<T> implements kotlinx.coroutines.flow.FlowCollector<T> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function3<java.lang.Integer, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__CollectKt$collectIndexed$2(kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3) {
        this.getHighSpeedVideoSizes = function3;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlin.jvm.functions.Function3<java.lang.Integer, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function3 = this.getHighSpeedVideoSizes;
        int i = this.Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = i + 1;
        if (i >= 0) {
            java.lang.Object invoke = function3.invoke(kotlin.coroutines.jvm.internal.Boxing.boxInt(i), t, continuation);
            return invoke == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : kotlin.Unit.INSTANCE;
        }
        throw new java.lang.ArithmeticException("Index overflow has happened");
    }

    public final java.lang.Object emit$$forInline(T t, final kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        new kotlin.coroutines.jvm.internal.ContinuationImpl(continuation) { // from class: kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2$emit$1
            int getHighSpeedVideoFpsRangesFor;
            /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                this.getHighSpeedVideoSizes = obj;
                this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
                return kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2.this.emit(null, this);
            }
        };
        kotlin.jvm.functions.Function3<java.lang.Integer, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function3 = this.getHighSpeedVideoSizes;
        int i = this.Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = i + 1;
        if (i < 0) {
            throw new java.lang.ArithmeticException("Index overflow has happened");
        }
        function3.invoke(java.lang.Integer.valueOf(i), t, continuation);
        return kotlin.Unit.INSTANCE;
    }
}
