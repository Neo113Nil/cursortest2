package com.paypal.oslo.feature.wallet.common.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"getTopBarConfig", "Lcom/paypal/oslo/feature/wallet/common/ui/WalletTopBarConfig;", "Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/AddBankConfig;", "bankSharedViewModel", "Lcom/paypal/oslo/feature/wallet/banks/ui/BankSharedViewModel;", "(Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/AddBankConfig;Lcom/paypal/oslo/feature/wallet/banks/ui/BankSharedViewModel;Landroidx/compose/runtime/Composer;II)Lcom/paypal/oslo/feature/wallet/common/ui/WalletTopBarConfig;", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WalletTopBarConfigKt {
    public static final com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig getTopBarConfig(com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig addBankConfig, com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, androidx.compose.runtime.Composer composer, int i, int i2) {
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> topBarElement;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankConfig, "");
        if ((i2 & 1) != 0) {
            java.lang.Object consume = composer.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
            kotlin.jvm.internal.Intrinsics.checkNotNull(consume, "");
            androidx.view.ViewModelStoreOwner viewModelStoreOwner = (androidx.view.ViewModelStoreOwner) consume;
            androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(viewModelStoreOwner, composer, 0);
            if (viewModelStoreOwner instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                empty = ((androidx.view.HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras();
            } else {
                empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
            }
            bankSharedViewModel = (com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.class), viewModelStoreOwner, (java.lang.String) null, createHiltViewModelFactory, empty, composer, 0, 0);
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-443415225, i, -1, "com.paypal.oslo.feature.wallet.common.ui.getTopBarConfig (WalletTopBarConfig.kt:60)");
        }
        com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig topBarConfig = addBankConfig.getTopBarConfig();
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = null;
        com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction startNavAction = topBarConfig != null ? topBarConfig.getStartNavAction() : null;
        if (startNavAction == null) {
            composer.startReplaceGroup(1536686614);
            composer.endReplaceGroup();
            topBarElement = null;
        } else {
            composer.startReplaceGroup(-920260789);
            topBarElement = com.paypal.oslo.feature.wallet.common.ui.WalletTopBarKt.toTopBarElement(startNavAction, bankSharedViewModel, composer, i & 112, 0);
            composer.endReplaceGroup();
        }
        com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig topBarConfig2 = addBankConfig.getTopBarConfig();
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> walletTopBarProgress = com.paypal.oslo.feature.wallet.common.ui.WalletTopBarKt.toWalletTopBarProgress(topBarConfig2 != null ? topBarConfig2.getProgress() : null, composer, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.$stable);
        com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig topBarConfig3 = addBankConfig.getTopBarConfig();
        com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction endNavAction = topBarConfig3 != null ? topBarConfig3.getEndNavAction() : null;
        if (endNavAction == null) {
            composer.startReplaceGroup(1536842358);
        } else {
            composer.startReplaceGroup(-920255765);
            function2 = com.paypal.oslo.feature.wallet.common.ui.WalletTopBarKt.toTopBarElement(endNavAction, bankSharedViewModel, composer, i & 112, 0);
        }
        composer.endReplaceGroup();
        com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig walletTopBarConfig = new com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig(topBarElement, walletTopBarProgress, function2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return walletTopBarConfig;
    }
}
