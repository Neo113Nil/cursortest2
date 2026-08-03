package com.ironsource;

/* loaded from: classes5.dex */
public final class M2 extends com.ironsource.AbstractC3355x0 {
    public static final com.ironsource.M2.a z = new com.ironsource.M2.a(null);
    private final com.ironsource.J2 t;
    private final boolean u;
    private final com.ironsource.C3337w0 v;
    private final com.ironsource.U2 w;
    private final java.lang.String x;
    private final java.lang.String y;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.ironsource.M2 a(com.ironsource.J2 adProperties, com.ironsource.Ua ua, boolean z) {
            java.util.List<com.ironsource.C3367xc> emptyList;
            com.ironsource.Ve d;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            com.ironsource.AbstractC3355x0.a aVar = com.ironsource.AbstractC3355x0.r;
            com.ironsource.N3 c = (ua == null || (d = ua.d()) == null) ? null : d.c();
            com.ironsource.U2 c2 = c != null ? c.c() : null;
            if (c2 == null) {
                throw new java.lang.IllegalStateException("Error getting " + adProperties.a() + " configurations");
            }
            if (ua == null || (emptyList = ua.d(adProperties.e(), adProperties.c())) == null) {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            java.lang.String f = com.ironsource.mediationsdk.utils.IronSourceUtils.f();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(emptyList, 10));
            java.util.Iterator<T> it = emptyList.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.ironsource.C3367xc) it.next()).f());
            }
            com.ironsource.C3150la b = com.ironsource.C3150la.b();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "getInstance()");
            return new com.ironsource.M2(adProperties, z, new com.ironsource.C3337w0(f, arrayList, b), c2);
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public M2(com.ironsource.J2 adProperties, boolean z2, com.ironsource.C3337w0 adUnitCommonData, com.ironsource.U2 configs) {
        super(adProperties, z2, r3, r4, r5, r7, configs.a(), (int) (configs.b() / 1000), configs.c(), configs.f(), -1, new com.ironsource.O0(com.ironsource.O0.a.MANUAL_WITH_AUTOMATIC_RELOAD, configs.d().j(), configs.d().b(), 1000 * configs.h()), configs.e(), configs.l(), configs.n(), configs.m(), false, 65536, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configs, "configs");
        java.lang.String f = adUnitCommonData.f();
        java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> d = adUnitCommonData.d();
        com.ironsource.C3150la e = adUnitCommonData.e();
        com.ironsource.C3267s2 d2 = configs.d();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d2, "configs.bannerAuctionSettings");
        this.t = adProperties;
        this.u = z2;
        this.v = adUnitCommonData;
        this.w = configs;
        this.x = "BN";
        this.y = com.ironsource.Va.d;
    }

    @Override // com.ironsource.AbstractC3355x0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public com.ironsource.J2 b() {
        return this.t;
    }

    public final com.ironsource.C3337w0 B() {
        return this.v;
    }

    public final com.ironsource.U2 C() {
        return this.w;
    }

    public final com.ironsource.M2 a(com.ironsource.J2 adProperties, boolean z2, com.ironsource.C3337w0 adUnitCommonData, com.ironsource.U2 configs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configs, "configs");
        return new com.ironsource.M2(adProperties, z2, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC3355x0
    public java.lang.String c() {
        return this.x;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.M2)) {
            return false;
        }
        com.ironsource.M2 m2 = (com.ironsource.M2) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.t, m2.t) && this.u == m2.u && kotlin.jvm.internal.Intrinsics.areEqual(this.v, m2.v) && kotlin.jvm.internal.Intrinsics.areEqual(this.w, m2.w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.t.hashCode() * 31;
        boolean z2 = this.u;
        int i = z2;
        if (z2 != 0) {
            i = 1;
        }
        return ((((hashCode + i) * 31) + this.v.hashCode()) * 31) + this.w.hashCode();
    }

    @Override // com.ironsource.AbstractC3355x0
    public java.lang.String j() {
        return this.y;
    }

    public java.lang.String toString() {
        return "BannerAdUnitData(adProperties=" + this.t + ", isPublisherLoad=" + this.u + ", adUnitCommonData=" + this.v + ", configs=" + this.w + ")";
    }

    @Override // com.ironsource.AbstractC3355x0
    public boolean u() {
        return this.u;
    }

    public final com.ironsource.J2 w() {
        return this.t;
    }

    public final boolean x() {
        return this.u;
    }

    public final com.ironsource.C3337w0 y() {
        return this.v;
    }

    public final com.ironsource.U2 z() {
        return this.w;
    }

    public static /* synthetic */ com.ironsource.M2 a(com.ironsource.M2 m2, com.ironsource.J2 j2, boolean z2, com.ironsource.C3337w0 c3337w0, com.ironsource.U2 u2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j2 = m2.t;
        }
        if ((i & 2) != 0) {
            z2 = m2.u;
        }
        if ((i & 4) != 0) {
            c3337w0 = m2.v;
        }
        if ((i & 8) != 0) {
            u2 = m2.w;
        }
        return m2.a(j2, z2, c3337w0, u2);
    }

    @Override // com.ironsource.AbstractC3355x0
    public org.json.JSONObject b(com.ironsource.mediationsdk.model.NetworkSettings providerSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        org.json.JSONObject bannerSettings = providerSettings.getBannerSettings();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bannerSettings, "providerSettings.bannerSettings");
        return bannerSettings;
    }

    @Override // com.ironsource.AbstractC3355x0
    public com.ironsource.mediationsdk.adunit.adapter.utility.AdData a(com.ironsource.mediationsdk.model.NetworkSettings providerSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        com.ironsource.mediationsdk.adunit.adapter.utility.AdData createAdDataForNetworkAdapter = com.ironsource.mediationsdk.adunit.adapter.utility.AdData.createAdDataForNetworkAdapter(b(providerSettings), b().a(), r(), new com.ironsource.mediationsdk.o(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), new com.ironsource.C3158m0().b(b().i())));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createAdDataForNetworkAdapter, "createAdDataForNetworkAd…ze(adProperties.adSize)))");
        return createAdDataForNetworkAdapter;
    }
}
