package c2;

import A1.H0;

/* renamed from: c2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0815v implements InterfaceC0794B, InterfaceC0793A {

    /* renamed from: a, reason: collision with root package name */
    public final D f10406a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10407b;

    /* renamed from: c, reason: collision with root package name */
    public final u2.r f10408c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0795a f10409d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0794B f10410e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0793A f10411f;

    /* renamed from: x, reason: collision with root package name */
    public long f10412x = -9223372036854775807L;

    public C0815v(D d7, u2.r rVar, long j) {
        this.f10406a = d7;
        this.f10408c = rVar;
        this.f10407b = j;
    }

    @Override // c2.InterfaceC0794B
    public final long I(t2.c[] cVarArr, boolean[] zArr, W[] wArr, boolean[] zArr2, long j) {
        long j3;
        long j7 = this.f10412x;
        if (j7 == -9223372036854775807L || j != this.f10407b) {
            j3 = j;
        } else {
            this.f10412x = -9223372036854775807L;
            j3 = j7;
        }
        InterfaceC0794B interfaceC0794B = this.f10410e;
        int i7 = v2.t.f17153a;
        return interfaceC0794B.I(cVarArr, zArr, wArr, zArr2, j3);
    }

    @Override // c2.InterfaceC0794B
    public final long M() {
        InterfaceC0794B interfaceC0794B = this.f10410e;
        int i7 = v2.t.f17153a;
        return interfaceC0794B.M();
    }

    @Override // c2.InterfaceC0794B
    public final f0 P() {
        InterfaceC0794B interfaceC0794B = this.f10410e;
        int i7 = v2.t.f17153a;
        return interfaceC0794B.P();
    }

    @Override // c2.Y
    public final long T() {
        InterfaceC0794B interfaceC0794B = this.f10410e;
        int i7 = v2.t.f17153a;
        return interfaceC0794B.T();
    }

    @Override // c2.Y
    public final void Y(long j) {
        InterfaceC0794B interfaceC0794B = this.f10410e;
        int i7 = v2.t.f17153a;
        interfaceC0794B.Y(j);
    }

    @Override // c2.X
    public final void b(Y y4) {
        InterfaceC0793A interfaceC0793A = this.f10411f;
        int i7 = v2.t.f17153a;
        interfaceC0793A.b(this);
    }

    @Override // c2.InterfaceC0793A
    public final void f(InterfaceC0794B interfaceC0794B) {
        InterfaceC0793A interfaceC0793A = this.f10411f;
        int i7 = v2.t.f17153a;
        interfaceC0793A.f(this);
    }

    @Override // c2.Y
    public final boolean isLoading() {
        InterfaceC0794B interfaceC0794B = this.f10410e;
        return interfaceC0794B != null && interfaceC0794B.isLoading();
    }

    @Override // c2.Y
    public final long k() {
        InterfaceC0794B interfaceC0794B = this.f10410e;
        int i7 = v2.t.f17153a;
        return interfaceC0794B.k();
    }

    @Override // c2.InterfaceC0794B
    public final long o(long j, H0 h02) {
        InterfaceC0794B interfaceC0794B = this.f10410e;
        int i7 = v2.t.f17153a;
        return interfaceC0794B.o(j, h02);
    }

    @Override // c2.InterfaceC0794B
    public final void p(InterfaceC0793A interfaceC0793A, long j) {
        this.f10411f = interfaceC0793A;
        InterfaceC0794B interfaceC0794B = this.f10410e;
        if (interfaceC0794B != null) {
            long j3 = this.f10412x;
            if (j3 == -9223372036854775807L) {
                j3 = this.f10407b;
            }
            interfaceC0794B.p(this, j3);
        }
    }

    @Override // c2.InterfaceC0794B
    public final void q() {
        InterfaceC0794B interfaceC0794B = this.f10410e;
        if (interfaceC0794B != null) {
            interfaceC0794B.q();
            return;
        }
        AbstractC0795a abstractC0795a = this.f10409d;
        if (abstractC0795a != null) {
            abstractC0795a.h();
        }
    }

    @Override // c2.InterfaceC0794B
    public final long v(long j) {
        InterfaceC0794B interfaceC0794B = this.f10410e;
        int i7 = v2.t.f17153a;
        return interfaceC0794B.v(j);
    }

    @Override // c2.InterfaceC0794B
    public final void w(long j) {
        InterfaceC0794B interfaceC0794B = this.f10410e;
        int i7 = v2.t.f17153a;
        interfaceC0794B.w(j);
    }

    @Override // c2.Y
    public final boolean y(long j) {
        InterfaceC0794B interfaceC0794B = this.f10410e;
        return interfaceC0794B != null && interfaceC0794B.y(j);
    }
}
