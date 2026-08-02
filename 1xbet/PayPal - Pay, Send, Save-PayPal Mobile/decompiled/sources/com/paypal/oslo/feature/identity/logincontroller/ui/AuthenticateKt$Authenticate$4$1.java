package com.paypal.oslo.feature.identity.logincontroller.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/identity/navigation/result/AuthenticationSuccessNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$4$1", f = "Authenticate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class AuthenticateKt$Authenticate$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.identity.navigation.result.AuthenticationSuccessNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.navigation.result.AuthenticationSuccessNavResult authenticationSuccessNavResult = (com.paypal.oslo.feature.identity.navigation.result.AuthenticationSuccessNavResult) this.getHighSpeedVideoSizes;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel authenticateViewModel = this.Camera2StreamConfigurationMap;
        java.lang.String token = authenticationSuccessNavResult.getToken();
        authenticateViewModel.processEvent(this.Camera2StreamConfigurationMap.prepareAuthSuccessEvent(authenticationSuccessNavResult.isPassiveLogin(), authenticationSuccessNavResult.getFlowType(), token));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.identity.navigation.result.AuthenticationSuccessNavResult authenticationSuccessNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$4$1) create(authenticationSuccessNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$4$1 authenticateKt$Authenticate$4$1 = new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$4$1(this.Camera2StreamConfigurationMap, continuation);
        authenticateKt$Authenticate$4$1.getHighSpeedVideoSizes = obj;
        return authenticateKt$Authenticate$4$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthenticateKt$Authenticate$4$1(com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel authenticateViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$4$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = authenticateViewModel;
    }
}
