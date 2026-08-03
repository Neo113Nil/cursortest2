package com.ironsource;

/* renamed from: com.ironsource.p8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3220p8 {
    public static final int c = 1001;

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f6552a;
    private int b;

    public C3220p8(int i, java.lang.String str) {
        this.b = i;
        this.f6552a = str == null ? "" : str;
    }

    public int a() {
        return this.b;
    }

    public java.lang.String b() {
        return this.f6552a;
    }

    public java.lang.String toString() {
        return "error - code:" + this.b + ", message:" + this.f6552a;
    }
}
