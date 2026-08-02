package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\bH\u0002J\u0019\u0010\u0016\u001a\u00060\u0000j\u0002`\u00112\n\u0010\u0017\u001a\u00060\u0000j\u0002`\u0011H\u0082\u0010J\u0012\u0010\u0018\u001a\u00020\u000b2\n\u0010\u0019\u001a\u00060\u0000j\u0002`\u0011J\u001a\u0010\u001a\u001a\u00020\u000b2\n\u0010\u0019\u001a\u00060\u0000j\u0002`\u00112\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001cJ \u0010 \u001a\u00020\u000b2\n\u0010\u0019\u001a\u00060\u0000j\u0002`\u00112\n\u0010\r\u001a\u00060\u0000j\u0002`\u0011H\u0001J\b\u0010!\u001a\u00020\u000bH\u0016J\u0010\u0010\"\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0011H\u0001J\u0014\u0010#\u001a\u00020\u001e2\n\u0010\r\u001a\u00060\u0000j\u0002`\u0011H\u0002J\u0011\u0010$\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0011H\u0082\u0010J%\u0010%\u001a\u00020\u001e2\n\u0010&\u001a\u00060\u0000j\u0002`\u00112\n\u0010\r\u001a\u00060\u0000j\u0002`\u0011H\u0000¢\u0006\u0002\b'J\b\u0010(\u001a\u00020)H\u0016R\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u0082\u0004R\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005X\u0082\u0004R\u0011\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005X\u0082\u0004R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0011\u0010\r\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0010\u001a\u00060\u0000j\u0002`\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0014\u001a\u00060\u0000j\u0002`\u00118F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006*"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "", "<init>", "()V", "_next", "Lkotlinx/atomicfu/AtomicRef;", "_prev", "_removedRef", "Lkotlinx/coroutines/internal/Removed;", "removed", "isRemoved", "", "()Z", io.ktor.http.LinkHeader.Rel.Next, "getNext", "()Ljava/lang/Object;", "nextNode", "Lkotlinx/coroutines/internal/Node;", "getNextNode", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "prevNode", "getPrevNode", "findPrevNonRemoved", "current", "addOneIfEmpty", "node", "addLast", "permissionsBitmask", "", "close", "", "forbiddenElementsBit", "addNext", "remove", "removeOrNext", "finishAdd", "correctPrev", "validateNode", "prev", "validateNode$kotlinx_coroutines_core", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class LockFreeLinkedListNode {
    private volatile /* synthetic */ java.lang.Object _next$volatile = this;
    private volatile /* synthetic */ java.lang.Object _prev$volatile = this;
    private volatile /* synthetic */ java.lang.Object _removedRef$volatile;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getHighSpeedVideoFpsRangesFor = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.LockFreeLinkedListNode.class, java.lang.Object.class, "_next$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getHighSpeedVideoFpsRanges = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.LockFreeLinkedListNode.class, java.lang.Object.class, "_prev$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getHighSpeedVideoSizes = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.LockFreeLinkedListNode.class, java.lang.Object.class, "_removedRef$volatile");

    public boolean isRemoved() {
        return getNext() instanceof kotlinx.coroutines.internal.Removed;
    }

    public final kotlinx.coroutines.internal.LockFreeLinkedListNode getNextNode() {
        kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode;
        java.lang.Object next = getNext();
        kotlinx.coroutines.internal.Removed removed = next instanceof kotlinx.coroutines.internal.Removed ? (kotlinx.coroutines.internal.Removed) next : null;
        if (removed != null && (lockFreeLinkedListNode = removed.getHighResolutionOutputSizeshNQ4ISI) != null) {
            return lockFreeLinkedListNode;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(next, "");
        return (kotlinx.coroutines.internal.LockFreeLinkedListNode) next;
    }

    public final kotlinx.coroutines.internal.LockFreeLinkedListNode getPrevNode() {
        kotlinx.coroutines.internal.LockFreeLinkedListNode highSpeedVideoSizes = getHighSpeedVideoSizes();
        if (highSpeedVideoSizes == null) {
            java.lang.Object obj = getHighSpeedVideoFpsRanges.get(this);
            while (true) {
                highSpeedVideoSizes = (kotlinx.coroutines.internal.LockFreeLinkedListNode) obj;
                if (!highSpeedVideoSizes.isRemoved()) {
                    break;
                }
                obj = getHighSpeedVideoFpsRanges.get(highSpeedVideoSizes);
            }
        }
        return highSpeedVideoSizes;
    }

    public final boolean addLast(kotlinx.coroutines.internal.LockFreeLinkedListNode node, int permissionsBitmask) {
        kotlinx.coroutines.internal.LockFreeLinkedListNode prevNode;
        do {
            prevNode = getPrevNode();
            if (prevNode instanceof kotlinx.coroutines.internal.ListClosed) {
                return (((kotlinx.coroutines.internal.ListClosed) prevNode).Camera2StreamConfigurationMap & permissionsBitmask) == 0 && prevNode.addLast(node, permissionsBitmask);
            }
        } while (!prevNode.addNext(node, this));
        return true;
    }

    public final void close(int forbiddenElementsBit) {
        addLast(new kotlinx.coroutines.internal.ListClosed(forbiddenElementsBit), forbiddenElementsBit);
    }

    /* renamed from: remove */
    public boolean mo24119remove() {
        return removeOrNext() == null;
    }

    public final kotlinx.coroutines.internal.LockFreeLinkedListNode removeOrNext() {
        java.lang.Object next;
        kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode;
        do {
            next = getNext();
            if (next instanceof kotlinx.coroutines.internal.Removed) {
                return ((kotlinx.coroutines.internal.Removed) next).getHighResolutionOutputSizeshNQ4ISI;
            }
            if (next == this) {
                return (kotlinx.coroutines.internal.LockFreeLinkedListNode) next;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(next, "");
            lockFreeLinkedListNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) next;
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoFpsRangesFor, this, next, lockFreeLinkedListNode.getHighResolutionOutputSizeshNQ4ISI()));
        lockFreeLinkedListNode.getHighSpeedVideoSizes();
        return null;
    }

    public final void validateNode$kotlinx_coroutines_core(kotlinx.coroutines.internal.LockFreeLinkedListNode prev, kotlinx.coroutines.internal.LockFreeLinkedListNode next) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && prev != getHighSpeedVideoFpsRanges.get(this)) {
            throw new java.lang.AssertionError();
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && next != getHighSpeedVideoFpsRangesFor.get(this)) {
            throw new java.lang.AssertionError();
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(new kotlin.jvm.internal.PropertyReference0Impl(this) { // from class: kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public final java.lang.Object get() {
                return kotlinx.coroutines.DebugStringsKt.getClassSimpleName(this.receiver);
            }
        });
        sb.append('@');
        sb.append(kotlinx.coroutines.DebugStringsKt.getHexAddress(this));
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r3, r1, ((kotlinx.coroutines.internal.Removed) r5).getHighResolutionOutputSizeshNQ4ISI) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x001d, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final kotlinx.coroutines.internal.LockFreeLinkedListNode getHighSpeedVideoSizes() {
        while (true) {
            kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) getHighSpeedVideoFpsRanges.get(this);
            kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode2 = lockFreeLinkedListNode;
            while (true) {
                kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode3 = null;
                while (true) {
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getHighSpeedVideoFpsRangesFor;
                    java.lang.Object obj = atomicReferenceFieldUpdater.get(lockFreeLinkedListNode2);
                    if (obj == this) {
                        if (lockFreeLinkedListNode == lockFreeLinkedListNode2 || androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoFpsRanges, this, lockFreeLinkedListNode, lockFreeLinkedListNode2)) {
                            break;
                        }
                    } else {
                        if (isRemoved()) {
                            return null;
                        }
                        if (!(obj instanceof kotlinx.coroutines.internal.Removed)) {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                            lockFreeLinkedListNode3 = lockFreeLinkedListNode2;
                            lockFreeLinkedListNode2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) obj;
                        } else {
                            if (lockFreeLinkedListNode3 != null) {
                                break;
                            }
                            lockFreeLinkedListNode2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) getHighSpeedVideoFpsRanges.get(lockFreeLinkedListNode2);
                        }
                    }
                }
                lockFreeLinkedListNode2 = lockFreeLinkedListNode3;
            }
        }
    }

    private final void getHighSpeedVideoSizes(kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode) {
        kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode2;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getHighSpeedVideoFpsRanges;
        do {
            lockFreeLinkedListNode2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) atomicReferenceFieldUpdater.get(lockFreeLinkedListNode);
            if (getNext() != lockFreeLinkedListNode) {
                return;
            }
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoFpsRanges, lockFreeLinkedListNode, lockFreeLinkedListNode2, this));
        if (isRemoved()) {
            lockFreeLinkedListNode.getHighSpeedVideoSizes();
        }
    }

    private final kotlinx.coroutines.internal.Removed getHighResolutionOutputSizeshNQ4ISI() {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getHighSpeedVideoSizes;
        kotlinx.coroutines.internal.Removed removed = (kotlinx.coroutines.internal.Removed) atomicReferenceFieldUpdater.get(this);
        if (removed != null) {
            return removed;
        }
        kotlinx.coroutines.internal.Removed removed2 = new kotlinx.coroutines.internal.Removed(this);
        atomicReferenceFieldUpdater.set(this, removed2);
        return removed2;
    }

    public final boolean addNext(kotlinx.coroutines.internal.LockFreeLinkedListNode node, kotlinx.coroutines.internal.LockFreeLinkedListNode next) {
        getHighSpeedVideoFpsRanges.set(node, this);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getHighSpeedVideoFpsRangesFor;
        atomicReferenceFieldUpdater.set(node, next);
        if (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, next, node)) {
            return false;
        }
        node.getHighSpeedVideoSizes(next);
        return true;
    }

    public final boolean addOneIfEmpty(kotlinx.coroutines.internal.LockFreeLinkedListNode node) {
        getHighSpeedVideoFpsRanges.set(node, this);
        getHighSpeedVideoFpsRangesFor.set(node, this);
        while (getNext() == this) {
            if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoFpsRangesFor, this, this, node)) {
                node.getHighSpeedVideoSizes(this);
                return true;
            }
        }
        return false;
    }

    public final java.lang.Object getNext() {
        return getHighSpeedVideoFpsRangesFor.get(this);
    }
}
