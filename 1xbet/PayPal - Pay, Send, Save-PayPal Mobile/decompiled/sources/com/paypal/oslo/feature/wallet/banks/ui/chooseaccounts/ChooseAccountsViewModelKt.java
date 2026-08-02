package com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChooseAccountsViewModelKt {
    public static final /* synthetic */ java.util.List access$addAccountDetails(java.util.List list, java.util.List list2) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.model.SelectableBankAccount selectableBankAccount = (com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.model.SelectableBankAccount) it.next();
            linkedHashMap.put(selectableBankAccount.getId(), selectableBankAccount);
        }
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> list3 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
        for (com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult failedBankAccountResult : list3) {
            com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.model.SelectableBankAccount selectableBankAccount2 = (com.paypal.oslo.feature.wallet.banks.ui.chooseaccounts.model.SelectableBankAccount) linkedHashMap.get(failedBankAccountResult.getCandidateId());
            arrayList.add(com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult.copy$default(failedBankAccountResult, null, selectableBankAccount2 != null ? selectableBankAccount2.getLastNChars() : null, selectableBankAccount2 != null ? selectableBankAccount2.getAccountType() : null, selectableBankAccount2 != null ? selectableBankAccount2.getBankName() : null, null, null, selectableBankAccount2 != null ? selectableBankAccount2.getLogoUrl() : null, 49, null));
        }
        return arrayList;
    }

    public static final /* synthetic */ java.util.List access$toLinkedAccounts(java.util.List list) {
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccountInfo> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccountInfo existingBankAccountInfo : list2) {
            arrayList.add(new com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult(existingBankAccountInfo.getBankAccountId(), existingBankAccountInfo.getLastNChars(), existingBankAccountInfo.getType(), com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction.ADDED, existingBankAccountInfo.getInlineLogoData()));
        }
        return arrayList;
    }

    public static final /* synthetic */ java.util.List access$toLinkedBankAccounts(java.util.List list, java.lang.String str) {
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccount> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccount existingBankAccount : list2) {
            arrayList.add(new com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult(existingBankAccount.getId(), existingBankAccount.getLastNChars(), existingBankAccount.getType(), com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction.ADDED, str));
        }
        return arrayList;
    }
}
