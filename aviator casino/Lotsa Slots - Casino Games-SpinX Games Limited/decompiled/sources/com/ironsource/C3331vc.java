package com.ironsource;

/* renamed from: com.ironsource.vc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3331vc {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3160m2 f6780a;
    private final boolean b;

    /* renamed from: com.ironsource.vc$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.C3331vc.a f6781a = new com.ironsource.C3331vc.a();
        public static final java.lang.String b = "adm";
        public static final java.lang.String c = "isOneFlow";
        public static final java.lang.String d = "isMultipleAdObjects";
        public static final java.lang.String e = "adsInternalInfo";
        public static final java.lang.String f = "success";
        public static final java.lang.String g = "error";
        public static final java.lang.String h = "data";

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3331vc() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public final java.util.HashMap<java.lang.String, java.lang.String> a() {
        com.ironsource.C3249r2 g;
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        hashMap.put("isOneFlow", java.lang.String.valueOf(this.b));
        hashMap.put("isMultipleAdObjects", "true");
        java.util.List<com.ironsource.P> a2 = com.ironsource.Jb.u.d().I().a();
        java.lang.String jSONObject = a2 != null ? new org.json.JSONObject().put("success", true).put("data", a2).toString() : new org.json.JSONObject().put("success", false).put("error", "Failed to get ad internal info").toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "if (jsonAdInternalInfo !…    .toString()\n        }");
        hashMap.put(com.ironsource.C3331vc.a.e, jSONObject);
        com.ironsource.C3160m2 c3160m2 = this.f6780a;
        if (c3160m2 != null && (g = c3160m2.g()) != null) {
            hashMap.put("adm", g.a());
            hashMap.putAll(g.b());
        }
        return hashMap;
    }

    public C3331vc(com.ironsource.C3160m2 c3160m2, boolean z) {
        this.f6780a = c3160m2;
        this.b = z;
    }

    public /* synthetic */ C3331vc(com.ironsource.C3160m2 c3160m2, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c3160m2, (i & 2) != 0 ? false : z);
    }
}
