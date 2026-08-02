package com.paypal.oslo.feature.wallet.me.data.repository;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\u000b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\u0006*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$Data;", "Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;", "manager", "", "Lcom/paypal/oslo/feature/wallet/me/domain/Product$Type;", "order", "Lcom/paypal/oslo/feature/wallet/me/domain/Product;", "asProducts", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$Data;Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;Ljava/util/List;)Ljava/util/List;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$Item;", "", "asProduct", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$Item;Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;)Lcom/paypal/oslo/feature/wallet/me/domain/Product;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/wallet/me/domain/ProductError;", "asProductError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/wallet/me/domain/ProductError;", "Lcom/paypal/oslo/api/graphql/schema/type/WalletAccountType;", "asWalletAccountType", "(Lcom/paypal/oslo/feature/wallet/me/domain/Product$Type;)Lcom/paypal/oslo/api/graphql/schema/type/WalletAccountType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class WalletComponentsMapperKtKt {
    public static /* synthetic */ java.util.List asProducts$default(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Data data, com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager, java.util.List list, int i, java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Data data2;
        com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager2;
        java.util.List list2;
        if ((i & 2) != 0) {
            list2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.wallet.me.domain.Product.Type[]{com.paypal.oslo.feature.wallet.me.domain.Product.Type.BALANCE, com.paypal.oslo.feature.wallet.me.domain.Product.Type.BUY_NOW_PAY_LATER, com.paypal.oslo.feature.wallet.me.domain.Product.Type.REWARDS, com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_US_MASTERCARD, com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_US_CASHBACK_MASTERCARD, com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_US, com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_US_EBAY_MASTERCARD, com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_US_EXTRAS_MASTERCARD, com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_SMART_CONNECT, com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_UK, com.paypal.oslo.feature.wallet.me.domain.Product.Type.CRYPTO, com.paypal.oslo.feature.wallet.me.domain.Product.Type.PYUSD, com.paypal.oslo.feature.wallet.me.domain.Product.Type.DEBIT_INSTRUMENTS, com.paypal.oslo.feature.wallet.me.domain.Product.Type.SAVINGS, com.paypal.oslo.feature.wallet.me.domain.Product.Type.MONEY_POOLS, com.paypal.oslo.feature.wallet.me.domain.Product.Type.LINKED_BANKS, com.paypal.oslo.feature.wallet.me.domain.Product.Type.LINKED_CARDS, com.paypal.oslo.feature.wallet.me.domain.Product.Type.LINKED_3P_LOYALTY});
            data2 = data;
            walletFeatureManager2 = walletFeatureManager;
        } else {
            data2 = data;
            walletFeatureManager2 = walletFeatureManager;
            list2 = list;
        }
        return asProducts(data2, walletFeatureManager2, list2);
    }

    public static final java.util.List<com.paypal.oslo.feature.wallet.me.domain.Product<?>> asProducts(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Data data, com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager, java.util.List<? extends com.paypal.oslo.feature.wallet.me.domain.Product.Type> list) {
        java.lang.Object obj;
        java.lang.Object obj2;
        com.paypal.oslo.feature.wallet.me.domain.balance.BalanceOverview balanceOverview;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletFeatureManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (data.getWalletComponents() == null || data.getWalletComponents().getItems().isEmpty()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.lang.Iterable<kotlin.collections.IndexedValue> withIndex = kotlin.collections.CollectionsKt.withIndex(list);
        final java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(withIndex, 10)), 16));
        for (kotlin.collections.IndexedValue indexedValue : withIndex) {
            kotlin.Pair pair = kotlin.TuplesKt.to(indexedValue.getValue(), java.lang.Integer.valueOf(indexedValue.getIndex()));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Item> items = data.getWalletComponents().getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.wallet.me.domain.Product<? extends java.lang.Object> asProduct = asProduct((com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Item) it.next(), walletFeatureManager);
            if (asProduct != null) {
                arrayList.add(asProduct);
            }
        }
        java.util.List<com.paypal.oslo.feature.wallet.me.domain.Product<?>> sortedWith = kotlin.collections.CollectionsKt.sortedWith(arrayList, new java.util.Comparator() { // from class: com.paypal.oslo.feature.wallet.me.data.repository.WalletComponentsMapperKtKt$asProducts$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                java.lang.Object obj3 = linkedHashMap.get(((com.paypal.oslo.feature.wallet.me.domain.Product) t).getType());
                if (obj3 == null) {
                    obj3 = r0;
                }
                java.lang.Integer num = (java.lang.Integer) obj3;
                java.lang.Object obj4 = linkedHashMap.get(((com.paypal.oslo.feature.wallet.me.domain.Product) t2).getType());
                return kotlin.comparisons.ComparisonsKt.compareValues(num, (java.lang.Integer) (obj4 != null ? obj4 : Integer.MAX_VALUE));
            }
        });
        java.util.List<com.paypal.oslo.feature.wallet.me.domain.Product<?>> list2 = sortedWith;
        java.util.Iterator<T> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (com.paypal.oslo.feature.wallet.me.domain.Product.Type.BALANCE == ((com.paypal.oslo.feature.wallet.me.domain.Product) obj).getType()) {
                break;
            }
        }
        com.paypal.oslo.feature.wallet.me.domain.balance.BalanceProduct balanceProduct = obj instanceof com.paypal.oslo.feature.wallet.me.domain.balance.BalanceProduct ? (com.paypal.oslo.feature.wallet.me.domain.balance.BalanceProduct) obj : null;
        java.util.Iterator<T> it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it3.next();
            if (com.paypal.oslo.feature.wallet.me.domain.Product.Type.DEBIT_INSTRUMENTS == ((com.paypal.oslo.feature.wallet.me.domain.Product) obj2).getType()) {
                break;
            }
        }
        com.paypal.oslo.feature.wallet.me.domain.debit.DebitInstrumentsProduct debitInstrumentsProduct = obj2 instanceof com.paypal.oslo.feature.wallet.me.domain.debit.DebitInstrumentsProduct ? (com.paypal.oslo.feature.wallet.me.domain.debit.DebitInstrumentsProduct) obj2 : null;
        if (balanceProduct != null && debitInstrumentsProduct != null) {
            com.paypal.oslo.feature.wallet.me.domain.balance.BalanceOverview data2 = balanceProduct.getData();
            if (data2 != null) {
                com.paypal.oslo.feature.wallet.me.domain.debit.DebitInstrumentsOverview data3 = debitInstrumentsProduct.getData();
                balanceOverview = com.paypal.oslo.feature.wallet.me.domain.balance.BalanceOverview.copy$default(data2, null, false, false, false, false, data3 != null ? data3.getImageUrl() : null, 31, null);
            } else {
                balanceOverview = null;
            }
            com.paypal.oslo.feature.wallet.me.domain.balance.BalanceProduct copy$default = com.paypal.oslo.feature.wallet.me.domain.balance.BalanceProduct.copy$default(balanceProduct, false, balanceOverview, 1, null);
            sortedWith = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) sortedWith);
            int indexOf = sortedWith.indexOf(balanceProduct);
            if (indexOf != -1) {
                sortedWith.set(indexOf, copy$default);
            }
        }
        return sortedWith;
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.Product<? extends java.lang.Object> asProduct(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Item item, com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletFeatureManager, "");
        if (item.getOnBalanceComponent() != null) {
            return com.paypal.oslo.feature.wallet.me.data.repository.BalanceComponentMapperKtKt.asProduct(item.getOnBalanceComponent(), walletFeatureManager);
        }
        if (item.getOnSavingsComponent() != null) {
            return com.paypal.oslo.feature.wallet.me.data.repository.SavingsComponentMapperKtKt.asProduct(item.getOnSavingsComponent());
        }
        if (item.getOnRewardsComponent() != null) {
            return com.paypal.oslo.feature.wallet.me.data.repository.RewardsComponentMapperKtKt.asProduct(item.getOnRewardsComponent());
        }
        if (item.getOnBankAccountComponent() != null) {
            return com.paypal.oslo.feature.wallet.me.data.repository.BankAccountComponentMapperKtKt.asProduct(item.getOnBankAccountComponent());
        }
        if (item.getOnCardComponent() != null) {
            return com.paypal.oslo.feature.wallet.me.data.repository.CardComponentMapperKtKt.asProduct(item.getOnCardComponent());
        }
        if (item.getOnThirdPartyLoyaltyCardComponent() != null) {
            return com.paypal.oslo.feature.wallet.me.data.repository.ThirdPartyLoyaltyCardComponentMapperKtKt.asProduct(item.getOnThirdPartyLoyaltyCardComponent());
        }
        if (item.getOnCryptoComponent() != null) {
            return com.paypal.oslo.feature.wallet.me.data.repository.CryptoComponentMapperKtKt.asProduct(item.getOnCryptoComponent());
        }
        if (item.getOnRevolvingCreditCardComponent() != null) {
            return com.paypal.oslo.feature.wallet.me.data.repository.RevolvingCreditComponentMapperKtKt.asProduct(item.getOnRevolvingCreditCardComponent(), walletFeatureManager);
        }
        if (item.getOnBNPLComponent() != null) {
            return com.paypal.oslo.feature.wallet.me.data.repository.BnplComponentMapperKtKt.asProduct(item.getOnBNPLComponent());
        }
        if (item.getOnDebitInstrumentsComponent() != null) {
            return com.paypal.oslo.feature.wallet.me.data.repository.DebitInstrumentsComponentMapperKtKt.asProduct(item.getOnDebitInstrumentsComponent());
        }
        return null;
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.ProductError asProductError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        return callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network ? com.paypal.oslo.feature.wallet.me.domain.ProductError.Network.INSTANCE : com.paypal.oslo.feature.wallet.me.domain.ProductError.Service.INSTANCE;
    }

    public static final com.paypal.oslo.api.graphql.schema.type.WalletAccountType asWalletAccountType(com.paypal.oslo.feature.wallet.me.domain.Product.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        switch (com.paypal.oslo.feature.wallet.me.data.repository.WalletComponentsMapperKtKt.WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return com.paypal.oslo.api.graphql.schema.type.WalletAccountType.BALANCES;
            case 2:
                return com.paypal.oslo.api.graphql.schema.type.WalletAccountType.BNPL;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return com.paypal.oslo.api.graphql.schema.type.WalletAccountType.CREDIT;
            case 10:
            case 11:
                return com.paypal.oslo.api.graphql.schema.type.WalletAccountType.CRYPTO;
            case 12:
                return com.paypal.oslo.api.graphql.schema.type.WalletAccountType.DEBIT_INSTRUMENTS;
            case 13:
                return com.paypal.oslo.api.graphql.schema.type.WalletAccountType.THIRD_PARTY_LOYALTY_CARDS;
            case 14:
                return com.paypal.oslo.api.graphql.schema.type.WalletAccountType.BANK_ACCOUNTS;
            case 15:
                return com.paypal.oslo.api.graphql.schema.type.WalletAccountType.CARDS;
            case 16:
                return com.paypal.oslo.api.graphql.schema.type.WalletAccountType.MONEY_POOL;
            case 17:
                return com.paypal.oslo.api.graphql.schema.type.WalletAccountType.REWARDS;
            case 18:
                return com.paypal.oslo.api.graphql.schema.type.WalletAccountType.SAVINGS;
            default:
                return com.paypal.oslo.api.graphql.schema.type.WalletAccountType.UNKNOWN__;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.me.domain.Product.Type.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.me.domain.Product.Type.BALANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.me.domain.Product.Type.BUY_NOW_PAY_LATER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_UK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_US_MASTERCARD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_US_CASHBACK_MASTERCARD.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_US.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_US_EBAY_MASTERCARD.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_US_EXTRAS_MASTERCARD.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_SMART_CONNECT.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.me.domain.Product.Type.CRYPTO.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.me.domain.Product.Type.PYUSD.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.me.domain.Product.Type.DEBIT_INSTRUMENTS.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.me.domain.Product.Type.LINKED_3P_LOYALTY.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.me.domain.Product.Type.LINKED_BANKS.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.me.domain.Product.Type.LINKED_CARDS.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.me.domain.Product.Type.MONEY_POOLS.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.me.domain.Product.Type.REWARDS.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.me.domain.Product.Type.SAVINGS.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
