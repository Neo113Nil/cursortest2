package com.paypal.oslo.feature.identity.login;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeNavigateToFullScreen$2", f = "IdentityLoginFlowEffectExecutor.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class IdentityLoginFlowEffectExecutorImpl$executeNavigateToFullScreen$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToFullScreenAuth Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.navigation.AppNavigator appNavigator;
        java.lang.Object highSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        appNavigator = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
        final java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        final com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToFullScreenAuth navigateToFullScreenAuth = this.Camera2StreamConfigurationMap;
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.result.AuthenticationNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeNavigateToFullScreen$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeNavigateToFullScreen$2.getHighSpeedVideoFpsRangesFor(str, navigateToFullScreenAuth, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
            }
        });
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, this);
        return highSpeedVideoFpsRangesFor == coroutine_suspended ? coroutine_suspended : highSpeedVideoFpsRangesFor;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(java.lang.String str, com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToFullScreenAuth navigateToFullScreenAuth, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.push(new com.paypal.oslo.feature.identity.api.navigation.AuthenticateDestination(str, com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ReturnResult.INSTANCE, navigateToFullScreenAuth.getTokenType().getAuthenticationContext(), (com.paypal.oslo.feature.identity.api.Intent) null, (com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType) null, 24, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction> continuation) {
        return ((com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeNavigateToFullScreen$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeNavigateToFullScreen$2(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdentityLoginFlowEffectExecutorImpl$executeNavigateToFullScreen$2(com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl identityLoginFlowEffectExecutorImpl, java.lang.String str, com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToFullScreenAuth navigateToFullScreenAuth, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeNavigateToFullScreen$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = identityLoginFlowEffectExecutorImpl;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = navigateToFullScreenAuth;
    }
}
