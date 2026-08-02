package com.paypal.oslo.feature.wallet.banks.ui.details.nickname;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt$AddNicknameModal$2$1", f = "AddNicknameModal.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AddNicknameModalKt$AddNicknameModal$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.focus.FocusRequester getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.ui.focus.FocusManager getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    int getInputFormats;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getInputFormats != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.getHighResolutionOutputSizeshNQ4ISI.getVisible()) {
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(androidx.compose.ui.focus.FocusRequester.m5670requestFocus3ESFkO8$default(this.getHighSpeedVideoFpsRanges, 0, 1, null));
        } else {
            androidx.compose.ui.focus.FocusManager.clearFocus$default(this.getHighSpeedVideoFpsRangesFor, false, 1, null);
            this.getInputSizeshNQ4ISI.setValue(this.getHighSpeedVideoSizes);
            this.Camera2StreamConfigurationMap.setValue(null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt$AddNicknameModal$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt$AddNicknameModal$2$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getInputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddNicknameModalKt$AddNicknameModal$2$1(com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.ui.focus.FocusRequester focusRequester, androidx.compose.ui.focus.FocusManager focusManager, java.lang.String str, androidx.compose.runtime.MutableState<java.lang.String> mutableState, androidx.compose.runtime.MutableState<java.lang.String> mutableState2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt$AddNicknameModal$2$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = bottomSheetController;
        this.getHighSpeedVideoFpsRanges = focusRequester;
        this.getHighSpeedVideoFpsRangesFor = focusManager;
        this.getHighSpeedVideoSizes = str;
        this.getInputSizeshNQ4ISI = mutableState;
        this.Camera2StreamConfigurationMap = mutableState2;
    }
}
