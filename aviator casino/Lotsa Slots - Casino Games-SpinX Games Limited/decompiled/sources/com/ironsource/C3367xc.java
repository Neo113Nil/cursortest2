package com.ironsource;

/* renamed from: com.ironsource.xc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3367xc {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6837a;
    private final java.lang.String b;
    private final java.lang.String c;
    private final java.lang.String d;
    private final java.lang.String e;
    private final org.json.JSONObject f;
    private final java.util.Map<java.lang.String, org.json.JSONObject> g;
    private final java.lang.String h;
    private final java.lang.String i;
    private final boolean j;
    private com.ironsource.C3367xc k;
    private final kotlin.Lazy l;

    /* renamed from: com.ironsource.xc$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.ironsource.mediationsdk.model.NetworkSettings> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.mediationsdk.model.NetworkSettings invoke() {
            java.lang.String j = com.ironsource.C3367xc.this.j();
            java.lang.String l = com.ironsource.C3367xc.this.l();
            java.lang.String h = com.ironsource.C3367xc.this.h();
            java.lang.String k = com.ironsource.C3367xc.this.k();
            org.json.JSONObject c = com.ironsource.C3367xc.this.c();
            com.ironsource.C3367xc c3367xc = com.ironsource.C3367xc.this.k;
            org.json.JSONObject b = com.ironsource.mediationsdk.utils.IronSourceUtils.b(c, c3367xc != null ? c3367xc.c() : null);
            org.json.JSONObject m = com.ironsource.C3367xc.this.m();
            com.ironsource.C3367xc c3367xc2 = com.ironsource.C3367xc.this.k;
            org.json.JSONObject b2 = com.ironsource.mediationsdk.utils.IronSourceUtils.b(m, c3367xc2 != null ? c3367xc2.m() : null);
            org.json.JSONObject e = com.ironsource.C3367xc.this.e();
            com.ironsource.C3367xc c3367xc3 = com.ironsource.C3367xc.this.k;
            org.json.JSONObject b3 = com.ironsource.mediationsdk.utils.IronSourceUtils.b(e, c3367xc3 != null ? c3367xc3.e() : null);
            org.json.JSONObject d = com.ironsource.C3367xc.this.d();
            com.ironsource.C3367xc c3367xc4 = com.ironsource.C3367xc.this.k;
            org.json.JSONObject b4 = com.ironsource.mediationsdk.utils.IronSourceUtils.b(d, c3367xc4 != null ? c3367xc4.d() : null);
            org.json.JSONObject g = com.ironsource.C3367xc.this.g();
            com.ironsource.C3367xc c3367xc5 = com.ironsource.C3367xc.this.k;
            com.ironsource.mediationsdk.model.NetworkSettings networkSettings = new com.ironsource.mediationsdk.model.NetworkSettings(j, l, h, k, b, b2, b3, b4, com.ironsource.mediationsdk.utils.IronSourceUtils.b(g, c3367xc5 != null ? c3367xc5.g() : null));
            networkSettings.setIsMultipleInstances(com.ironsource.C3367xc.this.o());
            networkSettings.setSubProviderId(com.ironsource.C3367xc.this.n());
            networkSettings.setAdSourceNameForEvents(com.ironsource.C3367xc.this.b());
            return networkSettings;
        }
    }

    public C3367xc(java.lang.String providerName, org.json.JSONObject networkSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerName, "providerName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        this.f6837a = providerName;
        this.b = providerName;
        java.lang.String optString = networkSettings.optString(com.ironsource.C3385yc.d, providerName);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString, "networkSettings.optStrin…,\n          providerName)");
        this.c = optString;
        java.lang.String optString2 = networkSettings.optString(com.ironsource.C3385yc.f, optString);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString2, "networkSettings.optStrin…roviderTypeForReflection)");
        this.d = optString2;
        java.lang.Object opt = networkSettings.opt("providerNetworkKey");
        this.e = opt instanceof java.lang.String ? (java.lang.String) opt : null;
        this.f = networkSettings.optJSONObject("application");
        com.unity3d.mediation.LevelPlay.AdFormat[] values = com.unity3d.mediation.LevelPlay.AdFormat.values();
        java.util.ArrayList arrayList = new java.util.ArrayList(values.length);
        for (com.unity3d.mediation.LevelPlay.AdFormat adFormat : values) {
            arrayList.add(com.ironsource.Ff.a(adFormat));
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (java.lang.Object obj : arrayList) {
            java.lang.String str = (java.lang.String) obj;
            org.json.JSONObject optJSONObject = networkSettings.optJSONObject("adFormats");
            org.json.JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject(str) : null;
            if (optJSONObject2 == null) {
                optJSONObject2 = new org.json.JSONObject();
            }
            linkedHashMap.put(obj, optJSONObject2);
        }
        this.g = linkedHashMap;
        java.lang.String optString3 = networkSettings.optString("spId", "0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString3, "networkSettings.optStrin…B_PROVIDER_ID_FIELD, \"0\")");
        this.h = optString3;
        java.lang.String optString4 = networkSettings.optString(com.ironsource.C3385yc.f6853a);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString4, "networkSettings.optString(AD_SOURCE_NAME_FIELD)");
        this.i = optString4;
        this.j = networkSettings.optBoolean(com.ironsource.C3385yc.c, false);
        this.l = kotlin.LazyKt.lazy(new com.ironsource.C3367xc.a());
    }

    public final java.lang.String b() {
        return this.i;
    }

    public final org.json.JSONObject c() {
        return this.f;
    }

    public final org.json.JSONObject d() {
        org.json.JSONObject b = com.ironsource.mediationsdk.utils.IronSourceUtils.b(this.g.get("banner"), this.f);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "mergeJsons(\n            …EY], applicationSettings)");
        return b;
    }

    public final org.json.JSONObject e() {
        org.json.JSONObject b = com.ironsource.mediationsdk.utils.IronSourceUtils.b(this.g.get("interstitial"), this.f);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "mergeJsons(\n            …EY], applicationSettings)");
        return b;
    }

    public final com.ironsource.mediationsdk.model.NetworkSettings f() {
        return (com.ironsource.mediationsdk.model.NetworkSettings) this.l.getValue();
    }

    public final org.json.JSONObject g() {
        org.json.JSONObject b = com.ironsource.mediationsdk.utils.IronSourceUtils.b(this.g.get("nativeAd"), this.f);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "mergeJsons(\n            …EY], applicationSettings)");
        return b;
    }

    public final java.lang.String h() {
        return this.d;
    }

    public final java.lang.String i() {
        return this.b;
    }

    public final java.lang.String j() {
        return this.f6837a;
    }

    public final java.lang.String k() {
        return this.e;
    }

    public final java.lang.String l() {
        return this.c;
    }

    public final org.json.JSONObject m() {
        org.json.JSONObject b = com.ironsource.mediationsdk.utils.IronSourceUtils.b(this.g.get("rewarded"), this.f);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "mergeJsons(\n            …     applicationSettings)");
        return b;
    }

    public final java.lang.String n() {
        return this.h;
    }

    public final boolean o() {
        return this.j;
    }

    public final java.util.Map<java.lang.String, org.json.JSONObject> a() {
        return this.g;
    }

    public final void b(com.ironsource.C3367xc c3367xc) {
        this.k = c3367xc;
    }
}
