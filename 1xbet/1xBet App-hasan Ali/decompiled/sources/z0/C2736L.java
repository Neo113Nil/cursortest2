package z0;

import java.util.Arrays;
import n.C2145o;
import x0.C2630p;

/* renamed from: z0.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2736L implements W0.c {

    /* renamed from: k, reason: collision with root package name */
    public boolean f21665k;

    /* renamed from: l, reason: collision with root package name */
    public long f21666l = 9223372034707292159L;

    /* renamed from: m, reason: collision with root package name */
    public long f21667m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC2739O f21668n;

    public C2736L(AbstractC2739O abstractC2739O) {
        this.f21668n = abstractC2739O;
    }

    @Override // W0.c
    public final /* synthetic */ float D(long j5) {
        return L1.a.c(j5, this);
    }

    @Override // W0.c
    public final /* synthetic */ int K(float f) {
        return L1.a.b(f, this);
    }

    @Override // W0.c
    public final /* synthetic */ long S(long j5) {
        return L1.a.f(j5, this);
    }

    @Override // W0.c
    public final /* synthetic */ float V(long j5) {
        return L1.a.e(j5, this);
    }

    public final void a(C2630p c2630p, float f) {
        AbstractC2739O abstractC2739O = this.f21668n;
        C2145o c2145o = abstractC2739O.f21685w;
        if (c2145o == null) {
            c2145o = new C2145o();
            abstractC2739O.f21685w = c2145o;
        }
        int G02 = X3.l.G0((C2630p[]) c2145o.f18295b, c2630p);
        if (G02 >= 0) {
            float[] fArr = (float[]) c2145o.f18296c;
            if (fArr[G02] != f) {
                fArr[G02] = f;
                ((byte[]) c2145o.f18297d)[G02] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) c2145o.f18297d;
                if (bArr[G02] == 2) {
                    bArr[G02] = 0;
                    return;
                }
                return;
            }
        }
        int i = c2145o.f18294a;
        C2630p[] c2630pArr = (C2630p[]) c2145o.f18295b;
        if (i == c2630pArr.length) {
            int i5 = i * 2;
            Object[] copyOf = Arrays.copyOf(c2630pArr, i5);
            kotlin.jvm.internal.l.e("copyOf(...)", copyOf);
            c2145o.f18295b = (C2630p[]) copyOf;
            float[] copyOf2 = Arrays.copyOf((float[]) c2145o.f18296c, i5);
            kotlin.jvm.internal.l.e("copyOf(...)", copyOf2);
            c2145o.f18296c = copyOf2;
            byte[] copyOf3 = Arrays.copyOf((byte[]) c2145o.f18297d, i5);
            kotlin.jvm.internal.l.e("copyOf(...)", copyOf3);
            c2145o.f18297d = copyOf3;
        }
        ((C2630p[]) c2145o.f18295b)[i] = c2630p;
        ((byte[]) c2145o.f18297d)[i] = 3;
        ((float[]) c2145o.f18296c)[i] = f;
        c2145o.f18294a++;
    }

    @Override // W0.c
    public final long b0(float f) {
        return L1.a.g(i0(f), this);
    }

    @Override // W0.c
    public final float c() {
        return this.f21668n.c();
    }

    @Override // W0.c
    public final float h0(int i) {
        return i / c();
    }

    @Override // W0.c
    public final float i0(float f) {
        return f / c();
    }

    @Override // W0.c
    public final float n() {
        return this.f21668n.n();
    }

    @Override // W0.c
    public final /* synthetic */ long x(long j5) {
        return L1.a.d(j5, this);
    }

    @Override // W0.c
    public final float y(float f) {
        return c() * f;
    }
}
