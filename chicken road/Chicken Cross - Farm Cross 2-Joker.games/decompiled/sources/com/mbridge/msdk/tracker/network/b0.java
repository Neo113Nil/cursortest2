package com.mbridge.msdk.tracker.network;

/* compiled from: VolleyError.java */
/* loaded from: classes6.dex */
public abstract class b0 extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final q f9999a;
    private long b;
    private int c;
    private String d;

    public b0() {
        this.c = 0;
        this.d = "";
        this.f9999a = null;
    }

    void a(long j) {
        this.b = j;
    }

    public abstract int d();

    public int g() {
        return this.c;
    }

    public void a(int i) {
        this.c = i;
    }

    public b0(q qVar) {
        this.c = 0;
        this.d = "";
        this.f9999a = qVar;
    }

    public b0(String str) {
        super(str);
        this.c = 0;
        this.d = "";
        this.f9999a = null;
    }

    public b0(Throwable th) {
        super(th);
        this.c = 0;
        this.d = "";
        this.f9999a = null;
    }
}
