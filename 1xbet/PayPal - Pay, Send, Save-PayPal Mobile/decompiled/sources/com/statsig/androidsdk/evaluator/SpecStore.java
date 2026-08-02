package com.statsig.androidsdk.evaluator;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\"\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\"\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/statsig/androidsdk/evaluator/SpecStore;", "", "<init>", "()V", "", "name", "Lcom/statsig/androidsdk/evaluator/Spec;", "getConfig", "(Ljava/lang/String;)Lcom/statsig/androidsdk/evaluator/Spec;", "getGate", "getLayer", "", "getLcut", "()Ljava/lang/Long;", "Lcom/statsig/androidsdk/evaluator/SpecParamStore;", "getParamStore", "(Ljava/lang/String;)Lcom/statsig/androidsdk/evaluator/SpecParamStore;", "Lcom/statsig/androidsdk/evaluator/SpecsResponse;", "getRawSpecs", "()Lcom/statsig/androidsdk/evaluator/SpecsResponse;", "specs", "", "setSpecs", "(Lcom/statsig/androidsdk/evaluator/SpecsResponse;)V", "", "configs", "Ljava/util/Map;", "gates", "layers", "paramStores", "rawSpecs", "Lcom/statsig/androidsdk/evaluator/SpecsResponse;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SpecStore {
    private com.statsig.androidsdk.evaluator.SpecsResponse rawSpecs;
    private java.util.Map<java.lang.String, com.statsig.androidsdk.evaluator.Spec> gates = kotlin.collections.MapsKt.emptyMap();
    private java.util.Map<java.lang.String, com.statsig.androidsdk.evaluator.Spec> configs = kotlin.collections.MapsKt.emptyMap();
    private java.util.Map<java.lang.String, com.statsig.androidsdk.evaluator.Spec> layers = kotlin.collections.MapsKt.emptyMap();
    private java.util.Map<java.lang.String, com.statsig.androidsdk.evaluator.SpecParamStore> paramStores = kotlin.collections.MapsKt.emptyMap();

    public final com.statsig.androidsdk.evaluator.SpecsResponse getRawSpecs() {
        return this.rawSpecs;
    }

    public final java.lang.Long getLcut() {
        com.statsig.androidsdk.evaluator.SpecsResponse specsResponse = this.rawSpecs;
        if (specsResponse != null) {
            return java.lang.Long.valueOf(specsResponse.getTime());
        }
        return null;
    }

    public final void setSpecs(com.statsig.androidsdk.evaluator.SpecsResponse specs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specs, "");
        this.rawSpecs = specs;
        java.util.List<com.statsig.androidsdk.evaluator.Spec> featureGates = specs.getFeatureGates();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(featureGates, 10)), 16));
        for (java.lang.Object obj : featureGates) {
            linkedHashMap.put(((com.statsig.androidsdk.evaluator.Spec) obj).getName(), obj);
        }
        this.gates = linkedHashMap;
        java.util.List<com.statsig.androidsdk.evaluator.Spec> dynamicConfigs = specs.getDynamicConfigs();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(dynamicConfigs, 10)), 16));
        for (java.lang.Object obj2 : dynamicConfigs) {
            linkedHashMap2.put(((com.statsig.androidsdk.evaluator.Spec) obj2).getName(), obj2);
        }
        this.configs = linkedHashMap2;
        java.util.List<com.statsig.androidsdk.evaluator.Spec> layerConfigs = specs.getLayerConfigs();
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(layerConfigs, 10)), 16));
        for (java.lang.Object obj3 : layerConfigs) {
            linkedHashMap3.put(((com.statsig.androidsdk.evaluator.Spec) obj3).getName(), obj3);
        }
        this.layers = linkedHashMap3;
        java.util.Map<java.lang.String, com.statsig.androidsdk.evaluator.SpecParamStore> paramStores = specs.getParamStores();
        if (paramStores == null) {
            paramStores = kotlin.collections.MapsKt.emptyMap();
        }
        this.paramStores = paramStores;
    }

    public final com.statsig.androidsdk.evaluator.Spec getGate(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return this.gates.get(name2);
    }

    public final com.statsig.androidsdk.evaluator.Spec getConfig(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return this.configs.get(name2);
    }

    public final com.statsig.androidsdk.evaluator.Spec getLayer(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return this.layers.get(name2);
    }

    public final com.statsig.androidsdk.evaluator.SpecParamStore getParamStore(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return this.paramStores.get(name2);
    }
}
