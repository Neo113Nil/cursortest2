package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.m6;
import io.ktor.http.ContentDisposition;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class m2 {
    public static final a d = new a(null);
    public static final m6 e;
    public static final m6 f;
    public static final m6 g;
    public static final m2 h;

    /* renamed from: a, reason: collision with root package name */
    public final m6 f4867a;
    public final m6 b;
    public final m6 c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m2 a() {
            return m2.h;
        }

        public a() {
        }

        public final m2 a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            m6.a aVar = m6.c;
            m6 a2 = aVar.a(jSONObject.optJSONObject("margin"));
            if (a2 == null) {
                a2 = m2.e;
            }
            m6 a3 = aVar.a(jSONObject.optJSONObject("padding"));
            if (a3 == null) {
                a3 = m2.f;
            }
            m6 a4 = aVar.a(jSONObject.optJSONObject(ContentDisposition.Parameters.Size));
            if (a4 == null) {
                a4 = m2.g;
            }
            return new m2(a2, a3, a4);
        }
    }

    static {
        m6 m6Var = new m6(0, 0);
        e = m6Var;
        m6 m6Var2 = new m6(8, 8);
        f = m6Var2;
        m6 m6Var3 = new m6(28, 28);
        g = m6Var3;
        h = new m2(m6Var, m6Var2, m6Var3);
    }

    public m2(m6 margin, m6 padding, m6 size) {
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(padding, "padding");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f4867a = margin;
        this.b = padding;
        this.c = size;
    }

    public final m6 e() {
        return this.f4867a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return Intrinsics.areEqual(this.f4867a, m2Var.f4867a) && Intrinsics.areEqual(this.b, m2Var.b) && Intrinsics.areEqual(this.c, m2Var.c);
    }

    public final m6 f() {
        return this.b;
    }

    public final m6 g() {
        return this.c;
    }

    public int hashCode() {
        return (((this.f4867a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "ButtonAttributes(margin=" + this.f4867a + ", padding=" + this.b + ", size=" + this.c + ")";
    }
}
