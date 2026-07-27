package com.ironsource;

/* renamed from: com.ironsource.hg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4450hg {

    /* renamed from: a, reason: collision with root package name */
    protected long f8231a;
    protected long b;
    protected long c;

    public long a() {
        return Math.max(0L, this.f8231a - System.currentTimeMillis());
    }

    public void b(long j) {
        this.c = j;
        this.f8231a += j - this.b;
    }

    public void c(long j) {
        this.b = j;
        this.c = 0L;
    }

    public void a(long j) {
        this.f8231a = System.currentTimeMillis() + j;
    }

    public void b() {
        this.f8231a = 0L;
        this.b = 0L;
        this.c = 0L;
    }
}
