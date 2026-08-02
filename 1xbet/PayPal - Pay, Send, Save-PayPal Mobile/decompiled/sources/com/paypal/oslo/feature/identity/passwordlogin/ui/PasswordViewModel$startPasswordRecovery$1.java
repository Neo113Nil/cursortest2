package com.paypal.oslo.feature.identity.passwordlogin.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel$startPasswordRecovery$1", f = "PasswordViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE}, m = "invokeSuspend", n = {}, nl = {239}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class PasswordViewModel$startPasswordRecovery$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator passwordRecoveryFlowCoordinator;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                passwordRecoveryFlowCoordinator = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.String str = this.getHighSpeedVideoFpsRanges;
                java.lang.String str2 = this.getHighSpeedVideoSizes;
                kotlinx.coroutines.CoroutineScope viewModelScope = androidx.view.ViewModelKt.getViewModelScope(this.Camera2StreamConfigurationMap);
                final com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel passwordViewModel = this.Camera2StreamConfigurationMap;
                kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel$startPasswordRecovery$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel$startPasswordRecovery$1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.this, (java.lang.String) obj2);
                    }
                };
                final com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel passwordViewModel2 = this.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (passwordRecoveryFlowCoordinator.initiatePasswordRecovery(str, str2, viewModelScope, function1, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel$startPasswordRecovery$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel$startPasswordRecovery$1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.this);
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
            mutableStateFlow2 = this.Camera2StreamConfigurationMap.getOutputStallDurationlomOqCM;
            mutableStateFlow2.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            mutableStateFlow = this.Camera2StreamConfigurationMap.getOutputStallDurationlomOqCM;
            mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
            throw th;
        }
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel passwordViewModel, java.lang.String str) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        mutableStateFlow = passwordViewModel.getInputFormats;
        mutableStateFlow.setValue(new com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.Error(str, false));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel passwordViewModel) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        mutableStateFlow = passwordViewModel.getOutputFormats;
        mutableStateFlow.setValue(java.lang.Boolean.TRUE);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel$startPasswordRecovery$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel$startPasswordRecovery$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasswordViewModel$startPasswordRecovery$1(com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel passwordViewModel, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel$startPasswordRecovery$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = passwordViewModel;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoSizes = str2;
    }
}
