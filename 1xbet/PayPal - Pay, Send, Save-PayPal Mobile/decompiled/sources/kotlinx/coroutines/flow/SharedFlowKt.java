package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\r\u001a\u0004\u0018\u00010\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u0011\u001a\u00020\u0010*\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a=\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001b\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"T", "", "replay", "extraBufferCapacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "MutableSharedFlow", "(IILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "", "", "p0", "getHighSpeedVideoSizes", "([Ljava/lang/Object;J)Ljava/lang/Object;", "p1", "", "getHighResolutionOutputSizeshNQ4ISI", "([Ljava/lang/Object;JLjava/lang/Object;)V", "Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lkotlinx/coroutines/flow/Flow;", "fuseSharedFlow", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/internal/Symbol;", "NO_VALUE", "Lkotlinx/coroutines/internal/Symbol;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SharedFlowKt {
    public static final kotlinx.coroutines.internal.Symbol NO_VALUE = new kotlinx.coroutines.internal.Symbol("NO_VALUE");

    public static /* synthetic */ kotlinx.coroutines.flow.MutableSharedFlow MutableSharedFlow$default(int i, int i2, kotlinx.coroutines.channels.BufferOverflow bufferOverflow, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            bufferOverflow = kotlinx.coroutines.channels.BufferOverflow.SUSPEND;
        }
        return MutableSharedFlow(i, i2, bufferOverflow);
    }

    public static final <T> kotlinx.coroutines.flow.MutableSharedFlow<T> MutableSharedFlow(int i, int i2, kotlinx.coroutines.channels.BufferOverflow bufferOverflow) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("replay cannot be negative, but was ".concat(java.lang.String.valueOf(i)).toString());
        }
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("extraBufferCapacity cannot be negative, but was ".concat(java.lang.String.valueOf(i2)).toString());
        }
        if (i <= 0 && i2 <= 0 && bufferOverflow != kotlinx.coroutines.channels.BufferOverflow.SUSPEND) {
            throw new java.lang.IllegalArgumentException("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ".concat(java.lang.String.valueOf(bufferOverflow)).toString());
        }
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
        }
        return new kotlinx.coroutines.flow.SharedFlowImpl(i, i3, bufferOverflow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object getHighSpeedVideoSizes(java.lang.Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighResolutionOutputSizeshNQ4ISI(java.lang.Object[] objArr, long j, java.lang.Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> fuseSharedFlow(kotlinx.coroutines.flow.SharedFlow<? extends T> sharedFlow, kotlin.coroutines.CoroutineContext coroutineContext, int i, kotlinx.coroutines.channels.BufferOverflow bufferOverflow) {
        if ((i == 0 || i == -3) && bufferOverflow == kotlinx.coroutines.channels.BufferOverflow.SUSPEND) {
            return sharedFlow;
        }
        return new kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl(sharedFlow, coroutineContext, i, bufferOverflow);
    }
}
