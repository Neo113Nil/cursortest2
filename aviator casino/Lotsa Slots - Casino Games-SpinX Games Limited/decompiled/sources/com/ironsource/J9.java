package com.ironsource;

/* loaded from: classes5.dex */
public class J9 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5770a;
    private java.lang.String b;
    private java.lang.String c;
    private boolean d;
    private com.ironsource.C3005d8 e;
    private java.util.Map<java.lang.String, java.lang.String> f;
    private com.ironsource.Gc g;
    private java.lang.String h;
    private boolean i;
    private boolean j;

    J9(java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String> map, com.ironsource.Gc gc, com.ironsource.C3005d8 c3005d8) {
        this.b = str;
        this.c = str2;
        this.f5770a = z;
        this.d = z2;
        this.f = map;
        this.g = gc;
        this.e = c3005d8;
        this.i = z3;
        this.j = z4;
        this.h = str3;
    }

    public java.util.Map<java.lang.String, java.lang.String> a() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("instanceId", this.b);
        hashMap.put("instanceName", this.c);
        hashMap.put("rewarded", java.lang.Boolean.toString(this.f5770a));
        hashMap.put("inAppBidding", java.lang.Boolean.toString(this.d));
        hashMap.put("isOneFlow", java.lang.Boolean.toString(this.i));
        hashMap.put(com.ironsource.X3.s, java.lang.String.valueOf(2));
        com.ironsource.C3005d8 c3005d8 = this.e;
        hashMap.put("width", c3005d8 != null ? java.lang.Integer.toString(c3005d8.c()) : "0");
        com.ironsource.C3005d8 c3005d82 = this.e;
        hashMap.put("height", c3005d82 != null ? java.lang.Integer.toString(c3005d82.a()) : "0");
        com.ironsource.C3005d8 c3005d83 = this.e;
        hashMap.put("label", c3005d83 != null ? c3005d83.b() : "");
        hashMap.put(com.ironsource.X3.w, java.lang.Boolean.toString(i()));
        if (this.j) {
            hashMap.put("isMultipleAdObjects", "true");
        }
        java.lang.String str = this.h;
        if (str != null) {
            hashMap.put("adUnitId", str);
        }
        java.util.Map<java.lang.String, java.lang.String> map = this.f;
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public final com.ironsource.Gc b() {
        return this.g;
    }

    public java.lang.String c() {
        return this.h;
    }

    public java.util.Map<java.lang.String, java.lang.String> d() {
        return this.f;
    }

    public java.lang.String e() {
        return this.b;
    }

    public java.lang.String f() {
        return this.c.replaceAll("IronSource_", "");
    }

    public java.lang.String g() {
        return this.c;
    }

    public com.ironsource.C3005d8 h() {
        return this.e;
    }

    public boolean i() {
        return h() != null && h().d();
    }

    public boolean j() {
        return this.d;
    }

    public boolean k() {
        return j() || m();
    }

    public boolean l() {
        return this.j;
    }

    public boolean m() {
        return this.i;
    }

    public boolean n() {
        return this.f5770a;
    }

    public void a(com.ironsource.Gc gc) {
        this.g = gc;
    }

    public void a(java.lang.String str) {
        this.h = str;
    }
}
