package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1", f = "AccountSummaryScreen.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE}, m = "invokeSuspend", n = {}, nl = {440}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class AccountSummaryScreenKt$AccountSummaryScreen$10$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType> getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs getHighSpeedVideoSizesFor;
    final /* synthetic */ java.lang.String getInputFormats;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> getInputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getOutputFormats;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getOutputMinFrameDuration;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState> getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryViewModel getOutputSizeshNQ4ISI;
    int getOutputStallDurationlomOqCM;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "uiEffect", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1$1", f = "AccountSummaryScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
        final /* synthetic */ java.lang.String getHighSpeedVideoSizesFor;
        final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> getInputFormats;
        final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs getInputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getOutputFormats;
        final /* synthetic */ java.lang.String getOutputMinFrameDuration;
        final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState> getOutputMinFrameDurationlomOqCM;
        int getOutputSizes;
        /* synthetic */ java.lang.Object getOutputStallDuration;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect accountSummaryUiEffect = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect) this.getOutputStallDuration;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getOutputSizes != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (!(accountSummaryUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.ShowToast)) {
                if (accountSummaryUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateBack) {
                    this.getOutputFormats.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else if (accountSummaryUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToManageCard) {
                    com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getOutputFormats;
                    java.lang.String str = this.getOutputMinFrameDuration;
                    final com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs accountSummaryNavigationArgs = this.getInputSizeshNQ4ISI;
                    appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ManageCardNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1$1$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1.AnonymousClass1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs.this, accountSummaryUiEffect, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else if (accountSummaryUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToActivities) {
                    com.paypal.oslo.core.navigation.AppNavigator appNavigator2 = this.getOutputFormats;
                    final com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs accountSummaryNavigationArgs2 = this.getInputSizeshNQ4ISI;
                    appNavigator2.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1.AnonymousClass1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.this, accountSummaryNavigationArgs2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else if (accountSummaryUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToActivityDetail) {
                    com.paypal.oslo.core.navigation.AppNavigator appNavigator3 = this.getOutputFormats;
                    final com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs accountSummaryNavigationArgs3 = this.getInputSizeshNQ4ISI;
                    final androidx.compose.runtime.State<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState> state = this.getOutputMinFrameDurationlomOqCM;
                    appNavigator3.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1.AnonymousClass1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.this, accountSummaryNavigationArgs3, state, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else if (accountSummaryUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToSpecialFinancing) {
                    com.paypal.oslo.core.navigation.AppNavigator appNavigator4 = this.getOutputFormats;
                    final com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs accountSummaryNavigationArgs4 = this.getInputSizeshNQ4ISI;
                    appNavigator4.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1$1$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs.this, accountSummaryUiEffect, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else if (accountSummaryUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToSpecialFinancingDetail) {
                    this.getOutputFormats.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1$1$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else if (accountSummaryUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToMakePayment) {
                    com.paypal.oslo.core.navigation.AppNavigator appNavigator5 = this.getOutputFormats;
                    final com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs accountSummaryNavigationArgs5 = this.getInputSizeshNQ4ISI;
                    appNavigator5.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1$1$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.this, accountSummaryNavigationArgs5, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else if (accountSummaryUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToAutopay) {
                    com.paypal.oslo.core.navigation.AppNavigator appNavigator6 = this.getOutputFormats;
                    java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
                    final com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs accountSummaryNavigationArgs6 = this.getInputSizeshNQ4ISI;
                    appNavigator6.m11575navigateForResultInternaluBl809w(str2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1$1$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1.AnonymousClass1.getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else if (accountSummaryUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToPaymentSummary) {
                    com.paypal.oslo.core.navigation.AppNavigator appNavigator7 = this.getOutputFormats;
                    final com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs accountSummaryNavigationArgs7 = this.getInputSizeshNQ4ISI;
                    appNavigator7.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1$1$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1.AnonymousClass1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs.this, accountSummaryUiEffect, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else if (accountSummaryUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToUrl) {
                    final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs revolvingCreditWebViewArgs = new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs(((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToUrl) accountSummaryUiEffect).getUrl(), this.getInputSizeshNQ4ISI.getCreditProductIdentifier(), false, false, (java.lang.String) null, false, false, false, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    this.getOutputFormats.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1$1$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1.AnonymousClass1.getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else if (accountSummaryUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToCreditDisclosure) {
                    final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs revolvingCreditWebViewArgs2 = new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs(((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToCreditDisclosure) accountSummaryUiEffect).getUrl(), this.getInputSizeshNQ4ISI.getCreditProductIdentifier(), true, true, (java.lang.String) null, false, true, true, 48, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    this.getOutputFormats.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoSizes, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.CreditDisclosureNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1$1$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else if (accountSummaryUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToPhoneNumber) {
                    com.paypal.oslo.feature.revolvingcreditservicing.utils.ContextExtensionsKt.launchDialer(this.getHighSpeedVideoFpsRangesFor, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToPhoneNumber) accountSummaryUiEffect).getPhoneNumber());
                } else if (accountSummaryUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToCardActivation) {
                    com.paypal.oslo.core.navigation.AppNavigator appNavigator8 = this.getOutputFormats;
                    java.lang.String str3 = this.Camera2StreamConfigurationMap;
                    final com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs accountSummaryNavigationArgs8 = this.getInputSizeshNQ4ISI;
                    appNavigator8.m11575navigateForResultInternaluBl809w(str3, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.CardActivationNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1$1$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs.this, accountSummaryUiEffect, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else if (accountSummaryUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToRewards) {
                    com.paypal.oslo.core.navigation.AppNavigator appNavigator9 = this.getOutputFormats;
                    java.lang.String str4 = this.getHighSpeedVideoSizesFor;
                    final com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs accountSummaryNavigationArgs9 = this.getInputSizeshNQ4ISI;
                    appNavigator9.m11575navigateForResultInternaluBl809w(str4, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.RewardsRedemptionNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1$1$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1.AnonymousClass1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.this, accountSummaryNavigationArgs9, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else if (accountSummaryUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToStatements) {
                    com.paypal.oslo.core.navigation.AppNavigator appNavigator10 = this.getOutputFormats;
                    final com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs accountSummaryNavigationArgs10 = this.getInputSizeshNQ4ISI;
                    appNavigator10.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1$1$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1.AnonymousClass1.getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs.this, accountSummaryUiEffect, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else if (accountSummaryUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToFeature) {
                    this.getOutputFormats.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1$1$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1.AnonymousClass1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else if (!kotlin.jvm.internal.Intrinsics.areEqual(accountSummaryUiEffect, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.ShowAutopayScheduledWithPaymentDue.INSTANCE)) {
                    if (!(accountSummaryUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.ShowAutopayScheduledNextCycleBottomSheet)) {
                        if (accountSummaryUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToPushToWalletError) {
                            this.getOutputFormats.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1$1$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1.AnonymousClass1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                                }
                            });
                        } else if (!kotlin.jvm.internal.Intrinsics.areEqual(accountSummaryUiEffect, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.ShowPushToWalletToast.INSTANCE)) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(accountSummaryUiEffect, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToPlayStore.INSTANCE)) {
                                com.paypal.oslo.feature.revolvingcreditservicing.utils.ContextExtensionsKt.openAppStoreForUpdate(this.getHighSpeedVideoFpsRangesFor);
                            } else if (accountSummaryUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToRequestVirtualCard) {
                                com.paypal.oslo.core.navigation.AppNavigator appNavigator11 = this.getOutputFormats;
                                final com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs accountSummaryNavigationArgs11 = this.getInputSizeshNQ4ISI;
                                appNavigator11.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1$1$$ExternalSyntheticLambda15
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1.AnonymousClass1.getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.this, accountSummaryNavigationArgs11, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                                    }
                                });
                            } else {
                                if (!(accountSummaryUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToPrioritizedAccountAction)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                this.getOutputFormats.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1$1$$ExternalSyntheticLambda16
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                                    }
                                });
                            }
                        } else {
                            this.getInputFormats.setValue(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Push to Wallet clicked - provisioning flow will be integrated"));
                        }
                    } else {
                        this.getHighResolutionOutputSizeshNQ4ISI.setValue(new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType.AutopayScheduledNextCycle(((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.ShowAutopayScheduledNextCycleBottomSheet) accountSummaryUiEffect).getNextBillingCycleDate()));
                    }
                } else {
                    this.getHighResolutionOutputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType.AutopayScheduledWithPaymentDue.INSTANCE);
                }
            } else {
                this.getInputFormats.setValue(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("this is a UiEffect"));
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect accountSummaryUiEffect, com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs accountSummaryNavigationArgs, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToRequestVirtualCard navigateToRequestVirtualCard = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToRequestVirtualCard) accountSummaryUiEffect;
            navigationScope.push(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RequestVirtualCardDestination(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RequestVirtualCardArgs(navigateToRequestVirtualCard.getCardArtUrl(), navigateToRequestVirtualCard.getCardHolderTermsUrl(), accountSummaryNavigationArgs.getCreditProductIdentifier())));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs accountSummaryNavigationArgs, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AutopayDestination(new com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AutopayNavigationArgs(accountSummaryNavigationArgs.getCreditProductIdentifier(), (java.lang.String) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect accountSummaryUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToSpecialFinancingDetail navigateToSpecialFinancingDetail = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToSpecialFinancingDetail) accountSummaryUiEffect;
            navigationScope.push(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SpecialFinancingDetailDestination(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SpecialFinancingDetailArgs(navigateToSpecialFinancingDetail.getSpecialFinancingActivity(), navigateToSpecialFinancingDetail.getCpi())));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs accountSummaryNavigationArgs, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect accountSummaryUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SpecialFinancingDestination(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SpecialFinancingArgs(accountSummaryNavigationArgs.getCreditProductIdentifier(), ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToSpecialFinancing) accountSummaryUiEffect).getSpecialFinancingActivities(), (java.lang.String) null, (java.lang.String) null, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect accountSummaryUiEffect, com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs accountSummaryNavigationArgs, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToMakePayment navigateToMakePayment = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToMakePayment) accountSummaryUiEffect;
            navigationScope.push(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SelectAmountDestination(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SelectAmountArgs(accountSummaryNavigationArgs.getCreditProductIdentifier(), navigateToMakePayment.getCreditAccountId(), (java.lang.String) null, navigateToMakePayment.getMaxRepayableAmountIsInvalid(), 4, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect accountSummaryUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToFeature) accountSummaryUiEffect).getFeatureDestination());
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect accountSummaryUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToPrioritizedAccountAction) accountSummaryUiEffect).getActionDestination());
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs accountSummaryNavigationArgs, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect accountSummaryUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ManageCardDestination(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromNavigation(accountSummaryNavigationArgs.getCreditProductIdentifier(), ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToManageCard) accountSummaryUiEffect).getManageCardArgs())));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs revolvingCreditWebViewArgs, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RevolvingCreditWebViewDestination(revolvingCreditWebViewArgs));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs revolvingCreditWebViewArgs, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RevolvingCreditWebViewDestination(revolvingCreditWebViewArgs));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs accountSummaryNavigationArgs, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect accountSummaryUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CardActivationDestination(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.CardActivationArgs(accountSummaryNavigationArgs.getCreditProductIdentifier(), ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToCardActivation) accountSummaryUiEffect).getPreloadedAvailability())));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect accountSummaryUiEffect, com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs accountSummaryNavigationArgs, androidx.compose.runtime.State state, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView2;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState access$AccountSummaryScreen$lambda$1 = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt.access$AccountSummaryScreen$lambda$1(state);
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CustomerServiceContact customerServiceContact = null;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Ready ready = access$AccountSummaryScreen$lambda$1 instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Ready ? (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Ready) access$AccountSummaryScreen$lambda$1 : null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.Transaction transaction = ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToActivityDetail) accountSummaryUiEffect).getTransaction();
            java.lang.String creditAccountId = (ready == null || (accountSummaryOverView2 = ready.getAccountSummaryOverView()) == null) ? null : accountSummaryOverView2.getCreditAccountId();
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = accountSummaryNavigationArgs.getCreditProductIdentifier();
            if (ready != null && (accountSummaryOverView = ready.getAccountSummaryOverView()) != null) {
                customerServiceContact = accountSummaryOverView.getCustomerServiceContact();
            }
            navigationScope.push(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ActivityDetailDestination(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.TransactionToActivityDetailArgsMapperKt.mapToActivityDetailDestinationArgs(transaction, creditAccountId, creditProductIdentifier, customerServiceContact)));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs accountSummaryNavigationArgs, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect accountSummaryUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToPaymentSummary navigateToPaymentSummary = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToPaymentSummary) accountSummaryUiEffect;
            navigationScope.push(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.PaymentSummaryDestination(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentSummaryNavigationArgs(accountSummaryNavigationArgs.getCreditProductIdentifier(), navigateToPaymentSummary.getCreditId(), navigateToPaymentSummary.getPaymentSummaryOverview(), (java.lang.String) null, 8, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs accountSummaryNavigationArgs, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect accountSummaryUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.StatementHubDestination(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs(accountSummaryNavigationArgs.getCreditProductIdentifier(), ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToStatements) accountSummaryUiEffect).getCreditAccountId(), (java.lang.String) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect accountSummaryUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PushToWalletErrorType pushToWalletErrorType;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletError error = ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToPushToWalletError) accountSummaryUiEffect).getError();
            if (error instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletError.GenericError) {
                pushToWalletErrorType = com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PushToWalletErrorType.GENERIC;
            } else {
                if (!(error instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletError.CardError)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                pushToWalletErrorType = com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PushToWalletErrorType.CARD;
            }
            navigationScope.push(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.PushToWalletErrorDestination(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PushToWalletErrorArgs(pushToWalletErrorType)));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect accountSummaryUiEffect, com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs accountSummaryNavigationArgs, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToRewards navigateToRewards = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToRewards) accountSummaryUiEffect;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary = navigateToRewards.getRewardsSummary();
            navigationScope.push(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RewardsDetailDestination(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RewardsDetailArgs(accountSummaryNavigationArgs.getCreditProductIdentifier(), rewardsSummary, navigateToRewards.getProductFeatureOffers(), navigateToRewards.getHasPastDueAmount(), navigateToRewards.getCreditAccountId(), navigateToRewards.getRewardsContentUrls())));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect accountSummaryUiEffect, com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs accountSummaryNavigationArgs, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ActivityDestination(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.AccountSummaryOverviewToActivityHubArgsMapperKt.toActivityHubArgs(((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect.NavigateToActivities) accountSummaryUiEffect).getAccountSummaryOverView(), accountSummaryNavigationArgs.getCreditProductIdentifier())));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryUiEffect accountSummaryUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1.AnonymousClass1) create(accountSummaryUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1.AnonymousClass1(this.getOutputFormats, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor, this.getInputFormats, this.getOutputMinFrameDurationlomOqCM, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass1.getOutputStallDuration = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs accountSummaryNavigationArgs, java.lang.String str3, android.content.Context context, java.lang.String str4, java.lang.String str5, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> mutableState, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState> state, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType> mutableState2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getOutputFormats = appNavigator;
            this.getOutputMinFrameDuration = str;
            this.getHighSpeedVideoFpsRanges = str2;
            this.getInputSizeshNQ4ISI = accountSummaryNavigationArgs;
            this.getHighSpeedVideoSizes = str3;
            this.getHighSpeedVideoFpsRangesFor = context;
            this.Camera2StreamConfigurationMap = str4;
            this.getHighSpeedVideoSizesFor = str5;
            this.getInputFormats = mutableState;
            this.getOutputMinFrameDurationlomOqCM = state;
            this.getHighResolutionOutputSizeshNQ4ISI = mutableState2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputStallDurationlomOqCM;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputStallDurationlomOqCM = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getOutputSizeshNQ4ISI.getUiEffect(), new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1.AnonymousClass1(this.getOutputMinFrameDuration, this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getInputFormats, this.getInputSizeshNQ4ISI, this.getOutputMinFrameDurationlomOqCM, this.getHighSpeedVideoSizes, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1(this.getOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getInputFormats, this.getInputSizeshNQ4ISI, this.getOutputMinFrameDurationlomOqCM, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AccountSummaryScreenKt$AccountSummaryScreen$10$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryViewModel accountSummaryViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs accountSummaryNavigationArgs, java.lang.String str3, android.content.Context context, java.lang.String str4, java.lang.String str5, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> mutableState, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState> state, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType> mutableState2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt$AccountSummaryScreen$10$1> continuation) {
        super(2, continuation);
        this.getOutputSizeshNQ4ISI = accountSummaryViewModel;
        this.getOutputMinFrameDuration = appNavigator;
        this.getOutputFormats = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.getHighSpeedVideoSizesFor = accountSummaryNavigationArgs;
        this.getHighSpeedVideoFpsRanges = str3;
        this.getHighResolutionOutputSizeshNQ4ISI = context;
        this.Camera2StreamConfigurationMap = str4;
        this.getInputFormats = str5;
        this.getInputSizeshNQ4ISI = mutableState;
        this.getOutputMinFrameDurationlomOqCM = state;
        this.getHighSpeedVideoSizes = mutableState2;
    }
}
