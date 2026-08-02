package androidx.compose.foundation.text.input.internal.selection;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {}, l = {1577, 1577}, m = "pasteAsPlainText", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class TextFieldSelectionState$pasteAsPlainText$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes((kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionState$pasteAsPlainText$1(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = textFieldSelectionState;
    }
}
