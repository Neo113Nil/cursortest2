package com.ironsource;

/* loaded from: classes5.dex */
public abstract class Hg {
    public static final com.ironsource.Hg.a d = new com.ironsource.Hg.a(null);

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.V0 f5745a;
    private final com.ironsource.AbstractC3355x0 b;
    private final com.ironsource.Uc c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.ironsource.Hg a(com.ironsource.V0 adTools, com.ironsource.AbstractC3355x0 adUnitData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
            return adUnitData.t() ? new com.ironsource.C3285t2(adTools, adUnitData) : new com.ironsource.Dc(adTools, adUnitData);
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5746a;

        static {
            int[] iArr = new int[com.ironsource.mediationsdk.IronSource.a.values().length];
            try {
                iArr[com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f5746a = iArr;
        }
    }

    public static final class c implements com.ironsource.Uc {
        c() {
        }

        @Override // com.ironsource.Uc
        public /* synthetic */ void a(com.ironsource.B b, java.lang.String str, com.ironsource.C3150la c3150la) {
            com.ironsource.Uc.CC.$default$a(this, b, str, c3150la);
        }

        @Override // com.ironsource.Uc
        public /* synthetic */ void a(java.util.List list, com.ironsource.B b) {
            com.ironsource.Uc.CC.$default$a(this, list, b);
        }
    }

    public Hg(com.ironsource.V0 adTools, com.ironsource.AbstractC3355x0 adUnitData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f5745a = adTools;
        this.b = adUnitData;
        this.c = new com.ironsource.Hg.c();
    }

    private final com.ironsource.InterfaceC3350wd b() {
        int i = com.ironsource.Hg.b.f5746a[this.b.b().a().ordinal()];
        if (i == 1) {
            return com.ironsource.Jb.u.d().B();
        }
        if (i == 2) {
            return com.ironsource.Jb.u.d().F();
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning(com.ironsource.C3212p0.a(this.f5745a, "Unable to reset preloaded instance", (java.lang.String) null, 2, (java.lang.Object) null));
        return null;
    }

    public com.ironsource.Uc a() {
        return this.c;
    }

    public abstract void a(com.ironsource.E e, com.ironsource.Ig ig);

    protected final void c() {
        com.ironsource.InterfaceC3350wd b2 = b();
        if (b2 == null) {
            return;
        }
        b2.a(this.b.b().c(), false);
    }

    public static /* synthetic */ com.ironsource.Jg a(com.ironsource.Hg hg, java.util.List list, java.util.Map map, com.ironsource.C3178n2 c3178n2, com.ironsource.E e, com.ironsource.B b2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAdInstanceWaterfall");
        }
        if ((i & 16) != 0) {
            b2 = null;
        }
        return hg.a(list, map, c3178n2, e, b2);
    }

    public final com.ironsource.Jg a(java.util.List<? extends com.ironsource.C3232q2> waterfallItems, java.util.Map<java.lang.String, com.ironsource.I> adInstancePayloads, com.ironsource.C3178n2 auctionData, com.ironsource.E adInstanceFactory, com.ironsource.B b2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallItems, "waterfallItems");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstancePayloads, "adInstancePayloads");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.C3212p0.a(this.f5745a, "waterfall.size() = " + waterfallItems.size(), (java.lang.String) null, 2, (java.lang.Object) null));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = waterfallItems.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            com.ironsource.C3232q2 c3232q2 = waterfallItems.get(i);
            if (!z && b2 != null && kotlin.jvm.internal.Intrinsics.areEqual(b2.p(), c3232q2.c())) {
                b2.a(c3232q2);
                arrayList.add(b2);
                z = true;
            } else {
                com.ironsource.B a2 = a(c3232q2, auctionData, adInstanceFactory, adInstancePayloads.get(c3232q2.c()));
                if (a2 != null && a2.g() != null) {
                    arrayList.add(a2);
                }
            }
        }
        if (b2 != null && !z) {
            c();
        }
        com.ironsource.Jg jg = new com.ironsource.Jg(arrayList);
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.C3212p0.a(this.f5745a, "updateWaterfall() - next waterfall is " + jg.d(), (java.lang.String) null, 2, (java.lang.Object) null));
        return jg;
    }

    private final com.ironsource.B a(com.ironsource.C3232q2 c3232q2, com.ironsource.C3178n2 c3178n2, com.ironsource.E e, com.ironsource.I i) {
        com.ironsource.AbstractC3355x0 abstractC3355x0 = this.b;
        java.lang.String c2 = c3232q2.c();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c2, "item.instanceName");
        com.ironsource.mediationsdk.model.NetworkSettings a2 = abstractC3355x0.a(c2);
        if (a2 == null) {
            java.lang.String c3 = c3232q2.c();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c3, "item.instanceName");
            a("Could not find matching provider settings for auction response item", c3);
            return null;
        }
        if (i == null) {
            java.lang.String c4 = c3232q2.c();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c4, "item.instanceName");
            a("Could not find matching adInstancePayload for auction response item", c4);
            return null;
        }
        com.ironsource.mediationsdk.c.b().b(a2, this.b.b().a(), this.b.b().b());
        int f = this.f5745a.f();
        com.ironsource.AbstractC3355x0 abstractC3355x02 = this.b;
        return e.a(new com.ironsource.C(abstractC3355x02, a2, c3178n2, new com.ironsource.C3016e1(a2, abstractC3355x02.b(a2), this.b.b().a()), c3232q2, f, false, 64, null), i);
    }

    private final void a(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = str + " - item = " + str2;
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(com.ironsource.C3212p0.a(this.f5745a, str3, (java.lang.String) null, 2, (java.lang.Object) null));
        this.f5745a.e().h().i(str3);
    }
}
