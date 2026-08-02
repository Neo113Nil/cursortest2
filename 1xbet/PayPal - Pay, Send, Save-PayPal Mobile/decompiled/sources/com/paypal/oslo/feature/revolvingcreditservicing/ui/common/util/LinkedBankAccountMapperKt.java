package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.util;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/banks/LinkedBankAccount;", "linkedBankAccounts", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument$FundingInstrumentBank;", "mapLinkedBankAccountsToFundingInstruments", "(Ljava/util/List;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LinkedBankAccountMapperKt {
    public static final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank> mapLinkedBankAccountsToFundingInstruments(java.util.List<com.paypal.oslo.feature.wallet.api.navigation.result.banks.LinkedBankAccount> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<com.paypal.oslo.feature.wallet.api.navigation.result.banks.LinkedBankAccount> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (com.paypal.oslo.feature.wallet.api.navigation.result.banks.LinkedBankAccount linkedBankAccount : list2) {
            arrayList.add(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank(linkedBankAccount.getAccountId(), null, linkedBankAccount.getInstitutionName(), com.paypal.oslo.feature.revolvingcreditservicing.ui.common.util.FundingInstrumentUtilsKt.mapBankAccountType(linkedBankAccount.getAccountType()), linkedBankAccount.getLast4Digits()));
        }
        return arrayList;
    }
}
