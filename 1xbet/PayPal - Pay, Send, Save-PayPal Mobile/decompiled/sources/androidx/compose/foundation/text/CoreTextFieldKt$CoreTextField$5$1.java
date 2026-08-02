package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1", f = "CoreTextField.kt", i = {}, l = {367}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CoreTextFieldKt$CoreTextField$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.State<java.lang.Boolean> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.text.LegacyTextFieldState getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.text.selection.TextFieldSelectionManager getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.ui.text.input.TextInputService getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.ui.text.input.ImeOptions getHighSpeedVideoSizes;
    int getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                final androidx.compose.runtime.State<java.lang.Boolean> state = this.Camera2StreamConfigurationMap;
                kotlinx.coroutines.flow.Flow snapshotFlow = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        boolean highSpeedVideoFpsRanges;
                        highSpeedVideoFpsRanges = androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1.getHighSpeedVideoFpsRanges(androidx.compose.runtime.State.this);
                        return java.lang.Boolean.valueOf(highSpeedVideoFpsRanges);
                    }
                });
                final androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = this.getHighResolutionOutputSizeshNQ4ISI;
                final androidx.compose.ui.text.input.TextInputService textInputService = this.getHighSpeedVideoFpsRangesFor;
                final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager = this.getHighSpeedVideoFpsRanges;
                final androidx.compose.ui.text.input.ImeOptions imeOptions = this.getHighSpeedVideoSizes;
                this.getInputFormats = 1;
                if (snapshotFlow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        return getHighSpeedVideoFpsRanges(((java.lang.Boolean) obj2).booleanValue());
                    }

                    private java.lang.Object getHighSpeedVideoFpsRanges(boolean z) {
                        if (!z || !androidx.compose.foundation.text.LegacyTextFieldState.this.getHasFocus()) {
                            androidx.compose.foundation.text.CoreTextFieldKt.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.LegacyTextFieldState.this);
                        } else {
                            androidx.compose.foundation.text.CoreTextFieldKt.getHighSpeedVideoFpsRangesFor(textInputService, androidx.compose.foundation.text.LegacyTextFieldState.this, textFieldSelectionManager.getValue$foundation(), imeOptions, textFieldSelectionManager.getOffsetMapping());
                        }
                        return kotlin.Unit.INSTANCE;
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
            androidx.compose.foundation.text.CoreTextFieldKt.getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            androidx.compose.foundation.text.CoreTextFieldKt.getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoFpsRanges(androidx.compose.runtime.State state) {
        boolean Camera2StreamConfigurationMap;
        Camera2StreamConfigurationMap = androidx.compose.foundation.text.CoreTextFieldKt.Camera2StreamConfigurationMap(state);
        return Camera2StreamConfigurationMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$5$1(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, androidx.compose.runtime.State<java.lang.Boolean> state, androidx.compose.ui.text.input.TextInputService textInputService, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, androidx.compose.ui.text.input.ImeOptions imeOptions, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = legacyTextFieldState;
        this.Camera2StreamConfigurationMap = state;
        this.getHighSpeedVideoFpsRangesFor = textInputService;
        this.getHighSpeedVideoFpsRanges = textFieldSelectionManager;
        this.getHighSpeedVideoSizes = imeOptions;
    }
}
