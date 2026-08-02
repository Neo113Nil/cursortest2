package com.paypal.oslo.feature.xoom.ui.sendmoney;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneyScreen$2$1", f = "SendMoneyScreen.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class SendMoneyScreenKt$SendMoneyScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.content.Context Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneyScreen$2$1$1", f = "SendMoneyScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneyScreen$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        final /* synthetic */ android.content.Context getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect sendMoneyUiEffect = (com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect) this.getHighSpeedVideoFpsRangesFor;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRanges != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (kotlin.jvm.internal.Intrinsics.areEqual(sendMoneyUiEffect, com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToHomeDestination.INSTANCE)) {
                final com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighSpeedVideoSizes;
                appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneyScreen$2$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneyScreen$2$1.AnonymousClass1.getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(sendMoneyUiEffect, com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToAccountLinking.INSTANCE)) {
                this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(this.Camera2StreamConfigurationMap, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.xoom.navigation.result.AccountLinkingNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneyScreen$2$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneyScreen$2$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (sendMoneyUiEffect instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToErrorScreen) {
                com.paypal.oslo.core.navigation.AppNavigator appNavigator2 = this.getHighSpeedVideoSizes;
                final android.content.Context context = this.getHighResolutionOutputSizeshNQ4ISI;
                appNavigator2.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneyScreen$2$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneyScreen$2$1.AnonymousClass1.getHighSpeedVideoFpsRanges(context, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (sendMoneyUiEffect instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToForbiddenUserScreen) {
                com.paypal.oslo.core.navigation.AppNavigator appNavigator3 = this.getHighSpeedVideoSizes;
                final android.content.Context context2 = this.getHighResolutionOutputSizeshNQ4ISI;
                appNavigator3.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneyScreen$2$1$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneyScreen$2$1.AnonymousClass1.Camera2StreamConfigurationMap(context2, sendMoneyUiEffect, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(sendMoneyUiEffect, com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToInterstitialScreen.INSTANCE)) {
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneyScreen$2$1$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneyScreen$2$1.AnonymousClass1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (sendMoneyUiEffect instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToInactiveUserScreen) {
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneyScreen$2$1$1$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneyScreen$2$1.AnonymousClass1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(sendMoneyUiEffect, com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToPreviousScreen.INSTANCE)) {
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneyScreen$2$1$1$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneyScreen$2$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(sendMoneyUiEffect instanceof com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.OpenExternalUri)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(((com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.OpenExternalUri) sendMoneyUiEffect).getUrl()));
                intent.setFlags(268435456);
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI.startActivity(intent);
                } catch (android.content.ActivityNotFoundException e) {
                    com.paypal.oslo.feature.xoom.LoggerKt.log.e("No activity found to handle external URI", e);
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(com.paypal.oslo.feature.xoom.navigation.InterstitialDestination.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect sendMoneyUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToInactiveUserScreen navigateToInactiveUserScreen = (com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToInactiveUserScreen) sendMoneyUiEffect;
            navigationScope.push(new com.paypal.oslo.feature.xoom.navigation.ErrorDestination(navigateToInactiveUserScreen.getFailedPaymentInfo().getHeader(), navigateToInactiveUserScreen.getFailedPaymentInfo().getErrorMessage(), navigateToInactiveUserScreen.getFailedPaymentInfo().getPrimaryButtonLabel()));
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

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            if (appNavigator.getBackStack().contains(com.paypal.oslo.feature.home.api.navigation.HomeDestination.INSTANCE)) {
                navigationScope.popTo(com.paypal.oslo.feature.home.api.navigation.HomeDestination.INSTANCE);
            } else {
                navigationScope.replaceStack(com.paypal.oslo.feature.home.api.navigation.HomeDestination.INSTANCE);
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(com.paypal.oslo.feature.xoom.navigation.AccountLinkingDestination.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(android.content.Context context, com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect sendMoneyUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToForbiddenUserScreen navigateToForbiddenUserScreen = (com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect.NavigateToForbiddenUserScreen) sendMoneyUiEffect;
            java.lang.String string = context.getString(navigateToForbiddenUserScreen.getTitleRes());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
            java.lang.String string2 = context.getString(navigateToForbiddenUserScreen.getDescriptionRes());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
            java.lang.String string3 = context.getString(navigateToForbiddenUserScreen.getPrimaryButtonTextRes());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
            navigationScope.push(new com.paypal.oslo.feature.xoom.navigation.ErrorDestination(string, string2, string3));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyUiEffect sendMoneyUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneyScreen$2$1.AnonymousClass1) create(sendMoneyUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneyScreen$2$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneyScreen$2$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass1.getHighSpeedVideoFpsRangesFor = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneyScreen$2$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = appNavigator;
            this.Camera2StreamConfigurationMap = str;
            this.getHighResolutionOutputSizeshNQ4ISI = context;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoSizes.getUiEffect(), new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneyScreen$2$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneyScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneyScreen$2$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SendMoneyScreenKt$SendMoneyScreen$2$1(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel sendMoneyViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyScreenKt$SendMoneyScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = sendMoneyViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        this.getHighSpeedVideoFpsRanges = str;
        this.Camera2StreamConfigurationMap = context;
    }
}
