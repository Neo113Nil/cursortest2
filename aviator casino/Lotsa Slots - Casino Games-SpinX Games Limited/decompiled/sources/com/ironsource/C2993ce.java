package com.ironsource;

/* renamed from: com.ironsource.ce, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2993ce extends com.ironsource.AbstractC3355x0 {
    public static final com.ironsource.C2993ce.a z = new com.ironsource.C2993ce.a(null);
    private final com.ironsource.C3069h0 t;
    private final boolean u;
    private final com.ironsource.C3337w0 v;
    private final com.ironsource.C3029ee w;
    private final java.lang.String x;
    private final java.lang.String y;

    /* renamed from: com.ironsource.ce$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.ironsource.C2993ce a(com.ironsource.C3069h0 adProperties, com.ironsource.Ua ua, boolean z) {
            java.util.List<com.ironsource.C3367xc> emptyList;
            com.ironsource.Ve d;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            com.ironsource.AbstractC3355x0.a aVar = com.ironsource.AbstractC3355x0.r;
            com.ironsource.N3 c = (ua == null || (d = ua.d()) == null) ? null : d.c();
            com.ironsource.C3029ee f = c != null ? c.f() : null;
            if (f == null) {
                throw new java.lang.IllegalStateException("Error getting " + adProperties.a() + " configurations");
            }
            if (ua == null || (emptyList = ua.d(adProperties.e(), adProperties.c())) == null) {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            java.lang.String f2 = com.ironsource.mediationsdk.utils.IronSourceUtils.f();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(emptyList, 10));
            java.util.Iterator<T> it = emptyList.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.ironsource.C3367xc) it.next()).f());
            }
            com.ironsource.C3150la b = com.ironsource.C3150la.b();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "getInstance()");
            return new com.ironsource.C2993ce(adProperties, z, new com.ironsource.C3337w0(f2, arrayList, b), f);
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2993ce(com.ironsource.C3069h0 adProperties, boolean z2, com.ironsource.C3337w0 adUnitCommonData, com.ironsource.C3029ee configs) {
        super(adProperties, z2, r3, r4, r5, r7, configs.g(), configs.h(), configs.j(), configs.b(), configs.c(), new com.ironsource.O0(com.ironsource.O0.a.MANUAL, configs.k().j(), configs.k().b(), -1L), configs.l(), configs.f(), configs.o(), configs.n(), false, 65536, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configs, "configs");
        java.lang.String f = adUnitCommonData.f();
        java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> d = adUnitCommonData.d();
        com.ironsource.C3150la e = adUnitCommonData.e();
        com.ironsource.C3267s2 k = configs.k();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k, "configs.rewardedVideoAuctionSettings");
        this.t = adProperties;
        this.u = z2;
        this.v = adUnitCommonData;
        this.w = configs;
        this.x = com.ironsource.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.y = com.ironsource.Va.b;
    }

    public final com.ironsource.C3337w0 A() {
        return this.v;
    }

    public final com.ironsource.C3029ee B() {
        return this.w;
    }

    public final com.ironsource.C2993ce a(com.ironsource.C3069h0 adProperties, boolean z2, com.ironsource.C3337w0 adUnitCommonData, com.ironsource.C3029ee configs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configs, "configs");
        return new com.ironsource.C2993ce(adProperties, z2, adUnitCommonData, configs);
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
        if (!(obj instanceof com.ironsource.C2993ce)) {
            return false;
        }
        com.ironsource.C2993ce c2993ce = (com.ironsource.C2993ce) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.t, c2993ce.t) && this.u == c2993ce.u && kotlin.jvm.internal.Intrinsics.areEqual(this.v, c2993ce.v) && kotlin.jvm.internal.Intrinsics.areEqual(this.w, c2993ce.w);
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
        return "RewardedAdUnitData(adProperties=" + this.t + ", isPublisherLoad=" + this.u + ", adUnitCommonData=" + this.v + ", configs=" + this.w + ")";
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

    public final com.ironsource.C3029ee z() {
        return this.w;
    }

    public static /* synthetic */ com.ironsource.C2993ce a(com.ironsource.C2993ce c2993ce, com.ironsource.C3069h0 c3069h0, boolean z2, com.ironsource.C3337w0 c3337w0, com.ironsource.C3029ee c3029ee, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c3069h0 = c2993ce.t;
        }
        if ((i & 2) != 0) {
            z2 = c2993ce.u;
        }
        if ((i & 4) != 0) {
            c3337w0 = c2993ce.v;
        }
        if ((i & 8) != 0) {
            c3029ee = c2993ce.w;
        }
        return c2993ce.a(c3069h0, z2, c3337w0, c3029ee);
    }

    @Override // com.ironsource.AbstractC3355x0
    public org.json.JSONObject b(com.ironsource.mediationsdk.model.NetworkSettings providerSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        org.json.JSONObject rewardedVideoSettings = providerSettings.getRewardedVideoSettings();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rewardedVideoSettings, "providerSettings.rewardedVideoSettings");
        return rewardedVideoSettings;
    }
}
