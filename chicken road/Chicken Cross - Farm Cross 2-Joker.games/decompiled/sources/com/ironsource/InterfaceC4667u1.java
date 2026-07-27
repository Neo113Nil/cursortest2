package com.ironsource;

import com.ironsource.C4531m8;
import com.ironsource.U3;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.u1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4667u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f8686a = b.f8688a;

    /* renamed from: com.ironsource.u1$a */
    public interface a extends InterfaceC4667u1 {

        /* renamed from: com.ironsource.u1$a$a, reason: collision with other inner class name */
        public static final class C1343a implements a {
            private final String b;
            private final String c;
            private final C4531m8.e d;
            private final String e;
            private final String f;
            private final C1344a g;
            private final int h;
            private final int i;

            /* renamed from: com.ironsource.u1$a$a$a, reason: collision with other inner class name */
            public static final class C1344a {

                /* renamed from: a, reason: collision with root package name */
                private final int f8687a;
                private final int b;

                public C1344a(int i, int i2) {
                    this.f8687a = i;
                    this.b = i2;
                }

                public final int a() {
                    return this.f8687a;
                }

                public final int b() {
                    return this.b;
                }

                public final int c() {
                    return this.f8687a;
                }

                public final int d() {
                    return this.b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1344a)) {
                        return false;
                    }
                    C1344a c1344a = (C1344a) obj;
                    return this.f8687a == c1344a.f8687a && this.b == c1344a.b;
                }

                public int hashCode() {
                    return (Integer.hashCode(this.f8687a) * 31) + Integer.hashCode(this.b);
                }

                public String toString() {
                    return "Coordinates(x=" + this.f8687a + ", y=" + this.b + ")";
                }

                public final C1344a a(int i, int i2) {
                    return new C1344a(i, i2);
                }

                public static /* synthetic */ C1344a a(C1344a c1344a, int i, int i2, int i3, Object obj) {
                    if ((i3 & 1) != 0) {
                        i = c1344a.f8687a;
                    }
                    if ((i3 & 2) != 0) {
                        i2 = c1344a.b;
                    }
                    return c1344a.a(i, i2);
                }
            }

            public C1343a(String successCallback, String failCallback, C4531m8.e productType, String demandSourceName, String url, C1344a coordinates, int i, int i2) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                this.b = successCallback;
                this.c = failCallback;
                this.d = productType;
                this.e = demandSourceName;
                this.f = url;
                this.g = coordinates;
                this.h = i;
                this.i = i2;
            }

            public final C1343a a(String successCallback, String failCallback, C4531m8.e productType, String demandSourceName, String url, C1344a coordinates, int i, int i2) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                return new C1343a(successCallback, failCallback, productType, demandSourceName, url, coordinates, i, i2);
            }

            @Override // com.ironsource.InterfaceC4667u1.a
            public String b() {
                return this.f;
            }

            @Override // com.ironsource.InterfaceC4667u1
            public String c() {
                return this.c;
            }

            @Override // com.ironsource.InterfaceC4667u1
            public C4531m8.e d() {
                return this.d;
            }

            @Override // com.ironsource.InterfaceC4667u1
            public String e() {
                return this.e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1343a)) {
                    return false;
                }
                C1343a c1343a = (C1343a) obj;
                return Intrinsics.areEqual(this.b, c1343a.b) && Intrinsics.areEqual(this.c, c1343a.c) && this.d == c1343a.d && Intrinsics.areEqual(this.e, c1343a.e) && Intrinsics.areEqual(this.f, c1343a.f) && Intrinsics.areEqual(this.g, c1343a.g) && this.h == c1343a.h && this.i == c1343a.i;
            }

            public final String f() {
                return this.b;
            }

            public final String g() {
                return this.c;
            }

            public final C4531m8.e h() {
                return this.d;
            }

            public int hashCode() {
                return (((((((((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + Integer.hashCode(this.h)) * 31) + Integer.hashCode(this.i);
            }

            public final String i() {
                return this.e;
            }

            public final String j() {
                return this.f;
            }

            public final C1344a k() {
                return this.g;
            }

            public final int l() {
                return this.h;
            }

            public final int m() {
                return this.i;
            }

            public final int n() {
                return this.h;
            }

            public final C1344a o() {
                return this.g;
            }

            public final int p() {
                return this.i;
            }

            public String toString() {
                return "Click(successCallback=" + this.b + ", failCallback=" + this.c + ", productType=" + this.d + ", demandSourceName=" + this.e + ", url=" + this.f + ", coordinates=" + this.g + ", action=" + this.h + ", metaState=" + this.i + ")";
            }

            @Override // com.ironsource.InterfaceC4667u1
            public String a() {
                return this.b;
            }
        }

        /* renamed from: com.ironsource.u1$a$b */
        public static final class b implements a {
            private final String b;
            private final String c;
            private final C4531m8.e d;
            private final String e;
            private final String f;

            public b(String successCallback, String failCallback, C4531m8.e productType, String demandSourceName, String url) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                this.b = successCallback;
                this.c = failCallback;
                this.d = productType;
                this.e = demandSourceName;
                this.f = url;
            }

            public final b a(String successCallback, String failCallback, C4531m8.e productType, String demandSourceName, String url) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                return new b(successCallback, failCallback, productType, demandSourceName, url);
            }

            @Override // com.ironsource.InterfaceC4667u1.a
            public String b() {
                return this.f;
            }

            @Override // com.ironsource.InterfaceC4667u1
            public String c() {
                return this.c;
            }

            @Override // com.ironsource.InterfaceC4667u1
            public C4531m8.e d() {
                return this.d;
            }

            @Override // com.ironsource.InterfaceC4667u1
            public String e() {
                return this.e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.b, bVar.b) && Intrinsics.areEqual(this.c, bVar.c) && this.d == bVar.d && Intrinsics.areEqual(this.e, bVar.e) && Intrinsics.areEqual(this.f, bVar.f);
            }

            public final String f() {
                return this.b;
            }

            public final String g() {
                return this.c;
            }

            public final C4531m8.e h() {
                return this.d;
            }

            public int hashCode() {
                return (((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
            }

            public final String i() {
                return this.e;
            }

            public final String j() {
                return this.f;
            }

            public String toString() {
                return "Impression(successCallback=" + this.b + ", failCallback=" + this.c + ", productType=" + this.d + ", demandSourceName=" + this.e + ", url=" + this.f + ")";
            }

            public static /* synthetic */ b a(b bVar, String str, String str2, C4531m8.e eVar, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bVar.b;
                }
                if ((i & 2) != 0) {
                    str2 = bVar.c;
                }
                String str5 = str2;
                if ((i & 4) != 0) {
                    eVar = bVar.d;
                }
                C4531m8.e eVar2 = eVar;
                if ((i & 8) != 0) {
                    str3 = bVar.e;
                }
                String str6 = str3;
                if ((i & 16) != 0) {
                    str4 = bVar.f;
                }
                return bVar.a(str, str5, eVar2, str6, str4);
            }

            @Override // com.ironsource.InterfaceC4667u1
            public String a() {
                return this.b;
            }
        }

        String b();
    }

    @JvmStatic
    static InterfaceC4667u1 a(String str) {
        return f8686a.a(str);
    }

    String a();

    String c();

    C4531m8.e d();

    String e();

    /* renamed from: com.ironsource.u1$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f8688a = new b();

        private b() {
        }

        @JvmStatic
        public final InterfaceC4667u1 a(String jsonString) {
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            JSONObject jSONObject = new JSONObject(jsonString);
            String optString = jSONObject.optString("type", "none");
            if (Intrinsics.areEqual(optString, V3.c)) {
                return a(jSONObject);
            }
            throw new IllegalArgumentException("unsupported message type: " + optString);
        }

        private final a a(JSONObject jSONObject) {
            String successCallback = jSONObject.getString("success");
            String failCallback = jSONObject.getString(U3.g.e);
            String demandSourceName = jSONObject.getString("demandSourceName");
            String string = jSONObject.getString(U3.i.m);
            Intrinsics.checkNotNullExpressionValue(string, "json.getString(ParametersKeys.PRODUCT_TYPE)");
            C4531m8.e valueOf = C4531m8.e.valueOf(string);
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            String url = jSONObject2.getString("url");
            String optString = jSONObject2.optString("type");
            if (Intrinsics.areEqual(optString, "click")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(V3.f);
                int i = jSONObject3.getInt(V3.g);
                int i2 = jSONObject3.getInt(V3.h);
                int optInt = jSONObject2.optInt("action", 0);
                int optInt2 = jSONObject2.optInt(V3.j, 0);
                Intrinsics.checkNotNullExpressionValue(successCallback, "successCallback");
                Intrinsics.checkNotNullExpressionValue(failCallback, "failCallback");
                Intrinsics.checkNotNullExpressionValue(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullExpressionValue(url, "url");
                return new a.C1343a(successCallback, failCallback, valueOf, demandSourceName, url, new a.C1343a.C1344a(i, i2), optInt, optInt2);
            }
            if (Intrinsics.areEqual(optString, "impression")) {
                Intrinsics.checkNotNullExpressionValue(successCallback, "successCallback");
                Intrinsics.checkNotNullExpressionValue(failCallback, "failCallback");
                Intrinsics.checkNotNullExpressionValue(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullExpressionValue(url, "url");
                return new a.b(successCallback, failCallback, valueOf, demandSourceName, url);
            }
            throw new IllegalArgumentException("JSON does not contain valid type: " + jSONObject2.optString("type"));
        }
    }
}
