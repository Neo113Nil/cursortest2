package io.ktor.util.internal;

/* compiled from: LockFreeLinkedList.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\t\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0005\u0018\u0001*\u00060\u0001j\u0002`\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0011\u0010\u0003R\u0011\u0010\u0013\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListHead;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "<init>", "()V", "Lio/ktor/util/internal/Node;", "T", "Lkotlin/Function1;", "", "block", "forEach", "(Lkotlin/jvm/functions/Function1;)V", "", "remove", "()Z", "", "describeRemove", "()Ljava/lang/Void;", "validate$ktor_utils", "validate", "isEmpty", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public class LockFreeLinkedListHead extends io.ktor.util.internal.LockFreeLinkedListNode {
    @Override // io.ktor.util.internal.LockFreeLinkedListNode
    public /* bridge */ /* synthetic */ io.ktor.util.internal.AtomicDesc describeRemove() {
        return (io.ktor.util.internal.AtomicDesc) m10760describeRemove();
    }

    public final boolean isEmpty() {
        return getNext() == this;
    }

    public final /* synthetic */ <T extends io.ktor.util.internal.LockFreeLinkedListNode> void forEach(kotlin.jvm.functions.Function1<? super T, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        java.lang.Object next = getNext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
        for (io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (io.ktor.util.internal.LockFreeLinkedListNode) next; !kotlin.jvm.internal.Intrinsics.areEqual(lockFreeLinkedListNode, this); lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode()) {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
            if (lockFreeLinkedListNode instanceof io.ktor.util.internal.LockFreeLinkedListNode) {
                block.invoke(lockFreeLinkedListNode);
            }
        }
    }

    @Override // io.ktor.util.internal.LockFreeLinkedListNode
    public final boolean remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    /* renamed from: describeRemove, reason: collision with other method in class */
    public final java.lang.Void m10760describeRemove() {
        throw new java.lang.UnsupportedOperationException();
    }

    public final void validate$ktor_utils() {
        java.lang.Object next = getNext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
        io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (io.ktor.util.internal.LockFreeLinkedListNode) next;
        io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode2 = this;
        io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode3 = lockFreeLinkedListNode;
        while (!kotlin.jvm.internal.Intrinsics.areEqual(lockFreeLinkedListNode3, this)) {
            io.ktor.util.internal.LockFreeLinkedListNode nextNode = lockFreeLinkedListNode3.getNextNode();
            lockFreeLinkedListNode3.validateNode$ktor_utils(lockFreeLinkedListNode2, nextNode);
            lockFreeLinkedListNode2 = lockFreeLinkedListNode3;
            lockFreeLinkedListNode3 = nextNode;
        }
        java.lang.Object next2 = getNext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(next2, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
        validateNode$ktor_utils(lockFreeLinkedListNode2, (io.ktor.util.internal.LockFreeLinkedListNode) next2);
    }
}
