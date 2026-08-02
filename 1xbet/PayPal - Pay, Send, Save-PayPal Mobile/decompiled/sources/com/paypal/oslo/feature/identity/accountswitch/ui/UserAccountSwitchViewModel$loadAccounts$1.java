package com.paypal.oslo.feature.identity.accountswitch.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchViewModel$loadAccounts$1", f = "UserAccountSwitchViewModel.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, nl = {119}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class UserAccountSwitchViewModel$loadAccounts$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GetUserAccountsUseCase getUserAccountsUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow.setValue(com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchUiState.Loading.INSTANCE);
            getUserAccountsUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = getUserAccountsUseCase.invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchViewModel userAccountSwitchViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchViewModel.access$handleLoadError(userAccountSwitchViewModel, (com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError) ((arrow.core.Ior.Left) ior).getValue());
        } else if (!(ior instanceof arrow.core.Ior.Right)) {
            if (ior instanceof arrow.core.Ior.Both) {
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchViewModel.access$handlePartialData(userAccountSwitchViewModel, (com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError) both.getLeftValue(), (com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccountSwitchResponse) both.getRightValue());
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } else {
            userAccountSwitchViewModel.getHighSpeedVideoFpsRangesFor.setValue(new com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchUiState.Success(r4.getAccounts(), r4.getProfileOptions(), ((com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccountSwitchResponse) ((arrow.core.Ior.Right) ior).getValue()).getLinkProfileOptions()));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchViewModel$loadAccounts$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchViewModel$loadAccounts$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserAccountSwitchViewModel$loadAccounts$1(com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchViewModel userAccountSwitchViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchViewModel$loadAccounts$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = userAccountSwitchViewModel;
    }
}
