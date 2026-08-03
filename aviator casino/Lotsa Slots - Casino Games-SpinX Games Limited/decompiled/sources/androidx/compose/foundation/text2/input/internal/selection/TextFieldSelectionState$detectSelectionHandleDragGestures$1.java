package androidx.compose.foundation.text2.input.internal.selection;

/* compiled from: TextFieldSelectionState.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {0, 0, 0, 0}, l = {740}, m = "detectSelectionHandleDragGestures", n = {"this", "dragBeginPosition", "dragTotalDistance", "handle"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes.dex */
final class TextFieldSelectionState$detectSelectionHandleDragGestures$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionState$detectSelectionHandleDragGestures$1(androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState textFieldSelectionState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectSelectionHandleDragGestures$1> continuation) {
        super(continuation);
        this.this$0 = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object detectSelectionHandleDragGestures;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        detectSelectionHandleDragGestures = this.this$0.detectSelectionHandleDragGestures(null, false, this);
        return detectSelectionHandleDragGestures;
    }
}
