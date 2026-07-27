package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136k {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0135j f2257a;

    /* renamed from: b, reason: collision with root package name */
    public int f2258b;

    /* renamed from: c, reason: collision with root package name */
    public int f2259c;

    /* renamed from: d, reason: collision with root package name */
    public int f2260d = 0;

    public C0136k(AbstractC0135j abstractC0135j) {
        Charset charset = AbstractC0149y.f2300a;
        this.f2257a = abstractC0135j;
        abstractC0135j.f2250b = this;
    }

    public final int a() {
        int i3 = this.f2260d;
        if (i3 != 0) {
            this.f2258b = i3;
            this.f2260d = 0;
        } else {
            this.f2258b = this.f2257a.u();
        }
        int i4 = this.f2258b;
        if (i4 == 0 || i4 == this.f2259c) {
            return Integer.MAX_VALUE;
        }
        return i4 >>> 3;
    }

    public final void b(Object obj, W w3, C0140o c0140o) {
        int i3 = this.f2259c;
        this.f2259c = ((this.f2258b >>> 3) << 3) | 4;
        try {
            w3.g(obj, this, c0140o);
            if (this.f2258b == this.f2259c) {
            } else {
                throw new A("Failed to parse the message.");
            }
        } finally {
            this.f2259c = i3;
        }
    }

    public final void c(Object obj, W w3, C0140o c0140o) {
        AbstractC0135j abstractC0135j = this.f2257a;
        int v3 = abstractC0135j.v();
        if (abstractC0135j.f2249a >= 100) {
            throw new A("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int e3 = abstractC0135j.e(v3);
        abstractC0135j.f2249a++;
        w3.g(obj, this, c0140o);
        abstractC0135j.a(0);
        abstractC0135j.f2249a--;
        abstractC0135j.d(e3);
    }

    public final void d(InterfaceC0148x interfaceC0148x) {
        int u3;
        int i3 = this.f2258b & 7;
        AbstractC0135j abstractC0135j = this.f2257a;
        if (i3 == 0) {
            do {
                ((U) interfaceC0148x).add(Boolean.valueOf(abstractC0135j.f()));
                if (abstractC0135j.c()) {
                    return;
                } else {
                    u3 = abstractC0135j.u();
                }
            } while (u3 == this.f2258b);
            this.f2260d = u3;
            return;
        }
        if (i3 != 2) {
            throw A.b();
        }
        int b3 = abstractC0135j.b() + abstractC0135j.v();
        do {
            ((U) interfaceC0148x).add(Boolean.valueOf(abstractC0135j.f()));
        } while (abstractC0135j.b() < b3);
        v(b3);
    }

    public final C0132g e() {
        w(2);
        return this.f2257a.g();
    }

    public final void f(InterfaceC0148x interfaceC0148x) {
        int u3;
        if ((this.f2258b & 7) != 2) {
            throw A.b();
        }
        do {
            ((U) interfaceC0148x).add(e());
            AbstractC0135j abstractC0135j = this.f2257a;
            if (abstractC0135j.c()) {
                return;
            } else {
                u3 = abstractC0135j.u();
            }
        } while (u3 == this.f2258b);
        this.f2260d = u3;
    }

    public final void g(InterfaceC0148x interfaceC0148x) {
        int u3;
        int i3 = this.f2258b & 7;
        AbstractC0135j abstractC0135j = this.f2257a;
        if (i3 == 1) {
            do {
                ((U) interfaceC0148x).add(Double.valueOf(abstractC0135j.h()));
                if (abstractC0135j.c()) {
                    return;
                } else {
                    u3 = abstractC0135j.u();
                }
            } while (u3 == this.f2258b);
            this.f2260d = u3;
            return;
        }
        if (i3 != 2) {
            throw A.b();
        }
        int v3 = abstractC0135j.v();
        if ((v3 & 7) != 0) {
            throw new A("Failed to parse the message.");
        }
        int b3 = abstractC0135j.b() + v3;
        do {
            ((U) interfaceC0148x).add(Double.valueOf(abstractC0135j.h()));
        } while (abstractC0135j.b() < b3);
    }

    public final void h(InterfaceC0148x interfaceC0148x) {
        int u3;
        int i3 = this.f2258b & 7;
        AbstractC0135j abstractC0135j = this.f2257a;
        if (i3 == 0) {
            do {
                ((U) interfaceC0148x).add(Integer.valueOf(abstractC0135j.i()));
                if (abstractC0135j.c()) {
                    return;
                } else {
                    u3 = abstractC0135j.u();
                }
            } while (u3 == this.f2258b);
            this.f2260d = u3;
            return;
        }
        if (i3 != 2) {
            throw A.b();
        }
        int b3 = abstractC0135j.b() + abstractC0135j.v();
        do {
            ((U) interfaceC0148x).add(Integer.valueOf(abstractC0135j.i()));
        } while (abstractC0135j.b() < b3);
        v(b3);
    }

    public final Object i(r0 r0Var, Class cls, C0140o c0140o) {
        int ordinal = r0Var.ordinal();
        AbstractC0135j abstractC0135j = this.f2257a;
        switch (ordinal) {
            case 0:
                w(1);
                return Double.valueOf(abstractC0135j.h());
            case 1:
                w(5);
                return Float.valueOf(abstractC0135j.l());
            case 2:
                w(0);
                return Long.valueOf(abstractC0135j.n());
            case 3:
                w(0);
                return Long.valueOf(abstractC0135j.w());
            case 4:
                w(0);
                return Integer.valueOf(abstractC0135j.m());
            case 5:
                w(1);
                return Long.valueOf(abstractC0135j.k());
            case 6:
                w(5);
                return Integer.valueOf(abstractC0135j.j());
            case 7:
                w(0);
                return Boolean.valueOf(abstractC0135j.f());
            case 8:
                w(2);
                return abstractC0135j.t();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                w(2);
                W a3 = T.f2190c.a(cls);
                AbstractC0147w newInstance = a3.newInstance();
                c(newInstance, a3, c0140o);
                a3.d(newInstance);
                return newInstance;
            case 11:
                return e();
            case 12:
                w(0);
                return Integer.valueOf(abstractC0135j.v());
            case 13:
                w(0);
                return Integer.valueOf(abstractC0135j.i());
            case 14:
                w(5);
                return Integer.valueOf(abstractC0135j.o());
            case 15:
                w(1);
                return Long.valueOf(abstractC0135j.p());
            case 16:
                w(0);
                return Integer.valueOf(abstractC0135j.q());
            case 17:
                w(0);
                return Long.valueOf(abstractC0135j.r());
        }
    }

    public final void j(InterfaceC0148x interfaceC0148x) {
        int u3;
        int i3 = this.f2258b & 7;
        AbstractC0135j abstractC0135j = this.f2257a;
        if (i3 == 2) {
            int v3 = abstractC0135j.v();
            if ((v3 & 3) != 0) {
                throw new A("Failed to parse the message.");
            }
            int b3 = abstractC0135j.b() + v3;
            do {
                ((U) interfaceC0148x).add(Integer.valueOf(abstractC0135j.j()));
            } while (abstractC0135j.b() < b3);
            return;
        }
        if (i3 != 5) {
            throw A.b();
        }
        do {
            ((U) interfaceC0148x).add(Integer.valueOf(abstractC0135j.j()));
            if (abstractC0135j.c()) {
                return;
            } else {
                u3 = abstractC0135j.u();
            }
        } while (u3 == this.f2258b);
        this.f2260d = u3;
    }

    public final void k(InterfaceC0148x interfaceC0148x) {
        int u3;
        int i3 = this.f2258b & 7;
        AbstractC0135j abstractC0135j = this.f2257a;
        if (i3 == 1) {
            do {
                ((U) interfaceC0148x).add(Long.valueOf(abstractC0135j.k()));
                if (abstractC0135j.c()) {
                    return;
                } else {
                    u3 = abstractC0135j.u();
                }
            } while (u3 == this.f2258b);
            this.f2260d = u3;
            return;
        }
        if (i3 != 2) {
            throw A.b();
        }
        int v3 = abstractC0135j.v();
        if ((v3 & 7) != 0) {
            throw new A("Failed to parse the message.");
        }
        int b3 = abstractC0135j.b() + v3;
        do {
            ((U) interfaceC0148x).add(Long.valueOf(abstractC0135j.k()));
        } while (abstractC0135j.b() < b3);
    }

    public final void l(InterfaceC0148x interfaceC0148x) {
        int u3;
        int i3 = this.f2258b & 7;
        AbstractC0135j abstractC0135j = this.f2257a;
        if (i3 == 2) {
            int v3 = abstractC0135j.v();
            if ((v3 & 3) != 0) {
                throw new A("Failed to parse the message.");
            }
            int b3 = abstractC0135j.b() + v3;
            do {
                ((U) interfaceC0148x).add(Float.valueOf(abstractC0135j.l()));
            } while (abstractC0135j.b() < b3);
            return;
        }
        if (i3 != 5) {
            throw A.b();
        }
        do {
            ((U) interfaceC0148x).add(Float.valueOf(abstractC0135j.l()));
            if (abstractC0135j.c()) {
                return;
            } else {
                u3 = abstractC0135j.u();
            }
        } while (u3 == this.f2258b);
        this.f2260d = u3;
    }

    public final void m(InterfaceC0148x interfaceC0148x) {
        int u3;
        int i3 = this.f2258b & 7;
        AbstractC0135j abstractC0135j = this.f2257a;
        if (i3 == 0) {
            do {
                ((U) interfaceC0148x).add(Integer.valueOf(abstractC0135j.m()));
                if (abstractC0135j.c()) {
                    return;
                } else {
                    u3 = abstractC0135j.u();
                }
            } while (u3 == this.f2258b);
            this.f2260d = u3;
            return;
        }
        if (i3 != 2) {
            throw A.b();
        }
        int b3 = abstractC0135j.b() + abstractC0135j.v();
        do {
            ((U) interfaceC0148x).add(Integer.valueOf(abstractC0135j.m()));
        } while (abstractC0135j.b() < b3);
        v(b3);
    }

    public final void n(InterfaceC0148x interfaceC0148x) {
        int u3;
        int i3 = this.f2258b & 7;
        AbstractC0135j abstractC0135j = this.f2257a;
        if (i3 == 0) {
            do {
                ((U) interfaceC0148x).add(Long.valueOf(abstractC0135j.n()));
                if (abstractC0135j.c()) {
                    return;
                } else {
                    u3 = abstractC0135j.u();
                }
            } while (u3 == this.f2258b);
            this.f2260d = u3;
            return;
        }
        if (i3 != 2) {
            throw A.b();
        }
        int b3 = abstractC0135j.b() + abstractC0135j.v();
        do {
            ((U) interfaceC0148x).add(Long.valueOf(abstractC0135j.n()));
        } while (abstractC0135j.b() < b3);
        v(b3);
    }

    public final void o(InterfaceC0148x interfaceC0148x) {
        int u3;
        int i3 = this.f2258b & 7;
        AbstractC0135j abstractC0135j = this.f2257a;
        if (i3 == 2) {
            int v3 = abstractC0135j.v();
            if ((v3 & 3) != 0) {
                throw new A("Failed to parse the message.");
            }
            int b3 = abstractC0135j.b() + v3;
            do {
                ((U) interfaceC0148x).add(Integer.valueOf(abstractC0135j.o()));
            } while (abstractC0135j.b() < b3);
            return;
        }
        if (i3 != 5) {
            throw A.b();
        }
        do {
            ((U) interfaceC0148x).add(Integer.valueOf(abstractC0135j.o()));
            if (abstractC0135j.c()) {
                return;
            } else {
                u3 = abstractC0135j.u();
            }
        } while (u3 == this.f2258b);
        this.f2260d = u3;
    }

    public final void p(InterfaceC0148x interfaceC0148x) {
        int u3;
        int i3 = this.f2258b & 7;
        AbstractC0135j abstractC0135j = this.f2257a;
        if (i3 == 1) {
            do {
                ((U) interfaceC0148x).add(Long.valueOf(abstractC0135j.p()));
                if (abstractC0135j.c()) {
                    return;
                } else {
                    u3 = abstractC0135j.u();
                }
            } while (u3 == this.f2258b);
            this.f2260d = u3;
            return;
        }
        if (i3 != 2) {
            throw A.b();
        }
        int v3 = abstractC0135j.v();
        if ((v3 & 7) != 0) {
            throw new A("Failed to parse the message.");
        }
        int b3 = abstractC0135j.b() + v3;
        do {
            ((U) interfaceC0148x).add(Long.valueOf(abstractC0135j.p()));
        } while (abstractC0135j.b() < b3);
    }

    public final void q(InterfaceC0148x interfaceC0148x) {
        int u3;
        int i3 = this.f2258b & 7;
        AbstractC0135j abstractC0135j = this.f2257a;
        if (i3 == 0) {
            do {
                ((U) interfaceC0148x).add(Integer.valueOf(abstractC0135j.q()));
                if (abstractC0135j.c()) {
                    return;
                } else {
                    u3 = abstractC0135j.u();
                }
            } while (u3 == this.f2258b);
            this.f2260d = u3;
            return;
        }
        if (i3 != 2) {
            throw A.b();
        }
        int b3 = abstractC0135j.b() + abstractC0135j.v();
        do {
            ((U) interfaceC0148x).add(Integer.valueOf(abstractC0135j.q()));
        } while (abstractC0135j.b() < b3);
        v(b3);
    }

    public final void r(InterfaceC0148x interfaceC0148x) {
        int u3;
        int i3 = this.f2258b & 7;
        AbstractC0135j abstractC0135j = this.f2257a;
        if (i3 == 0) {
            do {
                ((U) interfaceC0148x).add(Long.valueOf(abstractC0135j.r()));
                if (abstractC0135j.c()) {
                    return;
                } else {
                    u3 = abstractC0135j.u();
                }
            } while (u3 == this.f2258b);
            this.f2260d = u3;
            return;
        }
        if (i3 != 2) {
            throw A.b();
        }
        int b3 = abstractC0135j.b() + abstractC0135j.v();
        do {
            ((U) interfaceC0148x).add(Long.valueOf(abstractC0135j.r()));
        } while (abstractC0135j.b() < b3);
        v(b3);
    }

    public final void s(InterfaceC0148x interfaceC0148x, boolean z3) {
        String s3;
        int u3;
        if ((this.f2258b & 7) != 2) {
            throw A.b();
        }
        do {
            AbstractC0135j abstractC0135j = this.f2257a;
            if (z3) {
                w(2);
                s3 = abstractC0135j.t();
            } else {
                w(2);
                s3 = abstractC0135j.s();
            }
            ((U) interfaceC0148x).add(s3);
            if (abstractC0135j.c()) {
                return;
            } else {
                u3 = abstractC0135j.u();
            }
        } while (u3 == this.f2258b);
        this.f2260d = u3;
    }

    public final void t(InterfaceC0148x interfaceC0148x) {
        int u3;
        int i3 = this.f2258b & 7;
        AbstractC0135j abstractC0135j = this.f2257a;
        if (i3 == 0) {
            do {
                ((U) interfaceC0148x).add(Integer.valueOf(abstractC0135j.v()));
                if (abstractC0135j.c()) {
                    return;
                } else {
                    u3 = abstractC0135j.u();
                }
            } while (u3 == this.f2258b);
            this.f2260d = u3;
            return;
        }
        if (i3 != 2) {
            throw A.b();
        }
        int b3 = abstractC0135j.b() + abstractC0135j.v();
        do {
            ((U) interfaceC0148x).add(Integer.valueOf(abstractC0135j.v()));
        } while (abstractC0135j.b() < b3);
        v(b3);
    }

    public final void u(InterfaceC0148x interfaceC0148x) {
        int u3;
        int i3 = this.f2258b & 7;
        AbstractC0135j abstractC0135j = this.f2257a;
        if (i3 == 0) {
            do {
                ((U) interfaceC0148x).add(Long.valueOf(abstractC0135j.w()));
                if (abstractC0135j.c()) {
                    return;
                } else {
                    u3 = abstractC0135j.u();
                }
            } while (u3 == this.f2258b);
            this.f2260d = u3;
            return;
        }
        if (i3 != 2) {
            throw A.b();
        }
        int b3 = abstractC0135j.b() + abstractC0135j.v();
        do {
            ((U) interfaceC0148x).add(Long.valueOf(abstractC0135j.w()));
        } while (abstractC0135j.b() < b3);
        v(b3);
    }

    public final void v(int i3) {
        if (this.f2257a.b() != i3) {
            throw A.e();
        }
    }

    public final void w(int i3) {
        if ((this.f2258b & 7) != i3) {
            throw A.b();
        }
    }

    public final boolean x() {
        int i3;
        AbstractC0135j abstractC0135j = this.f2257a;
        if (abstractC0135j.c() || (i3 = this.f2258b) == this.f2259c) {
            return false;
        }
        return abstractC0135j.x(i3);
    }
}
