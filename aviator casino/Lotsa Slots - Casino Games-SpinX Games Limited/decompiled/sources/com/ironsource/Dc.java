package com.ironsource;

/* loaded from: classes5.dex */
public final class Dc extends com.ironsource.Hg {
    private final com.ironsource.V0 e;
    private final com.ironsource.AbstractC3355x0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dc(com.ironsource.V0 tools, com.ironsource.AbstractC3355x0 adUnitData) {
        super(tools, adUnitData);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tools, "tools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.e = tools;
        this.f = adUnitData;
    }

    private final com.ironsource.C3178n2 d() {
        return new com.ironsource.C3178n2("", new org.json.JSONObject(), null, 0, "");
    }

    private final java.util.Map<java.lang.String, com.ironsource.I> e() {
        com.ironsource.Qf g = this.f.b().g();
        java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> m = this.f.m();
        java.util.ArrayList<com.ironsource.mediationsdk.model.NetworkSettings> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : m) {
            com.ironsource.mediationsdk.model.NetworkSettings networkSettings = (com.ironsource.mediationsdk.model.NetworkSettings) obj;
            if (g == null || g.a(networkSettings, this.f.b().a())) {
                if (!networkSettings.isBidder(this.f.b().a())) {
                    arrayList.add(obj);
                }
            }
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (com.ironsource.mediationsdk.model.NetworkSettings networkSettings2 : arrayList) {
            kotlin.Pair pair = kotlin.TuplesKt.to(networkSettings2.getProviderInstanceName(), new com.ironsource.I(this.e, this.f, networkSettings2));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    private final java.util.List<com.ironsource.C3232q2> f() {
        com.ironsource.Qf g = this.f.b().g();
        java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> m = this.f.m();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : m) {
            com.ironsource.mediationsdk.model.NetworkSettings networkSettings = (com.ironsource.mediationsdk.model.NetworkSettings) obj;
            if (g == null || g.a(networkSettings, this.f.b().a())) {
                if (!networkSettings.isBidder(this.f.b().a())) {
                    arrayList.add(obj);
                }
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new com.ironsource.C3232q2(((com.ironsource.mediationsdk.model.NetworkSettings) it.next()).getProviderInstanceName()));
        }
        return arrayList2;
    }

    @Override // com.ironsource.Hg
    public void a(com.ironsource.E adInstanceFactory, com.ironsource.Ig waterfallFetcherListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallFetcherListener, "waterfallFetcherListener");
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.C3212p0.a(this.e, "auction disabled", (java.lang.String) null, 2, (java.lang.Object) null));
        a(waterfallFetcherListener, d(), adInstanceFactory);
    }

    public final void a(com.ironsource.Ig waterfallFetcherListener, int i, java.lang.String auctionFallback, java.lang.String auctionId, com.ironsource.E adInstanceFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallFetcherListener, "waterfallFetcherListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        a(waterfallFetcherListener, new com.ironsource.C3178n2(auctionId, new org.json.JSONObject(), null, i, auctionFallback), adInstanceFactory);
    }

    private final void a(com.ironsource.Ig ig, com.ironsource.C3178n2 c3178n2, com.ironsource.E e) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.C3212p0.a(this.e, (java.lang.String) null, (java.lang.String) null, 3, (java.lang.Object) null));
        ig.a(com.ironsource.Hg.a(this, f(), e(), c3178n2, e, null, 16, null));
    }
}
