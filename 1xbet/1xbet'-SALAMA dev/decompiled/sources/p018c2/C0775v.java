package p018c2;

import A1.H0;
import p139t2.c;
import p146u2.r;
import p151v2.t;

/* JADX INFO: renamed from: c2.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0775v implements B, A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f10406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f10408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractC0755a f10409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public B f10410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public A f10411f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f10412x = -9223372036854775807L;

    public C0775v(D d7, r rVar, long j) {
        this.f10406a = d7;
        this.f10408c = rVar;
        this.f10407b = j;
    }

    @Override // p018c2.B
    public final long I(c[] cVarArr, boolean[] zArr, W[] wArr, boolean[] zArr2, long j) {
        long j3;
        long j7 = this.f10412x;
        if (j7 == -9223372036854775807L || j != this.f10407b) {
            j3 = j;
        } else {
            this.f10412x = -9223372036854775807L;
            j3 = j7;
        }
        B b7 = this.f10410e;
        int i7 = t.f17159a;
        return b7.I(cVarArr, zArr, wArr, zArr2, j3);
    }

    @Override // p018c2.B
    public final long M() {
        B b7 = this.f10410e;
        int i7 = t.f17159a;
        return b7.M();
    }

    @Override // p018c2.B
    public final f0 P() {
        B b7 = this.f10410e;
        int i7 = t.f17159a;
        return b7.P();
    }

    @Override // p018c2.Y
    public final long T() {
        B b7 = this.f10410e;
        int i7 = t.f17159a;
        return b7.T();
    }

    @Override // p018c2.Y
    public final void Y(long j) {
        B b7 = this.f10410e;
        int i7 = t.f17159a;
        b7.Y(j);
    }

    @Override // p018c2.X
    public final void b(Y y4) {
        A a2 = this.f10411f;
        int i7 = t.f17159a;
        a2.b(this);
    }

    @Override // p018c2.A
    public final void f(B b7) {
        A a2 = this.f10411f;
        int i7 = t.f17159a;
        a2.f(this);
    }

    @Override // p018c2.Y
    public final boolean isLoading() {
        B b7 = this.f10410e;
        return b7 != null && b7.isLoading();
    }

    @Override // p018c2.Y
    public final long k() {
        B b7 = this.f10410e;
        int i7 = t.f17159a;
        return b7.k();
    }

    @Override // p018c2.B
    public final long o(long j, H0 h6) {
        B b7 = this.f10410e;
        int i7 = t.f17159a;
        return b7.o(j, h6);
    }

    @Override // p018c2.B
    public final void p(A a2, long j) {
        this.f10411f = a2;
        B b7 = this.f10410e;
        if (b7 != null) {
            long j3 = this.f10412x;
            if (j3 == -9223372036854775807L) {
                j3 = this.f10407b;
            }
            b7.p(this, j3);
        }
    }

    @Override // p018c2.B
    public final void q() {
        B b7 = this.f10410e;
        if (b7 != null) {
            b7.q();
            return;
        }
        AbstractC0755a abstractC0755a = this.f10409d;
        if (abstractC0755a != null) {
            abstractC0755a.h();
        }
    }

    @Override // p018c2.B
    public final long v(long j) {
        B b7 = this.f10410e;
        int i7 = t.f17159a;
        return b7.v(j);
    }

    @Override // p018c2.B
    public final void w(long j) {
        B b7 = this.f10410e;
        int i7 = t.f17159a;
        b7.w(j);
    }

    @Override // p018c2.Y
    public final boolean y(long j) {
        B b7 = this.f10410e;
        return b7 != null && b7.y(j);
    }
}
