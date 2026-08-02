package androidx.compose.foundation.text;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class ClickableTextKt$ClickableText$pressIndicator$1$1 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.compose.ui.text.TextLayoutResult> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes;

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        final androidx.compose.runtime.MutableState<androidx.compose.ui.text.TextLayoutResult> mutableState = this.getHighSpeedVideoFpsRangesFor;
        final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> function1 = this.getHighSpeedVideoSizes;
        java.lang.Object detectTapGestures$default = androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1.getHighSpeedVideoFpsRanges(androidx.compose.runtime.MutableState.this, function1, (androidx.compose.ui.geometry.Offset) obj);
                return highSpeedVideoFpsRanges;
            }
        }, continuation, 7, null);
        return detectTapGestures$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectTapGestures$default : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.runtime.MutableState mutableState, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.geometry.Offset offset) {
        androidx.compose.ui.text.TextLayoutResult textLayoutResult = (androidx.compose.ui.text.TextLayoutResult) mutableState.getValue();
        if (textLayoutResult != null) {
            function1.invoke(java.lang.Integer.valueOf(textLayoutResult.m8011getOffsetForPositionk4lQ0M(offset.m5762unboximpl())));
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    ClickableTextKt$ClickableText$pressIndicator$1$1(androidx.compose.runtime.MutableState<androidx.compose.ui.text.TextLayoutResult> mutableState, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1) {
        this.getHighSpeedVideoFpsRangesFor = mutableState;
        this.getHighSpeedVideoSizes = function1;
    }
}
