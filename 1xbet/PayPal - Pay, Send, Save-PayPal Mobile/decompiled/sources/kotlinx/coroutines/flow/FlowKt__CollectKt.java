package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001aj\u0010\u0012\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002H\b\u0004\u0010\u0006\u001aB\b\u0001\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\nH\u0086H¢\u0006\u0004\b\u0012\u0010\u0013\u001aI\u0010\u0015\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002'\u0010\u0006\u001a#\b\u0001\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0014H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016\u001a.\u0010\u0018\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00172\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019\u001aU\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u000023\b\u0004\u0010\u0006\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0014H\u0087H¢\u0006\u0004\b\u0002\u0010\u0016"}, d2 = {"Lkotlinx/coroutines/flow/Flow;", "", "collect", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Lkotlinx/coroutines/CoroutineScope;", "p0", "Lkotlinx/coroutines/Job;", "launchIn", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/Job;", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "index", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlin/coroutines/Continuation;", "", "collectIndexed", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "collectLatest", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/FlowCollector;", "emitAll", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
final /* synthetic */ class FlowKt__CollectKt {
    public static final java.lang.Object collect(kotlinx.coroutines.flow.Flow<?> flow, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = flow.collect(kotlinx.coroutines.flow.internal.NopCollector.INSTANCE, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    public static final <T> kotlinx.coroutines.Job launchIn(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlinx.coroutines.Job launch$default;
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1(flow, null), 3, null);
        return launch$default;
    }

    public static final <T> java.lang.Object collectIndexed(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = flow.collect(new kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2(function3), continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    public static final <T> java.lang.Object collectLatest(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = kotlinx.coroutines.flow.FlowKt.collect(kotlinx.coroutines.flow.FlowKt__ContextKt.buffer$default(kotlinx.coroutines.flow.FlowKt.mapLatest(flow, function2), 0, null, 2, null), continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    public static final <T> java.lang.Object emitAll(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt.ensureActive(flowCollector);
        java.lang.Object collect = flow.collect(flowCollector, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Backwards compatibility with JS and K/N")
    public static final /* synthetic */ <T> java.lang.Object collect(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = flow.collect(new kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3(function2), continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }
}
