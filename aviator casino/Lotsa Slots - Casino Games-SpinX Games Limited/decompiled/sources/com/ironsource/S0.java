package com.ironsource;

/* loaded from: classes5.dex */
public final class S0 extends com.ironsource.C2963b2 {
    private final java.util.Map<java.lang.String, com.ironsource.L> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(java.util.List<? extends com.ironsource.mediationsdk.model.NetworkSettings> providers, int i) {
        super(providers, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providers, "providers");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(providers, 10)), 16));
        java.util.Iterator<T> it = providers.iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = kotlin.TuplesKt.to(((com.ironsource.mediationsdk.model.NetworkSettings) it.next()).getProviderName(), new com.ironsource.L(i));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        this.e = linkedHashMap;
    }

    public final void a(com.ironsource.Jg waterfallInstances) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        java.util.List<com.ironsource.B> b = waterfallInstances.b();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(b, 10)), 16));
        for (com.ironsource.B b2 : b) {
            kotlin.Pair pair = kotlin.TuplesKt.to(b2.p(), b2.t());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        a(linkedHashMap);
    }

    @Override // com.ironsource.C2963b2
    public java.lang.String a(java.lang.String instanceName) {
        java.lang.String d;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        com.ironsource.L l = this.e.get(instanceName);
        return (l == null || (d = l.d()) == null) ? "" : d;
    }

    private final void a(java.util.Map<java.lang.String, com.ironsource.J> map) {
        for (java.util.Map.Entry<java.lang.String, com.ironsource.L> entry : this.e.entrySet()) {
            entry.getValue().a(map.get(entry.getKey()));
        }
    }
}
