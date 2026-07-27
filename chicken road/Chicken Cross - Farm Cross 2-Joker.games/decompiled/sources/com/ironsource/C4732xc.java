package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import org.json.JSONObject;

/* renamed from: com.ironsource.xc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4732xc {

    /* renamed from: a, reason: collision with root package name */
    private final String f8762a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final JSONObject f;
    private final Map<String, JSONObject> g;
    private final String h;
    private final String i;
    private final boolean j;
    private C4732xc k;
    private final Lazy l;

    /* renamed from: com.ironsource.xc$a */
    static final class a extends Lambda implements Function0<NetworkSettings> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkSettings invoke() {
            String j = C4732xc.this.j();
            String l = C4732xc.this.l();
            String h = C4732xc.this.h();
            String k = C4732xc.this.k();
            JSONObject c = C4732xc.this.c();
            C4732xc c4732xc = C4732xc.this.k;
            JSONObject b = IronSourceUtils.b(c, c4732xc != null ? c4732xc.c() : null);
            JSONObject m = C4732xc.this.m();
            C4732xc c4732xc2 = C4732xc.this.k;
            JSONObject b2 = IronSourceUtils.b(m, c4732xc2 != null ? c4732xc2.m() : null);
            JSONObject e = C4732xc.this.e();
            C4732xc c4732xc3 = C4732xc.this.k;
            JSONObject b3 = IronSourceUtils.b(e, c4732xc3 != null ? c4732xc3.e() : null);
            JSONObject d = C4732xc.this.d();
            C4732xc c4732xc4 = C4732xc.this.k;
            JSONObject b4 = IronSourceUtils.b(d, c4732xc4 != null ? c4732xc4.d() : null);
            JSONObject g = C4732xc.this.g();
            C4732xc c4732xc5 = C4732xc.this.k;
            NetworkSettings networkSettings = new NetworkSettings(j, l, h, k, b, b2, b3, b4, IronSourceUtils.b(g, c4732xc5 != null ? c4732xc5.g() : null));
            networkSettings.setIsMultipleInstances(C4732xc.this.o());
            networkSettings.setSubProviderId(C4732xc.this.n());
            networkSettings.setAdSourceNameForEvents(C4732xc.this.b());
            return networkSettings;
        }
    }

    public C4732xc(String providerName, JSONObject networkSettings) {
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        this.f8762a = providerName;
        this.b = providerName;
        String optString = networkSettings.optString(C4750yc.d, providerName);
        Intrinsics.checkNotNullExpressionValue(optString, "networkSettings.optStrin…,\n          providerName)");
        this.c = optString;
        String optString2 = networkSettings.optString(C4750yc.f, optString);
        Intrinsics.checkNotNullExpressionValue(optString2, "networkSettings.optStrin…roviderTypeForReflection)");
        this.d = optString2;
        Object opt = networkSettings.opt("providerNetworkKey");
        this.e = opt instanceof String ? (String) opt : null;
        this.f = networkSettings.optJSONObject("application");
        LevelPlay.AdFormat[] values = LevelPlay.AdFormat.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (LevelPlay.AdFormat adFormat : values) {
            arrayList.add(Gf.a(adFormat));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (Object obj : arrayList) {
            String str = (String) obj;
            JSONObject optJSONObject = networkSettings.optJSONObject("adFormats");
            JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject(str) : null;
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
            }
            linkedHashMap.put(obj, optJSONObject2);
        }
        this.g = linkedHashMap;
        String optString3 = networkSettings.optString("spId", "0");
        Intrinsics.checkNotNullExpressionValue(optString3, "networkSettings.optStrin…B_PROVIDER_ID_FIELD, \"0\")");
        this.h = optString3;
        String optString4 = networkSettings.optString(C4750yc.f8780a);
        Intrinsics.checkNotNullExpressionValue(optString4, "networkSettings.optString(AD_SOURCE_NAME_FIELD)");
        this.i = optString4;
        this.j = networkSettings.optBoolean(C4750yc.c, false);
        this.l = LazyKt.lazy(new a());
    }

    public final String b() {
        return this.i;
    }

    public final JSONObject c() {
        return this.f;
    }

    public final JSONObject d() {
        JSONObject b = IronSourceUtils.b(this.g.get("banner"), this.f);
        Intrinsics.checkNotNullExpressionValue(b, "mergeJsons(\n            …EY], applicationSettings)");
        return b;
    }

    public final JSONObject e() {
        JSONObject b = IronSourceUtils.b(this.g.get("interstitial"), this.f);
        Intrinsics.checkNotNullExpressionValue(b, "mergeJsons(\n            …EY], applicationSettings)");
        return b;
    }

    public final NetworkSettings f() {
        return (NetworkSettings) this.l.getValue();
    }

    public final JSONObject g() {
        JSONObject b = IronSourceUtils.b(this.g.get("nativeAd"), this.f);
        Intrinsics.checkNotNullExpressionValue(b, "mergeJsons(\n            …EY], applicationSettings)");
        return b;
    }

    public final String h() {
        return this.d;
    }

    public final String i() {
        return this.b;
    }

    public final String j() {
        return this.f8762a;
    }

    public final String k() {
        return this.e;
    }

    public final String l() {
        return this.c;
    }

    public final JSONObject m() {
        JSONObject b = IronSourceUtils.b(this.g.get("rewarded"), this.f);
        Intrinsics.checkNotNullExpressionValue(b, "mergeJsons(\n            …     applicationSettings)");
        return b;
    }

    public final String n() {
        return this.h;
    }

    public final boolean o() {
        return this.j;
    }

    public final Map<String, JSONObject> a() {
        return this.g;
    }

    public final void b(C4732xc c4732xc) {
        this.k = c4732xc;
    }
}
