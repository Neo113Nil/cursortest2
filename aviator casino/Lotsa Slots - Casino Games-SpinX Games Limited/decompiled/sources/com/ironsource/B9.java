package com.ironsource;

/* loaded from: classes5.dex */
public final class B9 extends com.ironsource.AbstractC3355x0 {
    public static final com.ironsource.B9.a z = new com.ironsource.B9.a(null);
    private final com.ironsource.C3069h0 t;
    private final boolean u;
    private final com.ironsource.C3337w0 v;
    private final com.ironsource.D9 w;
    private final java.lang.String x;
    private final java.lang.String y;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.ironsource.B9 a(com.ironsource.C3069h0 adProperties, com.ironsource.Ua ua, boolean z) {
            java.util.List<com.ironsource.C3367xc> emptyList;
            com.ironsource.Ve d;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            com.ironsource.AbstractC3355x0.a aVar = com.ironsource.AbstractC3355x0.r;
            com.ironsource.N3 c = (ua == null || (d = ua.d()) == null) ? null : d.c();
            com.ironsource.D9 d2 = c != null ? c.d() : null;
            if (d2 == null) {
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
            return new com.ironsource.B9(adProperties, z, new com.ironsource.C3337w0(f, arrayList, b), d2);
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public B9(com.ironsource.C3069h0 adProperties, boolean z2, com.ironsource.C3337w0 adUnitCommonData, com.ironsource.D9 configs) {
        super(adProperties, z2, r3, r4, r5, r7, configs.c(), configs.d(), configs.f(), configs.b(), -1, new com.ironsource.O0(com.ironsource.O0.a.MANUAL, configs.g().j(), configs.g().b(), -1L), configs.h(), configs.k(), configs.m(), configs.l(), false, 65536, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configs, "configs");
        java.lang.String f = adUnitCommonData.f();
        java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> d = adUnitCommonData.d();
        com.ironsource.C3150la e = adUnitCommonData.e();
        com.ironsource.C3267s2 g = configs.g();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(g, "configs.interstitialAuctionSettings");
        this.t = adProperties;
        this.u = z2;
        this.v = adUnitCommonData;
        this.w = configs;
        this.x = com.ironsource.mediationsdk.utils.IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.y = com.ironsource.Va.c;
    }

    public final com.ironsource.C3337w0 A() {
        return this.v;
    }

    public final com.ironsource.D9 B() {
        return this.w;
    }

    public final com.ironsource.B9 a(com.ironsource.C3069h0 adProperties, boolean z2, com.ironsource.C3337w0 adUnitCommonData, com.ironsource.D9 configs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configs, "configs");
        return new com.ironsource.B9(adProperties, z2, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC3355x0
    public com.ironsource.C3069h0 b() {
        return this.t;
    }

    @Override // com.ironsource.AbstractC3355x0
    public java.lang.String c() {
        return this.x;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.B9)) {
            return false;
        }
        com.ironsource.B9 b9 = (com.ironsource.B9) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.t, b9.t) && this.u == b9.u && kotlin.jvm.internal.Intrinsics.areEqual(this.v, b9.v) && kotlin.jvm.internal.Intrinsics.areEqual(this.w, b9.w);
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
        return "InterstitialAdUnitData(adProperties=" + this.t + ", isPublisherLoad=" + this.u + ", adUnitCommonData=" + this.v + ", configs=" + this.w + ")";
    }

    @Override // com.ironsource.AbstractC3355x0
    public boolean u() {
        return this.u;
    }

    public final com.ironsource.C3069h0 w() {
        return this.t;
    }

    public final boolean x() {
        return this.u;
    }

    public final com.ironsource.C3337w0 y() {
        return this.v;
    }

    public final com.ironsource.D9 z() {
        return this.w;
    }

    public static /* synthetic */ com.ironsource.B9 a(com.ironsource.B9 b9, com.ironsource.C3069h0 c3069h0, boolean z2, com.ironsource.C3337w0 c3337w0, com.ironsource.D9 d9, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c3069h0 = b9.t;
        }
        if ((i & 2) != 0) {
            z2 = b9.u;
        }
        if ((i & 4) != 0) {
            c3337w0 = b9.v;
        }
        if ((i & 8) != 0) {
            d9 = b9.w;
        }
        return b9.a(c3069h0, z2, c3337w0, d9);
    }

    @Override // com.ironsource.AbstractC3355x0
    public org.json.JSONObject b(com.ironsource.mediationsdk.model.NetworkSettings providerSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        org.json.JSONObject interstitialSettings = providerSettings.getInterstitialSettings();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(interstitialSettings, "providerSettings.interstitialSettings");
        return interstitialSettings;
    }
}
