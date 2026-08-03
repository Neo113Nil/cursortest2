package com.ironsource;

/* loaded from: classes5.dex */
public final class Ua extends com.ironsource.C3190ne {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6000a;

        static {
            int[] iArr = new int[com.unity3d.mediation.LevelPlay.AdFormat.values().length];
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            f6000a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ua(com.ironsource.C3190ne sdkConfig) {
        super(sdkConfig);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
    }

    public final boolean a(java.lang.String adUnitId, com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        java.util.Map<java.lang.String, com.ironsource.Fd.b> a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        com.ironsource.Fd.a aVar = h().d().a().get(adFormat);
        return (aVar == null || (a2 = aVar.a()) == null || !a2.containsKey(adUnitId)) ? false : true;
    }

    public final com.ironsource.InterfaceC3307u6.a b(com.unity3d.mediation.LevelPlay.AdFormat adFormat, java.lang.String adUnitId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        return new com.ironsource.InterfaceC3307u6.a(a(adFormat, adUnitId));
    }

    public final com.ironsource.C3064gd c(com.unity3d.mediation.LevelPlay.AdFormat adFormat, java.lang.String str) {
        com.ironsource.C3064gd a2;
        com.ironsource.H9 a3;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        int i = com.ironsource.Ua.a.f6000a[adFormat.ordinal()];
        if (i == 1) {
            com.ironsource.C3029ee f = d().c().f();
            if (f == null || (a2 = f.a(str)) == null) {
                return null;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "getRewardedVideoPlacement(placementName)");
            return new com.ironsource.C3064gd(a2.b(), a2.c(), a2.d(), a2.f(), a2.e(), a2.a());
        }
        if (i == 2) {
            com.ironsource.D9 d = d().c().d();
            if (d == null || (a3 = d.a(str)) == null) {
                return null;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a3, "getInterstitialPlacement(placementName)");
            return new com.ironsource.C3064gd(a3);
        }
        if (i == 3) {
            com.ironsource.U2 c = d().c().c();
            if (c == null) {
                throw new java.lang.IllegalStateException("Error getting " + adFormat + " configurations");
            }
            com.ironsource.C3018e3 a4 = c.a(str);
            if (a4 == null) {
                a4 = c.i();
                str2 = "config.defaultBannerPlacement";
            } else {
                str2 = "config.getBannerPlacemen…ig.defaultBannerPlacement";
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a4, str2);
            return new com.ironsource.C3064gd(a4);
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.ironsource.Pb e = d().c().e();
        if (e != null && str != null) {
            com.ironsource.C2955ac a5 = e.a(str);
            if (a5 == null) {
                a5 = e.e();
            }
            if (a5 != null) {
                return new com.ironsource.C3064gd(a5);
            }
        }
        throw new java.lang.IllegalStateException("Error getting " + adFormat + " configurations");
    }

    public final java.util.List<com.ironsource.C3367xc> d(com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        java.util.Map<java.lang.String, com.ironsource.Fd.b> a2;
        java.util.Set<java.lang.String> keySet;
        java.util.List<com.ironsource.C3367xc> distinct;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        com.ironsource.Fd.a aVar = h().d().a().get(adFormat);
        if (aVar != null && (a2 = aVar.a()) != null && (keySet = a2.keySet()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(keySet, 10));
            java.util.Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(d(adFormat, (java.lang.String) it.next()));
            }
            java.util.List flatten = kotlin.collections.CollectionsKt.flatten(arrayList);
            if (flatten != null && (distinct = kotlin.collections.CollectionsKt.distinct(flatten)) != null) {
                return distinct;
            }
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public final java.lang.String j() {
        return h().a().b().c().a();
    }

    public final java.util.List<com.unity3d.mediation.LevelPlayAdSize> k() {
        java.util.List<java.lang.String> a2 = h().a().c().b().a();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(a2, 10));
        java.util.Iterator<T> it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(com.unity3d.mediation.LevelPlayAdSize.Companion.createAdSize$mediationsdk_release((java.lang.String) it.next()));
        }
        return arrayList;
    }

    public final float l() {
        return h().a().c().b().b();
    }

    public final boolean m() {
        com.ironsource.mediationsdk.adquality.a a2 = d().c().a();
        return a2 != null && a2.b();
    }

    public final boolean n() {
        return h().a().b().e();
    }

    public final com.ironsource.C3117jd b(com.ironsource.C3312ub tools) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tools, "tools");
        return new com.ironsource.C3117jd(tools, h().a().a());
    }

    public final long b(com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        com.ironsource.C3300u.d b;
        java.lang.Long d;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        com.ironsource.C3300u c3300u = h().a().a().get(adFormat);
        long longValue = (c3300u == null || (b = c3300u.b()) == null || (d = b.d()) == null) ? 60L : d.longValue();
        return longValue > 0 ? java.util.concurrent.TimeUnit.MINUTES.toMillis(longValue) : longValue;
    }

    public final com.ironsource.Ta.a a(java.lang.String adUnitId) {
        long d;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        com.ironsource.T2 c = h().a().c();
        com.ironsource.T2.b bVar = c.a().get(adUnitId);
        int c2 = bVar != null ? bVar.c() : c.b().c();
        boolean e = bVar != null ? bVar.e() : c.b().e();
        if (bVar != null) {
            d = bVar.d();
        } else {
            d = c.b().d();
        }
        return new com.ironsource.Ta.a(e, c2, d);
    }

    public final java.util.List<java.lang.String> a(com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        java.util.Map<java.lang.String, com.ironsource.Fd.b> a2;
        java.util.Set<java.lang.String> keySet;
        java.util.List<java.lang.String> list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        com.ironsource.Fd.a aVar = h().d().a().get(adFormat);
        return (aVar == null || (a2 = aVar.a()) == null || (keySet = a2.keySet()) == null || (list = kotlin.collections.CollectionsKt.toList(keySet)) == null) ? kotlin.collections.CollectionsKt.emptyList() : list;
    }

    public final com.ironsource.C3319v0 a(com.ironsource.C3312ub tools) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tools, "tools");
        return new com.ironsource.C3319v0(tools, h().a().a());
    }

    private final com.ironsource.InterfaceC3307u6.c a(com.unity3d.mediation.LevelPlay.AdFormat adFormat, java.lang.String str) {
        com.ironsource.C3300u.d b;
        com.ironsource.Ad g;
        java.util.Map<java.lang.String, com.ironsource.C3300u.d> a2;
        com.ironsource.C3300u.d dVar;
        com.ironsource.Ad g2;
        boolean z = adFormat == com.unity3d.mediation.LevelPlay.AdFormat.REWARDED;
        com.ironsource.C3300u c3300u = h().a().a().get(adFormat);
        com.ironsource.InterfaceC3307u6.c cVar = null;
        com.ironsource.InterfaceC3307u6.c a3 = (c3300u == null || (a2 = c3300u.a()) == null || (dVar = a2.get(str)) == null || (g2 = dVar.g()) == null) ? null : g2.a();
        if (c3300u != null && (b = c3300u.b()) != null && (g = b.g()) != null) {
            cVar = g.a();
        }
        if (a3 == null) {
            a3 = cVar;
        }
        if (a3 != null) {
            return a3;
        }
        if (z) {
            return com.ironsource.InterfaceC3307u6.c.PROGRESSIVE_ON_SHOW_SUCCESS;
        }
        return com.ironsource.InterfaceC3307u6.c.SINGLE;
    }

    public final com.ironsource.Sd c(com.ironsource.C3312ub tools) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tools, "tools");
        com.ironsource.C3300u c3300u = h().a().a().get(com.unity3d.mediation.LevelPlay.AdFormat.REWARDED);
        return new com.ironsource.Sd(tools, c3300u != null ? c3300u.a() : null, c3300u != null ? c3300u.c() : null);
    }

    public final java.util.List<com.ironsource.Fd.c> c(com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        return h().d().a(adFormat);
    }

    public final java.util.List<com.ironsource.C3367xc> d(com.unity3d.mediation.LevelPlay.AdFormat adFormat, java.lang.String adUnitId) {
        java.util.Map<java.lang.String, com.ironsource.Fd.b> a2;
        com.ironsource.Fd.b bVar;
        java.util.List<java.lang.String> a3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        com.ironsource.Fd.a aVar = h().d().a().get(adFormat);
        if (aVar != null && (a2 = aVar.a()) != null && (bVar = a2.get(adUnitId)) != null && (a3 = bVar.a()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = a3.iterator();
            while (it.hasNext()) {
                com.ironsource.C3367xc c3367xc = h().e().a().get((java.lang.String) it.next());
                if (c3367xc != null) {
                    arrayList.add(c3367xc);
                }
            }
            return arrayList;
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }
}
