package Q1;

import B0.A0;
import K1.C3422b;
import org.jetbrains.annotations.NotNull;

/* renamed from: Q1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3844m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final E f22898a;

    /* renamed from: b, reason: collision with root package name */
    private int f22899b;

    /* renamed from: c, reason: collision with root package name */
    private int f22900c;

    /* renamed from: d, reason: collision with root package name */
    private int f22901d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f22902e = -1;

    public C3844m(C3422b c3422b, long j11) {
        this.f22898a = new E(c3422b.h());
        this.f22899b = K1.Q.h(j11);
        this.f22900c = K1.Q.g(j11);
        int h11 = K1.Q.h(j11);
        int g10 = K1.Q.g(j11);
        if (h11 < 0 || h11 > c3422b.length()) {
            StringBuilder f7 = P4.f.f(h11, "start (", ") offset is outside of text region ");
            f7.append(c3422b.length());
            throw new IndexOutOfBoundsException(f7.toString());
        }
        if (g10 < 0 || g10 > c3422b.length()) {
            StringBuilder f11 = P4.f.f(g10, "end (", ") offset is outside of text region ");
            f11.append(c3422b.length());
            throw new IndexOutOfBoundsException(f11.toString());
        }
        if (h11 > g10) {
            throw new IllegalArgumentException(A0.a(h11, g10, "Do not set reversed range: ", " > "));
        }
    }

    private final void p(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException(Ej.b.a(i11, "Cannot set selectionEnd to a negative value: ").toString());
        }
        this.f22900c = i11;
    }

    private final void q(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException(Ej.b.a(i11, "Cannot set selectionStart to a negative value: ").toString());
        }
        this.f22899b = i11;
    }

    public final void a() {
        this.f22901d = -1;
        this.f22902e = -1;
    }

    public final void b(int i11, int i12) {
        long a11 = K1.S.a(i11, i12);
        this.f22898a.c(i11, i12, "");
        long b11 = H5.h.b(K1.S.a(this.f22899b, this.f22900c), a11);
        q(K1.Q.h(b11));
        p(K1.Q.g(b11));
        if (l()) {
            long b12 = H5.h.b(K1.S.a(this.f22901d, this.f22902e), a11);
            if (K1.Q.e(b12)) {
                a();
            } else {
                this.f22901d = K1.Q.h(b12);
                this.f22902e = K1.Q.g(b12);
            }
        }
    }

    public final char c(int i11) {
        return this.f22898a.a(i11);
    }

    public final K1.Q d() {
        if (l()) {
            return K1.Q.b(K1.S.a(this.f22901d, this.f22902e));
        }
        return null;
    }

    public final int e() {
        return this.f22902e;
    }

    public final int f() {
        return this.f22901d;
    }

    public final int g() {
        int i11 = this.f22899b;
        int i12 = this.f22900c;
        if (i11 == i12) {
            return i12;
        }
        return -1;
    }

    public final int h() {
        return this.f22898a.b();
    }

    public final long i() {
        return K1.S.a(this.f22899b, this.f22900c);
    }

    public final int j() {
        return this.f22900c;
    }

    public final int k() {
        return this.f22899b;
    }

    public final boolean l() {
        return this.f22901d != -1;
    }

    public final void m(int i11, int i12, @NotNull String str) {
        E e11 = this.f22898a;
        if (i11 < 0 || i11 > e11.b()) {
            StringBuilder f7 = P4.f.f(i11, "start (", ") offset is outside of text region ");
            f7.append(e11.b());
            throw new IndexOutOfBoundsException(f7.toString());
        }
        if (i12 < 0 || i12 > e11.b()) {
            StringBuilder f11 = P4.f.f(i12, "end (", ") offset is outside of text region ");
            f11.append(e11.b());
            throw new IndexOutOfBoundsException(f11.toString());
        }
        if (i11 > i12) {
            throw new IllegalArgumentException(A0.a(i11, i12, "Do not set reversed range: ", " > "));
        }
        e11.c(i11, i12, str);
        q(str.length() + i11);
        p(str.length() + i11);
        this.f22901d = -1;
        this.f22902e = -1;
    }

    public final void n(int i11, int i12) {
        E e11 = this.f22898a;
        if (i11 < 0 || i11 > e11.b()) {
            StringBuilder f7 = P4.f.f(i11, "start (", ") offset is outside of text region ");
            f7.append(e11.b());
            throw new IndexOutOfBoundsException(f7.toString());
        }
        if (i12 < 0 || i12 > e11.b()) {
            StringBuilder f11 = P4.f.f(i12, "end (", ") offset is outside of text region ");
            f11.append(e11.b());
            throw new IndexOutOfBoundsException(f11.toString());
        }
        if (i11 >= i12) {
            throw new IllegalArgumentException(A0.a(i11, i12, "Do not set reversed or empty range: ", " > "));
        }
        this.f22901d = i11;
        this.f22902e = i12;
    }

    public final void o(int i11, int i12) {
        E e11 = this.f22898a;
        if (i11 < 0 || i11 > e11.b()) {
            StringBuilder f7 = P4.f.f(i11, "start (", ") offset is outside of text region ");
            f7.append(e11.b());
            throw new IndexOutOfBoundsException(f7.toString());
        }
        if (i12 < 0 || i12 > e11.b()) {
            StringBuilder f11 = P4.f.f(i12, "end (", ") offset is outside of text region ");
            f11.append(e11.b());
            throw new IndexOutOfBoundsException(f11.toString());
        }
        if (i11 > i12) {
            throw new IllegalArgumentException(A0.a(i11, i12, "Do not set reversed range: ", " > "));
        }
        q(i11);
        p(i12);
    }

    @NotNull
    public final C3422b r() {
        return new C3422b(6, this.f22898a.toString(), null);
    }

    @NotNull
    public final String toString() {
        return this.f22898a.toString();
    }
}
