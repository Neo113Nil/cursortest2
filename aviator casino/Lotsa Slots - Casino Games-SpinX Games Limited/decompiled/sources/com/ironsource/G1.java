package com.ironsource;

/* loaded from: classes5.dex */
public class G1 {
    private java.lang.String c;
    private java.lang.String d;
    private int f;
    private java.util.HashSet<java.lang.String> b = new java.util.HashSet<>();

    /* renamed from: a, reason: collision with root package name */
    private boolean f5718a = false;
    private boolean e = false;
    private boolean g = true;

    public void a(boolean z) {
        this.f5718a = z;
    }

    public java.util.HashSet<java.lang.String> b() {
        return this.b;
    }

    public void c(java.lang.String str) {
        this.c = str;
    }

    public java.lang.String d() {
        return this.c;
    }

    public boolean e() {
        return this.e;
    }

    public boolean f() {
        return this.f5718a;
    }

    public boolean g() {
        return this.g;
    }

    public void a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.b.add(str);
    }

    public void b(java.lang.String str) {
        this.d = str;
    }

    public java.lang.String c() {
        return this.d;
    }

    public void b(boolean z) {
        this.g = z;
    }

    public void c(boolean z) {
        this.e = z;
    }

    public int a() {
        return this.f;
    }

    public void a(int i) {
        this.f = i;
    }
}
