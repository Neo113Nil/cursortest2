package com.ironsource;

/* renamed from: com.ironsource.i9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3096i9 {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6310a;
    private final java.lang.String b;
    private final com.ironsource.EnumC3131k9 c;
    private final org.json.JSONObject d;

    public C3096i9(java.lang.String url, java.lang.String storePackage, com.ironsource.EnumC3131k9 strategy, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storePackage, "storePackage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f6310a = url;
        this.b = storePackage;
        this.c = strategy;
        this.d = jSONObject;
    }

    public final java.lang.String a() {
        return this.f6310a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final com.ironsource.EnumC3131k9 c() {
        return this.c;
    }

    public final org.json.JSONObject d() {
        return this.d;
    }

    public final org.json.JSONObject e() {
        return this.d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.C3096i9)) {
            return false;
        }
        com.ironsource.C3096i9 c3096i9 = (com.ironsource.C3096i9) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f6310a, c3096i9.f6310a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c3096i9.b) && this.c == c3096i9.c && kotlin.jvm.internal.Intrinsics.areEqual(this.d, c3096i9.d);
    }

    public final java.lang.String f() {
        return this.b;
    }

    public final com.ironsource.EnumC3131k9 g() {
        return this.c;
    }

    public final java.lang.String h() {
        return this.f6310a;
    }

    public int hashCode() {
        int hashCode = ((((this.f6310a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        org.json.JSONObject jSONObject = this.d;
        return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public java.lang.String toString() {
        return "InlineStoreRequest(url=" + this.f6310a + ", storePackage=" + this.b + ", strategy=" + this.c + ", extras=" + this.d + ")";
    }

    public final com.ironsource.C3096i9 a(java.lang.String url, java.lang.String storePackage, com.ironsource.EnumC3131k9 strategy, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storePackage, "storePackage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "strategy");
        return new com.ironsource.C3096i9(url, storePackage, strategy, jSONObject);
    }

    public static /* synthetic */ com.ironsource.C3096i9 a(com.ironsource.C3096i9 c3096i9, java.lang.String str, java.lang.String str2, com.ironsource.EnumC3131k9 enumC3131k9, org.json.JSONObject jSONObject, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c3096i9.f6310a;
        }
        if ((i & 2) != 0) {
            str2 = c3096i9.b;
        }
        if ((i & 4) != 0) {
            enumC3131k9 = c3096i9.c;
        }
        if ((i & 8) != 0) {
            jSONObject = c3096i9.d;
        }
        return c3096i9.a(str, str2, enumC3131k9, jSONObject);
    }

    public /* synthetic */ C3096i9(java.lang.String str, java.lang.String str2, com.ironsource.EnumC3131k9 enumC3131k9, org.json.JSONObject jSONObject, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? com.ironsource.EnumC3131k9.APP_ACTIVITY : enumC3131k9, (i & 8) != 0 ? null : jSONObject);
    }
}
