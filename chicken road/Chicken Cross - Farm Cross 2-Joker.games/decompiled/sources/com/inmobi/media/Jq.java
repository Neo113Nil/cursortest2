package com.inmobi.media;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Lazy;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Jq {

    /* renamed from: a, reason: collision with root package name */
    public final int f6658a;
    public final int b;
    public final int c;
    public final int d;

    public Jq(int i, int i2, int i3, int i4) {
        this.f6658a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("left", AbstractC3727g4.a(this.f6658a));
            jSONObject.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, AbstractC3727g4.a(this.b));
            jSONObject.put("right", AbstractC3727g4.a(this.c));
            jSONObject.put("bottom", AbstractC3727g4.a(this.d));
            return jSONObject;
        } catch (Exception e) {
            Lazy lazy = Ba.f6473a;
            Ba.a(new C3810j3(e));
            return new JSONObject();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jq)) {
            return false;
        }
        Jq jq = (Jq) obj;
        return this.f6658a == jq.f6658a && this.b == jq.b && this.c == jq.c && this.d == jq.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + Hj.a(this.c, Hj.a(this.b, Integer.hashCode(this.f6658a) * 31, 31), 31);
    }

    public final String toString() {
        return "Insets(left=" + this.f6658a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + ")";
    }
}
