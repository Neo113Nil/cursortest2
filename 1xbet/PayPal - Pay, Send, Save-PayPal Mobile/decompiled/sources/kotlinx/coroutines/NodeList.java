package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00008WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlinx/coroutines/NodeList;", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "Lkotlinx/coroutines/Incomplete;", "<init>", "()V", "", "state", "getString", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "", "isActive", "()Z", "getList", "()Lkotlinx/coroutines/NodeList;", "list"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NodeList extends kotlinx.coroutines.internal.LockFreeLinkedListHead implements kotlinx.coroutines.Incomplete {
    @Override // kotlinx.coroutines.Incomplete
    /* renamed from: getList */
    public final kotlinx.coroutines.NodeList getCamera2StreamConfigurationMap() {
        return this;
    }

    @Override // kotlinx.coroutines.Incomplete
    /* renamed from: isActive */
    public final boolean getGetHighSpeedVideoSizes() {
        return true;
    }

    public final java.lang.String getString(java.lang.String state) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("List{");
        sb.append(state);
        sb.append("}[");
        kotlinx.coroutines.NodeList nodeList = this;
        java.lang.Object next = nodeList.getNext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(next, "");
        boolean z = true;
        for (kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) next; !kotlin.jvm.internal.Intrinsics.areEqual(lockFreeLinkedListNode, nodeList); lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode()) {
            if (lockFreeLinkedListNode instanceof kotlinx.coroutines.JobNode) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(lockFreeLinkedListNode);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public final java.lang.String toString() {
        return kotlinx.coroutines.DebugKt.getDEBUG() ? getString("Active") : super.toString();
    }
}
