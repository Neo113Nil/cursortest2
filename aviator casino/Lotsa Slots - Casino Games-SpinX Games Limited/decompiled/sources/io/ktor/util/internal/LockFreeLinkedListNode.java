package io.ktor.util.internal;

/* compiled from: LockFreeLinkedList.kt */
@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u0001:\u0004NOPQB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0000j\u0002`\u00072\u000e\b\u0004\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0081\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\n2\n\u0010\b\u001a\u00060\u0000j\u0002`\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\n\u0010\b\u001a\u00060\u0000j\u0002`\u0007¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\f\b\u0000\u0010\u0014*\u00060\u0000j\u0002`\u00072\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0018\u001a\u00020\n2\n\u0010\b\u001a\u00060\u0000j\u0002`\u00072\u000e\b\u0004\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010\u001c\u001a\u00020\n2\n\u0010\b\u001a\u00060\u0000j\u0002`\u00072\u0016\u0010\u001b\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0007\u0012\u0004\u0012\u00020\n0\u001aH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJG\u0010\u001e\u001a\u00020\n2\n\u0010\b\u001a\u00060\u0000j\u0002`\u00072\u0016\u0010\u001b\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0007\u0012\u0004\u0012\u00020\n0\u001a2\u000e\b\u0004\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010!\u001a\u00020\n2\n\u0010\b\u001a\u00060\u0000j\u0002`\u00072\n\u0010 \u001a\u00060\u0000j\u0002`\u0007H\u0001¢\u0006\u0004\b!\u0010\"J/\u0010%\u001a\u00020$2\n\u0010\b\u001a\u00060\u0000j\u0002`\u00072\n\u0010 \u001a\u00060\u0000j\u0002`\u00072\u0006\u0010#\u001a\u00020\fH\u0001¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\nH\u0016¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0011¢\u0006\u0004\b)\u0010\u0003J\u0011\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\f\u0012\b\u0012\u00060\u0000j\u0002`\u00070/¢\u0006\u0004\b0\u00101J\u001a\u00102\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0014\u0018\u0001H\u0086\b¢\u0006\u0004\b2\u00103J1\u00104\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0014\u0018\u00012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u001aH\u0086\bø\u0001\u0000¢\u0006\u0004\b4\u00105J\u001b\u00106\u001a\u00020\u00112\n\u0010 \u001a\u00060\u0000j\u0002`\u0007H\u0002¢\u0006\u0004\b6\u0010\u0013J\u001b\u00107\u001a\u00020\u00112\n\u0010 \u001a\u00060\u0000j\u0002`\u0007H\u0002¢\u0006\u0004\b7\u0010\u0013J\u0013\u00108\u001a\u00060\u0000j\u0002`\u0007H\u0002¢\u0006\u0004\b8\u0010.J\u0013\u00109\u001a\u00060\u0000j\u0002`\u0007H\u0002¢\u0006\u0004\b9\u0010.J\u000f\u0010:\u001a\u00020\u0011H\u0001¢\u0006\u0004\b:\u0010\u0003J-\u0010>\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00072\n\u0010;\u001a\u00060\u0000j\u0002`\u00072\b\u0010=\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\b>\u0010?J'\u0010C\u001a\u00020\u00112\n\u0010@\u001a\u00060\u0000j\u0002`\u00072\n\u0010 \u001a\u00060\u0000j\u0002`\u0007H\u0000¢\u0006\u0004\bA\u0010BJ\u000f\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FR\u0011\u0010G\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bG\u0010(R\u0011\u0010 \u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\bH\u00103R\u0015\u0010J\u001a\u00060\u0000j\u0002`\u00078F¢\u0006\u0006\u001a\u0004\bI\u0010.R\u0011\u0010@\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\bK\u00103R\u0015\u0010M\u001a\u00060\u0000j\u0002`\u00078F¢\u0006\u0006\u001a\u0004\bL\u0010.\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006R"}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode;", "", "<init>", "()V", "Lio/ktor/util/internal/Removed;", "removed", "()Lio/ktor/util/internal/Removed;", "Lio/ktor/util/internal/Node;", "node", "Lkotlin/Function0;", "", "condition", "Lio/ktor/util/internal/LockFreeLinkedListNode$CondAddOp;", "makeCondAddOp", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function0;)Lio/ktor/util/internal/LockFreeLinkedListNode$CondAddOp;", "addOneIfEmpty", "(Lio/ktor/util/internal/LockFreeLinkedListNode;)Z", "", "addLast", "(Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "T", "Lio/ktor/util/internal/LockFreeLinkedListNode$AddLastDesc;", "describeAddLast", "(Lio/ktor/util/internal/LockFreeLinkedListNode;)Lio/ktor/util/internal/LockFreeLinkedListNode$AddLastDesc;", "addLastIf", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function0;)Z", "Lkotlin/Function1;", "predicate", "addLastIfPrev", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function1;)Z", "addLastIfPrevAndIf", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Z", io.ktor.http.LinkHeader.Rel.Next, "addNext", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)Z", "condAdd", "", "tryCondAddNext", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode$CondAddOp;)I", "remove", "()Z", "helpRemove", "Lio/ktor/util/internal/AtomicDesc;", "describeRemove", "()Lio/ktor/util/internal/AtomicDesc;", "removeFirstOrNull", "()Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "describeRemoveFirst", "()Lio/ktor/util/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "removeFirstIfIsInstanceOf", "()Ljava/lang/Object;", "removeFirstIfIsInstanceOfOrPeekIf", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "finishAdd", "finishRemove", "markPrev", "findHead", "helpDelete", "_prev", "Lio/ktor/util/internal/OpDescriptor;", "op", "correctPrev", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/OpDescriptor;)Lio/ktor/util/internal/LockFreeLinkedListNode;", "prev", "validateNode$ktor_utils", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "validateNode", "", "toString", "()Ljava/lang/String;", "isRemoved", "getNext", "getNextNode", "nextNode", "getPrev", "getPrevNode", "prevNode", "CondAddOp", "AddLastDesc", "RemoveFirstDesc", "AbstractAtomicDesc", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public class LockFreeLinkedListNode {
    static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _next$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.util.internal.LockFreeLinkedListNode.class, java.lang.Object.class, "_next");
    static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _prev$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.util.internal.LockFreeLinkedListNode.class, java.lang.Object.class, "_prev");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater removedRef$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.util.internal.LockFreeLinkedListNode.class, java.lang.Object.class, "removedRef");
    volatile /* synthetic */ java.lang.Object _next = this;
    volatile /* synthetic */ java.lang.Object _prev = this;
    private volatile /* synthetic */ java.lang.Object removedRef = null;

    /* JADX INFO: Access modifiers changed from: private */
    public final io.ktor.util.internal.Removed removed() {
        io.ktor.util.internal.Removed removed = (io.ktor.util.internal.Removed) this.removedRef;
        if (removed != null) {
            return removed;
        }
        io.ktor.util.internal.Removed removed2 = new io.ktor.util.internal.Removed(this);
        removedRef$FU.lazySet(this, removed2);
        return removed2;
    }

    /* compiled from: LockFreeLinkedList.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u001e\u0010\u000e\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$CondAddOp;", "Lio/ktor/util/internal/AtomicOp;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "newNode", "<init>", "(Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "affected", "", com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE, "", "complete", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Ljava/lang/Object;)V", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "oldNext", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class CondAddOp extends io.ktor.util.internal.AtomicOp<io.ktor.util.internal.LockFreeLinkedListNode> {
        public final io.ktor.util.internal.LockFreeLinkedListNode newNode;
        public io.ktor.util.internal.LockFreeLinkedListNode oldNext;

        public CondAddOp(io.ktor.util.internal.LockFreeLinkedListNode newNode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newNode, "newNode");
            this.newNode = newNode;
        }

        @Override // io.ktor.util.internal.AtomicOp
        public void complete(io.ktor.util.internal.LockFreeLinkedListNode affected, java.lang.Object failure) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(affected, "affected");
            boolean z = failure == null;
            io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode = z ? this.newNode : this.oldNext;
            if (lockFreeLinkedListNode != null && androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(io.ktor.util.internal.LockFreeLinkedListNode._next$FU, affected, this, lockFreeLinkedListNode) && z) {
                io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode2 = this.newNode;
                io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode3 = this.oldNext;
                kotlin.jvm.internal.Intrinsics.checkNotNull(lockFreeLinkedListNode3);
                lockFreeLinkedListNode2.finishAdd(lockFreeLinkedListNode3);
            }
        }
    }

    public final io.ktor.util.internal.LockFreeLinkedListNode.CondAddOp makeCondAddOp(io.ktor.util.internal.LockFreeLinkedListNode node, kotlin.jvm.functions.Function0<java.lang.Boolean> condition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(node, "node");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(condition, "condition");
        return new io.ktor.util.internal.LockFreeLinkedListNode$makeCondAddOp$1(node, condition);
    }

    public final boolean isRemoved() {
        return getNext() instanceof io.ktor.util.internal.Removed;
    }

    public final io.ktor.util.internal.LockFreeLinkedListNode getNextNode() {
        return io.ktor.util.internal.LockFreeLinkedListKt.unwrap(getNext());
    }

    public final io.ktor.util.internal.LockFreeLinkedListNode getPrevNode() {
        return io.ktor.util.internal.LockFreeLinkedListKt.unwrap(getPrev());
    }

    public final boolean addOneIfEmpty(io.ktor.util.internal.LockFreeLinkedListNode node) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(node, "node");
        _prev$FU.lazySet(node, this);
        _next$FU.lazySet(node, this);
        while (getNext() == this) {
            if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_next$FU, this, this, node)) {
                node.finishAdd(this);
                return true;
            }
        }
        return false;
    }

    public final void addLast(io.ktor.util.internal.LockFreeLinkedListNode node) {
        java.lang.Object prev;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(node, "node");
        do {
            prev = getPrev();
            kotlin.jvm.internal.Intrinsics.checkNotNull(prev, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
        } while (!((io.ktor.util.internal.LockFreeLinkedListNode) prev).addNext(node, this));
    }

    public final <T extends io.ktor.util.internal.LockFreeLinkedListNode> io.ktor.util.internal.LockFreeLinkedListNode.AddLastDesc<T> describeAddLast(T node) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(node, "node");
        return new io.ktor.util.internal.LockFreeLinkedListNode.AddLastDesc<>(this, node);
    }

    public final boolean addLastIfPrev(io.ktor.util.internal.LockFreeLinkedListNode node, kotlin.jvm.functions.Function1<? super io.ktor.util.internal.LockFreeLinkedListNode, java.lang.Boolean> predicate) {
        io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(node, "node");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "predicate");
        do {
            java.lang.Object prev = getPrev();
            kotlin.jvm.internal.Intrinsics.checkNotNull(prev, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            lockFreeLinkedListNode = (io.ktor.util.internal.LockFreeLinkedListNode) prev;
            if (!predicate.invoke(lockFreeLinkedListNode).booleanValue()) {
                return false;
            }
        } while (!lockFreeLinkedListNode.addNext(node, this));
        return true;
    }

    public final boolean addNext(io.ktor.util.internal.LockFreeLinkedListNode node, io.ktor.util.internal.LockFreeLinkedListNode next) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(node, "node");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(next, "next");
        _prev$FU.lazySet(node, this);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
        atomicReferenceFieldUpdater.lazySet(node, next);
        if (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, next, node)) {
            return false;
        }
        node.finishAdd(next);
        return true;
    }

    public final int tryCondAddNext(io.ktor.util.internal.LockFreeLinkedListNode node, io.ktor.util.internal.LockFreeLinkedListNode next, io.ktor.util.internal.LockFreeLinkedListNode.CondAddOp condAdd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(node, "node");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(next, "next");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(condAdd, "condAdd");
        _prev$FU.lazySet(node, this);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
        atomicReferenceFieldUpdater.lazySet(node, next);
        condAdd.oldNext = next;
        if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, next, condAdd)) {
            return condAdd.perform(this) == null ? 1 : 2;
        }
        return 0;
    }

    public boolean remove() {
        java.lang.Object next;
        io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode;
        do {
            next = getNext();
            if ((next instanceof io.ktor.util.internal.Removed) || next == this) {
                return false;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            lockFreeLinkedListNode = (io.ktor.util.internal.LockFreeLinkedListNode) next;
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_next$FU, this, next, lockFreeLinkedListNode.removed()));
        finishRemove(lockFreeLinkedListNode);
        return true;
    }

    public final void helpRemove() {
        java.lang.Object next = getNext();
        io.ktor.util.internal.Removed removed = next instanceof io.ktor.util.internal.Removed ? (io.ktor.util.internal.Removed) next : null;
        if (removed == null) {
            throw new java.lang.IllegalStateException("Must be invoked on a removed node".toString());
        }
        finishRemove(removed.ref);
    }

    public io.ktor.util.internal.AtomicDesc describeRemove() {
        if (isRemoved()) {
            return null;
        }
        return new io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc() { // from class: io.ktor.util.internal.LockFreeLinkedListNode$describeRemove$1
            private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _originalNext$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.util.internal.LockFreeLinkedListNode$describeRemove$1.class, java.lang.Object.class, "_originalNext");
            private volatile /* synthetic */ java.lang.Object _originalNext = null;

            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            /* renamed from: getAffectedNode, reason: from getter */
            protected io.ktor.util.internal.LockFreeLinkedListNode getThis$0() {
                return io.ktor.util.internal.LockFreeLinkedListNode.this;
            }

            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            /* renamed from: getOriginalNext */
            protected io.ktor.util.internal.LockFreeLinkedListNode getQueue() {
                return (io.ktor.util.internal.LockFreeLinkedListNode) this._originalNext;
            }

            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            protected java.lang.Object failure(io.ktor.util.internal.LockFreeLinkedListNode affected, java.lang.Object next) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(affected, "affected");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(next, "next");
                if (next instanceof io.ktor.util.internal.Removed) {
                    return io.ktor.util.internal.LockFreeLinkedListKt.getALREADY_REMOVED();
                }
                return null;
            }

            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            protected java.lang.Object onPrepare(io.ktor.util.internal.LockFreeLinkedListNode affected, io.ktor.util.internal.LockFreeLinkedListNode next) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(affected, "affected");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(next, "next");
                androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_originalNext$FU, this, null, next);
                return null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            public io.ktor.util.internal.Removed updatedNext(io.ktor.util.internal.LockFreeLinkedListNode affected, io.ktor.util.internal.LockFreeLinkedListNode next) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(affected, "affected");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(next, "next");
                return next.removed();
            }

            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            protected void finishOnSuccess(io.ktor.util.internal.LockFreeLinkedListNode affected, io.ktor.util.internal.LockFreeLinkedListNode next) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(affected, "affected");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(next, "next");
                io.ktor.util.internal.LockFreeLinkedListNode.this.finishRemove(next);
            }
        };
    }

    public final io.ktor.util.internal.LockFreeLinkedListNode removeFirstOrNull() {
        while (true) {
            java.lang.Object next = getNext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (io.ktor.util.internal.LockFreeLinkedListNode) next;
            if (lockFreeLinkedListNode == this) {
                return null;
            }
            if (lockFreeLinkedListNode.remove()) {
                return lockFreeLinkedListNode;
            }
            lockFreeLinkedListNode.helpDelete();
        }
    }

    public final io.ktor.util.internal.LockFreeLinkedListNode.RemoveFirstDesc<io.ktor.util.internal.LockFreeLinkedListNode> describeRemoveFirst() {
        return new io.ktor.util.internal.LockFreeLinkedListNode.RemoveFirstDesc<>(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, io.ktor.util.internal.LockFreeLinkedListNode] */
    public final /* synthetic */ <T> T removeFirstIfIsInstanceOf() {
        while (true) {
            java.lang.Object next = getNext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            ?? r0 = (T) ((io.ktor.util.internal.LockFreeLinkedListNode) next);
            if (r0 == this) {
                return null;
            }
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
            if (!(r0 instanceof java.lang.Object)) {
                return null;
            }
            if (r0.remove()) {
                return r0;
            }
            r0.helpDelete();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, io.ktor.util.internal.LockFreeLinkedListNode, java.lang.Object] */
    public final /* synthetic */ <T> T removeFirstIfIsInstanceOfOrPeekIf(kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "predicate");
        while (true) {
            java.lang.Object next = getNext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (io.ktor.util.internal.LockFreeLinkedListNode) next;
            if (lockFreeLinkedListNode == this) {
                return null;
            }
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
            if (!(lockFreeLinkedListNode instanceof java.lang.Object)) {
                return null;
            }
            if (predicate.invoke(lockFreeLinkedListNode).booleanValue() || lockFreeLinkedListNode.remove()) {
                return lockFreeLinkedListNode;
            }
            lockFreeLinkedListNode.helpDelete();
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b\u0016\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u00022\u00020\u0004B\u001b\u0012\n\u0010\u0005\u001a\u00060\u0001j\u0002`\u0002\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\u00102\n\u0010\r\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\n\u0010\r\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u000f\u001a\u00060\u0001j\u0002`\u0002H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u000f\u001a\u00060\u0001j\u0002`\u0002H\u0014¢\u0006\u0004\b\u0015\u0010\u0014J'\u0010\u0017\u001a\u00020\u00162\n\u0010\r\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u000f\u001a\u00060\u0001j\u0002`\u0002H\u0014¢\u0006\u0004\b\u0017\u0010\bR\u0018\u0010\u0005\u001a\u00060\u0001j\u0002`\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0006\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u00060\u0001j\u0002`\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$AddLastDesc;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "T", "Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "queue", "node", "<init>", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "Lio/ktor/util/internal/OpDescriptor;", "op", "takeAffectedNode", "(Lio/ktor/util/internal/OpDescriptor;)Lio/ktor/util/internal/LockFreeLinkedListNode;", "affected", "", io.ktor.http.LinkHeader.Rel.Next, "", "retry", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Ljava/lang/Object;)Z", "onPrepare", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "updatedNext", "", "finishOnSuccess", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "getAffectedNode", "()Lio/ktor/util/internal/LockFreeLinkedListNode;", "affectedNode", "getOriginalNext", "originalNext", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class AddLastDesc<T extends io.ktor.util.internal.LockFreeLinkedListNode> extends io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc {
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _affectedNode$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.util.internal.LockFreeLinkedListNode.AddLastDesc.class, java.lang.Object.class, "_affectedNode");
        private volatile /* synthetic */ java.lang.Object _affectedNode;
        public final T node;
        public final io.ktor.util.internal.LockFreeLinkedListNode queue;

        public AddLastDesc(io.ktor.util.internal.LockFreeLinkedListNode queue, T node) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queue, "queue");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(node, "node");
            this.queue = queue;
            this.node = node;
            if (node._next != node || node._prev != node) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            this._affectedNode = null;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected final io.ktor.util.internal.LockFreeLinkedListNode takeAffectedNode(io.ktor.util.internal.OpDescriptor op) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(op, "op");
            while (true) {
                java.lang.Object obj = this.queue._prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (io.ktor.util.internal.LockFreeLinkedListNode) obj;
                java.lang.Object obj2 = lockFreeLinkedListNode._next;
                io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode2 = this.queue;
                if (obj2 == lockFreeLinkedListNode2 || obj2 == op) {
                    return lockFreeLinkedListNode;
                }
                if (!(obj2 instanceof io.ktor.util.internal.OpDescriptor)) {
                    io.ktor.util.internal.LockFreeLinkedListNode correctPrev = lockFreeLinkedListNode2.correctPrev(lockFreeLinkedListNode, op);
                    if (correctPrev != null) {
                        return correctPrev;
                    }
                } else {
                    ((io.ktor.util.internal.OpDescriptor) obj2).perform(lockFreeLinkedListNode);
                }
            }
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /* renamed from: getAffectedNode */
        protected final io.ktor.util.internal.LockFreeLinkedListNode getThis$0() {
            return (io.ktor.util.internal.LockFreeLinkedListNode) this._affectedNode;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /* renamed from: getOriginalNext, reason: from getter */
        protected final io.ktor.util.internal.LockFreeLinkedListNode getQueue() {
            return this.queue;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected boolean retry(io.ktor.util.internal.LockFreeLinkedListNode affected, java.lang.Object next) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(next, "next");
            return next != this.queue;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected java.lang.Object onPrepare(io.ktor.util.internal.LockFreeLinkedListNode affected, io.ktor.util.internal.LockFreeLinkedListNode next) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(next, "next");
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_affectedNode$FU, this, null, affected);
            return null;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected java.lang.Object updatedNext(io.ktor.util.internal.LockFreeLinkedListNode affected, io.ktor.util.internal.LockFreeLinkedListNode next) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(next, "next");
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(io.ktor.util.internal.LockFreeLinkedListNode._prev$FU, this.node, this.node, affected);
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(io.ktor.util.internal.LockFreeLinkedListNode._next$FU, this.node, this.node, this.queue);
            return this.node;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected void finishOnSuccess(io.ktor.util.internal.LockFreeLinkedListNode affected, io.ktor.util.internal.LockFreeLinkedListNode next) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(next, "next");
            this.node.finishAdd(this.queue);
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\u0010\f\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\u00122\n\u0010\f\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0017\u001a\u0004\u0018\u00010\r2\n\u0010\f\u001a\u00060\u0003j\u0002`\u00042\n\u0010\u000e\u001a\u00060\u0003j\u0002`\u0004H\u0004¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0003j\u0002`\u00042\n\u0010\u000e\u001a\u00060\u0003j\u0002`\u0004H\u0004¢\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u001b\u001a\u00020\u001a2\n\u0010\f\u001a\u00060\u0003j\u0002`\u00042\n\u0010\u000e\u001a\u00060\u0003j\u0002`\u0004H\u0004¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0017\u0010\"\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010%\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001c\u0010'\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006("}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "T", "Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "queue", "<init>", "(Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "Lio/ktor/util/internal/OpDescriptor;", "op", "takeAffectedNode", "(Lio/ktor/util/internal/OpDescriptor;)Lio/ktor/util/internal/LockFreeLinkedListNode;", "affected", "", io.ktor.http.LinkHeader.Rel.Next, com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE, "(Lio/ktor/util/internal/LockFreeLinkedListNode;Ljava/lang/Object;)Ljava/lang/Object;", "node", "", "validatePrepared", "(Ljava/lang/Object;)Z", "retry", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Ljava/lang/Object;)Z", "onPrepare", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "updatedNext", "", "finishOnSuccess", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "getResult", "()Ljava/lang/Object;", "getResult$annotations", "()V", "result", "getAffectedNode", "()Lio/ktor/util/internal/LockFreeLinkedListNode;", "affectedNode", "getOriginalNext", "originalNext", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class RemoveFirstDesc<T> extends io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc {
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _affectedNode$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.util.internal.LockFreeLinkedListNode.RemoveFirstDesc.class, java.lang.Object.class, "_affectedNode");
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _originalNext$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.util.internal.LockFreeLinkedListNode.RemoveFirstDesc.class, java.lang.Object.class, "_originalNext");
        private volatile /* synthetic */ java.lang.Object _affectedNode;
        private volatile /* synthetic */ java.lang.Object _originalNext;
        public final io.ktor.util.internal.LockFreeLinkedListNode queue;

        public static /* synthetic */ void getResult$annotations() {
        }

        protected boolean validatePrepared(T node) {
            return true;
        }

        public RemoveFirstDesc(io.ktor.util.internal.LockFreeLinkedListNode queue) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queue, "queue");
            this.queue = queue;
            this._affectedNode = null;
            this._originalNext = null;
        }

        public final T getResult() {
            java.lang.Object this$0 = getThis$0();
            kotlin.jvm.internal.Intrinsics.checkNotNull(this$0);
            return (T) this$0;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected final io.ktor.util.internal.LockFreeLinkedListNode takeAffectedNode(io.ktor.util.internal.OpDescriptor op) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(op, "op");
            java.lang.Object next = this.queue.getNext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            return (io.ktor.util.internal.LockFreeLinkedListNode) next;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /* renamed from: getAffectedNode */
        protected final io.ktor.util.internal.LockFreeLinkedListNode getThis$0() {
            return (io.ktor.util.internal.LockFreeLinkedListNode) this._affectedNode;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /* renamed from: getOriginalNext */
        protected final io.ktor.util.internal.LockFreeLinkedListNode getQueue() {
            return (io.ktor.util.internal.LockFreeLinkedListNode) this._originalNext;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected java.lang.Object failure(io.ktor.util.internal.LockFreeLinkedListNode affected, java.lang.Object next) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(next, "next");
            if (affected == this.queue) {
                return io.ktor.util.internal.LockFreeLinkedListKt.getLIST_EMPTY();
            }
            return null;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected final boolean retry(io.ktor.util.internal.LockFreeLinkedListNode affected, java.lang.Object next) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(next, "next");
            if (!(next instanceof io.ktor.util.internal.Removed)) {
                return false;
            }
            affected.helpDelete();
            return true;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected final java.lang.Object onPrepare(io.ktor.util.internal.LockFreeLinkedListNode affected, io.ktor.util.internal.LockFreeLinkedListNode next) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(next, "next");
            if (!(!(affected instanceof io.ktor.util.internal.LockFreeLinkedListHead))) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            if (!validatePrepared(affected)) {
                obj = io.ktor.util.internal.LockFreeLinkedListKt.REMOVE_PREPARED;
                return obj;
            }
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_affectedNode$FU, this, null, affected);
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_originalNext$FU, this, null, next);
            return null;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected final java.lang.Object updatedNext(io.ktor.util.internal.LockFreeLinkedListNode affected, io.ktor.util.internal.LockFreeLinkedListNode next) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(next, "next");
            return next.removed();
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected final void finishOnSuccess(io.ktor.util.internal.LockFreeLinkedListNode affected, io.ktor.util.internal.LockFreeLinkedListNode next) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(next, "next");
            affected.finishRemove(next);
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\u0010\n\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\u000f2\n\u0010\n\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\u0010\n\u001a\u00060\u0006j\u0002`\u00072\n\u0010\f\u001a\u00060\u0006j\u0002`\u0007H$¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\u0006j\u0002`\u00072\n\u0010\f\u001a\u00060\u0006j\u0002`\u0007H$¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u0016\u001a\u00020\u00152\n\u0010\n\u001a\u00060\u0006j\u0002`\u00072\n\u0010\f\u001a\u00060\u0006j\u0002`\u0007H$¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u00020\u00152\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00182\b\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078$X¤\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006#"}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "Lio/ktor/util/internal/AtomicDesc;", "<init>", "()V", "Lio/ktor/util/internal/OpDescriptor;", "op", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "takeAffectedNode", "(Lio/ktor/util/internal/OpDescriptor;)Lio/ktor/util/internal/LockFreeLinkedListNode;", "affected", "", io.ktor.http.LinkHeader.Rel.Next, com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE, "(Lio/ktor/util/internal/LockFreeLinkedListNode;Ljava/lang/Object;)Ljava/lang/Object;", "", "retry", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Ljava/lang/Object;)Z", "onPrepare", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "updatedNext", "", "finishOnSuccess", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "Lio/ktor/util/internal/AtomicOp;", "prepare", "(Lio/ktor/util/internal/AtomicOp;)Ljava/lang/Object;", "complete", "(Lio/ktor/util/internal/AtomicOp;Ljava/lang/Object;)V", "getAffectedNode", "()Lio/ktor/util/internal/LockFreeLinkedListNode;", "affectedNode", "getOriginalNext", "originalNext", "PrepareOp", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class AbstractAtomicDesc extends io.ktor.util.internal.AtomicDesc {
        protected java.lang.Object failure(io.ktor.util.internal.LockFreeLinkedListNode affected, java.lang.Object next) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(next, "next");
            return null;
        }

        protected abstract void finishOnSuccess(io.ktor.util.internal.LockFreeLinkedListNode affected, io.ktor.util.internal.LockFreeLinkedListNode next);

        /* renamed from: getAffectedNode */
        protected abstract io.ktor.util.internal.LockFreeLinkedListNode getThis$0();

        /* renamed from: getOriginalNext */
        protected abstract io.ktor.util.internal.LockFreeLinkedListNode getQueue();

        protected abstract java.lang.Object onPrepare(io.ktor.util.internal.LockFreeLinkedListNode affected, io.ktor.util.internal.LockFreeLinkedListNode next);

        protected boolean retry(io.ktor.util.internal.LockFreeLinkedListNode affected, java.lang.Object next) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(affected, "affected");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(next, "next");
            return false;
        }

        protected abstract java.lang.Object updatedNext(io.ktor.util.internal.LockFreeLinkedListNode affected, io.ktor.util.internal.LockFreeLinkedListNode next);

        protected io.ktor.util.internal.LockFreeLinkedListNode takeAffectedNode(io.ktor.util.internal.OpDescriptor op) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(op, "op");
            io.ktor.util.internal.LockFreeLinkedListNode this$0 = getThis$0();
            kotlin.jvm.internal.Intrinsics.checkNotNull(this$0);
            return this$0;
        }

        /* compiled from: LockFreeLinkedList.kt */
        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B-\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u001e\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc$PrepareOp;", "Lio/ktor/util/internal/OpDescriptor;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", io.ktor.http.LinkHeader.Rel.Next, "Lio/ktor/util/internal/AtomicOp;", "op", "Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "desc", "<init>", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/AtomicOp;Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;)V", "", "affected", "perform", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/AtomicOp;", "Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class PrepareOp extends io.ktor.util.internal.OpDescriptor {
            public final io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc desc;
            public final io.ktor.util.internal.LockFreeLinkedListNode next;
            public final io.ktor.util.internal.AtomicOp<io.ktor.util.internal.LockFreeLinkedListNode> op;

            /* JADX WARN: Multi-variable type inference failed */
            public PrepareOp(io.ktor.util.internal.LockFreeLinkedListNode next, io.ktor.util.internal.AtomicOp<? super io.ktor.util.internal.LockFreeLinkedListNode> op, io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc desc) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(next, "next");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(op, "op");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(desc, "desc");
                this.next = next;
                this.op = op;
                this.desc = desc;
            }

            @Override // io.ktor.util.internal.OpDescriptor
            public java.lang.Object perform(java.lang.Object affected) {
                java.lang.Object obj;
                kotlin.jvm.internal.Intrinsics.checkNotNull(affected, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (io.ktor.util.internal.LockFreeLinkedListNode) affected;
                java.lang.Object onPrepare = this.desc.onPrepare(lockFreeLinkedListNode, this.next);
                if (onPrepare != null) {
                    obj = io.ktor.util.internal.LockFreeLinkedListKt.REMOVE_PREPARED;
                    if (onPrepare == obj) {
                        if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(io.ktor.util.internal.LockFreeLinkedListNode._next$FU, lockFreeLinkedListNode, this, this.next.removed())) {
                            lockFreeLinkedListNode.helpDelete();
                        }
                    } else {
                        this.op.tryDecide(onPrepare);
                        androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(io.ktor.util.internal.LockFreeLinkedListNode._next$FU, lockFreeLinkedListNode, this, this.next);
                    }
                    return onPrepare;
                }
                androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(io.ktor.util.internal.LockFreeLinkedListNode._next$FU, lockFreeLinkedListNode, this, this.op.isDecided() ? this.next : this.op);
                return null;
            }
        }

        @Override // io.ktor.util.internal.AtomicDesc
        public final java.lang.Object prepare(io.ktor.util.internal.AtomicOp<?> op) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(op, "op");
            while (true) {
                io.ktor.util.internal.LockFreeLinkedListNode takeAffectedNode = takeAffectedNode(op);
                java.lang.Object obj2 = takeAffectedNode._next;
                if (obj2 == op || op.isDecided()) {
                    return null;
                }
                if (obj2 instanceof io.ktor.util.internal.OpDescriptor) {
                    ((io.ktor.util.internal.OpDescriptor) obj2).perform(takeAffectedNode);
                } else {
                    java.lang.Object failure = failure(takeAffectedNode, obj2);
                    if (failure != null) {
                        return failure;
                    }
                    if (retry(takeAffectedNode, obj2)) {
                        continue;
                    } else {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                        io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc.PrepareOp prepareOp = new io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc.PrepareOp((io.ktor.util.internal.LockFreeLinkedListNode) obj2, op, this);
                        if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(io.ktor.util.internal.LockFreeLinkedListNode._next$FU, takeAffectedNode, obj2, prepareOp)) {
                            java.lang.Object perform = prepareOp.perform(takeAffectedNode);
                            obj = io.ktor.util.internal.LockFreeLinkedListKt.REMOVE_PREPARED;
                            if (perform != obj) {
                                return perform;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }

        @Override // io.ktor.util.internal.AtomicDesc
        public final void complete(io.ktor.util.internal.AtomicOp<?> op, java.lang.Object failure) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(op, "op");
            boolean z = failure == null;
            io.ktor.util.internal.LockFreeLinkedListNode this$0 = getThis$0();
            if (this$0 == null) {
                if (!(!z)) {
                    throw new java.lang.IllegalStateException("Check failed.");
                }
                return;
            }
            io.ktor.util.internal.LockFreeLinkedListNode queue = getQueue();
            if (queue == null) {
                if (!(!z)) {
                    throw new java.lang.IllegalStateException("Check failed.");
                }
            } else {
                if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(io.ktor.util.internal.LockFreeLinkedListNode._next$FU, this$0, op, z ? updatedNext(this$0, queue) : queue) && z) {
                    finishOnSuccess(this$0, queue);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishRemove(io.ktor.util.internal.LockFreeLinkedListNode next) {
        helpDelete();
        next.correctPrev(io.ktor.util.internal.LockFreeLinkedListKt.unwrap(this._prev), null);
    }

    private final io.ktor.util.internal.LockFreeLinkedListNode findHead() {
        io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode = this;
        while (!(lockFreeLinkedListNode instanceof io.ktor.util.internal.LockFreeLinkedListHead)) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode();
            if (lockFreeLinkedListNode == this) {
                throw new java.lang.IllegalStateException("Cannot loop to this while looking for list head".toString());
            }
        }
        return lockFreeLinkedListNode;
    }

    public final void helpDelete() {
        java.lang.Object next;
        io.ktor.util.internal.LockFreeLinkedListNode markPrev = markPrev();
        java.lang.Object obj = this._next;
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.internal.Removed");
        io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode = ((io.ktor.util.internal.Removed) obj).ref;
        while (true) {
            io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode2 = null;
            while (true) {
                java.lang.Object next2 = lockFreeLinkedListNode.getNext();
                if (next2 instanceof io.ktor.util.internal.Removed) {
                    lockFreeLinkedListNode.markPrev();
                    lockFreeLinkedListNode = ((io.ktor.util.internal.Removed) next2).ref;
                } else {
                    next = markPrev.getNext();
                    if (next instanceof io.ktor.util.internal.Removed) {
                        if (lockFreeLinkedListNode2 != null) {
                            break;
                        } else {
                            markPrev = io.ktor.util.internal.LockFreeLinkedListKt.unwrap(markPrev._prev);
                        }
                    } else if (next != this) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                        io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode3 = (io.ktor.util.internal.LockFreeLinkedListNode) next;
                        if (lockFreeLinkedListNode3 == lockFreeLinkedListNode) {
                            return;
                        }
                        lockFreeLinkedListNode2 = markPrev;
                        markPrev = lockFreeLinkedListNode3;
                    } else if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_next$FU, markPrev, this, lockFreeLinkedListNode)) {
                        return;
                    }
                }
            }
            markPrev.markPrev();
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_next$FU, lockFreeLinkedListNode2, markPrev, ((io.ktor.util.internal.Removed) next).ref);
            markPrev = lockFreeLinkedListNode2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final io.ktor.util.internal.LockFreeLinkedListNode correctPrev(io.ktor.util.internal.LockFreeLinkedListNode _prev, io.ktor.util.internal.OpDescriptor op) {
        java.lang.Object obj;
        while (true) {
            io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode = null;
            while (true) {
                obj = _prev._next;
                if (obj == op) {
                    return _prev;
                }
                if (obj instanceof io.ktor.util.internal.OpDescriptor) {
                    ((io.ktor.util.internal.OpDescriptor) obj).perform(_prev);
                } else if (!(obj instanceof io.ktor.util.internal.Removed)) {
                    java.lang.Object obj2 = this._prev;
                    if (obj2 instanceof io.ktor.util.internal.Removed) {
                        return null;
                    }
                    if (obj != this) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                        lockFreeLinkedListNode = _prev;
                        _prev = (io.ktor.util.internal.LockFreeLinkedListNode) obj;
                    } else {
                        if (obj2 == _prev) {
                            return null;
                        }
                        if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_prev$FU, this, obj2, _prev) && !(_prev._prev instanceof io.ktor.util.internal.Removed)) {
                            return null;
                        }
                    }
                } else {
                    if (lockFreeLinkedListNode != null) {
                        break;
                    }
                    _prev = io.ktor.util.internal.LockFreeLinkedListKt.unwrap(_prev._prev);
                }
            }
            _prev.markPrev();
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_next$FU, lockFreeLinkedListNode, _prev, ((io.ktor.util.internal.Removed) obj).ref);
            _prev = lockFreeLinkedListNode;
        }
    }

    public final void validateNode$ktor_utils(io.ktor.util.internal.LockFreeLinkedListNode prev, io.ktor.util.internal.LockFreeLinkedListNode next) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prev, "prev");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(next, "next");
        if (prev != this._prev) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        if (next != this._next) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
    }

    public java.lang.String toString() {
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).getSimpleName() + '@' + hashCode();
    }

    public final java.lang.Object getNext() {
        while (true) {
            java.lang.Object obj = this._next;
            if (!(obj instanceof io.ktor.util.internal.OpDescriptor)) {
                return obj;
            }
            ((io.ktor.util.internal.OpDescriptor) obj).perform(this);
        }
    }

    public final java.lang.Object getPrev() {
        while (true) {
            java.lang.Object obj = this._prev;
            if (obj instanceof io.ktor.util.internal.Removed) {
                return obj;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (io.ktor.util.internal.LockFreeLinkedListNode) obj;
            if (lockFreeLinkedListNode.getNext() == this) {
                return obj;
            }
            correctPrev(lockFreeLinkedListNode, null);
        }
    }

    public final boolean addLastIf(io.ktor.util.internal.LockFreeLinkedListNode node, kotlin.jvm.functions.Function0<java.lang.Boolean> condition) {
        int tryCondAddNext;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(node, "node");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(condition, "condition");
        io.ktor.util.internal.LockFreeLinkedListNode$makeCondAddOp$1 lockFreeLinkedListNode$makeCondAddOp$1 = new io.ktor.util.internal.LockFreeLinkedListNode$makeCondAddOp$1(node, condition);
        do {
            java.lang.Object prev = getPrev();
            kotlin.jvm.internal.Intrinsics.checkNotNull(prev, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            tryCondAddNext = ((io.ktor.util.internal.LockFreeLinkedListNode) prev).tryCondAddNext(node, this, lockFreeLinkedListNode$makeCondAddOp$1);
            if (tryCondAddNext == 1) {
                return true;
            }
        } while (tryCondAddNext != 2);
        return false;
    }

    public final boolean addLastIfPrevAndIf(io.ktor.util.internal.LockFreeLinkedListNode node, kotlin.jvm.functions.Function1<? super io.ktor.util.internal.LockFreeLinkedListNode, java.lang.Boolean> predicate, kotlin.jvm.functions.Function0<java.lang.Boolean> condition) {
        int tryCondAddNext;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(node, "node");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "predicate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(condition, "condition");
        io.ktor.util.internal.LockFreeLinkedListNode$makeCondAddOp$1 lockFreeLinkedListNode$makeCondAddOp$1 = new io.ktor.util.internal.LockFreeLinkedListNode$makeCondAddOp$1(node, condition);
        do {
            java.lang.Object prev = getPrev();
            kotlin.jvm.internal.Intrinsics.checkNotNull(prev, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (io.ktor.util.internal.LockFreeLinkedListNode) prev;
            if (!predicate.invoke(lockFreeLinkedListNode).booleanValue()) {
                return false;
            }
            tryCondAddNext = lockFreeLinkedListNode.tryCondAddNext(node, this, lockFreeLinkedListNode$makeCondAddOp$1);
            if (tryCondAddNext == 1) {
                return true;
            }
        } while (tryCondAddNext != 2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishAdd(io.ktor.util.internal.LockFreeLinkedListNode next) {
        java.lang.Object obj;
        do {
            obj = next._prev;
            if ((obj instanceof io.ktor.util.internal.Removed) || getNext() != next) {
                return;
            }
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_prev$FU, next, obj, this));
        if (getNext() instanceof io.ktor.util.internal.Removed) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            next.correctPrev((io.ktor.util.internal.LockFreeLinkedListNode) obj, null);
        }
    }

    private final io.ktor.util.internal.LockFreeLinkedListNode markPrev() {
        java.lang.Object obj;
        io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode;
        do {
            obj = this._prev;
            if (obj instanceof io.ktor.util.internal.Removed) {
                return ((io.ktor.util.internal.Removed) obj).ref;
            }
            if (obj == this) {
                lockFreeLinkedListNode = findHead();
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                lockFreeLinkedListNode = (io.ktor.util.internal.LockFreeLinkedListNode) obj;
            }
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_prev$FU, this, obj, lockFreeLinkedListNode.removed()));
        return (io.ktor.util.internal.LockFreeLinkedListNode) obj;
    }
}
