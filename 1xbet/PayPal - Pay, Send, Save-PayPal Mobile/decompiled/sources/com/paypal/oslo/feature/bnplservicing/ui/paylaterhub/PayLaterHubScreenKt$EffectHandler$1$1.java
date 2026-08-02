package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubScreenKt$EffectHandler$1$1", f = "PayLaterHubScreen.kt", i = {}, l = {207}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class PayLaterHubScreenKt$EffectHandler$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubScreenKt$EffectHandler$1$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect payLaterHubUiEffect = (com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect) obj;
            if (kotlin.jvm.internal.Intrinsics.areEqual(payLaterHubUiEffect, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateBack.INSTANCE)) {
                this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubScreenKt$EffectHandler$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubScreenKt$EffectHandler$1$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(payLaterHubUiEffect, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToAcquisition.INSTANCE)) {
                this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubScreenKt$EffectHandler$1$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubScreenKt$EffectHandler$1$1.AnonymousClass1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (payLaterHubUiEffect instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToPlanDetails) {
                this.getHighSpeedVideoFpsRangesFor.m11575navigateForResultInternaluBl809w(this.getHighResolutionOutputSizeshNQ4ISI, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplservicing.ui.makepayment.navigation.result.PaymentSuccessNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubScreenKt$EffectHandler$1$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubScreenKt$EffectHandler$1$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (payLaterHubUiEffect instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToVirtualCardOverview) {
                this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubScreenKt$EffectHandler$1$1$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubScreenKt$EffectHandler$1$1.AnonymousClass1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(payLaterHubUiEffect, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToPrequal.INSTANCE)) {
                this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubScreenKt$EffectHandler$1$1$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubScreenKt$EffectHandler$1$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (payLaterHubUiEffect instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToAllPlans) {
                this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubScreenKt$EffectHandler$1$1$1$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubScreenKt$EffectHandler$1$1.AnonymousClass1.getHighSpeedVideoSizes(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(payLaterHubUiEffect instanceof com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToWebView)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubScreenKt$EffectHandler$1$1$1$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubScreenKt$EffectHandler$1$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect payLaterHubUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.bnplservicing.navigation.BnplServicingWebView(((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToWebView) payLaterHubUiEffect).getUrl(), "", false, false, false, false, 56, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect payLaterHubUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            if (((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToAllPlans) payLaterHubUiEffect).getNavigateToHistoryTab()) {
                navigationScope.push(new com.paypal.oslo.feature.bnplservicing.navigation.PlanListHistoryTabDestination(com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.PayLaterHub.INSTANCE.getValue()));
            } else {
                navigationScope.push(new com.paypal.oslo.feature.bnplservicing.navigation.PlanListDestination(com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.PayLaterHub.INSTANCE.getValue()));
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect payLaterHubUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.bnplacquisition.api.navigation.VirtualCardOverviewDestination(((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToVirtualCardOverview) payLaterHubUiEffect).getCreditAccountId()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.bnplacquisition.api.navigation.EnterAmountDestination((java.lang.String) null, (com.paypal.oslo.feature.bnplacquisition.api.navigation.EnterAmountDestination.EntryPoint) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.bnplservicing.api.navigation.PreQualDestination(com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.PayLaterHub.INSTANCE.getValue()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect payLaterHubUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToPlanDetails navigateToPlanDetails = (com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect.NavigateToPlanDetails) payLaterHubUiEffect;
            navigationScope.push(new com.paypal.oslo.feature.bnplservicing.navigation.PlanDetailsDestination(navigateToPlanDetails.getCreditAccountId(), navigateToPlanDetails.getSource()));
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = appNavigator;
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            if (this.getHighSpeedVideoFpsRanges.collect(new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubScreenKt$EffectHandler$1$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubScreenKt$EffectHandler$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubScreenKt$EffectHandler$1$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PayLaterHubScreenKt$EffectHandler$1$1(kotlinx.coroutines.flow.Flow<? extends com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubUiEffect> flow, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubScreenKt$EffectHandler$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = flow;
        this.getHighSpeedVideoSizes = appNavigator;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }
}
