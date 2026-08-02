package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.autopay;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$FundingInstrument;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/EligiblePaymentInstrument;", "toDomain", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$FundingInstrument;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/EligiblePaymentInstrument;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EligibleInstrumentsMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument toDomain(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.FundingInstrument fundingInstrument) {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment2;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
        java.lang.Object obj = null;
        r1 = null;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = null;
        r1 = null;
        java.lang.Object obj2 = null;
        obj = null;
        if (fundingInstrument.getOnRevolvingCreditPaymentFundingInstrumentBalance() != null) {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBalance onRevolvingCreditPaymentFundingInstrumentBalance = fundingInstrument.getOnRevolvingCreditPaymentFundingInstrumentBalance();
            java.lang.String id = onRevolvingCreditPaymentFundingInstrumentBalance.getId();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Art art = onRevolvingCreditPaymentFundingInstrumentBalance.getArt();
            java.lang.String str = (java.lang.String) ((art == null || (revolvingCreditImageFragment3 = art.getRevolvingCreditImageFragment()) == null) ? null : revolvingCreditImageFragment3.getUrl());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Amount1 amount = onRevolvingCreditPaymentFundingInstrumentBalance.getAmount();
            if (amount != null && (revolvingCreditMoneyFragment = amount.getRevolvingCreditMoneyFragment()) != null) {
                currencyAmount = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment);
            }
            return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance(id, str, currencyAmount);
        }
        if (fundingInstrument.getOnRevolvingCreditPaymentFundingInstrumentBank() != null) {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.FundingInstrumentBankFields fundingInstrumentBankFields = fundingInstrument.getOnRevolvingCreditPaymentFundingInstrumentBank().getFundingInstrumentBankFields();
            java.lang.String id2 = fundingInstrumentBankFields.getId();
            java.lang.String name2 = fundingInstrumentBankFields.getName();
            com.paypal.oslo.api.graphql.schema.type.BankAccountType type = fundingInstrumentBankFields.getType();
            java.lang.String obj3 = type != null ? type.toString() : null;
            java.lang.Object bankLastNChars = fundingInstrumentBankFields.getBankLastNChars();
            java.lang.String obj4 = bankLastNChars != null ? bankLastNChars.toString() : null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.FundingInstrumentBankFields.Art art2 = fundingInstrumentBankFields.getArt();
            if (art2 != null && (revolvingCreditImageFragment2 = art2.getRevolvingCreditImageFragment()) != null) {
                obj2 = revolvingCreditImageFragment2.getUrl();
            }
            return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank(id2, name2, obj3, obj4, (java.lang.String) obj2);
        }
        if (fundingInstrument.getOnRevolvingCreditPaymentFundingInstrumentCard() == null) {
            return null;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.FundingInstrumentCardFields fundingInstrumentCardFields = fundingInstrument.getOnRevolvingCreditPaymentFundingInstrumentCard().getFundingInstrumentCardFields();
        java.lang.String id3 = fundingInstrumentCardFields.getId();
        java.lang.String name3 = fundingInstrumentCardFields.getName();
        java.lang.String obj5 = fundingInstrumentCardFields.getCardLastNChars().toString();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.FundingInstrumentCardFields.Art art3 = fundingInstrumentCardFields.getArt();
        if (art3 != null && (revolvingCreditImageFragment = art3.getRevolvingCreditImageFragment()) != null) {
            obj = revolvingCreditImageFragment.getUrl();
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card(id3, name3, obj5, (java.lang.String) obj);
    }
}
