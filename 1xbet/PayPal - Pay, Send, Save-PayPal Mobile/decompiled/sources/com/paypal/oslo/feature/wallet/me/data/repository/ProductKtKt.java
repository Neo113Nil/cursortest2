package com.paypal.oslo.feature.wallet.me.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/paypal/oslo/feature/wallet/me/domain/Product$Type;", "Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;", "manager", "Lcom/paypal/oslo/api/graphql/schema/type/WalletAccountType;", "asWalletAccountTypes", "(Ljava/util/List;Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ProductKtKt {
    public static final java.util.List<com.paypal.oslo.api.graphql.schema.type.WalletAccountType> asWalletAccountTypes(java.util.List<? extends com.paypal.oslo.feature.wallet.me.domain.Product.Type> list, com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletFeatureManager, "");
        boolean isMoneyPoolsTileEnabled = walletFeatureManager.isMoneyPoolsTileEnabled();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (com.paypal.oslo.feature.wallet.me.domain.Product.Type.MONEY_POOLS != ((com.paypal.oslo.feature.wallet.me.domain.Product.Type) obj) || isMoneyPoolsTileEnabled) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(com.paypal.oslo.feature.wallet.me.data.repository.WalletComponentsMapperKtKt.asWalletAccountType((com.paypal.oslo.feature.wallet.me.domain.Product.Type) it.next()));
        }
        return arrayList3;
    }
}
