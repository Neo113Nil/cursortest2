package com.ironsource;

/* loaded from: classes5.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.AbstractC3355x0 f5641a;
    private final com.ironsource.mediationsdk.model.NetworkSettings b;
    private final com.ironsource.C3178n2 c;
    private final com.ironsource.C3016e1 d;
    private com.ironsource.C3232q2 e;
    private final int f;
    private final boolean g;
    private final com.ironsource.J h;
    private final com.ironsource.mediationsdk.IronSource.a i;
    private final org.json.JSONObject j;
    private final java.lang.String k;
    private final int l;
    private final java.lang.String m;
    private final com.ironsource.C3232q2 n;
    private final java.lang.String o;
    private final java.lang.String p;
    private final int q;
    private final com.ironsource.mediationsdk.adunit.adapter.utility.AdData r;

    public C(com.ironsource.AbstractC3355x0 adUnitData, com.ironsource.mediationsdk.model.NetworkSettings providerSettings, com.ironsource.C3178n2 auctionData, com.ironsource.C3016e1 adapterConfig, com.ironsource.C3232q2 auctionResponseItem, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionResponseItem, "auctionResponseItem");
        this.f5641a = adUnitData;
        this.b = providerSettings;
        this.c = auctionData;
        this.d = adapterConfig;
        this.e = auctionResponseItem;
        this.f = i;
        this.g = z;
        this.h = new com.ironsource.J(com.ironsource.C3247r0.a.DidntAttemptToLoad);
        com.ironsource.mediationsdk.IronSource.a a2 = adUnitData.b().a();
        this.i = a2;
        this.j = auctionData.h();
        this.k = auctionData.g();
        this.l = auctionData.i();
        this.m = auctionData.f();
        this.n = auctionData.j();
        java.lang.String f = adapterConfig.f();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f, "adapterConfig.providerName");
        this.o = f;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format("%s %s", java.util.Arrays.copyOf(new java.lang.Object[]{f, java.lang.Integer.valueOf(hashCode())}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        this.p = format;
        this.q = adapterConfig.d();
        java.lang.String k = this.e.k();
        java.util.Map<java.lang.String, java.lang.Object> a3 = com.ironsource.C3079ha.a(this.e.a());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a3, "jsonObjectToMap(auctionResponseItem.adData)");
        a3.put("adUnit", a2);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Map<java.lang.String, java.lang.Object> a4 = com.ironsource.C3079ha.a(adapterConfig.c());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a4, "jsonObjectToMap(adapterConfig.adUnitSettings)");
        hashMap.putAll(a4);
        a3.put("userId", adUnitData.r());
        a3.put("adUnitId", adUnitData.b().c());
        a3.put("isMultipleAdUnits", java.lang.Boolean.TRUE);
        this.r = new com.ironsource.mediationsdk.adunit.adapter.utility.AdData(k, hashMap, a3);
    }

    public final com.ironsource.AbstractC3355x0 a() {
        return this.f5641a;
    }

    public final com.ironsource.mediationsdk.model.NetworkSettings b() {
        return this.b;
    }

    public final com.ironsource.C3178n2 c() {
        return this.c;
    }

    public final com.ironsource.C3016e1 d() {
        return this.d;
    }

    public final com.ironsource.C3232q2 e() {
        return this.e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.C)) {
            return false;
        }
        com.ironsource.C c = (com.ironsource.C) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5641a, c.f5641a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, c.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, c.e) && this.f == c.f && this.g == c.g;
    }

    public final int f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
    }

    public final com.ironsource.mediationsdk.adunit.adapter.utility.AdData h() {
        return this.r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((this.f5641a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f) * 31;
        boolean z = this.g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final com.ironsource.mediationsdk.IronSource.a i() {
        return this.i;
    }

    public final com.ironsource.AbstractC3355x0 j() {
        return this.f5641a;
    }

    public final com.ironsource.C3016e1 k() {
        return this.d;
    }

    public final com.ironsource.C3178n2 l() {
        return this.c;
    }

    public final java.lang.String m() {
        return this.m;
    }

    public final java.lang.String n() {
        return this.k;
    }

    public final com.ironsource.C3232q2 o() {
        return this.e;
    }

    public final int p() {
        return this.l;
    }

    public final com.ironsource.C3232q2 q() {
        return this.n;
    }

    public final org.json.JSONObject r() {
        return this.j;
    }

    public final java.lang.String s() {
        return this.o;
    }

    public final int t() {
        return this.q;
    }

    public java.lang.String toString() {
        return "AdInstanceData(adUnitData=" + this.f5641a + ", providerSettings=" + this.b + ", auctionData=" + this.c + ", adapterConfig=" + this.d + ", auctionResponseItem=" + this.e + ", sessionDepth=" + this.f + ", isPreloaded=" + this.g + ")";
    }

    public final com.ironsource.J u() {
        return this.h;
    }

    public final com.ironsource.mediationsdk.model.NetworkSettings v() {
        return this.b;
    }

    public final int w() {
        return this.f;
    }

    public final java.lang.String x() {
        return this.p;
    }

    public final boolean y() {
        return this.g;
    }

    public final com.ironsource.C a(com.ironsource.AbstractC3355x0 adUnitData, com.ironsource.mediationsdk.model.NetworkSettings providerSettings, com.ironsource.C3178n2 auctionData, com.ironsource.C3016e1 adapterConfig, com.ironsource.C3232q2 auctionResponseItem, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionResponseItem, "auctionResponseItem");
        return new com.ironsource.C(adUnitData, providerSettings, auctionData, adapterConfig, auctionResponseItem, i, z);
    }

    public static /* synthetic */ com.ironsource.C a(com.ironsource.C c, com.ironsource.AbstractC3355x0 abstractC3355x0, com.ironsource.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.C3178n2 c3178n2, com.ironsource.C3016e1 c3016e1, com.ironsource.C3232q2 c3232q2, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            abstractC3355x0 = c.f5641a;
        }
        if ((i2 & 2) != 0) {
            networkSettings = c.b;
        }
        com.ironsource.mediationsdk.model.NetworkSettings networkSettings2 = networkSettings;
        if ((i2 & 4) != 0) {
            c3178n2 = c.c;
        }
        com.ironsource.C3178n2 c3178n22 = c3178n2;
        if ((i2 & 8) != 0) {
            c3016e1 = c.d;
        }
        com.ironsource.C3016e1 c3016e12 = c3016e1;
        if ((i2 & 16) != 0) {
            c3232q2 = c.e;
        }
        com.ironsource.C3232q2 c3232q22 = c3232q2;
        if ((i2 & 32) != 0) {
            i = c.f;
        }
        int i3 = i;
        if ((i2 & 64) != 0) {
            z = c.g;
        }
        return c.a(abstractC3355x0, networkSettings2, c3178n22, c3016e12, c3232q22, i3, z);
    }

    public final void a(com.ironsource.C3232q2 c3232q2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c3232q2, "<set-?>");
        this.e = c3232q2;
    }

    public final void a(com.ironsource.C3247r0.a performance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(performance, "performance");
        this.h.b(performance);
    }

    public /* synthetic */ C(com.ironsource.AbstractC3355x0 abstractC3355x0, com.ironsource.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.C3178n2 c3178n2, com.ironsource.C3016e1 c3016e1, com.ironsource.C3232q2 c3232q2, int i, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC3355x0, networkSettings, c3178n2, c3016e1, c3232q2, i, (i2 & 64) != 0 ? false : z);
    }
}
