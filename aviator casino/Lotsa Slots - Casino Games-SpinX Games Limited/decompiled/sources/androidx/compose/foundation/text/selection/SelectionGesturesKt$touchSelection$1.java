package androidx.compose.foundation.text.selection;

/* compiled from: SelectionGestures.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 0, 1, 1}, l = {119, 123}, m = "touchSelection", n = {"$this$touchSelection", "observer", "firstDown", "$this$touchSelection", "observer"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes.dex */
final class SelectionGesturesKt$touchSelection$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;

    SelectionGesturesKt$touchSelection$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        obj2 = androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelection(null, null, null, this);
        return obj2;
    }
}
