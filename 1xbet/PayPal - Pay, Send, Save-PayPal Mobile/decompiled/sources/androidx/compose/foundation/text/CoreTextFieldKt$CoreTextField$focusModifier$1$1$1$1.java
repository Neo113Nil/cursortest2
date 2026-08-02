package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1", f = "CoreTextField.kt", i = {}, l = {350}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.text.TextLayoutResultProxy Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.text.input.OffsetMapping getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.relocation.BringIntoViewRequester getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.ui.text.input.TextFieldValue getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.text.LegacyTextFieldState getHighSpeedVideoSizes;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputMinFrameDuration = 1;
            if (androidx.compose.foundation.text.CoreTextFieldKt.bringSelectionEndIntoView(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes.getTextDelegate(), this.Camera2StreamConfigurationMap.getValue(), this.getHighResolutionOutputSizeshNQ4ISI, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(androidx.compose.foundation.relocation.BringIntoViewRequester bringIntoViewRequester, androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxy, androidx.compose.ui.text.input.OffsetMapping offsetMapping, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = bringIntoViewRequester;
        this.getHighSpeedVideoFpsRangesFor = textFieldValue;
        this.getHighSpeedVideoSizes = legacyTextFieldState;
        this.Camera2StreamConfigurationMap = textLayoutResultProxy;
        this.getHighResolutionOutputSizeshNQ4ISI = offsetMapping;
    }
}
