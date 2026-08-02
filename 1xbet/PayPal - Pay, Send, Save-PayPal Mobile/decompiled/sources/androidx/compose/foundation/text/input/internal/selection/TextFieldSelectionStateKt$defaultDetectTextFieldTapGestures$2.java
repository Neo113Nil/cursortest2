package androidx.compose.foundation.text.input.internal.selection;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "offset", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2", f = "TextFieldSelectionState.kt", i = {}, l = {1795}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ long Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSource getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.foundation.gestures.PressGestureScope pressGestureScope = (androidx.compose.foundation.gestures.PressGestureScope) this.getHighSpeedVideoFpsRanges;
            long j = this.Camera2StreamConfigurationMap;
            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.getHighResolutionOutputSizeshNQ4ISI;
            if (mutableInteractionSource != null) {
                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1 textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1(pressGestureScope, this.getHighSpeedVideoSizes, j, mutableInteractionSource, null);
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, androidx.compose.ui.geometry.Offset offset, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        long m5762unboximpl = offset.m5762unboximpl();
        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2 textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
        textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2.getHighSpeedVideoFpsRanges = pressGestureScope;
        textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2.Camera2StreamConfigurationMap = m5762unboximpl;
        return textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2(androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2> continuation) {
        super(3, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = mutableInteractionSource;
        this.getHighSpeedVideoSizes = textFieldSelectionState;
    }
}
