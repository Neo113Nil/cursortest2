package com.paypal.oslo.feature.wallet.banks.ui.details;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountFlowUIKt$RemoveBankAccountFlow$3$1", f = "RemoveBankAccountFlowUI.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class RemoveBankAccountFlowUIKt$RemoveBankAccountFlow$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoFpsRanges;
    final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State> getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getInputFormats;
    final /* synthetic */ java.lang.String getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getOutputMinFrameDuration != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State access$RemoveBankAccountFlow$lambda$8 = com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountFlowUIKt.access$RemoveBankAccountFlow$lambda$8(this.getHighSpeedVideoSizesFor);
        if (!kotlin.jvm.internal.Intrinsics.areEqual(access$RemoveBankAccountFlow$lambda$8, com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State.BankRemoveFailed.INSTANCE)) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(access$RemoveBankAccountFlow$lambda$8, com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State.BankRemoved.INSTANCE)) {
                this.getHighSpeedVideoFpsRanges.hideSheet();
                this.Camera2StreamConfigurationMap.invoke();
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(access$RemoveBankAccountFlow$lambda$8, com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State.InitState.INSTANCE)) {
                androidx.compose.runtime.MutableState<java.lang.String> mutableState = this.getHighResolutionOutputSizeshNQ4ISI;
                if (this.getHighSpeedVideoFpsRangesFor) {
                    str = this.getOutputFormats;
                } else {
                    str = this.getHighSpeedVideoSizes;
                }
                mutableState.setValue(str);
                this.getInputFormats.setValue(java.lang.Boolean.valueOf(false));
            } else if (!kotlin.jvm.internal.Intrinsics.areEqual(access$RemoveBankAccountFlow$lambda$8, com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State.RemovingBank.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } else {
            this.getInputFormats.setValue(java.lang.Boolean.valueOf(true));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountFlowUIKt$RemoveBankAccountFlow$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountFlowUIKt$RemoveBankAccountFlow$3$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats, this.getHighSpeedVideoSizes, this.getHighSpeedVideoSizesFor, this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RemoveBankAccountFlowUIKt$RemoveBankAccountFlow$3$1(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0<kotlin.Unit> function0, boolean z, java.lang.String str, java.lang.String str2, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountViewModel.State> state, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.compose.runtime.MutableState<java.lang.String> mutableState2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.details.RemoveBankAccountFlowUIKt$RemoveBankAccountFlow$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = bottomSheetController;
        this.Camera2StreamConfigurationMap = function0;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getOutputFormats = str;
        this.getHighSpeedVideoSizes = str2;
        this.getHighSpeedVideoSizesFor = state;
        this.getInputFormats = mutableState;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState2;
    }
}
