package com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel$loadFeatures$1", f = "LoginAndSecurityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class LoginAndSecurityViewModel$loadFeatures$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m23436constructorimpl;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.identity.loginsecurity.domain.usecase.GetLoginAndSecurityFeaturesUseCase getLoginAndSecurityFeaturesUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel loginAndSecurityViewModel = this.getHighSpeedVideoFpsRanges;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            mutableStateFlow2 = loginAndSecurityViewModel.getHighResolutionOutputSizeshNQ4ISI;
            getLoginAndSecurityFeaturesUseCase = loginAndSecurityViewModel.getHighSpeedVideoFpsRanges;
            mutableStateFlow2.setValue(getLoginAndSecurityFeaturesUseCase.invoke());
            mutableStateFlow3 = loginAndSecurityViewModel.getHighSpeedVideoSizes;
            mutableStateFlow3.setValue(com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState.Success.INSTANCE);
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel loginAndSecurityViewModel2 = this.getHighSpeedVideoFpsRanges;
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
        if (m23439exceptionOrNullimpl != null) {
            mutableStateFlow = loginAndSecurityViewModel2.getHighSpeedVideoSizes;
            java.lang.String message = m23439exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "Unable to load security settings. Please check your connection and try again.";
            }
            mutableStateFlow.setValue(new com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState.Error(message));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel$loadFeatures$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel$loadFeatures$1 loginAndSecurityViewModel$loadFeatures$1 = new com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel$loadFeatures$1(this.getHighSpeedVideoFpsRanges, continuation);
        loginAndSecurityViewModel$loadFeatures$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return loginAndSecurityViewModel$loadFeatures$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoginAndSecurityViewModel$loadFeatures$1(com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel loginAndSecurityViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel$loadFeatures$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = loginAndSecurityViewModel;
    }
}
