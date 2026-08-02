package androidx.compose.foundation.text;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.CommonContextMenuAreaKt", f = "CommonContextMenuArea.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE}, m = "getContextMenuItemsAvailability", n = {"$this$getContextMenuItemsAvailability"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class CommonContextMenuAreaKt$getContextMenuItemsAvailability$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return androidx.compose.foundation.text.CommonContextMenuAreaKt.getContextMenuItemsAvailability((androidx.compose.foundation.text.selection.TextFieldSelectionManager) null, this);
    }

    CommonContextMenuAreaKt$getContextMenuItemsAvailability$2(kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.CommonContextMenuAreaKt$getContextMenuItemsAvailability$2> continuation) {
        super(continuation);
    }
}
