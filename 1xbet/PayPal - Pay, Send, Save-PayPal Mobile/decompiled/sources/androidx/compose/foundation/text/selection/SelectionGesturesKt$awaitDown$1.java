package androidx.compose.foundation.text.selection;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0}, l = {340}, m = "awaitDown", n = {"$this$awaitDown"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class SelectionGesturesKt$awaitDown$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return androidx.compose.foundation.text.selection.SelectionGesturesKt.access$awaitDown(null, this);
    }

    SelectionGesturesKt$awaitDown$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1> continuation) {
        super(continuation);
    }
}
