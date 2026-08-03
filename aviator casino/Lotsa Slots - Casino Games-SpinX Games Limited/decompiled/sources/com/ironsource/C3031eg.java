package com.ironsource;

/* renamed from: com.ironsource.eg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3031eg {

    /* renamed from: a, reason: collision with root package name */
    protected long f6219a;
    protected long b;
    protected long c;

    public long a() {
        return java.lang.Math.max(0L, this.f6219a - java.lang.System.currentTimeMillis());
    }

    public void b(long j) {
        this.c = j;
        this.f6219a += j - this.b;
    }

    public void c(long j) {
        this.b = j;
        this.c = 0L;
    }

    public void a(long j) {
        this.f6219a = java.lang.System.currentTimeMillis() + j;
    }

    public void b() {
        this.f6219a = 0L;
        this.b = 0L;
        this.c = 0L;
    }
}
