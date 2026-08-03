package com.ironsource;

/* renamed from: com.ironsource.d8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3005d8 {

    /* renamed from: a, reason: collision with root package name */
    private int f6199a;
    private int b;
    private java.lang.String c;

    public C3005d8() {
        this.f6199a = 0;
        this.b = 0;
        this.c = "";
    }

    public int a() {
        return this.b;
    }

    public java.lang.String b() {
        return this.c;
    }

    public int c() {
        return this.f6199a;
    }

    public boolean d() {
        return this.b > 0 && this.f6199a > 0;
    }

    public boolean e() {
        return this.b == 0 && this.f6199a == 0;
    }

    public java.lang.String toString() {
        return this.c;
    }

    public C3005d8(int i, int i2, java.lang.String str) {
        this.f6199a = i;
        this.b = i2;
        this.c = str;
    }
}
