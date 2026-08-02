package com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/CryptoItemFactory;", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/AccountSnapshotItemFactory;", "Lcom/paypal/oslo/feature/home/domain/StringProvider;", "stringProvider", "<init>", "(Lcom/paypal/oslo/feature/home/domain/StringProvider;)V", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "rank", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)I", "Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "createItem", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/home/domain/StringProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CryptoItemFactory implements com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.home.domain.StringProvider getHighSpeedVideoSizes;

    @javax.inject.Inject
    public CryptoItemFactory(com.paypal.oslo.feature.home.domain.StringProvider stringProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringProvider, "");
        this.getHighSpeedVideoSizes = stringProvider;
    }

    @Override // com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory
    public final com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem createItem(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        java.math.BigDecimal bigDecimal;
        java.lang.String str;
        com.paypal.oslo.feature.home.domain.model.FooterColors.Neutral neutral;
        java.lang.Object gainOrLossPercent;
        com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment;
        java.lang.String value;
        java.lang.String str2 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.TotalPortfolioValue crypto = com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.crypto(data);
        if (crypto != null) {
            if (crypto.getSellableHolding() == null) {
                crypto = null;
            }
            if (crypto != null) {
                com.paypal.oslo.feature.home.api.AccountSnapshotType.Crypto crypto2 = com.paypal.oslo.feature.home.api.AccountSnapshotType.Crypto.INSTANCE;
                com.paypal.oslo.feature.home.domain.model.BackgroundColors.Default r5 = com.paypal.oslo.feature.home.domain.model.BackgroundColors.Default.INSTANCE;
                java.lang.String cryptoProductName = this.getHighSpeedVideoSizes.getCryptoProductName();
                com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.SellableHolding sellableHolding = crypto.getSellableHolding();
                if (sellableHolding == null || (moneyFragment = sellableHolding.getMoneyFragment()) == null || (value = moneyFragment.getValue()) == null || (bigDecimal = kotlin.text.StringsKt.toBigDecimalOrNull(value)) == null) {
                    bigDecimal = java.math.BigDecimal.ZERO;
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimal);
                java.lang.String formatAmount = com.paypal.oslo.feature.home.data.accountsnapshot.MoneyUtilsKt.formatAmount(bigDecimal);
                java.lang.String availableValue = this.getHighSpeedVideoSizes.getAvailableValue();
                com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLoss gainOrLoss = crypto.getGainOrLoss();
                java.lang.String obj = (gainOrLoss == null || (gainOrLossPercent = gainOrLoss.getGainOrLossPercent()) == null) ? null : gainOrLossPercent.toString();
                com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLoss gainOrLoss2 = crypto.getGainOrLoss();
                com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus gainOrLossStatus = gainOrLoss2 != null ? gainOrLoss2.getGainOrLossStatus() : null;
                if (obj == null || gainOrLossStatus == null) {
                    str = null;
                } else {
                    int i = com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.CryptoItemFactory.WhenMappings.$EnumSwitchMapping$0[gainOrLossStatus.ordinal()];
                    if (i == 1) {
                        str2 = "↑ ";
                    } else if (i == 2) {
                        str2 = "↓ ";
                    } else if (i != 3 && i != 4) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.home.domain.StringProvider stringProvider = this.getHighSpeedVideoSizes;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(str2);
                    sb.append(obj);
                    sb.append("%");
                    str = stringProvider.getTotalReturn(sb.toString());
                }
                com.paypal.oslo.feature.home.graphql.fragment.CryptoComponentFragment.GainOrLoss gainOrLoss3 = crypto.getGainOrLoss();
                com.paypal.oslo.api.graphql.schema.type.CryptocurrencyGainOrLossStatus gainOrLossStatus2 = gainOrLoss3 != null ? gainOrLoss3.getGainOrLossStatus() : null;
                int i2 = gainOrLossStatus2 == null ? -1 : com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.CryptoItemFactory.WhenMappings.$EnumSwitchMapping$0[gainOrLossStatus2.ordinal()];
                if (i2 != -1) {
                    if (i2 == 1) {
                        neutral = com.paypal.oslo.feature.home.domain.model.FooterColors.Positive.INSTANCE;
                    } else if (i2 == 2) {
                        neutral = com.paypal.oslo.feature.home.domain.model.FooterColors.Warning.INSTANCE;
                    } else if (i2 != 3 && i2 != 4) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    return new com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem("crypto", crypto2, r5, cryptoProductName, null, formatAmount, null, availableValue, str, neutral, null, null, kotlin.collections.CollectionsKt.listOf("https://www.paypalobjects.com/home-nav/Crypto-4xCard.png"), kotlin.collections.CollectionsKt.emptyList(), null, 16448, null);
                }
                neutral = com.paypal.oslo.feature.home.domain.model.FooterColors.Neutral.INSTANCE;
                return new com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem("crypto", crypto2, r5, cryptoProductName, null, formatAmount, null, availableValue, str, neutral, null, null, kotlin.collections.CollectionsKt.listOf("https://www.paypalobjects.com/home-nav/Crypto-4xCard.png"), kotlin.collections.CollectionsKt.emptyList(), null, 16448, null);
            }
        }
        return null;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
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

    @Override // com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory
    public final int rank(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return 5;
    }
}
