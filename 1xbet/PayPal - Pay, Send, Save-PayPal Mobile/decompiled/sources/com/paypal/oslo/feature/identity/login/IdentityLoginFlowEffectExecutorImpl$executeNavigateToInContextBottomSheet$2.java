package com.paypal.oslo.feature.identity.login;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowAction;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeNavigateToInContextBottomSheet$2", f = "IdentityLoginFlowEffectExecutor.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class IdentityLoginFlowEffectExecutorImpl$executeNavigateToInContextBottomSheet$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToInContextBottomSheet getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.navigation.AppNavigator appNavigator;
        java.lang.Object highSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        appNavigator = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
        final java.lang.String str = this.getHighSpeedVideoFpsRanges;
        final com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToInContextBottomSheet navigateToInContextBottomSheet = this.getHighSpeedVideoFpsRangesFor;
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.result.AuthenticationNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeNavigateToInContextBottomSheet$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeNavigateToInContextBottomSheet$2.Camera2StreamConfigurationMap(str, navigateToInContextBottomSheet, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
            }
        });
        this.getHighSpeedVideoSizes = 1;
        highSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, this);
        return highSpeedVideoFpsRangesFor == coroutine_suspended ? coroutine_suspended : highSpeedVideoFpsRangesFor;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(java.lang.String str, com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToInContextBottomSheet navigateToInContextBottomSheet, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.push(new com.paypal.oslo.feature.identity.api.navigation.InContextAuthenticateDestination(str, com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ReturnResult.INSTANCE, new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("in-context-login", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)), navigateToInContextBottomSheet.getCredential(), navigateToInContextBottomSheet.getDisplayName(), navigateToInContextBottomSheet.getAuthOptions()));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction> continuation) {
        return ((com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeNavigateToInContextBottomSheet$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeNavigateToInContextBottomSheet$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdentityLoginFlowEffectExecutorImpl$executeNavigateToInContextBottomSheet$2(com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl identityLoginFlowEffectExecutorImpl, java.lang.String str, com.paypal.oslo.feature.identity.login.domain.model.IdentityLoginFlowEffect.NavigateToInContextBottomSheet navigateToInContextBottomSheet, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeNavigateToInContextBottomSheet$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = identityLoginFlowEffectExecutorImpl;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoFpsRangesFor = navigateToInContextBottomSheet;
    }
}
