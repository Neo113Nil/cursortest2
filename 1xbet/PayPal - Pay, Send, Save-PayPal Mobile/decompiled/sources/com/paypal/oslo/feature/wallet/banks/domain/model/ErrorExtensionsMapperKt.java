package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0001*\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00010\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0000*\b\u0012\u0004\u0012\u00020\u00070\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "", "", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/LinkAccountFailType;", "associateErrorTypes", "(Ljava/util/List;)Ljava/util/Map;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/FailedBankAccountResult;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError;", "error", "mapErrorTypes", "(Ljava/util/List;Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ErrorExtensionsMapperKt {
    public static final java.util.Map<java.lang.String, com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType> associateErrorTypes(java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> list) {
        java.lang.Object firstOrNull;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            java.util.Map map = (java.util.Map) it.next();
            java.lang.Object obj = map != null ? map.get("details") : null;
            java.util.List list2 = obj instanceof java.util.List ? (java.util.List) obj : null;
            java.util.Map map2 = (list2 == null || (firstOrNull = kotlin.collections.CollectionsKt.firstOrNull((java.util.List<? extends java.lang.Object>) list2)) == null || !(firstOrNull instanceof java.util.Map)) ? null : (java.util.Map) firstOrNull;
            java.lang.Object obj2 = map2 != null ? map2.get(com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE) : null;
            java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
            java.lang.Object obj3 = map2 != null ? map2.get("bankAccountCandidateId") : null;
            java.lang.String str2 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
            kotlin.Pair pair = str2 != null ? kotlin.TuplesKt.to(str2, com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType.INSTANCE.fromServerErrorCode(str)) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return kotlin.collections.MapsKt.toMap(arrayList);
    }

    public static final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> mapErrorTypes(java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> list, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError externalBankAccessError) {
        com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType linkAccountFailType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (externalBankAccessError instanceof com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.PartialDataAvailable) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> errorExtensions = ((com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.PartialDataAvailable) externalBankAccessError).getErrorExtensions();
            java.util.Map<java.lang.String, com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType> associateErrorTypes = errorExtensions != null ? associateErrorTypes(errorExtensions) : null;
            java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult failedBankAccountResult : list2) {
                if (associateErrorTypes == null || (linkAccountFailType = associateErrorTypes.get(failedBankAccountResult.getCandidateId())) == null) {
                    linkAccountFailType = com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType.TERMINAL;
                }
                arrayList.add(com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult.copy$default(failedBankAccountResult, null, null, null, null, null, linkAccountFailType, null, 95, null));
            }
            return arrayList;
        }
        if (!(externalBankAccessError instanceof com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Network)) {
            return list;
        }
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> list3 = list;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
        java.util.Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult.copy$default((com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult) it.next(), null, null, null, null, null, com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType.TERMINAL, null, 95, null));
        }
        return arrayList2;
    }
}
