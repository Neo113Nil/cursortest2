package io.ktor.util.internal;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$makeCondAddOp$1;", "Lio/ktor/util/internal/LockFreeLinkedListNode$CondAddOp;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "affected", "", "prepare", "(Lio/ktor/util/internal/LockFreeLinkedListNode;)Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes17.dex */
public final class LockFreeLinkedListNode$makeCondAddOp$1 extends io.ktor.util.internal.LockFreeLinkedListNode.CondAddOp {
    final /* synthetic */ kotlin.jvm.functions.Function0<java.lang.Boolean> Camera2StreamConfigurationMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockFreeLinkedListNode$makeCondAddOp$1(io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        super(lockFreeLinkedListNode);
        this.Camera2StreamConfigurationMap = function0;
    }

    @Override // io.ktor.util.internal.AtomicOp
    public final java.lang.Object prepare(io.ktor.util.internal.LockFreeLinkedListNode affected) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(affected, "");
        if (this.Camera2StreamConfigurationMap.invoke().booleanValue()) {
            return null;
        }
        return io.ktor.util.internal.LockFreeLinkedListKt.getCONDITION_FALSE();
    }
}
