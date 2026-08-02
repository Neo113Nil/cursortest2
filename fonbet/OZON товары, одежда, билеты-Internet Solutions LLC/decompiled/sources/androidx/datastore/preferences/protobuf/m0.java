package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
abstract class m0<T, B> {
    m0() {
    }

    abstract void a(B b11, int i11, int i12);

    abstract void b(B b11, int i11, long j11);

    abstract void c(B b11, int i11, T t2);

    abstract void d(B b11, int i11, AbstractC5362h abstractC5362h);

    abstract void e(B b11, int i11, long j11);

    abstract n0 f(Object obj);

    abstract n0 g(Object obj);

    abstract int h(T t2);

    abstract int i(T t2);

    abstract void j(Object obj);

    abstract n0 k(Object obj, Object obj2);

    final boolean l(int i11, C5364j c5364j, Object obj) throws IOException {
        int c11 = c5364j.c();
        int i12 = c11 >>> 3;
        int i13 = c11 & 7;
        if (i13 == 0) {
            e(obj, i12, c5364j.z());
            return true;
        }
        if (i13 == 1) {
            b(obj, i12, c5364j.s());
            return true;
        }
        if (i13 == 2) {
            d(obj, i12, c5364j.j());
            return true;
        }
        if (i13 != 3) {
            if (i13 == 4) {
                return false;
            }
            if (i13 != 5) {
                throw C5379z.d();
            }
            a(obj, i12, c5364j.q());
            return true;
        }
        n0 m11 = m();
        int i14 = (i12 << 3) | 4;
        int i15 = i11 + 1;
        if (i15 >= 100) {
            throw new C5379z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c5364j.b() != Integer.MAX_VALUE && l(i15, c5364j, m11)) {
        }
        if (i14 != c5364j.c()) {
            throw new C5379z("Protocol message end-group tag did not match expected tag.");
        }
        c(obj, i12, p(m11));
        return true;
    }

    abstract n0 m();

    abstract void n(Object obj, B b11);

    abstract void o(Object obj, T t2);

    abstract n0 p(Object obj);

    abstract void q(T t2, t0 t0Var) throws IOException;

    abstract void r(T t2, t0 t0Var) throws IOException;
}
