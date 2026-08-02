package com.paypal.oslo.feature.identity.logincontroller;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "userState", "Lcom/paypal/oslo/core/userstore/model/UserState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl$startUserStateListener$1", f = "LoginFlowControllerImpl.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m = "invokeSuspend", n = {"userState"}, nl = {130}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class LoginFlowControllerImpl$startUserStateListener$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.core.userstore.model.UserState, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile rememberedUserStorageWithProfile;
        com.paypal.oslo.core.userstore.model.UserState userState = (com.paypal.oslo.core.userstore.model.UserState) this.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
                com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState;
                if (profileLoaded.getIntent() != com.paypal.oslo.core.userstore.model.ProfileIntent.LINK_ACCOUNT && profileLoaded.getIntent() != com.paypal.oslo.core.userstore.model.ProfileIntent.SWITCH_ACCOUNT) {
                    rememberedUserStorageWithProfile = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
                    this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userState);
                    this.getHighSpeedVideoFpsRangesFor = 1;
                    if (rememberedUserStorageWithProfile.syncUserStoreProfileToAppStorage(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.core.userstore.model.UserState userState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl$startUserStateListener$1) create(userState, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl$startUserStateListener$1 loginFlowControllerImpl$startUserStateListener$1 = new com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl$startUserStateListener$1(this.getHighSpeedVideoSizes, continuation);
        loginFlowControllerImpl$startUserStateListener$1.Camera2StreamConfigurationMap = obj;
        return loginFlowControllerImpl$startUserStateListener$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoginFlowControllerImpl$startUserStateListener$1(com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl loginFlowControllerImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl$startUserStateListener$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = loginFlowControllerImpl;
    }
}
