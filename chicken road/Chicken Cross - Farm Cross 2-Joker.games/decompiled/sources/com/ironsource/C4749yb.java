package com.ironsource;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.yb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4749yb {
    public static final a c = new a(null);
    public static final String d = "revenue";
    public static final String e = "precision";

    /* renamed from: a, reason: collision with root package name */
    private final double f8779a;
    private final String b;

    /* renamed from: com.ironsource.yb$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final C4749yb a(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                double d = json.getDouble("revenue");
                String precision = json.getString("precision");
                Intrinsics.checkNotNullExpressionValue(precision, "precision");
                return new C4749yb(d, precision);
            } catch (Exception e) {
                C4491k4.d().a(e);
                Gf.a(e);
                return null;
            }
        }

        private a() {
        }
    }

    public C4749yb(double d2, String precision) {
        Intrinsics.checkNotNullParameter(precision, "precision");
        this.f8779a = d2;
        this.b = precision;
    }

    public final double a() {
        return this.f8779a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.b;
    }

    public final double d() {
        return this.f8779a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4749yb)) {
            return false;
        }
        C4749yb c4749yb = (C4749yb) obj;
        return Double.compare(this.f8779a, c4749yb.f8779a) == 0 && Intrinsics.areEqual(this.b, c4749yb.b);
    }

    public int hashCode() {
        return (Double.hashCode(this.f8779a) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "LoadArmData(revenue=" + this.f8779a + ", precision=" + this.b + ")";
    }

    public final C4749yb a(double d2, String precision) {
        Intrinsics.checkNotNullParameter(precision, "precision");
        return new C4749yb(d2, precision);
    }

    public static /* synthetic */ C4749yb a(C4749yb c4749yb, double d2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d2 = c4749yb.f8779a;
        }
        if ((i & 2) != 0) {
            str = c4749yb.b;
        }
        return c4749yb.a(d2, str);
    }

    @JvmStatic
    public static final C4749yb a(JSONObject jSONObject) {
        return c.a(jSONObject);
    }
}
