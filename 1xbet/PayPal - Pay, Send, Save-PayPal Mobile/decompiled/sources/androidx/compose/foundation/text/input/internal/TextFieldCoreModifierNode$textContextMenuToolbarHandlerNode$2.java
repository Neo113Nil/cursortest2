package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$2", f = "TextFieldCoreModifier.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        textFieldSelectionState = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
        textFieldSelectionState.setTextToolbarShown$foundation(false);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$2(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$2(androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode textFieldCoreModifierNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$textContextMenuToolbarHandlerNode$2> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoSizes = textFieldCoreModifierNode;
    }
}
