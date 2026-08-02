package com.paypal.oslo.feature.balance.di.navigation;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\u000f\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J<\u0010\u0013\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J2\u0010\u0015\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/balance/di/navigation/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideEntryProviderInstallerBalanceL2", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadConfigProvider;", "autoReloadConfigProvider", "provideEntryProviderInstallerAutoReload", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/balance/ui/autoReload/AutoReloadConfigProvider;)Lkotlin/jvm/functions/Function1;", "Landroid/content/Context;", "context", "provideEntryProviderInstallerBalanceOnHold", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Landroid/content/Context;)Lkotlin/jvm/functions/Function1;", "provideEntryProviderInstallerBalanceError"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes11.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.balance.di.navigation.NavigationModule INSTANCE = new com.paypal.oslo.feature.balance.di.navigation.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstallerBalanceL2(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.balance.di.navigation.NavigationModule.$r8$lambda$NGIx21S3yypo8r9337jLZ4AspPs(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstallerAutoReload(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadConfigProvider autoReloadConfigProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadConfigProvider, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.balance.di.navigation.NavigationModule.m12024$r8$lambda$uk5Dtrd6X2CZRDtuRbBnhbbmsQ(com.paypal.oslo.core.navigation.AppNavigator.this, autoReloadConfigProvider, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstallerBalanceOnHold(final com.paypal.oslo.core.navigation.AppNavigator navigator, @dagger.hilt.android.qualifiers.ApplicationContext final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.balance.di.navigation.NavigationModule.m12018$r8$lambda$jo3vohMl8WkNxd41Bnd8egZCU(com.paypal.oslo.core.navigation.AppNavigator.this, context, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstallerBalanceError(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.balance.di.navigation.NavigationModule.$r8$lambda$LMoZ_TUNVzlYX__ZaO82kRemTQI(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$-jo3vohMl8WkNxd-41Bnd8egZCU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12018$r8$lambda$jo3vohMl8WkNxd41Bnd8egZCU(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, android.content.Context context, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l3Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, 255, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1628262668, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.balance.di.navigation.NavigationModule.$r8$lambda$pqqfETEXPMDZpLIHynkuPXSnxkk(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.balance.api.navigation.BalanceOnHoldDetailsRouterDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.api.navigation.BalanceOnHoldDetailsRouterDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.api.navigation.BalanceOnHoldDetailsRouterDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$provideEntryProviderInstallerBalanceOnHold$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.balance.api.navigation.BalanceOnHoldDetailsRouterDestination balanceOnHoldDetailsRouterDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(balanceOnHoldDetailsRouterDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.api.navigation.BalanceOnHoldDetailsRouterDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$provideEntryProviderInstallerBalanceOnHold$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.balance.api.navigation.BalanceOnHoldDetailsRouterDestination balanceOnHoldDetailsRouterDestination) {
                return l3Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l3Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, 255, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-390453554, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.balance.di.navigation.NavigationModule.$r8$lambda$_iVd_yfZ03YzDFjBtIajYQCPk_o(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.balance.navigation.BalanceMoneyOnHoldDetailsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.navigation.BalanceMoneyOnHoldDetailsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.navigation.BalanceMoneyOnHoldDetailsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$provideEntryProviderInstallerBalanceOnHold$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.balance.navigation.BalanceMoneyOnHoldDetailsDestination balanceMoneyOnHoldDetailsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(balanceMoneyOnHoldDetailsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.navigation.BalanceMoneyOnHoldDetailsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$provideEntryProviderInstallerBalanceOnHold$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.balance.navigation.BalanceMoneyOnHoldDetailsDestination balanceMoneyOnHoldDetailsDestination) {
                return l3Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        final java.util.Map l3Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, 255, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1953882362, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.balance.di.navigation.NavigationModule.$r8$lambda$oJhDILMd09485eBScKS0CuBCAes(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.balance.api.navigation.NoBalanceMoneyOnHoldDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.api.navigation.NoBalanceMoneyOnHoldDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.api.navigation.NoBalanceMoneyOnHoldDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$provideEntryProviderInstallerBalanceOnHold$lambda$0$$inlined$entry$default$5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.balance.api.navigation.NoBalanceMoneyOnHoldDestination noBalanceMoneyOnHoldDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(noBalanceMoneyOnHoldDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.api.navigation.NoBalanceMoneyOnHoldDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$provideEntryProviderInstallerBalanceOnHold$lambda$0$$inlined$entry$default$6
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.balance.api.navigation.NoBalanceMoneyOnHoldDestination noBalanceMoneyOnHoldDestination) {
                return l3Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance3);
        com.paypal.oslo.feature.balance.di.navigation.NavigationModuleKt.access$multipleHoldsDestination(entryProviderScope, appNavigator, context);
        final java.util.Map l3Metadata$default4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, 255, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1049761087, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.balance.di.navigation.NavigationModule.$r8$lambda$H4w9NGrbsbPen3yWHgX4oF1JppU(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.balance.navigation.BalanceTaxOnHoldDetailsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.navigation.BalanceTaxOnHoldDetailsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.navigation.BalanceTaxOnHoldDetailsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$provideEntryProviderInstallerBalanceOnHold$lambda$0$$inlined$entry$default$7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.balance.navigation.BalanceTaxOnHoldDetailsDestination balanceTaxOnHoldDetailsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(balanceTaxOnHoldDetailsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.navigation.BalanceTaxOnHoldDetailsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$provideEntryProviderInstallerBalanceOnHold$lambda$0$$inlined$entry$default$8
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.balance.navigation.BalanceTaxOnHoldDetailsDestination balanceTaxOnHoldDetailsDestination) {
                return l3Metadata$default4;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance4);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$-vopMUbyKgbUFCDaroigmkQUnqo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12019$r8$lambda$vopMUbyKgbUFCDaroigmkQUnqo(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination autoReloadAmountDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadAmountDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1049540168, i, -1, "com.paypal.oslo.feature.balance.di.navigation.NavigationModule.autoReloadAmountDestination.<anonymous> (NavigationModule.kt:174)");
        }
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt.AmountScreen((com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0), appNavigator, autoReloadAmountDestination.getIntent(), autoReloadAmountDestination.getCurrencyCode(), autoReloadAmountDestination.getMinimumAmount(), autoReloadAmountDestination.getMaximumAmount(), autoReloadAmountDestination.getOptions(), autoReloadAmountDestination.getFormattedMinimum(), autoReloadAmountDestination.getFormattedMaximum(), autoReloadAmountDestination.getFormattedOptions(), composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$207cexdey5U-ChgFwAPwmVzlP3w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12020$r8$lambda$207cexdey5UChgFwAPwmVzlP3w(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.balance.api.navigation.BalanceDashboardDestination balanceDashboardDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceDashboardDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1550353192, i, -1, "com.paypal.oslo.feature.balance.di.navigation.NavigationModule.provideEntryProviderInstallerBalanceL2.<anonymous>.<anonymous> (NavigationModule.kt:79)");
        }
        com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardBaseScreenKt.BalanceDashboardBaseScreen(appNavigator, null, composer, 0, 2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Eb8HnBU8Oe3uY40SIvXwdgg0sNg(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.balance.api.navigation.AutoReloadDestination autoReloadDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(481606697, i, -1, "com.paypal.oslo.feature.balance.di.navigation.NavigationModule.autoReloadDestination.<anonymous> (NavigationModule.kt:104)");
        }
        java.lang.String flowIntent = autoReloadDestination.getFlowIntent();
        java.lang.String source = autoReloadDestination.getSource();
        java.lang.String incomingPath = autoReloadDestination.getIncomingPath();
        java.lang.String xSellAmount = autoReloadDestination.getXSellAmount();
        com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadBaseScreenKt.AutoReloadBaseScreen(appNavigator, flowIntent, source, incomingPath, xSellAmount != null ? kotlin.text.StringsKt.toDoubleOrNull(xSellAmount) : null, autoReloadDestination.getXSellCurrencyCode(), autoReloadDestination.getXSellTransferSpeed(), null, composer, 0, 128);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$H4w9NGrbsbPen3yWHgX4oF1JppU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.balance.navigation.BalanceTaxOnHoldDetailsDestination balanceTaxOnHoldDetailsDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceTaxOnHoldDetailsDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(balanceTaxOnHoldDetailsDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1049761087, i2, -1, "com.paypal.oslo.feature.balance.di.navigation.NavigationModule.provideEntryProviderInstallerBalanceOnHold.<anonymous>.<anonymous> (NavigationModule.kt:256)");
            }
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel onHoldDetailsRouterViewModel = (com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
            com.paypal.oslo.feature.balance.ui.onholddetails.TaxOnHoldState taxOnHoldState = new com.paypal.oslo.feature.balance.ui.onholddetails.TaxOnHoldState(balanceTaxOnHoldDetailsDestination.isTaxIdProvided(), new com.paypal.oslo.feature.balance.domain.model.Money(new java.math.BigDecimal(java.lang.String.valueOf(balanceTaxOnHoldDetailsDestination.getAmount())), com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(balanceTaxOnHoldDetailsDestination.getCurrencyCode()), null), new com.paypal.oslo.feature.balance.domain.model.Money(new java.math.BigDecimal(java.lang.String.valueOf(balanceTaxOnHoldDetailsDestination.getAmountTaxIdRequired())), com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(balanceTaxOnHoldDetailsDestination.getCurrencyCode()), null), balanceTaxOnHoldDetailsDestination.getTaxRate(), balanceTaxOnHoldDetailsDestination.getNextWithholdingDate());
            boolean changedInstance = composer.changedInstance(onHoldDetailsRouterViewModel);
            com.paypal.oslo.feature.balance.di.navigation.NavigationModule$provideEntryProviderInstallerBalanceOnHold$1$4$1$1 rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.balance.di.navigation.NavigationModule$provideEntryProviderInstallerBalanceOnHold$1$4$1$1(onHoldDetailsRouterViewModel);
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function3 function3 = (kotlin.jvm.functions.Function3) ((kotlin.reflect.KFunction) rememberedValue);
            boolean changedInstance2 = composer.changedInstance(onHoldDetailsRouterViewModel);
            com.paypal.oslo.feature.balance.di.navigation.NavigationModule$provideEntryProviderInstallerBalanceOnHold$1$4$2$1 rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.balance.di.navigation.NavigationModule$provideEntryProviderInstallerBalanceOnHold$1$4$2$1(onHoldDetailsRouterViewModel);
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) ((kotlin.reflect.KFunction) rememberedValue2);
            boolean changedInstance3 = composer.changedInstance(onHoldDetailsRouterViewModel);
            com.paypal.oslo.feature.balance.di.navigation.NavigationModule$provideEntryProviderInstallerBalanceOnHold$1$4$3$1 rememberedValue3 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new com.paypal.oslo.feature.balance.di.navigation.NavigationModule$provideEntryProviderInstallerBalanceOnHold$1$4$3$1(onHoldDetailsRouterViewModel);
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.balance.ui.onholddetails.TaxOnHoldDetailsKt.TaxOnHoldDetails(appNavigator, taxOnHoldState, function3, function2, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue3), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LMoZ_TUNVzlYX__ZaO82kRemTQI(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map bottomSheetMetadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, true, false, null, null, null, 115, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(744598970, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.balance.di.navigation.NavigationModule.$r8$lambda$Qtxh7d91WAnuobjdLNNSAymNraA(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.balance.api.navigation.BalanceErrorBottomSheetDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.api.navigation.BalanceErrorBottomSheetDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.api.navigation.BalanceErrorBottomSheetDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$provideEntryProviderInstallerBalanceError$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.balance.api.navigation.BalanceErrorBottomSheetDestination balanceErrorBottomSheetDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(balanceErrorBottomSheetDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.api.navigation.BalanceErrorBottomSheetDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$provideEntryProviderInstallerBalanceError$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.balance.api.navigation.BalanceErrorBottomSheetDestination balanceErrorBottomSheetDestination) {
                return bottomSheetMetadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NGIx21S3yypo8r9337jLZ4AspPs(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1550353192, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.balance.di.navigation.NavigationModule.m12020$r8$lambda$207cexdey5UChgFwAPwmVzlP3w(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.balance.api.navigation.BalanceDashboardDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.api.navigation.BalanceDashboardDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.api.navigation.BalanceDashboardDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$provideEntryProviderInstallerBalanceL2$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.balance.api.navigation.BalanceDashboardDestination balanceDashboardDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(balanceDashboardDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.api.navigation.BalanceDashboardDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$provideEntryProviderInstallerBalanceL2$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.balance.api.navigation.BalanceDashboardDestination balanceDashboardDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$O9lVkka2zYuN-gMQsfMi-R5tF6k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12021$r8$lambda$O9lVkka2zYuNgMQsfMiR5tF6k(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.balance.di.navigation.NavigationModule.$r8$lambda$iPni4wzyQ6CS5PLFEn6E2tSHC4E((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ONupbapSQLP05fga7hLEbbkAE0g(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.balance.navigation.result.AutoReloadAmountNavResult("", ""));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Qtxh7d91WAnuobjdLNNSAymNraA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.balance.api.navigation.BalanceErrorBottomSheetDestination balanceErrorBottomSheetDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceErrorBottomSheetDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(744598970, i, -1, "com.paypal.oslo.feature.balance.di.navigation.NavigationModule.provideEntryProviderInstallerBalanceError.<anonymous>.<anonymous> (NavigationModule.kt:288)");
        }
        com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetKt.BalanceErrorBottomSheet(com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum.INSTANCE.fromString(balanceErrorBottomSheetDestination.getErrorType()), appNavigator, balanceErrorBottomSheetDestination.getOnAction(), balanceErrorBottomSheetDestination.getOnSecondaryAction(), composer, 0, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RuI3fWCmJmhj8JgTeuiMPkK54Cs(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.balance.navigation.AutoReloadFrequencyDestination autoReloadFrequencyDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadFrequencyDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(autoReloadFrequencyDestination) : composer.changedInstance(autoReloadFrequencyDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1566820478, i, -1, "com.paypal.oslo.feature.balance.di.navigation.NavigationModule.autoReloadFrequencyDestination.<anonymous> (NavigationModule.kt:198)");
            }
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyScreenKt.FrequencyScreen(appNavigator, (com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0), autoReloadFrequencyDestination.getFrequency(), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_iVd_yfZ03YzDFjBtIajYQCPk_o(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.balance.navigation.BalanceMoneyOnHoldDetailsDestination balanceMoneyOnHoldDetailsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceMoneyOnHoldDetailsDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(balanceMoneyOnHoldDetailsDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-390453554, i, -1, "com.paypal.oslo.feature.balance.di.navigation.NavigationModule.provideEntryProviderInstallerBalanceOnHold.<anonymous>.<anonymous> (NavigationModule.kt:236)");
            }
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel onHoldDetailsRouterViewModel = (com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
            com.paypal.oslo.feature.balance.ui.onholddetails.MoneyOnHoldState moneyOnHoldState = new com.paypal.oslo.feature.balance.ui.onholddetails.MoneyOnHoldState(new com.paypal.oslo.feature.balance.domain.model.Money(new java.math.BigDecimal(java.lang.String.valueOf(balanceMoneyOnHoldDetailsDestination.getAmount())), com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(balanceMoneyOnHoldDetailsDestination.getCurrencyCode()), null));
            boolean changedInstance = composer.changedInstance(onHoldDetailsRouterViewModel);
            com.paypal.oslo.feature.balance.di.navigation.NavigationModule$provideEntryProviderInstallerBalanceOnHold$1$2$1$1 rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.balance.di.navigation.NavigationModule$provideEntryProviderInstallerBalanceOnHold$1$2$1$1(onHoldDetailsRouterViewModel);
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.balance.ui.onholddetails.MoneyOnHoldDetailsKt.MoneyOnHoldDetails(appNavigator, moneyOnHoldState, (kotlin.jvm.functions.Function3) ((kotlin.reflect.KFunction) rememberedValue), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hOvElmmsUZbdYbMeMd9R-UhSpuk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12022$r8$lambda$hOvElmmsUZbdYbMeMd9RUhSpuk(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.balance.navigation.AutoReloadReviewDestination autoReloadReviewDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadReviewDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(autoReloadReviewDestination) : composer.changedInstance(autoReloadReviewDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1181837752, i, -1, "com.paypal.oslo.feature.balance.di.navigation.NavigationModule.autoReloadReviewDestination.<anonymous> (NavigationModule.kt:214)");
            }
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt.ReviewScreen(appNavigator, (com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0), autoReloadReviewDestination.getStrategy(), autoReloadReviewDestination.getCurrencyCode(), autoReloadReviewDestination.getFlowType(), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iPni4wzyQ6CS5PLFEn6E2tSHC4E(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.balance.navigation.result.AutoReloadAmountNavResult("", ""));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iURsOmI718AsFCBco6fF7OwNNKA(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.balance.di.navigation.NavigationModule.$r8$lambda$ONupbapSQLP05fga7hLEbbkAE0g((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oJhDILMd09485eBScKS0CuBCAes(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.balance.api.navigation.NoBalanceMoneyOnHoldDestination noBalanceMoneyOnHoldDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(noBalanceMoneyOnHoldDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1953882362, i, -1, "com.paypal.oslo.feature.balance.di.navigation.NavigationModule.provideEntryProviderInstallerBalanceOnHold.<anonymous>.<anonymous> (NavigationModule.kt:249)");
        }
        com.paypal.oslo.feature.balance.ui.onholddetails.MoneyOnHoldNoBalanceKt.MoneyOnHoldNoBalance(appNavigator, noBalanceMoneyOnHoldDestination.getPercentageTax(), composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pqqfETEXPMDZpLIHynkuPXSnxkk(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.balance.api.navigation.BalanceOnHoldDetailsRouterDestination balanceOnHoldDetailsRouterDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceOnHoldDetailsRouterDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1628262668, i, -1, "com.paypal.oslo.feature.balance.di.navigation.NavigationModule.provideEntryProviderInstallerBalanceOnHold.<anonymous>.<anonymous> (NavigationModule.kt:231)");
        }
        com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterScreenKt.OnHoldDetailsRouterScreen(appNavigator, null, composer, 0, 2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$tkuOGWpb6YSBXH3BYPX-2gZFuns, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12023$r8$lambda$tkuOGWpb6YSBXH3BYPX2gZFuns(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.balance.api.navigation.AutoReloadScheduledDestination autoReloadScheduledDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadScheduledDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1573437212, i, -1, "com.paypal.oslo.feature.balance.di.navigation.NavigationModule.autoReloadScheduledDestination.<anonymous> (NavigationModule.kt:152)");
        }
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt.AutoReloadScheduledScreen(appNavigator, (com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0), composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uk5Dtrd6X2CZRDtu-RbBnhbbmsQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12024$r8$lambda$uk5Dtrd6X2CZRDtuRbBnhbbmsQ(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadConfigProvider autoReloadConfigProvider, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map<java.lang.String, java.lang.Object> autoReloadBottomSheetMetadata = autoReloadConfigProvider.getAutoReloadBottomSheetMetadata();
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(481606697, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.balance.di.navigation.NavigationModule.$r8$lambda$Eb8HnBU8Oe3uY40SIvXwdgg0sNg(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.balance.api.navigation.AutoReloadDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.api.navigation.AutoReloadDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.api.navigation.AutoReloadDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$autoReloadDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.balance.api.navigation.AutoReloadDestination autoReloadDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(autoReloadDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.api.navigation.AutoReloadDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$autoReloadDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.balance.api.navigation.AutoReloadDestination autoReloadDestination) {
                return autoReloadBottomSheetMetadata;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_low_balance_label), false, null, java.lang.Integer.valueOf(com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_low_balance_screen_back_button_content_description), false, null, null, false, 493, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(509777321, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.balance.di.navigation.NavigationModule.m12025$r8$lambda$z4d8AXTsBbaG4c_9XG6WROlrQ(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.balance.api.navigation.LowBalanceReloadDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.api.navigation.LowBalanceReloadDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.api.navigation.LowBalanceReloadDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$autoReloadLowBalanceDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.balance.api.navigation.LowBalanceReloadDestination lowBalanceReloadDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(lowBalanceReloadDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.api.navigation.LowBalanceReloadDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$autoReloadLowBalanceDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.balance.api.navigation.LowBalanceReloadDestination lowBalanceReloadDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_scheduled_label), false, null, java.lang.Integer.valueOf(com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_low_balance_screen_back_button_content_description), false, null, null, false, 493, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1573437212, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.balance.di.navigation.NavigationModule.m12023$r8$lambda$tkuOGWpb6YSBXH3BYPX2gZFuns(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.balance.api.navigation.AutoReloadScheduledDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.api.navigation.AutoReloadScheduledDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.api.navigation.AutoReloadScheduledDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$autoReloadScheduledDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.balance.api.navigation.AutoReloadScheduledDestination autoReloadScheduledDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(autoReloadScheduledDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.api.navigation.AutoReloadScheduledDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$autoReloadScheduledDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.balance.api.navigation.AutoReloadScheduledDestination autoReloadScheduledDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance3);
        final java.util.Map bottomSheetMetadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, true, false, null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.balance.di.navigation.NavigationModule.m12021$r8$lambda$O9lVkka2zYuNgMQsfMiR5tF6k(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.balance.di.navigation.NavigationModule.$r8$lambda$iURsOmI718AsFCBco6fF7OwNNKA(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, 19, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1049540168, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.balance.di.navigation.NavigationModule.m12019$r8$lambda$vopMUbyKgbUFCDaroigmkQUnqo(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$autoReloadAmountDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination autoReloadAmountDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(autoReloadAmountDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$autoReloadAmountDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination autoReloadAmountDestination) {
                return bottomSheetMetadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance4);
        final java.util.Map bottomSheetMetadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, true, false, null, null, null, 115, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance5 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1566820478, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.balance.di.navigation.NavigationModule.$r8$lambda$RuI3fWCmJmhj8JgTeuiMPkK54Cs(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.balance.navigation.AutoReloadFrequencyDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.navigation.AutoReloadFrequencyDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.navigation.AutoReloadFrequencyDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$autoReloadFrequencyDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.balance.navigation.AutoReloadFrequencyDestination autoReloadFrequencyDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(autoReloadFrequencyDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.navigation.AutoReloadFrequencyDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$autoReloadFrequencyDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.balance.navigation.AutoReloadFrequencyDestination autoReloadFrequencyDestination) {
                return bottomSheetMetadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance5);
        final java.util.Map bottomSheetMetadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, false, false, null, null, null, 119, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1181837752, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.balance.di.navigation.NavigationModule.m12022$r8$lambda$hOvElmmsUZbdYbMeMd9RUhSpuk(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.balance.navigation.AutoReloadReviewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.navigation.AutoReloadReviewDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.navigation.AutoReloadReviewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$autoReloadReviewDestination$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.balance.navigation.AutoReloadReviewDestination autoReloadReviewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(autoReloadReviewDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.navigation.AutoReloadReviewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.balance.di.navigation.NavigationModule$autoReloadReviewDestination$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.balance.navigation.AutoReloadReviewDestination autoReloadReviewDestination) {
                return bottomSheetMetadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance6);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$z4d8AXTsB-baG4c_9XG6W-ROlrQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12025$r8$lambda$z4d8AXTsBbaG4c_9XG6WROlrQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.balance.api.navigation.LowBalanceReloadDestination lowBalanceReloadDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lowBalanceReloadDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(509777321, i, -1, "com.paypal.oslo.feature.balance.di.navigation.NavigationModule.autoReloadLowBalanceDestination.<anonymous> (NavigationModule.kt:125)");
        }
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel lowBalanceViewModel = (com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
        java.lang.Double xSellAmount = lowBalanceReloadDestination.getXSellAmount();
        com.paypal.oslo.feature.balance.ui.autoReload.model.XSellInfo xSellInfo = null;
        if (xSellAmount != null) {
            double doubleValue = xSellAmount.doubleValue();
            java.lang.String xSellCurrencyCode = lowBalanceReloadDestination.getXSellCurrencyCode();
            if (xSellCurrencyCode != null) {
                xSellInfo = new com.paypal.oslo.feature.balance.ui.autoReload.model.XSellInfo(doubleValue, xSellCurrencyCode, lowBalanceReloadDestination.getXSellTransferSpeed());
            }
        }
        com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt.LowBalanceReloadScreen(appNavigator, lowBalanceViewModel, xSellInfo, composer, 0, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
