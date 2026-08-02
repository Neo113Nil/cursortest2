package androidx.compose.foundation.text.input.internal.selection;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {0, 0}, l = {676}, m = "detectCursorHandleDragGestures", n = {"cursorDragStart", "cursorDragDelta"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes.dex */
final class TextFieldSelectionState$detectCursorHandleDragGestures$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor((androidx.compose.ui.input.pointer.PointerInputScope) null, (kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionState$detectCursorHandleDragGestures$1(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = textFieldSelectionState;
    }
}
