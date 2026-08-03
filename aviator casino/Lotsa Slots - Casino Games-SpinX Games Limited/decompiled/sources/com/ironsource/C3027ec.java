package com.ironsource;

/* renamed from: com.ironsource.ec, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3027ec extends com.ironsource.AbstractC3355x0 {
    public static final com.ironsource.C3027ec.a y = new com.ironsource.C3027ec.a(null);
    private final com.ironsource.C3069h0 t;
    private final com.ironsource.C3337w0 u;
    private final com.ironsource.Pb v;
    private final java.lang.String w;
    private final java.lang.String x;

    /* renamed from: com.ironsource.ec$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.ironsource.C3027ec a(com.ironsource.C3069h0 adProperties, com.ironsource.Ua ua) {
            java.util.List<com.ironsource.C3367xc> emptyList;
            com.ironsource.Ve d;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            com.ironsource.AbstractC3355x0.a aVar = com.ironsource.AbstractC3355x0.r;
            com.ironsource.N3 c = (ua == null || (d = ua.d()) == null) ? null : d.c();
            com.ironsource.Pb e = c != null ? c.e() : null;
            if (e == null) {
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
            return new com.ironsource.C3027ec(adProperties, new com.ironsource.C3337w0(f, arrayList, b), e);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3027ec(com.ironsource.C3069h0 adProperties, com.ironsource.C3337w0 adUnitCommonData, com.ironsource.Pb configs) {
        super(adProperties, true, adUnitCommonData.f(), adUnitCommonData.d(), adUnitCommonData.e(), configs.d(), configs.b(), (int) (configs.c() / 1000), configs.a(), configs.f(), -1, new com.ironsource.O0(com.ironsource.O0.a.MANUAL, configs.d().j(), configs.d().b(), -1L), configs.h(), configs.i(), configs.k(), configs.j(), false, 65536, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configs, "configs");
        this.t = adProperties;
        this.u = adUnitCommonData;
        this.v = configs;
        this.w = "NA";
        this.x = com.ironsource.Va.e;
    }

    public final com.ironsource.Pb A() {
        return this.v;
    }

    public final com.ironsource.C3027ec a(com.ironsource.C3069h0 adProperties, com.ironsource.C3337w0 adUnitCommonData, com.ironsource.Pb configs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configs, "configs");
        return new com.ironsource.C3027ec(adProperties, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC3355x0
    public com.ironsource.C3069h0 b() {
        return this.t;
    }

    @Override // com.ironsource.AbstractC3355x0
    public java.lang.String c() {
        return this.w;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.C3027ec)) {
            return false;
        }
        com.ironsource.C3027ec c3027ec = (com.ironsource.C3027ec) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.t, c3027ec.t) && kotlin.jvm.internal.Intrinsics.areEqual(this.u, c3027ec.u) && kotlin.jvm.internal.Intrinsics.areEqual(this.v, c3027ec.v);
    }

    public int hashCode() {
        return (((this.t.hashCode() * 31) + this.u.hashCode()) * 31) + this.v.hashCode();
    }

    @Override // com.ironsource.AbstractC3355x0
    public java.lang.String j() {
        return this.x;
    }

    public java.lang.String toString() {
        return "NativeAdUnitData(adProperties=" + this.t + ", adUnitCommonData=" + this.u + ", configs=" + this.v + ")";
    }

    public final com.ironsource.C3069h0 w() {
        return this.t;
    }

    public final com.ironsource.C3337w0 x() {
        return this.u;
    }

    public final com.ironsource.Pb y() {
        return this.v;
    }

    public final com.ironsource.C3337w0 z() {
        return this.u;
    }

    public static /* synthetic */ com.ironsource.C3027ec a(com.ironsource.C3027ec c3027ec, com.ironsource.C3069h0 c3069h0, com.ironsource.C3337w0 c3337w0, com.ironsource.Pb pb, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c3069h0 = c3027ec.t;
        }
        if ((i & 2) != 0) {
            c3337w0 = c3027ec.u;
        }
        if ((i & 4) != 0) {
            pb = c3027ec.v;
        }
        return c3027ec.a(c3069h0, c3337w0, pb);
    }

    @Override // com.ironsource.AbstractC3355x0
    public org.json.JSONObject b(com.ironsource.mediationsdk.model.NetworkSettings providerSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        org.json.JSONObject nativeAdSettings = providerSettings.getNativeAdSettings();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }
}
