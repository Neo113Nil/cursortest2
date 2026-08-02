package kotlinx.coroutines.flow.internal;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aZ\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000bH\u0080@¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"T", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "asChannelFlow", "(Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/internal/ChannelFlow;", "V", "Lkotlin/coroutines/CoroutineContext;", "newContext", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "countOrElement", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "withContextUndispatched", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ChannelFlowKt {
    public static final <T> kotlinx.coroutines.flow.internal.ChannelFlow<T> asChannelFlow(kotlinx.coroutines.flow.Flow<? extends T> flow) {
        kotlinx.coroutines.flow.internal.ChannelFlow<T> channelFlow = flow instanceof kotlinx.coroutines.flow.internal.ChannelFlow ? (kotlinx.coroutines.flow.internal.ChannelFlow) flow : null;
        return channelFlow == null ? new kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl(flow, null, 0, null, 14, null) : channelFlow;
    }

    public static /* synthetic */ java.lang.Object withContextUndispatched$default(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Object obj, java.lang.Object obj2, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj3) {
        if ((i & 4) != 0) {
            obj2 = kotlinx.coroutines.internal.ThreadContextKt.threadContextElements(coroutineContext);
        }
        return withContextUndispatched(coroutineContext, obj, obj2, function2, continuation);
    }

    public static final <T, V> java.lang.Object withContextUndispatched(kotlin.coroutines.CoroutineContext coroutineContext, V v, java.lang.Object obj, kotlin.jvm.functions.Function2<? super V, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        java.lang.Object updateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(coroutineContext, obj);
        try {
            kotlinx.coroutines.flow.internal.StackFrameContinuation stackFrameContinuation = new kotlinx.coroutines.flow.internal.StackFrameContinuation(continuation, coroutineContext);
            java.lang.Object wrapWithContinuationImpl = !(function2 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl) ? kotlin.coroutines.intrinsics.IntrinsicsKt.wrapWithContinuationImpl(function2, v, stackFrameContinuation) : ((kotlin.jvm.functions.Function2) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(v, stackFrameContinuation);
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(coroutineContext, updateThreadContext);
            if (wrapWithContinuationImpl == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return wrapWithContinuationImpl;
        } catch (java.lang.Throwable th) {
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(coroutineContext, updateThreadContext);
            throw th;
        }
    }

    public static final /* synthetic */ kotlinx.coroutines.flow.FlowCollector access$withUndispatchedContextCollector(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.CoroutineContext coroutineContext) {
        return ((flowCollector instanceof kotlinx.coroutines.flow.internal.SendingCollector) || (flowCollector instanceof kotlinx.coroutines.flow.internal.NopCollector)) ? flowCollector : new kotlinx.coroutines.flow.internal.UndispatchedContextCollector(flowCollector, coroutineContext);
    }
}
