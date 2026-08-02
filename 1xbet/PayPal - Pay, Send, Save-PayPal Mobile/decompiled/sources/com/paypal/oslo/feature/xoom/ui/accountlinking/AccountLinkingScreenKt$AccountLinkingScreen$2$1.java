package com.paypal.oslo.feature.xoom.ui.accountlinking;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingScreenKt$AccountLinkingScreen$2$1", f = "AccountLinkingScreen.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, nl = {106}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class AccountLinkingScreenKt$AccountLinkingScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingScreenKt$AccountLinkingScreen$2$1$1", f = "AccountLinkingScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingScreenKt$AccountLinkingScreen$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ android.content.Context Camera2StreamConfigurationMap;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiEffect accountLinkingUiEffect = (com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiEffect) this.getHighSpeedVideoFpsRanges;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (accountLinkingUiEffect instanceof com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiEffect.NavigateToErrorScreen) {
                com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighSpeedVideoSizes;
                final android.content.Context context = this.Camera2StreamConfigurationMap;
                appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingScreenKt$AccountLinkingScreen$2$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingScreenKt$AccountLinkingScreen$2$1.AnonymousClass1.getHighSpeedVideoFpsRanges(context, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(accountLinkingUiEffect instanceof com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiEffect.NavigateOnAccountsLinked)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingScreenKt$AccountLinkingScreen$2$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingScreenKt$AccountLinkingScreen$2$1.AnonymousClass1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBackWithResult(com.paypal.oslo.feature.xoom.navigation.result.AccountLinkingNavResult.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(android.content.Context context, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            java.lang.String string = context.getString(com.paypal.oslo.feature.xoom.R.string.feature_xoom_general_error_title);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
            java.lang.String string2 = context.getString(com.paypal.oslo.feature.xoom.R.string.feature_xoom_general_error_message);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
            java.lang.String string3 = context.getString(com.paypal.oslo.feature.xoom.R.string.feature_xoom_general_error_button_ok);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
            navigationScope.push(new com.paypal.oslo.feature.xoom.navigation.ErrorDestination(string, string2, string3));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiEffect accountLinkingUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingScreenKt$AccountLinkingScreen$2$1.AnonymousClass1) create(accountLinkingUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingScreenKt$AccountLinkingScreen$2$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingScreenKt$AccountLinkingScreen$2$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
            anonymousClass1.getHighSpeedVideoFpsRanges = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingScreenKt$AccountLinkingScreen$2$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = appNavigator;
            this.Camera2StreamConfigurationMap = context;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighResolutionOutputSizeshNQ4ISI.getUiEffect(), new com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingScreenKt$AccountLinkingScreen$2$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingScreenKt$AccountLinkingScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingScreenKt$AccountLinkingScreen$2$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountLinkingScreenKt$AccountLinkingScreen$2$1(com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingViewModel accountLinkingViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingScreenKt$AccountLinkingScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = accountLinkingViewModel;
        this.getHighSpeedVideoFpsRanges = appNavigator;
        this.getHighSpeedVideoFpsRangesFor = context;
    }
}
