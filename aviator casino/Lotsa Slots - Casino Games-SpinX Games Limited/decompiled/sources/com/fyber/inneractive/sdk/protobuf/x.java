package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class x implements com.fyber.inneractive.sdk.protobuf.s2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.protobuf.w f4227a;
    public int b;
    public int c;
    public int d = 0;

    public x(com.fyber.inneractive.sdk.protobuf.w wVar) {
        java.nio.charset.Charset charset = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
        if (wVar == null) {
            throw new java.lang.NullPointerException("input");
        }
        this.f4227a = wVar;
        wVar.d = this;
    }

    public static void c(int i) {
        if ((i & 3) != 0) {
            throw new com.fyber.inneractive.sdk.protobuf.n1("Failed to parse the message.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final java.lang.Object a(java.lang.Class cls, com.fyber.inneractive.sdk.protobuf.h0 h0Var) {
        b(3);
        return c(com.fyber.inneractive.sdk.protobuf.p2.c.a(cls), h0Var);
    }

    public final void b(int i) {
        if ((this.b & 7) == i) {
            return;
        }
        int i2 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
        throw new com.fyber.inneractive.sdk.protobuf.m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int d() {
        b(0);
        return this.f4227a.k();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int e() {
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long f() {
        b(0);
        return this.f4227a.v();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long g() {
        b(1);
        return this.f4227a.i();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final double h() {
        b(1);
        return this.f4227a.f();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final boolean i() {
        int i;
        if (this.f4227a.c() || (i = this.b) == this.c) {
            return false;
        }
        return this.f4227a.e(i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int j() {
        b(0);
        return this.f4227a.p();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final float k() {
        b(5);
        return this.f4227a.j();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long l() {
        b(0);
        return this.f4227a.q();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int m() {
        b(5);
        return this.f4227a.n();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final java.lang.String n() {
        b(2);
        return this.f4227a.r();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long o() {
        b(0);
        return this.f4227a.l();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final java.lang.String p() {
        b(2);
        return this.f4227a.s();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int q() {
        b(5);
        return this.f4227a.h();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final boolean r() {
        b(0);
        return this.f4227a.d();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int s() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.f4227a.t();
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
        return this.f4227a.o();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void e(java.util.List list) {
        int t;
        int t2;
        if (!(list instanceof com.fyber.inneractive.sdk.protobuf.a1)) {
            int i = this.b & 7;
            if (i == 2) {
                int u = this.f4227a.u();
                c(u);
                int b = this.f4227a.b() + u;
                do {
                    list.add(java.lang.Integer.valueOf(this.f4227a.h()));
                } while (this.f4227a.b() < b);
                return;
            }
            if (i != 5) {
                int i2 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
                throw new com.fyber.inneractive.sdk.protobuf.m1();
            }
            do {
                list.add(java.lang.Integer.valueOf(this.f4227a.h()));
                if (this.f4227a.c()) {
                    return;
                } else {
                    t = this.f4227a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        com.fyber.inneractive.sdk.protobuf.a1 a1Var = (com.fyber.inneractive.sdk.protobuf.a1) list;
        int i3 = this.b & 7;
        if (i3 == 2) {
            int u2 = this.f4227a.u();
            c(u2);
            int b2 = this.f4227a.b() + u2;
            do {
                a1Var.c(this.f4227a.h());
            } while (this.f4227a.b() < b2);
            return;
        }
        if (i3 != 5) {
            int i4 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
            throw new com.fyber.inneractive.sdk.protobuf.m1();
        }
        do {
            a1Var.c(this.f4227a.h());
            if (this.f4227a.c()) {
                return;
            } else {
                t2 = this.f4227a.t();
            }
        } while (t2 == this.b);
        this.d = t2;
    }

    public static void d(int i) {
        if ((i & 7) != 0) {
            throw new com.fyber.inneractive.sdk.protobuf.n1("Failed to parse the message.");
        }
    }

    public final java.lang.Object c(com.fyber.inneractive.sdk.protobuf.t2 t2Var, com.fyber.inneractive.sdk.protobuf.h0 h0Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            java.lang.Object a2 = t2Var.a();
            t2Var.a(a2, this, h0Var);
            t2Var.c(a2);
            if (this.b == this.c) {
                return a2;
            }
            throw new com.fyber.inneractive.sdk.protobuf.n1("Failed to parse the message.");
        } finally {
            this.c = i;
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void f(java.util.List list) {
        int t;
        int t2;
        if (list instanceof com.fyber.inneractive.sdk.protobuf.a1) {
            com.fyber.inneractive.sdk.protobuf.a1 a1Var = (com.fyber.inneractive.sdk.protobuf.a1) list;
            int i = this.b & 7;
            if (i == 2) {
                int u = this.f4227a.u();
                c(u);
                int b = this.f4227a.b() + u;
                do {
                    a1Var.c(this.f4227a.n());
                } while (this.f4227a.b() < b);
                return;
            }
            if (i == 5) {
                do {
                    a1Var.c(this.f4227a.n());
                    if (this.f4227a.c()) {
                        return;
                    } else {
                        t2 = this.f4227a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            int i2 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
            throw new com.fyber.inneractive.sdk.protobuf.m1();
        }
        int i3 = this.b & 7;
        if (i3 == 2) {
            int u2 = this.f4227a.u();
            c(u2);
            int b2 = this.f4227a.b() + u2;
            do {
                list.add(java.lang.Integer.valueOf(this.f4227a.n()));
            } while (this.f4227a.b() < b2);
            return;
        }
        if (i3 == 5) {
            do {
                list.add(java.lang.Integer.valueOf(this.f4227a.n()));
                if (this.f4227a.c()) {
                    return;
                } else {
                    t = this.f4227a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        int i4 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
        throw new com.fyber.inneractive.sdk.protobuf.m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void g(java.util.List list) {
        int t;
        int t2;
        if (list instanceof com.fyber.inneractive.sdk.protobuf.u1) {
            com.fyber.inneractive.sdk.protobuf.u1 u1Var = (com.fyber.inneractive.sdk.protobuf.u1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    u1Var.a(this.f4227a.q());
                    if (this.f4227a.c()) {
                        return;
                    } else {
                        t2 = this.f4227a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int b = this.f4227a.b() + this.f4227a.u();
                do {
                    u1Var.a(this.f4227a.q());
                } while (this.f4227a.b() < b);
                a(b);
                return;
            }
            int i2 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
            throw new com.fyber.inneractive.sdk.protobuf.m1();
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(java.lang.Long.valueOf(this.f4227a.q()));
                if (this.f4227a.c()) {
                    return;
                } else {
                    t = this.f4227a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int b2 = this.f4227a.b() + this.f4227a.u();
            do {
                list.add(java.lang.Long.valueOf(this.f4227a.q()));
            } while (this.f4227a.b() < b2);
            a(b2);
            return;
        }
        int i4 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
        throw new com.fyber.inneractive.sdk.protobuf.m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void h(java.util.List list) {
        int t;
        if ((this.b & 7) == 2) {
            do {
                b(2);
                list.add(this.f4227a.e());
                if (this.f4227a.c()) {
                    return;
                } else {
                    t = this.f4227a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        int i = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
        throw new com.fyber.inneractive.sdk.protobuf.m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void j(java.util.List list) {
        int t;
        int t2;
        if (list instanceof com.fyber.inneractive.sdk.protobuf.d0) {
            com.fyber.inneractive.sdk.protobuf.d0 d0Var = (com.fyber.inneractive.sdk.protobuf.d0) list;
            int i = this.b & 7;
            if (i == 1) {
                do {
                    d0Var.a(this.f4227a.f());
                    if (this.f4227a.c()) {
                        return;
                    } else {
                        t2 = this.f4227a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int u = this.f4227a.u();
                d(u);
                int b = this.f4227a.b() + u;
                do {
                    d0Var.a(this.f4227a.f());
                } while (this.f4227a.b() < b);
                return;
            }
            int i2 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
            throw new com.fyber.inneractive.sdk.protobuf.m1();
        }
        int i3 = this.b & 7;
        if (i3 == 1) {
            do {
                list.add(java.lang.Double.valueOf(this.f4227a.f()));
                if (this.f4227a.c()) {
                    return;
                } else {
                    t = this.f4227a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int u2 = this.f4227a.u();
            d(u2);
            int b2 = this.f4227a.b() + u2;
            do {
                list.add(java.lang.Double.valueOf(this.f4227a.f()));
            } while (this.f4227a.b() < b2);
            return;
        }
        int i4 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
        throw new com.fyber.inneractive.sdk.protobuf.m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void k(java.util.List list) {
        int t;
        int t2;
        if (list instanceof com.fyber.inneractive.sdk.protobuf.u1) {
            com.fyber.inneractive.sdk.protobuf.u1 u1Var = (com.fyber.inneractive.sdk.protobuf.u1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    u1Var.a(this.f4227a.l());
                    if (this.f4227a.c()) {
                        return;
                    } else {
                        t2 = this.f4227a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int b = this.f4227a.b() + this.f4227a.u();
                do {
                    u1Var.a(this.f4227a.l());
                } while (this.f4227a.b() < b);
                a(b);
                return;
            }
            int i2 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
            throw new com.fyber.inneractive.sdk.protobuf.m1();
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(java.lang.Long.valueOf(this.f4227a.l()));
                if (this.f4227a.c()) {
                    return;
                } else {
                    t = this.f4227a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int b2 = this.f4227a.b() + this.f4227a.u();
            do {
                list.add(java.lang.Long.valueOf(this.f4227a.l()));
            } while (this.f4227a.b() < b2);
            a(b2);
            return;
        }
        int i4 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
        throw new com.fyber.inneractive.sdk.protobuf.m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void l(java.util.List list) {
        int t;
        int t2;
        if (list instanceof com.fyber.inneractive.sdk.protobuf.j) {
            com.fyber.inneractive.sdk.protobuf.j jVar = (com.fyber.inneractive.sdk.protobuf.j) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    jVar.a(this.f4227a.d());
                    if (this.f4227a.c()) {
                        return;
                    } else {
                        t2 = this.f4227a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int b = this.f4227a.b() + this.f4227a.u();
                do {
                    jVar.a(this.f4227a.d());
                } while (this.f4227a.b() < b);
                a(b);
                return;
            }
            int i2 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
            throw new com.fyber.inneractive.sdk.protobuf.m1();
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(java.lang.Boolean.valueOf(this.f4227a.d()));
                if (this.f4227a.c()) {
                    return;
                } else {
                    t = this.f4227a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int b2 = this.f4227a.b() + this.f4227a.u();
            do {
                list.add(java.lang.Boolean.valueOf(this.f4227a.d()));
            } while (this.f4227a.b() < b2);
            a(b2);
            return;
        }
        int i4 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
        throw new com.fyber.inneractive.sdk.protobuf.m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void m(java.util.List list) {
        int t;
        int t2;
        if (list instanceof com.fyber.inneractive.sdk.protobuf.u1) {
            com.fyber.inneractive.sdk.protobuf.u1 u1Var = (com.fyber.inneractive.sdk.protobuf.u1) list;
            int i = this.b & 7;
            if (i == 1) {
                do {
                    u1Var.a(this.f4227a.o());
                    if (this.f4227a.c()) {
                        return;
                    } else {
                        t2 = this.f4227a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int u = this.f4227a.u();
                d(u);
                int b = this.f4227a.b() + u;
                do {
                    u1Var.a(this.f4227a.o());
                } while (this.f4227a.b() < b);
                return;
            }
            int i2 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
            throw new com.fyber.inneractive.sdk.protobuf.m1();
        }
        int i3 = this.b & 7;
        if (i3 == 1) {
            do {
                list.add(java.lang.Long.valueOf(this.f4227a.o()));
                if (this.f4227a.c()) {
                    return;
                } else {
                    t = this.f4227a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int u2 = this.f4227a.u();
            d(u2);
            int b2 = this.f4227a.b() + u2;
            do {
                list.add(java.lang.Long.valueOf(this.f4227a.o()));
            } while (this.f4227a.b() < b2);
            return;
        }
        int i4 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
        throw new com.fyber.inneractive.sdk.protobuf.m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void n(java.util.List list) {
        int t;
        int t2;
        if (list instanceof com.fyber.inneractive.sdk.protobuf.u1) {
            com.fyber.inneractive.sdk.protobuf.u1 u1Var = (com.fyber.inneractive.sdk.protobuf.u1) list;
            int i = this.b & 7;
            if (i == 1) {
                do {
                    u1Var.a(this.f4227a.i());
                    if (this.f4227a.c()) {
                        return;
                    } else {
                        t2 = this.f4227a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int u = this.f4227a.u();
                d(u);
                int b = this.f4227a.b() + u;
                do {
                    u1Var.a(this.f4227a.i());
                } while (this.f4227a.b() < b);
                return;
            }
            int i2 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
            throw new com.fyber.inneractive.sdk.protobuf.m1();
        }
        int i3 = this.b & 7;
        if (i3 == 1) {
            do {
                list.add(java.lang.Long.valueOf(this.f4227a.i()));
                if (this.f4227a.c()) {
                    return;
                } else {
                    t = this.f4227a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int u2 = this.f4227a.u();
            d(u2);
            int b2 = this.f4227a.b() + u2;
            do {
                list.add(java.lang.Long.valueOf(this.f4227a.i()));
            } while (this.f4227a.b() < b2);
            return;
        }
        int i4 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
        throw new com.fyber.inneractive.sdk.protobuf.m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void o(java.util.List list) {
        int t;
        int t2;
        if (list instanceof com.fyber.inneractive.sdk.protobuf.a1) {
            com.fyber.inneractive.sdk.protobuf.a1 a1Var = (com.fyber.inneractive.sdk.protobuf.a1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    a1Var.c(this.f4227a.k());
                    if (this.f4227a.c()) {
                        return;
                    } else {
                        t2 = this.f4227a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int b = this.f4227a.b() + this.f4227a.u();
                do {
                    a1Var.c(this.f4227a.k());
                } while (this.f4227a.b() < b);
                a(b);
                return;
            }
            int i2 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
            throw new com.fyber.inneractive.sdk.protobuf.m1();
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(java.lang.Integer.valueOf(this.f4227a.k()));
                if (this.f4227a.c()) {
                    return;
                } else {
                    t = this.f4227a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int b2 = this.f4227a.b() + this.f4227a.u();
            do {
                list.add(java.lang.Integer.valueOf(this.f4227a.k()));
            } while (this.f4227a.b() < b2);
            a(b2);
            return;
        }
        int i4 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
        throw new com.fyber.inneractive.sdk.protobuf.m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void p(java.util.List list) {
        int t;
        int t2;
        if (list instanceof com.fyber.inneractive.sdk.protobuf.a1) {
            com.fyber.inneractive.sdk.protobuf.a1 a1Var = (com.fyber.inneractive.sdk.protobuf.a1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    a1Var.c(this.f4227a.g());
                    if (this.f4227a.c()) {
                        return;
                    } else {
                        t2 = this.f4227a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int b = this.f4227a.b() + this.f4227a.u();
                do {
                    a1Var.c(this.f4227a.g());
                } while (this.f4227a.b() < b);
                a(b);
                return;
            }
            int i2 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
            throw new com.fyber.inneractive.sdk.protobuf.m1();
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(java.lang.Integer.valueOf(this.f4227a.g()));
                if (this.f4227a.c()) {
                    return;
                } else {
                    t = this.f4227a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int b2 = this.f4227a.b() + this.f4227a.u();
            do {
                list.add(java.lang.Integer.valueOf(this.f4227a.g()));
            } while (this.f4227a.b() < b2);
            a(b2);
            return;
        }
        int i4 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
        throw new com.fyber.inneractive.sdk.protobuf.m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void q(java.util.List list) {
        a(list, false);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final java.lang.Object a(com.fyber.inneractive.sdk.protobuf.t2 t2Var, com.fyber.inneractive.sdk.protobuf.h0 h0Var) {
        b(3);
        return c(t2Var, h0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final java.lang.Object b(java.lang.Class cls, com.fyber.inneractive.sdk.protobuf.h0 h0Var) {
        b(2);
        return d(com.fyber.inneractive.sdk.protobuf.p2.c.a(cls), h0Var);
    }

    public final java.lang.Object d(com.fyber.inneractive.sdk.protobuf.t2 t2Var, com.fyber.inneractive.sdk.protobuf.h0 h0Var) {
        int u = this.f4227a.u();
        com.fyber.inneractive.sdk.protobuf.w wVar = this.f4227a;
        if (wVar.f4222a < wVar.b) {
            int d = wVar.d(u);
            java.lang.Object a2 = t2Var.a();
            this.f4227a.f4222a++;
            t2Var.a(a2, this, h0Var);
            t2Var.c(a2);
            this.f4227a.a(0);
            r5.f4222a--;
            this.f4227a.c(d);
            return a2;
        }
        throw new com.fyber.inneractive.sdk.protobuf.n1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void i(java.util.List list) {
        int t;
        int t2;
        if (list instanceof com.fyber.inneractive.sdk.protobuf.a1) {
            com.fyber.inneractive.sdk.protobuf.a1 a1Var = (com.fyber.inneractive.sdk.protobuf.a1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    a1Var.c(this.f4227a.u());
                    if (this.f4227a.c()) {
                        return;
                    } else {
                        t2 = this.f4227a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int b = this.f4227a.b() + this.f4227a.u();
                do {
                    a1Var.c(this.f4227a.u());
                } while (this.f4227a.b() < b);
                a(b);
                return;
            }
            int i2 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
            throw new com.fyber.inneractive.sdk.protobuf.m1();
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(java.lang.Integer.valueOf(this.f4227a.u()));
                if (this.f4227a.c()) {
                    return;
                } else {
                    t = this.f4227a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int b2 = this.f4227a.b() + this.f4227a.u();
            do {
                list.add(java.lang.Integer.valueOf(this.f4227a.u()));
            } while (this.f4227a.b() < b2);
            a(b2);
            return;
        }
        int i4 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
        throw new com.fyber.inneractive.sdk.protobuf.m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final com.fyber.inneractive.sdk.protobuf.s a() {
        b(2);
        return this.f4227a.e();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void a(java.util.List list) {
        int t;
        int t2;
        if (list instanceof com.fyber.inneractive.sdk.protobuf.u1) {
            com.fyber.inneractive.sdk.protobuf.u1 u1Var = (com.fyber.inneractive.sdk.protobuf.u1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    u1Var.a(this.f4227a.v());
                    if (this.f4227a.c()) {
                        return;
                    } else {
                        t2 = this.f4227a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int b = this.f4227a.b() + this.f4227a.u();
                do {
                    u1Var.a(this.f4227a.v());
                } while (this.f4227a.b() < b);
                a(b);
                return;
            }
            int i2 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
            throw new com.fyber.inneractive.sdk.protobuf.m1();
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(java.lang.Long.valueOf(this.f4227a.v()));
                if (this.f4227a.c()) {
                    return;
                } else {
                    t = this.f4227a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int b2 = this.f4227a.b() + this.f4227a.u();
            do {
                list.add(java.lang.Long.valueOf(this.f4227a.v()));
            } while (this.f4227a.b() < b2);
            a(b2);
            return;
        }
        int i4 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
        throw new com.fyber.inneractive.sdk.protobuf.m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final java.lang.Object b(com.fyber.inneractive.sdk.protobuf.t2 t2Var, com.fyber.inneractive.sdk.protobuf.h0 h0Var) {
        b(2);
        return d(t2Var, h0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int b() {
        b(0);
        return this.f4227a.g();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void b(java.util.List list) {
        a(list, true);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void b(java.util.List list, com.fyber.inneractive.sdk.protobuf.t2 t2Var, com.fyber.inneractive.sdk.protobuf.h0 h0Var) {
        int t;
        int i = this.b;
        if ((i & 7) == 2) {
            do {
                list.add(d(t2Var, h0Var));
                if (this.f4227a.c() || this.d != 0) {
                    return;
                } else {
                    t = this.f4227a.t();
                }
            } while (t == i);
            this.d = t;
            return;
        }
        int i2 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
        throw new com.fyber.inneractive.sdk.protobuf.m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void d(java.util.List list) {
        int t;
        int t2;
        if (list instanceof com.fyber.inneractive.sdk.protobuf.q0) {
            com.fyber.inneractive.sdk.protobuf.q0 q0Var = (com.fyber.inneractive.sdk.protobuf.q0) list;
            int i = this.b & 7;
            if (i == 2) {
                int u = this.f4227a.u();
                c(u);
                int b = this.f4227a.b() + u;
                do {
                    q0Var.a(this.f4227a.j());
                } while (this.f4227a.b() < b);
                return;
            }
            if (i == 5) {
                do {
                    q0Var.a(this.f4227a.j());
                    if (this.f4227a.c()) {
                        return;
                    } else {
                        t2 = this.f4227a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            int i2 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
            throw new com.fyber.inneractive.sdk.protobuf.m1();
        }
        int i3 = this.b & 7;
        if (i3 == 2) {
            int u2 = this.f4227a.u();
            c(u2);
            int b2 = this.f4227a.b() + u2;
            do {
                list.add(java.lang.Float.valueOf(this.f4227a.j()));
            } while (this.f4227a.b() < b2);
            return;
        }
        if (i3 == 5) {
            do {
                list.add(java.lang.Float.valueOf(this.f4227a.j()));
                if (this.f4227a.c()) {
                    return;
                } else {
                    t = this.f4227a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        int i4 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
        throw new com.fyber.inneractive.sdk.protobuf.m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int c() {
        b(0);
        return this.f4227a.u();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void c(java.util.List list) {
        int t;
        int t2;
        if (list instanceof com.fyber.inneractive.sdk.protobuf.a1) {
            com.fyber.inneractive.sdk.protobuf.a1 a1Var = (com.fyber.inneractive.sdk.protobuf.a1) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    a1Var.c(this.f4227a.p());
                    if (this.f4227a.c()) {
                        return;
                    } else {
                        t2 = this.f4227a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            if (i == 2) {
                int b = this.f4227a.b() + this.f4227a.u();
                do {
                    a1Var.c(this.f4227a.p());
                } while (this.f4227a.b() < b);
                a(b);
                return;
            }
            int i2 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
            throw new com.fyber.inneractive.sdk.protobuf.m1();
        }
        int i3 = this.b & 7;
        if (i3 == 0) {
            do {
                list.add(java.lang.Integer.valueOf(this.f4227a.p()));
                if (this.f4227a.c()) {
                    return;
                } else {
                    t = this.f4227a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i3 == 2) {
            int b2 = this.f4227a.b() + this.f4227a.u();
            do {
                list.add(java.lang.Integer.valueOf(this.f4227a.p()));
            } while (this.f4227a.b() < b2);
            a(b2);
            return;
        }
        int i4 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
        throw new com.fyber.inneractive.sdk.protobuf.m1();
    }

    public final void a(java.util.List list, boolean z) {
        java.lang.String r;
        int t;
        int t2;
        if ((this.b & 7) == 2) {
            if ((list instanceof com.fyber.inneractive.sdk.protobuf.q1) && !z) {
                com.fyber.inneractive.sdk.protobuf.q1 q1Var = (com.fyber.inneractive.sdk.protobuf.q1) list;
                do {
                    b(2);
                    q1Var.a(this.f4227a.e());
                    if (this.f4227a.c()) {
                        return;
                    } else {
                        t2 = this.f4227a.t();
                    }
                } while (t2 == this.b);
                this.d = t2;
                return;
            }
            do {
                if (z) {
                    b(2);
                    r = this.f4227a.s();
                } else {
                    b(2);
                    r = this.f4227a.r();
                }
                list.add(r);
                if (this.f4227a.c()) {
                    return;
                } else {
                    t = this.f4227a.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        int i = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
        throw new com.fyber.inneractive.sdk.protobuf.m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void a(java.util.List list, com.fyber.inneractive.sdk.protobuf.t2 t2Var, com.fyber.inneractive.sdk.protobuf.h0 h0Var) {
        int t;
        int i = this.b;
        if ((i & 7) == 3) {
            do {
                list.add(c(t2Var, h0Var));
                if (this.f4227a.c() || this.d != 0) {
                    return;
                } else {
                    t = this.f4227a.t();
                }
            } while (t == i);
            this.d = t;
            return;
        }
        int i2 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
        throw new com.fyber.inneractive.sdk.protobuf.m1();
    }

    public final void a(int i) {
        if (this.f4227a.b() != i) {
            throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
