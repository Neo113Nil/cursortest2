package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.pds.components.CodeInputKt$CodeInput$4$1", f = "CodeInput.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class CodeInputKt$CodeInput$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.ui.text.input.TextFieldValue> Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.List<androidx.compose.ui.focus.FocusRequester> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.pds.components.CodeInputFieldCount getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.ui.focus.FocusManager getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;
    int getInputFormats;
    final /* synthetic */ androidx.compose.ui.platform.SoftwareKeyboardController getOutputFormats;
    final /* synthetic */ java.lang.String getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getInputFormats != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.pds.components.CodeInputKt.access$handleFocus(this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges.getCount(), this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.pds.components.CodeInputKt$CodeInput$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.pds.components.CodeInputKt$CodeInput$4$1(this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CodeInputKt$CodeInput$4$1(boolean z, java.lang.String str, androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.ui.text.input.TextFieldValue> snapshotStateList, java.util.List<androidx.compose.ui.focus.FocusRequester> list, com.paypal.pds.components.CodeInputFieldCount codeInputFieldCount, androidx.compose.ui.focus.FocusManager focusManager, androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController, kotlin.coroutines.Continuation<? super com.paypal.pds.components.CodeInputKt$CodeInput$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = z;
        this.getOutputMinFrameDuration = str;
        this.Camera2StreamConfigurationMap = snapshotStateList;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.getHighSpeedVideoFpsRanges = codeInputFieldCount;
        this.getHighSpeedVideoFpsRangesFor = focusManager;
        this.getOutputFormats = softwareKeyboardController;
    }
}
