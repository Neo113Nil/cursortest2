package com.ironsource;

/* renamed from: com.ironsource.i2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3089i2 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.AbstractC3355x0 f6299a;
    private final java.util.Map<java.lang.String, java.lang.Object> b;
    private final java.util.List<java.lang.String> c;
    private final java.lang.StringBuilder d;
    private com.ironsource.B e;

    public C3089i2(com.ironsource.AbstractC3355x0 adUnitData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f6299a = adUnitData;
        this.b = new java.util.HashMap();
        this.c = new java.util.ArrayList();
        this.d = new java.lang.StringBuilder();
    }

    public final java.util.Map<java.lang.String, java.lang.Object> a() {
        return this.b;
    }

    public final java.util.List<java.lang.String> b() {
        return this.c;
    }

    public final com.ironsource.B c() {
        return this.e;
    }

    public final java.lang.StringBuilder d() {
        return this.d;
    }

    public final boolean e() {
        return (this.e == null && this.b.isEmpty() && this.c.isEmpty()) ? false : true;
    }

    public final void a(com.ironsource.B b) {
        this.e = b;
        if (b != null) {
            java.lang.StringBuilder sb = this.d;
            sb.append(b.r());
            sb.append(b.p());
            sb.append(",");
        }
    }

    public final void a(com.ironsource.mediationsdk.model.NetworkSettings providerSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        java.util.List<java.lang.String> list = this.c;
        java.lang.String providerInstanceName = providerSettings.getProviderInstanceName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(providerInstanceName, "providerSettings.providerInstanceName");
        list.add(providerInstanceName);
        java.lang.StringBuilder sb = this.d;
        sb.append(providerSettings.getInstanceType(this.f6299a.b().a()));
        sb.append(providerSettings.getProviderInstanceName());
        sb.append(",");
    }

    public final void a(com.ironsource.mediationsdk.model.NetworkSettings providerSettings, java.util.Map<java.lang.String, ? extends java.lang.Object> biddingData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biddingData, "biddingData");
        java.lang.String providerInstanceName = providerSettings.getProviderInstanceName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(providerInstanceName, "providerSettings.providerInstanceName");
        a(providerInstanceName, providerSettings.getInstanceType(this.f6299a.b().a()), biddingData);
    }

    public final void a(com.ironsource.C3304u3 biddingResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biddingResponse, "biddingResponse");
        java.lang.String c = biddingResponse.c();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c, "biddingResponse.instanceName");
        int d = biddingResponse.d();
        java.util.Map<java.lang.String, java.lang.Object> a2 = biddingResponse.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "biddingResponse.biddingData");
        a(c, d, a2);
    }

    private final void a(java.lang.String str, int i, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        this.b.put(str, map);
        java.lang.StringBuilder sb = this.d;
        sb.append(i);
        sb.append(str);
        sb.append(",");
    }
}
