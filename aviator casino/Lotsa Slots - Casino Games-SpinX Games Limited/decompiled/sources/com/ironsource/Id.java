package com.ironsource;

/* loaded from: classes5.dex */
public class Id {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.ArrayList<java.lang.String> f5758a = new java.util.ArrayList<>();
    private final java.util.ArrayList<java.lang.String> b = new java.util.ArrayList<>();
    private final java.util.ArrayList<java.lang.String> c = new java.util.ArrayList<>();
    private final java.util.ArrayList<java.lang.String> d = new java.util.ArrayList<>();

    public java.util.ArrayList<java.lang.String> a() {
        return this.c;
    }

    public java.util.ArrayList<java.lang.String> b() {
        return this.b;
    }

    public java.util.ArrayList<java.lang.String> c() {
        return this.d;
    }

    public java.util.ArrayList<java.lang.String> d() {
        return this.f5758a;
    }

    public void a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.c.add(str);
    }

    public void b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.b.add(str);
    }

    public void c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.d.add(str);
    }

    public void d(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f5758a.add(str);
    }
}
