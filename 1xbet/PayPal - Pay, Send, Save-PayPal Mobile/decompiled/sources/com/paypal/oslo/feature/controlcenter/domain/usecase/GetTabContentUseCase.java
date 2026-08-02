package com.paypal.oslo.feature.controlcenter.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001c\b\u0007\u0012\u0011\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR)\u0010\u0010\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\r\u0012\u0004\u0012\u00020\u00030\f8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/domain/usecase/GetTabContentUseCase;", "", "", "Lcom/paypal/oslo/feature/controlcenter/api/provider/TabContentProvider;", "Lkotlin/jvm/JvmSuppressWildcards;", "tabContentProviders", "<init>", "(Ljava/util/Set;)V", "Landroidx/navigation3/runtime/NavKey;", "destination", "invoke", "(Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/feature/controlcenter/api/provider/TabContentProvider;", "", "Lkotlin/reflect/KClass;", "Camera2StreamConfigurationMap", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetTabContentUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public GetTabContentUseCase(final java.util.Set<com.paypal.oslo.feature.controlcenter.api.provider.TabContentProvider> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.controlcenter.domain.usecase.GetTabContentUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.controlcenter.domain.usecase.GetTabContentUseCase.m13722$r8$lambda$7KHXtYkbhR1ZKP3DcGw40kT50(set);
            }
        });
    }

    /* renamed from: $r8$lambda$7KHX-tYkbhR1-ZKP3DcGw40kT50, reason: not valid java name */
    public static /* synthetic */ java.util.Map m13722$r8$lambda$7KHXtYkbhR1ZKP3DcGw40kT50(java.util.Set set) {
        java.util.Set set2 = set;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set2, 10)), 16));
        for (java.lang.Object obj : set2) {
            linkedHashMap.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.feature.controlcenter.api.provider.TabContentProvider) obj).getTabDestination().getClass()), obj);
        }
        return linkedHashMap;
    }

    public final com.paypal.oslo.feature.controlcenter.api.provider.TabContentProvider invoke(androidx.navigation3.runtime.NavKey destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        return (com.paypal.oslo.feature.controlcenter.api.provider.TabContentProvider) ((java.util.Map) this.getHighSpeedVideoFpsRanges.getValue()).get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(destination.getClass()));
    }
}
