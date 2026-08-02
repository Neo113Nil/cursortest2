package com.paypal.oslo.feature.cryptocurrency.ui.sell.review.mapper;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u0004\u0018\u00010\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u0004\u0018\u00010\t*\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/mapper/CryptoSellPaymentOptionMapper;", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;", "cryptoPriceFormatter", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;)V", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingSource;", "fundingSources", "Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellPaymentOption;", "transform", "(Ljava/util/List;)Ljava/util/List;", "", "hasBothBalanceAndPyusd", "(Ljava/util/List;)Z", "getBalanceOption", "(Ljava/util/List;)Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellPaymentOption;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingSource;)Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellPaymentOption;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoSellPaymentOptionMapper {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public CryptoSellPaymentOptionMapper(com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoPriceFormatter, "");
        this.getHighSpeedVideoFpsRangesFor = cryptoPriceFormatter;
    }

    public final java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption> transform(java.util.List<? extends com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource> fundingSources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSources, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = fundingSources.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource) it.next());
            if (highResolutionOutputSizeshNQ4ISI != null) {
                arrayList.add(highResolutionOutputSizeshNQ4ISI);
            }
        }
        return arrayList;
    }

    public final boolean hasBothBalanceAndPyusd(java.util.List<? extends com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource> fundingSources) {
        boolean z;
        boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSources, "");
        java.util.List<? extends com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource> list = fundingSources;
        boolean z3 = list instanceof java.util.Collection;
        if (!z3 || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource) it.next()) instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Balance) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z3 || !list.isEmpty()) {
            for (com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource fundingSource : list) {
                if ((fundingSource instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Crypto) && kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Crypto) fundingSource).getAssetSymbol(), "PYUSD")) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        return z && z2;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption getBalanceOption(java.util.List<? extends com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource> fundingSources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSources, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : fundingSources) {
            if (obj instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Balance) {
                arrayList.add(obj);
            }
        }
        com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Balance balance = (com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Balance) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList);
        if (balance != null) {
            return getHighResolutionOutputSizeshNQ4ISI(balance);
        }
        return null;
    }

    private final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource fundingSource) {
        if (fundingSource instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Balance) {
            com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Balance balance = (com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Balance) fundingSource;
            java.lang.String id = balance.getId();
            java.lang.String fundingOptionId = balance.getFundingOptionId();
            com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType cryptoSellPaymentOptionType = com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType.BALANCE;
            int i = com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_payment_balance_display_name;
            com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter = this.getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money amount = balance.getAmount();
            java.lang.String value = amount != null ? amount.getValue() : null;
            if (value == null) {
                value = "";
            }
            com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money amount2 = balance.getAmount();
            java.lang.String currencyCode = amount2 != null ? amount2.getCurrencyCode() : null;
            if (currencyCode == null) {
                currencyCode = "";
            }
            java.lang.String formatPrice$default = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(cryptoPriceFormatter, value, currencyCode, null, false, false, 28, null);
            com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentArt instrumentArt = balance.getInstrumentMetadata().getInstrumentArt();
            return new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption(id, fundingOptionId, cryptoSellPaymentOptionType, i, formatPrice$default, instrumentArt != null ? instrumentArt.getSmallImageUrl() : null);
        }
        if (fundingSource instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Crypto) {
            com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Crypto crypto = (com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Crypto) fundingSource;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(crypto.getAssetSymbol(), "PYUSD")) {
                return null;
            }
            java.lang.String id2 = crypto.getId();
            java.lang.String fundingOptionId2 = crypto.getFundingOptionId();
            com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType cryptoSellPaymentOptionType2 = com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType.PYUSD;
            int i2 = com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_sell_payment_pyusd_display_name;
            com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentArt instrumentArt2 = crypto.getInstrumentMetadata().getInstrumentArt();
            return new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOption(id2, fundingOptionId2, cryptoSellPaymentOptionType2, i2, "", instrumentArt2 != null ? instrumentArt2.getSmallImageUrl() : null);
        }
        if ((fundingSource instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Bank) || (fundingSource instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Card) || (fundingSource instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.PaymentToken)) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
