package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\fH\u0000¢\u0006\u0004\b\u0002\u0010\r\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u000eH\u0000¢\u0006\u0004\b\u0002\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditAutopayFragment$FundingInstrument;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/EligiblePaymentInstrument;", "toDomain", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditAutopayFragment$FundingInstrument;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/EligiblePaymentInstrument;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPaymentsFragment$FundingInstrument;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPaymentsFragment$FundingInstrument;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/EligiblePaymentInstrument;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPaymentFundingInstrumentsFragment;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPaymentFundingInstrumentsFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/EligiblePaymentInstrument;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/RepaymentFundingInstrument;", "toRepaymentFundingInstrument", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPaymentsFragment$FundingInstrument;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/RepaymentFundingInstrument;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$FundingInstrument;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$FundingInstrument;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/EligiblePaymentInstrument;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$RevolvingCreditEligiblePaymentFundingInstrument;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$RevolvingCreditEligiblePaymentFundingInstrument;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/EligiblePaymentInstrument;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FundingInstrumentsMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument toDomain(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAutopayFragment.FundingInstrument fundingInstrument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
        return getHighSpeedVideoSizes(fundingInstrument.getRevolvingCreditPaymentFundingInstrumentsFragment());
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument toDomain(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentsFragment.FundingInstrument fundingInstrument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
        return getHighSpeedVideoSizes(fundingInstrument.getRevolvingCreditPaymentFundingInstrumentsFragment());
    }

    private static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentFundingInstrumentsFragment revolvingCreditPaymentFundingInstrumentsFragment) {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment;
        java.lang.Object url;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment2;
        java.lang.Object url2;
        java.lang.String str = null;
        r1 = null;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = null;
        str = null;
        str = null;
        if (revolvingCreditPaymentFundingInstrumentsFragment.getOnRevolvingCreditPaymentFundingInstrumentBalance() != null) {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentFundingInstrumentsFragment.OnRevolvingCreditPaymentFundingInstrumentBalance onRevolvingCreditPaymentFundingInstrumentBalance = revolvingCreditPaymentFundingInstrumentsFragment.getOnRevolvingCreditPaymentFundingInstrumentBalance();
            java.lang.String id = onRevolvingCreditPaymentFundingInstrumentBalance.getId();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentFundingInstrumentsFragment.Art art = onRevolvingCreditPaymentFundingInstrumentBalance.getArt();
            java.lang.String obj = (art == null || (revolvingCreditImageFragment2 = art.getRevolvingCreditImageFragment()) == null || (url2 = revolvingCreditImageFragment2.getUrl()) == null) ? null : url2.toString();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentFundingInstrumentsFragment.Amount amount = onRevolvingCreditPaymentFundingInstrumentBalance.getAmount();
            if (amount != null && (revolvingCreditMoneyFragment = amount.getRevolvingCreditMoneyFragment()) != null) {
                currencyAmount = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment);
            }
            return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance(id, obj, currencyAmount);
        }
        if (revolvingCreditPaymentFundingInstrumentsFragment.getOnRevolvingCreditPaymentFundingInstrumentBank() == null) {
            return null;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentFundingInstrumentsFragment.OnRevolvingCreditPaymentFundingInstrumentBank onRevolvingCreditPaymentFundingInstrumentBank = revolvingCreditPaymentFundingInstrumentsFragment.getOnRevolvingCreditPaymentFundingInstrumentBank();
        java.lang.String id2 = onRevolvingCreditPaymentFundingInstrumentBank.getId();
        java.lang.String name2 = onRevolvingCreditPaymentFundingInstrumentBank.getName();
        com.paypal.oslo.api.graphql.schema.type.BankAccountType type = onRevolvingCreditPaymentFundingInstrumentBank.getType();
        java.lang.String obj2 = type != null ? type.toString() : null;
        java.lang.Object bankLastNChars = onRevolvingCreditPaymentFundingInstrumentBank.getBankLastNChars();
        java.lang.String str2 = bankLastNChars instanceof java.lang.String ? (java.lang.String) bankLastNChars : null;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentFundingInstrumentsFragment.Art1 art2 = onRevolvingCreditPaymentFundingInstrumentBank.getArt();
        if (art2 != null && (revolvingCreditImageFragment = art2.getRevolvingCreditImageFragment()) != null && (url = revolvingCreditImageFragment.getUrl()) != null) {
            str = url.toString();
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank(id2, name2, obj2, str2, str);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentFundingInstrument toRepaymentFundingInstrument(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentsFragment.FundingInstrument fundingInstrument) {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment;
        java.lang.Object url;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment2;
        java.lang.Object url2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentFundingInstrumentsFragment revolvingCreditPaymentFundingInstrumentsFragment = fundingInstrument.getRevolvingCreditPaymentFundingInstrumentsFragment();
        java.lang.String str = null;
        if (revolvingCreditPaymentFundingInstrumentsFragment.getOnRevolvingCreditPaymentFundingInstrumentBalance() != null) {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentPlanInstrumentType repaymentPlanInstrumentType = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentPlanInstrumentType.BALANCE;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentFundingInstrumentsFragment.Art art = revolvingCreditPaymentFundingInstrumentsFragment.getOnRevolvingCreditPaymentFundingInstrumentBalance().getArt();
            return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentFundingInstrument("PayPal Balance", null, repaymentPlanInstrumentType, (art == null || (revolvingCreditImageFragment2 = art.getRevolvingCreditImageFragment()) == null || (url2 = revolvingCreditImageFragment2.getUrl()) == null) ? null : url2.toString());
        }
        if (revolvingCreditPaymentFundingInstrumentsFragment.getOnRevolvingCreditPaymentFundingInstrumentBank() == null) {
            return null;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentFundingInstrumentsFragment.OnRevolvingCreditPaymentFundingInstrumentBank onRevolvingCreditPaymentFundingInstrumentBank = revolvingCreditPaymentFundingInstrumentsFragment.getOnRevolvingCreditPaymentFundingInstrumentBank();
        java.lang.String name2 = onRevolvingCreditPaymentFundingInstrumentBank.getName();
        java.lang.Object bankLastNChars = onRevolvingCreditPaymentFundingInstrumentBank.getBankLastNChars();
        java.lang.String str2 = bankLastNChars instanceof java.lang.String ? (java.lang.String) bankLastNChars : null;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentPlanInstrumentType repaymentPlanInstrumentType2 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentPlanInstrumentType.BANK;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentFundingInstrumentsFragment.Art1 art2 = onRevolvingCreditPaymentFundingInstrumentBank.getArt();
        if (art2 != null && (revolvingCreditImageFragment = art2.getRevolvingCreditImageFragment()) != null && (url = revolvingCreditImageFragment.getUrl()) != null) {
            str = url.toString();
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentFundingInstrument(name2, str2, repaymentPlanInstrumentType2, str);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument toDomain(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.FundingInstrument fundingInstrument) {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment;
        java.lang.Object url;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment2;
        java.lang.Object url2;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment3;
        java.lang.Object url3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
        java.lang.String str = null;
        r1 = null;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = null;
        r1 = null;
        r1 = null;
        java.lang.String str2 = null;
        str = null;
        str = null;
        if (fundingInstrument.getOnRevolvingCreditPaymentFundingInstrumentBalance() != null) {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBalance onRevolvingCreditPaymentFundingInstrumentBalance = fundingInstrument.getOnRevolvingCreditPaymentFundingInstrumentBalance();
            java.lang.String id = onRevolvingCreditPaymentFundingInstrumentBalance.getId();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Art art = onRevolvingCreditPaymentFundingInstrumentBalance.getArt();
            java.lang.String obj = (art == null || (revolvingCreditImageFragment3 = art.getRevolvingCreditImageFragment()) == null || (url3 = revolvingCreditImageFragment3.getUrl()) == null) ? null : url3.toString();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Amount1 amount = onRevolvingCreditPaymentFundingInstrumentBalance.getAmount();
            if (amount != null && (revolvingCreditMoneyFragment = amount.getRevolvingCreditMoneyFragment()) != null) {
                currencyAmount = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment);
            }
            return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance(id, obj, currencyAmount);
        }
        if (fundingInstrument.getOnRevolvingCreditPaymentFundingInstrumentBank() != null) {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.FundingInstrumentBankFields fundingInstrumentBankFields = fundingInstrument.getOnRevolvingCreditPaymentFundingInstrumentBank().getFundingInstrumentBankFields();
            java.lang.String id2 = fundingInstrumentBankFields.getId();
            java.lang.String name2 = fundingInstrumentBankFields.getName();
            java.lang.String valueOf = java.lang.String.valueOf(fundingInstrumentBankFields.getType());
            java.lang.Object bankLastNChars = fundingInstrumentBankFields.getBankLastNChars();
            java.lang.String str3 = bankLastNChars instanceof java.lang.String ? (java.lang.String) bankLastNChars : null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.FundingInstrumentBankFields.Art art2 = fundingInstrumentBankFields.getArt();
            if (art2 != null && (revolvingCreditImageFragment2 = art2.getRevolvingCreditImageFragment()) != null && (url2 = revolvingCreditImageFragment2.getUrl()) != null) {
                str2 = url2.toString();
            }
            return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank(id2, name2, valueOf, str3, str2);
        }
        if (fundingInstrument.getOnRevolvingCreditPaymentFundingInstrumentCard() == null) {
            return null;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.FundingInstrumentCardFields fundingInstrumentCardFields = fundingInstrument.getOnRevolvingCreditPaymentFundingInstrumentCard().getFundingInstrumentCardFields();
        java.lang.String id3 = fundingInstrumentCardFields.getId();
        java.lang.String obj2 = fundingInstrumentCardFields.getProductClass().toString();
        java.lang.Object cardLastNChars = fundingInstrumentCardFields.getCardLastNChars();
        java.lang.String str4 = cardLastNChars instanceof java.lang.String ? (java.lang.String) cardLastNChars : null;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.FundingInstrumentCardFields.Art art3 = fundingInstrumentCardFields.getArt();
        if (art3 != null && (revolvingCreditImageFragment = art3.getRevolvingCreditImageFragment()) != null && (url = revolvingCreditImageFragment.getUrl()) != null) {
            str = url.toString();
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card(id3, obj2, str4, str);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument toDomain(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditEligiblePaymentFundingInstrument revolvingCreditEligiblePaymentFundingInstrument) {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment;
        java.lang.Object url;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment2;
        java.lang.Object url2;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment;
        java.lang.Object url3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditEligiblePaymentFundingInstrument, "");
        java.lang.String str = null;
        r1 = null;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = null;
        r1 = null;
        r1 = null;
        java.lang.String str2 = null;
        str = null;
        str = null;
        if (revolvingCreditEligiblePaymentFundingInstrument.getOnRevolvingCreditPaymentFundingInstrumentBalance() != null) {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBalance1 onRevolvingCreditPaymentFundingInstrumentBalance = revolvingCreditEligiblePaymentFundingInstrument.getOnRevolvingCreditPaymentFundingInstrumentBalance();
            java.lang.String id = onRevolvingCreditPaymentFundingInstrumentBalance.getId();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Art1 art = onRevolvingCreditPaymentFundingInstrumentBalance.getArt();
            java.lang.String obj = (art == null || (url3 = art.getUrl()) == null) ? null : url3.toString();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Amount2 amount = onRevolvingCreditPaymentFundingInstrumentBalance.getAmount();
            if (amount != null && (revolvingCreditMoneyFragment = amount.getRevolvingCreditMoneyFragment()) != null) {
                currencyAmount = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditMoneyFragment);
            }
            return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance(id, obj, currencyAmount);
        }
        if (revolvingCreditEligiblePaymentFundingInstrument.getOnRevolvingCreditPaymentFundingInstrumentBank() != null) {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.FundingInstrumentBankFields fundingInstrumentBankFields = revolvingCreditEligiblePaymentFundingInstrument.getOnRevolvingCreditPaymentFundingInstrumentBank().getFundingInstrumentBankFields();
            java.lang.String id2 = fundingInstrumentBankFields.getId();
            java.lang.String name2 = fundingInstrumentBankFields.getName();
            com.paypal.oslo.api.graphql.schema.type.BankAccountType type = fundingInstrumentBankFields.getType();
            java.lang.String obj2 = type != null ? type.toString() : null;
            java.lang.Object bankLastNChars = fundingInstrumentBankFields.getBankLastNChars();
            java.lang.String str3 = bankLastNChars instanceof java.lang.String ? (java.lang.String) bankLastNChars : null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.FundingInstrumentBankFields.Art art2 = fundingInstrumentBankFields.getArt();
            if (art2 != null && (revolvingCreditImageFragment2 = art2.getRevolvingCreditImageFragment()) != null && (url2 = revolvingCreditImageFragment2.getUrl()) != null) {
                str2 = url2.toString();
            }
            return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank(id2, name2, obj2, str3, str2);
        }
        if (revolvingCreditEligiblePaymentFundingInstrument.getOnRevolvingCreditPaymentFundingInstrumentCard() == null) {
            return null;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.FundingInstrumentCardFields fundingInstrumentCardFields = revolvingCreditEligiblePaymentFundingInstrument.getOnRevolvingCreditPaymentFundingInstrumentCard().getFundingInstrumentCardFields();
        java.lang.String id3 = fundingInstrumentCardFields.getId();
        java.lang.String obj3 = fundingInstrumentCardFields.getProductClass().toString();
        java.lang.Object cardLastNChars = fundingInstrumentCardFields.getCardLastNChars();
        java.lang.String str4 = cardLastNChars instanceof java.lang.String ? (java.lang.String) cardLastNChars : null;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.FundingInstrumentCardFields.Art art3 = fundingInstrumentCardFields.getArt();
        if (art3 != null && (revolvingCreditImageFragment = art3.getRevolvingCreditImageFragment()) != null && (url = revolvingCreditImageFragment.getUrl()) != null) {
            str = url.toString();
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card(id3, obj3, str4, str);
    }
}
