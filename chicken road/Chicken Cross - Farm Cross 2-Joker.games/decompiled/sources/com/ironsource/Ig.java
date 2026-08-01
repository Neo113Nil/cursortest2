package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Ig {
    public static final a c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Double f7706a;
    private final Double b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final b a() {
            return new b();
        }

        @JvmStatic
        public final Ig b() {
            return a().a();
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Double f7707a;
        private Double b;

        public final void a(Double d) {
            this.b = d;
        }

        public final void b(Double d) {
            this.f7707a = d;
        }

        public final Double c() {
            return this.f7707a;
        }

        public final b a(double d) {
            this.b = Double.valueOf(d);
            return this;
        }

        public final Double b() {
            return this.b;
        }

        public final Ig a() {
            return new Ig(this, null);
        }

        public final b b(double d) {
            this.f7707a = Double.valueOf(d);
            return this;
        }
    }

    public /* synthetic */ Ig(b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    @JvmStatic
    public static final b a() {
        return c.a();
    }

    @JvmStatic
    public static final Ig b() {
        return c.b();
    }

    public final Double c() {
        return this.b;
    }

    public final Double d() {
        return this.f7706a;
    }

    public final String e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ceiling", this.b);
            jSONObject.put("floor", this.f7706a);
        } catch (JSONException e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.getMessage());
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "json.toString()");
        return jSONObject2;
    }

    public String toString() {
        return "WaterfallConfiguration" + e();
    }

    private Ig(b bVar) {
        this.f7706a = bVar.c();
        this.b = bVar.b();
    }
}
