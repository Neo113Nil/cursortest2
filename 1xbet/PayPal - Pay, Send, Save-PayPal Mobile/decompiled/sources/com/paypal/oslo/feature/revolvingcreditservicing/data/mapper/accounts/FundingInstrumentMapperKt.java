package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditPaymentOptionsOverviewQuery$RevolvingCreditEligiblePaymentFundingInstrument;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;", "toDomain", "(Ljava/util/List;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FundingInstrumentMapperKt {
    public static final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> toDomain(java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditEligiblePaymentFundingInstrument> list) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance fundingInstrumentBalance;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank fundingInstrumentBank;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment;
        java.lang.Object url;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment2;
        java.lang.Object url2;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment revolvingCreditMoneyFragment;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment3;
        java.lang.Object url3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.RevolvingCreditEligiblePaymentFundingInstrument revolvingCreditEligiblePaymentFundingInstrument : list) {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument[] fundingInstrumentArr = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument[3];
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBalance onRevolvingCreditPaymentFundingInstrumentBalance = revolvingCreditEligiblePaymentFundingInstrument.getOnRevolvingCreditPaymentFundingInstrumentBalance();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard fundingInstrumentCard = null;
            r4 = null;
            r4 = null;
            java.lang.String str = null;
            if (onRevolvingCreditPaymentFundingInstrumentBalance != null) {
                java.lang.String id = onRevolvingCreditPaymentFundingInstrumentBalance.getId();
                com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art art = onRevolvingCreditPaymentFundingInstrumentBalance.getArt();
                java.lang.String obj = (art == null || (revolvingCreditImageFragment3 = art.getRevolvingCreditImageFragment()) == null || (url3 = revolvingCreditImageFragment3.getUrl()) == null) ? null : url3.toString();
                com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Amount1 amount = onRevolvingCreditPaymentFundingInstrumentBalance.getAmount();
                fundingInstrumentBalance = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance(id, obj, (amount == null || (revolvingCreditMoneyFragment = amount.getRevolvingCreditMoneyFragment()) == null) ? null : new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount(revolvingCreditMoneyFragment.getCurrencyCode().toString(), revolvingCreditMoneyFragment.getValue()));
            } else {
                fundingInstrumentBalance = null;
            }
            fundingInstrumentArr[0] = fundingInstrumentBalance;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBank onRevolvingCreditPaymentFundingInstrumentBank = revolvingCreditEligiblePaymentFundingInstrument.getOnRevolvingCreditPaymentFundingInstrumentBank();
            if (onRevolvingCreditPaymentFundingInstrumentBank != null) {
                java.lang.String id2 = onRevolvingCreditPaymentFundingInstrumentBank.getId();
                com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art1 art2 = onRevolvingCreditPaymentFundingInstrumentBank.getArt();
                java.lang.String obj2 = (art2 == null || (revolvingCreditImageFragment2 = art2.getRevolvingCreditImageFragment()) == null || (url2 = revolvingCreditImageFragment2.getUrl()) == null) ? null : url2.toString();
                java.lang.String name2 = onRevolvingCreditPaymentFundingInstrumentBank.getName();
                java.lang.Object bankLastNChars = onRevolvingCreditPaymentFundingInstrumentBank.getBankLastNChars();
                java.lang.String obj3 = bankLastNChars != null ? bankLastNChars.toString() : null;
                com.paypal.oslo.api.graphql.schema.type.BankAccountType type = onRevolvingCreditPaymentFundingInstrumentBank.getType();
                fundingInstrumentBank = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank(id2, obj2, name2, type != null ? com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.INSTANCE.from(type.name()) : null, obj3);
            } else {
                fundingInstrumentBank = null;
            }
            fundingInstrumentArr[1] = fundingInstrumentBank;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentCard onRevolvingCreditPaymentFundingInstrumentCard = revolvingCreditEligiblePaymentFundingInstrument.getOnRevolvingCreditPaymentFundingInstrumentCard();
            if (onRevolvingCreditPaymentFundingInstrumentCard != null) {
                java.lang.String id3 = onRevolvingCreditPaymentFundingInstrumentCard.getId();
                com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditPaymentOptionsOverviewQuery.Art2 art3 = onRevolvingCreditPaymentFundingInstrumentCard.getArt();
                if (art3 != null && (revolvingCreditImageFragment = art3.getRevolvingCreditImageFragment()) != null && (url = revolvingCreditImageFragment.getUrl()) != null) {
                    str = url.toString();
                }
                fundingInstrumentCard = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentCard(id3, str, onRevolvingCreditPaymentFundingInstrumentCard.getName(), onRevolvingCreditPaymentFundingInstrumentCard.getLastNChars().toString(), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.CardProductType.INSTANCE.from(onRevolvingCreditPaymentFundingInstrumentCard.getProductClass().name()));
            }
            fundingInstrumentArr[2] = fundingInstrumentCard;
            kotlin.collections.CollectionsKt.addAll(arrayList, kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) fundingInstrumentArr));
        }
        return arrayList;
    }
}
