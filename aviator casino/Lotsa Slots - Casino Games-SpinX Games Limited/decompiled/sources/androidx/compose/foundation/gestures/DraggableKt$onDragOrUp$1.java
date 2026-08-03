package androidx.compose.foundation.gestures;

/* compiled from: Draggable.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt", f = "Draggable.kt", i = {0, 0, 0, 0, 0}, l = {689}, m = "onDragOrUp-Axegvzg", n = {"hasDragged", "onDrag", "$this$drag_u2dVnAYq1g$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
/* loaded from: classes.dex */
final class DraggableKt$onDragOrUp$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    int label;
    /* synthetic */ java.lang.Object result;

    DraggableKt$onDragOrUp$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m369onDragOrUpAxegvzg;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m369onDragOrUpAxegvzg = androidx.compose.foundation.gestures.DraggableKt.m369onDragOrUpAxegvzg(null, null, 0L, null, this);
        return m369onDragOrUpAxegvzg;
    }
}
