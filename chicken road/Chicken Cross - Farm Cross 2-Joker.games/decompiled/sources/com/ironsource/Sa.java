package com.ironsource;

import com.ironsource.C4665u;
import com.ironsource.Ed;
import com.ironsource.InterfaceC4654t6;
import com.ironsource.R2;
import com.ironsource.Ra;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public final class Sa extends C4519le {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7893a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f7893a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sa(C4519le sdkConfig) {
        super(sdkConfig);
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
    }

    public final boolean a(String adUnitId, LevelPlay.AdFormat adFormat) {
        Map<String, Ed.b> a2;
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Ed.a aVar = h().d().a().get(adFormat);
        return (aVar == null || (a2 = aVar.a()) == null || !a2.containsKey(adUnitId)) ? false : true;
    }

    public final InterfaceC4654t6.a b(LevelPlay.AdFormat adFormat, String adUnitId) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        return new InterfaceC4654t6.a(a(adFormat, adUnitId));
    }

    public final C4411fd c(LevelPlay.AdFormat adFormat, String str) {
        C4411fd a2;
        H9 a3;
        String str2;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        int i = a.f7893a[adFormat.ordinal()];
        if (i == 1) {
            C4376de f = d().c().f();
            if (f == null || (a2 = f.a(str)) == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(a2, "getRewardedVideoPlacement(placementName)");
            return new C4411fd(a2.b(), a2.c(), a2.d(), a2.f(), a2.e(), a2.a());
        }
        if (i == 2) {
            D9 d = d().c().d();
            if (d == null || (a3 = d.a(str)) == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(a3, "getInterstitialPlacement(placementName)");
            return new C4411fd(a3);
        }
        if (i == 3) {
            S2 c = d().c().c();
            if (c == null) {
                throw new IllegalStateException("Error getting " + adFormat + " configurations");
            }
            C4347c3 a4 = c.a(str);
            if (a4 == null) {
                a4 = c.i();
                str2 = "config.defaultBannerPlacement";
            } else {
                str2 = "config.getBannerPlacemen…ig.defaultBannerPlacement";
            }
            Intrinsics.checkNotNullExpressionValue(a4, str2);
            return new C4411fd(a4);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        Pb e = d().c().e();
        if (e != null && str != null) {
            C4295ac a5 = e.a(str);
            if (a5 == null) {
                a5 = e.e();
            }
            if (a5 != null) {
                return new C4411fd(a5);
            }
        }
        throw new IllegalStateException("Error getting " + adFormat + " configurations");
    }

    public final List<C4732xc> d(LevelPlay.AdFormat adFormat) {
        Map<String, Ed.b> a2;
        Set<String> keySet;
        List<C4732xc> distinct;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Ed.a aVar = h().d().a().get(adFormat);
        if (aVar != null && (a2 = aVar.a()) != null && (keySet = a2.keySet()) != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keySet, 10));
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(d(adFormat, (String) it.next()));
            }
            List flatten = CollectionsKt.flatten(arrayList);
            if (flatten != null && (distinct = CollectionsKt.distinct(flatten)) != null) {
                return distinct;
            }
        }
        return CollectionsKt.emptyList();
    }

    public final String j() {
        return h().a().b().c().a();
    }

    public final Set<String> k() {
        JSONArray e = h().a().b().d().e();
        if (e == null) {
            return null;
        }
        List<String> b = C4444ha.b(e);
        Intrinsics.checkNotNullExpressionValue(b, "jsonArrayToStringList(it)");
        return CollectionsKt.toSet(b);
    }

    public final List<LevelPlayAdSize> l() {
        List<String> a2 = h().a().c().b().a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a2, 10));
        Iterator<T> it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(LevelPlayAdSize.Companion.createAdSize$mediationsdk_release((String) it.next()));
        }
        return arrayList;
    }

    public final float m() {
        return h().a().c().b().b();
    }

    public final boolean n() {
        com.ironsource.mediationsdk.adquality.a a2 = d().c().a();
        return a2 != null && a2.b();
    }

    public final boolean o() {
        return h().a().b().e();
    }

    public final C4465id b(C4659tb tools) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        return new C4465id(tools, h().a().a());
    }

    public final long b(LevelPlay.AdFormat adFormat) {
        C4665u.d b;
        Long d;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        C4665u c4665u = h().a().a().get(adFormat);
        long longValue = (c4665u == null || (b = c4665u.b()) == null || (d = b.d()) == null) ? 60L : d.longValue();
        return longValue > 0 ? TimeUnit.MINUTES.toMillis(longValue) : longValue;
    }

    public final Ra.a a(String adUnitId) {
        long d;
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        R2 c = h().a().c();
        R2.b bVar = c.a().get(adUnitId);
        int c2 = bVar != null ? bVar.c() : c.b().c();
        boolean e = bVar != null ? bVar.e() : c.b().e();
        if (bVar != null) {
            d = bVar.d();
        } else {
            d = c.b().d();
        }
        return new Ra.a(e, c2, d);
    }

    public final List<String> a(LevelPlay.AdFormat adFormat) {
        Map<String, Ed.b> a2;
        Set<String> keySet;
        List<String> list;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Ed.a aVar = h().d().a().get(adFormat);
        return (aVar == null || (a2 = aVar.a()) == null || (keySet = a2.keySet()) == null || (list = CollectionsKt.toList(keySet)) == null) ? CollectionsKt.emptyList() : list;
    }

    public final C4684v0 a(C4659tb tools) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        return new C4684v0(tools, h().a().a());
    }

    private final InterfaceC4654t6.c a(LevelPlay.AdFormat adFormat, String str) {
        C4665u.d b;
        C4769zd g;
        Map<String, C4665u.d> a2;
        C4665u.d dVar;
        C4769zd g2;
        boolean z = adFormat == LevelPlay.AdFormat.REWARDED;
        C4665u c4665u = h().a().a().get(adFormat);
        InterfaceC4654t6.c cVar = null;
        InterfaceC4654t6.c a3 = (c4665u == null || (a2 = c4665u.a()) == null || (dVar = a2.get(str)) == null || (g2 = dVar.g()) == null) ? null : g2.a();
        if (c4665u != null && (b = c4665u.b()) != null && (g = b.g()) != null) {
            cVar = g.a();
        }
        if (a3 == null) {
            a3 = cVar;
        }
        if (a3 != null) {
            return a3;
        }
        if (z) {
            return InterfaceC4654t6.c.PROGRESSIVE_ON_SHOW_SUCCESS;
        }
        return InterfaceC4654t6.c.SINGLE;
    }

    public final Rd c(C4659tb tools) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        C4665u c4665u = h().a().a().get(LevelPlay.AdFormat.REWARDED);
        return new Rd(tools, c4665u != null ? c4665u.a() : null, c4665u != null ? c4665u.c() : null);
    }

    public final List<Ed.c> c(LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        return h().d().a(adFormat);
    }

    public final List<C4732xc> d(LevelPlay.AdFormat adFormat, String adUnitId) {
        Map<String, Ed.b> a2;
        Ed.b bVar;
        List<String> a3;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Ed.a aVar = h().d().a().get(adFormat);
        if (aVar != null && (a2 = aVar.a()) != null && (bVar = a2.get(adUnitId)) != null && (a3 = bVar.a()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = a3.iterator();
            while (it.hasNext()) {
                C4732xc c4732xc = h().e().a().get((String) it.next());
                if (c4732xc != null) {
                    arrayList.add(c4732xc);
                }
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }
}
