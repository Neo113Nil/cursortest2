package androidx.compose.foundation.text.selection;

/* compiled from: SelectionGestures.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 1, 1}, l = {153, 176}, m = "mouseSelection", n = {"$this$mouseSelection", "observer", "$this$mouseSelection", "observer"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes.dex */
final class SelectionGesturesKt$mouseSelection$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;

    SelectionGesturesKt$mouseSelection$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object mouseSelection;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        mouseSelection = androidx.compose.foundation.text.selection.SelectionGesturesKt.mouseSelection(null, null, null, null, this);
        return mouseSelection;
    }
}
