package com.ironsource;

/* loaded from: classes5.dex */
public final class T2 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.T2.b f5971a;
    private final java.util.Map<java.lang.String, com.ironsource.T2.b> b;

    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<org.json.JSONObject, com.ironsource.T2.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.T2.a f5972a = new com.ironsource.T2.a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.T2.b invoke(org.json.JSONObject it) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
            return new com.ironsource.T2.b(it);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final org.json.JSONObject f5973a;
        private final int b;
        private final boolean c;
        private final long d;
        private final float e;
        private final java.util.List<java.lang.String> f;

        public b(org.json.JSONObject features) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(features, "features");
            org.json.JSONObject jSONObject = features.has(com.ironsource.V2.f6008a) ? features : null;
            org.json.JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject(com.ironsource.V2.f6008a) : null;
            this.f5973a = optJSONObject;
            int optInt = optJSONObject != null ? optJSONObject.optInt(com.ironsource.V2.b, 25000) : 25000;
            this.b = optInt;
            this.c = optJSONObject != null ? optJSONObject.optBoolean("enabled", true) : true;
            this.d = (optJSONObject == null || !optJSONObject.has(com.ironsource.V2.d) || optJSONObject.isNull(com.ironsource.V2.d)) ? optInt : optJSONObject.optLong(com.ironsource.V2.d);
            this.e = features.has(com.ironsource.V2.e) ? features.optInt(com.ironsource.V2.e) / 100.0f : 0.15f;
            java.util.List<java.lang.String> b = features.has(com.ironsource.V2.f) ? com.ironsource.C3079ha.b(features.getJSONArray(com.ironsource.V2.f)) : kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.ironsource.mediationsdk.j.f6439a, com.ironsource.mediationsdk.j.d});
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "BANNER_CONFIGURATIONS_AD…ZE_LEADERBOARD)\n        }");
            this.f = b;
        }

        public final java.util.List<java.lang.String> a() {
            return this.f;
        }

        public final float b() {
            return this.e;
        }

        public final int c() {
            return this.b;
        }

        public final long d() {
            return this.d;
        }

        public final boolean e() {
            return this.c;
        }
    }

    public T2(org.json.JSONObject bannerConfigurations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerConfigurations, "bannerConfigurations");
        this.f5971a = new com.ironsource.T2.b(bannerConfigurations);
        this.b = new com.ironsource.C2944a1(bannerConfigurations).a(com.ironsource.T2.a.f5972a);
    }

    public final java.util.Map<java.lang.String, com.ironsource.T2.b> a() {
        return this.b;
    }

    public final com.ironsource.T2.b b() {
        return this.f5971a;
    }
}
