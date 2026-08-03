package com.ironsource;

/* renamed from: com.ironsource.zb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3402zb {
    public static final com.ironsource.C3402zb.a c = new com.ironsource.C3402zb.a(null);
    public static final java.lang.String d = "revenue";
    public static final java.lang.String e = "precision";

    /* renamed from: a, reason: collision with root package name */
    private final double f6862a;
    private final java.lang.String b;

    /* renamed from: com.ironsource.zb$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final com.ironsource.C3402zb a(org.json.JSONObject json) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
            try {
                double d = json.getDouble("revenue");
                java.lang.String precision = json.getString("precision");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(precision, "precision");
                return new com.ironsource.C3402zb(d, precision);
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.Ff.a(e);
                return null;
            }
        }

        private a() {
        }
    }

    public C3402zb(double d2, java.lang.String precision) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(precision, "precision");
        this.f6862a = d2;
        this.b = precision;
    }

    public final double a() {
        return this.f6862a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final java.lang.String c() {
        return this.b;
    }

    public final double d() {
        return this.f6862a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.C3402zb)) {
            return false;
        }
        com.ironsource.C3402zb c3402zb = (com.ironsource.C3402zb) obj;
        return java.lang.Double.compare(this.f6862a, c3402zb.f6862a) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c3402zb.b);
    }

    public int hashCode() {
        return (androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(this.f6862a) * 31) + this.b.hashCode();
    }

    public java.lang.String toString() {
        return "LoadArmData(revenue=" + this.f6862a + ", precision=" + this.b + ")";
    }

    public final com.ironsource.C3402zb a(double d2, java.lang.String precision) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(precision, "precision");
        return new com.ironsource.C3402zb(d2, precision);
    }

    public static /* synthetic */ com.ironsource.C3402zb a(com.ironsource.C3402zb c3402zb, double d2, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            d2 = c3402zb.f6862a;
        }
        if ((i & 2) != 0) {
            str = c3402zb.b;
        }
        return c3402zb.a(d2, str);
    }

    @kotlin.jvm.JvmStatic
    public static final com.ironsource.C3402zb a(org.json.JSONObject jSONObject) {
        return c.a(jSONObject);
    }
}
