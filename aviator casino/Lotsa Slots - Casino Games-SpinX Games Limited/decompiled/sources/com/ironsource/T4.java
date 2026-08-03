package com.ironsource;

/* loaded from: classes5.dex */
public class T4 {
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 3;
    public static final int l = -1;

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f5975a;
    private java.lang.String b;
    private int c;
    private java.util.Map<java.lang.String, java.lang.String> d;
    private int e;
    private boolean f;
    private com.ironsource.J9 g;

    public T4(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map, com.ironsource.Gc gc) {
        this.c = -1;
        this.b = str;
        this.f5975a = str2;
        this.d = map;
        this.e = 0;
        this.f = false;
        this.g = null;
    }

    public void a(boolean z) {
        this.f = z;
    }

    public synchronized void b(int i2) {
        this.e = i2;
    }

    public com.ironsource.J9 c() {
        return this.g;
    }

    public boolean d() {
        return this.f;
    }

    public int e() {
        return this.e;
    }

    public java.lang.String f() {
        return this.f5975a;
    }

    public java.util.Map<java.lang.String, java.lang.String> g() {
        return this.d;
    }

    public java.lang.String h() {
        return this.b;
    }

    public com.ironsource.Gc i() {
        if (this.g != null) {
            return c().b();
        }
        return null;
    }

    public int j() {
        return this.c;
    }

    public boolean k() {
        java.util.Map<java.lang.String, java.lang.String> map = this.d;
        if (map == null || !map.containsKey("rewarded")) {
            return false;
        }
        return java.lang.Boolean.parseBoolean(this.d.get("rewarded"));
    }

    public boolean a(int i2) {
        return this.c == i2;
    }

    public java.util.Map<java.lang.String, java.lang.String> b() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("demandSourceId", this.b);
        hashMap.put("demandSourceName", this.f5975a);
        java.util.Map<java.lang.String, java.lang.String> map = this.d;
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public void c(int i2) {
        this.c = i2;
    }

    public void a() {
        java.util.Map<java.lang.String, java.lang.String> map = this.d;
        if (map != null) {
            map.clear();
        }
        this.d = null;
    }

    public T4(com.ironsource.J9 j9) {
        this(j9.e(), j9.g(), j9.a(), j9.b());
        this.g = j9;
    }
}
