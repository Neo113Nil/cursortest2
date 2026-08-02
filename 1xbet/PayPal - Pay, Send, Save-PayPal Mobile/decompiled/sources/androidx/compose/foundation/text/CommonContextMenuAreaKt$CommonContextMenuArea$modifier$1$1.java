package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "clickLocation", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1", f = "CommonContextMenuArea.kt", i = {0}, l = {82, 83}, m = "invokeSuspend", n = {"clickLocation"}, s = {"J$0"}, v = 1)
/* loaded from: classes6.dex */
final class CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ long getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (r5.mo2377onShowContextMenu_2OEclM(r11.Camera2StreamConfigurationMap.getTextFieldState().getVisualText().getText(), r11.Camera2StreamConfigurationMap.getTextFieldState().getVisualText().getSelection(), androidx.compose.ui.geometry.Offset.m5741boximpl(r3), r11) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long j2 = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = j2;
            this.getHighSpeedVideoFpsRanges = 1;
            if (this.Camera2StreamConfigurationMap.updateClipboardEntry(this) != coroutine_suspended) {
                j = j2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        j = this.getHighSpeedVideoSizes;
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.compose.foundation.text.selection.PlatformSelectionBehaviors platformSelectionBehaviors = this.Camera2StreamConfigurationMap.getPlatformSelectionBehaviors();
        if (platformSelectionBehaviors != null) {
            this.getHighSpeedVideoFpsRanges = 2;
        }
        return kotlin.Unit.INSTANCE;
    }

    private java.lang.Object getHighSpeedVideoSizes(long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1) create(androidx.compose.ui.geometry.Offset.m5741boximpl(j), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.geometry.Offset offset, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return getHighSpeedVideoSizes(offset.m5762unboximpl(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1 commonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1 = new androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1(this.Camera2StreamConfigurationMap, continuation);
        commonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1.getHighSpeedVideoSizes = ((androidx.compose.ui.geometry.Offset) obj).m5762unboximpl();
        return commonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = textFieldSelectionState;
    }
}
