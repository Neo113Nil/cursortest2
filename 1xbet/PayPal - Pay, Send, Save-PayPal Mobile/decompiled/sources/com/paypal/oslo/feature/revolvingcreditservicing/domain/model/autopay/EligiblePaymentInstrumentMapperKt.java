package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/EligiblePaymentInstrument;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;", "toFundingInstrument", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/EligiblePaymentInstrument;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EligiblePaymentInstrumentMapperKt {
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c8, code lost:
    
        if (r9 == null) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument toFundingInstrument(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument eligiblePaymentInstrument) {
        java.lang.Object m23436constructorimpl;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType cardProductType;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType bankAccountType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligiblePaymentInstrument, "");
        if (eligiblePaymentInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank) {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank bank = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank) eligiblePaymentInstrument;
            java.lang.String id = bank.getId();
            java.lang.String str = id == null ? "" : id;
            java.lang.String bankName = bank.getBankName();
            java.lang.String artUrl = bank.getArtUrl();
            java.lang.String str2 = artUrl == null ? "" : artUrl;
            java.lang.String accountType = bank.getAccountType();
            if (accountType != null) {
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    bankAccountType = kotlin.Result.m23436constructorimpl(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.valueOf(accountType));
                } catch (java.lang.Throwable th) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    bankAccountType = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                }
                r2 = kotlin.Result.m23441isFailureimpl(bankAccountType) ? null : bankAccountType;
            }
            return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank(str, str2, bankName, r2, bank.getLastDigits());
        }
        if (eligiblePaymentInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance) {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance balance = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance) eligiblePaymentInstrument;
            java.lang.String id2 = balance.getId();
            if (id2 == null) {
                id2 = "";
            }
            java.lang.String artUrl2 = balance.getArtUrl();
            return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance(id2, artUrl2 != null ? artUrl2 : "", balance.getAmount());
        }
        if (!(eligiblePaymentInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card card = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card) eligiblePaymentInstrument;
        java.lang.String id3 = card.getId();
        java.lang.String str3 = id3 == null ? "" : id3;
        java.lang.String cardType = card.getCardType();
        java.lang.String artUrl3 = card.getArtUrl();
        java.lang.String str4 = artUrl3 == null ? "" : artUrl3;
        java.lang.String lastDigits = card.getLastDigits();
        java.lang.String str5 = lastDigits == null ? "" : lastDigits;
        java.lang.String cardType2 = card.getCardType();
        if (cardType2 != null) {
            try {
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType.valueOf(cardType2));
            } catch (java.lang.Throwable th2) {
                kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th2));
            }
            if (kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl) != null) {
                m23436constructorimpl = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType.UNKNOWN;
            }
            cardProductType = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType) m23436constructorimpl;
        }
        cardProductType = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType.UNKNOWN;
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard(str3, str4, cardType, str5, cardProductType);
    }
}
