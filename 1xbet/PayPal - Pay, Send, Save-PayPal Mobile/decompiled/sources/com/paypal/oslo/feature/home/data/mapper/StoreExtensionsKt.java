package com.paypal.oslo.feature.home.data.mapper;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u001a)\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001\"\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\n*\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e*\u00020\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$OnStore;", "", "Lcom/paypal/oslo/api/graphql/schema/type/StoreLifestyleLogoType;", "typePriority", "", "findLifestyleLogoUrl", "(Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$OnStore;[Lcom/paypal/oslo/api/graphql/schema/type/StoreLifestyleLogoType;)Ljava/lang/String;", "", "isValid", "(Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$OnStore;)Z", "T", "Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$ShoppingCollection;", "Lkotlin/Function1;", "transform", "", "mapValidStores", "(Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$ShoppingCollection;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "filterValidStores", "(Lcom/paypal/oslo/feature/home/graphql/fragment/ShoppingCollectionComponentFragment$ShoppingCollection;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StoreExtensionsKt {
    public static final java.lang.String findLifestyleLogoUrl(com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore onStore, com.paypal.oslo.api.graphql.schema.type.StoreLifestyleLogoType... storeLifestyleLogoTypeArr) {
        java.lang.Object url;
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storeLifestyleLogoTypeArr, "");
        int length = storeLifestyleLogoTypeArr.length;
        int i = 0;
        while (true) {
            java.lang.Object obj2 = null;
            if (i >= length) {
                return null;
            }
            com.paypal.oslo.api.graphql.schema.type.StoreLifestyleLogoType storeLifestyleLogoType = storeLifestyleLogoTypeArr[i];
            java.util.Iterator<T> it = onStore.getLifestyleLogos().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.LifestyleLogo) next).getType() == storeLifestyleLogoType) {
                    obj2 = next;
                    break;
                }
            }
            com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.LifestyleLogo lifestyleLogo = (com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.LifestyleLogo) obj2;
            if (lifestyleLogo != null && (url = lifestyleLogo.getUrl()) != null && (obj = url.toString()) != null) {
                return obj;
            }
            i++;
        }
    }

    public static final boolean isValid(com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore onStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onStore, "");
        return onStore.getLogoUrl() != null && kotlin.text.StringsKt.startsWith$default(onStore.getUrl().toString(), "https://", false, 2, (java.lang.Object) null);
    }

    public static final <T> java.util.List<T> mapValidStores(com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.ShoppingCollection shoppingCollection, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore, ? extends T> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shoppingCollection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore> filterValidStores = filterValidStores(shoppingCollection);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(filterValidStores, 10));
        java.util.Iterator<T> it = filterValidStores.iterator();
        while (it.hasNext()) {
            arrayList.add(function1.invoke(it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0025 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore> filterValidStores(com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.ShoppingCollection shoppingCollection) {
        java.lang.String concat;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shoppingCollection, "");
        com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStoreShoppingCollection onStoreShoppingCollection = shoppingCollection.getOnStoreShoppingCollection();
        java.util.List<com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Store> stores = onStoreShoppingCollection != null ? onStoreShoppingCollection.getStores() : null;
        if (stores == null) {
            stores = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = stores.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.OnStore onStore = ((com.paypal.oslo.feature.home.graphql.fragment.ShoppingCollectionComponentFragment.Store) it.next()).getOnStore();
            if (onStore != null) {
                if (!isValid(onStore)) {
                    if (onStore.getLogoUrl() == null) {
                        concat = "logoUrl is null";
                    } else {
                        concat = !kotlin.text.StringsKt.startsWith$default(onStore.getUrl().toString(), "https://", false, 2, (java.lang.Object) null) ? "invalid URL: ".concat(java.lang.String.valueOf(onStore.getUrl())) : "unknown validation failure";
                    }
                    com.paypal.android.logger.standardized.LoggerExtensionsKt.w$default(com.paypal.oslo.feature.home.LoggerKt.log, com.paypal.android.logger.categories.Data.Warning.INSTANCE, "Store dropped: invalid data", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("storeId", onStore.getId()), kotlin.TuplesKt.to("storeName", onStore.getName()), kotlin.TuplesKt.to("reason", concat)), null, 8, null);
                }
                if (onStore == null) {
                    arrayList.add(onStore);
                }
            }
            onStore = null;
            if (onStore == null) {
            }
        }
        return arrayList;
    }
}
