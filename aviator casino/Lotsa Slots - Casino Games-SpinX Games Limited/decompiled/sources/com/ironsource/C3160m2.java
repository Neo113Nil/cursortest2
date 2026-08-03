package com.ironsource;

/* renamed from: com.ironsource.m2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3160m2 {
    public static final com.ironsource.C3160m2.b h = new com.ironsource.C3160m2.b(null);

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6382a;
    private final com.ironsource.mediationsdk.demandOnly.a b;
    private final com.ironsource.C3232q2 c;
    private final org.json.JSONObject d;
    private final org.json.JSONObject e;
    private final com.ironsource.C3053g2 f;
    private final com.ironsource.C3249r2 g;

    /* renamed from: com.ironsource.m2$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final org.json.JSONObject f6383a;
        private final java.lang.String b;
        private final java.lang.String c;
        private final com.ironsource.mediationsdk.demandOnly.a d;
        private final com.ironsource.C3232q2 e;
        private final org.json.JSONObject f;
        private final org.json.JSONObject g;
        private final com.ironsource.C3053g2 h;
        private final com.ironsource.C3249r2 i;

        public a(org.json.JSONObject auctionData, java.lang.String instanceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionData, "auctionData");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            this.f6383a = auctionData;
            this.b = instanceId;
            org.json.JSONObject a2 = a(auctionData);
            this.c = auctionData.optString("auctionId");
            com.ironsource.mediationsdk.demandOnly.a a3 = a(auctionData, a2);
            this.d = a3;
            this.e = c(a2);
            this.f = d(a2);
            this.g = b(a2);
            this.h = a(a3, instanceId);
            this.i = b(a3, instanceId);
        }

        private final org.json.JSONObject d(org.json.JSONObject jSONObject) {
            return jSONObject.optJSONObject("genericParams");
        }

        public final com.ironsource.C3160m2 a() {
            return new com.ironsource.C3160m2(this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        public final org.json.JSONObject b() {
            return this.f6383a;
        }

        public final java.lang.String c() {
            return this.b;
        }

        private final org.json.JSONObject b(org.json.JSONObject jSONObject) {
            return jSONObject.optJSONObject("configurations");
        }

        private final com.ironsource.C3232q2 c(org.json.JSONObject jSONObject) {
            return new com.ironsource.C3232q2(jSONObject);
        }

        private final com.ironsource.C3249r2 b(com.ironsource.mediationsdk.demandOnly.a aVar, java.lang.String str) {
            com.ironsource.C3232q2 a2 = aVar.a(str);
            if (a2 == null) {
                return null;
            }
            java.lang.String k = a2.k();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k, "it.serverData");
            return new com.ironsource.C3249r2(k);
        }

        private final org.json.JSONObject a(org.json.JSONObject jSONObject) {
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("settings");
            return optJSONObject == null ? new org.json.JSONObject() : optJSONObject;
        }

        private final com.ironsource.mediationsdk.demandOnly.a a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            org.json.JSONObject optJSONObject = jSONObject2.optJSONObject(com.ironsource.mediationsdk.d.d);
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray(com.ironsource.mediationsdk.d.h);
            if (optJSONArray != null) {
                kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, optJSONArray.length());
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator<java.lang.Integer> it = until.iterator();
                while (it.hasNext()) {
                    int nextInt = ((kotlin.collections.IntIterator) it).nextInt();
                    com.ironsource.C3232q2 c3232q2 = new com.ironsource.C3232q2(optJSONArray.getJSONObject(nextInt), nextInt, optJSONObject);
                    if (!c3232q2.n()) {
                        c3232q2 = null;
                    }
                    if (c3232q2 != null) {
                        arrayList2.add(c3232q2);
                    }
                }
                arrayList.addAll(arrayList2);
            }
            return new com.ironsource.mediationsdk.demandOnly.a.C0158a(arrayList);
        }

        private final com.ironsource.C3053g2 a(com.ironsource.mediationsdk.demandOnly.a aVar, java.lang.String str) {
            com.ironsource.C3232q2 a2 = aVar.a(str);
            if (a2 == null) {
                return null;
            }
            com.ironsource.C3053g2 c3053g2 = new com.ironsource.C3053g2();
            c3053g2.a(a2.b());
            c3053g2.c(a2.h());
            c3053g2.b(a2.g());
            return c3053g2;
        }
    }

    /* renamed from: com.ironsource.m2$b */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final java.lang.Object a(org.json.JSONObject auctionData, java.lang.String instanceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionData, "auctionData");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            return a(new com.ironsource.C3160m2.a(auctionData, instanceId).a(), instanceId);
        }

        private b() {
        }

        private final java.lang.Object a(com.ironsource.C3160m2 c3160m2, java.lang.String str) {
            java.lang.String b = c3160m2.b();
            if (b != null && b.length() != 0) {
                if (c3160m2.i()) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new com.ironsource.C2951a8(com.ironsource.C3306u5.f6757a.f())));
                }
                com.ironsource.C3232q2 a2 = c3160m2.a(str);
                if (a2 == null) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new com.ironsource.C2951a8(com.ironsource.C3306u5.f6757a.j())));
                }
                java.lang.String k = a2.k();
                if (k != null && k.length() != 0) {
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    return kotlin.Result.m10798constructorimpl(c3160m2);
                }
                kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new com.ironsource.C2951a8(com.ironsource.C3306u5.f6757a.e())));
            }
            kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new com.ironsource.C2951a8(com.ironsource.C3306u5.f6757a.i())));
        }
    }

    public C3160m2(java.lang.String str, com.ironsource.mediationsdk.demandOnly.a waterfall, com.ironsource.C3232q2 genericNotifications, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.ironsource.C3053g2 c3053g2, com.ironsource.C3249r2 c3249r2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(genericNotifications, "genericNotifications");
        this.f6382a = str;
        this.b = waterfall;
        this.c = genericNotifications;
        this.d = jSONObject;
        this.e = jSONObject2;
        this.f = c3053g2;
        this.g = c3249r2;
    }

    public final java.lang.String a() {
        com.ironsource.C3249r2 c3249r2 = this.g;
        if (c3249r2 != null) {
            return c3249r2.d();
        }
        return null;
    }

    public final java.lang.String b() {
        return this.f6382a;
    }

    public final com.ironsource.C3053g2 c() {
        return this.f;
    }

    public final org.json.JSONObject d() {
        return this.e;
    }

    public final com.ironsource.C3232q2 e() {
        return this.c;
    }

    public final org.json.JSONObject f() {
        return this.d;
    }

    public final com.ironsource.C3249r2 g() {
        return this.g;
    }

    public final com.ironsource.mediationsdk.demandOnly.a h() {
        return this.b;
    }

    public final boolean i() {
        return this.b.isEmpty();
    }

    public final com.ironsource.C3232q2 a(java.lang.String providerName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerName, "providerName");
        return a(this.b, providerName);
    }

    private final com.ironsource.C3232q2 a(com.ironsource.mediationsdk.demandOnly.a aVar, java.lang.String str) {
        return aVar.a(str);
    }
}
