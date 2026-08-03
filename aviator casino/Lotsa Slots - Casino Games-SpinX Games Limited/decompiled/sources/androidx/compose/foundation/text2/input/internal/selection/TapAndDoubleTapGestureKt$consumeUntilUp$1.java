package androidx.compose.foundation.text2.input.internal.selection;

/* compiled from: TapAndDoubleTapGesture.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt", f = "TapAndDoubleTapGesture.kt", i = {0}, l = {108}, m = "consumeUntilUp", n = {"$this$consumeUntilUp"}, s = {"L$0"})
/* loaded from: classes.dex */
final class TapAndDoubleTapGestureKt$consumeUntilUp$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;

    TapAndDoubleTapGestureKt$consumeUntilUp$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$consumeUntilUp$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object consumeUntilUp;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        consumeUntilUp = androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt.consumeUntilUp(null, this);
        return consumeUntilUp;
    }
}
