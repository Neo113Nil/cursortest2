package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.o9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4568o9 {

    /* renamed from: a, reason: collision with root package name */
    private final String f8469a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final Boolean f;
    private final JSONObject g;
    private final a h;

    /* renamed from: com.ironsource.o9$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final JSONObject f8470a;
        private final JSONObject b;
        private final JSONObject c;
        private final JSONObject d;

        public a() {
            this(null, null, null, null, 15, null);
        }

        public final JSONObject a() {
            return this.f8470a;
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f8470a, aVar.f8470a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c) && Intrinsics.areEqual(this.d, aVar.d);
        }

        public final JSONObject f() {
            return this.b;
        }

        public final JSONObject g() {
            return this.d;
        }

        public final JSONObject h() {
            return this.f8470a;
        }

        public int hashCode() {
            JSONObject jSONObject = this.f8470a;
            int hashCode = (jSONObject == null ? 0 : jSONObject.hashCode()) * 31;
            JSONObject jSONObject2 = this.b;
            int hashCode2 = (hashCode + (jSONObject2 == null ? 0 : jSONObject2.hashCode())) * 31;
            JSONObject jSONObject3 = this.c;
            int hashCode3 = (hashCode2 + (jSONObject3 == null ? 0 : jSONObject3.hashCode())) * 31;
            JSONObject jSONObject4 = this.d;
            return hashCode3 + (jSONObject4 != null ? jSONObject4.hashCode() : 0);
        }

        public String toString() {
            return "AdFormats(rewarded=" + this.f8470a + ", interstitial=" + this.b + ", banner=" + this.c + ", nativeAd=" + this.d + ")";
        }

        public a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
            this.f8470a = jSONObject;
            this.b = jSONObject2;
            this.c = jSONObject3;
            this.d = jSONObject4;
        }

        public final a a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
            return new a(jSONObject, jSONObject2, jSONObject3, jSONObject4);
        }

        public static /* synthetic */ a a(a aVar, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i, Object obj) {
            if ((i & 1) != 0) {
                jSONObject = aVar.f8470a;
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

        public /* synthetic */ a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : jSONObject, (i & 2) != 0 ? null : jSONObject2, (i & 4) != 0 ? null : jSONObject3, (i & 8) != 0 ? null : jSONObject4);
        }
    }

    public C4568o9() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final String a() {
        return this.f8469a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4568o9)) {
            return false;
        }
        C4568o9 c4568o9 = (C4568o9) obj;
        return Intrinsics.areEqual(this.f8469a, c4568o9.f8469a) && Intrinsics.areEqual(this.b, c4568o9.b) && Intrinsics.areEqual(this.c, c4568o9.c) && Intrinsics.areEqual(this.d, c4568o9.d) && Intrinsics.areEqual(this.e, c4568o9.e) && Intrinsics.areEqual(this.f, c4568o9.f) && Intrinsics.areEqual(this.g, c4568o9.g) && Intrinsics.areEqual(this.h, c4568o9.h);
    }

    public final Boolean f() {
        return this.f;
    }

    public final JSONObject g() {
        return this.g;
    }

    public final a h() {
        return this.h;
    }

    public int hashCode() {
        String str = this.f8469a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.f;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        JSONObject jSONObject = this.g;
        int hashCode7 = (hashCode6 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        a aVar = this.h;
        return hashCode7 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final a i() {
        return this.h;
    }

    public final String j() {
        return this.f8469a;
    }

    public final JSONObject k() {
        return this.g;
    }

    public final Boolean l() {
        return this.f;
    }

    public final String m() {
        return this.d;
    }

    public final String n() {
        return this.c;
    }

    public final String o() {
        return this.b;
    }

    public final String p() {
        return this.e;
    }

    public String toString() {
        return "InstanceProviderSettings2(adSourceName=" + this.f8469a + ", providerNetworkKey=" + this.b + ", providerLoadName=" + this.c + ", providerDefaultInstance=" + this.d + ", spId=" + this.e + ", mpis=" + this.f + ", application=" + this.g + ", adFormats=" + this.h + ")";
    }

    public C4568o9(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, a aVar) {
        this.f8469a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = bool;
        this.g = jSONObject;
        this.h = aVar;
    }

    public final C4568o9 a(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, a aVar) {
        return new C4568o9(str, str2, str3, str4, str5, bool, jSONObject, aVar);
    }

    public /* synthetic */ C4568o9(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : jSONObject, (i & 128) == 0 ? aVar : null);
    }
}
