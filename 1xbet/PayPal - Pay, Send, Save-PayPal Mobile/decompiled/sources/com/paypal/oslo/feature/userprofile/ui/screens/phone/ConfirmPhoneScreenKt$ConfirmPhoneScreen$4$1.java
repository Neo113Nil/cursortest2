package com.paypal.oslo.feature.userprofile.ui.screens.phone;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$4$1", f = "ConfirmPhoneScreen.kt", i = {0, 0}, l = {119}, m = "invokeSuspend", n = {"message", "$i$a$-let-ConfirmPhoneScreenKt$ConfirmPhoneScreen$4$1$1"}, nl = {120}, s = {"L$1", "I$0"}, v = 2)
/* loaded from: classes15.dex */
final class ConfirmPhoneScreenKt$ConfirmPhoneScreen$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<java.lang.String> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel confirmPhoneViewModel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String access$ConfirmPhoneScreen$lambda$6 = com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt.access$ConfirmPhoneScreen$lambda$6(this.getHighSpeedVideoFpsRanges);
            if (access$ConfirmPhoneScreen$lambda$6 != null) {
                com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState commonToastHostState = this.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel confirmPhoneViewModel2 = this.getHighSpeedVideoSizes;
                this.Camera2StreamConfigurationMap = confirmPhoneViewModel2;
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$ConfirmPhoneScreen$lambda$6);
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.getHighSpeedVideoSizesFor = 1;
                if (commonToastHostState.showToast(access$ConfirmPhoneScreen$lambda$6, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                confirmPhoneViewModel = confirmPhoneViewModel2;
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        confirmPhoneViewModel = (com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel) this.Camera2StreamConfigurationMap;
        kotlin.ResultKt.throwOnFailure(obj);
        confirmPhoneViewModel.handleAction(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneAction.ClearToastMessage.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$4$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfirmPhoneScreenKt$ConfirmPhoneScreen$4$1(androidx.compose.runtime.State<java.lang.String> state, com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState commonToastHostState, com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel confirmPhoneViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = state;
        this.getHighSpeedVideoFpsRangesFor = commonToastHostState;
        this.getHighSpeedVideoSizes = confirmPhoneViewModel;
    }
}
