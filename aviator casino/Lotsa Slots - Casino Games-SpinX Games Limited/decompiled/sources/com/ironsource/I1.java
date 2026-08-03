package com.ironsource;

/* loaded from: classes5.dex */
public final class I1 {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f5750a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final int e;
    private final java.lang.String f;
    private final java.lang.String g;
    private final int h;
    private final int i;
    private final int j;
    private final java.util.List<java.lang.Integer> k;
    private final java.util.List<java.lang.Integer> l;
    private final java.util.List<java.lang.Integer> m;
    private final java.util.List<java.lang.Integer> n;

    public I1(org.json.JSONObject applicationEvents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationEvents, "applicationEvents");
        java.lang.String it = applicationEvents.optString("abt");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        this.f5750a = it.length() <= 0 ? null : it;
        this.b = applicationEvents.optBoolean(com.ironsource.K1.f5796a, false);
        this.c = applicationEvents.optBoolean(com.ironsource.K1.b, false);
        this.d = applicationEvents.optBoolean(com.ironsource.K1.c, false);
        this.e = applicationEvents.optInt(com.ironsource.K1.d, -1);
        java.lang.String optString = applicationEvents.optString(com.ironsource.K1.e);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString, "applicationEvents.optStr…(SERVER_EVENTS_URL_FIELD)");
        this.f = optString;
        java.lang.String optString2 = applicationEvents.optString(com.ironsource.K1.f);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString2, "applicationEvents.optString(SERVER_EVENTS_TYPE)");
        this.g = optString2;
        this.h = applicationEvents.optInt(com.ironsource.K1.g, -1);
        this.i = applicationEvents.optInt(com.ironsource.K1.h, -1);
        this.j = applicationEvents.optInt(com.ironsource.K1.i, 5000);
        this.k = a(applicationEvents, com.ironsource.K1.j);
        this.l = a(applicationEvents, com.ironsource.K1.k);
        this.m = a(applicationEvents, com.ironsource.K1.l);
        this.n = a(applicationEvents, com.ironsource.K1.m);
    }

    public final java.lang.String a() {
        return this.f5750a;
    }

    public final int b() {
        return this.h;
    }

    public final boolean c() {
        return this.d;
    }

    public final int d() {
        return this.e;
    }

    public final java.lang.String e() {
        return this.g;
    }

    public final int f() {
        return this.j;
    }

    public final int g() {
        return this.i;
    }

    public final java.util.List<java.lang.Integer> h() {
        return this.n;
    }

    public final java.util.List<java.lang.Integer> i() {
        return this.l;
    }

    public final java.util.List<java.lang.Integer> j() {
        return this.k;
    }

    public final boolean k() {
        return this.c;
    }

    public final boolean l() {
        return this.b;
    }

    public final java.lang.String m() {
        return this.f;
    }

    public final java.util.List<java.lang.Integer> n() {
        return this.m;
    }

    private final java.util.List<java.lang.Integer> a(org.json.JSONObject jSONObject, java.lang.String str) {
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, optJSONArray.length());
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(until, 10));
        java.util.Iterator<java.lang.Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(optJSONArray.getInt(((kotlin.collections.IntIterator) it).nextInt())));
        }
        return arrayList;
    }
}
