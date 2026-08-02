package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a4\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a4\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\t\u0010\b\u001a4\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\u000b\u0010\f\u001a=\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001b\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019"}, d2 = {"T", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlinx/coroutines/flow/MutableStateFlow;", "MutableStateFlow", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlin/Function1;", "function", "updateAndGet", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "getAndUpdate", "", "update", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/Flow;", "fuseStateFlow", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/internal/Symbol;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/internal/Symbol;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StateFlowKt {
    private static final kotlinx.coroutines.internal.Symbol getHighResolutionOutputSizeshNQ4ISI = new kotlinx.coroutines.internal.Symbol("NONE");
    private static final kotlinx.coroutines.internal.Symbol getHighSpeedVideoSizes = new kotlinx.coroutines.internal.Symbol(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS);

    public static final <T> kotlinx.coroutines.flow.MutableStateFlow<T> MutableStateFlow(T t) {
        if (t == null) {
            t = (T) kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
        }
        return new kotlinx.coroutines.flow.StateFlowImpl(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T updateAndGet(kotlinx.coroutines.flow.MutableStateFlow<T> mutableStateFlow, kotlin.jvm.functions.Function1<? super T, ? extends T> function1) {
        amex.AMEXKernel aMEXKernel;
        T invoke;
        do {
            aMEXKernel = (java.lang.Object) mutableStateFlow.getValue();
            invoke = function1.invoke(aMEXKernel);
        } while (!mutableStateFlow.compareAndSet(aMEXKernel, invoke));
        return invoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    public static final <T> T getAndUpdate(kotlinx.coroutines.flow.MutableStateFlow<T> mutableStateFlow, kotlin.jvm.functions.Function1<? super T, ? extends T> function1) {
        ?? r0;
        do {
            r0 = (java.lang.Object) mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(r0, function1.invoke(r0)));
        return r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void update(kotlinx.coroutines.flow.MutableStateFlow<T> mutableStateFlow, kotlin.jvm.functions.Function1<? super T, ? extends T> function1) {
        amex.AMEXKernel aMEXKernel;
        do {
            aMEXKernel = (java.lang.Object) mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(aMEXKernel, function1.invoke(aMEXKernel)));
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> fuseStateFlow(kotlinx.coroutines.flow.StateFlow<? extends T> stateFlow, kotlin.coroutines.CoroutineContext coroutineContext, int i, kotlinx.coroutines.channels.BufferOverflow bufferOverflow) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && i == -1) {
            throw new java.lang.AssertionError();
        }
        if (((i >= 0 && i < 2) || i == -2) && bufferOverflow == kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST) {
            return stateFlow;
        }
        return kotlinx.coroutines.flow.SharedFlowKt.fuseSharedFlow(stateFlow, coroutineContext, i, bufferOverflow);
    }
}
