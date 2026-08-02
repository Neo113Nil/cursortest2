package androidx.compose.foundation.text.input.internal.selection;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$maybeSuggestSelectionRange$1", f = "TextFieldSelectionState.kt", i = {}, l = {1095}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class TextFieldSelectionState$maybeSuggestSelectionRange$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.text.selection.PlatformSelectionBehaviors Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ long getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = 1;
            obj = this.Camera2StreamConfigurationMap.mo2379suggestSelectionForLongPressOrDoubleClickpYaCww(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.compose.ui.text.TextRange textRange = (androidx.compose.ui.text.TextRange) obj;
        if (!this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes && textRange != null && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor.getTextFieldState().getVisualText().getText(), this.getHighResolutionOutputSizeshNQ4ISI) && androidx.compose.ui.text.TextRange.m8032equalsimpl0(this.getHighSpeedVideoFpsRangesFor.getTextFieldState().getVisualText().getSelection(), this.getHighSpeedVideoSizes)) {
            if (!androidx.compose.ui.text.TextRange.m8032equalsimpl0(textRange.getGetHighResolutionOutputSizeshNQ4ISI(), this.getHighSpeedVideoFpsRangesFor.getTextFieldState().getVisualText().getSelection())) {
                this.getHighSpeedVideoFpsRangesFor.getTextFieldState().m2275selectCharsIn5zctL8(textRange.getGetHighResolutionOutputSizeshNQ4ISI());
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$maybeSuggestSelectionRange$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$maybeSuggestSelectionRange$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionState$maybeSuggestSelectionRange$1(androidx.compose.foundation.text.selection.PlatformSelectionBehaviors platformSelectionBehaviors, java.lang.CharSequence charSequence, long j, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$maybeSuggestSelectionRange$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = platformSelectionBehaviors;
        this.getHighResolutionOutputSizeshNQ4ISI = charSequence;
        this.getHighSpeedVideoSizes = j;
        this.getHighSpeedVideoFpsRangesFor = textFieldSelectionState;
    }
}
