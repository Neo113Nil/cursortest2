package com.paypal.oslo.feature.cryptocurrency.ui.buy.review.mapper;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/mapper/PaymentMethodMapper;", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/formatter/PaymentMethodFormatter;", "formatter", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/formatter/PaymentMethodFormatter;)V", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/funding/FundingSource;", "fundingSources", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/PaymentMethod;", "transform", "(Ljava/util/List;)Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/formatter/PaymentMethodFormatter;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PaymentMethodMapper {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.formatter.PaymentMethodFormatter getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public PaymentMethodMapper(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.formatter.PaymentMethodFormatter paymentMethodFormatter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentMethodFormatter, "");
        this.getHighSpeedVideoFpsRanges = paymentMethodFormatter;
    }

    public final java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod> transform(java.util.List<? extends com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource> fundingSources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSources, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource fundingSource : fundingSources) {
            com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod paymentMethod = null;
            paymentMethod = null;
            if (fundingSource instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Balance) {
                com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Balance balance = (com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Balance) fundingSource;
                java.lang.String id = balance.getId();
                java.lang.String fundingOptionId = balance.getFundingOptionId();
                java.lang.String displayBrand = balance.getInstrumentMetadata().getDisplayBrand();
                java.lang.String str = (displayBrand == null && (displayBrand = balance.getInstrumentMetadata().getDisplayType()) == null) ? "" : displayBrand;
                java.lang.String formatBalanceDetails = this.getHighSpeedVideoFpsRanges.formatBalanceDetails(balance.getAmount());
                com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentArt instrumentArt = balance.getInstrumentMetadata().getInstrumentArt();
                paymentMethod = new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod(id, fundingOptionId, str, formatBalanceDetails, instrumentArt != null ? instrumentArt.getSmallImageUrl() : null, this.getHighSpeedVideoFpsRanges.formatAvailableBalance(balance.getAmount()));
            } else if (fundingSource instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Bank) {
                com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Bank bank = (com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Bank) fundingSource;
                java.lang.String id2 = bank.getId();
                java.lang.String fundingOptionId2 = bank.getFundingOptionId();
                java.lang.String displayBrand2 = bank.getInstrumentMetadata().getDisplayBrand();
                java.lang.String str2 = displayBrand2 == null ? "" : displayBrand2;
                java.lang.String formatBankDetails = this.getHighSpeedVideoFpsRanges.formatBankDetails(bank.getInstrumentMetadata().getDisplayType(), bank.getLastDigits());
                com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentArt instrumentArt2 = bank.getInstrumentMetadata().getInstrumentArt();
                paymentMethod = new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod(id2, fundingOptionId2, str2, formatBankDetails, instrumentArt2 != null ? instrumentArt2.getSmallImageUrl() : null, null, 32, null);
            } else if (!(fundingSource instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Card)) {
                if (!(fundingSource instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.PaymentToken) && !(fundingSource instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Crypto)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            } else {
                com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Card card = (com.paypal.oslo.feature.cryptocurrency.domain.model.funding.FundingSource.Card) fundingSource;
                com.paypal.oslo.feature.cryptocurrency.domain.model.funding.CardIssuer issuer = card.getIssuer();
                java.lang.String issuerProductDescription = issuer != null ? issuer.getIssuerProductDescription() : null;
                if (issuerProductDescription != null && card.getBalance() != null) {
                    java.lang.String id3 = card.getId();
                    java.lang.String fundingOptionId3 = card.getFundingOptionId();
                    java.lang.String formatAvailableBalance = this.getHighSpeedVideoFpsRanges.formatAvailableBalance(card.getBalance());
                    com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentArt instrumentArt3 = card.getInstrumentMetadata().getInstrumentArt();
                    paymentMethod = new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod(id3, fundingOptionId3, issuerProductDescription, formatAvailableBalance, instrumentArt3 != null ? instrumentArt3.getSmallImageUrl() : null, null, 32, null);
                } else {
                    java.lang.String id4 = card.getId();
                    java.lang.String fundingOptionId4 = card.getFundingOptionId();
                    java.lang.String brand = card.getBrand();
                    if (kotlin.text.StringsKt.isBlank(brand) && (brand = card.getInstrumentMetadata().getDisplayBrand()) == null) {
                        brand = "";
                    }
                    java.lang.String str3 = brand;
                    java.lang.String formatCardDetails = this.getHighSpeedVideoFpsRanges.formatCardDetails(card.getType(), card.getLastNChars());
                    com.paypal.oslo.feature.cryptocurrency.domain.model.funding.InstrumentArt instrumentArt4 = card.getInstrumentMetadata().getInstrumentArt();
                    paymentMethod = new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.PaymentMethod(id4, fundingOptionId4, str3, formatCardDetails, instrumentArt4 != null ? instrumentArt4.getSmallImageUrl() : null, null, 32, null);
                }
            }
            if (paymentMethod != null) {
                arrayList.add(paymentMethod);
            }
        }
        return arrayList;
    }
}
