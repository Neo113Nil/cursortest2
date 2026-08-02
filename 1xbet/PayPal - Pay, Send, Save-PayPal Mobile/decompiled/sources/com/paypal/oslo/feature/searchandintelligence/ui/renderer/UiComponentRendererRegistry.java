package com.paypal.oslo.feature.searchandintelligence.ui.renderer;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B$\b\u0007\u0012\u0019\u0010\u0006\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u00032\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\tH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR0\u0010\u0010\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/renderer/UiComponentRendererRegistry;", "", "", "Lcom/paypal/oslo/feature/searchandintelligence/api/renderer/UiComponentRenderer;", "Lcom/paypal/oslo/feature/searchandintelligence/api/component/UiComponent;", "Lkotlin/jvm/JvmSuppressWildcards;", "renderers", "<init>", "(Ljava/util/Set;)V", "Lkotlin/reflect/KClass;", "contentClass", "get", "(Lkotlin/reflect/KClass;)Lcom/paypal/oslo/feature/searchandintelligence/api/renderer/UiComponentRenderer;", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Map;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UiComponentRendererRegistry {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent>, com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent>> getHighSpeedVideoSizes;

    @javax.inject.Inject
    public UiComponentRendererRegistry(java.util.Set<com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent>> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        java.util.Set<com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent>> set2 = set;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set2, 10));
        java.util.Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer) it.next()).getType());
        }
        final java.util.ArrayList arrayList2 = arrayList;
        java.util.Map eachCount = kotlin.collections.GroupingKt.eachCount(new kotlin.collections.Grouping<kotlin.reflect.KClass<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent>, kotlin.reflect.KClass<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent>>() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.renderer.UiComponentRendererRegistry$special$$inlined$groupingBy$1
            @Override // kotlin.collections.Grouping
            public final java.util.Iterator<kotlin.reflect.KClass<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent>> sourceIterator() {
                return arrayList2.iterator();
            }

            @Override // kotlin.collections.Grouping
            public final kotlin.reflect.KClass<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> keyOf(kotlin.reflect.KClass<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> element) {
                return element;
            }
        });
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : eachCount.entrySet()) {
            if (((java.lang.Number) entry.getValue()).intValue() > 1) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.Set keySet = linkedHashMap.keySet();
        if (!keySet.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Duplicate UI component types in renderer registry: ".concat(java.lang.String.valueOf(kotlin.collections.CollectionsKt.joinToString$default(keySet, null, null, null, 0, null, null, 63, null))).toString());
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set2, 10)), 16));
        for (java.lang.Object obj : set2) {
            linkedHashMap2.put(((com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer) obj).getType(), obj);
        }
        this.getHighSpeedVideoSizes = linkedHashMap2;
    }

    public final com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> get(kotlin.reflect.KClass<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent> contentClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentClass, "");
        return this.getHighSpeedVideoSizes.get(contentClass);
    }
}
