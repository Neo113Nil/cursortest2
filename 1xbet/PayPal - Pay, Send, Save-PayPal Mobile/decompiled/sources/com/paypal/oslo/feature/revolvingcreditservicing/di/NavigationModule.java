package com.paypal.oslo.feature.revolvingcreditservicing.di;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\r\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0002\b\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;", "featureGateManager", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes14.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda70
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$TUGxaaS6qg2axhnPGe1THPfjdTE(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager.this, navigator, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$-5vhPAeJoOPxyspNvXbkIo5eEZE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18050$r8$lambda$5vhPAeJoOPxyspNvXbkIo5eEZE(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AccountSummaryDeepLinkDestination accountSummaryDeepLinkDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummaryDeepLinkDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(982089744, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:712)");
        }
        if (featureGateManager.isServicingKilledFor(accountSummaryDeepLinkDestination.getCpi())) {
            composer.startReplaceGroup(118436681);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda161
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$gkvHCyFo19cf5LvHaRZ2gA6beJ4(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.killswitch.ServicingUnavailableScreenKt.ServicingUnavailableScreen((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(118554946);
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt.AccountSummaryScreen(appNavigator, new com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs(accountSummaryDeepLinkDestination.getCpi(), accountSummaryDeepLinkDestination.getSource(), null), null, null, composer, 0, 12);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$-7wTG76FrTWJ5Nrxkv6Gr5zI88M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18051$r8$lambda$7wTG76FrTWJ5Nrxkv6Gr5zI88M(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$-z4AnFNzXzVU2kTd56kA13pJuWw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18052$r8$lambda$z4AnFNzXzVU2kTd56kA13pJuWw(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.PushToWalletErrorDestination pushToWalletErrorDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushToWalletErrorDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(pushToWalletErrorDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(471858224, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:647)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletError fromType = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.pushtowallet.PushToWalletError.INSTANCE.fromType(pushToWalletErrorDestination.getArgs().getErrorType());
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda119
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$ut0GEtk2wwdYXeCLUlVcP1BElzU(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.pushtowallet.PushToWalletErrorScreenKt.PushToWalletErrorScreen(fromType, (kotlin.jvm.functions.Function0) rememberedValue, null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$00qxitwnFavWwP3BhDdX6QD62Hg(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda121
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$JQizF5J3IFdkyEe3r6frhtrE7ak((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0LtI9kKMSXSpJR4psEHZO3Ciyr4(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CreditLimitIncreaseDeepLinkDestination creditLimitIncreaseDeepLinkDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditLimitIncreaseDeepLinkDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1043974725, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:953)");
        }
        if (featureGateManager.isServicingKilledFor(creditLimitIncreaseDeepLinkDestination.getCpi())) {
            composer.startReplaceGroup(-1192748610);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda86
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$LUxx8jhrNHkKMYBOGnk14oYKv3I(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.killswitch.ServicingUnavailableScreenKt.ServicingUnavailableScreen((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1192628268);
            boolean changedInstance = composer.changedInstance(creditLimitIncreaseDeepLinkDestination);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda87
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18081$r8$lambda$dhWmqNiEtpNV7x6vFCqkfQn7FQ(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CreditLimitIncreaseDeepLinkDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.CLIManageScreenKt.CLIManageScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0e0VTQYW0tEdCdOSekkhh1AmUHw(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda112
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18051$r8$lambda$7wTG76FrTWJ5Nrxkv6Gr5zI88M((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1YDz08qPQguud3XJeoE1Vl8dKUQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.LegacyServicingLandingDestination legacyServicingLandingDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legacyServicingLandingDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(legacyServicingLandingDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(216953858, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:362)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda60
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$rbum7vCGUCOWsAOsjQ5tMxCFWr4(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.LegacyServicingLandingDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.LegacyServicingLandingScreenKt.LegacyServicingLandingScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1_c4KOHtIWFomjUqccsV2wn3DVQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final androidx.navigation3.runtime.NavKey navKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda150
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$7lYqF7LfjKQnTakpgQY5BrnCCnA(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$25ca2a5z4y0ncuswjxKCkRnSyqk(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$28rMeHpc8fHRJTXxM8P0G5B6T64(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.PaymentCanceledNavResult paymentCanceledNavResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentCanceledNavResult, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda101
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18087$r8$lambda$mz7U32IY4m91P8oT0Plh4SVG2o(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.PaymentCanceledNavResult.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$42I6rqa_-NUX0KK2c-eCbtMJIko, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18054$r8$lambda$42I6rqa_NUX0KK2ceCbtMJIko(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs revolvingCreditWebViewArgs, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RevolvingCreditWebViewDestination(revolvingCreditWebViewArgs));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$3JCCQ7Mxv_Hb-ngFneUDDURYSa4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18053$r8$lambda$3JCCQ7Mxv_HbngFneUDDURYSa4(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RequestVirtualCardSuccessDestination requestVirtualCardSuccessDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestVirtualCardSuccessDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-59365239, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:640)");
            }
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.RequestVirtualCardSuccessScreenKt.RequestVirtualCardSuccessScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.viewmodel.RequestVirtualCardSuccessViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.viewmodel.RequestVirtualCardSuccessViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$5AlA8Naio8i3_IH4a7aTc0-jWuw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18055$r8$lambda$5AlA8Naio8i3_IH4a7aTc0jWuw(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ActivityDetailDestination activityDetailDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailDestination, "");
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(activityDetailDestination) : composer.changedInstance(activityDetailDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = true;
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1567164053, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:300)");
            }
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !composer.changedInstance(activityDetailDestination))) {
                z = false;
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda164
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$9Znz_k3fzki4hjhH1zEGvZ2EdDY(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ActivityDetailDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel activityDetailViewModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda165
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$NhAhRHT1jt9CPpOyEjbFFN76CXM(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$28rMeHpc8fHRJTXxM8P0G5B6T64(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.PaymentCanceledNavResult) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.ActivityDetailScreenKt.ActivityDetailScreen(function0, (kotlin.jvm.functions.Function1) rememberedValue3, activityDetailViewModel, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel $r8$lambda$5YrRvpzA3IKqJB0PuohREZVRNYE(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RedeemRewardsDestination redeemRewardsDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(redeemRewardsDestination.getNavArgs());
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel $r8$lambda$5_1nhVRSIjE6_RxYpB2QnZYC414(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.LegacyServicingRedirectDeepLinkDestination legacyServicingRedirectDeepLinkDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.LegacyServicingLandingArgs(legacyServicingRedirectDeepLinkDestination.getCpi(), legacyServicingRedirectDeepLinkDestination.getRedirectKey()));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5pfIkJclPyemd0wVse9Q_7H_7Vc(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs revolvingCreditWebViewArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditWebViewArgs, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda122
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18054$r8$lambda$42I6rqa_NUX0KK2ceCbtMJIko(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7lYqF7LfjKQnTakpgQY5BrnCCnA(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(navKey);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8882xywfktkj0K87RyOHEbhwpRA(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8MIQ2AS9Hhw8l_PfAcggsbePQuA(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.StatementDetailsDestination statementDetailsDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementDetailsDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(statementDetailsDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1949704631, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:459)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda94
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$MqbIljCgEBvNPmt5t8v_XHe8Kys(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.StatementDetailsDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel statementDetailsViewModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda95
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$KdPgm20itBnSiiTBvpO2tj5ix6E(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda96
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$5pfIkJclPyemd0wVse9Q_7H_7Vc(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.StatementDetailsScreenKt.StatementDetailsScreen(statementDetailsViewModel, function0, (kotlin.jvm.functions.Function1) rememberedValue3, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8MgpO2f1gMQpA60U86phzOFpPBI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8d6bMVIWa994znkiVAOcmmObf5Q(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda116
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$HGPsARcBRLR9PwR6KNnEfMfCGCI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9OAh9Wh4G3wpQIJhjMlTyU0C11w(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.EnterCvvDestination enterCvvDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enterCvvDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(enterCvvDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(236680679, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:676)");
            }
            if (featureGateManager.isServicingKilledFor(enterCvvDestination.getArgs().getCreditProductIdentifier())) {
                composer.startReplaceGroup(-1382073614);
                boolean changed = composer.changed(appNavigator);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda61
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$fcaNEfdmHAXV3Yg09q0DYwGEzGs(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.killswitch.ServicingUnavailableScreenKt.ServicingUnavailableScreen((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1381958480);
                boolean z = (i2 & 14) == 4;
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda62
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18095$r8$lambda$zb0QM4spZdCWj4CmBL8Yzx_v7U(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.EnterCvvDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvViewModel.Factory) obj);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
                androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.EnterCvvScreenKt.EnterCvvScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9Vp5SSUkvQTBgSAUY4u6c2p79qM(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel $r8$lambda$9Znz_k3fzki4hjhH1zEGvZ2EdDY(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ActivityDetailDestination activityDetailDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(activityDetailDestination.getArgs());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BFhcJSkkEm7zCsOSJTZOvT3kpVI(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RequestVirtualCardDestination requestVirtualCardDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestVirtualCardDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(requestVirtualCardDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(507528959, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:621)");
            }
            if (featureGateManager.isServicingKilledFor(requestVirtualCardDestination.getNavArgs().getCreditProductIdentifier())) {
                composer.startReplaceGroup(1510433146);
                boolean changed = composer.changed(appNavigator);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda89
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$pYbD9sCwha9GSfpJv_M2gF59MN4(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.killswitch.ServicingUnavailableScreenKt.ServicingUnavailableScreen((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1510551132);
                boolean z = (i2 & 14) == 4;
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda100
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$J34TKvBqGslsvOPvLCO8UvhJKKw(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RequestVirtualCardDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel.Factory) obj);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
                androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt.RequestVirtualCardScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), requestVirtualCardDestination.getNavArgs(), composer, 0);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$BHHQ5desZa3gzXu1Jxaq-m-JBRc, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentViewModel m18056$r8$lambda$BHHQ5desZa3gzXu1JxaqmJBRc(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ReviewPaymentDestination reviewPaymentDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(reviewPaymentDestination.getArgs());
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsViewModel $r8$lambda$BibzXfyRgn2_2zTo1o4IL4Phb58(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ContactUsDestination contactUsDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(contactUsDestination.getArgs());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BmlW85urexdanDSpgPhwRCxpvd8(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$CHFOqP71R1PQc3tAxXfqaHiW4-Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18057$r8$lambda$CHFOqP71R1PQc3tAxXfqaHiW4Q(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ChooseWayToPayDestination chooseWayToPayDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chooseWayToPayDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1243934322, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:236)");
        }
        boolean changedInstance = composer.changedInstance(chooseWayToPayDestination);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda82
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18067$r8$lambda$Kd1jt8fyW8Qulk7k1O5rLZ5N_g(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ChooseWayToPayDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel.Factory) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt.ChooseWayToPayScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$CK5yO1lhcIis2kj33_Uj_K--Hok, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18058$r8$lambda$CK5yO1lhcIis2kj33_Uj_KHok(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(navKey);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationViewModel $r8$lambda$DOMV0bYmNFkjG9L_uU7sns32kXQ(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.PaymentConfirmationDestination paymentConfirmationDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(paymentConfirmationDestination.getArgs());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DycNTG_4LB5CXeuullmzp9xlwUI(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.PaymentSummaryDestination paymentSummaryDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentSummaryDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1614802642, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:390)");
        }
        boolean changedInstance = composer.changedInstance(paymentSummaryDestination);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda107
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$JU1iZYXSmPaDN6me2tbyfNEkwaE(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.PaymentSummaryDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel.Factory) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.PaymentSummaryScreenKt.PaymentSummaryScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$DR-6ejiIlZpb7cfYdydvxPR9G8w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18059$r8$lambda$DR6ejiIlZpb7cfYdydvxPR9G8w(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RevolvingCreditWebViewDestination revolvingCreditWebViewDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditWebViewDestination, "");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(revolvingCreditWebViewDestination) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1496922723, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:527)");
            }
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda117
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18074$r8$lambda$VlQZaF_UQ0TkhqdBRnBS5Eom4A(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RevolvingCreditWebViewDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewViewModel revolvingCreditWebViewViewModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            boolean changed = composer.changed(appNavigator);
            boolean z2 = i3 == 4;
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changed | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda118
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18079$r8$lambda$c_s_CYb3FzpZl1q7JvwxId16w(com.paypal.oslo.core.navigation.AppNavigator.this, revolvingCreditWebViewDestination, ((java.lang.Boolean) obj).booleanValue());
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.components.RevolvingCreditWebViewScreenKt.RevolvingCreditWebViewScreen((kotlin.jvm.functions.Function1) rememberedValue2, revolvingCreditWebViewViewModel, revolvingCreditWebViewDestination.getNavParam().getUrl(), revolvingCreditWebViewDestination.getNavParam().isAuthRequired(), revolvingCreditWebViewDestination.getNavParam().getJavaScriptEnabled(), revolvingCreditWebViewDestination.getNavParam().getDownloadSource(), revolvingCreditWebViewDestination.getNavParam().getCloseOnFileOpen(), revolvingCreditWebViewDestination.getNavParam().getBlockBackWhileLoading(), null, composer, 0, 256);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel $r8$lambda$EINNIscWcYg9XKiTGKCsn4RFTeE(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SpecialFinancingDestination specialFinancingDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(specialFinancingDestination.getArgs());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Eu8_jnjiJeIXvpYcGyYLdV3vqK0(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ActivityDestination activityDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(564993541, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:277)");
        }
        boolean changedInstance = composer.changedInstance(activityDestination);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda152
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$kzZQp568FsnyesE2PXz9Jlu0lGs(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ActivityDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel.Factory) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel activityViewModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda153
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$JBaVs1Q6AmLPrTB0nXUTAbjc6ZU(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.NavKey) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
        boolean changed2 = composer.changed(appNavigator);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda154
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$xq7T3ry3rWjaxpblhrLR5yPyv8Q(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
        boolean changed3 = composer.changed(appNavigator);
        com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$1$8$3$1 rememberedValue4 = composer.rememberedValue();
        if (changed3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$1$8$3$1(appNavigator);
            composer.updateRememberedValue(rememberedValue4);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt.ActivityScreen(function12, function0, activityViewModel, (kotlin.jvm.functions.Function2) rememberedValue4, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$F49bBxjn6TtsTyaIUFVDTyjXjoA(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$G-I-s1v6RaWZ6AUvHlCwMvd2yTA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18060$r8$lambda$GIs1v6RaWZ6AUvHlCwMvd2yTA(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda64
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18072$r8$lambda$UTsxjPzbO1NQGUBiGg0CT4eAI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$GCXADJpkfDI-kA84eWU5sb1mqMs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18061$r8$lambda$GCXADJpkfDIkA84eWU5sb1mqMs(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda102
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$rMgtFgBQJuGvzAlOH1j20EI38_0((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel $r8$lambda$GotSxXexpomfmb167JisbU1B9Bg(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RequestVirtualCardArgs requestVirtualCardArgs, com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(requestVirtualCardArgs);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GsBbpsbMV4gJsFUmfw_B6ExWZf8(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.StatementHubDestination statementHubDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementHubDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(statementHubDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1328982981, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:441)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda80
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18089$r8$lambda$o8jj1sW81QLycJKNCwe7yPFcfw(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.StatementHubDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubViewModel statementHubViewModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda81
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18082$r8$lambda$euguV6A5JtR1XmA8DQ9xP1hEX8(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.NavKey) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.StatementHubScreenKt.StatementHubScreen((kotlin.jvm.functions.Function1) rememberedValue2, statementHubViewModel, composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$H9SYg9QRlhh7Xi69tE3LfhumRdg(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.SpecialFinancingDeepLinkDestination specialFinancingDeepLinkDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specialFinancingDeepLinkDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-147988080, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:833)");
        }
        if (featureGateManager.isServicingKilledFor(specialFinancingDeepLinkDestination.getCpi())) {
            composer.startReplaceGroup(-2076352055);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda124
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$UzfybCjoWyBeRAUz1M3LXXxFNB0(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.killswitch.ServicingUnavailableScreenKt.ServicingUnavailableScreen((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-2076221328);
            boolean changedInstance = composer.changedInstance(specialFinancingDeepLinkDestination);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda125
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$MIZzmx082sYfjrO6LKuPObalti8(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.SpecialFinancingDeepLinkDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.SpecialFinancingScreenKt.SpecialFinancingScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HGPsARcBRLR9PwR6KNnEfMfCGCI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$H_kqL8ONi-eTvqHFylngFsHRcaE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18062$r8$lambda$H_kqL8ONieTvqHFylngFsHRcaE(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda134
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$fMgZD0vVTtS5mPtf9bcO1GqASCo((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HyvGjyA9Ph6yAcD4QZXueEd9hBU(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.LegacyServicingRedirectDeepLinkDestination legacyServicingRedirectDeepLinkDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legacyServicingRedirectDeepLinkDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-474211492, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:909)");
        }
        if (featureGateManager.isServicingKilledFor(legacyServicingRedirectDeepLinkDestination.getCpi())) {
            composer.startReplaceGroup(-1087028099);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda148
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$00qxitwnFavWwP3BhDdX6QD62Hg(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.killswitch.ServicingUnavailableScreenKt.ServicingUnavailableScreen((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1086900255);
            boolean changedInstance = composer.changedInstance(legacyServicingRedirectDeepLinkDestination);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda149
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$5_1nhVRSIjE6_RxYpB2QnZYC414(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.LegacyServicingRedirectDeepLinkDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.LegacyServicingLandingScreenKt.LegacyServicingLandingScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$I_SjU0bgV3jw3T0uwepUJ9j_fZA(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.LegacyServicingDestination legacyServicingDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legacyServicingDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1975553694, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:340)");
        }
        if (featureGateManager.isServicingKilledFor(legacyServicingDestination.getNavParam().getCreditProductIdentifier())) {
            composer.startReplaceGroup(-216636837);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18062$r8$lambda$H_kqL8ONieTvqHFylngFsHRcaE(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.killswitch.ServicingUnavailableScreenKt.ServicingUnavailableScreen((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-216510388);
            boolean changedInstance = composer.changedInstance(legacyServicingDestination);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$vbHK7s4vSYqzzTAG_lq8uVqlOZA(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.LegacyServicingDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.LegacyServicingLandingScreenKt.LegacyServicingLandingScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$I_oljnR5J2SeRplRRBn8Gym4xc0(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AutopayDeepLinkDestination autopayDeepLinkDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autopayDeepLinkDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1423741531, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:729)");
        }
        if (featureGateManager.isServicingKilledFor(autopayDeepLinkDestination.getCpi())) {
            composer.startReplaceGroup(-1881808492);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda131
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$Xpu9WOSdcsM3iRqZBmx1njNzV9k(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.killswitch.ServicingUnavailableScreenKt.ServicingUnavailableScreen((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1881695962);
            com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.AutopayScreenKt.AutopayScreen(appNavigator, new com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AutopayNavigationArgs(autopayDeepLinkDestination.getCpi(), (java.lang.String) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, composer, 0, 4);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubViewModel $r8$lambda$IhMcFoXvxCZ_OaJxJox0YDVfMcc(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.StatementHubDeepLinkDestination statementHubDeepLinkDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs(statementHubDeepLinkDestination.getCpi(), null, statementHubDeepLinkDestination.getSource()));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IkpqiP5OqKbGArD11qXksCtu93g(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIApplicationDestination cLIApplicationDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cLIApplicationDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(cLIApplicationDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(219925950, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:576)");
            }
            if (featureGateManager.isServicingKilledFor(cLIApplicationDestination.getNavArgs().getCreditProductIdentifier())) {
                composer.startReplaceGroup(1988947547);
                boolean changed = composer.changed(appNavigator);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda83
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18083$r8$lambda$hUssLthmYHIpPu2rviKoLSPOPs(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.killswitch.ServicingUnavailableScreenKt.ServicingUnavailableScreen((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1989069718);
                boolean z = (i2 & 14) == 4;
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda84
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$SmmVTNfJ0ljY5IikN1tDIxnfpkA(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIApplicationDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationViewModel.Factory) obj);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
                androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationViewModel cLIApplicationViewModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
                boolean changed2 = composer.changed(appNavigator);
                java.lang.Object rememberedValue3 = composer.rememberedValue();
                if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda85
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18066$r8$lambda$KaneAgUivZddiWrwZL1ErIGlU(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.NavKey) obj);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.CLIApplicationScreenKt.CLIApplicationScreen((kotlin.jvm.functions.Function1) rememberedValue3, appNavigator, cLIApplicationViewModel, composer, 0);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TUGxaaS6qg2axhnPGe1THPfjdTE(final com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-440748852, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$dOA_VcuEib_5MvcJim4sxS4c90I(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AccountSummaryDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AccountSummaryDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AccountSummaryDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AccountSummaryDestination accountSummaryDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(accountSummaryDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AccountSummaryDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AccountSummaryDestination accountSummaryDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1291214591, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$yhEti6ANzKvO3pSOQkh1vdvK_wc(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AutopayDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AutopayDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AutopayDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AutopayDestination autopayDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(autopayDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AutopayDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AutopayDestination autopayDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        final java.util.Map l2Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-798660146, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18075$r8$lambda$WYZFlxkTHz1yZH2_PXwsPup0go(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.MakeAPaymentDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.MakeAPaymentDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.MakeAPaymentDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.MakeAPaymentDestination makeAPaymentDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(makeAPaymentDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.MakeAPaymentDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$6
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.MakeAPaymentDestination makeAPaymentDestination) {
                return l2Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance3);
        final java.util.Map l2Metadata$default4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_account_title), false, null, null, false, null, null, false, 509, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1211159601, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$JqNX77_woXuwOc6Fj3L03ErS0gg(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ManageCardDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ManageCardDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ManageCardDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ManageCardDestination manageCardDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(manageCardDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ManageCardDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$8
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ManageCardDestination manageCardDestination) {
                return l2Metadata$default4;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance4);
        final java.util.Map l2Metadata$default5 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance5 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1243934322, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda50
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18057$r8$lambda$CHFOqP71R1PQc3tAxXfqaHiW4Q(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ChooseWayToPayDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ChooseWayToPayDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ChooseWayToPayDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ChooseWayToPayDestination chooseWayToPayDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(chooseWayToPayDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ChooseWayToPayDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$10
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ChooseWayToPayDestination chooseWayToPayDestination) {
                return l2Metadata$default5;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance5);
        final java.util.Map l3Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, 255, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1113101136, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda51
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$_f1FaJVmOOF6fBTnXFqgwdP6TEY(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ReviewPaymentDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ReviewPaymentDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ReviewPaymentDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ReviewPaymentDestination reviewPaymentDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(reviewPaymentDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ReviewPaymentDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$12
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ReviewPaymentDestination reviewPaymentDestination) {
                return l3Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance6);
        final java.util.Map l2Metadata$default6 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance7 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1953714719, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda52
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$ffKKoPN8089IV3tpMd5xOS2xMQM(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ContactUsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ContactUsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ContactUsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$13
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ContactUsDestination contactUsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(contactUsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ContactUsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$14
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ContactUsDestination contactUsDestination) {
                return l2Metadata$default6;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance7);
        final java.util.Map l2Metadata$default7 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_activity_hub_title), false, null, null, false, null, null, false, 509, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance8 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(564993541, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda53
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$Eu8_jnjiJeIXvpYcGyYLdV3vqK0(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ActivityDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ActivityDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ActivityDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ActivityDestination activityDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(activityDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ActivityDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$16
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ActivityDestination activityDestination) {
                return l2Metadata$default7;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance8);
        final java.util.Map l2Metadata$default8 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance9 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1567164053, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda54
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18055$r8$lambda$5AlA8Naio8i3_IH4a7aTc0jWuw(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ActivityDetailDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ActivityDetailDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ActivityDetailDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ActivityDetailDestination activityDetailDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(activityDetailDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ActivityDetailDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$18
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ActivityDetailDestination activityDetailDestination) {
                return l2Metadata$default8;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance9);
        final java.util.Map l3Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, 255, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance10 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(675381544, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda56
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18086$r8$lambda$lKi8RbVGlf_g5UZaYXEABqWJVw(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SelectAmountDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SelectAmountDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SelectAmountDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$19
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SelectAmountDestination selectAmountDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(selectAmountDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SelectAmountDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$20
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SelectAmountDestination selectAmountDestination) {
                return l3Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance10);
        final java.util.Map l2Metadata$default9 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_redeem), false, null, null, false, null, null, false, 509, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance11 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(506464288, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18088$r8$lambda$nGPKIW1dU0QTPKKZj5TyWFZ5J4(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RedeemRewardsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RedeemRewardsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RedeemRewardsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$21
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RedeemRewardsDestination redeemRewardsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(redeemRewardsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RedeemRewardsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$22
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RedeemRewardsDestination redeemRewardsDestination) {
                return l2Metadata$default9;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance11);
        final java.util.Map l2Metadata$default10 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(true, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance12 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1975553694, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$I_SjU0bgV3jw3T0uwepUJ9j_fZA(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.LegacyServicingDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.LegacyServicingDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.LegacyServicingDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$23
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.LegacyServicingDestination legacyServicingDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(legacyServicingDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.LegacyServicingDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$24
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.LegacyServicingDestination legacyServicingDestination) {
                return l2Metadata$default10;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance12);
        final java.util.Map l2Metadata$default11 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(true, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance13 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(216953858, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$1YDz08qPQguud3XJeoE1Vl8dKUQ(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.LegacyServicingLandingDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.LegacyServicingLandingDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.LegacyServicingLandingDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$25
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.LegacyServicingLandingDestination legacyServicingLandingDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(legacyServicingLandingDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.LegacyServicingLandingDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$26
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.LegacyServicingLandingDestination legacyServicingLandingDestination) {
                return l2Metadata$default11;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance13);
        final java.util.Map l3Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, 251, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance14 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1145206800, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$wFB4PVdyqcE44aBnlPOTFDcSa4k(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RewardsSuccessDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RewardsSuccessDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RewardsSuccessDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$27
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RewardsSuccessDestination rewardsSuccessDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(rewardsSuccessDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RewardsSuccessDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$28
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RewardsSuccessDestination rewardsSuccessDestination) {
                return l3Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance14);
        final java.util.Map l3Metadata$default4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_payments), false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance15 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1614802642, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$DycNTG_4LB5CXeuullmzp9xlwUI(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.PaymentSummaryDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.PaymentSummaryDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.PaymentSummaryDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$29
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.PaymentSummaryDestination paymentSummaryDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(paymentSummaryDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.PaymentSummaryDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$30
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.PaymentSummaryDestination paymentSummaryDestination) {
                return l3Metadata$default4;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance15);
        final java.util.Map l2Metadata$default12 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance16 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1986976775, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$P3LPmWxgAkdd_TPBzywdQWeF7RE(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CardActivationDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CardActivationDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CardActivationDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$31
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CardActivationDestination cardActivationDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cardActivationDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CardActivationDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$32
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CardActivationDestination cardActivationDestination) {
                return l2Metadata$default12;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance16);
        final java.util.Map l2Metadata$default13 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance17 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(854364365, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$olBjDQbkb9RmVBjSY69cMeJ__aI(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RewardsDetailDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RewardsDetailDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RewardsDetailDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$33
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RewardsDetailDestination rewardsDetailDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(rewardsDetailDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RewardsDetailDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$34
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RewardsDetailDestination rewardsDetailDestination) {
                return l2Metadata$default13;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance17);
        final java.util.Map l2Metadata$default14 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_statements), false, null, null, false, null, null, false, 509, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance18 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1328982981, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$GsBbpsbMV4gJsFUmfw_B6ExWZf8(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.StatementHubDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.StatementHubDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.StatementHubDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$35
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.StatementHubDestination statementHubDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(statementHubDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.StatementHubDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$36
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.StatementHubDestination statementHubDestination) {
                return l2Metadata$default14;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance18);
        final java.util.Map l3Metadata$default5 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance19 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1949704631, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$8MIQ2AS9Hhw8l_PfAcggsbePQuA(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.StatementDetailsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.StatementDetailsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.StatementDetailsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$37
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.StatementDetailsDestination statementDetailsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(statementDetailsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.StatementDetailsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$38
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.StatementDetailsDestination statementDetailsDestination) {
                return l3Metadata$default5;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance19);
        final java.util.Map l3Metadata$default6 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance20 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(254471979, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18073$r8$lambda$Uo3KNQ_ikjkvRPdBBIOjKFrqsg(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SpecialFinancingDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SpecialFinancingDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SpecialFinancingDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$39
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SpecialFinancingDestination specialFinancingDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(specialFinancingDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SpecialFinancingDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$40
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SpecialFinancingDestination specialFinancingDestination) {
                return l3Metadata$default6;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance20);
        final java.util.Map l3Metadata$default7 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, 250, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance21 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1123889934, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$qJAcevZbDJ5HUMS473ZwOh_XMUA(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.PaymentConfirmationDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.PaymentConfirmationDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.PaymentConfirmationDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$41
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.PaymentConfirmationDestination paymentConfirmationDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(paymentConfirmationDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.PaymentConfirmationDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$42
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.PaymentConfirmationDestination paymentConfirmationDestination) {
                return l3Metadata$default7;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance21);
        final java.util.Map l3Metadata$default8 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, 255, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance22 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1836037789, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$nxHgeVZAWHQk4YT_YaNcF4etSvM(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.BackupPaymentMethodDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.BackupPaymentMethodDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.BackupPaymentMethodDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$43
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.BackupPaymentMethodDestination backupPaymentMethodDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(backupPaymentMethodDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.BackupPaymentMethodDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$44
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.BackupPaymentMethodDestination backupPaymentMethodDestination) {
                return l3Metadata$default8;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance22);
        final java.util.Map l3Metadata$default9 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance23 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1496922723, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18059$r8$lambda$DR6ejiIlZpb7cfYdydvxPR9G8w(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RevolvingCreditWebViewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RevolvingCreditWebViewDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RevolvingCreditWebViewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$45
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RevolvingCreditWebViewDestination revolvingCreditWebViewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(revolvingCreditWebViewDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RevolvingCreditWebViewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$46
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RevolvingCreditWebViewDestination revolvingCreditWebViewDestination) {
                return l3Metadata$default9;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance23);
        final java.util.Map l3Metadata$default10 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, 255, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance24 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1189047775, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$QPmiZRoDNT3RNZCL8BnmgGEDd20(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SpecialFinancingDetailDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SpecialFinancingDetailDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SpecialFinancingDetailDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$47
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SpecialFinancingDetailDestination specialFinancingDetailDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(specialFinancingDetailDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SpecialFinancingDetailDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$48
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SpecialFinancingDetailDestination specialFinancingDetailDestination) {
                return l3Metadata$default10;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance24);
        final java.util.Map l3Metadata$default11 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, true, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18092$r8$lambda$usZ7NNNsXUZtkoZvQQ8M07qHWw(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, null, 155, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.LearnMoreDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> lambda$849250476$revolvingcredit_servicing_prodRelease = com.paypal.oslo.feature.revolvingcreditservicing.di.ComposableSingletons$NavigationModuleKt.INSTANCE.getLambda$849250476$revolvingcredit_servicing_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.LearnMoreDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.LearnMoreDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$49
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.LearnMoreDestination learnMoreDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(learnMoreDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.LearnMoreDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$50
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.LearnMoreDestination learnMoreDestination) {
                return l3Metadata$default11;
            }
        }, (kotlin.jvm.functions.Function3) lambda$849250476$revolvingcredit_servicing_prodRelease);
        final java.util.Map l2Metadata$default15 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance25 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(219925950, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$IkpqiP5OqKbGArD11qXksCtu93g(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIApplicationDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIApplicationDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIApplicationDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$51
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIApplicationDestination cLIApplicationDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cLIApplicationDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIApplicationDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$52
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIApplicationDestination cLIApplicationDestination) {
                return l2Metadata$default15;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance25);
        final java.util.Map l3Metadata$default12 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance26 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(897911456, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$J5TdUdxwcWlBzWMYVvHOVDMVLYo(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIApprovalDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIApprovalDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIApprovalDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$53
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIApprovalDestination cLIApprovalDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cLIApprovalDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIApprovalDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$54
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIApprovalDestination cLIApprovalDestination) {
                return l3Metadata$default12;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance26);
        final java.util.Map l3Metadata$default13 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance27 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1462516074, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$hrd6hmnxRRm_1b3MNrFtfLVxlfk(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIDeclineDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIDeclineDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIDeclineDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$55
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIDeclineDestination cLIDeclineDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cLIDeclineDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIDeclineDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$56
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIDeclineDestination cLIDeclineDestination) {
                return l3Metadata$default13;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance27);
        final java.util.Map l2Metadata$default16 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance28 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(507528959, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$BFhcJSkkEm7zCsOSJTZOvT3kpVI(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RequestVirtualCardDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RequestVirtualCardDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RequestVirtualCardDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$57
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RequestVirtualCardDestination requestVirtualCardDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(requestVirtualCardDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RequestVirtualCardDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$58
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RequestVirtualCardDestination requestVirtualCardDestination) {
                return l2Metadata$default16;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance28);
        final java.util.Map l3Metadata$default14 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, true, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance29 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-59365239, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18053$r8$lambda$3JCCQ7Mxv_HbngFneUDDURYSa4(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RequestVirtualCardSuccessDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RequestVirtualCardSuccessDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RequestVirtualCardSuccessDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$59
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RequestVirtualCardSuccessDestination requestVirtualCardSuccessDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(requestVirtualCardSuccessDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RequestVirtualCardSuccessDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$60
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RequestVirtualCardSuccessDestination requestVirtualCardSuccessDestination) {
                return l3Metadata$default14;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance29);
        final java.util.Map l2Metadata$default17 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance30 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(471858224, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18052$r8$lambda$z4AnFNzXzVU2kTd56kA13pJuWw(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.PushToWalletErrorDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.PushToWalletErrorDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.PushToWalletErrorDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$61
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.PushToWalletErrorDestination pushToWalletErrorDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(pushToWalletErrorDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.PushToWalletErrorDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$62
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.PushToWalletErrorDestination pushToWalletErrorDestination) {
                return l2Metadata$default17;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance30);
        final java.util.Map l2Metadata$default18 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance31 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(308566180, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18063$r8$lambda$IpQ1OIj5NRhTaeFQqXXfqaIo78(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIManageDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIManageDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIManageDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$63
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIManageDestination cLIManageDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cLIManageDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIManageDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$64
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIManageDestination cLIManageDestination) {
                return l2Metadata$default18;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance31);
        final java.util.Map l2Metadata$default19 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance32 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(236680679, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$9OAh9Wh4G3wpQIJhjMlTyU0C11w(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.EnterCvvDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.EnterCvvDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.EnterCvvDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$65
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.EnterCvvDestination enterCvvDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(enterCvvDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.EnterCvvDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$66
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.EnterCvvDestination enterCvvDestination) {
                return l2Metadata$default19;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance32);
        final java.util.Map l2Metadata$default20 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance33 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1184887287, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$qDOqZmHwhhEB4K2aaX5O18PdzEw(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ViewPinDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ViewPinDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ViewPinDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$67
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ViewPinDestination viewPinDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(viewPinDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ViewPinDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$68
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ViewPinDestination viewPinDestination) {
                return l2Metadata$default20;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance33);
        final java.util.Map l2Metadata$default21 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance34 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-102222419, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$MlMOqV148tJhgjVz_75WF7Yj0Gs(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CreatePinDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CreatePinDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CreatePinDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$69
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CreatePinDestination createPinDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(createPinDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CreatePinDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$70
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CreatePinDestination createPinDestination) {
                return l2Metadata$default21;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance34);
        final java.util.Map l2Metadata$default22 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance35 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(982089744, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18050$r8$lambda$5vhPAeJoOPxyspNvXbkIo5eEZE(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AccountSummaryDeepLinkDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AccountSummaryDeepLinkDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AccountSummaryDeepLinkDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$71
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AccountSummaryDeepLinkDestination accountSummaryDeepLinkDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(accountSummaryDeepLinkDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AccountSummaryDeepLinkDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$72
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AccountSummaryDeepLinkDestination accountSummaryDeepLinkDestination) {
                return l2Metadata$default22;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance35);
        final java.util.Map l2Metadata$default23 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance36 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1423741531, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$I_oljnR5J2SeRplRRBn8Gym4xc0(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AutopayDeepLinkDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AutopayDeepLinkDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AutopayDeepLinkDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$73
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AutopayDeepLinkDestination autopayDeepLinkDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(autopayDeepLinkDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AutopayDeepLinkDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$74
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AutopayDeepLinkDestination autopayDeepLinkDestination) {
                return l2Metadata$default23;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance36);
        final java.util.Map l2Metadata$default24 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance37 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(982805089, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$YpOIf5wwxTjbndh3cjYkJvPbCf0(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardActivationDeepLinkDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardActivationDeepLinkDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardActivationDeepLinkDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$75
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardActivationDeepLinkDestination cardActivationDeepLinkDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cardActivationDeepLinkDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardActivationDeepLinkDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$76
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardActivationDeepLinkDestination cardActivationDeepLinkDestination) {
                return l2Metadata$default24;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance37);
        final java.util.Map l3Metadata$default15 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_payments), false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance38 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-953548602, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$ZB9P526XPKv_KI0FLnP51_oJ5a4(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.PaymentSummaryDeepLinkDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.PaymentSummaryDeepLinkDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.PaymentSummaryDeepLinkDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$77
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.PaymentSummaryDeepLinkDestination paymentSummaryDeepLinkDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(paymentSummaryDeepLinkDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.PaymentSummaryDeepLinkDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$78
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.PaymentSummaryDeepLinkDestination paymentSummaryDeepLinkDestination) {
                return l3Metadata$default15;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance38);
        final java.util.Map l3Metadata$default16 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, 255, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance39 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(513231427, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18065$r8$lambda$KHzgwH0TZK42D8pNQvAYHOo98(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.MakePaymentDeepLinkDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.MakePaymentDeepLinkDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.MakePaymentDeepLinkDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$79
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.MakePaymentDeepLinkDestination makePaymentDeepLinkDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(makePaymentDeepLinkDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.MakePaymentDeepLinkDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$80
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.MakePaymentDeepLinkDestination makePaymentDeepLinkDestination) {
                return l3Metadata$default16;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance39);
        final java.util.Map l2Metadata$default25 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_account_title), false, null, null, false, null, null, false, 509, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance40 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1666227107, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$UpJPNOb8BSnt5docrNCFZG2FKU4(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.ManageAccountDeepLinkDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.ManageAccountDeepLinkDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.ManageAccountDeepLinkDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$81
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.ManageAccountDeepLinkDestination manageAccountDeepLinkDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(manageAccountDeepLinkDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.ManageAccountDeepLinkDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$82
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.ManageAccountDeepLinkDestination manageAccountDeepLinkDestination) {
                return l2Metadata$default25;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance40);
        final java.util.Map l3Metadata$default17 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance41 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-147988080, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$H9SYg9QRlhh7Xi69tE3LfhumRdg(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.SpecialFinancingDeepLinkDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.SpecialFinancingDeepLinkDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.SpecialFinancingDeepLinkDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$83
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.SpecialFinancingDeepLinkDestination specialFinancingDeepLinkDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(specialFinancingDeepLinkDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.SpecialFinancingDeepLinkDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$84
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.SpecialFinancingDeepLinkDestination specialFinancingDeepLinkDestination) {
                return l3Metadata$default17;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance41);
        final java.util.Map l2Metadata$default26 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_statements), false, null, null, false, null, null, false, 509, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance42 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(662311175, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda41
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18069$r8$lambda$Pe4qsppFr1_0xWBqMk03a2Y5M(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.StatementHubDeepLinkDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.StatementHubDeepLinkDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.StatementHubDeepLinkDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$85
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.StatementHubDeepLinkDestination statementHubDeepLinkDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(statementHubDeepLinkDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.StatementHubDeepLinkDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$86
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.StatementHubDeepLinkDestination statementHubDeepLinkDestination) {
                return l2Metadata$default26;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance42);
        final java.util.Map l2Metadata$default27 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance43 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1397426398, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$t5o22EQJnqqeLszl56OBbSpS74M(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.RewardsDeepLinkDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.RewardsDeepLinkDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.RewardsDeepLinkDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$87
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.RewardsDeepLinkDestination rewardsDeepLinkDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(rewardsDeepLinkDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.RewardsDeepLinkDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$88
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.RewardsDeepLinkDestination rewardsDeepLinkDestination) {
                return l2Metadata$default27;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance43);
        final java.util.Map l2Metadata$default28 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(true, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance44 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-474211492, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda43
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$HyvGjyA9Ph6yAcD4QZXueEd9hBU(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.LegacyServicingRedirectDeepLinkDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.LegacyServicingRedirectDeepLinkDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.LegacyServicingRedirectDeepLinkDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$89
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.LegacyServicingRedirectDeepLinkDestination legacyServicingRedirectDeepLinkDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(legacyServicingRedirectDeepLinkDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.LegacyServicingRedirectDeepLinkDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$90
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.LegacyServicingRedirectDeepLinkDestination legacyServicingRedirectDeepLinkDestination) {
                return l2Metadata$default28;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance44);
        final java.util.Map l2Metadata$default29 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance45 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(352913726, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda45
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18071$r8$lambda$QvHVClSQ6qF0zv12xuk_ARYr8c(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.RequestVirtualCardDeepLinkDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.RequestVirtualCardDeepLinkDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.RequestVirtualCardDeepLinkDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$91
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.RequestVirtualCardDeepLinkDestination requestVirtualCardDeepLinkDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(requestVirtualCardDeepLinkDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.RequestVirtualCardDeepLinkDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$92
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.RequestVirtualCardDeepLinkDestination requestVirtualCardDeepLinkDestination) {
                return l2Metadata$default29;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance45);
        final java.util.Map l2Metadata$default30 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance46 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1043974725, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda46
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$0LtI9kKMSXSpJR4psEHZO3Ciyr4(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager.this, appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CreditLimitIncreaseDeepLinkDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CreditLimitIncreaseDeepLinkDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CreditLimitIncreaseDeepLinkDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$93
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CreditLimitIncreaseDeepLinkDestination creditLimitIncreaseDeepLinkDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(creditLimitIncreaseDeepLinkDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CreditLimitIncreaseDeepLinkDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$94
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CreditLimitIncreaseDeepLinkDestination creditLimitIncreaseDeepLinkDestination) {
                return l2Metadata$default30;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance46);
        final java.util.Map l2Metadata$default31 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance47 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-139240056, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda47
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18080$r8$lambda$cMNS9sdu5KAP_RlCT8pp6hDAQY(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.RequestPhysicalCardDeepLinkDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.RequestPhysicalCardDeepLinkDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.RequestPhysicalCardDeepLinkDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$95
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.RequestPhysicalCardDeepLinkDestination requestPhysicalCardDeepLinkDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(requestPhysicalCardDeepLinkDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.RequestPhysicalCardDeepLinkDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$96
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.RequestPhysicalCardDeepLinkDestination requestPhysicalCardDeepLinkDestination) {
                return l2Metadata$default31;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance47);
        final java.util.Map l2Metadata$default32 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance48 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-488103512, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda48
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$N677aqSLPPFCvzjSs0DlcZuzZsg(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.SetPreferredDeepLinkDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.SetPreferredDeepLinkDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.SetPreferredDeepLinkDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$97
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.SetPreferredDeepLinkDestination setPreferredDeepLinkDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(setPreferredDeepLinkDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.SetPreferredDeepLinkDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$98
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.SetPreferredDeepLinkDestination setPreferredDeepLinkDestination) {
                return l2Metadata$default32;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance48);
        final java.util.Map l2Metadata$default33 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance49 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1688005758, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda49
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$lmNCIJ9q7IZklyKNehMIvz1mAB4(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardRequestedDeepLinkDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardRequestedDeepLinkDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardRequestedDeepLinkDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$99
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardRequestedDeepLinkDestination cardRequestedDeepLinkDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cardRequestedDeepLinkDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardRequestedDeepLinkDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$100
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardRequestedDeepLinkDestination cardRequestedDeepLinkDestination) {
                return l2Metadata$default33;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance49);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Y9qZ22gQ6BAPgtEEzcdsoxh6LDM(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda126
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$wrJgGgmb8DZ1CY4eXtfnjZ5VQeE((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$UTs-xjP-zbO1NQGUBiGg0CT4eAI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18072$r8$lambda$UTsxjPzbO1NQGUBiGg0CT4eAI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$JdU-Y-FDN6tg2p-L5ehpsJKcx00, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel m18064$r8$lambda$JdUYFDN6tg2pL5ehpsJKcx00(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ManageCardDestination manageCardDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(manageCardDestination.getNavArgs());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JqNX77_woXuwOc6Fj3L03ErS0gg(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ManageCardDestination manageCardDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardDestination, "");
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(manageCardDestination) : composer.changedInstance(manageCardDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = true;
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1211159601, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:222)");
            }
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !composer.changedInstance(manageCardDestination))) {
                z = false;
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda99
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18064$r8$lambda$JdUYFDN6tg2pL5ehpsJKcx00(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ManageCardDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt.ManageCardScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dOA_VcuEib_5MvcJim4sxS4c90I(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AccountSummaryDestination accountSummaryDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummaryDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-440748852, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:174)");
        }
        if (featureGateManager.isServicingKilledFor(accountSummaryDestination.getNavParam().getCreditProductIdentifier())) {
            composer.startReplaceGroup(-633927571);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda115
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$Y9qZ22gQ6BAPgtEEzcdsoxh6LDM(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.killswitch.ServicingUnavailableScreenKt.ServicingUnavailableScreen((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-633815661);
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.AccountSummaryScreenKt.AccountSummaryScreen(appNavigator, accountSummaryDestination.getNavParam(), null, null, composer, 0, 12);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$WYZF-lxkTHz1yZH2_PXwsPup0go, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18075$r8$lambda$WYZFlxkTHz1yZH2_PXwsPup0go(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.MakeAPaymentDestination makeAPaymentDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(makeAPaymentDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-798660146, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:200)");
        }
        if (featureGateManager.isServicingKilledFor(makeAPaymentDestination.getCreditProductIdentifier())) {
            composer.startReplaceGroup(1234499915);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda103
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18094$r8$lambda$yhhQvSsr2_NWKJfsKJIZJXvxx0(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.killswitch.ServicingUnavailableScreenKt.ServicingUnavailableScreen((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1234623760);
            boolean changedInstance = composer.changedInstance(makeAPaymentDestination);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda104
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$mSlzdhbK_ERL1Y2PfWAYHAas1_M(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.MakeAPaymentDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.SelectAmountScreenKt.SelectAmountScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Kd1jt8fyW8Qulk7k1O5rLZ5-N_g, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel m18067$r8$lambda$Kd1jt8fyW8Qulk7k1O5rLZ5N_g(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ChooseWayToPayDestination chooseWayToPayDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(chooseWayToPayDestination.getArgs());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PFWrD7YYPdtIWH9X5wvrYU2bflY(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(navKey);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wrJgGgmb8DZ1CY4eXtfnjZ5VQeE(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JBaVs1Q6AmLPrTB0nXUTAbjc6ZU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final androidx.navigation3.runtime.NavKey navKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda120
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$rJXjhRbFyORkwfu94EkRg7yKXOc(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountViewModel $r8$lambda$mSlzdhbK_ERL1Y2PfWAYHAas1_M(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.MakeAPaymentDestination makeAPaymentDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SelectAmountArgs(makeAPaymentDestination.getCreditProductIdentifier(), (java.lang.String) null, (java.lang.String) null, false, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$p8NpvJdTJ9Zj6xZnyz2OFsMEGog(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_f1FaJVmOOF6fBTnXFqgwdP6TEY(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ReviewPaymentDestination reviewPaymentDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewPaymentDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1113101136, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:246)");
        }
        boolean changedInstance = composer.changedInstance(reviewPaymentDestination);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda143
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18056$r8$lambda$BHHQ5desZa3gzXu1JxaqmJBRc(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ReviewPaymentDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentViewModel.Factory) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentViewModel reviewPaymentViewModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda145
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$tCWmqz9k6CNtDkpVog2BJx9wR3s(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.NavKey) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.components.ReviewPaymentScreenKt.ReviewPaymentScreen(appNavigator, reviewPaymentViewModel, (kotlin.jvm.functions.Function1) rememberedValue2, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yhEti6ANzKvO3pSOQkh1vdvK_wc(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AutopayDestination autopayDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autopayDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1291214591, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:187)");
        }
        if (featureGateManager.isServicingKilledFor(autopayDestination.getNavParam().getCreditProductIdentifier())) {
            composer.startReplaceGroup(846875994);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda90
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18060$r8$lambda$GIs1v6RaWZ6AUvHlCwMvd2yTA(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.killswitch.ServicingUnavailableScreenKt.ServicingUnavailableScreen((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(846987687);
            com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.AutopayScreenKt.AutopayScreen(appNavigator, autopayDestination.getNavParam(), null, composer, 0, 4);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$yhhQ-vSsr2_NWKJfsKJIZJXvxx0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18094$r8$lambda$yhhQvSsr2_NWKJfsKJIZJXvxx0(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda44
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$p8NpvJdTJ9Zj6xZnyz2OFsMEGog((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NhAhRHT1jt9CPpOyEjbFFN76CXM(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda68
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$e3NJxRtMfynpmUh655LGoHxxezk((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tCWmqz9k6CNtDkpVog2BJx9wR3s(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final androidx.navigation3.runtime.NavKey navKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda73
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$PFWrD7YYPdtIWH9X5wvrYU2bflY(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel $r8$lambda$kzZQp568FsnyesE2PXz9Jlu0lGs(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ActivityDestination activityDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(activityDestination.getArgs());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$e3NJxRtMfynpmUh655LGoHxxezk(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountViewModel $r8$lambda$dBrmVRkk_r99wRRZN6NAiSL6TQQ(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SelectAmountDestination selectAmountDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(selectAmountDestination.getArgs());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rJXjhRbFyORkwfu94EkRg7yKXOc(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(navKey);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mz7U32IY4m91P8oT0Pl-h4SVG2o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18087$r8$lambda$mz7U32IY4m91P8oT0Plh4SVG2o(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.PaymentCanceledNavResult paymentCanceledNavResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(paymentCanceledNavResult);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wAgXme29pQCABtM7k9nz3MQrIf8(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel $r8$lambda$JU1iZYXSmPaDN6me2tbyfNEkwaE(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.PaymentSummaryDestination paymentSummaryDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(paymentSummaryDestination.getArgs());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xq7T3ry3rWjaxpblhrLR5yPyv8Q(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda59
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$wAgXme29pQCABtM7k9nz3MQrIf8((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fMgZD0vVTtS5mPtf9bcO1GqASCo(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessViewModel $r8$lambda$TONRa8oqtO5ICdLv0nLgNoHlbGY(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RewardsSuccessDestination rewardsSuccessDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(rewardsSuccessDestination.getNavArgs());
    }

    /* renamed from: $r8$lambda$Mmgdnxfeg7-v0jeLBe9w7iaHbDg, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationViewModel m18068$r8$lambda$Mmgdnxfeg7v0jeLBe9w7iaHbDg(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CardActivationDestination cardActivationDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(cardActivationDestination.getNavArgs());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$P3LPmWxgAkdd_TPBzywdQWeF7RE(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CardActivationDestination cardActivationDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardActivationDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(cardActivationDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1986976775, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:407)");
            }
            if (featureGateManager.cardActivationFeatureEnabled()) {
                composer.startReplaceGroup(786022631);
                boolean z = (i2 & 14) == 4;
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda137
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18068$r8$lambda$Mmgdnxfeg7v0jeLBe9w7iaHbDg(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CardActivationDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationViewModel.Factory) obj);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
                androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.CardActivationScreenKt.CardActivationScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(785903250);
                boolean changed = composer.changed(appNavigator);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda136
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$8d6bMVIWa994znkiVAOcmmObf5Q(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.killswitch.ServicingUnavailableScreenKt.ServicingUnavailableScreen((kotlin.jvm.functions.Function0) rememberedValue2, composer, 0);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel $r8$lambda$vbHK7s4vSYqzzTAG_lq8uVqlOZA(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.LegacyServicingDestination legacyServicingDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.LegacyServicingLandingArgs(legacyServicingDestination.getNavParam().getCreditProductIdentifier(), (java.lang.String) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel $r8$lambda$rbum7vCGUCOWsAOsjQ5tMxCFWr4(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.LegacyServicingLandingDestination legacyServicingLandingDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(legacyServicingLandingDestination.getArgs());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KdPgm20itBnSiiTBvpO2tj5ix6E(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda141
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$zhfwa_5rIE_bhkqfDOk_E6xjRA0((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel $r8$lambda$MqbIljCgEBvNPmt5t8v_XHe8Kys(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.StatementDetailsDestination statementDetailsDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(statementDetailsDestination.getNavArgs());
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel $r8$lambda$i8PPZtEVCAQ6I60eDKDLWu2YYmo(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RewardsDetailDestination rewardsDetailDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(rewardsDetailDestination.getNavArgs());
    }

    /* renamed from: $r8$lambda$euguV6A5JtR1XmA8DQ9xP1h-EX8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18082$r8$lambda$euguV6A5JtR1XmA8DQ9xP1hEX8(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final androidx.navigation3.runtime.NavKey navKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda113
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18058$r8$lambda$CK5yO1lhcIis2kj33_Uj_KHok(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Uo3KNQ_ikjkvRPdBBIOjKFrq-sg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18073$r8$lambda$Uo3KNQ_ikjkvRPdBBIOjKFrqsg(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SpecialFinancingDestination specialFinancingDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specialFinancingDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(254471979, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:474)");
        }
        boolean changedInstance = composer.changedInstance(specialFinancingDestination);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda132
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$EINNIscWcYg9XKiTGKCsn4RFTeE(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SpecialFinancingDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel.Factory) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.SpecialFinancingScreenKt.SpecialFinancingScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$o8j-j1sW81QLycJKNCwe7yPFcfw, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubViewModel m18089$r8$lambda$o8jj1sW81QLycJKNCwe7yPFcfw(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.StatementHubDestination statementHubDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(statementHubDestination.getArgs());
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel $r8$lambda$O2NEhXYkmiR9rjNwnxH8SS73Byo(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.BackupPaymentMethodDestination backupPaymentMethodDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(backupPaymentMethodDestination);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YB3vXbdQuqLtc7IQ6vF3mKe6zUQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda93
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18090$r8$lambda$pNdN6QLAEfMuRXWXjwU1vLVc(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VlQZaF_UQ0TkhqdB-RnBS5Eom4A, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewViewModel m18074$r8$lambda$VlQZaF_UQ0TkhqdBRnBS5Eom4A(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RevolvingCreditWebViewDestination revolvingCreditWebViewDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(revolvingCreditWebViewDestination.getNavParam());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QPmiZRoDNT3RNZCL8BnmgGEDd20(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SpecialFinancingDetailDestination specialFinancingDetailDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specialFinancingDetailDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1189047775, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:553)");
        }
        boolean changedInstance = composer.changedInstance(specialFinancingDetailDestination);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda74
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$RCVTm_o93EtYfId6amt6ytfU4To(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SpecialFinancingDetailDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailViewModel.Factory) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.SpecialFinancingDetailScreenKt.SpecialFinancingDetailScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailViewModel $r8$lambda$RCVTm_o93EtYfId6amt6ytfU4To(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SpecialFinancingDetailDestination specialFinancingDetailDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(specialFinancingDetailDestination.getNavParam().getPromotionalActivity(), specialFinancingDetailDestination.getNavParam().getCpi());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zhfwa_5rIE_bhkqfDOk_E6xjRA0(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$c-_-s_CYb3FzpZl1q7JvwxId16w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18079$r8$lambda$c_s_CYb3FzpZl1q7JvwxId16w(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RevolvingCreditWebViewDestination revolvingCreditWebViewDestination, final boolean z) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda159
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$qunZSOvgYbQLiBGp6MLIZVK4rhQ(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RevolvingCreditWebViewDestination.this, z, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$pNdN-6QLAEfMuR-XWXj-wU1vLVc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18090$r8$lambda$pNdN6QLAEfMuRXWXjwU1vLVc(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.popTo(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AccountSummaryDestination(new com.paypal.oslo.feature.revolvingcreditservicing.api.arguments.AccountSummaryNavigationArgs(creditProductIdentifier, (java.lang.String) null, (com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayNavResult) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Ka-neAgUivZd-diWrwZL1ErIGlU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18066$r8$lambda$KaneAgUivZddiWrwZL1ErIGlU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final androidx.navigation3.runtime.NavKey navKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda111
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$mRFfwuUmU59kJ82BQfqivOXLaq8(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$J5TdUdxwcWlBzWMYVvHOVDMVLYo(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIApprovalDestination cLIApprovalDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cLIApprovalDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(cLIApprovalDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(897911456, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:595)");
            }
            if (featureGateManager.isServicingKilledFor(cLIApprovalDestination.getArgs().getCreditProductIdentifier())) {
                composer.startReplaceGroup(623960729);
                boolean changed = composer.changed(appNavigator);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda139
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18093$r8$lambda$vnlSZiSRp8rVpIMmdLfMFiToM(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.killswitch.ServicingUnavailableScreenKt.ServicingUnavailableScreen((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(624078405);
                boolean z = (i2 & 14) == 4;
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda140
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$fDYuRS3SgkijwvHPXR50etDwxfk(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIApprovalDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalViewModel.Factory) obj);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
                androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.CLIApprovalScreenKt.CLIApprovalScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OsBMKn2e1UlhMXwS4hVawSUApSQ(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nxHgeVZAWHQk4YT_YaNcF4etSvM(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.BackupPaymentMethodDestination backupPaymentMethodDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backupPaymentMethodDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1836037789, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:513)");
        }
        boolean changedInstance = composer.changedInstance(backupPaymentMethodDestination);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda91
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$O2NEhXYkmiR9rjNwnxH8SS73Byo(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.BackupPaymentMethodDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel.Factory) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt.BackupPaymentMethodScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MLuWBmnHaZKqy8UfEtO5KJv1RTk(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationViewModel $r8$lambda$SmmVTNfJ0ljY5IikN1tDIxnfpkA(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIApplicationDestination cLIApplicationDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(cLIApplicationDestination.getNavArgs());
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel $r8$lambda$J34TKvBqGslsvOPvLCO8UvhJKKw(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RequestVirtualCardDestination requestVirtualCardDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(requestVirtualCardDestination.getNavArgs());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qunZSOvgYbQLiBGp6MLIZVK4rhQ(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RevolvingCreditWebViewDestination revolvingCreditWebViewDestination, boolean z, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        if (revolvingCreditWebViewDestination.getNavParam().isCreditDisclosureFlow()) {
            navigationScope.setResult(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.CreditDisclosureNavResult(z));
        }
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$geGSa7XBOWUuuQMSTn9P6BDv4Jg(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hUssLthmYHIpPu2-rviKoLSPOPs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18083$r8$lambda$hUssLthmYHIpPu2rviKoLSPOPs(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda106
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$OsBMKn2e1UlhMXwS4hVawSUApSQ((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Ip-Q1OIj5NRhTaeFQqXXfqaIo78, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18063$r8$lambda$IpQ1OIj5NRhTaeFQqXXfqaIo78(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIManageDestination cLIManageDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cLIManageDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(cLIManageDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(308566180, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:656)");
            }
            if (featureGateManager.isServicingKilledFor(cLIManageDestination.getArgs().getCreditProductIdentifier())) {
                composer.startReplaceGroup(1265149461);
                boolean changed = composer.changed(appNavigator);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda128
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$0e0VTQYW0tEdCdOSekkhh1AmUHw(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.killswitch.ServicingUnavailableScreenKt.ServicingUnavailableScreen((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1265268284);
                boolean z = (i2 & 14) == 4;
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda129
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$uyig3jzv2LTIzmotFzfggEjWjms(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIManageDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageViewModel.Factory) obj);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
                androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.CLIManageScreenKt.CLIManageScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalViewModel $r8$lambda$fDYuRS3SgkijwvHPXR50etDwxfk(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIApprovalDestination cLIApprovalDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(cLIApprovalDestination.getArgs());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mRFfwuUmU59kJ82BQfqivOXLaq8(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(navKey);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$usZ7NNNsXUZtkoZvQQ-8M07qHWw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18092$r8$lambda$usZ7NNNsXUZtkoZvQQ8M07qHWw(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda142
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$geGSa7XBOWUuuQMSTn9P6BDv4Jg((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kdERdun7OAprjMm4P6KCoWeKflE(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$v-nl-SZiSRp8rVpIMmdLfMFiToM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18093$r8$lambda$vnlSZiSRp8rVpIMmdLfMFiToM(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda88
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$MLuWBmnHaZKqy8UfEtO5KJv1RTk((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pYbD9sCwha9GSfpJv_M2gF59MN4(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda160
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$kdERdun7OAprjMm4P6KCoWeKflE((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fcaNEfdmHAXV3Yg09q0DYwGEzGs(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda123
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$F49bBxjn6TtsTyaIUFVDTyjXjoA((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ZEdBXYb85T7-AaeI1pWM40yVnRQ, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinViewModel m18078$r8$lambda$ZEdBXYb85T7AaeI1pWM40yVnRQ(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ViewPinDestination viewPinDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(viewPinDestination.getArgs());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ut0GEtk2wwdYXeCLUlVcP1BElzU(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda135
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$9Vp5SSUkvQTBgSAUY4u6c2p79qM((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageViewModel $r8$lambda$uyig3jzv2LTIzmotFzfggEjWjms(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIManageDestination cLIManageDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(cLIManageDestination.getArgs());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Xpu9WOSdcsM3iRqZBmx1njNzV9k(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda144
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$BmlW85urexdanDSpgPhwRCxpvd8((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gkvHCyFo19cf5LvHaRZ2gA6beJ4(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda157
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$u7FYb0HomYa9p9wRURV7Z4XZp_A((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YpOIf5wwxTjbndh3cjYkJvPbCf0(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardActivationDeepLinkDestination cardActivationDeepLinkDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardActivationDeepLinkDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(982805089, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:743)");
        }
        if (cardActivationDeepLinkDestination.getCpi() == com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.UNKNOWN || featureGateManager.isServicingKilledFor(cardActivationDeepLinkDestination.getCpi()) || !featureGateManager.cardActivationFeatureEnabled()) {
            composer.startReplaceGroup(-45405128);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda162
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$jJv6vNqbO755DmU3Hd71UxHevVM(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.killswitch.ServicingUnavailableScreenKt.ServicingUnavailableScreen((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-45284786);
            boolean changedInstance = composer.changedInstance(cardActivationDeepLinkDestination);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda163
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$jNkGWufTpdi8Xu_36v2isUtxQDs(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardActivationDeepLinkDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.CardActivationScreenKt.CardActivationScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinViewModel $r8$lambda$qh0t5v98EcGflaeIfp3rjVMXa3I(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CreatePinDestination createPinDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(createPinDestination.getArgs());
    }

    /* renamed from: $r8$lambda$KHzgwH0TZK42D8pNQ--vAYHOo98, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18065$r8$lambda$KHzgwH0TZK42D8pNQvAYHOo98(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.MakePaymentDeepLinkDestination makePaymentDeepLinkDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(makePaymentDeepLinkDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(513231427, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:788)");
        }
        if (featureGateManager.isServicingKilledFor(makePaymentDeepLinkDestination.getCpi())) {
            composer.startReplaceGroup(-406038474);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda57
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$mxYz_Pmo3g4dtluC3BwO22F5N_4(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.killswitch.ServicingUnavailableScreenKt.ServicingUnavailableScreen((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-405913079);
            boolean changedInstance = composer.changedInstance(makePaymentDeepLinkDestination);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda58
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18085$r8$lambda$kOvJK_XgsvNX6pJefgAox1SzY(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.MakePaymentDeepLinkDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.SelectAmountScreenKt.SelectAmountScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zb0QM4spZdCWj4CmBL8Yzx-_v7U, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvViewModel m18095$r8$lambda$zb0QM4spZdCWj4CmBL8Yzx_v7U(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.EnterCvvDestination enterCvvDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(enterCvvDestination.getArgs());
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel $r8$lambda$PyXdrSmePDloTsWlOMN69miUFtQ(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.PaymentSummaryDeepLinkDestination paymentSummaryDeepLinkDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentSummaryNavigationArgs(paymentSummaryDeepLinkDestination.getCpi(), null, null, paymentSummaryDeepLinkDestination.getSource()));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZB9P526XPKv_KI0FLnP51_oJ5a4(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.PaymentSummaryDeepLinkDestination paymentSummaryDeepLinkDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentSummaryDeepLinkDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-953548602, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:766)");
        }
        if (featureGateManager.isServicingKilledFor(paymentSummaryDeepLinkDestination.getCpi())) {
            composer.startReplaceGroup(-252612909);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda155
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$zazlK3eDk7pEJhUfPEmYJZdxpnI(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.killswitch.ServicingUnavailableScreenKt.ServicingUnavailableScreen((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-252484259);
            boolean changedInstance = composer.changedInstance(paymentSummaryDeepLinkDestination);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda166
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$PyXdrSmePDloTsWlOMN69miUFtQ(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.PaymentSummaryDeepLinkDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.PaymentSummaryScreenKt.PaymentSummaryScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$u7FYb0HomYa9p9wRURV7Z4XZp_A(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jJv6vNqbO755DmU3Hd71UxHevVM(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda105
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$8882xywfktkj0K87RyOHEbhwpRA((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationViewModel $r8$lambda$jNkGWufTpdi8Xu_36v2isUtxQDs(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardActivationDeepLinkDestination cardActivationDeepLinkDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.CardActivationArgs(cardActivationDeepLinkDestination.getCpi(), (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.CardActivationPreloadedAvailability) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WCekHWRe4JRxuwpVP6YGzVzkuWg(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UpJPNOb8BSnt5docrNCFZG2FKU4(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.ManageAccountDeepLinkDestination manageAccountDeepLinkDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageAccountDeepLinkDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1666227107, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:811)");
        }
        if (featureGateManager.isServicingKilledFor(manageAccountDeepLinkDestination.getCpi())) {
            composer.startReplaceGroup(-1634611236);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda71
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$iduy0c_PJLc7FBzTcw9duEmDSeA(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.killswitch.ServicingUnavailableScreenKt.ServicingUnavailableScreen((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1634487391);
            boolean changedInstance = composer.changedInstance(manageAccountDeepLinkDestination);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda72
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$g6vu8ziEKkoUZiQZkpgM5aPe9s8(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.ManageAccountDeepLinkDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt.ManageCardScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel $r8$lambda$MIZzmx082sYfjrO6LKuPObalti8(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.SpecialFinancingDeepLinkDestination specialFinancingDeepLinkDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SpecialFinancingArgs(specialFinancingDeepLinkDestination.getCpi(), kotlin.collections.CollectionsKt.emptyList(), null, specialFinancingDeepLinkDestination.getSource()));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_qhCyxH5shfc1AkRKuqmr60vhkY(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RxNhvVM3uSyruGwV6vs2wTequJA(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kO-vJK_Xgs-vNX6pJefgAox1SzY, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountViewModel m18085$r8$lambda$kOvJK_XgsvNX6pJefgAox1SzY(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.MakePaymentDeepLinkDestination makePaymentDeepLinkDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SelectAmountArgs(makePaymentDeepLinkDestination.getCpi(), (java.lang.String) null, makePaymentDeepLinkDestination.getSource(), false, 8, (kotlin.jvm.internal.DefaultConstructorMarker) null));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mxYz_Pmo3g4dtluC3BwO22F5N_4(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda63
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$WCekHWRe4JRxuwpVP6YGzVzkuWg((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UzfybCjoWyBeRAUz1M3LXXxFNB0(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda138
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$RxNhvVM3uSyruGwV6vs2wTequJA((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel $r8$lambda$g6vu8ziEKkoUZiQZkpgM5aPe9s8(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.ManageAccountDeepLinkDestination manageAccountDeepLinkDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ManageCardArgs.FromDeepLink(manageAccountDeepLinkDestination.getCpi()));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iduy0c_PJLc7FBzTcw9duEmDSeA(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda156
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$_qhCyxH5shfc1AkRKuqmr60vhkY((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zazlK3eDk7pEJhUfPEmYJZdxpnI(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda76
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$8MgpO2f1gMQpA60U86phzOFpPBI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Pe-4qsp-pFr1_0xWBqMk03a2Y5M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18069$r8$lambda$Pe4qsppFr1_0xWBqMk03a2Y5M(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.StatementHubDeepLinkDestination statementHubDeepLinkDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementHubDeepLinkDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(662311175, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:860)");
        }
        if (featureGateManager.isServicingKilledFor(statementHubDeepLinkDestination.getCpi())) {
            composer.startReplaceGroup(-167449870);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda108
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$_rgN_69f91JydLS_cSkGZkFjohM(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.killswitch.ServicingUnavailableScreenKt.ServicingUnavailableScreen((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-167319732);
            boolean changedInstance = composer.changedInstance(statementHubDeepLinkDestination);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda109
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$IhMcFoXvxCZ_OaJxJox0YDVfMcc(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.StatementHubDeepLinkDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubViewModel statementHubViewModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda110
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$1_c4KOHtIWFomjUqccsV2wn3DVQ(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.NavKey) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.StatementHubScreenKt.StatementHubScreen((kotlin.jvm.functions.Function1) rememberedValue3, statementHubViewModel, composer, 0, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_rgN_69f91JydLS_cSkGZkFjohM(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda133
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$25ca2a5z4y0ncuswjxKCkRnSyqk((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JQizF5J3IFdkyEe3r6frhtrE7ak(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$XLAXBMU4SLDe6kdu2QCzizl-_Qw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18076$r8$lambda$XLAXBMU4SLDe6kdu2QCzizl_Qw(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Y4OCL-5AzsheCJSFgdpWQw9AHtw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18077$r8$lambda$Y4OCL5AzsheCJSFgdpWQw9AHtw(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda114
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18076$r8$lambda$XLAXBMU4SLDe6kdu2QCzizl_Qw((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$QvHVClSQ6qF0zv12xuk_ARYr8-c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18071$r8$lambda$QvHVClSQ6qF0zv12xuk_ARYr8c(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.RequestVirtualCardDeepLinkDestination requestVirtualCardDeepLinkDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestVirtualCardDeepLinkDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(352913726, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:932)");
        }
        if (featureGateManager.isServicingKilledFor(requestVirtualCardDeepLinkDestination.getCpi())) {
            composer.startReplaceGroup(-427035813);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda65
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18061$r8$lambda$GCXADJpkfDIkA84eWU5sb1mqMs(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.killswitch.ServicingUnavailableScreenKt.ServicingUnavailableScreen((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-426911441);
            final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RequestVirtualCardArgs requestVirtualCardArgs = new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RequestVirtualCardArgs(null, null, requestVirtualCardDeepLinkDestination.getCpi());
            boolean changed2 = composer.changed(requestVirtualCardArgs);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda67
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$GotSxXexpomfmb167JisbU1B9Bg(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RequestVirtualCardArgs.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.RequestVirtualCardScreenKt.RequestVirtualCardScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), requestVirtualCardArgs, composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LUxx8jhrNHkKMYBOGnk14oYKv3I(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda92
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18084$r8$lambda$jWRXS8yR1hr6uj9xO7q_IRuoE((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel $r8$lambda$lp4PqePBVT3JKRYttkVmvA0wkvc(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.RewardsDeepLinkDestination rewardsDeepLinkDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RewardsDetailArgs(rewardsDeepLinkDestination.getCpi(), (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary) null, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers) null, false, (java.lang.String) null, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls) null, 60, (kotlin.jvm.internal.DefaultConstructorMarker) null));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$t5o22EQJnqqeLszl56OBbSpS74M(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.RewardsDeepLinkDestination rewardsDeepLinkDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsDeepLinkDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1397426398, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:886)");
        }
        if (featureGateManager.isServicingKilledFor(rewardsDeepLinkDestination.getCpi())) {
            composer.startReplaceGroup(-388083781);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18077$r8$lambda$Y4OCL5AzsheCJSFgdpWQw9AHtw(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.killswitch.ServicingUnavailableScreenKt.ServicingUnavailableScreen((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-387958262);
            boolean changedInstance = composer.changedInstance(rewardsDeepLinkDestination);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda78
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$lp4PqePBVT3JKRYttkVmvA0wkvc(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.RewardsDeepLinkDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt.RewardsDetailScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MQw5wX7SIioSw66nD5HYuBL5kJ8(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda77
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$x0Ft6mCV0nQaDy5372XKVA8qWJs((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$N677aqSLPPFCvzjSs0DlcZuzZsg(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.SetPreferredDeepLinkDestination setPreferredDeepLinkDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setPreferredDeepLinkDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-488103512, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:979)");
        }
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda66
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$zDmk06Rg40CWhnI3cLUCoXEyDX8(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.killswitch.ServicingUnavailableScreenKt.ServicingUnavailableScreen((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Qc-em44Nr-84I-8mNXQyhofTrgM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18070$r8$lambda$Qcem44Nr84I8mNXQyhofTrgM(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda98
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$pqS6FijJ4KwDi9QcCjJh0h1YtIY((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$dhWmqNiEtpNV7x6vFCqk-fQn7FQ, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageViewModel m18081$r8$lambda$dhWmqNiEtpNV7x6vFCqkfQn7FQ(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CreditLimitIncreaseDeepLinkDestination creditLimitIncreaseDeepLinkDestination, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.CLIManageArgs(creditLimitIncreaseDeepLinkDestination.getCpi(), (java.lang.String) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
    }

    /* renamed from: $r8$lambda$cMNS9sdu5KAP_RlCT8pp6hD-AQY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18080$r8$lambda$cMNS9sdu5KAP_RlCT8pp6hDAQY(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.RequestPhysicalCardDeepLinkDestination requestPhysicalCardDeepLinkDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestPhysicalCardDeepLinkDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-139240056, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:972)");
        }
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$MQw5wX7SIioSw66nD5HYuBL5kJ8(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.killswitch.ServicingUnavailableScreenKt.ServicingUnavailableScreen((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$jWRXS8yR1hr-6uj9xO7q_-IRuoE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18084$r8$lambda$jWRXS8yR1hr6uj9xO7q_IRuoE(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rMgtFgBQJuGvzAlOH1j20EI38_0(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lmNCIJ9q7IZklyKNehMIvz1mAB4(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardRequestedDeepLinkDestination cardRequestedDeepLinkDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRequestedDeepLinkDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1688005758, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:986)");
        }
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda127
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18070$r8$lambda$Qcem44Nr84I8mNXQyhofTrgM(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.killswitch.ServicingUnavailableScreenKt.ServicingUnavailableScreen((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pqS6FijJ4KwDi9QcCjJh0h1YtIY(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uYQo8zI9KI-gvcKjrliKwO46gtU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18091$r8$lambda$uYQo8zI9KIgvcKjrliKwO46gtU(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$x0Ft6mCV0nQaDy5372XKVA8qWJs(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zDmk06Rg40CWhnI3cLUCoXEyDX8(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda69
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18091$r8$lambda$uYQo8zI9KIgvcKjrliKwO46gtU((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ffKKoPN8089IV3tpMd5xOS2xMQM(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ContactUsDestination contactUsDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactUsDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(contactUsDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1953714719, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:260)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda151
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$BibzXfyRgn2_2zTo1o4IL4Phb58(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ContactUsDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.ContactUsScreenKt.ContactUsScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$lKi8RbVGlf_g5UZaYXEABqW-JVw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18086$r8$lambda$lKi8RbVGlf_g5UZaYXEABqWJVw(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SelectAmountDestination selectAmountDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectAmountDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(selectAmountDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(675381544, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:316)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda79
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$dBrmVRkk_r99wRRZN6NAiSL6TQQ(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.SelectAmountDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.SelectAmountScreenKt.SelectAmountScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$nGPKIW1-dU0QTPKKZj5TyWFZ5J4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18088$r8$lambda$nGPKIW1dU0QTPKKZj5TyWFZ5J4(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RedeemRewardsDestination redeemRewardsDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemRewardsDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(redeemRewardsDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(506464288, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:328)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda55
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$5YrRvpzA3IKqJB0PuohREZVRNYE(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RedeemRewardsDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.RedeemRewardsScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wFB4PVdyqcE44aBnlPOTFDcSa4k(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RewardsSuccessDestination rewardsSuccessDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsSuccessDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(rewardsSuccessDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1145206800, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:376)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda75
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$TONRa8oqtO5ICdLv0nLgNoHlbGY(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RewardsSuccessDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.RewardsSuccessScreenKt.RewardsSuccessScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.success.viewmodel.RewardsSuccessViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$olBjDQbkb9RmVBjSY69cMeJ__aI(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RewardsDetailDestination rewardsDetailDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsDetailDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(rewardsDetailDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(854364365, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:425)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda97
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$i8PPZtEVCAQ6I60eDKDLWu2YYmo(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RewardsDetailDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.RewardsDetailScreenKt.RewardsDetailScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qJAcevZbDJ5HUMS473ZwOh_XMUA(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.PaymentConfirmationDestination paymentConfirmationDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentConfirmationDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(paymentConfirmationDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1123889934, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:491)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda146
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$DOMV0bYmNFkjG9L_uU7sns32kXQ(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.PaymentConfirmationDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationViewModel paymentConfirmationViewModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda147
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$YB3vXbdQuqLtc7IQ6vF3mKe6zUQ(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt.PaymentConfirmationScreen((kotlin.jvm.functions.Function1) rememberedValue2, paymentConfirmationViewModel, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hrd6hmnxRRm_1b3MNrFtfLVxlfk(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CLIDeclineDestination cLIDeclineDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cLIDeclineDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1462516074, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:612)");
            }
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.decline.CLIDeclineScreenKt.CLIDeclineScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.decline.viewmodel.CLIDeclineViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.decline.viewmodel.CLIDeclineViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MlMOqV148tJhgjVz_75WF7Yj0Gs(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CreatePinDestination createPinDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createPinDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(createPinDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-102222419, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:700)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda130
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.$r8$lambda$qh0t5v98EcGflaeIfp3rjVMXa3I(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.CreatePinDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.CreatePinScreenKt.CreatePinScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qDOqZmHwhhEB4K2aaX5O18PdzEw(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ViewPinDestination viewPinDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewPinDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(viewPinDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1184887287, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:692)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule$$ExternalSyntheticLambda158
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.di.NavigationModule.m18078$r8$lambda$ZEdBXYb85T7AaeI1pWM40yVnRQ(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ViewPinDestination.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.ViewPinScreenKt.ViewPinScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
