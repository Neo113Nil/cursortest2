package com.paypal.oslo.feature.identity.checkoutdataprovider.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationScreenKt$CheckoutAuthenticationScreen$2$1", f = "CheckoutAuthenticationScreen.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, nl = {78}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CheckoutAuthenticationScreenKt$CheckoutAuthenticationScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/ui/CheckoutAuthenticationUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationScreenKt$CheckoutAuthenticationScreen$2$1$1", f = "CheckoutAuthenticationScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationScreenKt$CheckoutAuthenticationScreen$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
        final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationUiEffect checkoutAuthenticationUiEffect = (com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationUiEffect) this.getHighSpeedVideoFpsRanges;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (checkoutAuthenticationUiEffect instanceof com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationUiEffect.NavigateToAuthenticate) {
                com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.Camera2StreamConfigurationMap;
                final java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
                final com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext = this.getHighSpeedVideoSizes;
                appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.navigation.result.AuthenticationSuccessNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationScreenKt$CheckoutAuthenticationScreen$2$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationScreenKt$CheckoutAuthenticationScreen$2$1.AnonymousClass1.getHighSpeedVideoSizes(str, checkoutAuthenticationContext, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(checkoutAuthenticationUiEffect instanceof com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationUiEffect.ReturnCheckoutSuccess)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationScreenKt$CheckoutAuthenticationScreen$2$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationScreenKt$CheckoutAuthenticationScreen$2$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(java.lang.String str, com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.pushIfNotCurrent(new com.paypal.oslo.feature.identity.api.navigation.AuthenticateDestination(str, com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ReturnResult.INSTANCE, checkoutAuthenticationContext.getAuthenticationContext(), com.paypal.oslo.feature.identity.api.Intent.LOGIN, (com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType) null, 16, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationUiEffect checkoutAuthenticationUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBackWithResult(((com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationUiEffect.ReturnCheckoutSuccess) checkoutAuthenticationUiEffect).getResult());
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationUiEffect checkoutAuthenticationUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationScreenKt$CheckoutAuthenticationScreen$2$1.AnonymousClass1) create(checkoutAuthenticationUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationScreenKt$CheckoutAuthenticationScreen$2$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationScreenKt$CheckoutAuthenticationScreen$2$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
            anonymousClass1.getHighSpeedVideoFpsRanges = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationScreenKt$CheckoutAuthenticationScreen$2$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = appNavigator;
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.getHighSpeedVideoSizes = checkoutAuthenticationContext;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoFpsRanges.getUiEffect(), new com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationScreenKt$CheckoutAuthenticationScreen$2$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationScreenKt$CheckoutAuthenticationScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationScreenKt$CheckoutAuthenticationScreen$2$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckoutAuthenticationScreenKt$CheckoutAuthenticationScreen$2$1(com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationViewModel checkoutAuthenticationViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationScreenKt$CheckoutAuthenticationScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = checkoutAuthenticationViewModel;
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoSizes = checkoutAuthenticationContext;
    }
}
