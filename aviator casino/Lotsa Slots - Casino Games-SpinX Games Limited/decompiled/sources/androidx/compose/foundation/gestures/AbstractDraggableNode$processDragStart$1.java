package androidx.compose.foundation.gestures;

/* compiled from: Draggable.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.AbstractDraggableNode", f = "Draggable.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {536, 539, 541}, m = "processDragStart", n = {"this", "$this$processDragStart", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "this", "$this$processDragStart", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "interaction"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes.dex */
final class AbstractDraggableNode$processDragStart$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.compose.foundation.gestures.AbstractDraggableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractDraggableNode$processDragStart$1(androidx.compose.foundation.gestures.AbstractDraggableNode abstractDraggableNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStart$1> continuation) {
        super(continuation);
        this.this$0 = abstractDraggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object processDragStart;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        processDragStart = this.this$0.processDragStart(null, null, this);
        return processDragStart;
    }
}
