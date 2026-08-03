package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0075k {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.AbstractC0074j f2330a;

    /* renamed from: b, reason: collision with root package name */
    public int f2331b;

    /* renamed from: c, reason: collision with root package name */
    public int f2332c;

    /* renamed from: d, reason: collision with root package name */
    public int f2333d = 0;

    public C0075k(androidx.datastore.preferences.protobuf.AbstractC0074j abstractC0074j) {
        java.nio.charset.Charset charset = androidx.datastore.preferences.protobuf.AbstractC0088y.f2376a;
        this.f2330a = abstractC0074j;
        abstractC0074j.f2323b = this;
    }

    public final int a() {
        int i2 = this.f2333d;
        if (i2 != 0) {
            this.f2331b = i2;
            this.f2333d = 0;
        } else {
            this.f2331b = this.f2330a.u();
        }
        int i3 = this.f2331b;
        if (i3 == 0 || i3 == this.f2332c) {
            return Integer.MAX_VALUE;
        }
        return i3 >>> 3;
    }

    public final void b(java.lang.Object obj, androidx.datastore.preferences.protobuf.W w2, androidx.datastore.preferences.protobuf.C0079o c0079o) {
        int i2 = this.f2332c;
        this.f2332c = ((this.f2331b >>> 3) << 3) | 4;
        try {
            w2.b(obj, this, c0079o);
            if (this.f2331b == this.f2332c) {
            } else {
                throw new androidx.datastore.preferences.protobuf.A("Failed to parse the message.");
            }
        } finally {
            this.f2332c = i2;
        }
    }

    public final void c(java.lang.Object obj, androidx.datastore.preferences.protobuf.W w2, androidx.datastore.preferences.protobuf.C0079o c0079o) {
        androidx.datastore.preferences.protobuf.AbstractC0074j abstractC0074j = this.f2330a;
        int v2 = abstractC0074j.v();
        if (abstractC0074j.f2322a >= 100) {
            throw new androidx.datastore.preferences.protobuf.A("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int e2 = abstractC0074j.e(v2);
        abstractC0074j.f2322a++;
        w2.b(obj, this, c0079o);
        abstractC0074j.a(0);
        abstractC0074j.f2322a--;
        abstractC0074j.d(e2);
    }

    public final void d(androidx.datastore.preferences.protobuf.InterfaceC0087x interfaceC0087x) {
        int u2;
        int i2 = this.f2331b & 7;
        androidx.datastore.preferences.protobuf.AbstractC0074j abstractC0074j = this.f2330a;
        if (i2 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(java.lang.Boolean.valueOf(abstractC0074j.f()));
                if (abstractC0074j.c()) {
                    return;
                } else {
                    u2 = abstractC0074j.u();
                }
            } while (u2 == this.f2331b);
            this.f2333d = u2;
            return;
        }
        if (i2 != 2) {
            throw androidx.datastore.preferences.protobuf.A.b();
        }
        int b2 = abstractC0074j.b() + abstractC0074j.v();
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(java.lang.Boolean.valueOf(abstractC0074j.f()));
        } while (abstractC0074j.b() < b2);
        v(b2);
    }

    public final androidx.datastore.preferences.protobuf.C0071g e() {
        w(2);
        return this.f2330a.g();
    }

    public final void f(androidx.datastore.preferences.protobuf.InterfaceC0087x interfaceC0087x) {
        int u2;
        if ((this.f2331b & 7) != 2) {
            throw androidx.datastore.preferences.protobuf.A.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(e());
            androidx.datastore.preferences.protobuf.AbstractC0074j abstractC0074j = this.f2330a;
            if (abstractC0074j.c()) {
                return;
            } else {
                u2 = abstractC0074j.u();
            }
        } while (u2 == this.f2331b);
        this.f2333d = u2;
    }

    public final void g(androidx.datastore.preferences.protobuf.InterfaceC0087x interfaceC0087x) {
        int u2;
        int i2 = this.f2331b & 7;
        androidx.datastore.preferences.protobuf.AbstractC0074j abstractC0074j = this.f2330a;
        if (i2 == 1) {
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(java.lang.Double.valueOf(abstractC0074j.h()));
                if (abstractC0074j.c()) {
                    return;
                } else {
                    u2 = abstractC0074j.u();
                }
            } while (u2 == this.f2331b);
            this.f2333d = u2;
            return;
        }
        if (i2 != 2) {
            throw androidx.datastore.preferences.protobuf.A.b();
        }
        int v2 = abstractC0074j.v();
        if ((v2 & 7) != 0) {
            throw new androidx.datastore.preferences.protobuf.A("Failed to parse the message.");
        }
        int b2 = abstractC0074j.b() + v2;
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(java.lang.Double.valueOf(abstractC0074j.h()));
        } while (abstractC0074j.b() < b2);
    }

    public final void h(androidx.datastore.preferences.protobuf.InterfaceC0087x interfaceC0087x) {
        int u2;
        int i2 = this.f2331b & 7;
        androidx.datastore.preferences.protobuf.AbstractC0074j abstractC0074j = this.f2330a;
        if (i2 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(java.lang.Integer.valueOf(abstractC0074j.i()));
                if (abstractC0074j.c()) {
                    return;
                } else {
                    u2 = abstractC0074j.u();
                }
            } while (u2 == this.f2331b);
            this.f2333d = u2;
            return;
        }
        if (i2 != 2) {
            throw androidx.datastore.preferences.protobuf.A.b();
        }
        int b2 = abstractC0074j.b() + abstractC0074j.v();
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(java.lang.Integer.valueOf(abstractC0074j.i()));
        } while (abstractC0074j.b() < b2);
        v(b2);
    }

    public final java.lang.Object i(androidx.datastore.preferences.protobuf.r0 r0Var, java.lang.Class cls, androidx.datastore.preferences.protobuf.C0079o c0079o) {
        int ordinal = r0Var.ordinal();
        androidx.datastore.preferences.protobuf.AbstractC0074j abstractC0074j = this.f2330a;
        switch (ordinal) {
            case 0:
                w(1);
                return java.lang.Double.valueOf(abstractC0074j.h());
            case 1:
                w(5);
                return java.lang.Float.valueOf(abstractC0074j.l());
            case 2:
                w(0);
                return java.lang.Long.valueOf(abstractC0074j.n());
            case 3:
                w(0);
                return java.lang.Long.valueOf(abstractC0074j.w());
            case 4:
                w(0);
                return java.lang.Integer.valueOf(abstractC0074j.m());
            case 5:
                w(1);
                return java.lang.Long.valueOf(abstractC0074j.k());
            case 6:
                w(5);
                return java.lang.Integer.valueOf(abstractC0074j.j());
            case 7:
                w(0);
                return java.lang.Boolean.valueOf(abstractC0074j.f());
            case 8:
                w(2);
                return abstractC0074j.t();
            case 9:
            default:
                throw new java.lang.IllegalArgumentException("unsupported field type.");
            case 10:
                w(2);
                androidx.datastore.preferences.protobuf.W a2 = androidx.datastore.preferences.protobuf.T.f2259c.a(cls);
                androidx.datastore.preferences.protobuf.AbstractC0086w g2 = a2.g();
                c(g2, a2, c0079o);
                a2.h(g2);
                return g2;
            case 11:
                return e();
            case 12:
                w(0);
                return java.lang.Integer.valueOf(abstractC0074j.v());
            case 13:
                w(0);
                return java.lang.Integer.valueOf(abstractC0074j.i());
            case 14:
                w(5);
                return java.lang.Integer.valueOf(abstractC0074j.o());
            case 15:
                w(1);
                return java.lang.Long.valueOf(abstractC0074j.p());
            case 16:
                w(0);
                return java.lang.Integer.valueOf(abstractC0074j.q());
            case 17:
                w(0);
                return java.lang.Long.valueOf(abstractC0074j.r());
        }
    }

    public final void j(androidx.datastore.preferences.protobuf.InterfaceC0087x interfaceC0087x) {
        int u2;
        int i2 = this.f2331b & 7;
        androidx.datastore.preferences.protobuf.AbstractC0074j abstractC0074j = this.f2330a;
        if (i2 == 2) {
            int v2 = abstractC0074j.v();
            if ((v2 & 3) != 0) {
                throw new androidx.datastore.preferences.protobuf.A("Failed to parse the message.");
            }
            int b2 = abstractC0074j.b() + v2;
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(java.lang.Integer.valueOf(abstractC0074j.j()));
            } while (abstractC0074j.b() < b2);
            return;
        }
        if (i2 != 5) {
            throw androidx.datastore.preferences.protobuf.A.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(java.lang.Integer.valueOf(abstractC0074j.j()));
            if (abstractC0074j.c()) {
                return;
            } else {
                u2 = abstractC0074j.u();
            }
        } while (u2 == this.f2331b);
        this.f2333d = u2;
    }

    public final void k(androidx.datastore.preferences.protobuf.InterfaceC0087x interfaceC0087x) {
        int u2;
        int i2 = this.f2331b & 7;
        androidx.datastore.preferences.protobuf.AbstractC0074j abstractC0074j = this.f2330a;
        if (i2 == 1) {
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(java.lang.Long.valueOf(abstractC0074j.k()));
                if (abstractC0074j.c()) {
                    return;
                } else {
                    u2 = abstractC0074j.u();
                }
            } while (u2 == this.f2331b);
            this.f2333d = u2;
            return;
        }
        if (i2 != 2) {
            throw androidx.datastore.preferences.protobuf.A.b();
        }
        int v2 = abstractC0074j.v();
        if ((v2 & 7) != 0) {
            throw new androidx.datastore.preferences.protobuf.A("Failed to parse the message.");
        }
        int b2 = abstractC0074j.b() + v2;
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(java.lang.Long.valueOf(abstractC0074j.k()));
        } while (abstractC0074j.b() < b2);
    }

    public final void l(androidx.datastore.preferences.protobuf.InterfaceC0087x interfaceC0087x) {
        int u2;
        int i2 = this.f2331b & 7;
        androidx.datastore.preferences.protobuf.AbstractC0074j abstractC0074j = this.f2330a;
        if (i2 == 2) {
            int v2 = abstractC0074j.v();
            if ((v2 & 3) != 0) {
                throw new androidx.datastore.preferences.protobuf.A("Failed to parse the message.");
            }
            int b2 = abstractC0074j.b() + v2;
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(java.lang.Float.valueOf(abstractC0074j.l()));
            } while (abstractC0074j.b() < b2);
            return;
        }
        if (i2 != 5) {
            throw androidx.datastore.preferences.protobuf.A.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(java.lang.Float.valueOf(abstractC0074j.l()));
            if (abstractC0074j.c()) {
                return;
            } else {
                u2 = abstractC0074j.u();
            }
        } while (u2 == this.f2331b);
        this.f2333d = u2;
    }

    public final void m(androidx.datastore.preferences.protobuf.InterfaceC0087x interfaceC0087x) {
        int u2;
        int i2 = this.f2331b & 7;
        androidx.datastore.preferences.protobuf.AbstractC0074j abstractC0074j = this.f2330a;
        if (i2 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(java.lang.Integer.valueOf(abstractC0074j.m()));
                if (abstractC0074j.c()) {
                    return;
                } else {
                    u2 = abstractC0074j.u();
                }
            } while (u2 == this.f2331b);
            this.f2333d = u2;
            return;
        }
        if (i2 != 2) {
            throw androidx.datastore.preferences.protobuf.A.b();
        }
        int b2 = abstractC0074j.b() + abstractC0074j.v();
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(java.lang.Integer.valueOf(abstractC0074j.m()));
        } while (abstractC0074j.b() < b2);
        v(b2);
    }

    public final void n(androidx.datastore.preferences.protobuf.InterfaceC0087x interfaceC0087x) {
        int u2;
        int i2 = this.f2331b & 7;
        androidx.datastore.preferences.protobuf.AbstractC0074j abstractC0074j = this.f2330a;
        if (i2 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(java.lang.Long.valueOf(abstractC0074j.n()));
                if (abstractC0074j.c()) {
                    return;
                } else {
                    u2 = abstractC0074j.u();
                }
            } while (u2 == this.f2331b);
            this.f2333d = u2;
            return;
        }
        if (i2 != 2) {
            throw androidx.datastore.preferences.protobuf.A.b();
        }
        int b2 = abstractC0074j.b() + abstractC0074j.v();
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(java.lang.Long.valueOf(abstractC0074j.n()));
        } while (abstractC0074j.b() < b2);
        v(b2);
    }

    public final void o(androidx.datastore.preferences.protobuf.InterfaceC0087x interfaceC0087x) {
        int u2;
        int i2 = this.f2331b & 7;
        androidx.datastore.preferences.protobuf.AbstractC0074j abstractC0074j = this.f2330a;
        if (i2 == 2) {
            int v2 = abstractC0074j.v();
            if ((v2 & 3) != 0) {
                throw new androidx.datastore.preferences.protobuf.A("Failed to parse the message.");
            }
            int b2 = abstractC0074j.b() + v2;
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(java.lang.Integer.valueOf(abstractC0074j.o()));
            } while (abstractC0074j.b() < b2);
            return;
        }
        if (i2 != 5) {
            throw androidx.datastore.preferences.protobuf.A.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(java.lang.Integer.valueOf(abstractC0074j.o()));
            if (abstractC0074j.c()) {
                return;
            } else {
                u2 = abstractC0074j.u();
            }
        } while (u2 == this.f2331b);
        this.f2333d = u2;
    }

    public final void p(androidx.datastore.preferences.protobuf.InterfaceC0087x interfaceC0087x) {
        int u2;
        int i2 = this.f2331b & 7;
        androidx.datastore.preferences.protobuf.AbstractC0074j abstractC0074j = this.f2330a;
        if (i2 == 1) {
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(java.lang.Long.valueOf(abstractC0074j.p()));
                if (abstractC0074j.c()) {
                    return;
                } else {
                    u2 = abstractC0074j.u();
                }
            } while (u2 == this.f2331b);
            this.f2333d = u2;
            return;
        }
        if (i2 != 2) {
            throw androidx.datastore.preferences.protobuf.A.b();
        }
        int v2 = abstractC0074j.v();
        if ((v2 & 7) != 0) {
            throw new androidx.datastore.preferences.protobuf.A("Failed to parse the message.");
        }
        int b2 = abstractC0074j.b() + v2;
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(java.lang.Long.valueOf(abstractC0074j.p()));
        } while (abstractC0074j.b() < b2);
    }

    public final void q(androidx.datastore.preferences.protobuf.InterfaceC0087x interfaceC0087x) {
        int u2;
        int i2 = this.f2331b & 7;
        androidx.datastore.preferences.protobuf.AbstractC0074j abstractC0074j = this.f2330a;
        if (i2 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(java.lang.Integer.valueOf(abstractC0074j.q()));
                if (abstractC0074j.c()) {
                    return;
                } else {
                    u2 = abstractC0074j.u();
                }
            } while (u2 == this.f2331b);
            this.f2333d = u2;
            return;
        }
        if (i2 != 2) {
            throw androidx.datastore.preferences.protobuf.A.b();
        }
        int b2 = abstractC0074j.b() + abstractC0074j.v();
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(java.lang.Integer.valueOf(abstractC0074j.q()));
        } while (abstractC0074j.b() < b2);
        v(b2);
    }

    public final void r(androidx.datastore.preferences.protobuf.InterfaceC0087x interfaceC0087x) {
        int u2;
        int i2 = this.f2331b & 7;
        androidx.datastore.preferences.protobuf.AbstractC0074j abstractC0074j = this.f2330a;
        if (i2 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(java.lang.Long.valueOf(abstractC0074j.r()));
                if (abstractC0074j.c()) {
                    return;
                } else {
                    u2 = abstractC0074j.u();
                }
            } while (u2 == this.f2331b);
            this.f2333d = u2;
            return;
        }
        if (i2 != 2) {
            throw androidx.datastore.preferences.protobuf.A.b();
        }
        int b2 = abstractC0074j.b() + abstractC0074j.v();
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(java.lang.Long.valueOf(abstractC0074j.r()));
        } while (abstractC0074j.b() < b2);
        v(b2);
    }

    public final void s(androidx.datastore.preferences.protobuf.InterfaceC0087x interfaceC0087x, boolean z2) {
        java.lang.String s2;
        int u2;
        if ((this.f2331b & 7) != 2) {
            throw androidx.datastore.preferences.protobuf.A.b();
        }
        do {
            androidx.datastore.preferences.protobuf.AbstractC0074j abstractC0074j = this.f2330a;
            if (z2) {
                w(2);
                s2 = abstractC0074j.t();
            } else {
                w(2);
                s2 = abstractC0074j.s();
            }
            ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(s2);
            if (abstractC0074j.c()) {
                return;
            } else {
                u2 = abstractC0074j.u();
            }
        } while (u2 == this.f2331b);
        this.f2333d = u2;
    }

    public final void t(androidx.datastore.preferences.protobuf.InterfaceC0087x interfaceC0087x) {
        int u2;
        int i2 = this.f2331b & 7;
        androidx.datastore.preferences.protobuf.AbstractC0074j abstractC0074j = this.f2330a;
        if (i2 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(java.lang.Integer.valueOf(abstractC0074j.v()));
                if (abstractC0074j.c()) {
                    return;
                } else {
                    u2 = abstractC0074j.u();
                }
            } while (u2 == this.f2331b);
            this.f2333d = u2;
            return;
        }
        if (i2 != 2) {
            throw androidx.datastore.preferences.protobuf.A.b();
        }
        int b2 = abstractC0074j.b() + abstractC0074j.v();
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(java.lang.Integer.valueOf(abstractC0074j.v()));
        } while (abstractC0074j.b() < b2);
        v(b2);
    }

    public final void u(androidx.datastore.preferences.protobuf.InterfaceC0087x interfaceC0087x) {
        int u2;
        int i2 = this.f2331b & 7;
        androidx.datastore.preferences.protobuf.AbstractC0074j abstractC0074j = this.f2330a;
        if (i2 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(java.lang.Long.valueOf(abstractC0074j.w()));
                if (abstractC0074j.c()) {
                    return;
                } else {
                    u2 = abstractC0074j.u();
                }
            } while (u2 == this.f2331b);
            this.f2333d = u2;
            return;
        }
        if (i2 != 2) {
            throw androidx.datastore.preferences.protobuf.A.b();
        }
        int b2 = abstractC0074j.b() + abstractC0074j.v();
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0087x).add(java.lang.Long.valueOf(abstractC0074j.w()));
        } while (abstractC0074j.b() < b2);
        v(b2);
    }

    public final void v(int i2) {
        if (this.f2330a.b() != i2) {
            throw androidx.datastore.preferences.protobuf.A.e();
        }
    }

    public final void w(int i2) {
        if ((this.f2331b & 7) != i2) {
            throw androidx.datastore.preferences.protobuf.A.b();
        }
    }

    public final boolean x() {
        int i2;
        androidx.datastore.preferences.protobuf.AbstractC0074j abstractC0074j = this.f2330a;
        if (abstractC0074j.c() || (i2 = this.f2331b) == this.f2332c) {
            return false;
        }
        return abstractC0074j.x(i2);
    }
}
