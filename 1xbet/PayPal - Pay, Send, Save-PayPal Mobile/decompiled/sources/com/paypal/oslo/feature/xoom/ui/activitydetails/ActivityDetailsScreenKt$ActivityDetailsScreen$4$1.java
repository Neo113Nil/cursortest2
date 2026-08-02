package com.paypal.oslo.feature.xoom.ui.activitydetails;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsScreenKt$ActivityDetailsScreen$4$1", f = "ActivityDetailsScreen.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, nl = {146}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class ActivityDetailsScreenKt$ActivityDetailsScreen$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsScreenKt$ActivityDetailsScreen$4$1$1", f = "ActivityDetailsScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsScreenKt$ActivityDetailsScreen$4$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ android.content.Context getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect activityDetailsUiEffect = (com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (activityDetailsUiEffect instanceof com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect.NavigateToAccountLinking) {
                this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(this.Camera2StreamConfigurationMap, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.xoom.navigation.result.AccountLinkingNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsScreenKt$ActivityDetailsScreen$4$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsScreenKt$ActivityDetailsScreen$4$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (activityDetailsUiEffect instanceof com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect.NavigateToForbiddenUserScreen) {
                com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighSpeedVideoSizes;
                final android.content.Context context = this.getHighSpeedVideoFpsRanges;
                appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsScreenKt$ActivityDetailsScreen$4$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsScreenKt$ActivityDetailsScreen$4$1.AnonymousClass1.Camera2StreamConfigurationMap(context, activityDetailsUiEffect, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (activityDetailsUiEffect instanceof com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect.NavigateToInactiveUserScreen) {
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsScreenKt$ActivityDetailsScreen$4$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsScreenKt$ActivityDetailsScreen$4$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (activityDetailsUiEffect instanceof com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect.NavigateToErrorScreen) {
                com.paypal.oslo.core.navigation.AppNavigator appNavigator2 = this.getHighSpeedVideoSizes;
                final android.content.Context context2 = this.getHighSpeedVideoFpsRanges;
                appNavigator2.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsScreenKt$ActivityDetailsScreen$4$1$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsScreenKt$ActivityDetailsScreen$4$1.AnonymousClass1.getHighSpeedVideoFpsRanges(context2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(activityDetailsUiEffect instanceof com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect.NavigateToSendAgainScreen)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsScreenKt$ActivityDetailsScreen$4$1$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsScreenKt$ActivityDetailsScreen$4$1.AnonymousClass1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
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

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect activityDetailsUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect.NavigateToInactiveUserScreen navigateToInactiveUserScreen = (com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect.NavigateToInactiveUserScreen) activityDetailsUiEffect;
            navigationScope.push(new com.paypal.oslo.feature.xoom.navigation.ErrorDestination(navigateToInactiveUserScreen.getFailedPaymentInfo().getHeader(), navigateToInactiveUserScreen.getFailedPaymentInfo().getErrorMessage(), navigateToInactiveUserScreen.getFailedPaymentInfo().getPrimaryButtonLabel()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect activityDetailsUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect.NavigateToSendAgainScreen navigateToSendAgainScreen = (com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect.NavigateToSendAgainScreen) activityDetailsUiEffect;
            navigationScope.push(new com.paypal.oslo.feature.xoom.navigation.SendAgainDestination(navigateToSendAgainScreen.getUrl(), navigateToSendAgainScreen.getRefTag()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(com.paypal.oslo.feature.xoom.navigation.AccountLinkingDestination.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(android.content.Context context, com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect activityDetailsUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect.NavigateToForbiddenUserScreen navigateToForbiddenUserScreen = (com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect.NavigateToForbiddenUserScreen) activityDetailsUiEffect;
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
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect activityDetailsUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsScreenKt$ActivityDetailsScreen$4$1.AnonymousClass1) create(activityDetailsUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsScreenKt$ActivityDetailsScreen$4$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsScreenKt$ActivityDetailsScreen$4$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsScreenKt$ActivityDetailsScreen$4$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = appNavigator;
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoFpsRanges = context;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoSizes.getUiEffect(), new com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsScreenKt$ActivityDetailsScreen$4$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsScreenKt$ActivityDetailsScreen$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsScreenKt$ActivityDetailsScreen$4$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityDetailsScreenKt$ActivityDetailsScreen$4$1(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel activityDetailsViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsScreenKt$ActivityDetailsScreen$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = activityDetailsViewModel;
        this.getHighSpeedVideoFpsRanges = appNavigator;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRangesFor = context;
    }
}
