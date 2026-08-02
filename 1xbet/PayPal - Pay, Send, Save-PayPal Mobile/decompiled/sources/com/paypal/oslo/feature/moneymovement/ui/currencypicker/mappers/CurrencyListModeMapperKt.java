package com.paypal.oslo.feature.moneymovement.ui.currencypicker.mappers;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004*\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0006\u001a\u001d\u0010\u0010\u001a\u00020\u000f*\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0013\u001a\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004*\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u0006\u001a\u0019\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004*\u00020\u0015H\u0000¢\u0006\u0004\b\u0012\u0010\u0017\u001a\u0019\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004*\u00020\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem;", "Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/model/SearchableCurrency;", "toSearchableCurrency", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem;)Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/model/SearchableCurrency;", "", "toSearchableCurrencies", "(Ljava/util/List;)Ljava/util/List;", "Lcom/paypal/pds/components/ListItem;", "toListItem", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem;)Lcom/paypal/pds/components/ListItem;", "", "getId", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/model/CurrencyListItem$Position;", com.daon.sdk.face.license.License.FEATURE_POSITION, "Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/model/CurrencyListItem$Currency;", "toCurrencyListItem", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem;Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/model/CurrencyListItem$Position;)Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/model/CurrencyListItem$Currency;", "toCurrencyListItems", "(Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/model/SearchableCurrency;Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/model/CurrencyListItem$Position;)Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/model/CurrencyListItem$Currency;", "searchableCurrenciesToCurrencyListItems", "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/CurrencyListMode;", "Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/model/CurrencyListItem;", "(Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/CurrencyListMode;)Ljava/util/List;", "getAllCurrencies"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CurrencyListModeMapperKt {
    public static final com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.SearchableCurrency toSearchableCurrency(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem currencyItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyItem, "");
        return new com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.SearchableCurrency(currencyItem);
    }

    public static final java.util.List<com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.SearchableCurrency> toSearchableCurrencies(java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toSearchableCurrency((com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem) it.next()));
        }
        return arrayList;
    }

    public static final com.paypal.pds.components.ListItem toListItem(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem currencyItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyItem, "");
        int i = com.paypal.oslo.feature.moneymovement.ui.currencypicker.mappers.CurrencyListModeMapperKt.WhenMappings.$EnumSwitchMapping$0[currencyItem.getType().ordinal()];
        if (i == 1) {
            final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.FiatInfo requireFiat = currencyItem.requireFiat();
            return new com.paypal.pds.components.ListItem(requireFiat.getDisplayCurrencyName(), requireFiat.getCurrencyCode(), requireFiat.getCurrencyCode(), null, false, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(746648080, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.currencypicker.mappers.CurrencyListModeMapperKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.currencypicker.mappers.CurrencyListModeMapperKt.$r8$lambda$KSYGlpPCVa2562XOaD8WZz_yBxY(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.FiatInfo.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }), null, null, null, null, null, 8024, null);
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.CryptoInfo requireCrypto = currencyItem.requireCrypto();
        return new com.paypal.pds.components.ListItem(requireCrypto.getName(), requireCrypto.getCode(), requireCrypto.getSymbol(), null, false, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1917683868, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.currencypicker.mappers.CurrencyListModeMapperKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.moneymovement.ui.currencypicker.mappers.CurrencyListModeMapperKt.$r8$lambda$M_nU6_a9fZLK29k8bqCz4gIt5AA(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.CryptoInfo.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }), null, null, null, null, null, 8024, null);
    }

    public static final java.lang.String getId(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem currencyItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyItem, "");
        int i = com.paypal.oslo.feature.moneymovement.ui.currencypicker.mappers.CurrencyListModeMapperKt.WhenMappings.$EnumSwitchMapping$0[currencyItem.getType().ordinal()];
        if (i == 1) {
            return currencyItem.requireFiat().getId();
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return currencyItem.requireCrypto().getId();
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Currency toCurrencyListItem$default(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem currencyItem, com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position position, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            position = com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position.MIDDLE;
        }
        return toCurrencyListItem(currencyItem, position);
    }

    public static final com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Currency toCurrencyListItem(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem currencyItem, com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyItem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(position, "");
        return new com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Currency(toListItem(currencyItem), getId(currencyItem), position);
    }

    public static final java.util.List<com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Currency> toCurrencyListItems(java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> list) {
        com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position position;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i = 0;
        for (java.lang.Object obj : list2) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem currencyItem = (com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem) obj;
            if (list.size() == 1) {
                position = com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position.ONLY;
            } else if (i == 0) {
                position = com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position.FIRST;
            } else {
                position = i == kotlin.collections.CollectionsKt.getLastIndex(list) ? com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position.LAST : com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position.MIDDLE;
            }
            arrayList.add(toCurrencyListItem(currencyItem, position));
            i++;
        }
        return arrayList;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Currency toCurrencyListItem$default(com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.SearchableCurrency searchableCurrency, com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position position, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            position = com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position.MIDDLE;
        }
        return toCurrencyListItem(searchableCurrency, position);
    }

    public static final com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Currency toCurrencyListItem(com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.SearchableCurrency searchableCurrency, com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchableCurrency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(position, "");
        return toCurrencyListItem(searchableCurrency.getItem(), position);
    }

    public static final java.util.List<com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Currency> searchableCurrenciesToCurrencyListItems(java.util.List<com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.SearchableCurrency> list) {
        com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position position;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.SearchableCurrency> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i = 0;
        for (java.lang.Object obj : list2) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.SearchableCurrency searchableCurrency = (com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.SearchableCurrency) obj;
            if (list.size() == 1) {
                position = com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position.ONLY;
            } else if (i == 0) {
                position = com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position.FIRST;
            } else {
                position = i == kotlin.collections.CollectionsKt.getLastIndex(list) ? com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position.LAST : com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position.MIDDLE;
            }
            arrayList.add(toCurrencyListItem(searchableCurrency, position));
            i++;
        }
        return arrayList;
    }

    public static final java.util.List<com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem> toCurrencyListItems(com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode currencyListMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyListMode, "");
        if (currencyListMode instanceof com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.FlatList) {
            return toCurrencyListItems(((com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.FlatList) currencyListMode).getCurrencies());
        }
        if (!(currencyListMode instanceof com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections twoSections = (com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections) currencyListMode;
        createListBuilder.add(new com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Header(twoSections.getPrimarySection().getHeaderTitle()));
        createListBuilder.addAll(toCurrencyListItems(twoSections.getPrimarySection().getCurrencies()));
        createListBuilder.add(new com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Header(twoSections.getSecondarySection().getHeaderTitle()));
        createListBuilder.addAll(toCurrencyListItems(twoSections.getSecondarySection().getCurrencies()));
        return kotlin.collections.CollectionsKt.build(createListBuilder);
    }

    public static final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem> getAllCurrencies(com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode currencyListMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyListMode, "");
        if (currencyListMode instanceof com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.FlatList) {
            return ((com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.FlatList) currencyListMode).getCurrencies();
        }
        if (!(currencyListMode instanceof com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections twoSections = (com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.CurrencyListMode.TwoSections) currencyListMode;
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) twoSections.getPrimarySection().getCurrencies(), (java.lang.Iterable) twoSections.getSecondarySection().getCurrencies());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KSYGlpPCVa2562XOaD8WZz_yBxY(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.FiatInfo fiatInfo, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(746648080, i, -1, "com.paypal.oslo.feature.moneymovement.ui.currencypicker.mappers.toListItem.<anonymous>.<anonymous> (CurrencyListModeMapper.kt:55)");
            }
            java.lang.String countryCode = fiatInfo.getCountryCode();
            if (countryCode == null) {
                composer.startReplaceGroup(-242624204);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-242624203);
                com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Image(com.paypal.pds.core.FlagKt.rememberFlagPainter(countryCode, com.paypal.pds.core.FlagSize.Large.INSTANCE, composer, com.paypal.pds.core.FlagSize.Large.$stable << 3, 0), null, 2, null), null, null, null, null, null, composer, 0, 62);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$M_nU6_a9fZLK29k8bqCz4gIt5AA(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem.CryptoInfo cryptoInfo, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1917683868, i, -1, "com.paypal.oslo.feature.moneymovement.ui.currencypicker.mappers.toListItem.<anonymous>.<anonymous> (CurrencyListModeMapper.kt:76)");
            }
            com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(com.paypal.oslo.feature.moneymovement.ui.shared.utils.CryptoLogoUtilsKt.cryptoLogoUrl(cryptoInfo.getName()), null, null, null, null, composer, 0, 30), null, 2, null), null, null, null, null, null, composer, 0, 62);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.values().length];
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CASH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CRYPTO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
