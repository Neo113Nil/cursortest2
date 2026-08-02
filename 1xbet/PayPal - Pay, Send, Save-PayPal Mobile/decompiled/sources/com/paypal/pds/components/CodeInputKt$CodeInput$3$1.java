package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.pds.components.CodeInputKt$CodeInput$3$1", f = "CodeInput.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class CodeInputKt$CodeInput$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.pds.components.CodeInputFieldCount getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.util.List<androidx.compose.ui.focus.FocusRequester> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.ui.text.input.TextFieldValue> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.pds.components.CodeInputKt.access$updateCodeFields(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI.getCount(), this.getHighSpeedVideoFpsRangesFor);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.pds.components.CodeInputKt$CodeInput$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.pds.components.CodeInputKt$CodeInput$3$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CodeInputKt$CodeInput$3$1(java.lang.String str, androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.ui.text.input.TextFieldValue> snapshotStateList, com.paypal.pds.components.CodeInputFieldCount codeInputFieldCount, java.util.List<androidx.compose.ui.focus.FocusRequester> list, kotlin.coroutines.Continuation<? super com.paypal.pds.components.CodeInputKt$CodeInput$3$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoSizes = snapshotStateList;
        this.getHighResolutionOutputSizeshNQ4ISI = codeInputFieldCount;
        this.getHighSpeedVideoFpsRangesFor = list;
    }
}
