package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class mx {

    /* renamed from: a, reason: collision with root package name */
    final com.facetec.sdk.mv f3668a;
    final java.util.Map<java.lang.Class<?>, java.lang.Object> b;

    @javax.annotation.Nullable
    final com.facetec.sdk.my c;
    final com.facetec.sdk.mm d;
    final java.lang.String e;

    @javax.annotation.Nullable
    private volatile com.facetec.sdk.mf h;

    mx(com.facetec.sdk.mx.a aVar) {
        this.f3668a = aVar.b;
        this.e = aVar.d;
        this.d = aVar.e.b();
        this.c = aVar.c;
        this.b = com.facetec.sdk.nh.c(aVar.f3669a);
    }

    public final com.facetec.sdk.mv c() {
        return this.f3668a;
    }

    public final java.lang.String a() {
        return this.e;
    }

    public final com.facetec.sdk.mm d() {
        return this.d;
    }

    @javax.annotation.Nullable
    public final java.lang.String d(java.lang.String str) {
        return this.d.c(str);
    }

    @javax.annotation.Nullable
    public final com.facetec.sdk.my b() {
        return this.c;
    }

    public final com.facetec.sdk.mx.a e() {
        return new com.facetec.sdk.mx.a(this);
    }

    public final com.facetec.sdk.mf i() {
        com.facetec.sdk.mf mfVar = this.h;
        if (mfVar != null) {
            return mfVar;
        }
        com.facetec.sdk.mf d = com.facetec.sdk.mf.d(this.d);
        this.h = d;
        return d;
    }

    public final boolean g() {
        return this.f3668a.a();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Request{method=");
        sb.append(this.e);
        sb.append(", url=");
        sb.append(this.f3668a);
        sb.append(", tags=");
        sb.append(this.b);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        java.util.Map<java.lang.Class<?>, java.lang.Object> f3669a;

        @javax.annotation.Nullable
        com.facetec.sdk.mv b;

        @javax.annotation.Nullable
        com.facetec.sdk.my c;
        java.lang.String d;
        public com.facetec.sdk.mm.b e;

        public a() {
            this.f3669a = java.util.Collections.emptyMap();
            this.d = "GET";
            this.e = new com.facetec.sdk.mm.b();
        }

        a(com.facetec.sdk.mx mxVar) {
            java.util.Map<java.lang.Class<?>, java.lang.Object> linkedHashMap;
            this.f3669a = java.util.Collections.emptyMap();
            this.b = mxVar.f3668a;
            this.d = mxVar.e;
            this.c = mxVar.c;
            if (mxVar.b.isEmpty()) {
                linkedHashMap = java.util.Collections.emptyMap();
            } else {
                linkedHashMap = new java.util.LinkedHashMap<>(mxVar.b);
            }
            this.f3669a = linkedHashMap;
            this.e = mxVar.d.c();
        }

        public final com.facetec.sdk.mx.a b(com.facetec.sdk.mv mvVar) {
            if (mvVar == null) {
                throw new java.lang.NullPointerException("url == null");
            }
            this.b = mvVar;
            return this;
        }

        public final com.facetec.sdk.mx.a e(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("url == null");
            }
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("http:");
                sb.append(str.substring(3));
                str = sb.toString();
            } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("https:");
                sb2.append(str.substring(4));
                str = sb2.toString();
            }
            return b(com.facetec.sdk.mv.c(str));
        }

        public final com.facetec.sdk.mx.a b(java.lang.String str, java.lang.String str2) {
            this.e.c(str, str2);
            return this;
        }

        public final com.facetec.sdk.mx.a a(java.lang.String str, java.lang.String str2) {
            this.e.b(str, str2);
            return this;
        }

        public final com.facetec.sdk.mx.a d(java.lang.String str) {
            this.e.e(str);
            return this;
        }

        public final com.facetec.sdk.mx.a a(com.facetec.sdk.my myVar) {
            return d("POST", myVar);
        }

        public final com.facetec.sdk.mx.a d(java.lang.String str, @javax.annotation.Nullable com.facetec.sdk.my myVar) {
            if (str == null) {
                throw new java.lang.NullPointerException("method == null");
            }
            if (str.length() == 0) {
                throw new java.lang.IllegalArgumentException("method.length() == 0");
            }
            if (myVar != null && !com.facetec.sdk.nv.e(str)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("method ");
                sb.append(str);
                sb.append(" must not have a request body.");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            if (myVar == null && com.facetec.sdk.nv.d(str)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("method ");
                sb2.append(str);
                sb2.append(" must have a request body.");
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
            this.d = str;
            this.c = myVar;
            return this;
        }

        public final com.facetec.sdk.mx c() {
            if (this.b == null) {
                throw new java.lang.IllegalStateException("url == null");
            }
            return new com.facetec.sdk.mx(this);
        }
    }
}
