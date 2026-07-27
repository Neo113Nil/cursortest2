package com.ironsource;

/* renamed from: com.ironsource.n8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4549n8 {
    public static final int c = 1001;

    /* renamed from: a, reason: collision with root package name */
    private String f8450a;
    private int b;

    public C4549n8(int i, String str) {
        this.b = i;
        this.f8450a = str == null ? "" : str;
    }

    public int a() {
        return this.b;
    }

    public String b() {
        return this.f8450a;
    }

    public String toString() {
        return "error - code:" + this.b + ", message:" + this.f8450a;
    }
}
