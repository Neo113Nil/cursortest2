package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$1", f = "TextFieldCoreModifier.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        if (r8.mo2378onShowSelectionToolbarSbBc2M(r1, r4.getTextFieldState().getVisualText().getSelection(), r7) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r8.updateClipboardEntry(r7) != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState;
        androidx.compose.foundation.text.selection.PlatformSelectionBehaviors platformSelectionBehaviors;
        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState2;
        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState3;
        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            textFieldSelectionState = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                textFieldSelectionState4 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                textFieldSelectionState4.setTextToolbarShown$foundation(true);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        platformSelectionBehaviors = this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDurationlomOqCM;
        if (platformSelectionBehaviors != null) {
            textFieldSelectionState2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.CharSequence text = textFieldSelectionState2.getTextFieldState().getVisualText().getText();
            textFieldSelectionState3 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = 2;
        }
        textFieldSelectionState4 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
        textFieldSelectionState4.setTextToolbarShown$foundation(true);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$1(androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode textFieldCoreModifierNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$1> continuation) {
        super(1, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = textFieldCoreModifierNode;
    }
}
