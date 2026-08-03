package com.ironsource;

/* renamed from: com.ironsource.w1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC3338w1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.InterfaceC3338w1.b f6791a = com.ironsource.InterfaceC3338w1.b.f6793a;

    /* renamed from: com.ironsource.w1$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        static {
            com.ironsource.InterfaceC3338w1.b bVar = com.ironsource.InterfaceC3338w1.f6791a;
        }

        @kotlin.jvm.JvmStatic
        public static com.ironsource.InterfaceC3338w1 a(java.lang.String str) {
            return com.ironsource.InterfaceC3338w1.f6791a.a(str);
        }
    }

    /* renamed from: com.ironsource.w1$a */
    public interface a extends com.ironsource.InterfaceC3338w1 {

        /* renamed from: com.ironsource.w1$a$a, reason: collision with other inner class name */
        public static final class C0168a implements com.ironsource.InterfaceC3338w1.a {
            private final java.lang.String b;
            private final java.lang.String c;
            private final com.ironsource.C3202o8.e d;
            private final java.lang.String e;
            private final java.lang.String f;
            private final com.ironsource.InterfaceC3338w1.a.C0168a.C0169a g;
            private final int h;
            private final int i;

            /* renamed from: com.ironsource.w1$a$a$a, reason: collision with other inner class name */
            public static final class C0169a {

                /* renamed from: a, reason: collision with root package name */
                private final int f6792a;
                private final int b;

                public C0169a(int i, int i2) {
                    this.f6792a = i;
                    this.b = i2;
                }

                public final int a() {
                    return this.f6792a;
                }

                public final int b() {
                    return this.b;
                }

                public final int c() {
                    return this.f6792a;
                }

                public final int d() {
                    return this.b;
                }

                public boolean equals(java.lang.Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof com.ironsource.InterfaceC3338w1.a.C0168a.C0169a)) {
                        return false;
                    }
                    com.ironsource.InterfaceC3338w1.a.C0168a.C0169a c0169a = (com.ironsource.InterfaceC3338w1.a.C0168a.C0169a) obj;
                    return this.f6792a == c0169a.f6792a && this.b == c0169a.b;
                }

                public int hashCode() {
                    return (this.f6792a * 31) + this.b;
                }

                public java.lang.String toString() {
                    return "Coordinates(x=" + this.f6792a + ", y=" + this.b + ")";
                }

                public final com.ironsource.InterfaceC3338w1.a.C0168a.C0169a a(int i, int i2) {
                    return new com.ironsource.InterfaceC3338w1.a.C0168a.C0169a(i, i2);
                }

                public static /* synthetic */ com.ironsource.InterfaceC3338w1.a.C0168a.C0169a a(com.ironsource.InterfaceC3338w1.a.C0168a.C0169a c0169a, int i, int i2, int i3, java.lang.Object obj) {
                    if ((i3 & 1) != 0) {
                        i = c0169a.f6792a;
                    }
                    if ((i3 & 2) != 0) {
                        i2 = c0169a.b;
                    }
                    return c0169a.a(i, i2);
                }
            }

            public C0168a(java.lang.String successCallback, java.lang.String failCallback, com.ironsource.C3202o8.e productType, java.lang.String demandSourceName, java.lang.String url, com.ironsource.InterfaceC3338w1.a.C0168a.C0169a coordinates, int i, int i2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productType, "productType");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                this.b = successCallback;
                this.c = failCallback;
                this.d = productType;
                this.e = demandSourceName;
                this.f = url;
                this.g = coordinates;
                this.h = i;
                this.i = i2;
            }

            public final com.ironsource.InterfaceC3338w1.a.C0168a a(java.lang.String successCallback, java.lang.String failCallback, com.ironsource.C3202o8.e productType, java.lang.String demandSourceName, java.lang.String url, com.ironsource.InterfaceC3338w1.a.C0168a.C0169a coordinates, int i, int i2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productType, "productType");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                return new com.ironsource.InterfaceC3338w1.a.C0168a(successCallback, failCallback, productType, demandSourceName, url, coordinates, i, i2);
            }

            @Override // com.ironsource.InterfaceC3338w1.a
            public java.lang.String b() {
                return this.f;
            }

            @Override // com.ironsource.InterfaceC3338w1
            public java.lang.String c() {
                return this.c;
            }

            @Override // com.ironsource.InterfaceC3338w1
            public com.ironsource.C3202o8.e d() {
                return this.d;
            }

            @Override // com.ironsource.InterfaceC3338w1
            public java.lang.String e() {
                return this.e;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.ironsource.InterfaceC3338w1.a.C0168a)) {
                    return false;
                }
                com.ironsource.InterfaceC3338w1.a.C0168a c0168a = (com.ironsource.InterfaceC3338w1.a.C0168a) obj;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.b, c0168a.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c0168a.c) && this.d == c0168a.d && kotlin.jvm.internal.Intrinsics.areEqual(this.e, c0168a.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, c0168a.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, c0168a.g) && this.h == c0168a.h && this.i == c0168a.i;
            }

            public final java.lang.String f() {
                return this.b;
            }

            public final java.lang.String g() {
                return this.c;
            }

            public final com.ironsource.C3202o8.e h() {
                return this.d;
            }

            public int hashCode() {
                return (((((((((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h) * 31) + this.i;
            }

            public final java.lang.String i() {
                return this.e;
            }

            public final java.lang.String j() {
                return this.f;
            }

            public final com.ironsource.InterfaceC3338w1.a.C0168a.C0169a k() {
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

            public final com.ironsource.InterfaceC3338w1.a.C0168a.C0169a o() {
                return this.g;
            }

            public final int p() {
                return this.i;
            }

            public java.lang.String toString() {
                return "Click(successCallback=" + this.b + ", failCallback=" + this.c + ", productType=" + this.d + ", demandSourceName=" + this.e + ", url=" + this.f + ", coordinates=" + this.g + ", action=" + this.h + ", metaState=" + this.i + ")";
            }

            @Override // com.ironsource.InterfaceC3338w1
            public java.lang.String a() {
                return this.b;
            }
        }

        /* renamed from: com.ironsource.w1$a$b */
        public static final class b implements com.ironsource.InterfaceC3338w1.a {
            private final java.lang.String b;
            private final java.lang.String c;
            private final com.ironsource.C3202o8.e d;
            private final java.lang.String e;
            private final java.lang.String f;

            public b(java.lang.String successCallback, java.lang.String failCallback, com.ironsource.C3202o8.e productType, java.lang.String demandSourceName, java.lang.String url) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productType, "productType");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
                this.b = successCallback;
                this.c = failCallback;
                this.d = productType;
                this.e = demandSourceName;
                this.f = url;
            }

            public final com.ironsource.InterfaceC3338w1.a.b a(java.lang.String successCallback, java.lang.String failCallback, com.ironsource.C3202o8.e productType, java.lang.String demandSourceName, java.lang.String url) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productType, "productType");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
                return new com.ironsource.InterfaceC3338w1.a.b(successCallback, failCallback, productType, demandSourceName, url);
            }

            @Override // com.ironsource.InterfaceC3338w1.a
            public java.lang.String b() {
                return this.f;
            }

            @Override // com.ironsource.InterfaceC3338w1
            public java.lang.String c() {
                return this.c;
            }

            @Override // com.ironsource.InterfaceC3338w1
            public com.ironsource.C3202o8.e d() {
                return this.d;
            }

            @Override // com.ironsource.InterfaceC3338w1
            public java.lang.String e() {
                return this.e;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.ironsource.InterfaceC3338w1.a.b)) {
                    return false;
                }
                com.ironsource.InterfaceC3338w1.a.b bVar = (com.ironsource.InterfaceC3338w1.a.b) obj;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.b, bVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, bVar.c) && this.d == bVar.d && kotlin.jvm.internal.Intrinsics.areEqual(this.e, bVar.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, bVar.f);
            }

            public final java.lang.String f() {
                return this.b;
            }

            public final java.lang.String g() {
                return this.c;
            }

            public final com.ironsource.C3202o8.e h() {
                return this.d;
            }

            public int hashCode() {
                return (((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
            }

            public final java.lang.String i() {
                return this.e;
            }

            public final java.lang.String j() {
                return this.f;
            }

            public java.lang.String toString() {
                return "Impression(successCallback=" + this.b + ", failCallback=" + this.c + ", productType=" + this.d + ", demandSourceName=" + this.e + ", url=" + this.f + ")";
            }

            public static /* synthetic */ com.ironsource.InterfaceC3338w1.a.b a(com.ironsource.InterfaceC3338w1.a.b bVar, java.lang.String str, java.lang.String str2, com.ironsource.C3202o8.e eVar, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = bVar.b;
                }
                if ((i & 2) != 0) {
                    str2 = bVar.c;
                }
                java.lang.String str5 = str2;
                if ((i & 4) != 0) {
                    eVar = bVar.d;
                }
                com.ironsource.C3202o8.e eVar2 = eVar;
                if ((i & 8) != 0) {
                    str3 = bVar.e;
                }
                java.lang.String str6 = str3;
                if ((i & 16) != 0) {
                    str4 = bVar.f;
                }
                return bVar.a(str, str5, eVar2, str6, str4);
            }

            @Override // com.ironsource.InterfaceC3338w1
            public java.lang.String a() {
                return this.b;
            }
        }

        java.lang.String b();
    }

    java.lang.String a();

    java.lang.String c();

    com.ironsource.C3202o8.e d();

    java.lang.String e();

    /* renamed from: com.ironsource.w1$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ com.ironsource.InterfaceC3338w1.b f6793a = new com.ironsource.InterfaceC3338w1.b();

        private b() {
        }

        @kotlin.jvm.JvmStatic
        public final com.ironsource.InterfaceC3338w1 a(java.lang.String jsonString) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            org.json.JSONObject jSONObject = new org.json.JSONObject(jsonString);
            java.lang.String optString = jSONObject.optString("type", "none");
            if (kotlin.jvm.internal.Intrinsics.areEqual(optString, com.ironsource.Y3.c)) {
                return a(jSONObject);
            }
            throw new java.lang.IllegalArgumentException("unsupported message type: " + optString);
        }

        private final com.ironsource.InterfaceC3338w1.a a(org.json.JSONObject jSONObject) {
            java.lang.String successCallback = jSONObject.getString("success");
            java.lang.String failCallback = jSONObject.getString(com.ironsource.X3.g.e);
            java.lang.String demandSourceName = jSONObject.getString("demandSourceName");
            java.lang.String string = jSONObject.getString(com.ironsource.X3.i.m);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "json.getString(ParametersKeys.PRODUCT_TYPE)");
            com.ironsource.C3202o8.e valueOf = com.ironsource.C3202o8.e.valueOf(string);
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            java.lang.String url = jSONObject2.getString("url");
            java.lang.String optString = jSONObject2.optString("type");
            if (kotlin.jvm.internal.Intrinsics.areEqual(optString, com.ironsource.Y3.d)) {
                org.json.JSONObject jSONObject3 = jSONObject2.getJSONObject(com.ironsource.Y3.f);
                int i = jSONObject3.getInt(com.ironsource.Y3.g);
                int i2 = jSONObject3.getInt(com.ironsource.Y3.h);
                int optInt = jSONObject2.optInt("action", 0);
                int optInt2 = jSONObject2.optInt(com.ironsource.Y3.j, 0);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(successCallback, "successCallback");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(failCallback, "failCallback");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(url, "url");
                return new com.ironsource.InterfaceC3338w1.a.C0168a(successCallback, failCallback, valueOf, demandSourceName, url, new com.ironsource.InterfaceC3338w1.a.C0168a.C0169a(i, i2), optInt, optInt2);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(optString, "impression")) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(successCallback, "successCallback");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(failCallback, "failCallback");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(url, "url");
                return new com.ironsource.InterfaceC3338w1.a.b(successCallback, failCallback, valueOf, demandSourceName, url);
            }
            throw new java.lang.IllegalArgumentException("JSON does not contain valid type: " + jSONObject2.optString("type"));
        }
    }
}
