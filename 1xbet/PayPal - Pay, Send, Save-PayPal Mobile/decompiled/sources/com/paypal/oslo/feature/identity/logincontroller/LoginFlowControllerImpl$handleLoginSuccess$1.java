package com.paypal.oslo.feature.identity.logincontroller;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl$handleLoginSuccess$1", f = "LoginFlowControllerImpl.kt", i = {}, l = {238}, m = "invokeSuspend", n = {}, nl = {239}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class LoginFlowControllerImpl$handleLoginSuccess$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.AuthIntent Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.foundation.model.Token getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.navigation.AppNavigator appNavigator;
        com.paypal.oslo.core.navigation.AppNavigator appNavigator2;
        kotlinx.coroutines.CoroutineScope coroutineScope;
        com.paypal.oslo.feature.identity.login.domain.ProcessAuthIntentUseCase processAuthIntentUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                processAuthIntentUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (processAuthIntentUseCase.invoke(this.Camera2StreamConfigurationMap, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Intent processing failed, proceeding with navigation", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("authIntent", this.Camera2StreamConfigurationMap.name())), null, e, 4, null);
        }
        androidx.navigation3.runtime.NavKey navKey = null;
        if (!this.getHighSpeedVideoSizes.isEmpty()) {
            coroutineScope = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl$handleLoginSuccess$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, null), 3, null);
        }
        appNavigator = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
        java.util.List<androidx.navigation3.runtime.NavKey> backStack = appNavigator.getBackStack();
        java.util.ListIterator<androidx.navigation3.runtime.NavKey> listIterator = backStack.listIterator(backStack.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            androidx.navigation3.runtime.NavKey previous = listIterator.previous();
            if (previous instanceof com.paypal.oslo.feature.identity.api.navigation.AuthenticationFlowDestination) {
                navKey = previous;
                break;
            }
        }
        final androidx.navigation3.runtime.NavKey navKey2 = navKey;
        appNavigator2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
        final com.paypal.oslo.feature.identity.foundation.model.Token token = this.getHighSpeedVideoFpsRanges;
        appNavigator2.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl$handleLoginSuccess$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl$handleLoginSuccess$1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.identity.foundation.model.Token.this, navKey2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl$handleLoginSuccess$1$1", f = "LoginFlowControllerImpl.kt", i = {}, l = {251}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl$handleLoginSuccess$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl Camera2StreamConfigurationMap;
        final /* synthetic */ java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.identity.devicebinding.domain.usecase.PostLoginDeviceBindUseCase postLoginDeviceBindUseCase;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                postLoginDeviceBindUseCase = this.Camera2StreamConfigurationMap.getOutputMinFrameDuration;
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (postLoginDeviceBindUseCase.invoke(this.getHighSpeedVideoFpsRanges, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl$handleLoginSuccess$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl$handleLoginSuccess$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl loginFlowControllerImpl, java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> list, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl$handleLoginSuccess$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = loginFlowControllerImpl;
            this.getHighSpeedVideoFpsRanges = list;
        }
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.identity.foundation.model.Token token, androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.setResult(new com.paypal.oslo.feature.identity.navigation.result.AuthenticationSuccessNavResult(token.getTokenValue(), false, (com.paypal.oslo.feature.identity.login.domain.model.PassiveLoginFlowType) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        if (navKey != null) {
            navigationScope.popTo(navKey);
        } else {
            navigationScope.goBack();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl$handleLoginSuccess$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl$handleLoginSuccess$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoginFlowControllerImpl$handleLoginSuccess$1(com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl loginFlowControllerImpl, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> list, com.paypal.oslo.feature.identity.foundation.model.Token token, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.logincontroller.LoginFlowControllerImpl$handleLoginSuccess$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = loginFlowControllerImpl;
        this.Camera2StreamConfigurationMap = authIntent;
        this.getHighSpeedVideoSizes = list;
        this.getHighSpeedVideoFpsRanges = token;
    }
}
