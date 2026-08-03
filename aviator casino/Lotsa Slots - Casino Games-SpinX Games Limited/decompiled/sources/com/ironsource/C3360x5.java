package com.ironsource;

/* renamed from: com.ironsource.x5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3360x5 {
    static final java.lang.String e = "euid";
    static final java.lang.String f = "esat";
    static final java.lang.String g = "esfr";
    static final int h = 1;

    /* renamed from: a, reason: collision with root package name */
    private int f6829a;
    private long b;
    private int c;
    private final org.json.JSONObject d;

    public C3360x5(com.ironsource.EnumC3378y5 enumC3378y5, org.json.JSONObject jSONObject) {
        this(enumC3378y5.b(), jSONObject);
    }

    public java.lang.String a() {
        return this.d.toString();
    }

    public org.json.JSONObject b() {
        return this.d;
    }

    public int c() {
        return this.f6829a;
    }

    public long d() {
        return this.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.ironsource.C3360x5 c3360x5 = (com.ironsource.C3360x5) obj;
        return this.f6829a == c3360x5.f6829a && this.b == c3360x5.b && this.c == c3360x5.c && com.ironsource.C3275sa.a(this.d, c3360x5.d);
    }

    public int hashCode() {
        return (((((this.f6829a * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.b)) * 31) + this.d.toString().hashCode()) * 31) + this.c;
    }

    public java.lang.String toString() {
        return ("{\"eventId\":" + c() + ",\"timestamp\":" + d() + "," + a().substring(1) + "}").replace(",", "\n");
    }

    public C3360x5(int i, org.json.JSONObject jSONObject) {
        this(i, new com.ironsource.InterfaceC3216p4.a().a(), jSONObject);
    }

    public void a(int i) {
        this.f6829a = i;
    }

    public C3360x5(int i, long j, java.lang.String str) throws org.json.JSONException {
        this(i, j, new org.json.JSONObject(str));
    }

    public void a(java.lang.String str, java.lang.Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            this.d.put(str, obj);
        } catch (org.json.JSONException e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
        }
    }

    public C3360x5(com.ironsource.EnumC3378y5 enumC3378y5, long j, org.json.JSONObject jSONObject) {
        this(enumC3378y5.b(), j, jSONObject);
    }

    public C3360x5(int i, long j, org.json.JSONObject jSONObject) {
        this.c = 1;
        this.f6829a = i;
        this.b = j;
        jSONObject = jSONObject == null ? new org.json.JSONObject() : jSONObject;
        this.d = jSONObject;
        if (!jSONObject.has(e)) {
            a(e, java.util.UUID.randomUUID().toString());
        }
        if (!jSONObject.has(f)) {
            a(f, java.lang.Integer.valueOf(this.c));
        } else {
            this.c = jSONObject.optInt(f, 1);
        }
    }

    public void a(java.lang.String str) {
        a(g, str);
        int i = this.c + 1;
        this.c = i;
        a(f, java.lang.Integer.valueOf(i));
    }
}
