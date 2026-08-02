package com.paypal.oslo.feature.home.data.accountsnapshot;

@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u0000H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016*\u00020\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u00020\u0000H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\u0000H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0015\u0010!\u001a\u0004\u0018\u00010 *\u00020\u0000H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0015\u0010$\u001a\u0004\u0018\u00010#*\u00020\u0000H\u0000¢\u0006\u0004\b$\u0010%\u001a\u0015\u0010'\u001a\u0004\u0018\u00010&*\u00020\u0000H\u0000¢\u0006\u0004\b'\u0010(\u001a\u0015\u0010*\u001a\u0004\u0018\u00010)*\u00020\u0000H\u0000¢\u0006\u0004\b*\u0010+"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;", "Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Balances;", "balance", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Balances;", "Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$Savings;", "savings", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)Lcom/paypal/oslo/feature/home/graphql/fragment/SavingsComponentFragment$Savings;", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment;", "bnpl", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)Lcom/paypal/oslo/feature/home/graphql/fragment/BnplComponentFragment;", "Lcom/paypal/oslo/feature/home/graphql/fragment/BnplEmptyStateComponentFragment;", "bnplEmptyState", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)Lcom/paypal/oslo/feature/home/graphql/fragment/BnplEmptyStateComponentFragment;", "Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$TotalPortfolioValue;", "crypto", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$TotalPortfolioValue;", "Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$Holding;", "pyUsd", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)Lcom/paypal/oslo/feature/home/graphql/fragment/CryptoComponentFragment$Holding;", "Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment$RewardsOverview;", "rewardsOverview", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)Lcom/paypal/oslo/feature/home/graphql/fragment/RewardsComponentFragment$RewardsOverview;", "", "Lcom/paypal/oslo/feature/home/graphql/fragment/DebitInstrumentsComponentFragment$DebitInstrument;", "debitInstruments", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)Ljava/util/List;", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$RevolvingCredit;", "payPalMastercard", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalMasterCardComponentFragment$RevolvingCredit;", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditCardUSCardComponentFragment$RevolvingCredit;", "creditCardUS", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)Lcom/paypal/oslo/feature/home/graphql/fragment/CreditCardUSCardComponentFragment$RevolvingCredit;", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalCreditComponentFragment$RevolvingCredit;", "payPalCredit", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)Lcom/paypal/oslo/feature/home/graphql/fragment/CreditPayPalCreditComponentFragment$RevolvingCredit;", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditEbayMastercardComponentFragment$RevolvingCredit;", "ebayMastercard", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)Lcom/paypal/oslo/feature/home/graphql/fragment/CreditEbayMastercardComponentFragment$RevolvingCredit;", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$RevolvingCredit;", "consumerRewards", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)Lcom/paypal/oslo/feature/home/graphql/fragment/CreditConsumerRewardsComponentFragment$RevolvingCredit;", "Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$RevolvingCredit;", "smartConnect", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)Lcom/paypal/oslo/feature/home/graphql/fragment/CreditSmartConnectComponentFragment$RevolvingCredit;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WalletComponentExtractorKt {
    public static final com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Balances balance(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        java.util.List<com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item> items;
        java.lang.Object obj;
        com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBalanceComponent onBalanceComponent;
        com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment balanceComponentFragment;
        com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Wallet wallet;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.WalletComponents walletComponents = data.getWalletComponents();
        if (walletComponents != null && (items = walletComponents.getItems()) != null) {
            java.util.Iterator<T> it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item) obj).getOnBalanceComponent() != null) {
                    break;
                }
            }
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item item = (com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item) obj;
            if (item != null && (onBalanceComponent = item.getOnBalanceComponent()) != null && (balanceComponentFragment = onBalanceComponent.getBalanceComponentFragment()) != null && (wallet = balanceComponentFragment.getWallet()) != null) {
                return wallet.getBalances();
            }
        }
        return null;
    }

    public static final com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Savings savings(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        java.util.List<com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item> items;
        java.lang.Object obj;
        com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnSavingsComponent onSavingsComponent;
        com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment savingsComponentFragment;
        com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Wallet wallet;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.WalletComponents walletComponents = data.getWalletComponents();
        if (walletComponents != null && (items = walletComponents.getItems()) != null) {
            java.util.Iterator<T> it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item) obj).getOnSavingsComponent() != null) {
                    break;
                }
            }
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item item = (com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item) obj;
            if (item != null && (onSavingsComponent = item.getOnSavingsComponent()) != null && (savingsComponentFragment = onSavingsComponent.getSavingsComponentFragment()) != null && (wallet = savingsComponentFragment.getWallet()) != null) {
                return wallet.getSavings();
            }
        }
        return null;
    }

    public static final com.paypal.oslo.feature.home.graphql.fragment.BnplComponentFragment bnpl(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        java.util.List<com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item> items;
        java.lang.Object obj;
        com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLComponent onBNPLComponent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.WalletComponents walletComponents = data.getWalletComponents();
        if (walletComponents != null && (items = walletComponents.getItems()) != null) {
            java.util.Iterator<T> it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item) obj).getOnBNPLComponent() != null) {
                    break;
                }
            }
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item item = (com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item) obj;
            if (item != null && (onBNPLComponent = item.getOnBNPLComponent()) != null) {
                return onBNPLComponent.getBnplComponentFragment();
            }
        }
        return null;
    }

    public static final com.paypal.oslo.feature.home.graphql.fragment.BnplEmptyStateComponentFragment bnplEmptyState(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        java.util.List<com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item> items;
        java.lang.Object obj;
        com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnBNPLEmptyStateComponent onBNPLEmptyStateComponent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.WalletComponents walletComponents = data.getWalletComponents();
        if (walletComponents != null && (items = walletComponents.getItems()) != null) {
            java.util.Iterator<T> it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item) obj).getOnBNPLEmptyStateComponent() != null) {
                    break;
                }
            }
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item item = (com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item) obj;
            if (item != null && (onBNPLEmptyStateComponent = item.getOnBNPLEmptyStateComponent()) != null) {
                return onBNPLEmptyStateComponent.getBnplEmptyStateComponentFragment();
            }
        }
        return null;
    }

    public static final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.TotalPortfolioValue crypto(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        java.util.List<com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item> items;
        java.lang.Object obj;
        com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCryptoComponent onCryptoComponent;
        com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment cryptoComponentFragment;
        com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Wallet wallet;
        com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.CryptocurrencyHoldings cryptocurrencyHoldings;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.WalletComponents walletComponents = data.getWalletComponents();
        if (walletComponents != null && (items = walletComponents.getItems()) != null) {
            java.util.Iterator<T> it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item) obj).getOnCryptoComponent() != null) {
                    break;
                }
            }
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item item = (com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item) obj;
            if (item != null && (onCryptoComponent = item.getOnCryptoComponent()) != null && (cryptoComponentFragment = onCryptoComponent.getCryptoComponentFragment()) != null && (wallet = cryptoComponentFragment.getWallet()) != null && (cryptocurrencyHoldings = wallet.getCryptocurrencyHoldings()) != null) {
                return cryptocurrencyHoldings.getTotalPortfolioValue();
            }
        }
        return null;
    }

    public static final com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Holding pyUsd(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        java.util.List<com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item> items;
        java.lang.Object obj;
        com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCryptoComponent onCryptoComponent;
        com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment cryptoComponentFragment;
        com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Wallet wallet;
        com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.CryptocurrencyHoldings cryptocurrencyHoldings;
        java.util.List<com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Holding> holdings;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.WalletComponents walletComponents = data.getWalletComponents();
        java.lang.Object obj2 = null;
        if (walletComponents == null || (items = walletComponents.getItems()) == null) {
            return null;
        }
        java.util.Iterator<T> it = items.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item) obj).getOnCryptoComponent() != null) {
                break;
            }
        }
        com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item item = (com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item) obj;
        if (item == null || (onCryptoComponent = item.getOnCryptoComponent()) == null || (cryptoComponentFragment = onCryptoComponent.getCryptoComponentFragment()) == null || (wallet = cryptoComponentFragment.getWallet()) == null || (cryptocurrencyHoldings = wallet.getCryptocurrencyHoldings()) == null || (holdings = cryptocurrencyHoldings.getHoldings()) == null) {
            return null;
        }
        java.util.Iterator<T> it2 = holdings.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next = it2.next();
            com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.AssetQuantity assetQuantity = ((com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Holding) next).getAssetQuantity();
            if ((assetQuantity != null ? assetQuantity.getAssetSymbol() : null) == com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol.PYUSD) {
                obj2 = next;
                break;
            }
        }
        return (com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.Holding) obj2;
    }

    public static final com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.RewardsOverview rewardsOverview(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        java.util.List<com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item> items;
        java.lang.Object obj;
        com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnRewardsComponent onRewardsComponent;
        com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment rewardsComponentFragment;
        com.paypal.oslo.feature.home.graphql.fragment.RewardsComponentFragment.Wallet wallet;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.WalletComponents walletComponents = data.getWalletComponents();
        if (walletComponents != null && (items = walletComponents.getItems()) != null) {
            java.util.Iterator<T> it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item) obj).getOnRewardsComponent() != null) {
                    break;
                }
            }
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item item = (com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item) obj;
            if (item != null && (onRewardsComponent = item.getOnRewardsComponent()) != null && (rewardsComponentFragment = onRewardsComponent.getRewardsComponentFragment()) != null && (wallet = rewardsComponentFragment.getWallet()) != null) {
                return wallet.getRewardsOverview();
            }
        }
        return null;
    }

    public static final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.DebitInstrument> debitInstruments(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        java.util.List<com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item> items;
        java.lang.Object obj;
        com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnDebitInstrumentsComponent onDebitInstrumentsComponent;
        com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment debitInstrumentsComponentFragment;
        com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Wallet wallet;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.WalletComponents walletComponents = data.getWalletComponents();
        if (walletComponents != null && (items = walletComponents.getItems()) != null) {
            java.util.Iterator<T> it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item) obj).getOnDebitInstrumentsComponent() != null) {
                    break;
                }
            }
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item item = (com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item) obj;
            if (item != null && (onDebitInstrumentsComponent = item.getOnDebitInstrumentsComponent()) != null && (debitInstrumentsComponentFragment = onDebitInstrumentsComponent.getDebitInstrumentsComponentFragment()) != null && (wallet = debitInstrumentsComponentFragment.getWallet()) != null) {
                return wallet.getDebitInstruments();
            }
        }
        return null;
    }

    public static final com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.RevolvingCredit payPalMastercard(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        java.util.List<com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item> items;
        java.lang.Object obj;
        com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalMasterCardComponent onCreditPayPalMasterCardComponent;
        com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment creditPayPalMasterCardComponentFragment;
        com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Wallet wallet;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.WalletComponents walletComponents = data.getWalletComponents();
        if (walletComponents != null && (items = walletComponents.getItems()) != null) {
            java.util.Iterator<T> it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item) obj).getOnCreditPayPalMasterCardComponent() != null) {
                    break;
                }
            }
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item item = (com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item) obj;
            if (item != null && (onCreditPayPalMasterCardComponent = item.getOnCreditPayPalMasterCardComponent()) != null && (creditPayPalMasterCardComponentFragment = onCreditPayPalMasterCardComponent.getCreditPayPalMasterCardComponentFragment()) != null && (wallet = creditPayPalMasterCardComponentFragment.getWallet()) != null) {
                return wallet.getRevolvingCredit();
            }
        }
        return null;
    }

    public static final com.paypal.oslo.feature.home.graphql.fragment.CreditCardUSCardComponentFragment.RevolvingCredit creditCardUS(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        java.util.List<com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item> items;
        java.lang.Object obj;
        com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditCardUSCardComponent onCreditCardUSCardComponent;
        com.paypal.oslo.feature.home.graphql.fragment.CreditCardUSCardComponentFragment creditCardUSCardComponentFragment;
        com.paypal.oslo.feature.home.graphql.fragment.CreditCardUSCardComponentFragment.Wallet wallet;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.WalletComponents walletComponents = data.getWalletComponents();
        if (walletComponents != null && (items = walletComponents.getItems()) != null) {
            java.util.Iterator<T> it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item) obj).getOnCreditCardUSCardComponent() != null) {
                    break;
                }
            }
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item item = (com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item) obj;
            if (item != null && (onCreditCardUSCardComponent = item.getOnCreditCardUSCardComponent()) != null && (creditCardUSCardComponentFragment = onCreditCardUSCardComponent.getCreditCardUSCardComponentFragment()) != null && (wallet = creditCardUSCardComponentFragment.getWallet()) != null) {
                return wallet.getRevolvingCredit();
            }
        }
        return null;
    }

    public static final com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalCreditComponentFragment.RevolvingCredit payPalCredit(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        java.util.List<com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item> items;
        java.lang.Object obj;
        com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditPayPalCreditComponent onCreditPayPalCreditComponent;
        com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalCreditComponentFragment creditPayPalCreditComponentFragment;
        com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalCreditComponentFragment.Wallet wallet;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.WalletComponents walletComponents = data.getWalletComponents();
        if (walletComponents != null && (items = walletComponents.getItems()) != null) {
            java.util.Iterator<T> it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item) obj).getOnCreditPayPalCreditComponent() != null) {
                    break;
                }
            }
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item item = (com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item) obj;
            if (item != null && (onCreditPayPalCreditComponent = item.getOnCreditPayPalCreditComponent()) != null && (creditPayPalCreditComponentFragment = onCreditPayPalCreditComponent.getCreditPayPalCreditComponentFragment()) != null && (wallet = creditPayPalCreditComponentFragment.getWallet()) != null) {
                return wallet.getRevolvingCredit();
            }
        }
        return null;
    }

    public static final com.paypal.oslo.feature.home.graphql.fragment.CreditEbayMastercardComponentFragment.RevolvingCredit ebayMastercard(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        java.util.List<com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item> items;
        java.lang.Object obj;
        com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditEbayMastercardComponent onCreditEbayMastercardComponent;
        com.paypal.oslo.feature.home.graphql.fragment.CreditEbayMastercardComponentFragment creditEbayMastercardComponentFragment;
        com.paypal.oslo.feature.home.graphql.fragment.CreditEbayMastercardComponentFragment.Wallet wallet;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.WalletComponents walletComponents = data.getWalletComponents();
        if (walletComponents != null && (items = walletComponents.getItems()) != null) {
            java.util.Iterator<T> it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item) obj).getOnCreditEbayMastercardComponent() != null) {
                    break;
                }
            }
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item item = (com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item) obj;
            if (item != null && (onCreditEbayMastercardComponent = item.getOnCreditEbayMastercardComponent()) != null && (creditEbayMastercardComponentFragment = onCreditEbayMastercardComponent.getCreditEbayMastercardComponentFragment()) != null && (wallet = creditEbayMastercardComponentFragment.getWallet()) != null) {
                return wallet.getRevolvingCredit();
            }
        }
        return null;
    }

    public static final com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.RevolvingCredit consumerRewards(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        java.util.List<com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item> items;
        java.lang.Object obj;
        com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditConsumerRewardsComponent onCreditConsumerRewardsComponent;
        com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment creditConsumerRewardsComponentFragment;
        com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Wallet wallet;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.WalletComponents walletComponents = data.getWalletComponents();
        if (walletComponents != null && (items = walletComponents.getItems()) != null) {
            java.util.Iterator<T> it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item) obj).getOnCreditConsumerRewardsComponent() != null) {
                    break;
                }
            }
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item item = (com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item) obj;
            if (item != null && (onCreditConsumerRewardsComponent = item.getOnCreditConsumerRewardsComponent()) != null && (creditConsumerRewardsComponentFragment = onCreditConsumerRewardsComponent.getCreditConsumerRewardsComponentFragment()) != null && (wallet = creditConsumerRewardsComponentFragment.getWallet()) != null) {
                return wallet.getRevolvingCredit();
            }
        }
        return null;
    }

    public static final com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.RevolvingCredit smartConnect(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        java.util.List<com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item> items;
        java.lang.Object obj;
        com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.OnCreditSmartConnectComponent onCreditSmartConnectComponent;
        com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment creditSmartConnectComponentFragment;
        com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Wallet wallet;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.WalletComponents walletComponents = data.getWalletComponents();
        if (walletComponents != null && (items = walletComponents.getItems()) != null) {
            java.util.Iterator<T> it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item) obj).getOnCreditSmartConnectComponent() != null) {
                    break;
                }
            }
            com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item item = (com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Item) obj;
            if (item != null && (onCreditSmartConnectComponent = item.getOnCreditSmartConnectComponent()) != null && (creditSmartConnectComponentFragment = onCreditSmartConnectComponent.getCreditSmartConnectComponentFragment()) != null && (wallet = creditSmartConnectComponentFragment.getWallet()) != null) {
                return wallet.getRevolvingCredit();
            }
        }
        return null;
    }
}
