package com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r2\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0!8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/renderer/commerceitem/CommerceItemProductDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/usecase/GetCommerceItemVariantsUseCase;", "getCommerceItemVariantsUseCase", "Lcom/paypal/oslo/feature/searchandintelligence/domain/InternalSearchAndIntelligence;", "searchAndIntelligence", "<init>", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/usecase/GetCommerceItemVariantsUseCase;Lcom/paypal/oslo/feature/searchandintelligence/domain/InternalSearchAndIntelligence;)V", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCard;", "initialCard", "", "initialize$search_and_intelligence_prodRelease", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCard;)V", "", "variants", "initializeWithVariants$search_and_intelligence_prodRelease", "(Ljava/util/List;Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCard;)V", "", "attributeKey", "selectedValue", "onAttributeSelect$search_and_intelligence_prodRelease", "(Ljava/lang/String;Ljava/lang/String;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/searchandintelligence/domain/usecase/GetCommerceItemVariantsUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/searchandintelligence/domain/InternalSearchAndIntelligence;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/searchandintelligence/ui/component/productcard/ProductDetailData;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "productDetailData", "Lkotlinx/coroutines/flow/StateFlow;", "getProductDetailData$search_and_intelligence_prodRelease", "()Lkotlinx/coroutines/flow/StateFlow;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CommerceItemProductDetailsViewModel extends androidx.view.ViewModel {

    @java.lang.Deprecated
    public static final java.lang.String ACTION_TYPE_GET_VARIANTS = "GET_VARIANTS";

    @java.lang.Deprecated
    public static final java.lang.String DETAIL_KEY_COMMERCE_ITEM_TYPE = "commerce_item_type";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.searchandintelligence.domain.InternalSearchAndIntelligence getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetCommerceItemVariantsUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductDetailData> getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductDetailData> productDetailData;
    private static final com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsViewModel.Companion Companion = new com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsViewModel.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public CommerceItemProductDetailsViewModel(com.paypal.oslo.feature.searchandintelligence.domain.usecase.GetCommerceItemVariantsUseCase getCommerceItemVariantsUseCase, com.paypal.oslo.feature.searchandintelligence.domain.InternalSearchAndIntelligence internalSearchAndIntelligence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCommerceItemVariantsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalSearchAndIntelligence, "");
        this.Camera2StreamConfigurationMap = getCommerceItemVariantsUseCase;
        this.getHighSpeedVideoFpsRangesFor = internalSearchAndIntelligence;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.emptyList();
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductDetailData> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getHighSpeedVideoFpsRanges = MutableStateFlow;
        this.productDetailData = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductDetailData> getProductDetailData$search_and_intelligence_prodRelease() {
        return this.productDetailData;
    }

    public final void initialize$search_and_intelligence_prodRelease(com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard initialCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialCard, "");
        if (this.getHighSpeedVideoFpsRanges.getValue() != null) {
            return;
        }
        java.lang.Object obj = null;
        initializeWithVariants$search_and_intelligence_prodRelease$default(this, kotlin.collections.CollectionsKt.listOf(initialCard), null, 2, null);
        java.util.Iterator<T> it = initialCard.getAgenticActions().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.searchandintelligence.domain.action.CommerceAction) next).getCommerceActionMetadata().getType(), ACTION_TYPE_GET_VARIANTS)) {
                obj = next;
                break;
            }
        }
        com.paypal.oslo.feature.searchandintelligence.domain.action.CommerceAction commerceAction = (com.paypal.oslo.feature.searchandintelligence.domain.action.CommerceAction) obj;
        java.lang.String sessionId = this.getHighSpeedVideoFpsRangesFor.getSessionId();
        if (commerceAction != null && sessionId != null) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsViewModel$loadVariants$1(this, initialCard.getId(), sessionId, commerceAction.getCommerceActionMetadata().getId(), initialCard.getId(), null), 3, null);
            return;
        }
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        if (commerceAction == null) {
            createListBuilder.add("getVariantsAction");
        }
        if (sessionId == null) {
            createListBuilder.add("sessionId");
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, com.paypal.oslo.feature.searchandintelligence.domain.LogActions.PDP_VARIANTS_PARAMS_MISSING, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("session_id", sessionId), kotlin.TuplesKt.to("product_id", initialCard.getId()), kotlin.TuplesKt.to("missing_fields", kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.build(createListBuilder), ",", null, null, 0, null, null, 62, null))), null, 4, null);
    }

    public static /* synthetic */ void initializeWithVariants$search_and_intelligence_prodRelease$default(com.paypal.oslo.feature.searchandintelligence.ui.renderer.commerceitem.CommerceItemProductDetailsViewModel commerceItemProductDetailsViewModel, java.util.List list, com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard productCard, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            productCard = (com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard) kotlin.collections.CollectionsKt.first(list);
        }
        commerceItemProductDetailsViewModel.initializeWithVariants$search_and_intelligence_prodRelease(list, productCard);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductAttribute] */
    public final void initializeWithVariants$search_and_intelligence_prodRelease(java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard> variants, com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard initialCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variants, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialCard, "");
        this.getHighResolutionOutputSizeshNQ4ISI = variants;
        java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard> list = variants;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, ((com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard) it.next()).getDetails().keySet());
        }
        java.util.List distinct = kotlin.collections.CollectionsKt.distinct(arrayList);
        java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : distinct) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual((java.lang.String) obj, DETAIL_KEY_COMMERCE_ITEM_TYPE)) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.String str : arrayList2) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                java.lang.String str2 = ((com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard) it2.next()).getDetails().get(str);
                if (str2 != null) {
                    arrayList4.add(str2);
                }
            }
            java.util.List distinct2 = kotlin.collections.CollectionsKt.distinct(arrayList4);
            com.paypal.pds.components.MenuItem menuItem = null;
            if (!distinct2.isEmpty()) {
                java.util.List<java.lang.String> list2 = distinct2;
                java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (java.lang.String str3 : list2) {
                    arrayList5.add(new com.paypal.pds.components.MenuItem(null, str3, str3, null, null, 25, null));
                }
                java.util.ArrayList arrayList6 = arrayList5;
                java.lang.String str4 = initialCard.getDetails().get(str);
                if (str4 == null) {
                    str4 = (java.lang.String) kotlin.collections.CollectionsKt.first(distinct2);
                }
                java.util.Iterator it3 = arrayList6.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    ?? next = it3.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.pds.components.MenuItem) next).getKey(), str4)) {
                        menuItem = next;
                        break;
                    }
                }
                com.paypal.pds.components.MenuItem menuItem2 = menuItem;
                if (menuItem2 == null) {
                    menuItem2 = (com.paypal.pds.components.MenuItem) kotlin.collections.CollectionsKt.first((java.util.List) arrayList6);
                }
                menuItem = new com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductAttribute(str, arrayList6, menuItem2);
            }
            if (menuItem != null) {
                arrayList3.add(menuItem);
            }
        }
        this.getHighSpeedVideoFpsRanges.setValue(new com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductDetailData(initialCard, arrayList3, null, com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardKt.type(initialCard), 4, null));
    }

    public final void onAttributeSelect$search_and_intelligence_prodRelease(java.lang.String attributeKey, java.lang.String selectedValue) {
        java.util.List<com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductAttribute> attributes;
        com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard productCard;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributeKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedValue, "");
        com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductDetailData value = this.getHighSpeedVideoFpsRanges.getValue();
        if (value == null || (attributes = value.getAttributes()) == null) {
            return;
        }
        java.util.List<com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductAttribute> list = attributes;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductAttribute productAttribute : list) {
            kotlin.Pair pair = kotlin.TuplesKt.to(productAttribute.getKey(), productAttribute.getSelectedItem().getKey());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        java.util.Map plus = kotlin.collections.MapsKt.plus(linkedHashMap, kotlin.TuplesKt.to(attributeKey, selectedValue));
        com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard productCard2 = null;
        loop1: for (com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard productCard3 : this.getHighResolutionOutputSizeshNQ4ISI) {
            if (!plus.isEmpty()) {
                for (java.util.Map.Entry entry : plus.entrySet()) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(productCard3.getDetails().get((java.lang.String) entry.getKey()), entry.getValue())) {
                        if (productCard2 == null && kotlin.jvm.internal.Intrinsics.areEqual(productCard3.getDetails().get(attributeKey), selectedValue)) {
                            productCard2 = productCard3;
                        }
                    }
                }
            }
            productCard = productCard3;
        }
        productCard = productCard2;
        if (productCard != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductAttribute productAttribute2 : list) {
                java.lang.String str = productCard.getDetails().get(productAttribute2.getKey());
                java.util.Iterator<T> it = productAttribute2.getOptions().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.pds.components.MenuItem) obj).getKey(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                com.paypal.pds.components.MenuItem menuItem = (com.paypal.pds.components.MenuItem) obj;
                arrayList.add(com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductAttribute.copy$default(productAttribute2, null, null, menuItem == null ? productAttribute2.getSelectedItem() : menuItem, 3, null));
            }
            this.getHighSpeedVideoFpsRanges.setValue(new com.paypal.oslo.feature.searchandintelligence.ui.component.productcard.ProductDetailData(productCard, arrayList, null, com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardKt.type(productCard), 4, null));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/renderer/commerceitem/CommerceItemProductDetailsViewModel$Companion;", "", "<init>", "()V", "", "ACTION_TYPE_GET_VARIANTS", "Ljava/lang/String;", "DETAIL_KEY_COMMERCE_ITEM_TYPE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
