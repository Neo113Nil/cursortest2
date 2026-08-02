package com.paypal.oslo.feature.wallet.me.data.repository;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0010H\u0000¢\u0006\u0004\b\u000e\u0010\u0011\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnCryptoComponent;", "Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoProduct;", "asProduct", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnCryptoComponent;)Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoProduct;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$CryptocurrencyHoldings;", "Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoOverview;", "asOverview", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$CryptocurrencyHoldings;)Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoOverview;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$Holding;", "Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoHolding;", "asCryptoHolding", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$Holding;)Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoHolding;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$FiatAmount;", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "asMoney", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$FiatAmount;)Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$TotalHolding;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$TotalHolding;)Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGainOrLossStatus;", "Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoGainOrLoss;", "asGainOrLoss", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGainOrLossStatus;)Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoGainOrLoss;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CryptoComponentMapperKtKt {
    public static final com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoProduct asProduct(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.OnCryptoComponent onCryptoComponent) {
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.CryptocurrencyHoldings cryptocurrencyHoldings;
        com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoOverview asOverview;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCryptoComponent, "");
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Wallet5 wallet = onCryptoComponent.getWallet();
        if (wallet == null || (cryptocurrencyHoldings = wallet.getCryptocurrencyHoldings()) == null || (asOverview = asOverview(cryptocurrencyHoldings)) == null) {
            return null;
        }
        return new com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoProduct(true, asOverview);
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoOverview asOverview(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.CryptocurrencyHoldings cryptocurrencyHoldings) {
        com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss cryptoGainOrLoss;
        java.lang.String str;
        java.lang.Object gainOrLossPercent;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus gainOrLossStatus;
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.TotalHolding totalHolding;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyHoldings, "");
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.TotalPortfolioValue totalPortfolioValue = cryptocurrencyHoldings.getTotalPortfolioValue();
        com.paypal.oslo.feature.wallet.common.domain.model.Money asMoney = (totalPortfolioValue == null || (totalHolding = totalPortfolioValue.getTotalHolding()) == null) ? null : asMoney(totalHolding);
        if (cryptocurrencyHoldings.getHoldings() == null || asMoney == null) {
            return null;
        }
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.GainOrLoss gainOrLoss = cryptocurrencyHoldings.getTotalPortfolioValue().getGainOrLoss();
        if (gainOrLoss == null || (gainOrLossStatus = gainOrLoss.getGainOrLossStatus()) == null || (cryptoGainOrLoss = asGainOrLoss(gainOrLossStatus)) == null) {
            cryptoGainOrLoss = com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss.UNKNOWN;
        }
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.GainOrLoss gainOrLoss2 = cryptocurrencyHoldings.getTotalPortfolioValue().getGainOrLoss();
        if (gainOrLoss2 == null || (gainOrLossPercent = gainOrLoss2.getGainOrLossPercent()) == null || (str = gainOrLossPercent.toString()) == null) {
            str = "0";
        }
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Holding> holdings = cryptocurrencyHoldings.getHoldings();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = holdings.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoHolding asCryptoHolding = asCryptoHolding((com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Holding) it.next());
            if (asCryptoHolding != null) {
                arrayList.add(asCryptoHolding);
            }
        }
        return new com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoOverview(asMoney, cryptoGainOrLoss, str, arrayList);
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoHolding asCryptoHolding(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Holding holding) {
        com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss cryptoGainOrLoss;
        java.lang.String str;
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.RewardApy rewardApy;
        java.lang.String rate;
        java.lang.Object dailyGainOrLossFiatPercent;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus dailyGainOrLossStatus;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holding, "");
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.AssetQuantity assetQuantity = holding.getAssetQuantity();
        java.lang.String str2 = null;
        java.lang.String rawValue = (assetQuantity == null || (assetSymbol = assetQuantity.getAssetSymbol()) == null) ? null : assetSymbol.getRawValue();
        if (rawValue == null || holding.getFiatAmount() == null || holding.getAssetName() == null) {
            return null;
        }
        java.lang.String assetName = holding.getAssetName();
        java.lang.String quantity = holding.getAssetQuantity().getQuantity();
        com.paypal.oslo.feature.wallet.common.domain.model.Money asMoney = asMoney(holding.getFiatAmount());
        java.lang.Object logoUrl = holding.getLogoUrl();
        java.lang.String str3 = logoUrl instanceof java.lang.String ? (java.lang.String) logoUrl : null;
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.DailyGainOrLoss dailyGainOrLoss = holding.getDailyGainOrLoss();
        if (dailyGainOrLoss == null || (dailyGainOrLossStatus = dailyGainOrLoss.getDailyGainOrLossStatus()) == null || (cryptoGainOrLoss = asGainOrLoss(dailyGainOrLossStatus)) == null) {
            cryptoGainOrLoss = com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss.UNKNOWN;
        }
        com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss cryptoGainOrLoss2 = cryptoGainOrLoss;
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.DailyGainOrLoss dailyGainOrLoss2 = holding.getDailyGainOrLoss();
        if (dailyGainOrLoss2 == null || (dailyGainOrLossFiatPercent = dailyGainOrLoss2.getDailyGainOrLossFiatPercent()) == null || (str = dailyGainOrLossFiatPercent.toString()) == null) {
            str = "0";
        }
        java.lang.String str4 = str;
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.RewardHolding rewardHolding = holding.getRewardHolding();
        if (rewardHolding != null && (rewardApy = rewardHolding.getRewardApy()) != null && (rate = rewardApy.getRate()) != null) {
            str2 = rate.toString();
        }
        return new com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoHolding(assetName, rawValue, quantity, asMoney, str3, cryptoGainOrLoss2, str4, str2);
    }

    public static final com.paypal.oslo.feature.wallet.common.domain.model.Money asMoney(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.FiatAmount fiatAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiatAmount, "");
        return new com.paypal.oslo.feature.wallet.common.domain.model.Money(fiatAmount.getCurrencyCode().toString(), fiatAmount.getValue());
    }

    public static final com.paypal.oslo.feature.wallet.common.domain.model.Money asMoney(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.TotalHolding totalHolding) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalHolding, "");
        return new com.paypal.oslo.feature.wallet.common.domain.model.Money(totalHolding.getCurrencyCode().toString(), totalHolding.getValue());
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss asGainOrLoss(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus cryptocurrencyGainOrLossStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyGainOrLossStatus, "");
        int i = com.paypal.oslo.feature.wallet.me.data.repository.CryptoComponentMapperKtKt.WhenMappings.$EnumSwitchMapping$0[cryptocurrencyGainOrLossStatus.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss.GAIN;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss.LOSS;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss.NEITHER;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss.UNKNOWN;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus.GAIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus.LOSS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus.NEITHER_GAIN_NOR_LOSS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus.UNKNOWN__.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
