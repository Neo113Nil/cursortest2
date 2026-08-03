package com.ironsource;

/* renamed from: com.ironsource.t2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3285t2 extends com.ironsource.Hg {
    private final com.ironsource.V0 e;
    private final com.ironsource.AbstractC3355x0 f;
    private final com.ironsource.C3303u2 g;
    private final com.ironsource.Uc h;
    private com.ironsource.InterfaceC3321v2 i;

    /* renamed from: com.ironsource.t2$a */
    public static final class a implements com.ironsource.InterfaceC3321v2 {
        final /* synthetic */ com.ironsource.E b;
        final /* synthetic */ com.ironsource.Ig c;

        a(com.ironsource.E e, com.ironsource.Ig ig) {
            this.b = e;
            this.c = ig;
        }

        @Override // com.ironsource.InterfaceC3321v2
        public void a(final java.util.List<com.ironsource.C3232q2> newWaterfall, final java.util.Map<java.lang.String, com.ironsource.I> adInstancePayloads, final java.lang.String auctionId, final com.ironsource.C3232q2 c3232q2, final org.json.JSONObject jSONObject, final org.json.JSONObject jSONObject2, final int i, final long j, final int i2, final java.lang.String str, final com.ironsource.B b) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newWaterfall, "newWaterfall");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstancePayloads, "adInstancePayloads");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            com.ironsource.V0 v0 = com.ironsource.C3285t2.this.e;
            final com.ironsource.C3285t2 c3285t2 = com.ironsource.C3285t2.this;
            final com.ironsource.E e = this.b;
            final com.ironsource.Ig ig = this.c;
            v0.a(new java.lang.Runnable() { // from class: com.ironsource.t2$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.C3285t2.a.a(com.ironsource.C3285t2.this, e, ig, newWaterfall, adInstancePayloads, auctionId, c3232q2, jSONObject, jSONObject2, i, j, i2, str, b);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(com.ironsource.C3285t2 this$0, com.ironsource.E adInstanceFactory, com.ironsource.Ig waterfallFetcherListener, java.util.List newWaterfall, java.util.Map adInstancePayloads, java.lang.String auctionId, com.ironsource.C3232q2 c3232q2, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, int i, long j, int i2, java.lang.String str, com.ironsource.B b) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstanceFactory, "$adInstanceFactory");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallFetcherListener, "$waterfallFetcherListener");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newWaterfall, "$newWaterfall");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstancePayloads, "$adInstancePayloads");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionId, "$auctionId");
            this$0.i = null;
            this$0.a(adInstanceFactory, waterfallFetcherListener, newWaterfall, adInstancePayloads, auctionId, c3232q2, jSONObject, jSONObject2, i, j, i2, str, b);
        }

        @Override // com.ironsource.InterfaceC3321v2
        public void a(final int i, final java.lang.String str, final int i2, final java.lang.String auctionFallback, final long j, final com.ironsource.B b) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
            com.ironsource.V0 v0 = com.ironsource.C3285t2.this.e;
            final com.ironsource.C3285t2 c3285t2 = com.ironsource.C3285t2.this;
            final com.ironsource.E e = this.b;
            final com.ironsource.Ig ig = this.c;
            v0.a(new java.lang.Runnable() { // from class: com.ironsource.t2$a$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.C3285t2.a.a(com.ironsource.C3285t2.this, e, ig, i, str, i2, auctionFallback, j, b);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(com.ironsource.C3285t2 this$0, com.ironsource.E adInstanceFactory, com.ironsource.Ig waterfallFetcherListener, int i, java.lang.String str, int i2, java.lang.String auctionFallback, long j, com.ironsource.B b) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstanceFactory, "$adInstanceFactory");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallFetcherListener, "$waterfallFetcherListener");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionFallback, "$auctionFallback");
            this$0.i = null;
            this$0.a(adInstanceFactory, waterfallFetcherListener, i, str, i2, auctionFallback, j, b);
        }

        @Override // com.ironsource.InterfaceC3321v2
        public void a(int i, java.lang.String errorReason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            this.c.a(i, errorReason);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3285t2(com.ironsource.V0 adTools, com.ironsource.AbstractC3355x0 adUnitData) {
        super(adTools, adUnitData);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.e = adTools;
        this.f = adUnitData;
        com.ironsource.C3303u2 c3303u2 = new com.ironsource.C3303u2(adTools, adUnitData);
        this.g = c3303u2;
        this.h = c3303u2.b();
    }

    @Override // com.ironsource.Hg
    public com.ironsource.Uc a() {
        return this.h;
    }

    @Override // com.ironsource.Hg
    public void a(com.ironsource.E adInstanceFactory, com.ironsource.Ig waterfallFetcherListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallFetcherListener, "waterfallFetcherListener");
        com.ironsource.C3285t2.a aVar = new com.ironsource.C3285t2.a(adInstanceFactory, waterfallFetcherListener);
        this.g.a(aVar);
        this.i = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(com.ironsource.E e, com.ironsource.Ig ig, java.util.List<com.ironsource.C3232q2> list, java.util.Map<java.lang.String, com.ironsource.I> map, java.lang.String str, com.ironsource.C3232q2 c3232q2, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, int i, long j, int i2, java.lang.String str2, com.ironsource.B b) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.C3212p0.a(this.e, (java.lang.String) null, (java.lang.String) null, 3, (java.lang.Object) null));
        com.ironsource.C3178n2 c3178n2 = new com.ironsource.C3178n2(str, jSONObject, c3232q2, i, "");
        if (!android.text.TextUtils.isEmpty(str2)) {
            this.e.e().h().a(i2, str2);
        }
        a(jSONObject2);
        com.ironsource.Jg a2 = a(list, map, c3178n2, e, b);
        this.e.e().a(new com.ironsource.W1(c3178n2));
        this.e.e().b().a(j, this.f.v() + ";wtf=" + a2.c());
        this.e.e().b().c(a2.d());
        a(a2, ig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(com.ironsource.E e, com.ironsource.Ig ig, int i, java.lang.String str, int i2, java.lang.String str2, long j, com.ironsource.B b) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.C3212p0.a(this.e, "Auction failed (error " + i + " - " + str + ")", (java.lang.String) null, 2, (java.lang.Object) null));
        if (b != null) {
            c();
        }
        boolean n = this.f.e().n();
        java.lang.String a2 = com.ironsource.C2945a2.f6130a.a(n);
        com.ironsource.C3178n2 c3178n2 = new com.ironsource.C3178n2(a2, null, null, i2, str2);
        com.ironsource.C3396z5 e2 = this.e.e();
        e2.a(new com.ironsource.W1(c3178n2));
        e2.b().a(j, i, str);
        if (n) {
            a(e, ig, i2, str2, a2);
        } else {
            a(ig);
        }
    }

    private final void a(com.ironsource.Jg jg, com.ironsource.Ig ig) {
        this.e.h().a(jg);
        ig.a(jg);
    }

    private final void a(org.json.JSONObject jSONObject) {
        int i;
        try {
            if (jSONObject == null) {
                this.f.b(false);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.C3212p0.a(this.e, "loading configuration from auction response is null, using the following: " + this.f.v(), (java.lang.String) null, 2, (java.lang.Object) null));
                return;
            }
            try {
                if (jSONObject.has(com.ironsource.mediationsdk.d.x) && (i = jSONObject.getInt(com.ironsource.mediationsdk.d.x)) > 0) {
                    this.f.a(i);
                }
                if (jSONObject.has(com.ironsource.mediationsdk.d.y)) {
                    this.f.a(jSONObject.getBoolean(com.ironsource.mediationsdk.d.y));
                } else if (this.f.b().h() && com.ironsource.Jb.u.d().h().l()) {
                    com.ironsource.AbstractC3355x0 abstractC3355x0 = this.f;
                    abstractC3355x0.a(java.lang.Math.max(2, abstractC3355x0.k()));
                }
                this.f.b(jSONObject.optBoolean(com.ironsource.mediationsdk.d.z, false));
            } catch (org.json.JSONException e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
                ironLog.error("failed to update loading configuration for" + this.f.b().a() + " Error: " + e.getMessage());
                ironLog.verbose(com.ironsource.C3212p0.a(this.e, this.f.v(), (java.lang.String) null, 2, (java.lang.Object) null));
            }
        } finally {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.C3212p0.a(this.e, this.f.v(), (java.lang.String) null, 2, (java.lang.Object) null));
        }
    }

    private final void a(com.ironsource.E e, com.ironsource.Ig ig, int i, java.lang.String str, java.lang.String str2) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.C3212p0.a(this.e, "Moving to fallback waterfall", (java.lang.String) null, 2, (java.lang.Object) null));
        new com.ironsource.Dc(this.e, this.f).a(ig, i, str, str2, e);
    }

    private final void a(com.ironsource.Ig ig) {
        ig.a(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill");
    }
}
