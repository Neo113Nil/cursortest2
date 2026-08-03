package io.ktor.util.internal;

/* compiled from: LockFreeLinkedList.kt */
@kotlin.Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"io/ktor/util/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lio/ktor/util/internal/LockFreeLinkedListNode$CondAddOp;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "affected", "", "prepare", "(Lio/ktor/util/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes6.dex */
public final class LockFreeLinkedListNode$makeCondAddOp$1 extends io.ktor.util.internal.LockFreeLinkedListNode.CondAddOp {
    final /* synthetic */ kotlin.jvm.functions.Function0<java.lang.Boolean> $condition;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockFreeLinkedListNode$makeCondAddOp$1(io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        super(lockFreeLinkedListNode);
        this.$condition = function0;
    }

    @Override // io.ktor.util.internal.AtomicOp
    public java.lang.Object prepare(io.ktor.util.internal.LockFreeLinkedListNode affected) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(affected, "affected");
        if (this.$condition.invoke().booleanValue()) {
            return null;
        }
        return io.ktor.util.internal.LockFreeLinkedListKt.getCONDITION_FALSE();
    }
}
