package com.ironsource;

/* renamed from: com.ironsource.u2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3303u2 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.V0 f6752a;
    private final com.ironsource.AbstractC3355x0 b;
    private final com.ironsource.mediationsdk.e c;
    private final com.ironsource.C3071h2 d;

    /* renamed from: com.ironsource.u2$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6753a;

        static {
            int[] iArr = new int[com.unity3d.mediation.LevelPlay.AdFormat.values().length];
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.REWARDED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f6753a = iArr;
        }
    }

    /* renamed from: com.ironsource.u2$b */
    public static final class b implements com.ironsource.S1.d {
        final /* synthetic */ com.ironsource.InterfaceC3321v2 b;

        b(com.ironsource.InterfaceC3321v2 interfaceC3321v2) {
            this.b = interfaceC3321v2;
        }

        @Override // com.ironsource.S1.d
        public void a(com.ironsource.S1 auction) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auction, "auction");
            com.ironsource.C3303u2.this.b(auction, this.b);
        }

        @Override // com.ironsource.S1.d
        public void a(com.ironsource.S1 auction, java.lang.String error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auction, "auction");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            com.ironsource.C3303u2.this.b(auction, this.b);
        }
    }

    public C3303u2(com.ironsource.V0 adTools, com.ironsource.AbstractC3355x0 adUnitData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f6752a = adTools;
        this.b = adUnitData;
        com.ironsource.C3267s2 e = adUnitData.e();
        java.lang.String d = com.ironsource.mediationsdk.utils.IronSourceUtils.d();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d, "getSessionId()");
        com.ironsource.mediationsdk.e eVar = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(e, d));
        this.c = eVar;
        this.d = new com.ironsource.C3071h2(adTools, eVar);
    }

    private final com.ironsource.InterfaceC3350wd c() {
        int i = com.ironsource.C3303u2.a.f6753a[this.b.b().e().ordinal()];
        if (i == 1) {
            return com.ironsource.Jb.u.d().B();
        }
        if (i != 2) {
            return null;
        }
        return com.ironsource.Jb.u.d().F();
    }

    private final com.ironsource.C3075h6 d() {
        com.ironsource.InterfaceC3350wd c2 = c();
        if (c2 != null) {
            return c2.a(this.b.b().c());
        }
        return null;
    }

    public final com.ironsource.C3071h2 b() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(com.ironsource.S1 s1, com.ironsource.InterfaceC3321v2 interfaceC3321v2) {
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose(a("auction waterfallString = " + ((java.lang.Object) s1.d().d())));
        if (!s1.g()) {
            ironLog.verbose(a("auction failed - no candidates"));
            this.f6752a.e().b().a(1005, "No candidates available for auctioning");
            interfaceC3321v2.a(com.ironsource.B0.e(this.b.b().a()), "no available ad to load");
        } else {
            this.f6752a.e().b().b(s1.d().d().toString());
            this.c.a(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), a(s1, this.f6752a.f()), new com.ironsource.C3303u2.c(interfaceC3321v2, s1, s1.d().c()));
        }
    }

    public void a(com.ironsource.InterfaceC3321v2 completionListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completionListener, "completionListener");
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(a());
        this.f6752a.e().b().a(this.b.b().d());
        a(new com.ironsource.S1(this.f6752a, this.b, d()), completionListener);
    }

    private final void a(com.ironsource.S1 s1, com.ironsource.InterfaceC3321v2 interfaceC3321v2) {
        if (!s1.f()) {
            b(s1, interfaceC3321v2);
        } else {
            s1.a(new com.ironsource.C3303u2.b(interfaceC3321v2));
        }
    }

    /* renamed from: com.ironsource.u2$c */
    public static final class c implements com.ironsource.U1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.InterfaceC3321v2 f6755a;
        final /* synthetic */ com.ironsource.S1 b;
        final /* synthetic */ com.ironsource.B c;

        c(com.ironsource.InterfaceC3321v2 interfaceC3321v2, com.ironsource.S1 s1, com.ironsource.B b) {
            this.f6755a = interfaceC3321v2;
            this.b = s1;
            this.c = b;
        }

        @Override // com.ironsource.U1
        public void a(java.util.List<com.ironsource.C3232q2> newWaterfall, java.lang.String auctionId, com.ironsource.C3232q2 c3232q2, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, int i, long j, int i2, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newWaterfall, "newWaterfall");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            this.f6755a.a(newWaterfall, this.b.c(), auctionId, c3232q2, jSONObject, jSONObject2, i, j, i2, str, this.c);
        }

        @Override // com.ironsource.U1
        public void a(int i, java.lang.String str, int i2, java.lang.String auctionFallback, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
            this.f6755a.a(i, str, i2, auctionFallback, j, this.c);
        }
    }

    private final com.ironsource.mediationsdk.h a(com.ironsource.S1 s1, int i) {
        com.ironsource.mediationsdk.h hVar = new com.ironsource.mediationsdk.h(this.b.b().a());
        hVar.b(com.ironsource.mediationsdk.utils.IronSourceUtils.g());
        hVar.a(s1.d().a());
        hVar.a(s1.d().b());
        hVar.a(this.f6752a.h());
        hVar.a(i);
        hVar.a(this.f6752a.k());
        com.ironsource.Qf g = this.b.b().g();
        hVar.e(g != null ? g.c() : false);
        hVar.a(this.b.b().d());
        com.ironsource.B c2 = s1.d().c();
        hVar.d(c2 != null ? c2.p() : null);
        com.ironsource.InterfaceC3124k2 i2 = this.f6752a.i();
        if (i2 != null) {
            i2.a(hVar);
        }
        return hVar;
    }

    private final java.lang.String a(java.lang.String str) {
        return com.ironsource.C3212p0.a(this.f6752a, str, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final java.lang.String a() {
        return com.ironsource.C3212p0.a(this.f6752a, (java.lang.String) null, (java.lang.String) null, 2, (java.lang.Object) null);
    }
}
