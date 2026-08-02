package androidx.compose.foundation.text;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.CommonContextMenuAreaKt", f = "CommonContextMenuArea.kt", i = {0}, l = {200}, m = "getContextMenuItemsAvailability", n = {"$this$getContextMenuItemsAvailability"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class CommonContextMenuAreaKt$getContextMenuItemsAvailability$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return androidx.compose.foundation.text.CommonContextMenuAreaKt.getContextMenuItemsAvailability((androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) null, this);
    }

    CommonContextMenuAreaKt$getContextMenuItemsAvailability$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.CommonContextMenuAreaKt$getContextMenuItemsAvailability$1> continuation) {
        super(continuation);
    }
}
