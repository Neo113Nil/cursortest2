package com.ironsource;

/* renamed from: com.ironsource.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3300u {
    public static final com.ironsource.C3300u.c d = new com.ironsource.C3300u.c(null);
    public static final java.lang.String e = "capping";
    public static final java.lang.String f = "pacing";
    public static final java.lang.String g = "delivery";
    public static final java.lang.String h = "progressiveLoadingConfig";
    public static final java.lang.String i = "expiredDurationInMinutes";
    public static final java.lang.String j = "reward";
    public static final java.lang.String k = "name";
    public static final java.lang.String l = "amount";
    public static final java.lang.String m = "virtualItemName";
    public static final java.lang.String n = "virtualItemCount";
    public static final long o = 60;

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Map<java.lang.String, com.ironsource.C3300u.d> f6743a;
    private final com.ironsource.C3300u.d b;
    private final java.util.Map<java.lang.String, com.ironsource.C3300u.d> c;

    /* renamed from: com.ironsource.u$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<org.json.JSONObject, com.ironsource.C3300u.d> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.C3300u.a f6744a = new com.ironsource.C3300u.a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.C3300u.d invoke(org.json.JSONObject it) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
            return new com.ironsource.C3300u.d(it);
        }
    }

    /* renamed from: com.ironsource.u$b */
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<org.json.JSONObject, com.ironsource.C3300u.d> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.C3300u.b f6745a = new com.ironsource.C3300u.b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.C3300u.d invoke(org.json.JSONObject it) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
            return new com.ironsource.C3300u.d(it);
        }
    }

    /* renamed from: com.ironsource.u$c */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* renamed from: com.ironsource.u$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final com.ironsource.C3 f6746a;
        private final com.ironsource.C2956ad b;
        private final com.ironsource.M4 c;
        private final java.lang.Long d;
        private final com.ironsource.Qd e;
        private final com.ironsource.Qd f;
        private final com.ironsource.Ad g;

        public d(org.json.JSONObject features) {
            com.ironsource.C3 c3;
            com.ironsource.C2956ad c2956ad;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(features, "features");
            com.ironsource.Ad ad = null;
            if (features.has(com.ironsource.C3300u.e)) {
                org.json.JSONObject jSONObject = features.getJSONObject(com.ironsource.C3300u.e);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "features.getJSONObject(key)");
                c3 = new com.ironsource.C3(jSONObject);
            } else {
                c3 = null;
            }
            this.f6746a = c3;
            if (features.has(com.ironsource.C3300u.f)) {
                org.json.JSONObject jSONObject2 = features.getJSONObject(com.ironsource.C3300u.f);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "features.getJSONObject(key)");
                c2956ad = new com.ironsource.C2956ad(jSONObject2);
            } else {
                c2956ad = null;
            }
            this.b = c2956ad;
            this.c = features.has(com.ironsource.C3300u.g) ? new com.ironsource.M4(features.getBoolean(com.ironsource.C3300u.g)) : null;
            this.d = features.has(com.ironsource.C3300u.i) ? java.lang.Long.valueOf(features.getLong(com.ironsource.C3300u.i)) : null;
            org.json.JSONObject optJSONObject = features.optJSONObject(com.ironsource.C3300u.j);
            this.e = optJSONObject != null ? new com.ironsource.Qd(optJSONObject, "name", com.ironsource.C3300u.l) : null;
            com.ironsource.Qd qd = new com.ironsource.Qd(features, com.ironsource.C3300u.m, com.ironsource.C3300u.n);
            java.lang.String b = qd.b();
            this.f = (b == null || b.length() == 0 || qd.a() == null) ? null : qd;
            if (features.has(com.ironsource.C3300u.h)) {
                org.json.JSONObject jSONObject3 = features.getJSONObject(com.ironsource.C3300u.h);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject3, "features.getJSONObject(key)");
                ad = new com.ironsource.Ad(jSONObject3);
            }
            this.g = ad;
        }

        public final com.ironsource.Qd a() {
            return this.e;
        }

        public final com.ironsource.C3 b() {
            return this.f6746a;
        }

        public final com.ironsource.M4 c() {
            return this.c;
        }

        public final java.lang.Long d() {
            return this.d;
        }

        public final com.ironsource.C2956ad e() {
            return this.b;
        }

        public final com.ironsource.Qd f() {
            return this.f;
        }

        public final com.ironsource.Ad g() {
            return this.g;
        }
    }

    public C3300u(org.json.JSONObject configurations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurations, "configurations");
        this.f6743a = new com.ironsource.C3225pd(configurations).a(com.ironsource.C3300u.b.f6745a);
        this.b = new com.ironsource.C3300u.d(configurations);
        this.c = new com.ironsource.C2944a1(configurations).a(com.ironsource.C3300u.a.f6744a);
    }

    public final java.util.Map<java.lang.String, com.ironsource.C3300u.d> a() {
        return this.c;
    }

    public final com.ironsource.C3300u.d b() {
        return this.b;
    }

    public final java.util.Map<java.lang.String, com.ironsource.C3300u.d> c() {
        return this.f6743a;
    }
}
