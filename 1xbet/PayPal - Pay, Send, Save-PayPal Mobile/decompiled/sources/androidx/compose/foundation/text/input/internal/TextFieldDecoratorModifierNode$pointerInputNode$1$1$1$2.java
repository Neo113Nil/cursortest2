package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2", f = "TextFieldDecoratorModifier.kt", i = {}, l = {250}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.input.pointer.PointerInputScope getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.foundation.interaction.MutableInteractionSource interactionSource = this.getHighSpeedVideoFpsRanges.getInteractionSource();
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState = this.Camera2StreamConfigurationMap;
            androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighSpeedVideoSizes;
            final androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (textFieldSelectionState.detectTextFieldTapGestures(pointerInputScope, interactionSource, function0, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2.Camera2StreamConfigurationMap(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this);
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        kotlinx.coroutines.Job job;
        androidx.compose.ui.platform.SoftwareKeyboardController highSpeedVideoFpsRangesFor;
        job = textFieldDecoratorModifierNode.getOutputSizes;
        if (job != null) {
            highSpeedVideoFpsRangesFor = textFieldDecoratorModifierNode.getHighSpeedVideoFpsRangesFor();
            highSpeedVideoFpsRangesFor.show();
        } else {
            textFieldDecoratorModifierNode.getHighSpeedVideoSizes(true);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2(androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = textFieldDecoratorModifierNode;
        this.Camera2StreamConfigurationMap = textFieldSelectionState;
        this.getHighResolutionOutputSizeshNQ4ISI = pointerInputScope;
        this.getHighSpeedVideoSizes = function0;
    }
}
