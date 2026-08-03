package com.ironsource;

/* renamed from: com.ironsource.n9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3185n9 {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6494a;
    private final java.lang.String b;
    private final java.lang.String c;
    private final java.lang.String d;
    private final java.lang.String e;
    private final java.lang.Boolean f;
    private final org.json.JSONObject g;
    private final com.ironsource.C3185n9.a h;

    /* renamed from: com.ironsource.n9$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final org.json.JSONObject f6495a;
        private final org.json.JSONObject b;
        private final org.json.JSONObject c;
        private final org.json.JSONObject d;

        public a() {
            this(null, null, null, null, 15, null);
        }

        public final org.json.JSONObject a() {
            return this.f6495a;
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
            if (!(obj instanceof com.ironsource.C3185n9.a)) {
                return false;
            }
            com.ironsource.C3185n9.a aVar = (com.ironsource.C3185n9.a) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.f6495a, aVar.f6495a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, aVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, aVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, aVar.d);
        }

        public final org.json.JSONObject f() {
            return this.b;
        }

        public final org.json.JSONObject g() {
            return this.d;
        }

        public final org.json.JSONObject h() {
            return this.f6495a;
        }

        public int hashCode() {
            org.json.JSONObject jSONObject = this.f6495a;
            int hashCode = (jSONObject == null ? 0 : jSONObject.hashCode()) * 31;
            org.json.JSONObject jSONObject2 = this.b;
            int hashCode2 = (hashCode + (jSONObject2 == null ? 0 : jSONObject2.hashCode())) * 31;
            org.json.JSONObject jSONObject3 = this.c;
            int hashCode3 = (hashCode2 + (jSONObject3 == null ? 0 : jSONObject3.hashCode())) * 31;
            org.json.JSONObject jSONObject4 = this.d;
            return hashCode3 + (jSONObject4 != null ? jSONObject4.hashCode() : 0);
        }

        public java.lang.String toString() {
            return "AdFormats(rewarded=" + this.f6495a + ", interstitial=" + this.b + ", banner=" + this.c + ", nativeAd=" + this.d + ")";
        }

        public a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, org.json.JSONObject jSONObject4) {
            this.f6495a = jSONObject;
            this.b = jSONObject2;
            this.c = jSONObject3;
            this.d = jSONObject4;
        }

        public final com.ironsource.C3185n9.a a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, org.json.JSONObject jSONObject4) {
            return new com.ironsource.C3185n9.a(jSONObject, jSONObject2, jSONObject3, jSONObject4);
        }

        public static /* synthetic */ com.ironsource.C3185n9.a a(com.ironsource.C3185n9.a aVar, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, org.json.JSONObject jSONObject4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                jSONObject = aVar.f6495a;
            }
            if ((i & 2) != 0) {
                jSONObject2 = aVar.b;
            }
            if ((i & 4) != 0) {
                jSONObject3 = aVar.c;
            }
            if ((i & 8) != 0) {
                jSONObject4 = aVar.d;
            }
            return aVar.a(jSONObject, jSONObject2, jSONObject3, jSONObject4);
        }

        public /* synthetic */ a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, org.json.JSONObject jSONObject4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : jSONObject, (i & 2) != 0 ? null : jSONObject2, (i & 4) != 0 ? null : jSONObject3, (i & 8) != 0 ? null : jSONObject4);
        }
    }

    public C3185n9() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final java.lang.String a() {
        return this.f6494a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final java.lang.String c() {
        return this.c;
    }

    public final java.lang.String d() {
        return this.d;
    }

    public final java.lang.String e() {
        return this.e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.C3185n9)) {
            return false;
        }
        com.ironsource.C3185n9 c3185n9 = (com.ironsource.C3185n9) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f6494a, c3185n9.f6494a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c3185n9.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c3185n9.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, c3185n9.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, c3185n9.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, c3185n9.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, c3185n9.g) && kotlin.jvm.internal.Intrinsics.areEqual(this.h, c3185n9.h);
    }

    public final java.lang.Boolean f() {
        return this.f;
    }

    public final org.json.JSONObject g() {
        return this.g;
    }

    public final com.ironsource.C3185n9.a h() {
        return this.h;
    }

    public int hashCode() {
        java.lang.String str = this.f6494a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.Boolean bool = this.f;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        org.json.JSONObject jSONObject = this.g;
        int hashCode7 = (hashCode6 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        com.ironsource.C3185n9.a aVar = this.h;
        return hashCode7 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final com.ironsource.C3185n9.a i() {
        return this.h;
    }

    public final java.lang.String j() {
        return this.f6494a;
    }

    public final org.json.JSONObject k() {
        return this.g;
    }

    public final java.lang.Boolean l() {
        return this.f;
    }

    public final java.lang.String m() {
        return this.d;
    }

    public final java.lang.String n() {
        return this.c;
    }

    public final java.lang.String o() {
        return this.b;
    }

    public final java.lang.String p() {
        return this.e;
    }

    public java.lang.String toString() {
        return "InstanceProviderSettings2(adSourceName=" + this.f6494a + ", providerNetworkKey=" + this.b + ", providerLoadName=" + this.c + ", providerDefaultInstance=" + this.d + ", spId=" + this.e + ", mpis=" + this.f + ", application=" + this.g + ", adFormats=" + this.h + ")";
    }

    public C3185n9(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Boolean bool, org.json.JSONObject jSONObject, com.ironsource.C3185n9.a aVar) {
        this.f6494a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = bool;
        this.g = jSONObject;
        this.h = aVar;
    }

    public final com.ironsource.C3185n9 a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Boolean bool, org.json.JSONObject jSONObject, com.ironsource.C3185n9.a aVar) {
        return new com.ironsource.C3185n9(str, str2, str3, str4, str5, bool, jSONObject, aVar);
    }

    public /* synthetic */ C3185n9(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Boolean bool, org.json.JSONObject jSONObject, com.ironsource.C3185n9.a aVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : jSONObject, (i & 128) == 0 ? aVar : null);
    }
}
