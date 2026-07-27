package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class m6 {
    public static final a c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f4872a;
    public final int b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m6 a(JSONObject jSONObject) {
            if (jSONObject != null) {
                return new m6(jSONObject.getInt("w"), jSONObject.getInt("h"));
            }
            return null;
        }

        public a() {
        }
    }

    public m6(int i, int i2) {
        this.f4872a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.f4872a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6)) {
            return false;
        }
        m6 m6Var = (m6) obj;
        return this.f4872a == m6Var.f4872a && this.b == m6Var.b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f4872a) * 31) + Integer.hashCode(this.b);
    }

    public String toString() {
        return "Dimensions(width=" + this.f4872a + ", height=" + this.b + ")";
    }
}
