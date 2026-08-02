package androidx.compose.foundation.text.selection;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager", f = "TextFieldSelectionManager.kt", i = {}, l = {822}, m = "updateClipboardEntry$foundation", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class TextFieldSelectionManager$updateClipboardEntry$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.text.selection.TextFieldSelectionManager getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.updateClipboardEntry$foundation(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManager$updateClipboardEntry$1(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.selection.TextFieldSelectionManager$updateClipboardEntry$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = textFieldSelectionManager;
    }
}
