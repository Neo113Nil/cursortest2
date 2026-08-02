package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$2", f = "TextFieldSelectionManager.kt", i = {}, l = {241, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class TextFieldSelectionManager$contextMenuAreaModifier$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.text.selection.TextFieldSelectionManager getHighSpeedVideoFpsRanges;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r8.mo2378onShowSelectionToolbarSbBc2M(r4, r5, r7) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        if (r7.getHighSpeedVideoFpsRanges.updateClipboardEntry$foundation(r7) != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.Pair Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRanges.setTextToolbarShownViaProvider$foundation(true);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap();
        if (Camera2StreamConfigurationMap != null) {
            androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = this.getHighSpeedVideoFpsRanges;
            java.lang.String str = (java.lang.String) Camera2StreamConfigurationMap.component1();
            long getHighResolutionOutputSizeshNQ4ISI = ((androidx.compose.ui.text.TextRange) Camera2StreamConfigurationMap.component2()).getGetHighResolutionOutputSizeshNQ4ISI();
            androidx.compose.foundation.text.selection.PlatformSelectionBehaviors platformSelectionBehaviors = textFieldSelectionManager.getPlatformSelectionBehaviors();
            if (platformSelectionBehaviors != null) {
                this.Camera2StreamConfigurationMap = 2;
            }
        }
        this.getHighSpeedVideoFpsRanges.setTextToolbarShownViaProvider$foundation(true);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$2(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManager$contextMenuAreaModifier$2(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$2> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoFpsRanges = textFieldSelectionManager;
    }
}
