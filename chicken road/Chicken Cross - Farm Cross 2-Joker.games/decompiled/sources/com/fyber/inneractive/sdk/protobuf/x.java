package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes4.dex */
public final class x implements s2 {

    /* renamed from: a, reason: collision with root package name */
    public final w f5884a;
    public int b;
    public int c;
    public int d = 0;

    public x(w wVar) {
        Charset charset = l1.f5860a;
        if (wVar == null) {
            throw new NullPointerException("input");
        }
        this.f5884a = wVar;
        wVar.d = this;
    }

    public static void c(int i) {
        if ((i & 3) != 0) {
            throw new n1("Failed to parse the message.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object a(Class cls, h0 h0Var) {
        b(3);
        return c(p2.c.a(cls), h0Var);
    }

    public final void b(int i) {
        if ((this.b & 7) == i) {
            return;
        }
        int i2 = n1.f5864a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int d() {
        b(0);
        return this.f5884a.k();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int e() {
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long f() {
        b(0);
        return this.f5884a.v();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long g() {
        b(1);
        return this.f5884a.i();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final double h() {
        b(1);
        return this.f5884a.f();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final boolean i() {
        int i;
        if (this.f5884a.c() || (i = this.b) == this.c) {
            return false;
        }
        return this.f5884a.e(i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int j() {
        b(0);
        return this.f5884a.p();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final float k() {
        b(5);
        return this.f5884a.j();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long l() {
        b(0);
        return this.f5884a.q();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int m() {
        b(5);
        return this.f5884a.n();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final String n() {
        b(2);
        return this.f5884a.r();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long o() {
        b(0);
        return this.f5884a.l();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final String p() {
        b(2);
        return this.f5884a.s();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int q() {
        b(5);
        return this.f5884a.h();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final boolean r() {
        b(0);
        return this.f5884a.d();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int s() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.f5884a.t();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long t() {
        b(1);
        return this.f5884a.o();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void e(List list) {
        int t;
        int t2;
        if (!(list instanceof a1)) {
            int i = this.b & 7;
            if (i == 2) {
                int u = this.f5884a.u();
                c(u);
                int b = this.f5884a.b() + u;
                do {
                    list.add(Integer.valueOf(this.f5884a.h()));
                } while (this.f5884a.b() < b);
                return;
            }
            if (i != 5) {
                int i2 = n1.f5864a;
                throw new m1();
            }
            do {
                list.add(Integer.valueOf(this.f5884a.h()));
                if (this.f5884a.c()) {
                    return;
                } else {
                    t = this.f5884a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        a1 a1Var = (a1) list;
        int i3 = this.b & 7;
        if (i3 == 2) {
            int u2 = this.f5884a.u();
            c(u2);
            int b2 = this.f5884a.b() + u2;
            do {
                a1Var.c(this.f5884a.h());
            } while (this.f5884a.b() < b2);
            return;
        }
        if (i3 != 5) {
            int i4 = n1.f5864a;
            throw new m1();
        }
        do {
            a1Var.c(this.f5884a.h());
            if (this.f5884a.c()) {
                return;
            } else {
                t2 = this.f5884a.t();
            }
        } while (t2 == this.b);
        this.d = t2;
    }

    public static void d(int i) {
        if ((i & 7) != 0) {
            throw new n1("Failed to parse the message.");
        }
    }

    public final Object c(t2 t2Var, h0 h0Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            Object a2 = t2Var.a();
            t2Var.a(a2, this, h0Var);
            t2Var.c(a2);
            if (this.b == this.c) {
                return a2;
            }
            throw new n1("Failed to parse the message.");
        } finally {
            this.c = i;
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void f(List list) {
        int t;
        int t2;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i = this.b & 7;
            if (i == 2) {
                int u = this.f5884a.u();
                c(u);
                int b = this.f5884a.b() + u;
                do {
                    a1Var.c(this.f5884a.n());
                } while (this.f5884a.b() < b);
                return;
            }
            if (i == 5) {
                do {
                    a1Var.c(this.f5884a.n());
                    if (this.f5884a.c()) {
                        return;
                    } else {
                        t2 = this.f5884a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            int i2 = n1.f5864a;
            throw new m1();
        }
        int i3 = this.b & 7;
        if (i3 == 2) {
            int u2 = this.f5884a.u();
            c(u2);
            int b2 = this.f5884a.b() + u2;
            do {
                list.add(Integer.valueOf(this.f5884a.n()));
            } while (this.f5884a.b() < b2);
            return;
        }
        if (i3 == 5) {
            do {
                list.add(Integer.valueOf(this.f5884a.n()));
                if (this.f5884a.c()) {
                    return;
                } else {
                    t = this.f5884a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        int i4 = n1.f5864a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void g(List list) {
        int t;
        int t2;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    u1Var.a(this.f5884a.q());
                    if (this.f5884a.c()) {
                        return;
                    } else {
                        t2 = this.f5884a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int b = this.f5884a.b() + this.f5884a.u();
                do {
                    u1Var.a(this.f5884a.q());
                } while (this.f5884a.b() < b);
                a(b);
                return;
            }
            int i2 = n1.f5864a;
            throw new m1();
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(Long.valueOf(this.f5884a.q()));
                if (this.f5884a.c()) {
                    return;
                } else {
                    t = this.f5884a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int b2 = this.f5884a.b() + this.f5884a.u();
            do {
                list.add(Long.valueOf(this.f5884a.q()));
            } while (this.f5884a.b() < b2);
            a(b2);
            return;
        }
        int i4 = n1.f5864a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void h(List list) {
        int t;
        if ((this.b & 7) == 2) {
            do {
                b(2);
                list.add(this.f5884a.e());
                if (this.f5884a.c()) {
                    return;
                } else {
                    t = this.f5884a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        int i = n1.f5864a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void j(List list) {
        int t;
        int t2;
        if (list instanceof d0) {
            d0 d0Var = (d0) list;
            int i = this.b & 7;
            if (i == 1) {
                do {
                    d0Var.a(this.f5884a.f());
                    if (this.f5884a.c()) {
                        return;
                    } else {
                        t2 = this.f5884a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int u = this.f5884a.u();
                d(u);
                int b = this.f5884a.b() + u;
                do {
                    d0Var.a(this.f5884a.f());
                } while (this.f5884a.b() < b);
                return;
            }
            int i2 = n1.f5864a;
            throw new m1();
        }
        int i3 = this.b & 7;
        if (i3 == 1) {
            do {
                list.add(Double.valueOf(this.f5884a.f()));
                if (this.f5884a.c()) {
                    return;
                } else {
                    t = this.f5884a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int u2 = this.f5884a.u();
            d(u2);
            int b2 = this.f5884a.b() + u2;
            do {
                list.add(Double.valueOf(this.f5884a.f()));
            } while (this.f5884a.b() < b2);
            return;
        }
        int i4 = n1.f5864a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void k(List list) {
        int t;
        int t2;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    u1Var.a(this.f5884a.l());
                    if (this.f5884a.c()) {
                        return;
                    } else {
                        t2 = this.f5884a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int b = this.f5884a.b() + this.f5884a.u();
                do {
                    u1Var.a(this.f5884a.l());
                } while (this.f5884a.b() < b);
                a(b);
                return;
            }
            int i2 = n1.f5864a;
            throw new m1();
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(Long.valueOf(this.f5884a.l()));
                if (this.f5884a.c()) {
                    return;
                } else {
                    t = this.f5884a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int b2 = this.f5884a.b() + this.f5884a.u();
            do {
                list.add(Long.valueOf(this.f5884a.l()));
            } while (this.f5884a.b() < b2);
            a(b2);
            return;
        }
        int i4 = n1.f5864a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void l(List list) {
        int t;
        int t2;
        if (list instanceof j) {
            j jVar = (j) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    jVar.a(this.f5884a.d());
                    if (this.f5884a.c()) {
                        return;
                    } else {
                        t2 = this.f5884a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int b = this.f5884a.b() + this.f5884a.u();
                do {
                    jVar.a(this.f5884a.d());
                } while (this.f5884a.b() < b);
                a(b);
                return;
            }
            int i2 = n1.f5864a;
            throw new m1();
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(Boolean.valueOf(this.f5884a.d()));
                if (this.f5884a.c()) {
                    return;
                } else {
                    t = this.f5884a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int b2 = this.f5884a.b() + this.f5884a.u();
            do {
                list.add(Boolean.valueOf(this.f5884a.d()));
            } while (this.f5884a.b() < b2);
            a(b2);
            return;
        }
        int i4 = n1.f5864a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void m(List list) {
        int t;
        int t2;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i = this.b & 7;
            if (i == 1) {
                do {
                    u1Var.a(this.f5884a.o());
                    if (this.f5884a.c()) {
                        return;
                    } else {
                        t2 = this.f5884a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int u = this.f5884a.u();
                d(u);
                int b = this.f5884a.b() + u;
                do {
                    u1Var.a(this.f5884a.o());
                } while (this.f5884a.b() < b);
                return;
            }
            int i2 = n1.f5864a;
            throw new m1();
        }
        int i3 = this.b & 7;
        if (i3 == 1) {
            do {
                list.add(Long.valueOf(this.f5884a.o()));
                if (this.f5884a.c()) {
                    return;
                } else {
                    t = this.f5884a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int u2 = this.f5884a.u();
            d(u2);
            int b2 = this.f5884a.b() + u2;
            do {
                list.add(Long.valueOf(this.f5884a.o()));
            } while (this.f5884a.b() < b2);
            return;
        }
        int i4 = n1.f5864a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void n(List list) {
        int t;
        int t2;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i = this.b & 7;
            if (i == 1) {
                do {
                    u1Var.a(this.f5884a.i());
                    if (this.f5884a.c()) {
                        return;
                    } else {
                        t2 = this.f5884a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int u = this.f5884a.u();
                d(u);
                int b = this.f5884a.b() + u;
                do {
                    u1Var.a(this.f5884a.i());
                } while (this.f5884a.b() < b);
                return;
            }
            int i2 = n1.f5864a;
            throw new m1();
        }
        int i3 = this.b & 7;
        if (i3 == 1) {
            do {
                list.add(Long.valueOf(this.f5884a.i()));
                if (this.f5884a.c()) {
                    return;
                } else {
                    t = this.f5884a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int u2 = this.f5884a.u();
            d(u2);
            int b2 = this.f5884a.b() + u2;
            do {
                list.add(Long.valueOf(this.f5884a.i()));
            } while (this.f5884a.b() < b2);
            return;
        }
        int i4 = n1.f5864a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void o(List list) {
        int t;
        int t2;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    a1Var.c(this.f5884a.k());
                    if (this.f5884a.c()) {
                        return;
                    } else {
                        t2 = this.f5884a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int b = this.f5884a.b() + this.f5884a.u();
                do {
                    a1Var.c(this.f5884a.k());
                } while (this.f5884a.b() < b);
                a(b);
                return;
            }
            int i2 = n1.f5864a;
            throw new m1();
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(Integer.valueOf(this.f5884a.k()));
                if (this.f5884a.c()) {
                    return;
                } else {
                    t = this.f5884a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int b2 = this.f5884a.b() + this.f5884a.u();
            do {
                list.add(Integer.valueOf(this.f5884a.k()));
            } while (this.f5884a.b() < b2);
            a(b2);
            return;
        }
        int i4 = n1.f5864a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void p(List list) {
        int t;
        int t2;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    a1Var.c(this.f5884a.g());
                    if (this.f5884a.c()) {
                        return;
                    } else {
                        t2 = this.f5884a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int b = this.f5884a.b() + this.f5884a.u();
                do {
                    a1Var.c(this.f5884a.g());
                } while (this.f5884a.b() < b);
                a(b);
                return;
            }
            int i2 = n1.f5864a;
            throw new m1();
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(Integer.valueOf(this.f5884a.g()));
                if (this.f5884a.c()) {
                    return;
                } else {
                    t = this.f5884a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int b2 = this.f5884a.b() + this.f5884a.u();
            do {
                list.add(Integer.valueOf(this.f5884a.g()));
            } while (this.f5884a.b() < b2);
            a(b2);
            return;
        }
        int i4 = n1.f5864a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void q(List list) {
        a(list, false);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object a(t2 t2Var, h0 h0Var) {
        b(3);
        return c(t2Var, h0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object b(Class cls, h0 h0Var) {
        b(2);
        return d(p2.c.a(cls), h0Var);
    }

    public final Object d(t2 t2Var, h0 h0Var) {
        int u = this.f5884a.u();
        w wVar = this.f5884a;
        if (wVar.f5879a < wVar.b) {
            int d = wVar.d(u);
            Object a2 = t2Var.a();
            this.f5884a.f5879a++;
            t2Var.a(a2, this, h0Var);
            t2Var.c(a2);
            this.f5884a.a(0);
            r5.f5879a--;
            this.f5884a.c(d);
            return a2;
        }
        throw new n1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void i(List list) {
        int t;
        int t2;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    a1Var.c(this.f5884a.u());
                    if (this.f5884a.c()) {
                        return;
                    } else {
                        t2 = this.f5884a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int b = this.f5884a.b() + this.f5884a.u();
                do {
                    a1Var.c(this.f5884a.u());
                } while (this.f5884a.b() < b);
                a(b);
                return;
            }
            int i2 = n1.f5864a;
            throw new m1();
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(Integer.valueOf(this.f5884a.u()));
                if (this.f5884a.c()) {
                    return;
                } else {
                    t = this.f5884a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int b2 = this.f5884a.b() + this.f5884a.u();
            do {
                list.add(Integer.valueOf(this.f5884a.u()));
            } while (this.f5884a.b() < b2);
            a(b2);
            return;
        }
        int i4 = n1.f5864a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final s a() {
        b(2);
        return this.f5884a.e();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void a(List list) {
        int t;
        int t2;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    u1Var.a(this.f5884a.v());
                    if (this.f5884a.c()) {
                        return;
                    } else {
                        t2 = this.f5884a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int b = this.f5884a.b() + this.f5884a.u();
                do {
                    u1Var.a(this.f5884a.v());
                } while (this.f5884a.b() < b);
                a(b);
                return;
            }
            int i2 = n1.f5864a;
            throw new m1();
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(Long.valueOf(this.f5884a.v()));
                if (this.f5884a.c()) {
                    return;
                } else {
                    t = this.f5884a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int b2 = this.f5884a.b() + this.f5884a.u();
            do {
                list.add(Long.valueOf(this.f5884a.v()));
            } while (this.f5884a.b() < b2);
            a(b2);
            return;
        }
        int i4 = n1.f5864a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object b(t2 t2Var, h0 h0Var) {
        b(2);
        return d(t2Var, h0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int b() {
        b(0);
        return this.f5884a.g();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void b(List list) {
        a(list, true);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void b(List list, t2 t2Var, h0 h0Var) {
        int t;
        int i = this.b;
        if ((i & 7) == 2) {
            do {
                list.add(d(t2Var, h0Var));
                if (this.f5884a.c() || this.d != 0) {
                    return;
                } else {
                    t = this.f5884a.t();
                }
            } while (t == i);
            this.d = t;
            return;
        }
        int i2 = n1.f5864a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void d(List list) {
        int t;
        int t2;
        if (list instanceof q0) {
            q0 q0Var = (q0) list;
            int i = this.b & 7;
            if (i == 2) {
                int u = this.f5884a.u();
                c(u);
                int b = this.f5884a.b() + u;
                do {
                    q0Var.a(this.f5884a.j());
                } while (this.f5884a.b() < b);
                return;
            }
            if (i == 5) {
                do {
                    q0Var.a(this.f5884a.j());
                    if (this.f5884a.c()) {
                        return;
                    } else {
                        t2 = this.f5884a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            int i2 = n1.f5864a;
            throw new m1();
        }
        int i3 = this.b & 7;
        if (i3 == 2) {
            int u2 = this.f5884a.u();
            c(u2);
            int b2 = this.f5884a.b() + u2;
            do {
                list.add(Float.valueOf(this.f5884a.j()));
            } while (this.f5884a.b() < b2);
            return;
        }
        if (i3 == 5) {
            do {
                list.add(Float.valueOf(this.f5884a.j()));
                if (this.f5884a.c()) {
                    return;
                } else {
                    t = this.f5884a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        int i4 = n1.f5864a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int c() {
        b(0);
        return this.f5884a.u();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void c(List list) {
        int t;
        int t2;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    a1Var.c(this.f5884a.p());
                    if (this.f5884a.c()) {
                        return;
                    } else {
                        t2 = this.f5884a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int b = this.f5884a.b() + this.f5884a.u();
                do {
                    a1Var.c(this.f5884a.p());
                } while (this.f5884a.b() < b);
                a(b);
                return;
            }
            int i2 = n1.f5864a;
            throw new m1();
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(Integer.valueOf(this.f5884a.p()));
                if (this.f5884a.c()) {
                    return;
                } else {
                    t = this.f5884a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int b2 = this.f5884a.b() + this.f5884a.u();
            do {
                list.add(Integer.valueOf(this.f5884a.p()));
            } while (this.f5884a.b() < b2);
            a(b2);
            return;
        }
        int i4 = n1.f5864a;
        throw new m1();
    }

    public final void a(List list, boolean z) {
        String r;
        int t;
        int t2;
        if ((this.b & 7) == 2) {
            if ((list instanceof q1) && !z) {
                q1 q1Var = (q1) list;
                do {
                    b(2);
                    q1Var.a(this.f5884a.e());
                    if (this.f5884a.c()) {
                        return;
                    } else {
                        t2 = this.f5884a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            do {
                if (z) {
                    b(2);
                    r = this.f5884a.s();
                } else {
                    b(2);
                    r = this.f5884a.r();
                }
                list.add(r);
                if (this.f5884a.c()) {
                    return;
                } else {
                    t = this.f5884a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        int i = n1.f5864a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void a(List list, t2 t2Var, h0 h0Var) {
        int t;
        int i = this.b;
        if ((i & 7) == 3) {
            do {
                list.add(c(t2Var, h0Var));
                if (this.f5884a.c() || this.d != 0) {
                    return;
                } else {
                    t = this.f5884a.t();
                }
            } while (t == i);
            this.d = t;
            return;
        }
        int i2 = n1.f5864a;
        throw new m1();
    }

    public final void a(int i) {
        if (this.f5884a.b() != i) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
