package androidx.compose.ui.platform;

import k1.C7455a;
import k1.C7460f;
import k1.C7462h;
import l1.AbstractC7839p0;
import l1.C7786D;
import l1.C7790H;
import l1.s0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class O1 {
    public static final boolean a(@NotNull AbstractC7839p0 abstractC7839p0, float f7, float f11) {
        if (abstractC7839p0 instanceof AbstractC7839p0.b) {
            C7460f b11 = ((AbstractC7839p0.b) abstractC7839p0).b();
            return b11.n() <= f7 && f7 < b11.o() && b11.q() <= f11 && f11 < b11.h();
        }
        if (!(abstractC7839p0 instanceof AbstractC7839p0.c)) {
            if (abstractC7839p0 instanceof AbstractC7839p0.a) {
                return b(((AbstractC7839p0.a) abstractC7839p0).b(), f7, f11);
            }
            throw new Sc.o();
        }
        C7462h b12 = ((AbstractC7839p0.c) abstractC7839p0).b();
        if (f7 < b12.e() || f7 >= b12.f() || f11 < b12.g() || f11 >= b12.a()) {
            return false;
        }
        if (C7455a.d(b12.i()) + C7455a.d(b12.h()) <= b12.j()) {
            if (C7455a.d(b12.c()) + C7455a.d(b12.b()) <= b12.j()) {
                if (C7455a.e(b12.b()) + C7455a.e(b12.h()) <= b12.d()) {
                    if (C7455a.e(b12.c()) + C7455a.e(b12.i()) <= b12.d()) {
                        float d11 = C7455a.d(b12.h()) + b12.e();
                        float e11 = C7455a.e(b12.h()) + b12.g();
                        float f12 = b12.f() - C7455a.d(b12.i());
                        float e12 = C7455a.e(b12.i()) + b12.g();
                        float f13 = b12.f() - C7455a.d(b12.c());
                        float a11 = b12.a() - C7455a.e(b12.c());
                        float a12 = b12.a() - C7455a.e(b12.b());
                        float d12 = C7455a.d(b12.b()) + b12.e();
                        if (f7 < d11 && f11 < e11) {
                            return c(f7, f11, b12.h(), d11, e11);
                        }
                        if (f7 < d12 && f11 > a12) {
                            return c(f7, f11, b12.b(), d12, a12);
                        }
                        if (f7 > f12 && f11 < e12) {
                            return c(f7, f11, b12.i(), f12, e12);
                        }
                        if (f7 <= f13 || f11 <= a11) {
                            return true;
                        }
                        return c(f7, f11, b12.c(), f13, a11);
                    }
                }
            }
        }
        C7786D a13 = C7790H.a();
        a13.s(b12, s0.a.CounterClockwise);
        return b(a13, f7, f11);
    }

    private static final boolean b(l1.s0 s0Var, float f7, float f11) {
        C7460f c7460f = new C7460f(f7 - 0.005f, f11 - 0.005f, f7 + 0.005f, f11 + 0.005f);
        C7786D a11 = C7790H.a();
        a11.d(c7460f, s0.a.CounterClockwise);
        C7786D a12 = C7790H.a();
        a12.k(s0Var, a11, 1);
        boolean y11 = a12.y();
        a12.reset();
        a11.reset();
        return !y11;
    }

    private static final boolean c(float f7, float f11, long j11, float f12, float f13) {
        float f14 = f7 - f12;
        float f15 = f11 - f13;
        float d11 = C7455a.d(j11);
        float e11 = C7455a.e(j11);
        return ((f15 * f15) / (e11 * e11)) + ((f14 * f14) / (d11 * d11)) <= 1.0f;
    }
}
