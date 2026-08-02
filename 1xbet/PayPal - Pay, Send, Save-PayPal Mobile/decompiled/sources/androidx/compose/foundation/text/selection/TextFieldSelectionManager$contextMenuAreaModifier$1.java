package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "clickLocation", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$1", f = "TextFieldSelectionManager.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE}, m = "invokeSuspend", n = {"clickLocation"}, s = {"J$0"}, v = 1)
/* loaded from: classes6.dex */
final class TextFieldSelectionManager$contextMenuAreaModifier$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ long getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.text.selection.TextFieldSelectionManager getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (r6.mo2377onShowContextMenu_2OEclM(r5, r8, r10, r12) == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j;
        kotlin.Pair Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long j2 = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = j2;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (this.getHighSpeedVideoSizes.updateClipboardEntry$foundation(this) != coroutine_suspended) {
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
        j = this.getHighSpeedVideoFpsRangesFor;
        kotlin.ResultKt.throwOnFailure(obj);
        Camera2StreamConfigurationMap = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap();
        if (Camera2StreamConfigurationMap != null) {
            androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = this.getHighSpeedVideoSizes;
            java.lang.String str = (java.lang.String) Camera2StreamConfigurationMap.component1();
            long getHighResolutionOutputSizeshNQ4ISI = ((androidx.compose.ui.text.TextRange) Camera2StreamConfigurationMap.component2()).getGetHighResolutionOutputSizeshNQ4ISI();
            androidx.compose.foundation.text.selection.PlatformSelectionBehaviors platformSelectionBehaviors = textFieldSelectionManager.getPlatformSelectionBehaviors();
            if (platformSelectionBehaviors != null) {
                androidx.compose.ui.geometry.Offset m5741boximpl = androidx.compose.ui.geometry.Offset.m5741boximpl(j);
                this.getHighResolutionOutputSizeshNQ4ISI = 2;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.geometry.Offset offset, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$1) create(androidx.compose.ui.geometry.Offset.m5741boximpl(offset.m5762unboximpl()), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$1 textFieldSelectionManager$contextMenuAreaModifier$1 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$1(this.getHighSpeedVideoSizes, continuation);
        textFieldSelectionManager$contextMenuAreaModifier$1.getHighSpeedVideoFpsRangesFor = ((androidx.compose.ui.geometry.Offset) obj).m5762unboximpl();
        return textFieldSelectionManager$contextMenuAreaModifier$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManager$contextMenuAreaModifier$1(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = textFieldSelectionManager;
    }
}
