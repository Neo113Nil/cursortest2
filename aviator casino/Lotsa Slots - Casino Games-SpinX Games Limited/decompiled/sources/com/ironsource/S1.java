package com.ironsource;

/* loaded from: classes5.dex */
public final class S1 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.V0 f5955a;
    private final com.ironsource.AbstractC3355x0 b;
    private final java.util.Map<java.lang.String, com.ironsource.I> c;
    private final com.ironsource.C3089i2 d;
    private final java.util.List<com.ironsource.CallableC3233q3> e;
    private final boolean f;

    public static final class a extends com.ironsource.AbstractRunnableC3136ke {
        final /* synthetic */ com.ironsource.C3286t3 b;
        final /* synthetic */ com.ironsource.S1 c;
        final /* synthetic */ com.ironsource.C3286t3.b d;

        a(com.ironsource.C3286t3 c3286t3, com.ironsource.S1 s1, com.ironsource.C3286t3.b bVar) {
            this.b = c3286t3;
            this.c = s1;
            this.d = bVar;
        }

        @Override // com.ironsource.AbstractRunnableC3136ke
        public void a() {
            this.b.a(this.c.e(), this.d, this.c.b.f(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }
    }

    public static final class c implements com.ironsource.C3286t3.b {
        final /* synthetic */ com.ironsource.S1.d b;

        c(com.ironsource.S1.d dVar) {
            this.b = dVar;
        }

        @Override // com.ironsource.C3286t3.b
        public void a(final java.util.List<? extends com.ironsource.C3304u3> biddingDataList, final long j, final java.util.List<java.lang.String> reachedTimeout) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biddingDataList, "biddingDataList");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reachedTimeout, "reachedTimeout");
            com.ironsource.V0 v0 = com.ironsource.S1.this.f5955a;
            final com.ironsource.S1 s1 = com.ironsource.S1.this;
            final com.ironsource.S1.d dVar = this.b;
            v0.a(new java.lang.Runnable() { // from class: com.ironsource.S1$c$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.S1.c.a(com.ironsource.S1.this, j, biddingDataList, reachedTimeout, dVar);
                }
            });
        }

        @Override // com.ironsource.C3286t3.b
        public void onFailure(final java.lang.String error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            com.ironsource.V0 v0 = com.ironsource.S1.this.f5955a;
            final com.ironsource.S1 s1 = com.ironsource.S1.this;
            final com.ironsource.S1.d dVar = this.b;
            v0.a(new java.lang.Runnable() { // from class: com.ironsource.S1$c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.S1.c.a(com.ironsource.S1.this, error, dVar);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(com.ironsource.S1 this$0, long j, java.util.List biddingDataList, java.util.List reachedTimeout, com.ironsource.S1.d biddingDataListener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biddingDataList, "$biddingDataList");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reachedTimeout, "$reachedTimeout");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biddingDataListener, "$biddingDataListener");
            this$0.a(j, biddingDataList, reachedTimeout, biddingDataListener);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(com.ironsource.S1 this$0, java.lang.String error, com.ironsource.S1.d biddingDataListener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biddingDataListener, "$biddingDataListener");
            this$0.f5955a.e().g().a(error);
            biddingDataListener.a(this$0, error);
        }
    }

    public interface d {
        void a(com.ironsource.S1 s1);

        void a(com.ironsource.S1 s1, java.lang.String str);
    }

    public S1(com.ironsource.V0 adTools, com.ironsource.AbstractC3355x0 adUnitData, com.ironsource.C3075h6 c3075h6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f5955a = adTools;
        this.b = adUnitData;
        this.c = a();
        this.d = new com.ironsource.C3089i2(adUnitData);
        this.e = new java.util.ArrayList();
        this.f = adUnitData.e().q();
        com.ironsource.S1.b b2 = b();
        com.ironsource.Qf g = adUnitData.b().g();
        boolean w = com.ironsource.Jb.u.d().h().w();
        for (com.ironsource.mediationsdk.model.NetworkSettings networkSettings : adUnitData.m()) {
            if (g == null || g.a(networkSettings, this.b.b().a())) {
                com.ironsource.mediationsdk.adunit.adapter.utility.AdData a2 = this.b.a(networkSettings);
                if (networkSettings.isBidder(this.b.b().a())) {
                    java.lang.Object b3 = this.f ? b(networkSettings.getProviderName()) : a(networkSettings);
                    if (b3 instanceof com.ironsource.InterfaceC3268s3) {
                        this.e.add(new com.ironsource.CallableC3233q3(networkSettings.getInstanceType(this.b.b().a()), networkSettings.getProviderInstanceName(), a2, (com.ironsource.InterfaceC3268s3) b3, b2, networkSettings));
                    } else {
                        this.f5955a.e().h().g(b3 == null ? "prepareAuctionCandidates - could not load network adapter " + networkSettings.getProviderName() : "network adapter " + networkSettings.getProviderName() + " does not implementing BiddingDataInterface");
                    }
                } else if (!w) {
                    this.d.a(networkSettings);
                }
            }
        }
        this.d.a(c3075h6);
    }

    public final java.util.Map<java.lang.String, com.ironsource.I> c() {
        return this.c;
    }

    public final com.ironsource.C3089i2 d() {
        return this.d;
    }

    public final java.util.List<com.ironsource.CallableC3233q3> e() {
        return this.e;
    }

    public final boolean f() {
        return !this.e.isEmpty();
    }

    public final boolean g() {
        return this.d.e();
    }

    public final boolean h() {
        return this.f;
    }

    private final com.ironsource.S1.b b() {
        return new com.ironsource.S1.b();
    }

    private final com.ironsource.C3286t3.b b(com.ironsource.S1.d dVar) {
        return new com.ironsource.S1.c(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> b(java.lang.String str) {
        com.ironsource.I i = this.c.get(str);
        if (i != null) {
            return i.b();
        }
        return null;
    }

    private final java.util.Map<java.lang.String, com.ironsource.I> a() {
        java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> m = this.b.m();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(m, 10)), 16));
        java.util.Iterator<T> it = m.iterator();
        while (it.hasNext()) {
            com.ironsource.I i = new com.ironsource.I(this.f5955a, this.b, (com.ironsource.mediationsdk.model.NetworkSettings) it.next());
            kotlin.Pair pair = kotlin.TuplesKt.to(i.c(), i);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    public static final class b implements com.ironsource.InterfaceC3250r3 {
        b() {
        }

        @Override // com.ironsource.InterfaceC3250r3
        public void a(com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
            com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface a2;
            if (com.ironsource.S1.this.h()) {
                a2 = null;
                com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter b = com.ironsource.S1.this.b(networkSettings != null ? networkSettings.getProviderName() : null);
                if (b != null) {
                    a2 = b.getNetworkAdapter();
                }
            } else {
                a2 = com.ironsource.S1.this.a(networkSettings);
            }
            if (a2 != null) {
                com.ironsource.S1.this.f5955a.e().g().b(com.ironsource.S1.this.a(networkSettings, a2));
            }
        }

        @Override // com.ironsource.InterfaceC3250r3
        public void a(java.lang.String str) {
            com.ironsource.S1.this.f5955a.e().h().g(str);
        }
    }

    public /* synthetic */ S1(com.ironsource.V0 v0, com.ironsource.AbstractC3355x0 abstractC3355x0, com.ironsource.C3075h6 c3075h6, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(v0, abstractC3355x0, (i & 4) != 0 ? null : c3075h6);
    }

    public final void a(com.ironsource.S1.d biddingDataListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biddingDataListener, "biddingDataListener");
        com.ironsource.C3286t3 c3286t3 = new com.ironsource.C3286t3();
        com.ironsource.C3286t3.b b2 = b(biddingDataListener);
        this.f5955a.e().g().a(this.b.f());
        this.f5955a.c((com.ironsource.AbstractRunnableC3136ke) new com.ironsource.S1.a(c3286t3, this, b2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(long j, java.util.List<? extends com.ironsource.C3304u3> list, java.util.List<java.lang.String> list2, com.ironsource.S1.d dVar) {
        this.f5955a.e().g().b(j);
        for (com.ironsource.C3304u3 c3304u3 : list) {
            java.lang.String c2 = c3304u3.c();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c2, "biddingResponse.instanceName");
            java.util.Map<java.lang.String, java.lang.Object> a2 = a(c2);
            if (c3304u3.a() != null) {
                this.d.a(c3304u3);
                this.f5955a.e().g().a(a2, c3304u3.e());
            } else {
                this.f5955a.e().g().a(a2, c3304u3.e(), c3304u3.b());
            }
        }
        java.util.Iterator<java.lang.String> it = list2.iterator();
        while (it.hasNext()) {
            this.f5955a.e().g().b(a(it.next()), j);
        }
        dVar.a(this);
    }

    private final java.util.Map<java.lang.String, java.lang.Object> a(java.lang.String str) {
        com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface a2;
        com.ironsource.mediationsdk.model.NetworkSettings a3 = this.b.a(str);
        if (this.f) {
            com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, ?> b2 = b(str);
            a2 = b2 != null ? b2.getNetworkAdapter() : null;
        } else {
            a2 = a(a3);
        }
        return a(a3, a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Map<java.lang.String, java.lang.Object> a(com.ironsource.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface) {
        java.lang.String providerDefaultInstance;
        java.util.HashMap hashMap = new java.util.HashMap();
        if (networkSettings != null) {
            try {
                providerDefaultInstance = networkSettings.getProviderDefaultInstance();
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "getProviderEventData " + (networkSettings != null ? networkSettings.getProviderDefaultInstance() : null), e);
            }
        } else {
            providerDefaultInstance = null;
        }
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, providerDefaultInstance);
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface != null ? adapterBaseInterface.getAdapterVersion() : null);
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface != null ? adapterBaseInterface.getNetworkSDKVersion() : null);
        hashMap.put("spId", networkSettings != null ? networkSettings.getSubProviderId() : null);
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        hashMap.put("instanceType", networkSettings != null ? java.lang.Integer.valueOf(networkSettings.getInstanceType(this.b.b().a())) : null);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface a(com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
        return com.ironsource.mediationsdk.c.b().b(networkSettings, this.b.b().a(), this.b.b().b());
    }
}
