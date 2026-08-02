package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\u00020\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\f\u001a\u0004\u0018\u00018\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086\b¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0002\u0010\u0017J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u0015J\u0006\u0010\u001f\u001a\u00020\u001cR\u0011\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007X\u0082\u0004R\u0011\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007X\u0082\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0011\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0003\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013R\u0012\u0010\u001e\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0019R\u0016\u0010 \u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0013R\u0014\u0010\"\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0013¨\u0006$"}, d2 = {"Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "N", "", "prev", "<init>", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)V", "_next", "Lkotlinx/atomicfu/AtomicRef;", "_prev", "nextOrClosed", "getNextOrClosed", "()Ljava/lang/Object;", "nextOrIfClosed", "onClosedAction", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", io.ktor.http.LinkHeader.Rel.Next, "getNext", "()Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "trySetNext", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)Z", "isTail", "()Z", "getPrev", "cleanPrev", "", "markAsClosed", "isRemoved", "remove", "aliveSegmentLeft", "getAliveSegmentLeft", "aliveSegmentRight", "getAliveSegmentRight", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ConcurrentLinkedListNode<N extends kotlinx.coroutines.internal.ConcurrentLinkedListNode<N>> {
    private volatile /* synthetic */ java.lang.Object _next$volatile;
    private volatile /* synthetic */ java.lang.Object _prev$volatile;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getHighSpeedVideoSizes = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.ConcurrentLinkedListNode.class, java.lang.Object.class, "_next$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getHighSpeedVideoFpsRanges = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.ConcurrentLinkedListNode.class, java.lang.Object.class, "_prev$volatile");

    public abstract boolean isRemoved();

    public ConcurrentLinkedListNode(N n) {
        this._prev$volatile = n;
    }

    public final N nextOrIfClosed(kotlin.jvm.functions.Function0 onClosedAction) {
        java.lang.Object access$getNextOrClosed = access$getNextOrClosed(this);
        if (access$getNextOrClosed == kotlinx.coroutines.internal.ConcurrentLinkedListKt.Camera2StreamConfigurationMap) {
            onClosedAction.invoke();
            throw new kotlin.KotlinNothingValueException();
        }
        return (N) access$getNextOrClosed;
    }

    public final boolean isTail() {
        return getNext() == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.internal.ConcurrentLinkedListNode] */
    public final void remove() {
        java.lang.Object obj;
        ?? next;
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !isRemoved() && !isTail()) {
            throw new java.lang.AssertionError();
        }
        if (isTail()) {
            return;
        }
        while (true) {
            N prev = getPrev();
            while (prev != null && prev.isRemoved()) {
                prev = (N) getHighSpeedVideoFpsRanges.get(prev);
            }
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && isTail()) {
                throw new java.lang.AssertionError();
            }
            N next2 = getNext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(next2);
            while (next2.isRemoved() && (next = next2.getNext()) != 0) {
                next2 = next;
            }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getHighSpeedVideoFpsRanges;
            do {
                obj = atomicReferenceFieldUpdater.get(next2);
            } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, next2, obj, ((kotlinx.coroutines.internal.ConcurrentLinkedListNode) obj) == null ? null : prev));
            if (prev != null) {
                getHighSpeedVideoSizes.set(prev, next2);
            }
            if (!next2.isRemoved() || next2.isTail()) {
                if (prev == null || !prev.isRemoved()) {
                    return;
                }
            }
        }
    }

    public final N getNext() {
        java.lang.Object access$getNextOrClosed = access$getNextOrClosed(this);
        if (access$getNextOrClosed == kotlinx.coroutines.internal.ConcurrentLinkedListKt.Camera2StreamConfigurationMap) {
            return null;
        }
        return (N) access$getNextOrClosed;
    }

    public static final /* synthetic */ java.lang.Object access$getNextOrClosed(kotlinx.coroutines.internal.ConcurrentLinkedListNode concurrentLinkedListNode) {
        return getHighSpeedVideoSizes.get(concurrentLinkedListNode);
    }

    public final void cleanPrev() {
        getHighSpeedVideoFpsRanges.set(this, null);
    }

    public final N getPrev() {
        return (N) getHighSpeedVideoFpsRanges.get(this);
    }

    public final boolean markAsClosed() {
        return androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoSizes, this, null, kotlinx.coroutines.internal.ConcurrentLinkedListKt.Camera2StreamConfigurationMap);
    }

    public final boolean trySetNext(N value) {
        return androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoSizes, this, null, value);
    }
}
