package com.ironsource;

/* loaded from: classes5.dex */
public final class Fg {
    public static final com.ironsource.Fg.a c = new com.ironsource.Fg.a(null);

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.Double f5715a;
    private final java.lang.Double b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final com.ironsource.Fg.b a() {
            return new com.ironsource.Fg.b();
        }

        @kotlin.jvm.JvmStatic
        public final com.ironsource.Fg b() {
            return a().a();
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private java.lang.Double f5716a;
        private java.lang.Double b;

        public final void a(java.lang.Double d) {
            this.b = d;
        }

        public final void b(java.lang.Double d) {
            this.f5716a = d;
        }

        public final java.lang.Double c() {
            return this.f5716a;
        }

        public final com.ironsource.Fg.b a(double d) {
            this.b = java.lang.Double.valueOf(d);
            return this;
        }

        public final java.lang.Double b() {
            return this.b;
        }

        public final com.ironsource.Fg a() {
            return new com.ironsource.Fg(this, null);
        }

        public final com.ironsource.Fg.b b(double d) {
            this.f5716a = java.lang.Double.valueOf(d);
            return this;
        }
    }

    public /* synthetic */ Fg(com.ironsource.Fg.b bVar, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    @kotlin.jvm.JvmStatic
    public static final com.ironsource.Fg.b a() {
        return c.a();
    }

    @kotlin.jvm.JvmStatic
    public static final com.ironsource.Fg b() {
        return c.b();
    }

    public final java.lang.Double c() {
        return this.b;
    }

    public final java.lang.Double d() {
        return this.f5715a;
    }

    public final java.lang.String e() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("ceiling", this.b);
            jSONObject.put("floor", this.f5715a);
        } catch (org.json.JSONException e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.getMessage());
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "json.toString()");
        return jSONObject2;
    }

    public java.lang.String toString() {
        return "WaterfallConfiguration" + e();
    }

    private Fg(com.ironsource.Fg.b bVar) {
        this.f5715a = bVar.c();
        this.b = bVar.b();
    }
}
