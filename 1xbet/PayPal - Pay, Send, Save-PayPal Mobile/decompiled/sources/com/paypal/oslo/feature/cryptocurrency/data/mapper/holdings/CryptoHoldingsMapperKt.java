package com.paypal.oslo.feature.cryptocurrency.data.mapper.holdings;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u0006*\u00060\u0004j\u0002`\u0005H\u0000¢\u0006\u0004\b\u0002\u0010\u0007\u001a\u0019\u0010\t\u001a\u0004\u0018\u00010\b*\u00060\u0004j\u0002`\u0005H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$CryptocurrencyHoldings;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHoldings;", "toDomain", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyHoldingsQuery$CryptocurrencyHoldings;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHoldings;", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGainOrLossStatus;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/type/CryptocurrencyGainOrLossStatus;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoGainOrLossStatus;", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGainOrLossStatus;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoGainOrLossStatus;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoPriceMovementIndicator;", "toDomainPriceMovement", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyGainOrLossStatus;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoPriceMovementIndicator;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoHoldingsMapperKt {
    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings toDomain(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.CryptocurrencyHoldings cryptocurrencyHoldings) {
        java.lang.String str;
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.TotalReturn totalReturn;
        java.lang.Object currencyCode;
        java.lang.String str2;
        java.util.Iterator it;
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.PYUSDRewardHoldings pYUSDRewardHoldings;
        java.lang.String str3;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Payout payout;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPayoutStatus lastPayoutStatus;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Accrued accrued;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity1 assetQuantity;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Accrued accrued2;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity1 assetQuantity2;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.LifetimePayout lifetimePayout;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity assetQuantity3;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.LifetimePayout lifetimePayout2;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantity assetQuantity4;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol2;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus dailyGainOrLossStatus;
        java.lang.Object dailyGainOrLossFiatPercent;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus gainOrLossStatus;
        java.lang.Object gainOrLossPercent;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount1 gainOrLossFiatAmount;
        java.lang.Object currencyCode2;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount1 fiatAmount;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol3;
        java.lang.Object currencyCode3;
        java.lang.String str4 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyHoldings, "");
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalPortfolioValue totalPortfolioValue = cryptocurrencyHoldings.getTotalPortfolioValue();
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalHolding totalHolding = totalPortfolioValue != null ? totalPortfolioValue.getTotalHolding() : null;
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.TotalPortfolioValue totalPortfolioValue2 = cryptocurrencyHoldings.getTotalPortfolioValue();
        com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss gainOrLoss = totalPortfolioValue2 != null ? totalPortfolioValue2.getGainOrLoss() : null;
        java.lang.String value = totalHolding != null ? totalHolding.getValue() : null;
        if (value == null) {
            value = "";
        }
        java.lang.String obj = (totalHolding == null || (currencyCode3 = totalHolding.getCurrencyCode()) == null) ? null : currencyCode3.toString();
        if (obj == null) {
            obj = "";
        }
        java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Holding> holdings = cryptocurrencyHoldings.getHoldings();
        if (holdings != null) {
            java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Holding> list = holdings;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Holding holding = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.Holding) it2.next();
                java.lang.String assetName = holding.getAssetName();
                java.lang.String str5 = assetName == null ? str4 : assetName;
                com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantityTruncated assetQuantityTruncated = holding.getAssetQuantityTruncated();
                java.lang.String name2 = (assetQuantityTruncated == null || (assetSymbol3 = assetQuantityTruncated.getAssetSymbol()) == null) ? null : assetSymbol3.name();
                java.lang.String str6 = name2 == null ? str4 : name2;
                com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetQuantityTruncated assetQuantityTruncated2 = holding.getAssetQuantityTruncated();
                java.lang.String quantity = assetQuantityTruncated2 != null ? assetQuantityTruncated2.getQuantity() : null;
                java.lang.String str7 = quantity == null ? str4 : quantity;
                com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.AssetExchangeRate assetExchangeRate = holding.getAssetExchangeRate();
                java.lang.String value2 = (assetExchangeRate == null || (fiatAmount = assetExchangeRate.getFiatAmount()) == null) ? null : fiatAmount.getValue();
                java.lang.String str8 = value2 == null ? str4 : value2;
                com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount2 fiatAmount2 = holding.getFiatAmount();
                java.lang.String obj2 = (fiatAmount2 == null || (currencyCode2 = fiatAmount2.getCurrencyCode()) == null) ? null : currencyCode2.toString();
                java.lang.String str9 = obj2 == null ? str4 : obj2;
                com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.FiatAmount2 fiatAmount3 = holding.getFiatAmount();
                java.lang.String value3 = fiatAmount3 != null ? fiatAmount3.getValue() : null;
                java.lang.String str10 = value3 == null ? str4 : value3;
                java.lang.Object logoUrl = holding.getLogoUrl();
                java.lang.String obj3 = logoUrl != null ? logoUrl.toString() : null;
                java.lang.String str11 = obj3 == null ? str4 : obj3;
                com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss1 gainOrLoss2 = holding.getGainOrLoss();
                java.lang.String value4 = (gainOrLoss2 == null || (gainOrLossFiatAmount = gainOrLoss2.getGainOrLossFiatAmount()) == null) ? null : gainOrLossFiatAmount.getValue();
                java.lang.String str12 = value4 == null ? str4 : value4;
                com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss1 gainOrLoss3 = holding.getGainOrLoss();
                java.lang.String obj4 = (gainOrLoss3 == null || (gainOrLossPercent = gainOrLoss3.getGainOrLossPercent()) == null) ? null : gainOrLossPercent.toString();
                com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLoss1 gainOrLoss4 = holding.getGainOrLoss();
                com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus domain = (gainOrLoss4 == null || (gainOrLossStatus = gainOrLoss4.getGainOrLossStatus()) == null) ? null : toDomain(gainOrLossStatus);
                com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLoss dailyGainOrLoss = holding.getDailyGainOrLoss();
                java.lang.String obj5 = (dailyGainOrLoss == null || (dailyGainOrLossFiatPercent = dailyGainOrLoss.getDailyGainOrLossFiatPercent()) == null) ? null : dailyGainOrLossFiatPercent.toString();
                java.lang.String str13 = obj5 == null ? str4 : obj5;
                com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.DailyGainOrLoss dailyGainOrLoss2 = holding.getDailyGainOrLoss();
                com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator domainPriceMovement = (dailyGainOrLoss2 == null || (dailyGainOrLossStatus = dailyGainOrLoss2.getDailyGainOrLossStatus()) == null) ? null : toDomainPriceMovement(dailyGainOrLossStatus);
                com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardHolding rewardHolding = holding.getRewardHolding();
                if (rewardHolding != null) {
                    com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardApy rewardApy = rewardHolding.getRewardApy();
                    java.lang.String rate = rewardApy != null ? rewardApy.getRate() : null;
                    if (rate == null) {
                        rate = str4;
                    }
                    com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardApy rewardApy2 = rewardHolding.getRewardApy();
                    java.lang.String name3 = (rewardApy2 == null || (lifetimePayout2 = rewardApy2.getLifetimePayout()) == null || (assetQuantity4 = lifetimePayout2.getAssetQuantity()) == null || (assetSymbol2 = assetQuantity4.getAssetSymbol()) == null) ? null : assetSymbol2.name();
                    if (name3 == null) {
                        name3 = str4;
                    }
                    com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardApy rewardApy3 = rewardHolding.getRewardApy();
                    java.lang.String quantity2 = (rewardApy3 == null || (lifetimePayout = rewardApy3.getLifetimePayout()) == null || (assetQuantity3 = lifetimePayout.getAssetQuantity()) == null) ? null : assetQuantity3.getQuantity();
                    if (quantity2 == null) {
                        str3 = str4;
                        str2 = str3;
                    } else {
                        str2 = str4;
                        str3 = quantity2;
                    }
                    com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.RewardHolding rewardHolding2 = new com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.RewardHolding(name3, str3);
                    com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardApy rewardApy4 = rewardHolding.getRewardApy();
                    java.lang.String name4 = (rewardApy4 == null || (accrued2 = rewardApy4.getAccrued()) == null || (assetQuantity2 = accrued2.getAssetQuantity()) == null || (assetSymbol = assetQuantity2.getAssetSymbol()) == null) ? null : assetSymbol.name();
                    if (name4 == null) {
                        name4 = str2;
                    }
                    com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardApy rewardApy5 = rewardHolding.getRewardApy();
                    java.lang.String quantity3 = (rewardApy5 == null || (accrued = rewardApy5.getAccrued()) == null || (assetQuantity = accrued.getAssetQuantity()) == null) ? null : assetQuantity.getQuantity();
                    it = it2;
                    if (quantity3 == null) {
                        quantity3 = str2;
                    }
                    com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.RewardHolding rewardHolding3 = new com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.RewardHolding(name4, quantity3);
                    com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.RewardApy rewardApy6 = rewardHolding.getRewardApy();
                    pYUSDRewardHoldings = new com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.PYUSDRewardHoldings(rate, rewardHolding2, rewardHolding3, (rewardApy6 == null || (payout = rewardApy6.getPayout()) == null || (lastPayoutStatus = payout.getLastPayoutStatus()) == null) ? null : lastPayoutStatus.name());
                } else {
                    str2 = str4;
                    it = it2;
                    pYUSDRewardHoldings = null;
                }
                arrayList2.add(new com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding(str5, str6, str7, str8, str9, str10, str11, str12, obj4, domain, str13, domainPriceMovement, pYUSDRewardHoldings));
                it2 = it;
                str4 = str2;
            }
            str = str4;
            arrayList = arrayList2;
        } else {
            str = "";
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = kotlin.collections.CollectionsKt.emptyList();
        }
        if (gainOrLoss != null) {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount gainOrLossFiatAmount2 = gainOrLoss.getGainOrLossFiatAmount();
            java.lang.String value5 = gainOrLossFiatAmount2 != null ? gainOrLossFiatAmount2.getValue() : null;
            if (value5 == null) {
                value5 = str;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyHoldingsQuery.GainOrLossFiatAmount gainOrLossFiatAmount3 = gainOrLoss.getGainOrLossFiatAmount();
            java.lang.String obj6 = (gainOrLossFiatAmount3 == null || (currencyCode = gainOrLossFiatAmount3.getCurrencyCode()) == null) ? null : currencyCode.toString();
            if (obj6 == null) {
                obj6 = str;
            }
            java.lang.Object gainOrLossPercent2 = gainOrLoss.getGainOrLossPercent();
            java.lang.String obj7 = gainOrLossPercent2 != null ? gainOrLossPercent2.toString() : null;
            if (obj7 == null) {
                obj7 = str;
            }
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus gainOrLossStatus2 = gainOrLoss.getGainOrLossStatus();
            totalReturn = new com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.TotalReturn(value5, obj6, obj7, gainOrLossStatus2 != null ? toDomain(gainOrLossStatus2) : null);
        } else {
            totalReturn = null;
        }
        return new com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings(value, obj, arrayList, totalReturn);
    }

    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus toDomain(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus cryptocurrencyGainOrLossStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyGainOrLossStatus, "");
        int i = com.paypal.oslo.feature.cryptocurrency.data.mapper.holdings.CryptoHoldingsMapperKt.WhenMappings.$EnumSwitchMapping$0[cryptocurrencyGainOrLossStatus.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus.GAIN;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus.LOSS;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus.CONSTANT;
        }
        if (i == 4) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator toDomainPriceMovement(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus cryptocurrencyGainOrLossStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyGainOrLossStatus, "");
        int i = com.paypal.oslo.feature.cryptocurrency.data.mapper.holdings.CryptoHoldingsMapperKt.WhenMappings.$EnumSwitchMapping$0[cryptocurrencyGainOrLossStatus.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator.UP;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator.DOWN;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator.CONSTANT;
        }
        if (i == 4) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
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
