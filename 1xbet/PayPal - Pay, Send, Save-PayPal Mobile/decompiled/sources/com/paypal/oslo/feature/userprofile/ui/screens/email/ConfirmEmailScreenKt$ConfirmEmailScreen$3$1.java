package com.paypal.oslo.feature.userprofile.ui.screens.email;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.screens.email.ConfirmEmailScreenKt$ConfirmEmailScreen$3$1", f = "ConfirmEmailScreen.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE}, m = "invokeSuspend", n = {"message", "$i$a$-let-ConfirmEmailScreenKt$ConfirmEmailScreen$3$1$1"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, s = {"L$1", "I$0"}, v = 2)
/* loaded from: classes15.dex */
final class ConfirmEmailScreenKt$ConfirmEmailScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel getHighSpeedVideoSizes;
    java.lang.Object getInputFormats;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel confirmEmailViewModel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String access$ConfirmEmailScreen$lambda$6 = com.paypal.oslo.feature.userprofile.ui.screens.email.ConfirmEmailScreenKt.access$ConfirmEmailScreen$lambda$6(this.getHighResolutionOutputSizeshNQ4ISI);
            if (access$ConfirmEmailScreen$lambda$6 != null) {
                com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState commonToastHostState = this.getHighSpeedVideoFpsRanges;
                com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel confirmEmailViewModel2 = this.getHighSpeedVideoSizes;
                this.getHighSpeedVideoFpsRangesFor = confirmEmailViewModel2;
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$ConfirmEmailScreen$lambda$6);
                this.Camera2StreamConfigurationMap = 0;
                this.getOutputFormats = 1;
                if (commonToastHostState.showToast(access$ConfirmEmailScreen$lambda$6, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                confirmEmailViewModel = confirmEmailViewModel2;
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        confirmEmailViewModel = (com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel) this.getHighSpeedVideoFpsRangesFor;
        kotlin.ResultKt.throwOnFailure(obj);
        confirmEmailViewModel.handleAction(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailAction.ClearToastMessage.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.screens.email.ConfirmEmailScreenKt$ConfirmEmailScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.screens.email.ConfirmEmailScreenKt$ConfirmEmailScreen$3$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfirmEmailScreenKt$ConfirmEmailScreen$3$1(androidx.compose.runtime.State<java.lang.String> state, com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState commonToastHostState, com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel confirmEmailViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.screens.email.ConfirmEmailScreenKt$ConfirmEmailScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = state;
        this.getHighSpeedVideoFpsRanges = commonToastHostState;
        this.getHighSpeedVideoSizes = confirmEmailViewModel;
    }
}
