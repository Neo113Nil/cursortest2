package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\b\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\u0001j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\b¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "<init>", "()V", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Node;", "", "block", "forEach", "(Lkotlin/jvm/functions/Function1;)V", "", "remove", "()Ljava/lang/Void;", "", "isRemoved", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class LockFreeLinkedListHead extends kotlinx.coroutines.internal.LockFreeLinkedListNode {
    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public boolean isRemoved() {
        return false;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    /* renamed from: remove, reason: collision with other method in class */
    public /* synthetic */ boolean mo24119remove() {
        return ((java.lang.Boolean) remove()).booleanValue();
    }

    public final void forEach(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.internal.LockFreeLinkedListNode, kotlin.Unit> block) {
        java.lang.Object next = getNext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(next, "");
        for (kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) next; !kotlin.jvm.internal.Intrinsics.areEqual(lockFreeLinkedListNode, this); lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode()) {
            block.invoke(lockFreeLinkedListNode);
        }
    }

    public final java.lang.Void remove() {
        throw new java.lang.IllegalStateException("head cannot be removed".toString());
    }
}
