package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.pds.components.CodeInputKt$CodeInputField$1$1", f = "CodeInput.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class CodeInputKt$CodeInputField$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.List<androidx.compose.ui.focus.FocusRequester> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableIntState getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        r4 = r3.getHighSpeedVideoFpsRangesFor.getIntValue();
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean booleanValue;
        int intValue;
        int intValue2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        booleanValue = ((java.lang.Boolean) this.Camera2StreamConfigurationMap.getValue()).booleanValue();
        if (booleanValue && intValue >= 0 && intValue < this.getHighSpeedVideoFpsRanges) {
            java.util.List<androidx.compose.ui.focus.FocusRequester> list = this.getHighResolutionOutputSizeshNQ4ISI;
            intValue2 = this.getHighSpeedVideoFpsRangesFor.getIntValue();
            androidx.compose.ui.focus.FocusRequester.m5670requestFocus3ESFkO8$default(list.get(intValue2), 0, 1, null);
            this.Camera2StreamConfigurationMap.setValue(java.lang.Boolean.valueOf(false));
            this.getHighSpeedVideoFpsRangesFor.setIntValue(-1);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.pds.components.CodeInputKt$CodeInputField$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.pds.components.CodeInputKt$CodeInputField$1$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CodeInputKt$CodeInputField$1$1(int i, java.util.List<androidx.compose.ui.focus.FocusRequester> list, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.compose.runtime.MutableIntState mutableIntState, kotlin.coroutines.Continuation<? super com.paypal.pds.components.CodeInputKt$CodeInputField$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.Camera2StreamConfigurationMap = mutableState;
        this.getHighSpeedVideoFpsRangesFor = mutableIntState;
    }
}
