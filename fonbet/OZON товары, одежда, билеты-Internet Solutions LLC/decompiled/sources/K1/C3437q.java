package K1;

import B0.C2454a;
import k1.C7459e;
import k1.C7460f;
import l1.s0;
import org.jetbrains.annotations.NotNull;

/* renamed from: K1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3437q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3421a f15080a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15081b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15082c;

    /* renamed from: d, reason: collision with root package name */
    private int f15083d;

    /* renamed from: e, reason: collision with root package name */
    private int f15084e;

    /* renamed from: f, reason: collision with root package name */
    private float f15085f;

    /* renamed from: g, reason: collision with root package name */
    private float f15086g;

    public C3437q(@NotNull C3421a c3421a, int i11, int i12, int i13, int i14, float f7, float f11) {
        this.f15080a = c3421a;
        this.f15081b = i11;
        this.f15082c = i12;
        this.f15083d = i13;
        this.f15084e = i14;
        this.f15085f = f7;
        this.f15086g = f11;
    }

    public final float a() {
        return this.f15086g;
    }

    public final int b() {
        return this.f15082c;
    }

    public final int c() {
        return this.f15084e;
    }

    public final int d() {
        return this.f15082c - this.f15081b;
    }

    @NotNull
    public final InterfaceC3436p e() {
        return this.f15080a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3437q)) {
            return false;
        }
        C3437q c3437q = (C3437q) obj;
        return this.f15080a.equals(c3437q.f15080a) && this.f15081b == c3437q.f15081b && this.f15082c == c3437q.f15082c && this.f15083d == c3437q.f15083d && this.f15084e == c3437q.f15084e && Float.compare(this.f15085f, c3437q.f15085f) == 0 && Float.compare(this.f15086g, c3437q.f15086g) == 0;
    }

    public final int f() {
        return this.f15081b;
    }

    public final int g() {
        return this.f15083d;
    }

    public final float h() {
        return this.f15085f;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15086g) + Pk0.b.a(this.f15085f, C2454a.a(this.f15084e, C2454a.a(this.f15083d, C2454a.a(this.f15082c, C2454a.a(this.f15081b, this.f15080a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    @NotNull
    public final C7460f i(@NotNull C7460f c7460f) {
        return c7460f.A(P9.a.a(0.0f, this.f15085f));
    }

    @NotNull
    public final void j(@NotNull s0 s0Var) {
        s0Var.i(P9.a.a(0.0f, this.f15085f));
    }

    public final long k(long j11, boolean z11) {
        long j12;
        long j13;
        if (z11) {
            j12 = Q.f15009b;
            if (Q.d(j11, j12)) {
                j13 = Q.f15009b;
                return j13;
            }
        }
        int i11 = Q.f15010c;
        int i12 = (int) (j11 >> 32);
        int i13 = this.f15081b;
        return S.a(i12 + i13, ((int) (j11 & 4294967295L)) + i13);
    }

    public final int l(int i11) {
        return i11 + this.f15081b;
    }

    public final int m(int i11) {
        return i11 + this.f15083d;
    }

    public final float n(float f7) {
        return f7 + this.f15085f;
    }

    @NotNull
    public final C7460f o(@NotNull C7460f c7460f) {
        return c7460f.A(P9.a.a(0.0f, -this.f15085f));
    }

    public final long p(long j11) {
        return P9.a.a(C7459e.g(j11), C7459e.h(j11) - this.f15085f);
    }

    public final int q(int i11) {
        int i12 = this.f15082c;
        int i13 = this.f15081b;
        return kotlin.ranges.h.e(i11, i13, i12) - i13;
    }

    public final int r(int i11) {
        return i11 - this.f15083d;
    }

    public final float s(float f7) {
        return f7 - this.f15085f;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphInfo(paragraph=");
        sb2.append(this.f15080a);
        sb2.append(", startIndex=");
        sb2.append(this.f15081b);
        sb2.append(", endIndex=");
        sb2.append(this.f15082c);
        sb2.append(", startLineIndex=");
        sb2.append(this.f15083d);
        sb2.append(", endLineIndex=");
        sb2.append(this.f15084e);
        sb2.append(", top=");
        sb2.append(this.f15085f);
        sb2.append(", bottom=");
        return F3.G.a(sb2, this.f15086g, ')');
    }
}
