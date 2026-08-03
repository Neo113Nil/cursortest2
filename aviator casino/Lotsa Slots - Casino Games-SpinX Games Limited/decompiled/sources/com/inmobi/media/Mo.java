package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Mo {

    /* renamed from: a, reason: collision with root package name */
    public final int f4843a;
    public final int b;
    public final int c;
    public final int d;

    public Mo(int i, int i2, int i3, int i4) {
        this.f4843a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final org.json.JSONObject a() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("left", com.inmobi.media.J3.a(this.f4843a));
            jSONObject.put("top", com.inmobi.media.J3.a(this.b));
            jSONObject.put("right", com.inmobi.media.J3.a(this.c));
            jSONObject.put(com.helpshift.proactive.InAppViewConstants.POSITION_BOTTOM, com.inmobi.media.J3.a(this.d));
            return jSONObject;
        } catch (java.lang.Exception e) {
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.W9.a(new com.inmobi.media.M2(e));
            return new org.json.JSONObject();
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.Mo)) {
            return false;
        }
        com.inmobi.media.Mo mo = (com.inmobi.media.Mo) obj;
        return this.f4843a == mo.f4843a && this.b == mo.b && this.c == mo.c && this.d == mo.d;
    }

    public final int hashCode() {
        return this.d + com.inmobi.media.AbstractC2755si.a(this.c, com.inmobi.media.AbstractC2755si.a(this.b, this.f4843a * 31, 31), 31);
    }

    public final java.lang.String toString() {
        return "Insets(left=" + this.f4843a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + ")";
    }
}
