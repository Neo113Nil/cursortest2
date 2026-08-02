package com.paypal.oslo.feature.identity.identitymanagement;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl$isEnabled$1$token$1", f = "IdentityManagementImpl.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class IdentityManagementImpl$isEnabled$1$token$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.api.AuthenticationMethod getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        deviceBindingTokenStorage = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = 1;
        java.lang.Object bindingToken = deviceBindingTokenStorage.getBindingToken(com.paypal.oslo.feature.identity.identitymanagement.domain.mapper.AuthenticationMethodMapperKt.toDeviceAuthMethod(this.getHighResolutionOutputSizeshNQ4ISI), this);
        return bindingToken == coroutine_suspended ? coroutine_suspended : bindingToken;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return ((com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl$isEnabled$1$token$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl$isEnabled$1$token$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdentityManagementImpl$isEnabled$1$token$1(com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl identityManagementImpl, com.paypal.oslo.feature.identity.api.AuthenticationMethod authenticationMethod, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl$isEnabled$1$token$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = identityManagementImpl;
        this.getHighResolutionOutputSizeshNQ4ISI = authenticationMethod;
    }
}
