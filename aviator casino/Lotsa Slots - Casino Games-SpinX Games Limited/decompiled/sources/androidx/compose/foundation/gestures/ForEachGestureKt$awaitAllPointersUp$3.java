package androidx.compose.foundation.gestures;

/* compiled from: ForEachGesture.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", i = {0}, l = {86}, m = "awaitAllPointersUp", n = {"$this$awaitAllPointersUp"}, s = {"L$0"})
/* loaded from: classes.dex */
final class ForEachGestureKt$awaitAllPointersUp$3 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;

    ForEachGestureKt$awaitAllPointersUp$3(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp((androidx.compose.ui.input.pointer.AwaitPointerEventScope) null, this);
    }
}
