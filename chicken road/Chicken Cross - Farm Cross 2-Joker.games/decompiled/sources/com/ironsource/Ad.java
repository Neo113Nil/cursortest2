package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Ad {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f7553a;
    private final JSONObject b;
    private final JSONObject c;
    private final JSONObject d;

    public Ad() {
        this(null, null, null, null, 15, null);
    }

    public final JSONObject a() {
        return this.f7553a;
    }

    public final JSONObject b() {
        return this.b;
    }

    public final JSONObject c() {
        return this.c;
    }

    public final JSONObject d() {
        return this.d;
    }

    public final JSONObject e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ad)) {
            return false;
        }
        Ad ad = (Ad) obj;
        return Intrinsics.areEqual(this.f7553a, ad.f7553a) && Intrinsics.areEqual(this.b, ad.b) && Intrinsics.areEqual(this.c, ad.c) && Intrinsics.areEqual(this.d, ad.d);
    }

    public final JSONObject f() {
        return this.b;
    }

    public final JSONObject g() {
        return this.d;
    }

    public final JSONObject h() {
        return this.f7553a;
    }

    public int hashCode() {
        JSONObject jSONObject = this.f7553a;
        int hashCode = (jSONObject == null ? 0 : jSONObject.hashCode()) * 31;
        JSONObject jSONObject2 = this.b;
        int hashCode2 = (hashCode + (jSONObject2 == null ? 0 : jSONObject2.hashCode())) * 31;
        JSONObject jSONObject3 = this.c;
        int hashCode3 = (hashCode2 + (jSONObject3 == null ? 0 : jSONObject3.hashCode())) * 31;
        JSONObject jSONObject4 = this.d;
        return hashCode3 + (jSONObject4 != null ? jSONObject4.hashCode() : 0);
    }

    public String toString() {
        return "ProviderConfig2(rewarded=" + this.f7553a + ", interstitial=" + this.b + ", banner=" + this.c + ", nativeAd=" + this.d + ")";
    }

    public Ad(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.f7553a = jSONObject;
        this.b = jSONObject2;
        this.c = jSONObject3;
        this.d = jSONObject4;
    }

    public final Ad a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        return new Ad(jSONObject, jSONObject2, jSONObject3, jSONObject4);
    }

    public static /* synthetic */ Ad a(Ad ad, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = ad.f7553a;
        }
        if ((i & 2) != 0) {
            jSONObject2 = ad.b;
        }
        if ((i & 4) != 0) {
            jSONObject3 = ad.c;
        }
        if ((i & 8) != 0) {
            jSONObject4 = ad.d;
        }
        return ad.a(jSONObject, jSONObject2, jSONObject3, jSONObject4);
    }

    public /* synthetic */ Ad(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : jSONObject, (i & 2) != 0 ? null : jSONObject2, (i & 4) != 0 ? null : jSONObject3, (i & 8) != 0 ? null : jSONObject4);
    }
}
