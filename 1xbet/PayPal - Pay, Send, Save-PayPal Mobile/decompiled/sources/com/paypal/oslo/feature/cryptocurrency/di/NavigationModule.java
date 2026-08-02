package com.paypal.oslo.feature.cryptocurrency.di;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\r\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0002\b\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/activity/api/provider/IActivityWidgetProvider;", "activityWidgetProvider", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/activity/api/provider/IActivityWidgetProvider;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes12.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.cryptocurrency.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.cryptocurrency.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider activityWidgetProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityWidgetProvider, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.$r8$lambda$ZjBttUtXPaMOo2YCv5zl7M9cXYo(com.paypal.oslo.core.navigation.AppNavigator.this, activityWidgetProvider, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0ifmth5vfBMCRhIP2SXM6_vIkBg(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoOnboardingDestination cryptoOnboardingDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoOnboardingDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(553245054, i, -1, "com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:116)");
        }
        boolean changedInstance = composer.changedInstance(cryptoOnboardingDestination);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.$r8$lambda$DnHVNuGYdSZbqPQ1r_wtC5XTpnY(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoOnboardingDestination.this, (com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingViewModel.Factory) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingScreenKt.CryptoOnboardingScreen((com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), appNavigator, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel $r8$lambda$1NDL9pNSgZj5o2sUPTrVABBdlPA(com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability.BUY_CRYPTO);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1fGDKZ4Jtl4hinRCH33rZAOTWkY(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.cryptocurrency.api.navigation.LoyaltyCryptoDestination loyaltyCryptoDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loyaltyCryptoDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(744050333, i, -1, "com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:397)");
        }
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryScreenKt.LoyaltyCryptoEntryScreen((com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0), appNavigator, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3bKsYAzFmsFyyEC2Xhou8L1iNXI(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1699964265, i, -1, "com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous>.<anonymous> (NavigationModule.kt:168)");
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.$r8$lambda$PcGUvFhyCCSRsnk9eq8fAoA1EIU((com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionScreenKt.CryptoAssetSelectionScreen((com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), appNavigator, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6IWyyQTFJQkDFbWlFVuWUYxdTl0(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.cryptocurrency.navigation.CryptoReceiveDestination cryptoReceiveDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoReceiveDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(cryptoReceiveDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1523889744, i2, -1, "com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:270)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda32
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.$r8$lambda$tEFCIeW2NS0WoooXliwb00Qxkco(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoReceiveDestination.this, (com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveScreenKt.CryptoReceiveScreen((com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), appNavigator, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$6lp7EHvIWHiGhbURZOj-mirImCI, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.sell.success.SellSuccessViewModel m13735$r8$lambda$6lp7EHvIWHiGhbURZOjmirImCI(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellSuccessDestination cryptoSellSuccessDestination, com.paypal.oslo.feature.cryptocurrency.ui.sell.success.SellSuccessViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(new com.paypal.oslo.feature.cryptocurrency.ui.sell.success.model.SellSuccessArgs(cryptoSellSuccessDestination.getTradeId(), cryptoSellSuccessDestination.getAssetSymbol(), cryptoSellSuccessDestination.getAssetName(), cryptoSellSuccessDestination.getAssetLogoUrl(), cryptoSellSuccessDestination.getCryptoAmount(), cryptoSellSuccessDestination.getFiatAmount(), cryptoSellSuccessDestination.getStatus()));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8aTI7QNeOjKILKIIUvgAQYWmku8(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.cryptocurrency.navigation.CryptoProvisioningDestination cryptoProvisioningDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoProvisioningDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(cryptoProvisioningDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-56779664, i2, -1, "com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:183)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.$r8$lambda$Fad86L3lWOU3kT2ZokkQx5a1fjI(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoProvisioningDestination.this, (com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningScreenKt.CryptoProvisioningScreen((com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), appNavigator, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$8tBQV-6y4M4Q6RimJf-yR0wBlyw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13736$r8$lambda$8tBQV6y4M4Q6RimJfyR0wBlyw(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellAmountEntryDestination cryptoSellAmountEntryDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSellAmountEntryDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(cryptoSellAmountEntryDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1654089073, i2, -1, "com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:255)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.$r8$lambda$I4jQNd_kWPO4YUUHPQ71gxuETK4(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellAmountEntryDestination.this, (com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryScreenKt.CryptoSellAmountEntryScreen((com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), appNavigator, null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$B80rX-Hw4yJHEgu9Zfe6FmIPgI4, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel m13737$r8$lambda$B80rXHw4yJHEgu9Zfe6FmIPgI4(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoAssetSelectionDestination cryptoAssetSelectionDestination, com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(cryptoAssetSelectionDestination.getOperationType());
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.buy.success.BuySuccessViewModel $r8$lambda$BfMJ0qIr3uqLiU7yLlSjA0_bmr0(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuySuccessDestination cryptoBuySuccessDestination, com.paypal.oslo.feature.cryptocurrency.ui.buy.success.BuySuccessViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(new com.paypal.oslo.feature.cryptocurrency.ui.buy.success.model.BuySuccessArgs(cryptoBuySuccessDestination.getTradeId(), cryptoBuySuccessDestination.getAssetSymbol(), cryptoBuySuccessDestination.getCryptoAmount(), cryptoBuySuccessDestination.getFiatAmount(), cryptoBuySuccessDestination.getStatus()));
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingViewModel $r8$lambda$DnHVNuGYdSZbqPQ1r_wtC5XTpnY(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoOnboardingDestination cryptoOnboardingDestination, com.paypal.oslo.feature.cryptocurrency.ui.onboarding.CryptoOnboardingViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(cryptoOnboardingDestination.getProduct());
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel $r8$lambda$FPVhRBnIFqsgD05nED0YkcMNMPk(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoDetailsDestination cryptoDetailsDestination, com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(cryptoDetailsDestination.getAssetSymbol());
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningViewModel $r8$lambda$Fad86L3lWOU3kT2ZokkQx5a1fjI(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoProvisioningDestination cryptoProvisioningDestination, com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(cryptoProvisioningDestination.getIntent());
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel $r8$lambda$I4jQNd_kWPO4YUUHPQ71gxuETK4(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellAmountEntryDestination cryptoSellAmountEntryDestination, com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(cryptoSellAmountEntryDestination.getAssetSymbol());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IlCfifdedAqDRhD7K1b1ug_y_Lw(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.cryptocurrency.api.navigation.MoneyManagementCryptocurrencySettingsDestination moneyManagementCryptocurrencySettingsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyManagementCryptocurrencySettingsDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1485974154, i, -1, "com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:349)");
        }
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsScreenKt.CryptoSettingsScreen(appNavigator, (com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0), null, composer, 0, 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel $r8$lambda$PcGUvFhyCCSRsnk9eq8fAoA1EIU(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType.BUY);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QCT20PPvAtisBME7gr1YtmPfmBY(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider iActivityWidgetProvider, final com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoDetailsDestination cryptoDetailsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoDetailsDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-538200016, i, -1, "com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:131)");
        }
        boolean changedInstance = composer.changedInstance(cryptoDetailsDestination);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.$r8$lambda$FPVhRBnIFqsgD05nED0YkcMNMPk(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoDetailsDestination.this, (com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel.Factory) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsScreenKt.CryptoDetailsScreen(appNavigator, iActivityWidgetProvider, cryptoDetailsDestination.getAssetSymbol(), null, (com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0, 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$R4_0c5lwrdGPjUISwRxvJkYg4X0(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellSuccessDestination cryptoSellSuccessDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSellSuccessDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(cryptoSellSuccessDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2030709440, i2, -1, "com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:310)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.m13735$r8$lambda$6lp7EHvIWHiGhbURZOjmirImCI(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellSuccessDestination.this, (com.paypal.oslo.feature.cryptocurrency.ui.sell.success.SellSuccessViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.cryptocurrency.ui.sell.success.SellSuccessScreenKt.SellSuccessScreen((com.paypal.oslo.feature.cryptocurrency.ui.sell.success.SellSuccessViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.ui.sell.success.SellSuccessViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), appNavigator, null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$RSZkkRfFDexn2l-bNkXgmsa7OjU, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel m13738$r8$lambda$RSZkkRfFDexn2lbNkXgmsa7OjU(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyReviewDestination cryptoBuyReviewDestination, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewArgs(cryptoBuyReviewDestination.getAssetSymbol(), cryptoBuyReviewDestination.getAmount()));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SjWX1OKv9BW9MpRhYPPq7_bccUk(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoCelsiusClaimCodeDestination cryptoCelsiusClaimCodeDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoCelsiusClaimCodeDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-666047019, i, -1, "com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:361)");
        }
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt.CryptoCelsiusClaimCodeScreen((com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0), appNavigator, null, composer, 0, 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$SlVBKHMOn-Ofy0NH2s5D_NIP1eQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13739$r8$lambda$SlVBKHMOnOfy0NH2s5D_NIP1eQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuySuccessDestination cryptoBuySuccessDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoBuySuccessDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(cryptoBuySuccessDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1015636675, i2, -1, "com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:232)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda33
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.$r8$lambda$BfMJ0qIr3uqLiU7yLlSjA0_bmr0(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuySuccessDestination.this, (com.paypal.oslo.feature.cryptocurrency.ui.buy.success.BuySuccessViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.cryptocurrency.ui.buy.success.BuySuccessScreenKt.BuySuccessScreen((com.paypal.oslo.feature.cryptocurrency.ui.buy.success.BuySuccessViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.ui.buy.success.BuySuccessViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), appNavigator, null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$V8DCY-V1UbfwHoLpKsWizfruHG8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13740$r8$lambda$V8DCYV1UbfwHoLpKsWizfruHG8(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.cryptocurrency.navigation.PYUSDRewardsSettingsDestination pYUSDRewardsSettingsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pYUSDRewardsSettingsDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-934847919, i, -1, "com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:336)");
            }
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt.PYUSDRewardsSettingsScreen(appNavigator, (com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0), null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZjBttUtXPaMOo2YCv5zl7M9cXYo(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider iActivityWidgetProvider, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_hub_title), false, null, java.lang.Integer.valueOf(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_a11y_back_button), false, null, null, false, 493, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-244425755, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.$r8$lambda$a6s74pJqTlKC9pgsQLUpRkaIYtU(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoHubDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoHubDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoHubDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoHubDestination cryptoHubDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cryptoHubDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoHubDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoHubDestination cryptoHubDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l3Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(553245054, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.$r8$lambda$0ifmth5vfBMCRhIP2SXM6_vIkBg(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoOnboardingDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoOnboardingDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoOnboardingDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoOnboardingDestination cryptoOnboardingDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cryptoOnboardingDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoOnboardingDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoOnboardingDestination cryptoOnboardingDestination) {
                return l3Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        final java.util.Map l3Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, java.lang.Integer.valueOf(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_a11y_back_button), false, null, null, 239, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-538200016, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.$r8$lambda$QCT20PPvAtisBME7gr1YtmPfmBY(com.paypal.oslo.core.navigation.AppNavigator.this, iActivityWidgetProvider, (com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoDetailsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoDetailsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoDetailsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoDetailsDestination cryptoDetailsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cryptoDetailsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoDetailsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$6
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoDetailsDestination cryptoDetailsDestination) {
                return l3Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance3);
        final java.util.Map l3Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(435993215, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.$r8$lambda$cpe3M0k85gfHuJQvC2UDYaZAupU(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.cryptocurrency.navigation.CryptoAssetSelectionDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoAssetSelectionDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.navigation.CryptoAssetSelectionDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoAssetSelectionDestination cryptoAssetSelectionDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cryptoAssetSelectionDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.navigation.CryptoAssetSelectionDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$8
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoAssetSelectionDestination cryptoAssetSelectionDestination) {
                return l3Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance4);
        final java.util.Map l3Metadata$default4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance5 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(269187, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.m13742$r8$lambda$kBDJDQPnqKM6am1Kl10tJsXTAs(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoQuickBuyDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoQuickBuyDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoQuickBuyDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoQuickBuyDestination cryptoQuickBuyDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cryptoQuickBuyDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoQuickBuyDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$10
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoQuickBuyDestination cryptoQuickBuyDestination) {
                return l3Metadata$default4;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance5);
        final java.util.Map l3Metadata$default5 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-56779664, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.$r8$lambda$8aTI7QNeOjKILKIIUvgAQYWmku8(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.cryptocurrency.navigation.CryptoProvisioningDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoProvisioningDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.navigation.CryptoProvisioningDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoProvisioningDestination cryptoProvisioningDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cryptoProvisioningDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.navigation.CryptoProvisioningDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$12
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoProvisioningDestination cryptoProvisioningDestination) {
                return l3Metadata$default5;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance6);
        final java.util.Map l3Metadata$default6 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance7 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(367158890, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.$r8$lambda$hLswnOa78qW8ntLmPHgFoClH3Ig(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyAmountEntryDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyAmountEntryDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyAmountEntryDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$13
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyAmountEntryDestination cryptoBuyAmountEntryDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cryptoBuyAmountEntryDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyAmountEntryDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$14
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyAmountEntryDestination cryptoBuyAmountEntryDestination) {
                return l3Metadata$default6;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance7);
        final java.util.Map l3Metadata$default7 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance8 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(792629625, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.$r8$lambda$r2Cvdj3ZJB1AV4HusUIxvz1XMT4(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyReviewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyReviewDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyReviewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyReviewDestination cryptoBuyReviewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cryptoBuyReviewDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyReviewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$16
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyReviewDestination cryptoBuyReviewDestination) {
                return l3Metadata$default7;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance8);
        final java.util.Map l3Metadata$default8 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance9 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1015636675, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.m13739$r8$lambda$SlVBKHMOnOfy0NH2s5D_NIP1eQ(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuySuccessDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuySuccessDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuySuccessDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuySuccessDestination cryptoBuySuccessDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cryptoBuySuccessDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuySuccessDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$18
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuySuccessDestination cryptoBuySuccessDestination) {
                return l3Metadata$default8;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance9);
        final java.util.Map l3Metadata$default9 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance10 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1654089073, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.m13736$r8$lambda$8tBQV6y4M4Q6RimJfyR0wBlyw(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellAmountEntryDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellAmountEntryDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellAmountEntryDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$19
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellAmountEntryDestination cryptoSellAmountEntryDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cryptoSellAmountEntryDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellAmountEntryDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$20
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellAmountEntryDestination cryptoSellAmountEntryDestination) {
                return l3Metadata$default9;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance10);
        final java.util.Map l3Metadata$default10 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance11 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1523889744, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.$r8$lambda$6IWyyQTFJQkDFbWlFVuWUYxdTl0(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.cryptocurrency.navigation.CryptoReceiveDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoReceiveDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.navigation.CryptoReceiveDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$21
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoReceiveDestination cryptoReceiveDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cryptoReceiveDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.navigation.CryptoReceiveDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$22
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoReceiveDestination cryptoReceiveDestination) {
                return l3Metadata$default10;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance11);
        final java.util.Map l3Metadata$default11 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance12 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1560726640, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.$r8$lambda$mg6JmZ8VqJVmEESDEzi5Kr_TKMI(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellReviewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellReviewDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellReviewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$23
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellReviewDestination cryptoSellReviewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cryptoSellReviewDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellReviewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$24
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellReviewDestination cryptoSellReviewDestination) {
                return l3Metadata$default11;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance12);
        final java.util.Map l3Metadata$default12 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance13 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2030709440, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.$r8$lambda$R4_0c5lwrdGPjUISwRxvJkYg4X0(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellSuccessDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellSuccessDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellSuccessDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$25
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellSuccessDestination cryptoSellSuccessDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cryptoSellSuccessDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellSuccessDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$26
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellSuccessDestination cryptoSellSuccessDestination) {
                return l3Metadata$default12;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance13);
        final java.util.Map l3Metadata$default13 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_rewards_card_title), false, null, java.lang.Integer.valueOf(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_a11y_back_button), false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance14 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-934847919, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.m13740$r8$lambda$V8DCYV1UbfwHoLpKsWizfruHG8(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.cryptocurrency.navigation.PYUSDRewardsSettingsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.navigation.PYUSDRewardsSettingsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.navigation.PYUSDRewardsSettingsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$27
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.cryptocurrency.navigation.PYUSDRewardsSettingsDestination pYUSDRewardsSettingsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(pYUSDRewardsSettingsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.navigation.PYUSDRewardsSettingsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$28
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.cryptocurrency.navigation.PYUSDRewardsSettingsDestination pYUSDRewardsSettingsDestination) {
                return l3Metadata$default13;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance14);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_settings_toolbar_title), false, null, java.lang.Integer.valueOf(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_a11y_back_button), false, null, null, false, 493, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance15 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1485974154, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.$r8$lambda$IlCfifdedAqDRhD7K1b1ug_y_Lw(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.cryptocurrency.api.navigation.MoneyManagementCryptocurrencySettingsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.api.navigation.MoneyManagementCryptocurrencySettingsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.api.navigation.MoneyManagementCryptocurrencySettingsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$29
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.cryptocurrency.api.navigation.MoneyManagementCryptocurrencySettingsDestination moneyManagementCryptocurrencySettingsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(moneyManagementCryptocurrencySettingsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.api.navigation.MoneyManagementCryptocurrencySettingsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$30
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.cryptocurrency.api.navigation.MoneyManagementCryptocurrencySettingsDestination moneyManagementCryptocurrencySettingsDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance15);
        final java.util.Map l3Metadata$default14 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance16 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-666047019, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.$r8$lambda$SjWX1OKv9BW9MpRhYPPq7_bccUk(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoCelsiusClaimCodeDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoCelsiusClaimCodeDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoCelsiusClaimCodeDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$31
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoCelsiusClaimCodeDestination cryptoCelsiusClaimCodeDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cryptoCelsiusClaimCodeDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoCelsiusClaimCodeDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$32
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoCelsiusClaimCodeDestination cryptoCelsiusClaimCodeDestination) {
                return l3Metadata$default14;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance16);
        final java.util.Map l3Metadata$default15 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance17 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1781586357, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.m13743$r8$lambda$kDRUGxsD0DmGhhcjhf149m5J_0(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.cryptocurrency.navigation.CryptoCelsiusClaimCodeSuccessDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoCelsiusClaimCodeSuccessDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.navigation.CryptoCelsiusClaimCodeSuccessDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$33
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoCelsiusClaimCodeSuccessDestination cryptoCelsiusClaimCodeSuccessDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cryptoCelsiusClaimCodeSuccessDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.navigation.CryptoCelsiusClaimCodeSuccessDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$34
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoCelsiusClaimCodeSuccessDestination cryptoCelsiusClaimCodeSuccessDestination) {
                return l3Metadata$default15;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance17);
        final java.util.Map l3Metadata$default16 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance18 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1651835873, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.$r8$lambda$itJZWpc0J1cEdqFZdPNUlfeV8CA(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoRecurringPurchasesDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoRecurringPurchasesDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoRecurringPurchasesDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$35
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoRecurringPurchasesDestination cryptoRecurringPurchasesDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cryptoRecurringPurchasesDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoRecurringPurchasesDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$36
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoRecurringPurchasesDestination cryptoRecurringPurchasesDestination) {
                return l3Metadata$default16;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance18);
        final java.util.Map l2Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance19 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(744050333, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.$r8$lambda$1fGDKZ4Jtl4hinRCH33rZAOTWkY(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.cryptocurrency.api.navigation.LoyaltyCryptoDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.api.navigation.LoyaltyCryptoDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.api.navigation.LoyaltyCryptoDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$37
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.cryptocurrency.api.navigation.LoyaltyCryptoDestination loyaltyCryptoDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(loyaltyCryptoDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.api.navigation.LoyaltyCryptoDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$38
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.cryptocurrency.api.navigation.LoyaltyCryptoDestination loyaltyCryptoDestination) {
                return l2Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance19);
        final java.util.Map l3Metadata$default17 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance20 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1235081730, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.$r8$lambda$gR9cIeCEMOZam9oizI9OyYU9fWk(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.cryptocurrency.navigation.CryptoErrorDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoErrorDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.navigation.CryptoErrorDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$39
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoErrorDestination cryptoErrorDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cryptoErrorDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.cryptocurrency.navigation.CryptoErrorDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$40
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoErrorDestination cryptoErrorDestination) {
                return l3Metadata$default17;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance20);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$a6s74pJqTlKC9pgsQLUpRkaIYtU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoHubDestination cryptoHubDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoHubDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-244425755, i, -1, "com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:106)");
        }
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubScreenKt.CryptoHubScreen((com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0), appNavigator, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ab9zHJJodnHDBTu4GFCK-8qm_O4, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel m13741$r8$lambda$ab9zHJJodnHDBTu4GFCK8qm_O4(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellReviewDestination cryptoSellReviewDestination, com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewArgs(cryptoSellReviewDestination.getAssetSymbol(), cryptoSellReviewDestination.getAmount(), cryptoSellReviewDestination.isSellAll(), cryptoSellReviewDestination.getCryptoQuantity()));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cpe3M0k85gfHuJQvC2UDYaZAupU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.cryptocurrency.navigation.CryptoAssetSelectionDestination cryptoAssetSelectionDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoAssetSelectionDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(cryptoAssetSelectionDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(435993215, i2, -1, "com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:148)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.m13737$r8$lambda$B80rXHw4yJHEgu9Zfe6FmIPgI4(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoAssetSelectionDestination.this, (com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionScreenKt.CryptoAssetSelectionScreen((com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), appNavigator, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gR9cIeCEMOZam9oizI9OyYU9fWk(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.cryptocurrency.navigation.CryptoErrorDestination cryptoErrorDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoErrorDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(cryptoErrorDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1235081730, i, -1, "com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:409)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.error.CryptoErrorScreenKt.CryptoErrorScreen(cryptoErrorDestination, appNavigator, composer, i & 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryViewModel $r8$lambda$gr2EDX1pALNouPmYQUlRT54YRPo(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyAmountEntryDestination cryptoBuyAmountEntryDestination, com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(cryptoBuyAmountEntryDestination.getAssetSymbol());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hLswnOa78qW8ntLmPHgFoClH3Ig(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyAmountEntryDestination cryptoBuyAmountEntryDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoBuyAmountEntryDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(cryptoBuyAmountEntryDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(367158890, i2, -1, "com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:199)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda34
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.$r8$lambda$gr2EDX1pALNouPmYQUlRT54YRPo(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyAmountEntryDestination.this, (com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryScreenKt.AmountEntryScreen((com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), appNavigator, null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$itJZWpc0J1cEdqFZdPNUlfeV8CA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoRecurringPurchasesDestination cryptoRecurringPurchasesDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoRecurringPurchasesDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1651835873, i, -1, "com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:383)");
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        boolean changed = composer.changed(appNavigator);
        com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$1$18$1$1 rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$provideEntryProviderInstaller$1$18$1$1(appNavigator, null);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$k-BDJDQPnqKM6am1Kl10tJsXTAs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13742$r8$lambda$kBDJDQPnqKM6am1Kl10tJsXTAs(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoQuickBuyDestination cryptoQuickBuyDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoQuickBuyDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(269187, i, -1, "com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:160)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.$r8$lambda$1NDL9pNSgZj5o2sUPTrVABBdlPA((com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel.Factory) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateKt.ProvisioningGateContent((com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), appNavigator, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1699964265, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.$r8$lambda$3bKsYAzFmsFyyEC2Xhou8L1iNXI(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, 384);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kDRUGxsD0-DmGhhcjhf149m5J_0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13743$r8$lambda$kDRUGxsD0DmGhhcjhf149m5J_0(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.cryptocurrency.navigation.CryptoCelsiusClaimCodeSuccessDestination cryptoCelsiusClaimCodeSuccessDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoCelsiusClaimCodeSuccessDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1781586357, i, -1, "com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:373)");
            }
            com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusSuccessScreenKt.CryptoCelsiusSuccessScreen(appNavigator, null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mg6JmZ8VqJVmEESDEzi5Kr_TKMI(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellReviewDestination cryptoSellReviewDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSellReviewDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(cryptoSellReviewDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1560726640, i2, -1, "com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:289)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.m13741$r8$lambda$ab9zHJJodnHDBTu4GFCK8qm_O4(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoSellReviewDestination.this, (com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewScreenKt.CryptoSellReviewScreen((com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), appNavigator, null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$r2Cvdj3ZJB1AV4HusUIxvz1XMT4(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyReviewDestination cryptoBuyReviewDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoBuyReviewDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(cryptoBuyReviewDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(792629625, i2, -1, "com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:213)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.di.NavigationModule$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.m13738$r8$lambda$RSZkkRfFDexn2lbNkXgmsa7OjU(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoBuyReviewDestination.this, (com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewScreenKt.ReviewScreen((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), appNavigator, null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel $r8$lambda$tEFCIeW2NS0WoooXliwb00Qxkco(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoReceiveDestination cryptoReceiveDestination, com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(cryptoReceiveDestination.getAssetSymbol(), cryptoReceiveDestination.getNetworkId(), cryptoReceiveDestination.getAssetName(), cryptoReceiveDestination.getLogoUrl());
    }
}
