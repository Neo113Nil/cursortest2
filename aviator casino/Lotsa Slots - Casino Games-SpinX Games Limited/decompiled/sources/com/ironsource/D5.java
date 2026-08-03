package com.ironsource;

/* loaded from: classes5.dex */
public final class D5 {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f5667a;
    private boolean b;
    private java.lang.String c;
    private com.ironsource.F7 d;
    private boolean e;
    private java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private java.lang.String f5668a;
        private com.ironsource.F7 d;
        private boolean b = false;
        private java.lang.String c = "POST";
        private boolean e = false;
        private java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> f = new java.util.ArrayList<>();

        public a(java.lang.String str) {
            this.f5668a = "";
            if (str == null || str.isEmpty()) {
                return;
            }
            this.f5668a = str;
        }

        public com.ironsource.D5.a a(com.ironsource.F7 f7) {
            this.d = f7;
            return this;
        }

        public com.ironsource.D5.a b(boolean z) {
            this.b = z;
            return this;
        }

        public com.ironsource.D5.a c() {
            this.c = "POST";
            return this;
        }

        public com.ironsource.D5.a a(android.util.Pair<java.lang.String, java.lang.String> pair) {
            this.f.add(pair);
            return this;
        }

        public com.ironsource.D5.a b() {
            this.c = "GET";
            return this;
        }

        public com.ironsource.D5.a a(java.util.List<android.util.Pair<java.lang.String, java.lang.String>> list) {
            this.f.addAll(list);
            return this;
        }

        public com.ironsource.D5.a a(boolean z) {
            this.e = z;
            return this;
        }

        public com.ironsource.D5 a() {
            return new com.ironsource.D5(this);
        }
    }

    D5(com.ironsource.D5.a aVar) {
        this.e = false;
        this.f5667a = aVar.f5668a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        if (aVar.f != null) {
            this.f = new java.util.ArrayList<>(aVar.f);
        }
    }

    public boolean a() {
        return this.b;
    }

    public java.lang.String b() {
        return this.f5667a;
    }

    public com.ironsource.F7 c() {
        return this.d;
    }

    public java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> d() {
        return new java.util.ArrayList<>(this.f);
    }

    public java.lang.String e() {
        return this.c;
    }

    public boolean f() {
        return this.e;
    }
}
