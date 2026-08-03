package com.ironsource;

/* loaded from: classes5.dex */
public final class Bd {

    /* renamed from: a, reason: collision with root package name */
    private final org.json.JSONObject f5635a;
    private final org.json.JSONObject b;
    private final org.json.JSONObject c;
    private final org.json.JSONObject d;

    public Bd() {
        this(null, null, null, null, 15, null);
    }

    public final org.json.JSONObject a() {
        return this.f5635a;
    }

    public final org.json.JSONObject b() {
        return this.b;
    }

    public final org.json.JSONObject c() {
        return this.c;
    }

    public final org.json.JSONObject d() {
        return this.d;
    }

    public final org.json.JSONObject e() {
        return this.c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.Bd)) {
            return false;
        }
        com.ironsource.Bd bd = (com.ironsource.Bd) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5635a, bd.f5635a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, bd.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, bd.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, bd.d);
    }

    public final org.json.JSONObject f() {
        return this.b;
    }

    public final org.json.JSONObject g() {
        return this.d;
    }

    public final org.json.JSONObject h() {
        return this.f5635a;
    }

    public int hashCode() {
        org.json.JSONObject jSONObject = this.f5635a;
        int hashCode = (jSONObject == null ? 0 : jSONObject.hashCode()) * 31;
        org.json.JSONObject jSONObject2 = this.b;
        int hashCode2 = (hashCode + (jSONObject2 == null ? 0 : jSONObject2.hashCode())) * 31;
        org.json.JSONObject jSONObject3 = this.c;
        int hashCode3 = (hashCode2 + (jSONObject3 == null ? 0 : jSONObject3.hashCode())) * 31;
        org.json.JSONObject jSONObject4 = this.d;
        return hashCode3 + (jSONObject4 != null ? jSONObject4.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ProviderConfig2(rewarded=" + this.f5635a + ", interstitial=" + this.b + ", banner=" + this.c + ", nativeAd=" + this.d + ")";
    }

    public Bd(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, org.json.JSONObject jSONObject4) {
        this.f5635a = jSONObject;
        this.b = jSONObject2;
        this.c = jSONObject3;
        this.d = jSONObject4;
    }

    public final com.ironsource.Bd a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, org.json.JSONObject jSONObject4) {
        return new com.ironsource.Bd(jSONObject, jSONObject2, jSONObject3, jSONObject4);
    }

    public static /* synthetic */ com.ironsource.Bd a(com.ironsource.Bd bd, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, org.json.JSONObject jSONObject4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            jSONObject = bd.f5635a;
        }
        if ((i & 2) != 0) {
            jSONObject2 = bd.b;
        }
        if ((i & 4) != 0) {
            jSONObject3 = bd.c;
        }
        if ((i & 8) != 0) {
            jSONObject4 = bd.d;
        }
        return bd.a(jSONObject, jSONObject2, jSONObject3, jSONObject4);
    }

    public /* synthetic */ Bd(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, org.json.JSONObject jSONObject4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : jSONObject, (i & 2) != 0 ? null : jSONObject2, (i & 4) != 0 ? null : jSONObject3, (i & 8) != 0 ? null : jSONObject4);
    }
}
