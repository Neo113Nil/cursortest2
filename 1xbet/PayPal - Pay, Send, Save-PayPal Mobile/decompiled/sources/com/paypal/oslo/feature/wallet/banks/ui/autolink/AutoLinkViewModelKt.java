package com.paypal.oslo.feature.wallet.banks.ui.autolink;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AutoLinkViewModelKt {
    public static final /* synthetic */ java.util.List access$toLinkedAccounts(java.util.List list) {
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccountInfo> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccountInfo existingBankAccountInfo : list2) {
            arrayList.add(new com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult(existingBankAccountInfo.getBankAccountId(), existingBankAccountInfo.getLastNChars(), existingBankAccountInfo.getType(), com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction.ADDED, existingBankAccountInfo.getInlineLogoData()));
        }
        return arrayList;
    }
}
