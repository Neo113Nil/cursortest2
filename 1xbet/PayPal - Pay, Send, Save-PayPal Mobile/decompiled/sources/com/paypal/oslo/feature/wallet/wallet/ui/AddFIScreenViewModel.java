package com.paypal.oslo.feature.wallet.wallet.ui;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\fJ\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/wallet/wallet/ui/AddFIScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "<init>", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)V", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;", "analyticsContext", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "cardFlowRequestId", "", "navigateToAddCard-hN0UB1M", "(Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;Ljava/lang/String;)V", "navigateToAddCard", "bankFlowRequestId", "navigateToAddBank-hN0UB1M", "navigateToAddBank", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;", "cardResult", "handleCardResult", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;)V", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/banks/AddBankFlowNavResult;", "bankResult", "handleBankResult", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/banks/AddBankFlowNavResult;)V", "Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;", "navAction", "handleNavAction", "(Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;)V", "Lcom/paypal/oslo/feature/wallet/api/ui/fi/add/config/AddFI$Config;", "config", "", "Lcom/paypal/oslo/feature/wallet/wallet/ui/AddFIListItem;", "buildItems", "(Lcom/paypal/oslo/feature/wallet/api/ui/fi/add/config/AddFI$Config;)Ljava/util/List;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AddFIScreenViewModel extends androidx.view.ViewModel {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    public static final int $stable = 8;
    private static final java.util.List<com.paypal.oslo.feature.wallet.wallet.ui.AddFIListItem> getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.wallet.wallet.ui.AddFIListItem[]{new com.paypal.oslo.feature.wallet.wallet.ui.AddFIListItem(com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.FiType.DEBIT_CARD, com.paypal.pds.core.Icon.Card.INSTANCE, new com.paypal.oslo.feature.wallet.wallet.ui.TextSource.Resource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_addfi_debit_card_title), new com.paypal.oslo.feature.wallet.wallet.ui.TextSource.Resource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_addfi_card_description), true), new com.paypal.oslo.feature.wallet.wallet.ui.AddFIListItem(com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.FiType.CARD, com.paypal.pds.core.Icon.Card.INSTANCE, new com.paypal.oslo.feature.wallet.wallet.ui.TextSource.Resource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_addfi_card_title), new com.paypal.oslo.feature.wallet.wallet.ui.TextSource.Resource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_addfi_card_description), true), new com.paypal.oslo.feature.wallet.wallet.ui.AddFIListItem(com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.FiType.CREDIT_CARD, com.paypal.pds.core.Icon.Card.INSTANCE, new com.paypal.oslo.feature.wallet.wallet.ui.TextSource.Resource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_addfi_credit_card_title), new com.paypal.oslo.feature.wallet.wallet.ui.TextSource.Resource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_addfi_card_description), true), new com.paypal.oslo.feature.wallet.wallet.ui.AddFIListItem(com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.FiType.BANK, com.paypal.pds.core.Icon.Bank.INSTANCE, new com.paypal.oslo.feature.wallet.wallet.ui.TextSource.Resource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_banks), new com.paypal.oslo.feature.wallet.wallet.ui.TextSource.Resource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_addfi_bank_description), true), new com.paypal.oslo.feature.wallet.wallet.ui.AddFIListItem(com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.FiType.AMEX_SEND, com.paypal.pds.core.Icon.Bank.INSTANCE, new com.paypal.oslo.feature.wallet.wallet.ui.TextSource.Resource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_addfi_amex_send_title), new com.paypal.oslo.feature.wallet.wallet.ui.TextSource.Resource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_addfi_amex_send_description), true)});

    @javax.inject.Inject
    public AddFIScreenViewModel(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        this.Camera2StreamConfigurationMap = appNavigator;
    }

    /* renamed from: navigateToAddCard-hN0UB1M, reason: not valid java name */
    public final void m21504navigateToAddCardhN0UB1M(final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext analyticsContext, java.lang.String cardFlowRequestId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardFlowRequestId, "");
        this.Camera2StreamConfigurationMap.m11575navigateForResultInternaluBl809w(cardFlowRequestId, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.AddFIScreenViewModel$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.wallet.ui.AddFIScreenViewModel.$r8$lambda$pTCv1yHUqjRAGLrawi7Qve4LhxE(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    /* renamed from: navigateToAddBank-hN0UB1M, reason: not valid java name */
    public final void m21503navigateToAddBankhN0UB1M(final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext analyticsContext, java.lang.String bankFlowRequestId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankFlowRequestId, "");
        this.Camera2StreamConfigurationMap.m11575navigateForResultInternaluBl809w(bankFlowRequestId, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.AddFIScreenViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.wallet.ui.AddFIScreenViewModel.m21498$r8$lambda$0Q1MavbFzi7dOUYopiLv9_2Tuo(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public final void handleCardResult(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult cardResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardResult, "");
        com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome outcome = cardResult.getOutcome();
        if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success) {
            com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success success = (com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success) outcome;
            final com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult addFIFlowNavResult = new com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult(new com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.Outcome.Success(new com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.FinancialInstrument.LinkedCard(success.getCard()), success.getSuccessMessage(), (java.lang.Integer) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.AddFIScreenViewModel$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.wallet.ui.AddFIScreenViewModel.m21500$r8$lambda$Zjp2Cc5_Oj1D2swnJ_M3uwePY(com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Error) {
            final com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult addFIFlowNavResult2 = new com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult(new com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.Outcome.Error(((com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Error) outcome).getErrorMsg()));
            this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.AddFIScreenViewModel$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.wallet.ui.AddFIScreenViewModel.m21501$r8$lambda$_tG9rGZIZOubpecm1VHVR9xsmo(com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else if (!(outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Cancelled)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public final void handleBankResult(com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult bankResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankResult, "");
        com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome outcome = bankResult.getOutcome();
        if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Success) {
            com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Success success = (com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Success) outcome;
            final com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult addFIFlowNavResult = new com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult(new com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.Outcome.Success(new com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.FinancialInstrument.LinkedBanks(success.getLinkedBankAccounts()), success.getSuccessMessage(), success.getToastMessage()));
            this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.AddFIScreenViewModel$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.wallet.ui.AddFIScreenViewModel.$r8$lambda$ZVF2EiasaxjOL_ygbmvLoqk9D6A(com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Error) {
            final com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult addFIFlowNavResult2 = new com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult(new com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.Outcome.Error(((com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Error) outcome).getErrorMessage()));
            this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.AddFIScreenViewModel$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.wallet.ui.AddFIScreenViewModel.m21499$r8$lambda$WYBAYgaKCeHAMSCndBf4veVj8w(com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else if (!(outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Cancelled)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public final void handleNavAction(com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction) {
        final com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.CancellationReason.UserNavigatedBack userNavigatedBack;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navAction, "");
        int i = com.paypal.oslo.feature.wallet.wallet.ui.AddFIScreenViewModel.WhenMappings.$EnumSwitchMapping$0[navAction.ordinal()];
        if (i == 1) {
            userNavigatedBack = com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.CancellationReason.UserNavigatedBack.INSTANCE;
        } else if (i == 2) {
            userNavigatedBack = com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.CancellationReason.UserClosedFlow.INSTANCE;
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            userNavigatedBack = com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.CancellationReason.UserSkippedFlow.INSTANCE;
        }
        this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.wallet.ui.AddFIScreenViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.wallet.ui.AddFIScreenViewModel.m21502$r8$lambda$h8t1n5gBixJkqTRbGySXv637Q(com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.CancellationReason.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.wallet.ui.AddFIListItem> buildItems(com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.Config config) {
        com.paypal.oslo.feature.wallet.wallet.ui.AddFIListItem addFIListItem;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        if (config.getItems().isEmpty()) {
            java.util.List<com.paypal.oslo.feature.wallet.wallet.ui.AddFIListItem> list = getHighSpeedVideoFpsRangesFor;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                com.paypal.oslo.feature.wallet.wallet.ui.AddFIListItem addFIListItem2 = (com.paypal.oslo.feature.wallet.wallet.ui.AddFIListItem) obj;
                if (addFIListItem2.getFiType() == com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.FiType.CARD || addFIListItem2.getFiType() == com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.FiType.BANK) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        java.util.List<com.paypal.oslo.feature.wallet.wallet.ui.AddFIListItem> list2 = getHighSpeedVideoFpsRangesFor;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.paypal.oslo.feature.wallet.wallet.ui.AddFIListItem addFIListItem3 : list2) {
            com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.ItemConfig itemConfig = config.getItems().get(addFIListItem3.getFiType());
            if (itemConfig != null) {
                java.lang.String title = itemConfig.getTitle();
                com.paypal.oslo.feature.wallet.wallet.ui.TextSource plain = title != null ? new com.paypal.oslo.feature.wallet.wallet.ui.TextSource.Plain(title) : addFIListItem3.getTitle();
                java.lang.String description = itemConfig.getDescription();
                addFIListItem = com.paypal.oslo.feature.wallet.wallet.ui.AddFIListItem.copy$default(addFIListItem3, null, null, plain, description != null ? new com.paypal.oslo.feature.wallet.wallet.ui.TextSource.Plain(description) : addFIListItem3.getDescription(), false, 19, null);
            } else {
                addFIListItem = null;
            }
            if (addFIListItem != null) {
                arrayList2.add(addFIListItem);
            }
        }
        return arrayList2;
    }

    /* renamed from: $r8$lambda$0Q1MavbFzi7dO-UYopiLv9_2Tuo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21498$r8$lambda$0Q1MavbFzi7dOUYopiLv9_2Tuo(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        navigationScope.push(new com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination(addFIAnalyticsContext, new com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig(false, false, new com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig((com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress) null, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, 7, defaultConstructorMarker), 2, defaultConstructorMarker)));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$WYBAYgaKCe-HAMSCndBf4veVj8w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21499$r8$lambda$WYBAYgaKCeHAMSCndBf4veVj8w(com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult addFIFlowNavResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(addFIFlowNavResult);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZVF2EiasaxjOL_ygbmvLoqk9D6A(com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult addFIFlowNavResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(addFIFlowNavResult);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Zjp2Cc5_Oj1D2swnJ_M-3uw-ePY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21500$r8$lambda$Zjp2Cc5_Oj1D2swnJ_M3uwePY(com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult addFIFlowNavResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(addFIFlowNavResult);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_tG9rGZIZOubpecm1VHVR9xs-mo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21501$r8$lambda$_tG9rGZIZOubpecm1VHVR9xsmo(com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult addFIFlowNavResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(addFIFlowNavResult);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$h8t1-n5gB-ixJkqTRbGySXv637Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21502$r8$lambda$h8t1n5gBixJkqTRbGySXv637Q(com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.CancellationReason cancellationReason, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult(new com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.Outcome.Cancelled(cancellationReason)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pTCv1yHUqjRAGLrawi7Qve4LhxE(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header header = null;
        com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config config = null;
        navigationScope.push(new com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination(addFIAnalyticsContext, header, config, new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options(false, true, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen.SCANNER, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null), 6, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.BACK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.CLOSE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.SKIP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
