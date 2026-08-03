package androidx.compose.foundation.gestures;

/* compiled from: Draggable.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.AbstractDraggableNode", f = "Draggable.kt", i = {0, 0, 0}, l = {546, 549}, m = "processDragStop", n = {"this", "$this$processDragStop", androidx.core.app.NotificationCompat.CATEGORY_EVENT}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes.dex */
final class AbstractDraggableNode$processDragStop$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.compose.foundation.gestures.AbstractDraggableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractDraggableNode$processDragStop$1(androidx.compose.foundation.gestures.AbstractDraggableNode abstractDraggableNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStop$1> continuation) {
        super(continuation);
        this.this$0 = abstractDraggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object processDragStop;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        processDragStop = this.this$0.processDragStop(null, null, this);
        return processDragStop;
    }
}
