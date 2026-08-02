package E0;

import K1.C3422b;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2943q0 f7036a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final r f7037b = new r(null);

    /* renamed from: c, reason: collision with root package name */
    private int f7038c;

    /* renamed from: d, reason: collision with root package name */
    private int f7039d;

    /* renamed from: e, reason: collision with root package name */
    private Pair<D0.f, K1.Q> f7040e;

    /* renamed from: f, reason: collision with root package name */
    private int f7041f;

    /* renamed from: g, reason: collision with root package name */
    private int f7042g;

    public I(String str, long j11) {
        this.f7036a = new C2943q0(new C3422b(6, str, null).h());
        int i11 = K1.Q.f15010c;
        int i12 = (int) (j11 >> 32);
        this.f7038c = i12;
        int i13 = (int) (j11 & 4294967295L);
        this.f7039d = i13;
        this.f7041f = -1;
        this.f7042g = -1;
        a(i12, i13);
    }

    private final void a(int i11, int i12) {
        C2943q0 c2943q0 = this.f7036a;
        if (i11 < 0 || i11 > c2943q0.length()) {
            StringBuilder f7 = P4.f.f(i11, "start (", ") offset is outside of text region ");
            f7.append(c2943q0.length());
            throw new IndexOutOfBoundsException(f7.toString());
        }
        if (i12 < 0 || i12 > c2943q0.length()) {
            StringBuilder f11 = P4.f.f(i12, "end (", ") offset is outside of text region ");
            f11.append(c2943q0.length());
            throw new IndexOutOfBoundsException(f11.toString());
        }
    }

    private final void u(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException(Ej.b.a(i11, "Cannot set selectionEnd to a negative value: ").toString());
        }
        this.f7039d = i11;
        this.f7040e = null;
    }

    private final void v(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException(Ej.b.a(i11, "Cannot set selectionStart to a negative value: ").toString());
        }
        this.f7038c = i11;
        this.f7040e = null;
    }

    public final void b() {
        this.f7040e = null;
    }

    public final void c() {
        this.f7041f = -1;
        this.f7042g = -1;
    }

    public final void d(int i11, int i12) {
        a(i11, i12);
        long a11 = K1.S.a(i11, i12);
        this.f7037b.f(i11, i12, 0);
        this.f7036a.a(K1.Q.h(a11), K1.Q.g(a11), 0, "");
        long b11 = J.b(K1.S.a(this.f7038c, this.f7039d), a11);
        v((int) (b11 >> 32));
        u((int) (b11 & 4294967295L));
        if (p()) {
            long b12 = J.b(K1.S.a(this.f7041f, this.f7042g), a11);
            if (K1.Q.e(b12)) {
                c();
            } else {
                this.f7041f = K1.Q.h(b12);
                this.f7042g = K1.Q.g(b12);
            }
        }
        this.f7040e = null;
    }

    public final char e(int i11) {
        return this.f7036a.charAt(i11);
    }

    @NotNull
    public final r f() {
        return this.f7037b;
    }

    public final K1.Q g() {
        if (p()) {
            return K1.Q.b(K1.S.a(this.f7041f, this.f7042g));
        }
        return null;
    }

    public final int h() {
        return this.f7042g;
    }

    public final int i() {
        return this.f7041f;
    }

    public final int j() {
        int i11 = this.f7038c;
        int i12 = this.f7039d;
        if (i11 == i12) {
            return i12;
        }
        return -1;
    }

    public final Pair<D0.f, K1.Q> k() {
        return this.f7040e;
    }

    public final int l() {
        return this.f7036a.length();
    }

    public final long m() {
        return K1.S.a(this.f7038c, this.f7039d);
    }

    public final int n() {
        return this.f7039d;
    }

    public final int o() {
        return this.f7038c;
    }

    public final boolean p() {
        return this.f7041f != -1;
    }

    public final void q(int i11, int i12, @NotNull CharSequence charSequence) {
        C2943q0 c2943q0;
        a(i11, i12);
        int min = Math.min(i11, i12);
        int max = Math.max(i11, i12);
        int i13 = 0;
        int i14 = min;
        while (true) {
            c2943q0 = this.f7036a;
            if (i14 >= max || i13 >= charSequence.length() || charSequence.charAt(i13) != c2943q0.charAt(i14)) {
                break;
            }
            i13++;
            i14++;
        }
        int length = charSequence.length();
        int i15 = max;
        while (i15 > min && length > i13 && charSequence.charAt(length - 1) == c2943q0.charAt(i15 - 1)) {
            length--;
            i15--;
        }
        this.f7037b.f(i14, i15, length - i13);
        c2943q0.a(min, max, charSequence.length(), charSequence);
        v(charSequence.length() + min);
        u(charSequence.length() + min);
        this.f7041f = -1;
        this.f7042g = -1;
        this.f7040e = null;
    }

    public final void r(int i11, int i12) {
        C2943q0 c2943q0 = this.f7036a;
        if (i11 < 0 || i11 > c2943q0.length()) {
            StringBuilder f7 = P4.f.f(i11, "start (", ") offset is outside of text region ");
            f7.append(c2943q0.length());
            throw new IndexOutOfBoundsException(f7.toString());
        }
        if (i12 < 0 || i12 > c2943q0.length()) {
            StringBuilder f11 = P4.f.f(i12, "end (", ") offset is outside of text region ");
            f11.append(c2943q0.length());
            throw new IndexOutOfBoundsException(f11.toString());
        }
        if (i11 >= i12) {
            throw new IllegalArgumentException(B0.A0.a(i11, i12, "Do not set reversed or empty range: ", " > "));
        }
        this.f7041f = i11;
        this.f7042g = i12;
    }

    public final void s(int i11, int i12, int i13) {
        if (i12 >= i13) {
            throw new IllegalArgumentException(B0.A0.a(i12, i13, "Do not set reversed or empty range: ", " > "));
        }
        C2943q0 c2943q0 = this.f7036a;
        this.f7040e = new Pair<>(D0.f.a(i11), K1.Q.b(K1.S.a(kotlin.ranges.h.e(i12, 0, c2943q0.length()), kotlin.ranges.h.e(i13, 0, c2943q0.length()))));
    }

    public final void t(int i11, int i12) {
        C2943q0 c2943q0 = this.f7036a;
        int e11 = kotlin.ranges.h.e(i11, 0, c2943q0.length());
        int e12 = kotlin.ranges.h.e(i12, 0, c2943q0.length());
        v(e11);
        u(e12);
    }

    @NotNull
    public final String toString() {
        return this.f7036a.toString();
    }
}
