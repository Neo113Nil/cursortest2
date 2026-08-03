package io.ktor.util.internal;

/* compiled from: LockFreeLinkedList.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000bJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0012\u0010\u000bR\u0011\u0010\u0013\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/ktor/util/internal/AtomicOp;", "T", "Lio/ktor/util/internal/OpDescriptor;", "<init>", "()V", "", "decision", "", "tryDecide", "(Ljava/lang/Object;)Z", "decide", "(Ljava/lang/Object;)Ljava/lang/Object;", "affected", "prepare", com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE, "", "complete", "(Ljava/lang/Object;Ljava/lang/Object;)V", "perform", "isDecided", "()Z", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AtomicOp<T> extends io.ktor.util.internal.OpDescriptor {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater consensus$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.util.internal.AtomicOp.class, java.lang.Object.class, "consensus");
    private volatile /* synthetic */ java.lang.Object consensus;

    public abstract void complete(T affected, java.lang.Object failure);

    public abstract java.lang.Object prepare(T affected);

    public AtomicOp() {
        java.lang.Object obj;
        obj = io.ktor.util.internal.LockFreeLinkedListKt.NO_DECISION;
        this.consensus = obj;
    }

    public final boolean isDecided() {
        java.lang.Object obj;
        java.lang.Object obj2 = this.consensus;
        obj = io.ktor.util.internal.LockFreeLinkedListKt.NO_DECISION;
        return obj2 != obj;
    }

    public final boolean tryDecide(java.lang.Object decision) {
        java.lang.Object obj;
        java.lang.Object obj2;
        obj = io.ktor.util.internal.LockFreeLinkedListKt.NO_DECISION;
        if (decision == obj) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = consensus$FU;
        obj2 = io.ktor.util.internal.LockFreeLinkedListKt.NO_DECISION;
        return androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, obj2, decision);
    }

    private final java.lang.Object decide(java.lang.Object decision) {
        return tryDecide(decision) ? decision : this.consensus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.ktor.util.internal.OpDescriptor
    public final java.lang.Object perform(java.lang.Object affected) {
        java.lang.Object obj;
        java.lang.Object obj2 = this.consensus;
        obj = io.ktor.util.internal.LockFreeLinkedListKt.NO_DECISION;
        if (obj2 == obj) {
            obj2 = decide(prepare(affected));
        }
        complete(affected, obj2);
        return obj2;
    }
}
