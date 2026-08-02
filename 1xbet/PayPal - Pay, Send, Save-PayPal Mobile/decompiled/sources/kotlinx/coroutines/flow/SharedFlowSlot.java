package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowSlot;", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "<init>", "()V", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "", "allocateLocked", "(Lkotlinx/coroutines/flow/SharedFlowImpl;)Z", "", "Lkotlin/coroutines/Continuation;", "", "freeLocked", "(Lkotlinx/coroutines/flow/SharedFlowImpl;)[Lkotlin/coroutines/Continuation;", "", "index", "J", "cont", "Lkotlin/coroutines/Continuation;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SharedFlowSlot extends kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlinx.coroutines.flow.SharedFlowImpl<?>> {
    public kotlin.coroutines.Continuation<? super kotlin.Unit> cont;
    public long index = -1;

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public final boolean allocateLocked(kotlinx.coroutines.flow.SharedFlowImpl<?> flow) {
        if (this.index >= 0) {
            return false;
        }
        this.index = flow.updateNewCollectorIndexLocked$kotlinx_coroutines_core();
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public final kotlin.coroutines.Continuation<kotlin.Unit>[] freeLocked(kotlinx.coroutines.flow.SharedFlowImpl<?> flow) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && this.index < 0) {
            throw new java.lang.AssertionError();
        }
        long j = this.index;
        this.index = -1L;
        this.cont = null;
        return flow.updateCollectorIndexLocked$kotlinx_coroutines_core(j);
    }
}
