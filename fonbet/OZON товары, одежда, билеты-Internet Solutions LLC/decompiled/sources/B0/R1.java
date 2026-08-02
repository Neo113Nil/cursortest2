package B0;

import k1.C7459e;
import k1.C7460f;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class R1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final K1.K f1503a;

    /* renamed from: b, reason: collision with root package name */
    private B1.B f1504b = null;

    /* renamed from: c, reason: collision with root package name */
    private B1.B f1505c;

    public R1(B1.B b11, K1.K k11) {
        this.f1503a = k11;
        this.f1505c = b11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r0 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long a(long j11) {
        C7460f c7460f;
        B1.B b11 = this.f1504b;
        if (b11 != null) {
            if (b11.I()) {
                B1.B b12 = this.f1505c;
                c7460f = b12 != null ? b12.K(b11, true) : null;
            } else {
                c7460f = C7460f.f70279e;
            }
        }
        c7460f = C7460f.f70279e;
        return S1.a(j11, c7460f);
    }

    public final B1.B b() {
        return this.f1505c;
    }

    public final B1.B c() {
        return this.f1504b;
    }

    public final int d(long j11, boolean z11) {
        if (z11) {
            j11 = a(j11);
        }
        return this.f1503a.w(i(j11));
    }

    @NotNull
    public final K1.K e() {
        return this.f1503a;
    }

    public final boolean f(long j11) {
        long i11 = i(a(j11));
        float h11 = C7459e.h(i11);
        K1.K k11 = this.f1503a;
        int q11 = k11.q(h11);
        return C7459e.g(i11) >= k11.r(q11) && C7459e.g(i11) <= k11.s(q11);
    }

    public final void g(B1.B b11) {
        this.f1505c = b11;
    }

    public final void h(B1.B b11) {
        this.f1504b = b11;
    }

    public final long i(long j11) {
        B1.B b11;
        B1.B b12 = this.f1504b;
        if (b12 == null) {
            return j11;
        }
        if (!b12.I()) {
            b12 = null;
        }
        if (b12 == null || (b11 = this.f1505c) == null) {
            return j11;
        }
        B1.B b13 = b11.I() ? b11 : null;
        return b13 == null ? j11 : b12.W(b13, j11);
    }

    public final long j(long j11) {
        B1.B b11;
        B1.B b12 = this.f1504b;
        if (b12 == null) {
            return j11;
        }
        if (!b12.I()) {
            b12 = null;
        }
        if (b12 == null || (b11 = this.f1505c) == null) {
            return j11;
        }
        B1.B b13 = b11.I() ? b11 : null;
        return b13 == null ? j11 : b13.W(b12, j11);
    }
}
