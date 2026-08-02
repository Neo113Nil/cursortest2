package com.paypal.oslo.feature.identity.accountswitch.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel$handleSwitchAccountResult$1", f = "AccountSwitchLoadingViewModel.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, nl = {108}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class AccountSwitchLoadingViewModel$handleSwitchAccountResult$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.identity.accountswitch.domain.model.SwitchAccountResult getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase updateTokenUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            updateTokenUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            java.lang.String token = ((com.paypal.oslo.feature.identity.accountswitch.domain.model.SwitchAccountResult.Success) this.getHighSpeedVideoSizes).getToken();
            final com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel accountSwitchLoadingViewModel = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = 1;
            if (updateTokenUseCase.invoke(token, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel$handleSwitchAccountResult$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel$handleSwitchAccountResult$1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel.this, ((java.lang.Boolean) obj2).booleanValue());
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
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel accountSwitchLoadingViewModel, boolean z) {
        com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel.access$navigateToHome(accountSwitchLoadingViewModel, z);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel$handleSwitchAccountResult$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel$handleSwitchAccountResult$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSwitchLoadingViewModel$handleSwitchAccountResult$1(com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel accountSwitchLoadingViewModel, com.paypal.oslo.feature.identity.accountswitch.domain.model.SwitchAccountResult switchAccountResult, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel$handleSwitchAccountResult$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = accountSwitchLoadingViewModel;
        this.getHighSpeedVideoSizes = switchAccountResult;
    }
}
