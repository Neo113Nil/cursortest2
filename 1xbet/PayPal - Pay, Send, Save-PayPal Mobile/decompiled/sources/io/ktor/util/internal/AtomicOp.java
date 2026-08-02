package io.ktor.util.internal;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00028\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\fR\u0011\u0010\u0012\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lio/ktor/util/internal/AtomicOp;", "T", "Lio/ktor/util/internal/OpDescriptor;", "<init>", "()V", "", "decision", "", "tryDecide", "(Ljava/lang/Object;)Z", "affected", "prepare", "(Ljava/lang/Object;)Ljava/lang/Object;", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE, "", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.COMPLETE, "(Ljava/lang/Object;Ljava/lang/Object;)V", "perform", "isDecided", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class AtomicOp<T> extends io.ktor.util.internal.OpDescriptor {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getHighSpeedVideoSizes = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.util.internal.AtomicOp.class, java.lang.Object.class, "consensus");
    private volatile /* synthetic */ java.lang.Object consensus;

    public abstract void complete(T affected, java.lang.Object failure);

    public abstract java.lang.Object prepare(T affected);

    public AtomicOp() {
        java.lang.Object obj;
        obj = io.ktor.util.internal.LockFreeLinkedListKt.Camera2StreamConfigurationMap;
        this.consensus = obj;
    }

    public final boolean isDecided() {
        java.lang.Object obj;
        java.lang.Object obj2 = this.consensus;
        obj = io.ktor.util.internal.LockFreeLinkedListKt.Camera2StreamConfigurationMap;
        return obj2 != obj;
    }

    public final boolean tryDecide(java.lang.Object decision) {
        java.lang.Object obj;
        java.lang.Object obj2;
        obj = io.ktor.util.internal.LockFreeLinkedListKt.Camera2StreamConfigurationMap;
        if (decision == obj) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getHighSpeedVideoSizes;
        obj2 = io.ktor.util.internal.LockFreeLinkedListKt.Camera2StreamConfigurationMap;
        return androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, obj2, decision);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.ktor.util.internal.OpDescriptor
    public final java.lang.Object perform(java.lang.Object affected) {
        java.lang.Object obj;
        java.lang.Object obj2 = this.consensus;
        obj = io.ktor.util.internal.LockFreeLinkedListKt.Camera2StreamConfigurationMap;
        if (obj2 == obj) {
            obj2 = prepare(affected);
            if (!tryDecide(obj2)) {
                obj2 = this.consensus;
            }
        }
        complete(affected, obj2);
        return obj2;
    }
}
