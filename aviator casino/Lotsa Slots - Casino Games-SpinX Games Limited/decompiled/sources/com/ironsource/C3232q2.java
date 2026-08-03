package com.ironsource;

/* renamed from: com.ironsource.q2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3232q2 {
    public static final java.lang.String A = "nurl";
    public static final java.lang.String o = "adMarkup";
    public static final java.lang.String p = "instance";
    public static final java.lang.String q = "adData";
    public static final java.lang.String r = "price";
    public static final java.lang.String s = "serverData";
    public static final java.lang.String t = "loadTimeout";
    public static final java.lang.String u = "order";
    public static final java.lang.String v = "show";
    public static final java.lang.String w = "price";
    public static final java.lang.String x = "notifications";
    public static final java.lang.String y = "burl";
    public static final java.lang.String z = "lurl";

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f6566a;
    private java.lang.String b;
    private org.json.JSONObject c;
    private java.lang.String d;
    private java.lang.Integer e;
    private int f;
    private int g;
    private int h;
    private final java.util.List<java.lang.String> i;
    private final java.util.List<java.lang.String> j;
    private final java.util.List<java.lang.String> k;
    private org.json.JSONObject l;
    private com.ironsource.C3402zb m;
    private boolean n;

    public C3232q2(java.lang.String str) {
        this.f6566a = null;
        this.b = "";
        this.c = null;
        this.d = "";
        this.e = null;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = new java.util.ArrayList();
        this.j = new java.util.ArrayList();
        this.k = new java.util.ArrayList();
        this.l = null;
        this.m = null;
        this.n = true;
        this.f6566a = str;
    }

    private void a(org.json.JSONObject jSONObject, int i) {
        this.f = i;
        this.g = i;
        this.h = i;
        if (jSONObject != null) {
            int optInt = jSONObject.optInt(v, i);
            this.g = optInt;
            this.h = jSONObject.optInt("price", optInt);
        }
    }

    public com.ironsource.V8 a(java.lang.String str) {
        return null;
    }

    public java.util.List<java.lang.String> b() {
        return this.i;
    }

    public java.lang.String c() {
        return this.f6566a;
    }

    public com.ironsource.C3402zb d() {
        return this.m;
    }

    public int e() {
        return this.f;
    }

    public java.lang.Integer f() {
        return this.e;
    }

    public java.util.List<java.lang.String> g() {
        return this.j;
    }

    public java.util.List<java.lang.String> h() {
        return this.k;
    }

    public java.lang.String i() {
        return this.d;
    }

    public int j() {
        return this.h;
    }

    public java.lang.String k() {
        return this.b;
    }

    public int l() {
        return this.g;
    }

    public org.json.JSONObject m() {
        return this.l;
    }

    public boolean n() {
        return this.n;
    }

    public org.json.JSONObject a() {
        return this.c;
    }

    private void a(org.json.JSONObject jSONObject, java.lang.String str, java.util.List<java.lang.String> list) throws org.json.JSONException {
        if (jSONObject.has(str)) {
            list.addAll(com.ironsource.C3079ha.b(jSONObject.getJSONArray(str)));
        }
    }

    public C3232q2(org.json.JSONObject jSONObject) {
        this(jSONObject, -1, null);
    }

    public C3232q2(org.json.JSONObject jSONObject, int i, org.json.JSONObject jSONObject2) {
        this.f6566a = null;
        this.b = "";
        this.c = null;
        this.d = "";
        this.e = null;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.i = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.j = arrayList2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        this.k = arrayList3;
        this.l = null;
        this.m = null;
        this.n = true;
        try {
            if (jSONObject.has(p)) {
                this.f6566a = jSONObject.getString(p);
            }
            if (jSONObject.has("adMarkup")) {
                this.b = jSONObject.getString("adMarkup");
            } else if (jSONObject.has(s)) {
                this.b = jSONObject.getJSONObject(s).toString();
            }
            this.c = jSONObject.optJSONObject("adData");
            this.d = jSONObject.optString("price", "0");
            if (jSONObject.has(x)) {
                org.json.JSONObject jSONObject3 = jSONObject.getJSONObject(x);
                a(jSONObject3, y, arrayList);
                a(jSONObject3, z, arrayList2);
                a(jSONObject3, A, arrayList3);
            }
            this.l = com.ironsource.C3079ha.a(jSONObject2, jSONObject.optJSONObject(com.ironsource.mediationsdk.d.d));
            this.m = jSONObject.has(com.ironsource.mediationsdk.d.e) ? com.ironsource.C3402zb.a(jSONObject.getJSONObject(com.ironsource.mediationsdk.d.e)) : null;
            this.e = jSONObject.has(t) ? java.lang.Integer.valueOf((int) java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(jSONObject.getLong(t))) : null;
            a(jSONObject.optJSONObject(u), i);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            this.n = false;
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("exception " + e.getMessage());
        }
    }
}
