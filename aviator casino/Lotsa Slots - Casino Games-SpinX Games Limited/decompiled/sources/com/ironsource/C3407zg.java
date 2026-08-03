package com.ironsource;

/* renamed from: com.ironsource.zg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3407zg {
    private int b = 4;
    private int c = 4;

    /* renamed from: a, reason: collision with root package name */
    private java.util.HashMap<java.lang.String, java.lang.Boolean> f6865a = new com.ironsource.C3407zg.a();

    /* renamed from: com.ironsource.zg$a */
    class a extends java.util.HashMap<java.lang.String, java.lang.Boolean> {
        a() {
            put(com.ironsource.C3023e8.k, java.lang.Boolean.valueOf(com.ironsource.C3407zg.this.b == 0));
            put(com.ironsource.C3023e8.l, java.lang.Boolean.valueOf(com.ironsource.C3407zg.this.c == 0));
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            put(com.ironsource.C3023e8.m, bool);
            put(com.ironsource.C3023e8.n, bool);
        }
    }

    C3407zg() {
    }

    void a(java.lang.String str, int i, boolean z) {
        if (this.f6865a.containsKey(str)) {
            this.f6865a.put(str, java.lang.Boolean.valueOf(i == 0));
        }
        this.f6865a.put(com.ironsource.C3023e8.m, java.lang.Boolean.valueOf(z));
        this.f6865a.put(com.ironsource.C3023e8.n, java.lang.Boolean.valueOf((this.f6865a.get(com.ironsource.C3023e8.l).booleanValue() || this.f6865a.get(com.ironsource.C3023e8.k).booleanValue()) && this.f6865a.get(com.ironsource.C3023e8.m).booleanValue()));
    }

    public org.json.JSONObject a() {
        return new org.json.JSONObject(this.f6865a);
    }
}
