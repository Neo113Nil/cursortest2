package com.paypal.oslo.feature.identity.userverification.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "signUpPassiveLoginEvent", "Lcom/paypal/oslo/feature/identity/login/domain/observer/SignUpPassiveLoginEvent;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel$listenUserAccessToken$1", f = "UserVerificationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class UserVerificationViewModel$listenUserAccessToken$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent signUpPassiveLoginEvent = (com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent) this.getHighSpeedVideoSizes;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (signUpPassiveLoginEvent instanceof com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent.PassiveLoginSuccess) {
            mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.accessartificialFrame;
            mutableStateFlow.setValue(new com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUpCompleted(((com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent.PassiveLoginSuccess) signUpPassiveLoginEvent).getToken(), this.Camera2StreamConfigurationMap));
        } else if (!(signUpPassiveLoginEvent instanceof com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent.PassiveLoginCanceled) && !(signUpPassiveLoginEvent instanceof com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent.PassiveLoginObservationAlreadyStarted)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent signUpPassiveLoginEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel$listenUserAccessToken$1) create(signUpPassiveLoginEvent, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel$listenUserAccessToken$1 userVerificationViewModel$listenUserAccessToken$1 = new com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel$listenUserAccessToken$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
        userVerificationViewModel$listenUserAccessToken$1.getHighSpeedVideoSizes = obj;
        return userVerificationViewModel$listenUserAccessToken$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserVerificationViewModel$listenUserAccessToken$1(com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel userVerificationViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel$listenUserAccessToken$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = userVerificationViewModel;
        this.Camera2StreamConfigurationMap = str;
    }
}
