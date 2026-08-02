package com.paypal.oslo.feature.wallet.di;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JL\u0010\u0011\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\r\u0012\u0004\u0012\u00020\u000e0\fj\u0002`\u000f¢\u0006\u0002\b\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/wallet/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;", "walletFeatureManager", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/CommonComponents;", "commonComponents", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Landroid/content/Context;Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;Lcom/paypal/oslo/feature/moneymovement/api/shared/components/CommonComponents;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.wallet.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.wallet.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator, @dagger.hilt.android.qualifiers.ApplicationContext final android.content.Context context, final com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager, final com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents commonComponents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletFeatureManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commonComponents, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.m21248$r8$lambda$eIN1xVWGS4vIRuFwIcOxoA4eik(context, navigator, commonComponents, walletFeatureManager, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0HHvoIRXvv25wASR2zWQdIdHTPI(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$TcSzt4i2Y81CYEXNY9IkKQbKqpA((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1EadrXOl2kNvTQyze0mAFJOndUY(com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.api.navigation.CardDetailDestination cardDetailDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetailDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(cardDetailDestination) : composer.changedInstance(cardDetailDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(317215654, i, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:478)");
            }
            if (walletFeatureManager.isCardDetailEnabled()) {
                composer.startReplaceGroup(1243580692);
                java.lang.String cardId = cardDetailDestination.getCardId();
                boolean changed = composer.changed(appNavigator);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda23
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$4AHaFn_jh_lC8Tybh6fXyV6x7hg(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailScreenKt.CardDetailScreen(cardId, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue, null, composer, 0, 46);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1243815548);
                boolean changed2 = composer.changed(appNavigator);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda24
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$BEImWc8EDr0qik_DDdJcHkRyef0(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.wallet.common.WalletFeatureRedirectScreenKt.WalletFeatureRedirectScreen((kotlin.jvm.functions.Function0) rememberedValue2, null, null, null, composer, 0, 14);
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$2RuGJvO15IJsZN7VuJFaWu1RAyE(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$2q-2wctHeXkP4nDoQW9wT_tAqXI, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel m21233$r8$lambda$2q2wctHeXkP4nDoQW9wT_tAqXI(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankPlaid addBankPlaid, com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(addBankPlaid.getFlow(), addBankPlaid.getAction(), addBankPlaid.getInstrumentId(), addBankPlaid.getBank(), addBankPlaid.getCountryCode());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3DuqBzEqrl0dcHPw7EwlVyanuqE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositInstructions randomDepositInstructions, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(randomDepositInstructions, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(85601681, i, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:686)");
        }
        com.paypal.oslo.feature.wallet.banks.ui.confirmation.ConfirmInstructionScreenKt.ConfirmInstructionScreen(appNavigator, randomDepositInstructions.getBankAccountId(), randomDepositInstructions.getBankAccountDetails(), randomDepositInstructions.getShowInstantConfirmation(), null, composer, 0, 16);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3dznYH_4dtG2_b7uF0z6XdfxfeE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositsBankConfirmation randomDepositsBankConfirmation, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(randomDepositsBankConfirmation, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1982814867, i, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:696)");
        }
        com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationRouteKt.RandomDepositsConfirmationRoute(randomDepositsBankConfirmation.getBankAccountDetails(), appNavigator, randomDepositsBankConfirmation.getShouldShowBack(), randomDepositsBankConfirmation.getBankAccountDetails().getAvailableActions().contains(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction.COMPLETE_INSTANT_CONFIRMATION), null, null, composer, 0, 48);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4AHaFn_jh_lC8Tybh6fXyV6x7hg(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.m21235$r8$lambda$9O8owFylfj5CTwPbFamNhggUnk((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4hH_QMobk5PBwVyrcRDMgbZA32E(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$9xea7wXFoGzL4CdjHnawJqHZX2Y((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$7yIk9rN1VUBKBXrXST-0F83RkpI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21234$r8$lambda$7yIk9rN1VUBKBXrXST0F83RkpI(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.wallet.ui.Destination.ManualAddBankRouter manualAddBankRouter, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manualAddBankRouter, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(368062605, i, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:834)");
            }
            com.paypal.oslo.feature.wallet.banks.ui.router.ManualAddBankRouterKt.ManualAddBankRouter(appNavigator, null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$81o1GTbLemBp1xvJC70aE7EGU5w(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$fkq9x_eyka1MGMOLzglCEnLoHLg((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9J2bD3OBEQRrVCWRZgZ1YEW82do(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneySuccessDestination withdrawMoneySuccessDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawMoneySuccessDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(withdrawMoneySuccessDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1979988941, i, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:234)");
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.success.WithdrawMoneySuccessScreenKt.WithdrawMoneySuccessScreen(withdrawMoneySuccessDestination.getAmount(), appNavigator, null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9O8owFylfj5CTwPbFamNhg-gUnk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21235$r8$lambda$9O8owFylfj5CTwPbFamNhggUnk(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9xea7wXFoGzL4CdjHnawJqHZX2Y(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.wallet.api.navigation.result.cards.UpdateCardNavResult(new com.paypal.oslo.feature.wallet.api.navigation.result.cards.UpdateCardNavResult.Outcome.Cancelled(com.paypal.oslo.feature.wallet.api.navigation.result.cards.UpdateCardNavResult.CancellationReason.UserNavigatedBack.INSTANCE)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$A7qioWyMHcSpgUP_tIQXvAym8dA(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$AsGe-VmjOPfLam-3eY4F_sTh_kQ, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel m21236$r8$lambda$AsGeVmjOPfLam3eY4F_sTh_kQ(com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen oBConsentScreen, com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(oBConsentScreen.getAddBankConsentFlowContentId(), oBConsentScreen.getInstantBankConfirmationAggregatorParams());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AzC9nrhwZSuQTUPnQjhr5nX1s60(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BEImWc8EDr0qik_DDdJcHkRyef0(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$A7qioWyMHcSpgUP_tIQXvAym8dA((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BhRSsdADkx1FNUSg6zsH6vwvIrA(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$oJmDyuQUjVw5qrmmqzXljtqr2PY((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$CJ19Cb6rMHM-TSo7ZNfZ2k-Paow, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21237$r8$lambda$CJ19Cb6rMHMTSo7ZNfZ2kPaow(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.api.navigation.AddCardSuccessDestination addCardSuccessDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCardSuccessDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(addCardSuccessDestination) : composer.changedInstance(addCardSuccessDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-281977661, i, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:189)");
            }
            com.paypal.oslo.feature.wallet.cards.ui.add.success.AddCardSuccessScreenKt.AddCardSuccessScreen(appNavigator, addCardSuccessDestination.getAddCardResult(), null, composer, com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.$stable << 3, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$DvCQDqLoZj_S9Dg-f_gn1R-uqqs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21238$r8$lambda$DvCQDqLoZj_S9Dgf_gn1Ruqqs(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankPlaid addBankPlaid, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankPlaid, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(addBankPlaid) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1036039513, i2, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:452)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.di.NavigationModule.m21233$r8$lambda$2q2wctHeXkP4nDoQW9wT_tAqXI(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankPlaid.this, (com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt.LaunchPlaidFlow(appNavigator, (com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Ek_dbVz5cNeeapRovO3p0hipJfM(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FJldqyR5zS77ONZ2pdGJ8oUdxME(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.api.navigation.PartnerInitiatedP3Flow partnerInitiatedP3Flow, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerInitiatedP3Flow, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(partnerInitiatedP3Flow) : composer.changedInstance(partnerInitiatedP3Flow) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1146784264, i, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:885)");
            }
            com.paypal.oslo.feature.wallet.amexandp3.ui.PartnerInitiatedProvisionFlowUiKt.PartnerInitiatedProvisionFlowUi(new com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PartnerInitiated(partnerInitiatedP3Flow.getClientId(), partnerInitiatedP3Flow.getScope(), partnerInitiatedP3Flow.getAuthClaim(), partnerInitiatedP3Flow.getRedirectUri(), partnerInitiatedP3Flow.getState()), appNavigator, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GfhXV07tbQ4vCErOufXs8wrPA0o(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.api.navigation.PayPalInitiatedP3Flow payPalInitiatedP3Flow, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalInitiatedP3Flow, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(payPalInitiatedP3Flow) : composer.changedInstance(payPalInitiatedP3Flow) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-711757465, i, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:858)");
            }
            com.paypal.oslo.feature.wallet.amexandp3.ui.PayPalInitiatedProvisionFlowUiKt.PayPalInitiatedProvisionFlowUi(appNavigator, new com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PayPalInitiated(payPalInitiatedP3Flow.getPartnerName(), payPalInitiatedP3Flow.getAnalyticsContext().getContextId()), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HSMbdc5v29q48zJLVSm9YhcUZuY(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error(str, (java.lang.String) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$IoxOCoiSx0m9E-MyNvQPOcN5cLo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21239$r8$lambda$IoxOCoiSx0m9EMyNvQPOcN5cLo(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda55
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$Ek_dbVz5cNeeapRovO3p0hipJfM((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JUaxpYvV1tbWpRB3hcV8e2ULWSg(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JUz6ouPNG29BY1VG25H_ObN22EQ(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.api.navigation.WalletFeatureRedirectDestination walletFeatureRedirectDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletFeatureRedirectDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-355586941, i, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:839)");
            }
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda76
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.di.NavigationModule.m21252$r8$lambda$sRSZdAvgPdsytGNzfVC_dR7Zmg(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.wallet.common.WalletFeatureRedirectScreenKt.WalletFeatureRedirectScreen((kotlin.jvm.functions.Function0) rememberedValue, null, null, null, composer, 0, 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JtAPHm2tRwIvbTwnXMYrIREgBe8(com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.api.navigation.ConfirmBankDestination confirmBankDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmBankDestination, "");
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(confirmBankDestination) : composer.changedInstance(confirmBankDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1273054692, i2, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:792)");
            }
            if (confirmBankDestination.getConfig().getConfirmFlowType() != com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType.RECONNECT || walletFeatureManager.isObReconnectEnabled()) {
                composer.startReplaceGroup(1012791660);
                com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterScreenKt.InstantBankConfirmationRouterScreen(appNavigator, confirmBankDestination.getConfig(), confirmBankDestination.getAnalyticsContext(), null, null, composer, (com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig.$stable << 3) | (com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext.$stable << 6), 24);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1011385717);
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_bank_info_needs_update, composer, 0);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_reconnect_on_website, composer, 0);
                java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_go_back, composer, 0);
                boolean changed = composer.changed(appNavigator);
                java.lang.Object rememberedValue = composer.rememberedValue();
                final java.lang.String str = "Feature not implemented yet";
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda77
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.di.NavigationModule.m21240$r8$lambda$KyBml4_ehBu_18dH8ri2ZySLc0(com.paypal.oslo.core.navigation.AppNavigator.this, str);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                boolean changed2 = composer.changed(appNavigator);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda82
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.di.NavigationModule.m21253$r8$lambda$zTA1Zkdp8lERzMmI9x4Xua2Mo(com.paypal.oslo.core.navigation.AppNavigator.this, str);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.wallet.banks.common.BankFeatureRedirectScreenKt.BankFeatureRedirectScreen(stringResource, function0, stringResource2, null, null, stringResource3, (kotlin.jvm.functions.Function0) rememberedValue2, composer, 0, 24);
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$JusUIKn0EkCjJvfn_p0Y_ongItQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen oBConsentScreen, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oBConsentScreen, "");
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(oBConsentScreen) : composer.changedInstance(oBConsentScreen) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = true;
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-411279648, i2, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:710)");
            }
            com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount bankAccount = oBConsentScreen.getBankAccount();
            com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig topBarConfig = com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfigKt.getTopBarConfig(oBConsentScreen.getConfig(), null, composer, com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig.$stable, 1);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !composer.changedInstance(oBConsentScreen))) {
                z = false;
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda44
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.di.NavigationModule.m21236$r8$lambda$AsGeVmjOPfLam3eY4F_sTh_kQ(com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen.this, (com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentScreenKt.AddBankConsentScreen(appNavigator, (com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), topBarConfig, bankAccount, null, composer, 0, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexViewModel $r8$lambda$KY6GleQ4FTmL1FCnJ1wm9GTiDsI(com.paypal.oslo.feature.wallet.api.navigation.ManageAmexDestination manageAmexDestination, com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(manageAmexDestination.getAmexPaymentTokenId());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Kja10tcDQ5vSmYy09r77xRhbUDE(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KyBml4_ehB-u_18dH8ri2ZySLc0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21240$r8$lambda$KyBml4_ehBu_18dH8ri2ZySLc0(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$mt6RYlyiSKAkgxHMkY49LIxUEYI(str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$L5m8SiftkLjJ_nZIR0yFLRYfDzY(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneySuccessDestination addMoneySuccessDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addMoneySuccessDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(addMoneySuccessDestination) : composer.changedInstance(addMoneySuccessDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(346377707, i, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:224)");
            }
            com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success.AddMoneySuccessScreenKt.AddMoneySuccessScreen(appNavigator, addMoneySuccessDestination.getAddMoneyConfig(), addMoneySuccessDestination.getAmount(), addMoneySuccessDestination.getAddFundType(), null, null, composer, com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig.$stable << 3, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LGJt3X9NTbHcWRCNPyPc2MOVjyU(com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.api.navigation.UpdateCardDestination updateCardDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateCardDestination, "");
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composer.changed(updateCardDestination) : composer.changedInstance(updateCardDestination) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1849797706, i2, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:528)");
            }
            if (walletFeatureManager.isUpdateCardEnabled()) {
                composer.startReplaceGroup(1402045515);
                com.paypal.oslo.feature.wallet.api.ui.cards.edit.config.UpdateCardConfig config = updateCardDestination.getConfig();
                com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardInfo updateCardInfo = new com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardInfo(config.getCardId(), config.getCardArtUrl(), config.getExpiryMonth(), config.getExpiryYear(), config.getIssuer(), config.getProductName(), config.getLastNChars(), new com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress(config.getAddressId(), config.getAddressLine1(), config.getAddressLine2(), config.getCity(), config.getState(), config.getPostalCode(), config.getCountryCode()), com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.INSTANCE.fromName(config.getCardBrand()));
                boolean changed = composer.changed(appNavigator);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$kvG3E_lEnVuzBGP89bdunmpBahc(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardScreenKt.UpdateCardScreen(updateCardInfo, null, (kotlin.jvm.functions.Function0) rememberedValue, null, composer, com.paypal.oslo.core.commonui.utils.RefText.$stable, 10);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1403731605);
                boolean changed2 = composer.changed(appNavigator);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda20
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$4hH_QMobk5PBwVyrcRDMgbZA32E(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.wallet.common.WalletFeatureRedirectScreenKt.WalletFeatureRedirectScreen((kotlin.jvm.functions.Function0) rememberedValue2, null, null, null, composer, 0, 14);
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

    /* renamed from: $r8$lambda$NsiqcdgcOwN4Z98wwfZXZ-3zszE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21241$r8$lambda$NsiqcdgcOwN4Z98wwfZXZ3zszE(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Nuofz6FMoqho_5ouIuUJdtgSBj8(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination addBankDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(addBankDestination) : composer.changedInstance(addBankDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-813603771, i, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:378)");
            }
            com.paypal.oslo.feature.wallet.banks.ui.router.AddBankRouterScreenKt.AddBankRouterScreen(appNavigator, addBankDestination.getAnalyticsContext(), addBankDestination.getConfig(), null, null, composer, (com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext.$stable << 3) | (com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig.$stable << 6), 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OBDucxjUQm7paYGyxoceBUm5HGU(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.wallet.api.navigation.result.cards.UpdateCardNavResult(new com.paypal.oslo.feature.wallet.api.navigation.result.cards.UpdateCardNavResult.Outcome.Cancelled(com.paypal.oslo.feature.wallet.api.navigation.result.cards.UpdateCardNavResult.CancellationReason.UserNavigatedBack.INSTANCE)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ORin9LoSxHdbqSfu0xOObwLXe7I(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error(str, (java.lang.String) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$P-puOj2evaj7hdH5JEJbFlGS5U0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21242$r8$lambda$PpuOj2evaj7hdH5JEJbFlGS5U0(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.api.navigation.BankOAuthCallbackDestination bankOAuthCallbackDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankOAuthCallbackDestination, "");
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(bankOAuthCallbackDestination) : composer.changedInstance(bankOAuthCallbackDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1885166585, i2, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:777)");
            }
            com.paypal.oslo.feature.wallet.banks.ui.oauthcallback.BankOAuthCallbackScreenKt.BankOAuthCallbackScreen(bankOAuthCallbackDestination.getAggregatorName(), bankOAuthCallbackDestination.getExternalBankId(), bankOAuthCallbackDestination.getCountryCode(), bankOAuthCallbackDestination.getIntegrationType(), bankOAuthCallbackDestination.getBankName(), bankOAuthCallbackDestination.getCode(), bankOAuthCallbackDestination.getError(), appNavigator, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PlEQiDZqmouNzMuUPeyi6f3Bp1o(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents commonComponents, com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneyReview withdrawMoneyReview, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawMoneyReview, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(withdrawMoneyReview) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1556198748, i2, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:261)");
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyReviewConfig config = withdrawMoneyReview.getConfig();
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda78
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$BhRSsdADkx1FNUSg6zsH6vwvIrA(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt.WithdrawMoneyReviewScreen(config, appNavigator, commonComponents, (kotlin.jvm.functions.Function0) rememberedValue, null, null, composer, 0, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$QFH9pmYD4VT2ky-3GAzczW0XFbM, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel m21243$r8$lambda$QFH9pmYD4VT2ky3GAzczW0XFbM(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankFinicity addBankFinicity, com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(addBankFinicity.getAggregatorName(), addBankFinicity.getExternalBankId(), addBankFinicity.getBankName(), addBankFinicity.getCountryCode(), addBankFinicity.getIntegrationType(), addBankFinicity.getBankLogoUrl(), addBankFinicity.getFlow(), addBankFinicity.getAction(), addBankFinicity.getInstrumentId(), addBankFinicity.getBank());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RFxCEI_Xvb8TWGIlJvSeCA6XhRM(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.wallet.ui.Destination.SearchInstitutions searchInstitutions, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchInstitutions, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2001109196, i, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:605)");
            }
            com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsScreenKt.SearchInstitutionsScreen(appNavigator, com.paypal.oslo.api.graphql.schema.type.BankAggregatorName.FINICITY.toString(), null, null, composer, 0, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$R_FX_Nq5G_V3YDeyW21hFNuVkpI(com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.api.navigation.OnlinePaymentDestination onlinePaymentDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onlinePaymentDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(214623899, i, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:273)");
            }
            if (walletFeatureManager.isOnlinePreferencesEnabled()) {
                composer.startReplaceGroup(-1345658542);
                com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentScreenKt.OnlinePaymentScreen(null, null, composer, 0, 3);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1345598247);
                boolean changed = composer.changed(appNavigator);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda21
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$cwgAKFmo0hbxT8yAIbNne_9g2UY(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.wallet.common.WalletFeatureRedirectScreenKt.WalletFeatureRedirectScreen((kotlin.jvm.functions.Function0) rememberedValue, null, null, null, composer, 0, 14);
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$SI6V2binkX00OxFl3PJw4IcN4R4(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.wallet.api.navigation.AddFIFlowDestination(new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.Config((java.lang.String) null, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 63, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$T2oyRxnZDKqmNdnnsWh0WuOtQQo(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult(new com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult.Outcome.Error(str, (java.lang.String) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TcSzt4i2Y81CYEXNY9IkKQbKqpA(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ThquHLchGk9T1nGMaz2-VeFPK3A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21244$r8$lambda$ThquHLchGk9T1nGMaz2VeFPK3A(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency selectedCurrency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedCurrency, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda79
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$zfdsca87OFcf9Pm9lCu2puhxze8(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$W-NjrMcFvrn15Iub8YjclnrFmVg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21245$r8$lambda$WNjrMcFvrn15Iub8YjclnrFmVg(com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.api.navigation.InStorePaymentDestination inStorePaymentDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inStorePaymentDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(856865641, i, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:282)");
            }
            if (walletFeatureManager.isInStorePreferencesEnabled()) {
                composer.startReplaceGroup(1893742019);
                com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStorePaymentScreenKt.InStorePaymentScreen(null, null, composer, 0, 3);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1893803275);
                boolean changed = composer.changed(appNavigator);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda26
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$ZHLq1nZBEIQWMVeU7hyvXMXda8Q(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.wallet.common.WalletFeatureRedirectScreenKt.WalletFeatureRedirectScreen((kotlin.jvm.functions.Function0) rememberedValue, null, null, null, composer, 0, 14);
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$WL98BHlOIB9TJaoc0dpGLe2Bs_4(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.wallet.api.navigation.ManageAmexDestination manageAmexDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageAmexDestination, "");
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(manageAmexDestination) : composer.changedInstance(manageAmexDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = true;
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(191219845, i2, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:846)");
            }
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !composer.changedInstance(manageAmexDestination))) {
                z = false;
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$KY6GleQ4FTmL1FCnJ1wm9GTiDsI(com.paypal.oslo.feature.wallet.api.navigation.ManageAmexDestination.this, (com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexKt.ManageAmexUi(appNavigator, (com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$eIN1xVWGS4vIRu-FwIcOxoA4eik, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21248$r8$lambda$eIN1xVWGS4vIRuFwIcOxoA4eik(android.content.Context context, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents commonComponents, final com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2007228987, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$ekodnZSFSCYXHIDkYbgRTccEvYE(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.api.navigation.AddFIToWalletDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.AddFIToWalletDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.AddFIToWalletDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.AddFIToWalletDestination addFIToWalletDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(addFIToWalletDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.AddFIToWalletDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.api.navigation.AddFIToWalletDestination addFIToWalletDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.wallet.wallet.ui.Destination.EnterCardManually, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> lambda$1545667329$wallet_prodRelease = com.paypal.oslo.feature.wallet.di.ComposableSingletons$NavigationModuleKt.INSTANCE.getLambda$1545667329$wallet_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.ui.Destination.EnterCardManually.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.EnterCardManually, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.EnterCardManually enterCardManually) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(enterCardManually);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.EnterCardManually, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.EnterCardManually enterCardManually) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) lambda$1545667329$wallet_prodRelease);
        final java.util.Map l2Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-281977661, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda45
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.m21237$r8$lambda$CJ19Cb6rMHMTSo7ZNfZ2kPaow(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.api.navigation.AddCardSuccessDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.AddCardSuccessDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.AddCardSuccessDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.AddCardSuccessDestination addCardSuccessDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(addCardSuccessDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.AddCardSuccessDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$6
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.api.navigation.AddCardSuccessDestination addCardSuccessDestination) {
                return l2Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        final java.util.Map l2Metadata$default4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.wallet.wallet.ui.Destination.SharedCardConsent, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m21232getLambda$987361459$wallet_prodRelease = com.paypal.oslo.feature.wallet.di.ComposableSingletons$NavigationModuleKt.INSTANCE.m21232getLambda$987361459$wallet_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.ui.Destination.SharedCardConsent.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.SharedCardConsent, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.SharedCardConsent sharedCardConsent) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(sharedCardConsent);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.SharedCardConsent, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$8
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.SharedCardConsent sharedCardConsent) {
                return l2Metadata$default4;
            }
        }, (kotlin.jvm.functions.Function3) m21232getLambda$987361459$wallet_prodRelease);
        final java.util.Map l2Metadata$default5 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(223843448, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda57
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$_nt2iF96fOscqzH7deV4qUbhl4U(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.api.navigation.AddMoneyDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.AddMoneyDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.AddMoneyDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.AddMoneyDestination addMoneyDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(addMoneyDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.AddMoneyDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$10
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.api.navigation.AddMoneyDestination addMoneyDestination) {
                return l2Metadata$default5;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance3);
        final java.util.Map l2Metadata$default6 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(865415873, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda68
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$keILh5QyYXw4qNu_uVz8c2SdGGw(com.paypal.oslo.core.navigation.AppNavigator.this, commonComponents, (com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneyReviewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneyReviewDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneyReviewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneyReviewDestination addMoneyReviewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(addMoneyReviewDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneyReviewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$12
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneyReviewDestination addMoneyReviewDestination) {
                return l2Metadata$default6;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance4);
        final java.util.Map l2Metadata$default7 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance5 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(346377707, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda69
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$L5m8SiftkLjJ_nZIR0yFLRYfDzY(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneySuccessDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneySuccessDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneySuccessDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$13
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneySuccessDestination addMoneySuccessDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(addMoneySuccessDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneySuccessDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$14
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneySuccessDestination addMoneySuccessDestination) {
                return l2Metadata$default7;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance5);
        final java.util.Map l2Metadata$default8 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1979988941, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda70
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$9J2bD3OBEQRrVCWRZgZ1YEW82do(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneySuccessDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneySuccessDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneySuccessDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneySuccessDestination withdrawMoneySuccessDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(withdrawMoneySuccessDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneySuccessDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$16
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneySuccessDestination withdrawMoneySuccessDestination) {
                return l2Metadata$default8;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance6);
        final java.util.Map bottomSheetMetadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(context.getString(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_transfer_money_currency_selector_title), false, false, false, null, null, null, 118, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance7 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(106227950, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda71
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$Y73nlrq1WLbHGgT3TKsDDtYnDY4(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.wallet.ui.Destination.SelectCurrencyDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.ui.Destination.SelectCurrencyDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.SelectCurrencyDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.SelectCurrencyDestination selectCurrencyDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(selectCurrencyDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.SelectCurrencyDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$18
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.SelectCurrencyDestination selectCurrencyDestination) {
                return bottomSheetMetadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance7);
        final java.util.Map l2Metadata$default9 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance8 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1556198748, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda72
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$PlEQiDZqmouNzMuUPeyi6f3Bp1o(com.paypal.oslo.core.navigation.AppNavigator.this, commonComponents, (com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneyReview) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneyReview.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneyReview, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$19
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneyReview withdrawMoneyReview) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(withdrawMoneyReview);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneyReview, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$20
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.WithdrawMoneyReview withdrawMoneyReview) {
                return l2Metadata$default9;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance8);
        final java.util.Map l2Metadata$default10 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance9 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(214623899, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda73
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$R_FX_Nq5G_V3YDeyW21hFNuVkpI(com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager.this, appNavigator, (com.paypal.oslo.feature.wallet.api.navigation.OnlinePaymentDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.OnlinePaymentDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.OnlinePaymentDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$21
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.OnlinePaymentDestination onlinePaymentDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(onlinePaymentDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.OnlinePaymentDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$22
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.api.navigation.OnlinePaymentDestination onlinePaymentDestination) {
                return l2Metadata$default10;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance9);
        final java.util.Map l2Metadata$default11 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance10 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(856865641, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda74
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.m21245$r8$lambda$WNjrMcFvrn15Iub8YjclnrFmVg(com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager.this, appNavigator, (com.paypal.oslo.feature.wallet.api.navigation.InStorePaymentDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.InStorePaymentDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.InStorePaymentDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$23
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.InStorePaymentDestination inStorePaymentDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(inStorePaymentDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.InStorePaymentDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$24
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.api.navigation.InStorePaymentDestination inStorePaymentDestination) {
                return l2Metadata$default11;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance10);
        final java.util.Map l2Metadata$default12 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.wallet.wallet.ui.Destination.InStoreConfirmation, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m21227getLambda$1565522371$wallet_prodRelease = com.paypal.oslo.feature.wallet.di.ComposableSingletons$NavigationModuleKt.INSTANCE.m21227getLambda$1565522371$wallet_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.ui.Destination.InStoreConfirmation.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.InStoreConfirmation, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$25
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.InStoreConfirmation inStoreConfirmation) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(inStoreConfirmation);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.InStoreConfirmation, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$26
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.InStoreConfirmation inStoreConfirmation) {
                return l2Metadata$default12;
            }
        }, (kotlin.jvm.functions.Function3) m21227getLambda$1565522371$wallet_prodRelease);
        final java.util.Map l2Metadata$default13 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance11 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2139109002, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$b80RxXWfC4CxZdKbrnIGKjhOgOU(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$27
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination addCardFlowDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(addCardFlowDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$28
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination addCardFlowDestination) {
                return l2Metadata$default13;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance11);
        final java.util.Map l2Metadata$default14 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance12 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(767778817, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$znchQyKQvZYaYlAZIpzIcgswLME(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.wallet.ui.Destination.TransferAmountEntry) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.ui.Destination.TransferAmountEntry.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.TransferAmountEntry, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$29
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.TransferAmountEntry transferAmountEntry) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(transferAmountEntry);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.TransferAmountEntry, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$30
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.TransferAmountEntry transferAmountEntry) {
                return l2Metadata$default14;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance12);
        final java.util.Map bottomSheetMetadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(context.getString(com.paypal.oslo.feature.wallet.R.string.feature_wallet_transfer_money), false, false, false, null, null, null, 118, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance13 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(71306947, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.m21250$r8$lambda$rrqfA5fBz8PgXA8yCMzKZ6P2SM(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.api.navigation.WithdrawMoneyDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.WithdrawMoneyDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.WithdrawMoneyDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$31
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.WithdrawMoneyDestination withdrawMoneyDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(withdrawMoneyDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.WithdrawMoneyDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$32
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.api.navigation.WithdrawMoneyDestination withdrawMoneyDestination) {
                return bottomSheetMetadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance13);
        final java.util.Map l2Metadata$default15 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance14 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2147290458, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$oymgaHFyXcH1AyUwglh_wi5WQr8(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.api.navigation.PoolsWithdrawalDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.PoolsWithdrawalDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.PoolsWithdrawalDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$33
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.PoolsWithdrawalDestination poolsWithdrawalDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(poolsWithdrawalDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.PoolsWithdrawalDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$34
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.api.navigation.PoolsWithdrawalDestination poolsWithdrawalDestination) {
                return l2Metadata$default15;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance14);
        final java.util.Map l2Metadata$default16 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(true, null, true, null, null, false, null, null, false, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_X, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyMerchantBrowserDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m21229getLambda$1930798210$wallet_prodRelease = com.paypal.oslo.feature.wallet.di.ComposableSingletons$NavigationModuleKt.INSTANCE.m21229getLambda$1930798210$wallet_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyMerchantBrowserDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyMerchantBrowserDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$35
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyMerchantBrowserDestination thirdPartyLoyaltyMerchantBrowserDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(thirdPartyLoyaltyMerchantBrowserDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyMerchantBrowserDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$36
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyMerchantBrowserDestination thirdPartyLoyaltyMerchantBrowserDestination) {
                return l2Metadata$default16;
            }
        }, (kotlin.jvm.functions.Function3) m21229getLambda$1930798210$wallet_prodRelease);
        final java.util.Map l2Metadata$default17 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(true, java.lang.Integer.valueOf(com.paypal.oslo.feature.wallet.R.string.feature_wallet_loyalty_scan_card_title), true, null, null, false, null, null, false, 504, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyCardScanDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m21228getLambda$158097404$wallet_prodRelease = com.paypal.oslo.feature.wallet.di.ComposableSingletons$NavigationModuleKt.INSTANCE.m21228getLambda$158097404$wallet_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyCardScanDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyCardScanDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$37
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyCardScanDestination thirdPartyLoyaltyCardScanDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(thirdPartyLoyaltyCardScanDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyCardScanDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$38
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyCardScanDestination thirdPartyLoyaltyCardScanDestination) {
                return l2Metadata$default17;
            }
        }, (kotlin.jvm.functions.Function3) m21228getLambda$158097404$wallet_prodRelease);
        final java.util.Map l2Metadata$default18 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(true, java.lang.Integer.valueOf(com.paypal.oslo.feature.wallet.R.string.feature_wallet_loyalty_scan_card_title), true, null, null, false, null, null, false, 504, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyCardManualEntry, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m21230getLambda$474498326$wallet_prodRelease = com.paypal.oslo.feature.wallet.di.ComposableSingletons$NavigationModuleKt.INSTANCE.m21230getLambda$474498326$wallet_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyCardManualEntry.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyCardManualEntry, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$39
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyCardManualEntry thirdPartyLoyaltyCardManualEntry) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(thirdPartyLoyaltyCardManualEntry);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyCardManualEntry, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$40
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyCardManualEntry thirdPartyLoyaltyCardManualEntry) {
                return l2Metadata$default18;
            }
        }, (kotlin.jvm.functions.Function3) m21230getLambda$474498326$wallet_prodRelease);
        final java.util.Map l2Metadata$default19 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(true, null, false, null, null, false, null, null, false, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_X, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyFinishEntry, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m21226getLambda$1373338723$wallet_prodRelease = com.paypal.oslo.feature.wallet.di.ComposableSingletons$NavigationModuleKt.INSTANCE.m21226getLambda$1373338723$wallet_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyFinishEntry.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyFinishEntry, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$41
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyFinishEntry thirdPartyLoyaltyFinishEntry) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(thirdPartyLoyaltyFinishEntry);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyFinishEntry, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$42
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.api.navigation.ThirdPartyLoyaltyFinishEntry thirdPartyLoyaltyFinishEntry) {
                return l2Metadata$default19;
            }
        }, (kotlin.jvm.functions.Function3) m21226getLambda$1373338723$wallet_prodRelease);
        final java.util.Map l2Metadata$default20 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance15 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-813603771, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$Nuofz6FMoqho_5ouIuUJdtgSBj8(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$43
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination addBankDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(addBankDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$44
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination addBankDestination) {
                return l2Metadata$default20;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance15);
        final java.util.Map l2Metadata$default21 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance16 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(894099106, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.m21249$r8$lambda$kG6g4XFiOm6jkZdQbIuIjz0CmE(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.wallet.ui.Destination.NoAuthSecureWebViewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.ui.Destination.NoAuthSecureWebViewDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.NoAuthSecureWebViewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$45
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.NoAuthSecureWebViewDestination noAuthSecureWebViewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(noAuthSecureWebViewDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.NoAuthSecureWebViewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$46
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.NoAuthSecureWebViewDestination noAuthSecureWebViewDestination) {
                return l2Metadata$default21;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance16);
        final java.util.Map l2Metadata$default22 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.wallet.wallet.ui.Destination.ScanCard, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> lambda$591172523$wallet_prodRelease = com.paypal.oslo.feature.wallet.di.ComposableSingletons$NavigationModuleKt.INSTANCE.getLambda$591172523$wallet_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.ui.Destination.ScanCard.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.ScanCard, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$47
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.ScanCard scanCard) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(scanCard);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.ScanCard, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$48
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.ScanCard scanCard) {
                return l2Metadata$default22;
            }
        }, (kotlin.jvm.functions.Function3) lambda$591172523$wallet_prodRelease);
        final java.util.Map l2Metadata$default23 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.wallet.api.navigation.AddFIFlowDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> lambda$705201277$wallet_prodRelease = com.paypal.oslo.feature.wallet.di.ComposableSingletons$NavigationModuleKt.INSTANCE.getLambda$705201277$wallet_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.AddFIFlowDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.AddFIFlowDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$49
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.AddFIFlowDestination addFIFlowDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(addFIFlowDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.AddFIFlowDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$50
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.api.navigation.AddFIFlowDestination addFIFlowDestination) {
                return l2Metadata$default23;
            }
        }, (kotlin.jvm.functions.Function3) lambda$705201277$wallet_prodRelease);
        final java.util.Map l2Metadata$default24 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.wallet.api.navigation.AddFIDeepLink, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m21225getLambda$1089453370$wallet_prodRelease = com.paypal.oslo.feature.wallet.di.ComposableSingletons$NavigationModuleKt.INSTANCE.m21225getLambda$1089453370$wallet_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.AddFIDeepLink.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.AddFIDeepLink, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$51
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.AddFIDeepLink addFIDeepLink) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(addFIDeepLink);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.AddFIDeepLink, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$52
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.api.navigation.AddFIDeepLink addFIDeepLink) {
                return l2Metadata$default24;
            }
        }, (kotlin.jvm.functions.Function3) m21225getLambda$1089453370$wallet_prodRelease);
        final java.util.Map l2Metadata$default25 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankSummaryScreen, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m21231getLambda$967915546$wallet_prodRelease = com.paypal.oslo.feature.wallet.di.ComposableSingletons$NavigationModuleKt.INSTANCE.m21231getLambda$967915546$wallet_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankSummaryScreen.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankSummaryScreen, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$53
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankSummaryScreen addBankSummaryScreen) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(addBankSummaryScreen);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankSummaryScreen, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$54
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankSummaryScreen addBankSummaryScreen) {
                return l2Metadata$default25;
            }
        }, (kotlin.jvm.functions.Function3) m21231getLambda$967915546$wallet_prodRelease);
        final java.util.Map l2Metadata$default26 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance17 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1036039513, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.m21238$r8$lambda$DvCQDqLoZj_S9Dgf_gn1Ruqqs(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankPlaid) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankPlaid.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankPlaid, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$55
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankPlaid addBankPlaid) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(addBankPlaid);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankPlaid, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$56
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankPlaid addBankPlaid) {
                return l2Metadata$default26;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance17);
        final java.util.Map l2Metadata$default27 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance18 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(317215654, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda41
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$1EadrXOl2kNvTQyze0mAFJOndUY(com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager.this, appNavigator, (com.paypal.oslo.feature.wallet.api.navigation.CardDetailDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.CardDetailDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.CardDetailDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$57
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.CardDetailDestination cardDetailDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cardDetailDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.CardDetailDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$58
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.api.navigation.CardDetailDestination cardDetailDestination) {
                return l2Metadata$default27;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance18);
        final java.util.Map l2Metadata$default28 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance19 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(748116791, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$gXOAs47IzJwL2VWVkea7FFOT7tQ(com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager.this, appNavigator, (com.paypal.oslo.feature.wallet.api.navigation.CardDetailDeepLink) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.CardDetailDeepLink.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.CardDetailDeepLink, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$59
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.CardDetailDeepLink cardDetailDeepLink) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(cardDetailDeepLink);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.CardDetailDeepLink, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$60
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.api.navigation.CardDetailDeepLink cardDetailDeepLink) {
                return l2Metadata$default28;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance19);
        final java.util.Map l2Metadata$default29 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance20 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1766780925, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda43
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$zOnqpYt0vFIaUQALrefIf5PCm8U(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.api.navigation.BankConfirmationDeepLink) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.BankConfirmationDeepLink.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.BankConfirmationDeepLink, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$61
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.BankConfirmationDeepLink bankConfirmationDeepLink) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(bankConfirmationDeepLink);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.BankConfirmationDeepLink, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$62
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.api.navigation.BankConfirmationDeepLink bankConfirmationDeepLink) {
                return l2Metadata$default29;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance20);
        final java.util.Map l2Metadata$default30 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance21 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1849797706, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda46
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$LGJt3X9NTbHcWRCNPyPc2MOVjyU(com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager.this, appNavigator, (com.paypal.oslo.feature.wallet.api.navigation.UpdateCardDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.UpdateCardDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.UpdateCardDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$63
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.UpdateCardDestination updateCardDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(updateCardDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.UpdateCardDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$64
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.api.navigation.UpdateCardDestination updateCardDestination) {
                return l2Metadata$default30;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance21);
        final java.util.Map l2Metadata$default31 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance22 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(871321742, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda47
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$YheNoLa5vHofyiTQ6ZnczDUBkz8(com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager.this, appNavigator, (com.paypal.oslo.feature.wallet.api.navigation.BankDetailsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.BankDetailsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.BankDetailsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$65
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.BankDetailsDestination bankDetailsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(bankDetailsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.BankDetailsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$66
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.api.navigation.BankDetailsDestination bankDetailsDestination) {
                return l2Metadata$default31;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance22);
        final java.util.Map l2Metadata$default32 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance23 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-2001109196, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda48
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$RFxCEI_Xvb8TWGIlJvSeCA6XhRM(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.wallet.ui.Destination.SearchInstitutions) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.ui.Destination.SearchInstitutions.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.SearchInstitutions, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$67
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.SearchInstitutions searchInstitutions) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(searchInstitutions);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.SearchInstitutions, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$68
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.SearchInstitutions searchInstitutions) {
                return l2Metadata$default32;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance23);
        final java.util.Map l2Metadata$default33 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance24 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-593264472, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda49
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$jWNc4WHqKTrtVct1xKt51kCnJYE(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankFinicity) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankFinicity.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankFinicity, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$69
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankFinicity addBankFinicity) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(addBankFinicity);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankFinicity, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$70
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankFinicity addBankFinicity) {
                return l2Metadata$default33;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance24);
        final java.util.Map l2Metadata$default34 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance25 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-674224084, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda50
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$y2xPuG4T7w5kerJAFgg0bbMSx98(com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager.this, appNavigator, (com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManual) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManual.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManual, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$71
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManual addBankManual) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(addBankManual);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManual, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$72
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManual addBankManual) {
                return l2Metadata$default34;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance25);
        final java.util.Map l2Metadata$default35 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance26 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-491301768, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda51
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$Xa8HwxTn__4mAE8D3SZhjFzitFA(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManualConfirmation) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManualConfirmation.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManualConfirmation, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$73
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManualConfirmation addBankManualConfirmation) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(addBankManualConfirmation);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManualConfirmation, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$74
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManualConfirmation addBankManualConfirmation) {
                return l2Metadata$default35;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance26);
        final java.util.Map l2Metadata$default36 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance27 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(85601681, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda52
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$3DuqBzEqrl0dcHPw7EwlVyanuqE(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositInstructions) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositInstructions.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositInstructions, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$75
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositInstructions randomDepositInstructions) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(randomDepositInstructions);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositInstructions, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$76
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositInstructions randomDepositInstructions) {
                return l2Metadata$default36;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance27);
        final java.util.Map l2Metadata$default37 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance28 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1982814867, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda53
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$3dznYH_4dtG2_b7uF0z6XdfxfeE(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositsBankConfirmation) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositsBankConfirmation.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositsBankConfirmation, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$77
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositsBankConfirmation randomDepositsBankConfirmation) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(randomDepositsBankConfirmation);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositsBankConfirmation, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$78
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.RandomDepositsBankConfirmation randomDepositsBankConfirmation) {
                return l2Metadata$default37;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance28);
        final java.util.Map l2Metadata$default38 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance29 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-411279648, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda54
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$JusUIKn0EkCjJvfn_p0Y_ongItQ(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$79
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen oBConsentScreen) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(oBConsentScreen);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$80
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen oBConsentScreen) {
                return l2Metadata$default38;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance29);
        final java.util.Map l3Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance30 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(569633270, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda56
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$lABOUIZJ940p11G4POVZ5Nhc8Ig(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.wallet.ui.Destination.ChooseAccounts) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.ui.Destination.ChooseAccounts.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.ChooseAccounts, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$81
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.ChooseAccounts chooseAccounts) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(chooseAccounts);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.ChooseAccounts, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$82
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.ChooseAccounts chooseAccounts) {
                return l3Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance30);
        final java.util.Map l2Metadata$default39 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance31 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1158008757, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda58
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$pO4oGXyBEYUm_gl8HVgHMsyqIAk(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.wallet.ui.Destination.AutoLink) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AutoLink.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.AutoLink, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$83
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AutoLink autoLink) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(autoLink);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.AutoLink, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$84
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AutoLink autoLink) {
                return l2Metadata$default39;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance31);
        final java.util.Map l2Metadata$default40 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance32 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1885166585, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda59
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.m21242$r8$lambda$PpuOj2evaj7hdH5JEJbFlGS5U0(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.api.navigation.BankOAuthCallbackDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.BankOAuthCallbackDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.BankOAuthCallbackDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$85
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.BankOAuthCallbackDestination bankOAuthCallbackDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(bankOAuthCallbackDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.BankOAuthCallbackDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$86
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.api.navigation.BankOAuthCallbackDestination bankOAuthCallbackDestination) {
                return l2Metadata$default40;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance32);
        final java.util.Map l2Metadata$default41 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance33 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1273054692, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda60
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$JtAPHm2tRwIvbTwnXMYrIREgBe8(com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager.this, appNavigator, (com.paypal.oslo.feature.wallet.api.navigation.ConfirmBankDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.ConfirmBankDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.ConfirmBankDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$87
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.ConfirmBankDestination confirmBankDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(confirmBankDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.ConfirmBankDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$88
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.api.navigation.ConfirmBankDestination confirmBankDestination) {
                return l2Metadata$default41;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance33);
        final java.util.Map l2Metadata$default42 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance34 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(368062605, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda61
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.m21234$r8$lambda$7yIk9rN1VUBKBXrXST0F83RkpI(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.wallet.ui.Destination.ManualAddBankRouter) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.ui.Destination.ManualAddBankRouter.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.ManualAddBankRouter, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$89
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.ManualAddBankRouter manualAddBankRouter) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(manualAddBankRouter);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.ManualAddBankRouter, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$90
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.ManualAddBankRouter manualAddBankRouter) {
                return l2Metadata$default42;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance34);
        final java.util.Map l2Metadata$default43 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance35 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-355586941, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda62
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$JUz6ouPNG29BY1VG25H_ObN22EQ(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.api.navigation.WalletFeatureRedirectDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.WalletFeatureRedirectDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.WalletFeatureRedirectDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$91
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.WalletFeatureRedirectDestination walletFeatureRedirectDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(walletFeatureRedirectDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.WalletFeatureRedirectDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$92
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.api.navigation.WalletFeatureRedirectDestination walletFeatureRedirectDestination) {
                return l2Metadata$default43;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance35);
        final java.util.Map l2Metadata$default44 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance36 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(191219845, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda63
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$WL98BHlOIB9TJaoc0dpGLe2Bs_4(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.api.navigation.ManageAmexDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.ManageAmexDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.ManageAmexDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$93
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.ManageAmexDestination manageAmexDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(manageAmexDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.ManageAmexDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$94
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.api.navigation.ManageAmexDestination manageAmexDestination) {
                return l2Metadata$default44;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance36);
        final java.util.Map l2Metadata$default45 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance37 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-711757465, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda64
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$GfhXV07tbQ4vCErOufXs8wrPA0o(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.api.navigation.PayPalInitiatedP3Flow) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.PayPalInitiatedP3Flow.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.PayPalInitiatedP3Flow, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$95
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.PayPalInitiatedP3Flow payPalInitiatedP3Flow) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(payPalInitiatedP3Flow);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.PayPalInitiatedP3Flow, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$96
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.api.navigation.PayPalInitiatedP3Flow payPalInitiatedP3Flow) {
                return l2Metadata$default45;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance37);
        final java.util.Map l2Metadata$default46 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance38 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-85880326, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda65
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$a15KCFVufVMUzNq2shYCxSc4M4Y(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.wallet.ui.Destination.ProvisionInstrumentsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.ui.Destination.ProvisionInstrumentsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.ProvisionInstrumentsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$97
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.ProvisionInstrumentsDestination provisionInstrumentsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(provisionInstrumentsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.wallet.ui.Destination.ProvisionInstrumentsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$98
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.wallet.ui.Destination.ProvisionInstrumentsDestination provisionInstrumentsDestination) {
                return l2Metadata$default46;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance38);
        final java.util.Map l2Metadata$default47 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance39 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1146784264, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda67
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$FJldqyR5zS77ONZ2pdGJ8oUdxME(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.api.navigation.PartnerInitiatedP3Flow) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.PartnerInitiatedP3Flow.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.PartnerInitiatedP3Flow, java.lang.Object>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$99
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.PartnerInitiatedP3Flow partnerInitiatedP3Flow) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(partnerInitiatedP3Flow);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.wallet.api.navigation.PartnerInitiatedP3Flow, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$100
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.wallet.api.navigation.PartnerInitiatedP3Flow partnerInitiatedP3Flow) {
                return l2Metadata$default47;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance39);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_nt2iF96fOscqzH7deV4qUbhl4U(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.api.navigation.AddMoneyDestination addMoneyDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addMoneyDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(addMoneyDestination) : composer.changedInstance(addMoneyDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(223843448, i, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:206)");
            }
            com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt.AmountSelectionScreen(appNavigator, addMoneyDestination.getAddMoneyConfig(), null, composer, com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig.$stable << 3, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$keILh5QyYXw4qNu_uVz8c2SdGGw(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents commonComponents, com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneyReviewDestination addMoneyReviewDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addMoneyReviewDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(865415873, i, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:214)");
        }
        com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewScreenKt.AddMoneyReviewScreen(appNavigator, addMoneyReviewDestination.getAddMoneyConfig(), addMoneyReviewDestination.getAmount(), commonComponents, null, composer, com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig.$stable << 3, 16);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Y73nlrq1WLbHGgT3TKsDDtYnDY4(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.wallet.ui.Destination.SelectCurrencyDestination selectCurrencyDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectCurrencyDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(106227950, i, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:245)");
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig = selectCurrencyDestination.getCurrencySelectorConfig();
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.di.NavigationModule.m21244$r8$lambda$ThquHLchGk9T1nGMaz2VeFPK3A(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.wallet.fifo.common.ui.balance.SelectCurrencyModalKt.SelectCurrencyModal(currencySelectorConfig, (kotlin.jvm.functions.Function1) rememberedValue, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zfdsca87OFcf9Pm9lCu2puhxze8(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency selectedCurrency, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.wallet.wallet.navigation.result.SelectCurrencyNavResult(selectedCurrency));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cwgAKFmo0hbxT8yAIbNne_9g2UY(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda83
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$JUaxpYvV1tbWpRB3hcV8e2ULWSg((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZHLq1nZBEIQWMVeU7hyvXMXda8Q(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$2RuGJvO15IJsZN7VuJFaWu1RAyE((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oJmDyuQUjVw5qrmmqzXljtqr2PY(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$b80RxXWfC4CxZdKbrnIGKjhOgOU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination addCardFlowDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCardFlowDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(addCardFlowDestination) : composer.changedInstance(addCardFlowDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2139109002, i, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:296)");
            }
            com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt.AddCardFlowRouter(appNavigator, addCardFlowDestination.getAnalyticsContext(), addCardFlowDestination.getHeader(), addCardFlowDestination.getAddCardFormConfig(), addCardFlowDestination.getFlowOptions(), null, composer, (com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext.$stable << 3) | (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.$stable << 6) | (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config.$stable << 9) | (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options.$stable << 12), 32);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$sLqstUC4B1-UlnJjh1KvB9t-4Oc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21251$r8$lambda$sLqstUC4B1UlnJjh1KvB9t4Oc(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.m21241$r8$lambda$NsiqcdgcOwN4Z98wwfZXZ3zszE((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$znchQyKQvZYaYlAZIpzIcgswLME(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.wallet.ui.Destination.TransferAmountEntry transferAmountEntry, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferAmountEntry, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(767778817, i, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:307)");
            }
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda75
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.di.NavigationModule.m21251$r8$lambda$sLqstUC4B1UlnJjh1KvB9t4Oc(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryScreenKt.TransferAmountEntryScreen(appNavigator, null, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$rr-qfA5fBz8PgXA8yCMzKZ6P2SM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21250$r8$lambda$rrqfA5fBz8PgXA8yCMzKZ6P2SM(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.api.navigation.WithdrawMoneyDestination withdrawMoneyDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawMoneyDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(71306947, i, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:320)");
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawMoneyModalKt.WithdrawMoneyModal(appNavigator, null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oymgaHFyXcH1AyUwglh_wi5WQr8(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.api.navigation.PoolsWithdrawalDestination poolsWithdrawalDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolsWithdrawalDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(poolsWithdrawalDestination) : composer.changedInstance(poolsWithdrawalDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2147290458, i, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:327)");
            }
            com.paypal.oslo.feature.wallet.fifo.pool.PoolsWithdrawalAmountEntryScreenKt.PoolsWithdrawalAmountEntryScreen(poolsWithdrawalDestination.getPoolsWithdrawalConfig().getMetadataId(), appNavigator, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kG6g4XFiOm6-jkZdQbIuIjz0CmE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21249$r8$lambda$kG6g4XFiOm6jkZdQbIuIjz0CmE(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.wallet.ui.Destination.NoAuthSecureWebViewDestination noAuthSecureWebViewDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(noAuthSecureWebViewDestination, "");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(noAuthSecureWebViewDestination) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(894099106, i2, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:387)");
            }
            composer.startReplaceGroup(235788016);
            java.lang.String url = noAuthSecureWebViewDestination.getUrl();
            if (url.length() == 0) {
                url = androidx.compose.ui.res.StringResources_androidKt.stringResource(noAuthSecureWebViewDestination.getUrlResId(), composer, 0);
            }
            composer.endReplaceGroup();
            com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration = new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest(url, com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET, false, false, null, 24, null), null, null, null, null, null, 125, null);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$0HHvoIRXvv25wASR2zWQdIdHTPI(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.core.webview.ui.compose.SecureWebViewKt.SecureWebView(secureWebViewConfiguration, (kotlin.jvm.functions.Function0) rememberedValue, null, null, composer, com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gXOAs47IzJwL2VWVkea7FFOT7tQ(com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.api.navigation.CardDetailDeepLink cardDetailDeepLink, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetailDeepLink, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(cardDetailDeepLink) : composer.changedInstance(cardDetailDeepLink) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(748116791, i, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:496)");
            }
            if (walletFeatureManager.isCardDetailEnabled()) {
                composer.startReplaceGroup(562105625);
                java.lang.String cardId = cardDetailDeepLink.getCardId();
                java.lang.String str = cardId == null ? "" : cardId;
                boolean changed = composer.changed(appNavigator);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda80
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.di.NavigationModule.m21239$r8$lambda$IoxOCoiSx0m9EMyNvQPOcN5cLo(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailScreenKt.CardDetailScreen(str, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue, null, composer, 0, 46);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(562350091);
                boolean changed2 = composer.changed(appNavigator);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda81
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$81o1GTbLemBp1xvJC70aE7EGU5w(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.wallet.common.WalletFeatureRedirectScreenKt.WalletFeatureRedirectScreen((kotlin.jvm.functions.Function0) rememberedValue2, null, null, null, composer, 0, 14);
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$fkq9x_eyka1MGMOLzglCEnLoHLg(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zOnqpYt0vFIaUQALrefIf5PCm8U(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.api.navigation.BankConfirmationDeepLink bankConfirmationDeepLink, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankConfirmationDeepLink, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(bankConfirmationDeepLink) : composer.changedInstance(bankConfirmationDeepLink) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1766780925, i, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:514)");
            }
            com.paypal.oslo.feature.wallet.banks.ui.deeplink.BankConfirmationDeepLinkHandlerKt.BankConfirmationDeepLinkHandler(bankConfirmationDeepLink, appNavigator, composer, (i & 14) | com.paypal.oslo.feature.wallet.api.navigation.BankConfirmationDeepLink.$stable);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kvG3E_lEnVuzBGP89bdunmpBahc(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$OBDucxjUQm7paYGyxoceBUm5HGU((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YheNoLa5vHofyiTQ6ZnczDUBkz8(com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.api.navigation.BankDetailsDestination bankDetailsDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankDetailsDestination, "");
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(bankDetailsDestination) : composer.changedInstance(bankDetailsDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(871321742, i2, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:588)");
            }
            if (walletFeatureManager.isManageBankEnabled()) {
                composer.startReplaceGroup(-1236239167);
                com.paypal.oslo.feature.wallet.banks.ui.details.BankDetailScreenKt.BankDetailScreen(appNavigator, bankDetailsDestination.getBankInstrumentId(), null, composer, 0, 4);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1236047742);
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_manage_payment_method_on_website, composer, 0);
                boolean changed = composer.changed(appNavigator);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda22
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.di.NavigationModule.m21247$r8$lambda$cBpkjF6NaZntxW3aXxAx7tjajk(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_not_now, composer, 0);
                boolean changed2 = composer.changed(appNavigator);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda33
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$kQdRWAR0rJSp6sO777PRucQeruo(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.wallet.banks.common.BankFeatureRedirectScreenKt.BankFeatureRedirectScreen(stringResource, function0, null, null, null, stringResource2, (kotlin.jvm.functions.Function0) rememberedValue2, composer, 0, 28);
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

    /* renamed from: $r8$lambda$cBpkj-F6NaZntxW3aXxAx7tjajk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21247$r8$lambda$cBpkjF6NaZntxW3aXxAx7tjajk(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$Kja10tcDQ5vSmYy09r77xRhbUDE((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kQdRWAR0rJSp6sO777PRucQeruo(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$AzC9nrhwZSuQTUPnQjhr5nX1s60((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$h8RUAOXKDWiNKhr9AR_j18_kEQ8(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$ORin9LoSxHdbqSfu0xOObwLXe7I(str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bKW6eyW-Wu8SJqrwHPFHjJlfHG4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21246$r8$lambda$bKW6eyWWu8SJqrwHPFHjJlfHG4(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$HSMbdc5v29q48zJLVSm9YhcUZuY(str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$y2xPuG4T7w5kerJAFgg0bbMSx98(com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManual addBankManual, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankManual, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-674224084, i, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:642)");
            }
            if (!walletFeatureManager.isAddBankManualEnabled()) {
                composer.startReplaceGroup(1752522211);
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_enter_bank_info_on_website, composer, 0);
                boolean changed = composer.changed(appNavigator);
                java.lang.Object rememberedValue = composer.rememberedValue();
                final java.lang.String str = "Feature not implemented yet";
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$h8RUAOXKDWiNKhr9AR_j18_kEQ8(com.paypal.oslo.core.navigation.AppNavigator.this, str);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_not_now, composer, 0);
                boolean changed2 = composer.changed(appNavigator);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.di.NavigationModule.m21246$r8$lambda$bKW6eyWWu8SJqrwHPFHjJlfHG4(com.paypal.oslo.core.navigation.AppNavigator.this, str);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.wallet.banks.common.BankFeatureRedirectScreenKt.BankFeatureRedirectScreen(stringResource, function0, null, null, null, stringResource2, (kotlin.jvm.functions.Function0) rememberedValue2, composer, 0, 28);
                composer.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                return kotlin.Unit.INSTANCE;
            }
            composer.startReplaceGroup(1753739798);
            composer.endReplaceGroup();
            com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.AddBankManualInfoRouteKt.AddBankManualInfoRoute(appNavigator, null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Xa8HwxTn__4mAE8D3SZhjFzitFA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManualConfirmation addBankManualConfirmation, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankManualConfirmation, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-491301768, i, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:677)");
        }
        com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.AddBankManualConfirmationRouteKt.AddBankManualConfirmationRoute(appNavigator, addBankManualConfirmation.getBankAccountId(), null, addBankManualConfirmation.getInitialDetails(), null, composer, 0, 20);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lABOUIZJ940p11G4POVZ5Nhc8Ig(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.wallet.ui.Destination.ChooseAccounts chooseAccounts, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chooseAccounts, "");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(chooseAccounts) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(569633270, i2, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:733)");
            }
            com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.ChooseAccountsScreenKt.ChooseAccountsScreen(appNavigator, chooseAccounts.getAggregatorName(), chooseAccounts.getCredentialToken(), chooseAccounts.getExternalBankId(), chooseAccounts.getBankName(), chooseAccounts.getBankLogoUrl(), chooseAccounts.getCountryCode(), chooseAccounts.getIntegrationType(), null, null, composer, 0, com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pO4oGXyBEYUm_gl8HVgHMsyqIAk(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.wallet.ui.Destination.AutoLink autoLink, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoLink, "");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(autoLink) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1158008757, i2, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:753)");
            }
            com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt.AutoLinkScreen(appNavigator, autoLink.getAggregatorName(), autoLink.getExternalBankId(), autoLink.getCountryCode(), com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType.valueOf(autoLink.getIntegrationType()), autoLink.getBankName(), autoLink.getBankLogoUrl(), autoLink.getCredentialToken(), autoLink.getAction(), autoLink.getBank(), autoLink.getInstrumentId(), autoLink.getFlow(), null, null, composer, 0, 0, 12288);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mt6RYlyiSKAkgxHMkY49LIxUEYI(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult(new com.paypal.oslo.feature.wallet.api.navigation.result.banks.ConfirmBankFlowNavResult.Outcome.Error(str, (java.lang.String) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zTA1Zkdp8lER-z-MmI9x4Xua2Mo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21253$r8$lambda$zTA1Zkdp8lERzMmI9x4Xua2Mo(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$T2oyRxnZDKqmNdnnsWh0WuOtQQo(str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aWtHMQaxsDKezcQS7RbHsiYe2Og(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$sRSZdAvgPdsytGNz-fVC_dR7Zmg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21252$r8$lambda$sRSZdAvgPdsytGNzfVC_dR7Zmg(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$aWtHMQaxsDKezcQS7RbHsiYe2Og((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$a15KCFVufVMUzNq2shYCxSc4M4Y(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.wallet.wallet.ui.Destination.ProvisionInstrumentsDestination provisionInstrumentsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisionInstrumentsDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-85880326, i, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:869)");
        }
        java.lang.String requestId = provisionInstrumentsDestination.getRequestId();
        boolean changedInstance = composer.changedInstance(provisionInstrumentsDestination);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$m2tA_DIg3kiAWbcrPV0NO9MFPOI(com.paypal.oslo.feature.wallet.wallet.ui.Destination.ProvisionInstrumentsDestination.this, (com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.Factory) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsUiKt.ProvisionInstruments(requestId, appNavigator, (com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel $r8$lambda$m2tA_DIg3kiAWbcrPV0NO9MFPOI(com.paypal.oslo.feature.wallet.wallet.ui.Destination.ProvisionInstrumentsDestination provisionInstrumentsDestination, com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(provisionInstrumentsDestination.getRequest(), provisionInstrumentsDestination.getRequestId());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ekodnZSFSCYXHIDkYbgRTccEvYE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.api.navigation.AddFIToWalletDestination addFIToWalletDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIToWalletDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2007228987, i, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:170)");
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.di.NavigationModule.$r8$lambda$SI6V2binkX00OxFl3PJw4IcN4R4((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            appNavigator.navigate((kotlin.jvm.functions.Function1) rememberedValue);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jWNc4WHqKTrtVct1xKt51kCnJYE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankFinicity addBankFinicity, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankFinicity, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(addBankFinicity) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-593264472, i2, -1, "com.paypal.oslo.feature.wallet.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:619)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.di.NavigationModule$$ExternalSyntheticLambda66
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.di.NavigationModule.m21243$r8$lambda$QFH9pmYD4VT2ky3GAzczW0XFbM(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankFinicity.this, (com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt.FinicityFlowScreen((com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), appNavigator, null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
