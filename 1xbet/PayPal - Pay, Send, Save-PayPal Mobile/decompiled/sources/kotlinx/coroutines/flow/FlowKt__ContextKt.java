package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\b\u001a#\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u000e\u0010\n"}, d2 = {"T", "Lkotlinx/coroutines/flow/Flow;", "", "p0", "Lkotlinx/coroutines/channels/BufferOverflow;", "p1", "buffer", "(Lkotlinx/coroutines/flow/Flow;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;I)Lkotlinx/coroutines/flow/Flow;", "conflate", "(Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/coroutines/CoroutineContext;", "flowOn", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/Flow;", "cancellable"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
final /* synthetic */ class FlowKt__ContextKt {
    public static /* synthetic */ kotlinx.coroutines.flow.Flow buffer$default(kotlinx.coroutines.flow.Flow flow, int i, kotlinx.coroutines.channels.BufferOverflow bufferOverflow, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = kotlinx.coroutines.channels.BufferOverflow.SUSPEND;
        }
        return kotlinx.coroutines.flow.FlowKt.buffer(flow, i, bufferOverflow);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> buffer(kotlinx.coroutines.flow.Flow<? extends T> flow, int i, kotlinx.coroutines.channels.BufferOverflow bufferOverflow) {
        if (i < 0 && i != -2 && i != -1) {
            throw new java.lang.IllegalArgumentException("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ".concat(java.lang.String.valueOf(i)).toString());
        }
        if (i == -1 && bufferOverflow != kotlinx.coroutines.channels.BufferOverflow.SUSPEND) {
            throw new java.lang.IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i == -1) {
            bufferOverflow = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST;
            i = 0;
        }
        int i2 = i;
        kotlinx.coroutines.channels.BufferOverflow bufferOverflow2 = bufferOverflow;
        return flow instanceof kotlinx.coroutines.flow.internal.FusibleFlow ? kotlinx.coroutines.flow.internal.FusibleFlow.DefaultImpls.fuse$default((kotlinx.coroutines.flow.internal.FusibleFlow) flow, null, i2, bufferOverflow2, 1, null) : new kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl(flow, null, i2, bufferOverflow2, 2, null);
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow buffer$default(kotlinx.coroutines.flow.Flow flow, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        return buffer(flow, i);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ kotlinx.coroutines.flow.Flow buffer(kotlinx.coroutines.flow.Flow flow, int i) {
        return buffer$default(flow, i, null, 2, null);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> conflate(kotlinx.coroutines.flow.Flow<? extends T> flow) {
        return buffer$default(flow, -1, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlinx.coroutines.flow.Flow<T> cancellable(kotlinx.coroutines.flow.Flow<? extends T> flow) {
        return flow instanceof kotlinx.coroutines.flow.CancellableFlow ? flow : new kotlinx.coroutines.flow.CancellableFlowImpl(flow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlinx.coroutines.flow.Flow<T> flowOn(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.CoroutineContext coroutineContext) {
        if (coroutineContext.get(kotlinx.coroutines.Job.INSTANCE) == null) {
            return kotlin.jvm.internal.Intrinsics.areEqual(coroutineContext, kotlin.coroutines.EmptyCoroutineContext.INSTANCE) ? flow : flow instanceof kotlinx.coroutines.flow.internal.FusibleFlow ? kotlinx.coroutines.flow.internal.FusibleFlow.DefaultImpls.fuse$default((kotlinx.coroutines.flow.internal.FusibleFlow) flow, coroutineContext, 0, null, 6, null) : new kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl(flow, coroutineContext, 0, null, 12, null);
        }
        throw new java.lang.IllegalArgumentException("Flow context cannot contain job in it. Had ".concat(java.lang.String.valueOf(coroutineContext)).toString());
    }
}
