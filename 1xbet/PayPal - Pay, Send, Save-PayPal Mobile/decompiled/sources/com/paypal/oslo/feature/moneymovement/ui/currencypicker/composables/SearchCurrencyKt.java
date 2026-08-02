package com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables;

@kotlin.Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a}\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00162\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0014H\u0001¢\u0006\u0002\u0010\u0019\u001aC\u0010\u001c\u001a\u00020\u00012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00162\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010\u001e\u001a\f\u0010\u001f\u001a\u00020 *\u00020!H\u0002\"\u000e\u0010\u001a\u001a\u00020\u001bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\"²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u008e\u0002"}, d2 = {"SearchCurrency", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/SearchCurrencyData;", "callbacks", "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/SearchCurrencyCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "config", "Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/SearchCurrencyConfig;", "(Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/SearchCurrencyData;Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/SearchCurrencyCallbacks;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/searchcurrency/SearchCurrencyConfig;Landroidx/compose/runtime/Composer;II)V", "SearchCurrencyContent", "searchQuery", "", "searchPlaceholder", "displayItems", "", "Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/model/CurrencyListItem;", "filteredItems", "isLoading", "", "onQueryChange", "Lkotlin/Function1;", "onListItemClick", "showSearchBar", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "ShimmerItemCount", "", "CurrencyList", "items", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "toRoundedCornerShape", "Landroidx/compose/ui/graphics/Shape;", "Lcom/paypal/oslo/feature/moneymovement/ui/currencypicker/model/CurrencyListItem$Position;", "money-movement_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchCurrencyKt {
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00db, code lost:
    
        if (r11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0123, code lost:
    
        if (r8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchCurrency(final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyData searchCurrencyData, final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyCallbacks searchCurrencyCallbacks, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyConfig searchCurrencyConfig, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyConfig searchCurrencyConfig2;
        final com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyConfig searchCurrencyConfig3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.Object obj;
        java.lang.Object obj2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchCurrencyData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchCurrencyCallbacks, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1258231375);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changed(searchCurrencyData) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(searchCurrencyCallbacks) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i3 = i2 & 8;
            if (i3 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                searchCurrencyConfig2 = searchCurrencyConfig;
                i4 |= startRestartGroup.changed(searchCurrencyConfig2) ? 2048 : 1024;
                if (startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
                    androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyConfig searchCurrencyConfig4 = i3 != 0 ? new com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyConfig(false, 1, null) : searchCurrencyConfig2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1258231375, i4, -1, "com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrency (SearchCurrency.kt:68)");
                    }
                    boolean changed = startRestartGroup.changed(searchCurrencyData.getListMode());
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = com.paypal.oslo.feature.moneymovement.ui.currencypicker.mappers.CurrencyListModeMapperKt.getAllCurrencies(searchCurrencyData.getListMode());
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    java.util.List list = (java.util.List) rememberedValue;
                    boolean changed2 = startRestartGroup.changed(list);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                        obj = rememberedValue2;
                    }
                    java.util.List list2 = list;
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
                    for (java.lang.Object obj3 : list2) {
                        linkedHashMap.put(com.paypal.oslo.feature.moneymovement.ui.currencypicker.mappers.CurrencyListModeMapperKt.getId((com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem) obj3), obj3);
                    }
                    startRestartGroup.updateRememberedValue(linkedHashMap);
                    obj = linkedHashMap;
                    final java.util.Map map = (java.util.Map) obj;
                    boolean changed3 = startRestartGroup.changed(list);
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed3) {
                        obj2 = rememberedValue3;
                    }
                    com.paypal.oslo.feature.moneymovement.domain.search.PrefixSearch prefixSearch = new com.paypal.oslo.feature.moneymovement.domain.search.PrefixSearch();
                    prefixSearch.indexItems(com.paypal.oslo.feature.moneymovement.ui.currencypicker.mappers.CurrencyListModeMapperKt.toSearchableCurrencies(list));
                    startRestartGroup.updateRememberedValue(prefixSearch);
                    obj2 = prefixSearch;
                    com.paypal.oslo.feature.moneymovement.domain.search.PrefixSearch prefixSearch2 = (com.paypal.oslo.feature.moneymovement.domain.search.PrefixSearch) obj2;
                    boolean changed4 = startRestartGroup.changed(searchCurrencyData.getListMode());
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changed4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = com.paypal.oslo.feature.moneymovement.ui.currencypicker.mappers.CurrencyListModeMapperKt.toCurrencyListItems(searchCurrencyData.getListMode());
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    java.util.List list3 = (java.util.List) rememberedValue4;
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(searchCurrencyData.getSearchQuery(), null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue5;
                    androidx.compose.runtime.MutableState mutableState2 = mutableState;
                    boolean changed5 = startRestartGroup.changed((java.lang.String) mutableState2.getValue());
                    boolean changed6 = startRestartGroup.changed(prefixSearch2);
                    java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if ((changed5 | changed6) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = ((java.lang.String) mutableState2.getValue()).length() > 0 ? com.paypal.oslo.feature.moneymovement.ui.currencypicker.mappers.CurrencyListModeMapperKt.searchableCurrenciesToCurrencyListItems(prefixSearch2.search((java.lang.String) mutableState2.getValue())) : kotlin.collections.CollectionsKt.emptyList();
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    java.util.List list4 = (java.util.List) rememberedValue6;
                    java.lang.String str = (java.lang.String) mutableState2.getValue();
                    java.lang.String searchPlaceholder = searchCurrencyData.getSearchPlaceholder();
                    boolean isLoading = searchCurrencyData.isLoading();
                    int i6 = i4 & 112;
                    boolean z = i6 == 32;
                    java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                    if (z || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrencyKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj4) {
                                return com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrencyKt.$r8$lambda$htgm4sB0_oXhmp2IwlWTSOyWzI0(com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyCallbacks.this, mutableState, (java.lang.String) obj4);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue7;
                    boolean changedInstance = startRestartGroup.changedInstance(map);
                    boolean z2 = i6 == 32;
                    java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                    if ((changedInstance | z2) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrencyKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj4) {
                                return com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrencyKt.m15660$r8$lambda$bFZSpCpBUT9b4Ltf0HDGqjvEf4(map, searchCurrencyCallbacks, (java.lang.String) obj4);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue8);
                    }
                    SearchCurrencyContent(str, searchPlaceholder, list3, list4, isLoading, function1, (kotlin.jvm.functions.Function1) rememberedValue8, modifier3, searchCurrencyConfig4.getShowSearchBar(), startRestartGroup, (i4 << 15) & 29360128, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    searchCurrencyConfig3 = searchCurrencyConfig4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    searchCurrencyConfig3 = searchCurrencyConfig2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier4 = modifier2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrencyKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5) {
                            return com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrencyKt.$r8$lambda$9_9TeubH1lMqnRt8ZlWyFlB0Idk(com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyData.this, searchCurrencyCallbacks, modifier4, searchCurrencyConfig3, i, i2, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            searchCurrencyConfig2 = searchCurrencyConfig;
            if (startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i3 = i2 & 8;
        if (i3 == 0) {
        }
        searchCurrencyConfig2 = searchCurrencyConfig;
        if (startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchCurrencyContent(final java.lang.String str, final java.lang.String str2, final java.util.List<? extends com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem> list, final java.util.List<? extends com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem> list2, final boolean z, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, androidx.compose.ui.Modifier modifier, boolean z2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final boolean z3;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(218818193);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(list2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 1048576 : 524288;
        }
        int i6 = i2 & 128;
        if (i6 != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 8388608 : 4194304;
            i4 = i2 & 256;
            if (i4 == 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i3 |= startRestartGroup.changed(z2) ? 67108864 : 33554432;
            }
            if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                z3 = z2;
                modifier3 = modifier2;
            } else {
                if (i6 != 0) {
                    modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                }
                boolean z4 = i4 != 0 ? true : z2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(218818193, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrencyContent (SearchCurrency.kt:130)");
                }
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier2);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                androidx.compose.ui.Modifier modifier4 = modifier2;
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                if (z4) {
                    startRestartGroup.startReplaceGroup(2112153320);
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), "SearchCountry");
                    boolean z5 = (458752 & i3) == 131072;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z5 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrencyKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrencyKt.m15662$r8$lambda$vtmtf8yKLZkMDYcIpmDfgnqNM(kotlin.jvm.functions.Function1.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    i5 = i3;
                    com.paypal.pds.components.SearchKt.Search(testTag, str, function1, (kotlin.jvm.functions.Function0) rememberedValue, null, null, str2, startRestartGroup, ((i3 << 15) & 3670016) | ((i3 << 3) & 112) | ((i3 >> 9) & 896), 48);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    i5 = i3;
                    startRestartGroup.startReplaceGroup(2112552135);
                    startRestartGroup.endReplaceGroup();
                }
                java.util.List<? extends com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem> list3 = list2;
                if (list3.isEmpty()) {
                    list3 = list;
                }
                getHighResolutionOutputSizeshNQ4ISI(list3, function12, null, z, startRestartGroup, ((i5 >> 15) & 112) | ((i5 >> 3) & 7168), 4);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                z3 = z4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrencyKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrencyKt.$r8$lambda$6sKSZmkLI4nXToSz9duqo7L2ntE(str, str2, list, list2, z, function1, function12, modifier3, z3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i2 & 256;
        if (i4 == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final java.util.List<? extends com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem> list, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z2;
        androidx.compose.ui.Modifier modifier3;
        final boolean z3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-989905081);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z3 = z2;
                } else {
                    modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    final boolean z4 = i4 != 0 ? false : z2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-989905081, i3, -1, "com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.CurrencyList (SearchCurrency.kt:180)");
                    }
                    boolean z5 = (i3 & 7168) == 2048;
                    boolean changedInstance = startRestartGroup.changedInstance(list);
                    boolean z6 = (i3 & 112) == 32;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((z5 | changedInstance | z6) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrencyKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrencyKt.$r8$lambda$d0WsxzSeSDyryNK_YeYr74_jKDM(z4, list, function1, (androidx.compose.foundation.lazy.LazyListScope) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    int i6 = (i3 >> 6) & 14;
                    z3 = z4;
                    androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(modifier3, null, null, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, i6, 510);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier4 = modifier3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrencyKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrencyKt.$r8$lambda$1Fn7vneh4A8sWNPmDhLUpEtxuiY(list, function1, modifier4, z3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$-bFZSpCpBUT9b4Ltf0HDGqjvEf4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15660$r8$lambda$bFZSpCpBUT9b4Ltf0HDGqjvEf4(java.util.Map map, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyCallbacks searchCurrencyCallbacks, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem currencyItem = (com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem) map.get(str);
        if (currencyItem != null) {
            searchCurrencyCallbacks.onCurrencySelected(currencyItem);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1Fn7vneh4A8sWNPmDhLUpEtxuiY(java.util.List list, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, boolean z, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(list, function1, modifier, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$3N0MH4_8tWch_tvGpw8syVtyPzE(com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem currencyListItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyListItem, "");
        return currencyListItem.getContentType();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6sKSZmkLI4nXToSz9duqo7L2ntE(java.lang.String str, java.lang.String str2, java.util.List list, java.util.List list2, boolean z, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, androidx.compose.ui.Modifier modifier, boolean z2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SearchCurrencyContent(str, str2, list, list2, z, function1, function12, modifier, z2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9_9TeubH1lMqnRt8ZlWyFlB0Idk(com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyData searchCurrencyData, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyCallbacks searchCurrencyCallbacks, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyConfig searchCurrencyConfig, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SearchCurrency(searchCurrencyData, searchCurrencyCallbacks, modifier, searchCurrencyConfig, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$d0WsxzSeSDyryNK_YeYr74_jKDM(boolean z, final java.util.List list, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        if (z) {
            lazyListScope.items(10, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrencyKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    java.lang.Object concat;
                    concat = "shimmer_".concat(java.lang.String.valueOf(((java.lang.Integer) obj).intValue()));
                    return concat;
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrencyKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrencyKt.$r8$lambda$jHQ36fRID4TlrmcsibdxJueobiY(((java.lang.Integer) obj).intValue());
                }
            }, com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.ComposableSingletons$SearchCurrencyKt.INSTANCE.m15657getLambda$27115538$money_movement_prodRelease());
        } else {
            final kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrencyKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrencyKt.m15661$r8$lambda$qH59X8OLmkzL75SBjszfEaN2M((com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem) obj);
                }
            };
            final kotlin.jvm.functions.Function1 function13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrencyKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrencyKt.$r8$lambda$3N0MH4_8tWch_tvGpw8syVtyPzE((com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem) obj);
                }
            };
            lazyListScope.items(list.size(), new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrencyKt$CurrencyList$lambda$0$0$$inlined$items$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                    return invoke(num.intValue());
                }

                public final java.lang.Object invoke(int i) {
                    return kotlin.jvm.functions.Function1.this.invoke(list.get(i));
                }
            }, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrencyKt$CurrencyList$lambda$0$0$$inlined$items$2
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                    return invoke(num.intValue());
                }

                public final java.lang.Object invoke(int i) {
                    return kotlin.jvm.functions.Function1.this.invoke(list.get(i));
                }
            }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(802480018, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrencyKt$CurrencyList$lambda$0$0$$inlined$items$3
                @Override // kotlin.jvm.functions.Function4
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer, java.lang.Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
                    int i3;
                    if ((i2 & 6) == 0) {
                        i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= composer.changed(i) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    final com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem currencyListItem = (com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem) list.get(i);
                    composer.startReplaceGroup(1394592651);
                    if (currencyListItem instanceof com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Header) {
                        composer.startReplaceGroup(1394612397);
                        com.paypal.pds.components.SectionHeaderKt.SectionHeader(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.lazy.LazyItemScope.animateItem$default(lazyItemScope, androidx.compose.ui.Modifier.INSTANCE, null, null, null, 7, null), com.paypal.pds.core.ConstantsKt.getSpacing16()), ((com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Header) currencyListItem).getTitle(), null, null, composer, 0, 12);
                        composer.endReplaceGroup();
                    } else {
                        if (!(currencyListItem instanceof com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Currency)) {
                            composer.startReplaceGroup(460628856);
                            composer.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        composer.startReplaceGroup(1394977453);
                        com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Currency currency = (com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Currency) currencyListItem;
                        androidx.compose.ui.graphics.Shape access$toRoundedCornerShape = com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrencyKt.access$toRoundedCornerShape(currency.getPosition());
                        androidx.compose.ui.Modifier clip = androidx.compose.ui.draw.ClipKt.clip(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.lazy.LazyItemScope.animateItem$default(lazyItemScope, androidx.compose.ui.Modifier.INSTANCE, null, null, null, 7, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, access$toRoundedCornerShape, composer, 48, 0), access$toRoundedCornerShape);
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, clip);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor);
                        } else {
                            composer.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        com.paypal.pds.components.ListKt.ListItemView(currency.getListItem(), androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), false, null, null, null, false, composer, com.paypal.pds.components.ListItem.$stable | 384, 120);
                        androidx.compose.ui.Modifier matchParentSize = boxScopeInstance.matchParentSize(androidx.compose.ui.Modifier.INSTANCE);
                        boolean changed = composer.changed(function1);
                        boolean changed2 = composer.changed(currencyListItem);
                        java.lang.Object rememberedValue = composer.rememberedValue();
                        if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            final kotlin.jvm.functions.Function1 function14 = function1;
                            rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrencyKt$CurrencyList$1$1$5$1$1$1
                                @Override // kotlin.jvm.functions.Function0
                                public final /* synthetic */ kotlin.Unit invoke() {
                                    function14.invoke(((com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Currency) currencyListItem).getCurrencyCode());
                                    return kotlin.Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(rememberedValue);
                        }
                        androidx.compose.foundation.layout.BoxKt.Box(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(matchParentSize, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0, 31), composer, 0);
                        composer.endNode();
                        composer.endReplaceGroup();
                    }
                    composer.endReplaceGroup();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$htgm4sB0_oXhmp2IwlWTSOyWzI0(com.paypal.oslo.feature.moneymovement.api.currencypicker.components.searchcurrency.SearchCurrencyCallbacks searchCurrencyCallbacks, androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mutableState.setValue(str);
        searchCurrencyCallbacks.onQueryChanged(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$jHQ36fRID4TlrmcsibdxJueobiY(int i) {
        return "shimmer";
    }

    /* renamed from: $r8$lambda$qH59-X8OLmkzL75SBjs-zfEaN2M, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m15661$r8$lambda$qH59X8OLmkzL75SBjszfEaN2M(com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem currencyListItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyListItem, "");
        return currencyListItem.getKey();
    }

    /* renamed from: $r8$lambda$vtmtf8yKLZkMD-YcIpmDfgnq-NM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15662$r8$lambda$vtmtf8yKLZkMDYcIpmDfgnqNM(kotlin.jvm.functions.Function1 function1) {
        function1.invoke("");
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ androidx.compose.ui.graphics.Shape access$toRoundedCornerShape(com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position position) {
        int i = com.paypal.oslo.feature.moneymovement.ui.currencypicker.composables.SearchCurrencyKt.WhenMappings.$EnumSwitchMapping$0[position.ordinal()];
        if (i == 1) {
            return androidx.compose.foundation.shape.RoundedCornerShapeKt.m1973RoundedCornerShapea9UjIt4$default(com.paypal.pds.core.ConstantsKt.getSize32(), com.paypal.pds.core.ConstantsKt.getSize32(), 0.0f, 0.0f, 12, null);
        }
        if (i == 2) {
            return androidx.compose.foundation.shape.RoundedCornerShapeKt.m1973RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSize32(), com.paypal.pds.core.ConstantsKt.getSize32(), 3, null);
        }
        if (i == 3) {
            return com.paypal.pds.core.ConstantsKt.getRoundedCornerShape32();
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return androidx.compose.foundation.shape.RoundedCornerShapeKt.RoundedCornerShape(0);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position.values().length];
            try {
                iArr[com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position.FIRST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position.LAST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position.ONLY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.ui.currencypicker.model.CurrencyListItem.Position.MIDDLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
